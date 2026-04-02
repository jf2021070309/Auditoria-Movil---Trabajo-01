package com.amazon.aps.iva.oe0;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.ne0.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Indent.kt */
/* loaded from: classes4.dex */
public class i extends com.amazon.aps.iva.aq.k {

    /* compiled from: Indent.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, String> {
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.h = str;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final String invoke(String str) {
            String str2 = str;
            com.amazon.aps.iva.yb0.j.f(str2, "it");
            boolean b0 = m.b0(str2);
            String str3 = this.h;
            if (b0) {
                if (str2.length() < str3.length()) {
                    return str3;
                }
                return str2;
            }
            return com.amazon.aps.iva.c80.a.f(str3, str2);
        }
    }

    public static final String S(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        return s.Z(s.b0(q.v0(str), new a(str2)), "\n");
    }

    public static final String T(String str) {
        Comparable comparable;
        int i;
        boolean z;
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        List f0 = s.f0(q.v0(str));
        List list = f0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ m.b0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(com.amazon.aps.iva.lb0.r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i2 < length) {
                    if (!x.Y(str2.charAt(i2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                i2 = str2.length();
            }
            arrayList2.add(Integer.valueOf(i2));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int size = (f0.size() * 0) + str.length();
        int B = f1.B(f0);
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        for (Object obj2 : list) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                String str3 = (String) obj2;
                if ((i3 == 0 || i3 == B) && m.b0(str3)) {
                    str3 = null;
                } else {
                    com.amazon.aps.iva.yb0.j.f(str3, "<this>");
                    if (i >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int length2 = str3.length();
                        if (i <= length2) {
                            length2 = i;
                        }
                        String substring = str3.substring(length2);
                        com.amazon.aps.iva.yb0.j.e(substring, "this as java.lang.String).substring(startIndex)");
                        String invoke = h.h.invoke(substring);
                        if (invoke != null) {
                            str3 = invoke;
                        }
                    } else {
                        throw new IllegalArgumentException(com.amazon.aps.iva.c80.a.d("Requested character count ", i, " is less than zero.").toString());
                    }
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i3 = i4;
            } else {
                f1.S();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        com.amazon.aps.iva.lb0.x.A0(arrayList3, sb, "\n", null, null, null, 124);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return sb2;
    }

    public static String U(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "<this>");
        if (!m.b0("|")) {
            List f0 = s.f0(q.v0(str));
            int size = (f0.size() * 0) + str.length();
            int B = f1.B(f0);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : f0) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    String str3 = (String) obj;
                    if ((i != 0 && i != B) || !m.b0(str3)) {
                        int length = str3.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                if (!x.Y(str3.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 != -1 && m.g0(i3, str3, "|", false)) {
                            str2 = str3.substring("|".length() + i3);
                            com.amazon.aps.iva.yb0.j.e(str2, "this as java.lang.String).substring(startIndex)");
                        }
                        if (str2 == null || (str2 = h.h.invoke(str2)) == null) {
                            str2 = str3;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    f1.S();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(size);
            com.amazon.aps.iva.lb0.x.A0(arrayList, sb, "\n", null, null, null, 124);
            String sb2 = sb.toString();
            com.amazon.aps.iva.yb0.j.e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
}
