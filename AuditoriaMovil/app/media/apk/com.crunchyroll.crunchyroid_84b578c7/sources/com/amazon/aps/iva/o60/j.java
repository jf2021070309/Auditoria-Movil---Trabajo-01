package com.amazon.aps.iva.o60;

import com.amazon.aps.iva.oe0.m;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: TranslationsParser.kt */
/* loaded from: classes2.dex */
public final class j implements f {
    public final XmlPullParser a;

    /* compiled from: TranslationsParser.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final String a;
        public final Object b;

        /* compiled from: TranslationsParser.kt */
        /* renamed from: com.amazon.aps.iva.o60.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0557a extends a {
            public final String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0557a(String str, String str2) {
                super(str, str2);
                com.amazon.aps.iva.yb0.j.f(str, "attribute");
                com.amazon.aps.iva.yb0.j.f(str2, "text");
                this.c = str2;
            }
        }

        public a(String str, Object obj) {
            this.a = str;
            this.b = obj;
        }
    }

    public j() {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        com.amazon.aps.iva.yb0.j.e(newPullParser, "newInstance().newPullParser()");
        this.a = newPullParser;
    }

    public static String b(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (com.amazon.aps.iva.yb0.j.a(xmlPullParser.getAttributeName(i), str)) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                com.amazon.aps.iva.yb0.j.e(attributeValue, "getAttributeValue(i)");
                return attributeValue;
            }
        }
        return "";
    }

    public static void c(XmlPullParser xmlPullParser, String str, com.amazon.aps.iva.xb0.a aVar) {
        while (true) {
            if (xmlPullParser.getEventType() != 3 || !com.amazon.aps.iva.yb0.j.a(xmlPullParser.getName(), str)) {
                aVar.invoke();
                if (xmlPullParser.getEventType() == 3 && com.amazon.aps.iva.yb0.j.a(xmlPullParser.getName(), str)) {
                    xmlPullParser.next();
                    return;
                }
                xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    public static a.C0557a d(XmlPullParser xmlPullParser, String str) {
        a.C0557a c0557a;
        a.C0557a c0557a2 = new a.C0557a("", "");
        while (xmlPullParser.getEventType() != 3) {
            int eventType = xmlPullParser.getEventType();
            if (eventType != 2) {
                if (eventType == 4) {
                    String text = xmlPullParser.getText();
                    com.amazon.aps.iva.yb0.j.e(text, "text");
                    c0557a = new a.C0557a(c0557a2.a, text);
                } else {
                    xmlPullParser.next();
                }
            } else {
                c0557a = new a.C0557a(b(xmlPullParser, str), c0557a2.c);
            }
            c0557a2 = c0557a;
            xmlPullParser.next();
        }
        return c0557a2;
    }

    @Override // com.amazon.aps.iva.o60.f
    public final LinkedHashMap a(Reader reader) {
        String name;
        XmlPullParser xmlPullParser = this.a;
        xmlPullParser.setInput(reader);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getEventType() == 2 && (name = xmlPullParser.getName()) != null) {
                int hashCode = name.hashCode();
                if (hashCode != -1024600675) {
                    if (hashCode != -891985903) {
                        if (hashCode == -475309713 && name.equals("plurals")) {
                            String b = b(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.NAME);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            c(xmlPullParser, "plurals", new k(this, linkedHashMap2, xmlPullParser));
                            if (true ^ m.b0(b)) {
                                linkedHashMap.put(b, linkedHashMap2);
                            }
                        }
                    } else if (name.equals("string")) {
                        a.C0557a d = d(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.NAME);
                        String str = d.a;
                        if (true ^ m.b0(str)) {
                            linkedHashMap.put(str, d.b);
                        }
                    }
                } else if (name.equals("string-array")) {
                    String b2 = b(xmlPullParser, AppMeasurementSdk.ConditionalUserProperty.NAME);
                    ArrayList arrayList = new ArrayList();
                    c(xmlPullParser, "string-array", new l(xmlPullParser, this, arrayList));
                    if (true ^ m.b0(b2)) {
                        linkedHashMap.put(b2, arrayList);
                    }
                }
            }
            xmlPullParser.next();
        }
        return linkedHashMap;
    }
}
