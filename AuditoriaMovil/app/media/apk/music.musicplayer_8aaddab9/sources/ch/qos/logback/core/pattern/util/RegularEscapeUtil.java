package ch.qos.logback.core.pattern.util;

import e.a.d.a.a;
/* loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == '\\') {
                int i4 = i3 + 1;
                char charAt2 = str.charAt(i3);
                if (charAt2 == 'n') {
                    i3 = i4;
                    charAt = '\n';
                } else if (charAt2 == 'r') {
                    i3 = i4;
                    charAt = '\r';
                } else if (charAt2 == 't') {
                    i3 = i4;
                    charAt = '\t';
                } else if (charAt2 == 'f') {
                    i3 = i4;
                    charAt = '\f';
                } else {
                    i3 = i4;
                    charAt = charAt2;
                }
            }
            sb.append(charAt);
            i2 = i3;
        }
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i2) {
        char c3;
        if (str.indexOf(c2) >= 0 || c2 == '\\') {
            stringBuffer.append(c2);
        } else if (c2 != '_') {
            if (c2 == 'n') {
                c3 = '\n';
            } else if (c2 == 'r') {
                c3 = '\r';
            } else if (c2 != 't') {
                String formatEscapeCharsForListing = formatEscapeCharsForListing(str);
                StringBuilder sb = new StringBuilder();
                sb.append("Illegal char '");
                sb.append(c2);
                sb.append(" at column ");
                sb.append(i2);
                sb.append(". Only \\\\, \\_");
                throw new IllegalArgumentException(a.r(sb, formatEscapeCharsForListing, ", \\t, \\n, \\r combinations are allowed as escape characters."));
            } else {
                c3 = '\t';
            }
            stringBuffer.append(c3);
        }
    }

    public String formatEscapeCharsForListing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(", \\");
            sb.append(str.charAt(i2));
        }
        return sb.toString();
    }
}
