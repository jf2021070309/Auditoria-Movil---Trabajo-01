package com.amazon.aps.iva.c7;

import com.amazon.aps.iva.c7.b;
import com.amazon.aps.iva.t5.h0;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: XmpMotionPhotoDescriptionParser.java */
/* loaded from: classes.dex */
public final class e {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (java.lang.Integer.parseInt(r9) == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r7 == (-1)) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.amazon.aps.iva.c7.b a(java.lang.String r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = com.amazon.aps.iva.t5.h0.d(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld6
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = com.amazon.aps.iva.t5.h0.d(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = com.amazon.aps.iva.c7.e.a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L4d
            r9 = r2[r7]
            java.lang.String r9 = com.amazon.aps.iva.t5.h0.a(r0, r9)
            if (r9 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r7 = r6
        L4e:
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = com.amazon.aps.iva.c7.e.b
            r7 = r6
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = com.amazon.aps.iva.t5.h0.a(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = com.amazon.aps.iva.c7.e.c
        L6f:
            r9 = 2
            if (r6 >= r9) goto L9c
            r9 = r2[r6]
            java.lang.String r9 = com.amazon.aps.iva.t5.h0.a(r0, r9)
            if (r9 == 0) goto L99
            long r11 = java.lang.Long.parseLong(r9)
            com.amazon.aps.iva.c7.b$a r2 = new com.amazon.aps.iva.c7.b$a
            java.lang.String r18 = "image/jpeg"
            r14 = 0
            r16 = 0
            r13 = r2
            r13.<init>(r14, r16, r18)
            com.amazon.aps.iva.c7.b$a r6 = new com.amazon.aps.iva.c7.b$a
            java.lang.String r15 = "video/mp4"
            r13 = 0
            r10 = r6
            r10.<init>(r11, r13, r15)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L6f
        L9c:
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of()
        La0:
            r6 = r7
            goto Lc3
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = com.amazon.aps.iva.t5.h0.d(r0, r8)
            if (r8 == 0) goto Lb3
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            com.google.common.collect.ImmutableList r2 = b(r0, r2, r8)
            goto Lc3
        Lb3:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = com.amazon.aps.iva.t5.h0.d(r0, r8)
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            com.google.common.collect.ImmutableList r2 = b(r0, r2, r8)
        Lc3:
            boolean r8 = com.amazon.aps.iva.t5.h0.b(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld0
            return r3
        Ld0:
            com.amazon.aps.iva.c7.b r0 = new com.amazon.aps.iva.c7.b
            r0.<init>(r2, r6)
            return r0
        Ld6:
            java.lang.String r0 = "Couldn't find xmp metadata"
            com.amazon.aps.iva.q5.h0 r0 = com.amazon.aps.iva.q5.h0.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c7.e.a(java.lang.String):com.amazon.aps.iva.c7.b");
    }

    public static ImmutableList<b.a> b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        ImmutableList.Builder builder = ImmutableList.builder();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (h0.d(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String a2 = h0.a(xmlPullParser, concat3);
                String a3 = h0.a(xmlPullParser, concat4);
                String a4 = h0.a(xmlPullParser, concat5);
                String a5 = h0.a(xmlPullParser, concat6);
                if (a2 != null && a3 != null) {
                    if (a4 != null) {
                        j = Long.parseLong(a4);
                    } else {
                        j = 0;
                    }
                    if (a5 != null) {
                        j2 = Long.parseLong(a5);
                    } else {
                        j2 = 0;
                    }
                    builder.add((ImmutableList.Builder) new b.a(j, j2, a2));
                } else {
                    return ImmutableList.of();
                }
            }
        } while (!h0.b(xmlPullParser, concat2));
        return builder.build();
    }
}
