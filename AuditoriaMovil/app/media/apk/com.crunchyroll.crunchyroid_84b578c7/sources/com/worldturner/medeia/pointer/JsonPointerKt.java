package com.worldturner.medeia.pointer;

import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.va0.f;
import com.amazon.aps.iva.yb0.j;
import java.net.URI;
import kotlin.Metadata;
/* compiled from: JsonPointer.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a(\u0010\n\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0000\u001a(\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"RJP_SEPARATORS", "", "decodeJsonPointerElement", "", "s", "offset", "", "hasJsonPointerFragment", "", "Ljava/net/URI;", "substringBefore", "delimiter", "", "missingDelimiterValue", "startIndex", "substringFrom", "medeia-validator-core"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes4.dex */
public final class JsonPointerKt {
    private static final char[] RJP_SEPARATORS;

    static {
        char[] charArray = "#/".toCharArray();
        j.b(charArray, "(this as java.lang.String).toCharArray()");
        RJP_SEPARATORS = charArray;
    }

    public static final String decodeJsonPointerElement(String str, int i) {
        if (q.q0(str, '~', i, false, 4) == -1) {
            String substring = str.substring(i);
            j.b(substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        StringBuilder sb = new StringBuilder(str.length() - i);
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '~') {
                i++;
                if (i < str.length()) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 != '0') {
                        if (charAt2 == '1') {
                            sb.append('/');
                        }
                    } else {
                        sb.append('~');
                    }
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
        String sb2 = sb.toString();
        j.b(sb2, "b.toString()");
        return sb2;
    }

    public static final boolean hasJsonPointerFragment(URI uri) {
        j.g(uri, "receiver$0");
        if (!f.c(uri)) {
            return false;
        }
        String fragment = uri.getFragment();
        j.b(fragment, "this.fragment");
        if (!q.G0(fragment, '/')) {
            return false;
        }
        try {
            String fragment2 = uri.getFragment();
            j.b(fragment2, "this.fragment");
            new JsonPointer(fragment2, false, 2, null);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final String substringBefore(String str, char c, String str2, int i) {
        j.g(str, "receiver$0");
        j.g(str2, "missingDelimiterValue");
        int q0 = q.q0(str, c, i, false, 4);
        if (q0 != -1) {
            String substring = str.substring(0, q0);
            j.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static /* synthetic */ String substringBefore$default(String str, char c, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return substringBefore(str, c, str2, i);
    }

    public static final String substringFrom(String str, char c, String str2, int i) {
        j.g(str, "receiver$0");
        j.g(str2, "missingDelimiterValue");
        int q0 = q.q0(str, c, i, false, 4);
        if (q0 != -1) {
            String substring = str.substring(q0, str.length());
            j.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static /* synthetic */ String substringFrom$default(String str, char c, String str2, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return substringFrom(str, c, str2, i);
    }
}
