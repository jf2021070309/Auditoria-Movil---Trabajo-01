package com.amazon.aps.iva.e4;

import com.amazon.aps.iva.e4.i;
import java.util.List;
import java.util.Map;
/* compiled from: MessageLiteToString.java */
/* loaded from: classes.dex */
public final class s0 {
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
                i.e eVar = i.c;
                sb.append(l1.A(new i.e(((String) obj).getBytes(z.a))));
                sb.append('\"');
            } else if (obj instanceof i) {
                sb.append(": \"");
                sb.append(l1.A((i) obj));
                sb.append('\"');
            } else if (obj instanceof x) {
                sb.append(" {");
                c((x) obj, sb, i + 2);
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

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01ad, code lost:
        if (((java.lang.Integer) r11).intValue() == 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01be, code lost:
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d0, code lost:
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0202, code lost:
        r7 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.amazon.aps.iva.e4.q0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.e4.s0.c(com.amazon.aps.iva.e4.q0, java.lang.StringBuilder, int):void");
    }
}
