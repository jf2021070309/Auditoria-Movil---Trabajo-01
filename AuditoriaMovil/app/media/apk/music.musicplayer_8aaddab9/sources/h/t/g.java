package h.t;

import e.j.d.w;
import h.o.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2.dex */
public class g extends e {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        j.e(charSequence, "<this>");
        j.e(charSequence2, "other");
        return h(charSequence, (String) charSequence2, 0, z, 2) >= 0;
    }

    public static boolean b(String str, String str2, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        j.e(str, "<this>");
        j.e(str2, "suffix");
        return !z ? str.endsWith(str2) : l(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static final int c(CharSequence charSequence) {
        j.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(CharSequence charSequence, String str, int i2, boolean z) {
        j.e(charSequence, "<this>");
        j.e(str, "string");
        return (z || !(charSequence instanceof String)) ? f(charSequence, str, i2, charSequence.length(), z, false, 16) : ((String) charSequence).indexOf(str, i2);
    }

    public static final int e(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2) {
        h.q.a aVar;
        if (z2) {
            int c2 = c(charSequence);
            if (i2 > c2) {
                i2 = c2;
            }
            if (i3 < 0) {
                i3 = 0;
            }
            aVar = new h.q.a(i2, i3, -1);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            int length = charSequence.length();
            if (i3 > length) {
                i3 = length;
            }
            aVar = new h.q.c(i2, i3);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i4 = aVar.a;
            int i5 = aVar.f8950b;
            int i6 = aVar.f8951c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    int i7 = i4 + i6;
                    if (l((String) charSequence2, 0, (String) charSequence, i4, charSequence2.length(), z)) {
                        return i4;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 = i7;
                }
            }
        } else {
            int i8 = aVar.a;
            int i9 = aVar.f8950b;
            int i10 = aVar.f8951c;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (true) {
                    int i11 = i8 + i10;
                    if (m(charSequence2, 0, charSequence, i8, charSequence2.length(), z)) {
                        return i8;
                    }
                    if (i8 == i9) {
                        break;
                    }
                    i8 = i11;
                }
            }
        }
        return -1;
    }

    public static /* synthetic */ int f(CharSequence charSequence, CharSequence charSequence2, int i2, int i3, boolean z, boolean z2, int i4) {
        return e(charSequence, charSequence2, i2, i3, z, (i4 & 16) != 0 ? false : z2);
    }

    public static int g(CharSequence charSequence, char c2, int i2, boolean z, int i3) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        j.e(charSequence, "<this>");
        if (z) {
            char[] cArr = {c2};
            j.e(charSequence, "<this>");
            j.e(cArr, "chars");
            if (z) {
                if (i2 < 0) {
                    i2 = 0;
                }
                int c3 = c(charSequence);
                if (i2 <= c3) {
                    while (true) {
                        int i4 = i2 + 1;
                        char charAt = charSequence.charAt(i2);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 1) {
                                z2 = false;
                                break;
                            }
                            char c4 = cArr[i5];
                            i5++;
                            if (w.B(c4, charAt, z)) {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            return i2;
                        }
                        if (i2 == c3) {
                            break;
                        }
                        i2 = i4;
                    }
                }
                return -1;
            }
            return ((String) charSequence).indexOf(w.u0(cArr), i2);
        }
        return ((String) charSequence).indexOf(c2, i2);
    }

    public static /* synthetic */ int h(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return d(charSequence, str, i2, z);
    }

    public static final boolean i(CharSequence charSequence) {
        boolean z;
        j.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            j.e(charSequence, "<this>");
            h.q.c cVar = new h.q.c(0, charSequence.length() - 1);
            if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
                Iterator<Integer> it = cVar.iterator();
                while (((h.q.b) it).f8953c) {
                    if (!w.X(charSequence.charAt(((h.l.h) it).a()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            return z;
        }
        return true;
    }

    public static int j(CharSequence charSequence, String str, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = c(charSequence);
        }
        int i4 = i2;
        boolean z2 = (i3 & 4) != 0 ? false : z;
        j.e(charSequence, "<this>");
        j.e(str, "string");
        return (z2 || !(charSequence instanceof String)) ? e(charSequence, str, i4, 0, z2, true) : ((String) charSequence).lastIndexOf(str, i4);
    }

    public static h.s.b k(CharSequence charSequence, String[] strArr, int i2, boolean z, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        o(i3);
        return new b(charSequence, i2, i3, new h(h.l.c.a(strArr), z));
    }

    public static final boolean l(String str, int i2, String str2, int i3, int i4, boolean z) {
        j.e(str, "<this>");
        j.e(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static final boolean m(CharSequence charSequence, int i2, CharSequence charSequence2, int i3, int i4, boolean z) {
        j.e(charSequence, "<this>");
        j.e(charSequence2, "other");
        if (i3 < 0 || i2 < 0 || i2 > charSequence.length() - i4 || i3 > charSequence2.length() - i4) {
            return false;
        }
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            if (!w.B(charSequence.charAt(i2 + i5), charSequence2.charAt(i5 + i3), z)) {
                return false;
            }
            i5 = i6;
        }
        return true;
    }

    public static String n(String str, String str2, String str3, boolean z, int i2) {
        int i3 = 0;
        if ((i2 & 4) != 0) {
            z = false;
        }
        j.e(str, "<this>");
        j.e(str2, "oldValue");
        j.e(str3, "newValue");
        int d2 = d(str, str2, 0, z);
        if (d2 < 0) {
            return str;
        }
        int length = str2.length();
        int i4 = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i3, d2);
                sb.append(str3);
                i3 = d2 + length;
                if (d2 >= str.length()) {
                    break;
                }
                d2 = d(str, str2, d2 + i4, z);
            } while (d2 > 0);
            sb.append((CharSequence) str, i3, str.length());
            String sb2 = sb.toString();
            j.d(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    public static final void o(int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(j.i("Limit must be non-negative, but was ", Integer.valueOf(i2)).toString());
        }
    }

    public static List p(CharSequence charSequence, String[] strArr, boolean z, int i2, int i3) {
        int i4 = 0;
        boolean z2 = (i3 & 2) != 0 ? false : z;
        int i5 = (i3 & 4) != 0 ? 0 : i2;
        j.e(charSequence, "<this>");
        j.e(strArr, "delimiters");
        int i6 = 10;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                o(i5);
                int d2 = d(charSequence, str, 0, z2);
                if (d2 == -1 || i5 == 1) {
                    return w.a0(charSequence.toString());
                }
                boolean z3 = i5 > 0;
                if (z3 && i5 <= 10) {
                    i6 = i5;
                }
                ArrayList arrayList = new ArrayList(i6);
                do {
                    arrayList.add(charSequence.subSequence(i4, d2).toString());
                    i4 = str.length() + d2;
                    if (z3 && arrayList.size() == i5 - 1) {
                        break;
                    }
                    d2 = d(charSequence, str, i4, z2);
                } while (d2 != -1);
                arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
                return arrayList;
            }
        }
        h.s.b k2 = k(charSequence, strArr, 0, z2, i5, 2);
        j.e(k2, "<this>");
        h.s.c cVar = new h.s.c(k2);
        ArrayList arrayList2 = new ArrayList(w.s(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(r(charSequence, (h.q.c) it.next()));
        }
        return arrayList2;
    }

    public static boolean q(String str, String str2, boolean z, int i2) {
        boolean z2 = (i2 & 2) != 0 ? false : z;
        j.e(str, "<this>");
        j.e(str2, "prefix");
        return !z2 ? str.startsWith(str2) : l(str, 0, str2, 0, str2.length(), z2);
    }

    public static final String r(CharSequence charSequence, h.q.c cVar) {
        j.e(charSequence, "<this>");
        j.e(cVar, "range");
        return charSequence.subSequence(Integer.valueOf(cVar.a).intValue(), Integer.valueOf(cVar.f8950b).intValue() + 1).toString();
    }

    public static String s(String str, char c2, String str2, int i2) {
        String str3 = (i2 & 2) != 0 ? str : null;
        j.e(str, "<this>");
        j.e(str3, "missingDelimiterValue");
        int c3 = c(str);
        j.e(str, "<this>");
        int lastIndexOf = str.lastIndexOf(c2, c3);
        if (lastIndexOf == -1) {
            return str3;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        j.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Boolean t(String str) {
        j.e(str, "<this>");
        if (j.a(str, "true")) {
            return Boolean.TRUE;
        }
        if (j.a(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r4 == '+') goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long u(java.lang.String r18) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            h.o.c.j.e(r0, r1)
            h.o.c.j.e(r0, r1)
            r1 = 10
            e.j.d.w.o(r1)
            int r2 = r18.length()
            if (r2 != 0) goto L16
            goto L70
        L16:
            r3 = 0
            char r4 = r0.charAt(r3)
            r5 = 48
            r6 = 1
            if (r4 >= r5) goto L22
            r5 = -1
            goto L27
        L22:
            if (r4 != r5) goto L26
            r5 = 0
            goto L27
        L26:
            r5 = 1
        L27:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= 0) goto L3e
            if (r2 != r6) goto L31
            goto L70
        L31:
            r5 = 45
            if (r4 != r5) goto L39
            r7 = -9223372036854775808
            r3 = 1
            goto L3f
        L39:
            r5 = 43
            if (r4 != r5) goto L70
            goto L3f
        L3e:
            r6 = 0
        L3f:
            r4 = 0
            r9 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r11 = r9
        L47:
            if (r6 >= r2) goto L75
            int r13 = r6 + 1
            char r6 = r0.charAt(r6)
            int r6 = java.lang.Character.digit(r6, r1)
            if (r6 >= 0) goto L56
            goto L70
        L56:
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 != 0) goto L70
            long r11 = (long) r1
            long r11 = r7 / r11
            int r14 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r14 >= 0) goto L66
            goto L70
        L66:
            long r14 = (long) r1
            long r4 = r4 * r14
            long r14 = (long) r6
            long r16 = r7 + r14
            int r6 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r6 >= 0) goto L72
        L70:
            r0 = 0
            goto L81
        L72:
            long r4 = r4 - r14
            r6 = r13
            goto L47
        L75:
            if (r3 == 0) goto L7c
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L81
        L7c:
            long r0 = -r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L81:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.t.g.u(java.lang.String):java.lang.Long");
    }

    public static final CharSequence v(CharSequence charSequence) {
        j.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z = false;
        while (i2 <= length) {
            boolean X = w.X(charSequence.charAt(!z ? i2 : length));
            if (z) {
                if (!X) {
                    break;
                }
                length--;
            } else if (X) {
                i2++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i2, length + 1);
    }
}
