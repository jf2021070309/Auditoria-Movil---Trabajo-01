package com.amazon.aps.iva.w7;

import android.text.Layout;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.h0;
import com.amazon.aps.iva.t5.p;
import com.google.android.gms.cast.MediaError;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* compiled from: TtmlDecoder.java */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.q7.c {
    public static final Pattern n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b u = new b(1, 30.0f, 1);
    public static final a v = new a(15);
    public final XmlPullParserFactory m;

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final float a;
        public final int b;
        public final int c;

        public b(int i, float f, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    /* compiled from: TtmlDecoder.java */
    /* renamed from: com.amazon.aps.iva.w7.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0820c {
        public final int a;
        public final int b;

        public C0820c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static f h(f fVar) {
        if (fVar == null) {
            return new f();
        }
        return fVar;
    }

    public static boolean i(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals("p") && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment j(String str) {
        String lowerCase = Ascii.toLowerCase(str);
        lowerCase.getClass();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case -1364013995:
                if (lowerCase.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (lowerCase.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (lowerCase.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (lowerCase.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (lowerCase.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a k(XmlPullParser xmlPullParser, a aVar) throws com.amazon.aps.iva.q7.f {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (!matcher.matches()) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            p.g();
            return aVar;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt != 0 && parseInt2 != 0) {
                return new a(parseInt2);
            }
            throw new com.amazon.aps.iva.q7.f("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            "Ignoring malformed cell resolution: ".concat(attributeValue);
            p.g();
            return aVar;
        }
    }

    public static void l(String str, f fVar) throws com.amazon.aps.iva.q7.f {
        Matcher matcher;
        int i = g0.a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else if (split.length == 2) {
            matcher = pattern.matcher(split[1]);
            p.g();
        } else {
            throw new com.amazon.aps.iva.q7.f(defpackage.e.f(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.getClass();
            group.hashCode();
            char c = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    fVar.j = 3;
                    break;
                case 1:
                    fVar.j = 2;
                    break;
                case 2:
                    fVar.j = 1;
                    break;
                default:
                    throw new com.amazon.aps.iva.q7.f(defpackage.e.e("Invalid unit for fontSize: '", group, "'."));
            }
            String group2 = matcher.group(1);
            group2.getClass();
            fVar.k = Float.parseFloat(group2);
            return;
        }
        throw new com.amazon.aps.iva.q7.f(defpackage.e.e("Invalid expression for fontSize: '", str, "'."));
    }

    public static b m(XmlPullParser xmlPullParser) throws com.amazon.aps.iva.q7.f {
        int i;
        float f;
        int i2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i3 = g0.a;
            String[] split = attributeValue2.split(" ", -1);
            if (split.length == 2) {
                f = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
            } else {
                throw new com.amazon.aps.iva.q7.f("frameRateMultiplier doesn't have 2 parts");
            }
        } else {
            f = 1.0f;
        }
        b bVar = u;
        int i4 = bVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i4 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        } else {
            i2 = bVar.c;
        }
        return new b(i4, i * f, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, com.amazon.aps.iva.w7.c.a r22, com.amazon.aps.iva.w7.c.C0820c r23, java.util.HashMap r24, java.util.HashMap r25) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w7.c.n(org.xmlpull.v1.XmlPullParser, java.util.HashMap, com.amazon.aps.iva.w7.c$a, com.amazon.aps.iva.w7.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d o(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, b bVar) throws com.amazon.aps.iva.q7.f {
        long j;
        long j2;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        f p2 = p(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                if (c == 5 && attributeValue.startsWith("#")) {
                                    str = attributeValue.substring(1);
                                }
                            } else {
                                String trim = attributeValue.trim();
                                if (trim.isEmpty()) {
                                    split = new String[0];
                                } else {
                                    int i2 = g0.a;
                                    split = trim.split("\\s+", -1);
                                }
                                if (split.length > 0) {
                                    strArr = split;
                                }
                            }
                        } else {
                            j3 = q(attributeValue, bVar);
                        }
                    } else {
                        j4 = q(attributeValue, bVar);
                    }
                } else {
                    j5 = q(attributeValue, bVar);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (dVar != null) {
            long j6 = dVar.d;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j4 == j) {
            if (j5 != j) {
                j2 = j3 + j5;
            } else if (dVar != null) {
                long j7 = dVar.e;
                if (j7 != j) {
                    j2 = j7;
                }
            }
            return new d(xmlPullParser.getName(), null, j3, j2, p2, strArr, str2, str, dVar);
        }
        j2 = j4;
        return new d(xmlPullParser.getName(), null, j3, j2, p2, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01cd, code lost:
        if (r5.equals("auto") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0315, code lost:
        if (r5.equals("text") == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03ad, code lost:
        if (r5.equals("linethrough") == false) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.w7.f p(org.xmlpull.v1.XmlPullParser r16, com.amazon.aps.iva.w7.f r17) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.w7.c.p(org.xmlpull.v1.XmlPullParser, com.amazon.aps.iva.w7.f):com.amazon.aps.iva.w7.f");
    }

    public static long q(String str, b bVar) throws com.amazon.aps.iva.q7.f {
        double d;
        double d2;
        String group;
        String group2;
        String group3;
        double d3;
        double d4;
        String group4;
        Matcher matcher = n.matcher(str);
        if (matcher.matches()) {
            matcher.group(1).getClass();
            matcher.group(2).getClass();
            matcher.group(3).getClass();
            double parseLong = (Long.parseLong(group) * 3600) + (Long.parseLong(group2) * 60) + Long.parseLong(group3);
            String group5 = matcher.group(4);
            double d5 = 0.0d;
            if (group5 != null) {
                d3 = Double.parseDouble(group5);
            } else {
                d3 = 0.0d;
            }
            double d6 = parseLong + d3;
            String group6 = matcher.group(5);
            if (group6 != null) {
                d4 = ((float) Long.parseLong(group6)) / bVar.a;
            } else {
                d4 = 0.0d;
            }
            double d7 = d6 + d4;
            if (matcher.group(6) != null) {
                d5 = (Long.parseLong(group4) / bVar.b) / bVar.a;
            }
            return (long) ((d7 + d5) * 1000000.0d);
        }
        Matcher matcher2 = o.matcher(str);
        if (matcher2.matches()) {
            String group7 = matcher2.group(1);
            group7.getClass();
            double parseDouble = Double.parseDouble(group7);
            String group8 = matcher2.group(2);
            group8.getClass();
            group8.hashCode();
            char c = 65535;
            switch (group8.hashCode()) {
                case MediaError.DetailedErrorCode.MEDIA_DECODE /* 102 */:
                    if (group8.equals("f")) {
                        c = 0;
                        break;
                    }
                    break;
                case MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED /* 104 */:
                    if (group8.equals("h")) {
                        c = 1;
                        break;
                    }
                    break;
                case 109:
                    if (group8.equals("m")) {
                        c = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group8.equals("t")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3494:
                    if (group8.equals("ms")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    d = bVar.a;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 1:
                    d2 = 3600.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 2:
                    d2 = 60.0d;
                    parseDouble *= d2;
                    return (long) (parseDouble * 1000000.0d);
                case 3:
                    d = bVar.c;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    return (long) (parseDouble * 1000000.0d);
                default:
                    return (long) (parseDouble * 1000000.0d);
            }
        }
        throw new com.amazon.aps.iva.q7.f(com.amazon.aps.iva.oa.a.a("Malformed time expression: ", str));
    }

    public static C0820c r(XmlPullParser xmlPullParser) {
        String a2 = h0.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = s.matcher(a2);
        if (!matcher.matches()) {
            "Ignoring non-pixel tts extent: ".concat(a2);
            p.g();
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C0820c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            "Ignoring malformed tts extent: ".concat(a2);
            p.g();
            return null;
        }
    }

    @Override // com.amazon.aps.iva.q7.c
    public final com.amazon.aps.iva.q7.d g(int i, byte[] bArr, boolean z) throws com.amazon.aps.iva.q7.f {
        a aVar;
        b bVar;
        try {
            XmlPullParser newPullParser = this.m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0820c c0820c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = u;
            a aVar2 = v;
            int i2 = 0;
            g gVar = null;
            a aVar3 = aVar2;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m(newPullParser);
                            aVar3 = k(newPullParser, aVar2);
                            c0820c = r(newPullParser);
                        }
                        a aVar4 = aVar3;
                        C0820c c0820c2 = c0820c;
                        b bVar3 = bVar2;
                        if (!i(name)) {
                            newPullParser.getName();
                            p.f();
                            i2++;
                            aVar = aVar4;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            aVar = aVar4;
                            bVar = bVar3;
                            n(newPullParser, hashMap, aVar4, c0820c2, hashMap2, hashMap3);
                        } else {
                            aVar = aVar4;
                            bVar = bVar3;
                            try {
                                d o2 = o(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(o2);
                                if (dVar != null) {
                                    if (dVar.m == null) {
                                        dVar.m = new ArrayList();
                                    }
                                    dVar.m.add(o2);
                                }
                            } catch (com.amazon.aps.iva.q7.f e) {
                                p.h("Suppressing parser error", e);
                                i2++;
                            }
                        }
                        aVar3 = aVar;
                        bVar2 = bVar;
                        c0820c = c0820c2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a2 = d.a(newPullParser.getText());
                        if (dVar.m == null) {
                            dVar.m = new ArrayList();
                        }
                        dVar.m.add(a2);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new com.amazon.aps.iva.q7.f("No TTML subtitles found");
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new com.amazon.aps.iva.q7.f("Unable to decode source", e3);
        }
    }
}
