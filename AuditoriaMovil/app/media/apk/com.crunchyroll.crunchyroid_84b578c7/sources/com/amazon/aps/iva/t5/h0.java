package com.amazon.aps.iva.t5;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: XmlPullParserUtil.java */
/* loaded from: classes.dex */
public final class h0 {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static boolean b(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        boolean z;
        if (xmlPullParser.getEventType() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean c(XmlPullParser xmlPullParser) throws XmlPullParserException {
        if (xmlPullParser.getEventType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean d(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        if (c(xmlPullParser) && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }
}
