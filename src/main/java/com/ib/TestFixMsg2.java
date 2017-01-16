package com.ib;


import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.fixprotocol.fixml_5_0_sp2.*;
import org.xml.sax.InputSource;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.sax.SAXSource;
import java.io.*;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

/**
 * Created by HP on 14/1/2017.
 */
public class TestFixMsg2 {
    public static void main(String[] args) {
        FIXML fixml = new FIXML();
        //<FIXML v="5.0 SP2" xv="109" s="20090815" cv="CME.0001">

        fixml.setV("FIX.5.0SP2");
        fixml.setCv("CME.0001");
        fixml.setR("test");
        fixml.setXr("xrtest");
        fixml.setS(getDate());
        fixml.setXv(109);
        ObjectFactory objectFactory = new ObjectFactory();
        NewOrderSingleMessageT newOrderSingleMessageT = objectFactory.createNewOrderSingleMessageT();
        /* <Order TmInForce="0" Typ="2" Side="5" Px="22" Acct="12345678">
        <Instrmt SecTyp="CS" Sym="F"/>
        <OrdQty Qty="1"/>
    </Order>*/
        newOrderSingleMessageT.setTmInForce("0");
        newOrderSingleMessageT.setTyp("2");
        newOrderSingleMessageT.setSide("5");
        newOrderSingleMessageT.setPx(BigDecimal.valueOf(22));
        newOrderSingleMessageT.setAcct("12345678");
        InstrumentBlockT instrumentBlockT = objectFactory.createInstrumentBlockT();
        instrumentBlockT.setSecTyp("CS");
        instrumentBlockT.setSym("F");
        newOrderSingleMessageT.setInstrmt(instrumentBlockT);
        OrderQtyDataBlockT orderQtyDataBlockT = objectFactory.createOrderQtyDataBlockT();
        orderQtyDataBlockT.setQty(BigDecimal.valueOf(1));
        newOrderSingleMessageT.setOrdQty(orderQtyDataBlockT);

        JAXBElement<NewOrderSingleMessageT> newOrderSingleMessageTJAXBElement = objectFactory.createOrder(newOrderSingleMessageT);
        fixml.setMessage(newOrderSingleMessageTJAXBElement);
/*
        try {
            marshallWithNamespace(fixml);
            marshallWithNoNamespace(fixml);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

      //  unmarshallWithNamespace();
  //      unmarshallWithNoNamespace();
       unmarshallWithNamespace2();
  //      marshallWithNoNamespaceUsingNAmeSpacefilter(fixml);

    }

    private static void unmarshallWithNamespace() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Object unmarshal = unmarshaller.unmarshal(new File("examplefix.xml"));
            System.out.println(unmarshal.getClass());
            System.out.println(unmarshal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void unmarshallWithNamespace2() {
        // sort out the file
        try {
        String xmlFile = "example.xml";
        System.out.println("Loading XML File..." + xmlFile);
        InputStream input =  new FileInputStream(xmlFile);

        InputSource is = new InputSource(input);

// create jaxb context
        JAXBContext jc = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
        Unmarshaller unmarshaller = jc.createUnmarshaller();

// add event handler so jacB will fail on an error
/*        CustomEventHandler validationEventHandler = new CustomEventHandler();
        unmarshaller.setEventHandler(validationEventHandler);*/

// set the namespace
       NamespaceFilter inFilter = new NamespaceFilter("http://www.fixprotocol.org/FIXML-5-0-SP2", true);

            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
          saxParserFactory.setNamespaceAware(true);
        inFilter.setParent(saxParserFactory.newSAXParser().getXMLReader());
     //   SAXSource source = new SAXSource(saxParserFactory.newSAXParser().getXMLReader(), is);
        SAXSource source = new SAXSource(inFilter, is);

// GO!
        JAXBElement<FIXML> fixml = unmarshaller.unmarshal(source, FIXML.class);
            System.out.println("fixml = " + fixml);
            //System.out.println("fixml.get = " + fixml.get);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void unmarshallWithNoNamespace() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Object unmarshal = unmarshaller.unmarshal(new File("examplefixnons.xml"));
            System.out.println(unmarshal.getClass());
            System.out.println(unmarshal);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void marshallWithNamespace(FIXML fixml) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
      //  marshaller.marshal(fixml,System.out);
        marshaller.marshal(fixml,new File("examplefix.xml"));

    }
    private static void marshallWithNoNamespaceUsingNAmeSpacefilter(FIXML fixml){
        try {
        JAXBContext jaxbContext = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);

        //Define an output file
        File output = new File("test222.xml");

//Create a filter that will remove the xmlns attribute
        NamespaceFilter outFilter = new NamespaceFilter(null, false);

//Do some formatting, this is obviously optional and may effect performance
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
          format.setNewlines(true);

//Create a new org.dom4j.io.XMLWriter that will serve as the
//ContentHandler for our filter.
        XMLWriter writer = null;
            OutputStream fileOutputStream = new FileOutputStream(output);
            writer = new XMLWriter(fileOutputStream, format);

//Attach the writer to the filter
        outFilter.setContentHandler(writer);

//Tell JAXB to marshall to the filter which in turn will call the writer
        marshaller.marshal(fixml, outFilter);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static void marshallWithNoNamespace(FIXML fixml) throws XMLStreamException, JAXBException, IOException {
        XMLOutputFactory factory = XMLOutputFactory.newFactory();
        //StringWriter writer = new StringWriter(1024);
        FileWriter writer = new FileWriter("examplefixnons.xml") ;
        XMLStreamWriter xmlWriter = null;

        try {
            xmlWriter = factory.createXMLStreamWriter(writer);
            JAXBContext context = JAXBContext.newInstance("org.fixprotocol.fixml_5_0_sp2");
            Marshaller marshaller = context.createMarshaller();
            //marshaller.marshal(fixml, new NamespaceStrippingXMLStreamWriter(xmlWriter));
            marshaller.marshal(fixml, new NoNamesWriter(xmlWriter));
            xmlWriter.flush();
        }
        finally {
            if (xmlWriter != null)
                xmlWriter.close();
        }

        System.out.println( writer.toString());
    }

    private static XMLGregorianCalendar getDate() {
        try {
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            throw new Error(e);
        }
    }
}

