package com.amazon.aps.iva.v4;

import com.amazon.aps.iva.v4.h;
import java.util.List;
import java.util.Map;
/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class r0 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                h.f fVar = h.c;
                sb.append(com.amazon.aps.iva.ab.x.L(new h.f(((String) obj).getBytes(y.b))));
                sb.append('\"');
            } else if (obj instanceof h) {
                sb.append(": \"");
                sb.append(com.amazon.aps.iva.ab.x.L((h) obj));
                sb.append('\"');
            } else if (obj instanceof w) {
                sb.append(" {");
                c((w) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                b(sb, i4, "key", entry2.getKey());
                b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ad, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bf, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r4).floatValue()) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d5, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r4).doubleValue()) == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0209, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.amazon.aps.iva.v4.p0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.v4.r0.c(com.amazon.aps.iva.v4.p0, java.lang.StringBuilder, int):void");
    }
}
