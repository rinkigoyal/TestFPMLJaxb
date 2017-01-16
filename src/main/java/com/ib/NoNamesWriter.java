package com.ib;

import javax.xml.namespace.NamespaceContext;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.Writer;
import java.util.Iterator;

/**
 * Created by HP on 14/1/2017.
 * http://stackoverflow.com/questions/17222902/remove-namespace-prefix-while-jaxb-marshalling
 *
 */
public class NoNamesWriter  extends DelegatingXMLStreamWriter {

    private static final NamespaceContext emptyNamespaceContext = new NamespaceContext() {


        public String getNamespaceURI(String prefix) {
            return "";
        }

        public String getPrefix(String namespaceURI) {
            return "";
        }

        public Iterator getPrefixes(String namespaceURI) {
            return null;
        }

    };

    public static XMLStreamWriter filter(Writer writer) throws XMLStreamException {
        return new NoNamesWriter(XMLOutputFactory.newInstance().createXMLStreamWriter(writer));
    }

    public NoNamesWriter(XMLStreamWriter writer) {
        super(writer);
    }

    @Override
    public NamespaceContext getNamespaceContext() {
        return emptyNamespaceContext;
    }

}

