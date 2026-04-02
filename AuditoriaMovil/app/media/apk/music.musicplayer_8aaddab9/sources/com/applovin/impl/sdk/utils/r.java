package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.v;
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
public class r {
    private final v a;

    /* renamed from: b  reason: collision with root package name */
    private Stack<a> f4383b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuilder f4384c;

    /* renamed from: d  reason: collision with root package name */
    private long f4385d;

    /* renamed from: e  reason: collision with root package name */
    private a f4386e;

    /* loaded from: classes.dex */
    public static class a extends q {
        public a(String str, Map<String, String> map, q qVar) {
            super(str, map, qVar);
        }

        public void a(q qVar) {
            if (qVar == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f4379c.add(qVar);
        }

        public void d(String str) {
            this.f4378b = str;
        }
    }

    public r(com.applovin.impl.sdk.m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.a = mVar.B();
    }

    public static q a(String str, com.applovin.impl.sdk.m mVar) throws SAXException {
        return new r(mVar).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap hashMap = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(attributes.getQName(i2), attributes.getValue(i2));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }

    public q a(String str) throws SAXException {
        if (str != null) {
            this.f4384c = new StringBuilder();
            this.f4383b = new Stack<>();
            this.f4386e = null;
            Xml.parse(str, new ContentHandler() { // from class: com.applovin.impl.sdk.utils.r.1
                @Override // org.xml.sax.ContentHandler
                public void characters(char[] cArr, int i2, int i3) {
                    String trim = new String(Arrays.copyOfRange(cArr, i2, i3)).trim();
                    if (StringUtils.isValidString(trim)) {
                        r.this.f4384c.append(trim);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - r.this.f4385d;
                    v vVar = r.this.a;
                    vVar.b("XmlParser", "Finished parsing in " + seconds + " seconds");
                }

                @Override // org.xml.sax.ContentHandler
                public void endElement(String str2, String str3, String str4) {
                    r rVar = r.this;
                    rVar.f4386e = (a) rVar.f4383b.pop();
                    r.this.f4386e.d(r.this.f4384c.toString().trim());
                    r.this.f4384c.setLength(0);
                }

                @Override // org.xml.sax.ContentHandler
                public void endPrefixMapping(String str2) {
                }

                @Override // org.xml.sax.ContentHandler
                public void ignorableWhitespace(char[] cArr, int i2, int i3) {
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
                    r.this.a.b("XmlParser", "Begin parsing...");
                    r.this.f4385d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                @Override // org.xml.sax.ContentHandler
                public void startElement(String str2, String str3, String str4, Attributes attributes) throws SAXException {
                    try {
                        a aVar = r.this.f4383b.isEmpty() ? null : (a) r.this.f4383b.peek();
                        a aVar2 = new a(str3, r.this.a(attributes), aVar);
                        if (aVar != null) {
                            aVar.a(aVar2);
                        }
                        r.this.f4383b.push(aVar2);
                    } catch (Exception e2) {
                        r.this.a.b("XmlParser", e.a.d.a.a.l("Unable to process element <", str3, ">"), e2);
                        throw new SAXException("Failed to start element", e2);
                    }
                }

                @Override // org.xml.sax.ContentHandler
                public void startPrefixMapping(String str2, String str3) {
                }
            });
            a aVar = this.f4386e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
