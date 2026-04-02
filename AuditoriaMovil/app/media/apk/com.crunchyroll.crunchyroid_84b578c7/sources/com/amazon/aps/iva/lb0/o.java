package com.amazon.aps.iva.lb0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: _Arrays.kt */
/* loaded from: classes4.dex */
public class o extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Sequences.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements com.amazon.aps.iva.ne0.h<T> {
        public final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        @Override // com.amazon.aps.iva.ne0.h
        public final Iterator<T> iterator() {
            return com.amazon.aps.iva.aq.j.C(this.a);
        }
    }

    public static final <T> com.amazon.aps.iva.ne0.h<T> M(T[] tArr) {
        boolean z;
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return com.amazon.aps.iva.ne0.d.a;
        }
        return new a(tArr);
    }

    public static final <T> boolean N(T[] tArr, T t) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        if (T(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    public static final ArrayList O(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T P(T[] tArr) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T Q(T[] tArr) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    public static final Integer R(int i, int[] iArr) {
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        if (i >= 0 && i <= iArr.length - 1) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static final <T> T S(T[] tArr, int i) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        if (i >= 0 && i <= tArr.length - 1) {
            return tArr[i];
        }
        return null;
    }

    public static final <T> int T(T[] tArr, T t) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (com.amazon.aps.iva.yb0.j.a(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void U(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(charSequence, "separator");
        com.amazon.aps.iva.yb0.j.f(charSequence2, "prefix");
        com.amazon.aps.iva.yb0.j.f(charSequence3, "postfix");
        com.amazon.aps.iva.yb0.j.f(charSequence4, "truncated");
        sb.append(charSequence2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            com.amazon.aps.iva.aq.k.g(sb, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            sb.append(charSequence4);
        }
        sb.append(charSequence3);
    }

    public static String V(Object[] objArr, String str, String str2, String str3, com.amazon.aps.iva.xb0.l lVar, int i) {
        String str4;
        String str5;
        int i2;
        CharSequence charSequence;
        com.amazon.aps.iva.xb0.l lVar2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2;
        if ((i & 16) != 0) {
            charSequence = "...";
        } else {
            charSequence = null;
        }
        if ((i & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        com.amazon.aps.iva.yb0.j.f(str6, "separator");
        com.amazon.aps.iva.yb0.j.f(str4, "prefix");
        com.amazon.aps.iva.yb0.j.f(str5, "postfix");
        com.amazon.aps.iva.yb0.j.f(charSequence, "truncated");
        StringBuilder sb = new StringBuilder();
        U(objArr, sb, str6, str4, str5, i3, charSequence, lVar2);
        String sb2 = sb.toString();
        com.amazon.aps.iva.yb0.j.e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static final <T> T W(T[] tArr) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int X(Object obj, Object[] objArr) {
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (com.amazon.aps.iva.yb0.j.a(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static final char Y(char[] cArr) {
        com.amazon.aps.iva.yb0.j.f(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T Z(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List a0(Comparator comparator, Object[] objArr) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(objArr, "<this>");
        if (objArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            com.amazon.aps.iva.yb0.j.e(objArr, "copyOf(this, size)");
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return m.B(objArr);
    }

    public static final <T> List<T> b0(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new j(tArr, false));
            }
            return f1.J(tArr[0]);
        }
        return z.b;
    }

    public static final ArrayList c0(int[] iArr) {
        com.amazon.aps.iva.yb0.j.f(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static final <T> Set<T> d0(T[] tArr) {
        com.amazon.aps.iva.yb0.j.f(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(com.amazon.aps.iva.aq.k.w(tArr.length));
                for (T t : tArr) {
                    linkedHashSet.add(t);
                }
                return linkedHashSet;
            }
            return l1.H(tArr[0]);
        }
        return b0.b;
    }
}
