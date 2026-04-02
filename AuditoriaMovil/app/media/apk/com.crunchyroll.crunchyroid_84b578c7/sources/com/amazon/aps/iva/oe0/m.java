package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.lb0.f0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/* compiled from: StringsJVM.kt */
/* loaded from: classes4.dex */
public class m extends l {
    public static final boolean Y(String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return c0(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final boolean Z(String str, String str2) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final Comparator a0() {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        com.amazon.aps.iva.yb0.j.e(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    public static final boolean b0(CharSequence charSequence) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        com.amazon.aps.iva.ec0.j m0 = q.m0(charSequence);
        if (!(m0 instanceof Collection) || !((Collection) m0).isEmpty()) {
            Iterator<Integer> it = m0.iterator();
            while (it.hasNext()) {
                if (!x.Y(charSequence.charAt(((f0) it).b()))) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    public static final boolean c0(int i, int i2, int i3, String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static final String d0(int i, String str) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i != 0) {
                if (i != 1) {
                    int length = str.length();
                    if (length != 0) {
                        if (length != 1) {
                            StringBuilder sb = new StringBuilder(str.length() * i);
                            com.amazon.aps.iva.ec0.i it = new com.amazon.aps.iva.ec0.j(1, i).iterator();
                            while (it.d) {
                                it.b();
                                sb.append((CharSequence) str);
                            }
                            String sb2 = sb.toString();
                            com.amazon.aps.iva.yb0.j.e(sb2, "{\n                    va…tring()\n                }");
                            return sb2;
                        }
                        char charAt = str.charAt(0);
                        char[] cArr = new char[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            cArr[i2] = charAt;
                        }
                        return new String(cArr);
                    }
                } else {
                    return str.toString();
                }
            }
            return "";
        }
        throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
    }

    public static String e0(String str, char c, char c2) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        String replace = str.replace(c, c2);
        com.amazon.aps.iva.yb0.j.e(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    public static String f0(String str, String str2, String str3) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "oldValue");
        com.amazon.aps.iva.yb0.j.f(str3, "newValue");
        int o0 = q.o0(0, str, str2, false);
        if (o0 >= 0) {
            int length = str2.length();
            int i = 1;
            if (length >= 1) {
                i = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int i2 = 0;
                do {
                    sb.append((CharSequence) str, i2, o0);
                    sb.append(str3);
                    i2 = o0 + length;
                    if (o0 >= str.length()) {
                        break;
                    }
                    o0 = q.o0(o0 + i, str, str2, false);
                } while (o0 > 0);
                sb.append((CharSequence) str, i2, str.length());
                String sb2 = sb.toString();
                com.amazon.aps.iva.yb0.j.e(sb2, "stringBuilder.append(this, i, length).toString()");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean g0(int i, String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return c0(i, 0, str2.length(), str, str2, z);
    }

    public static final boolean h0(String str, String str2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return c0(0, 0, str2.length(), str, str2, z);
    }
}
