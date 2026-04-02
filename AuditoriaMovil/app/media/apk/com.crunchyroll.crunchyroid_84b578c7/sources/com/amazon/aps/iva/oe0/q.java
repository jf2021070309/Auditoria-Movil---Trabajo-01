package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ne0.s;
import com.amazon.aps.iva.ne0.u;
import com.amazon.aps.iva.q.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Strings.kt */
/* loaded from: classes4.dex */
public class q extends m {
    public static final StringBuilder A0(String str, int i, int i2, CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) str, 0, i);
            sb.append(charSequence);
            sb.append((CharSequence) str, i2, str.length());
            return sb;
        }
        throw new IndexOutOfBoundsException(com.amazon.aps.iva.q.n.a("End index (", i2, ") is less than start index (", i, ")."));
    }

    public static final void B0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(c0.a("Limit must be non-negative, but was ", i).toString());
    }

    public static final List C0(int i, CharSequence charSequence, String str, boolean z) {
        boolean z2;
        B0(i);
        int i2 = 0;
        int o0 = o0(0, charSequence, str, z);
        if (o0 != -1 && i != 1) {
            if (i > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i3 = 10;
            if (z2 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, o0).toString());
                i2 = str.length() + o0;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                o0 = o0(i2, charSequence, str, z);
            } while (o0 != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        return f1.J(charSequence.toString());
    }

    public static List D0(CharSequence charSequence, char[] cArr) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (cArr.length == 1) {
            return C0(0, charSequence, String.valueOf(cArr[0]), false);
        }
        B0(0);
        com.amazon.aps.iva.ne0.p pVar = new com.amazon.aps.iva.ne0.p(new b(charSequence, 0, 0, new n(cArr, false)));
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(pVar));
        Iterator<Object> it = pVar.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (com.amazon.aps.iva.ec0.j) it.next()));
        }
        return arrayList;
    }

    public static List E0(CharSequence charSequence, String[] strArr) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        boolean z = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                return C0(0, charSequence, str, false);
            }
        }
        com.amazon.aps.iva.ne0.p pVar = new com.amazon.aps.iva.ne0.p(w0(charSequence, strArr, false, 0));
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(pVar));
        Iterator<Object> it = pVar.iterator();
        while (it.hasNext()) {
            arrayList.add(H0(charSequence, (com.amazon.aps.iva.ec0.j) it.next()));
        }
        return arrayList;
    }

    public static boolean F0(CharSequence charSequence, CharSequence charSequence2) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence2, "prefix");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return m.h0((String) charSequence, (String) charSequence2, false);
        }
        return x0(charSequence, false, 0, charSequence2, 0, charSequence2.length());
    }

    public static boolean G0(String str, char c) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        if (str.length() <= 0 || !x.K(str.charAt(0), c, false)) {
            return false;
        }
        return true;
    }

    public static final String H0(CharSequence charSequence, com.amazon.aps.iva.ec0.j jVar) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(jVar, "range");
        return charSequence.subSequence(Integer.valueOf(jVar.b).intValue(), Integer.valueOf(jVar.c).intValue() + 1).toString();
    }

    public static final String I0(String str, String str2, String str3) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "delimiter");
        com.amazon.aps.iva.yb0.j.f(str3, "missingDelimiterValue");
        int r0 = r0(str, str2, 0, false, 6);
        if (r0 != -1) {
            String substring = str.substring(str2.length() + r0, str.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    public static String J0(String str, char c) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "missingDelimiterValue");
        int q0 = q0(str, c, 0, false, 6);
        if (q0 != -1) {
            String substring = str.substring(q0 + 1, str.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final String K0(char c, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str2, "missingDelimiterValue");
        int t0 = t0(str, c, 0, 6);
        if (t0 != -1) {
            String substring = str.substring(t0 + 1, str.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }

    public static String L0(String str, char c) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "missingDelimiterValue");
        int q0 = q0(str, c, 0, false, 6);
        if (q0 != -1) {
            String substring = str.substring(0, q0);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String M0(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "missingDelimiterValue");
        int r0 = r0(str, str2, 0, false, 6);
        if (r0 != -1) {
            String substring = str.substring(0, r0);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static final String N0(String str, String str2, String str3) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(str3, "missingDelimiterValue");
        int u0 = u0(str, str2, 6);
        if (u0 != -1) {
            String substring = str.substring(0, u0);
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str3;
    }

    public static final CharSequence O0(CharSequence charSequence) {
        int i;
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            if (!z) {
                i = i2;
            } else {
                i = length;
            }
            boolean Y = x.Y(charSequence.charAt(i));
            if (!z) {
                if (!Y) {
                    z = true;
                } else {
                    i2++;
                }
            } else if (!Y) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }

    public static final boolean i0(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (r0(charSequence, (String) charSequence2, 0, z, 2) < 0) {
                return false;
            }
        } else if (p0(charSequence, charSequence2, 0, charSequence.length(), z, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean j0(CharSequence charSequence, char c) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (q0(charSequence, c, 0, false, 2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean k0(CharSequence charSequence, char c) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (charSequence.length() <= 0 || !x.K(charSequence.charAt(n0(charSequence)), c, false)) {
            return false;
        }
        return true;
    }

    public static boolean l0(CharSequence charSequence, String str) {
        if (charSequence instanceof String) {
            return m.Y((String) charSequence, str, false);
        }
        return x0(charSequence, false, charSequence.length() - str.length(), str, 0, str.length());
    }

    public static final com.amazon.aps.iva.ec0.j m0(CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        return new com.amazon.aps.iva.ec0.j(0, charSequence.length() - 1);
    }

    public static final int n0(CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int o0(int i, CharSequence charSequence, String str, boolean z) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return p0(charSequence, str, i, charSequence.length(), z, false);
    }

    public static final int p0(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        com.amazon.aps.iva.ec0.h hVar;
        if (!z2) {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            hVar = new com.amazon.aps.iva.ec0.j(i, i2);
        } else {
            int n0 = n0(charSequence);
            if (i > n0) {
                i = n0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            hVar = new com.amazon.aps.iva.ec0.h(i, i2, -1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = hVar.b;
        int i4 = hVar.d;
        int i5 = hVar.c;
        if (z3 && (charSequence2 instanceof String)) {
            if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
                while (!m.c0(0, i3, charSequence2.length(), (String) charSequence2, (String) charSequence, z)) {
                    if (i3 != i5) {
                        i3 += i4;
                    }
                }
                return i3;
            }
        } else if ((i4 > 0 && i3 <= i5) || (i4 < 0 && i5 <= i3)) {
            while (!x0(charSequence2, z, 0, charSequence, i3, charSequence2.length())) {
                if (i3 != i5) {
                    i3 += i4;
                }
            }
            return i3;
        }
        return -1;
    }

    public static int q0(CharSequence charSequence, char c, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return s0(i, charSequence, z, new char[]{c});
    }

    public static /* synthetic */ int r0(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return o0(i, charSequence, str, z);
    }

    public static final int s0(int i, CharSequence charSequence, boolean z, char[] cArr) {
        boolean z2;
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(com.amazon.aps.iva.lb0.o.Y(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        com.amazon.aps.iva.ec0.i it = new com.amazon.aps.iva.ec0.j(i, n0(charSequence)).iterator();
        while (it.d) {
            int b = it.b();
            char charAt = charSequence.charAt(b);
            int length = cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (x.K(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    continue;
                    break;
                }
            }
            if (z2) {
                return b;
            }
        }
        return -1;
    }

    public static int t0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = n0(charSequence);
        }
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        if (!(charSequence instanceof String)) {
            char[] cArr = {c};
            if (charSequence instanceof String) {
                return ((String) charSequence).lastIndexOf(com.amazon.aps.iva.lb0.o.Y(cArr), i);
            }
            int n0 = n0(charSequence);
            if (i > n0) {
                i = n0;
            }
            while (-1 < i) {
                if (x.K(cArr[0], charSequence.charAt(i), false)) {
                    return i;
                }
                i--;
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(c, i);
    }

    public static int u0(CharSequence charSequence, String str, int i) {
        int i2;
        if ((i & 2) != 0) {
            i2 = n0(charSequence);
        } else {
            i2 = 0;
        }
        int i3 = i2;
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "string");
        if (!(charSequence instanceof String)) {
            return p0(charSequence, str, i3, 0, false, true);
        }
        return ((String) charSequence).lastIndexOf(str, i3);
    }

    public static final u v0(CharSequence charSequence) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        return s.b0(w0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0), new p(charSequence));
    }

    public static b w0(CharSequence charSequence, String[] strArr, boolean z, int i) {
        B0(i);
        return new b(charSequence, 0, i, new o(com.amazon.aps.iva.lb0.m.B(strArr), z));
    }

    public static final boolean x0(CharSequence charSequence, boolean z, int i, CharSequence charSequence2, int i2, int i3) {
        com.amazon.aps.iva.yb0.j.f(charSequence, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!x.K(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final String y0(CharSequence charSequence, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence, "prefix");
        if (F0(str, charSequence)) {
            String substring = str.substring(charSequence.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static final String z0(String str, String str2) {
        if (l0(str2, str)) {
            String substring = str2.substring(0, str2.length() - str.length());
            com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str2;
    }
}
