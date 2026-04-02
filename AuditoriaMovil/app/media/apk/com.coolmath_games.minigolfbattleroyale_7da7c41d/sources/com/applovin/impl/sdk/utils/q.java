package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.r;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
/* loaded from: classes.dex */
public class q {
    private final r a;
    private Stack<a> b;
    private StringBuilder c;
    private long d;
    private a e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a extends p {
        a(String str, Map<String, String> map, p pVar) {
            super(str, map, pVar);
        }

        void a(p pVar) {
            if (pVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.c.add(pVar);
        }

        void d(String str) {
            this.b = str;
        }
    }

    q(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.a = kVar.z();
    }

    public static p a(String str, com.applovin.impl.sdk.k kVar) throws SAXException {
        return new q(kVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i = 0; i < length; i++) {
                hashMap.put(attributes.getQName(i), attributes.getValue(i));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public p a(String str) throws SAXException {
        if (str != null) {
            this.c = new StringBuilder();
            this.b = new Stack<>();
            this.e = null;
            Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.q.1
                @Override // org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        q.this.c.append(trim);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - q.this.d;
                    r rVar = q.this.a;
                    rVar.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                }

                @Override // org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) {
                    q qVar = q.this;
                    qVar.e = (a) qVar.b.pop();
                    q.this.e.d(q.this.c.toString().trim());
                    q.this.c.setLength(0);
                }

                @Override // org.xml.sax.ContentHandler
                public void endPrefixMapping(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void processingInstruction(String str2, String str3) {
                }

                @Override // org.xml.sax.ContentHandler
                public void setDocumentLocator(Locator locator) {
                }

                @Override // org.xml.sax.ContentHandler
                public void skippedEntity(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void startDocument() {
                    q.this.a.b("XmlParser", "Begin parsing...");
                    q.this.d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                @Override // org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    try {
                        a aVar = q.this.b.isEmpty() ? null : (a) q.this.b.peek();
                        a aVar2 = new a(str3, q.this.a(attributes), aVar);
                        if (aVar != null) {
                            aVar.a(aVar2);
                        }
                        q.this.b.push(aVar2);
                    } catch (Exception e) {
                        r rVar = q.this.a;
                        rVar.b("XmlParser", "Unable to process element <" + str3 + ">", e);
                        throw new SAXException("Failed to start element", e);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void startPrefixMapping(String str2, String str3) {
                }
            });
            a aVar = this.e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
