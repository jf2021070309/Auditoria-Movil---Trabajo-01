package com.amazon.aps.iva.md0;

import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.c0;
import com.amazon.aps.iva.lb0.d0;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.ld0.a;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: JvmNameResolverBase.kt */
/* loaded from: classes4.dex */
public class g implements com.amazon.aps.iva.kd0.c {
    public static final List<String> d;
    public final String[] a;
    public final Set<Integer> b;
    public final List<a.d.c> c;

    /* compiled from: JvmNameResolverBase.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.d.c.EnumC0485c.values().length];
            try {
                iArr[a.d.c.EnumC0485c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.d.c.EnumC0485c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.d.c.EnumC0485c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        String B0 = x.B0(f1.K('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List<String> K = f1.K(B0.concat("/Any"), B0.concat("/Nothing"), B0.concat("/Unit"), B0.concat("/Throwable"), B0.concat("/Number"), B0.concat("/Byte"), B0.concat("/Double"), B0.concat("/Float"), B0.concat("/Int"), B0.concat("/Long"), B0.concat("/Short"), B0.concat("/Boolean"), B0.concat("/Char"), B0.concat("/CharSequence"), B0.concat("/String"), B0.concat("/Comparable"), B0.concat("/Enum"), B0.concat("/Array"), B0.concat("/ByteArray"), B0.concat("/DoubleArray"), B0.concat("/FloatArray"), B0.concat("/IntArray"), B0.concat("/LongArray"), B0.concat("/ShortArray"), B0.concat("/BooleanArray"), B0.concat("/CharArray"), B0.concat("/Cloneable"), B0.concat("/Annotation"), B0.concat("/collections/Iterable"), B0.concat("/collections/MutableIterable"), B0.concat("/collections/Collection"), B0.concat("/collections/MutableCollection"), B0.concat("/collections/List"), B0.concat("/collections/MutableList"), B0.concat("/collections/Set"), B0.concat("/collections/MutableSet"), B0.concat("/collections/Map"), B0.concat("/collections/MutableMap"), B0.concat("/collections/Map.Entry"), B0.concat("/collections/MutableMap.MutableEntry"), B0.concat("/collections/Iterator"), B0.concat("/collections/MutableIterator"), B0.concat("/collections/ListIterator"), B0.concat("/collections/MutableListIterator"));
        d = K;
        d0 d1 = x.d1(K);
        int w = k.w(r.Y(d1));
        if (w < 16) {
            w = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(w);
        Iterator it = d1.iterator();
        while (true) {
            e0 e0Var = (e0) it;
            if (e0Var.hasNext()) {
                c0 c0Var = (c0) e0Var.next();
                linkedHashMap.put((String) c0Var.b, Integer.valueOf(c0Var.a));
            } else {
                return;
            }
        }
    }

    public g(String[] strArr, Set set, ArrayList arrayList) {
        this.a = strArr;
        this.b = set;
        this.c = arrayList;
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final boolean a(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final String b(int i) {
        return getString(i);
    }

    @Override // com.amazon.aps.iva.kd0.c
    public final String getString(int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        a.d.c cVar = this.c.get(i);
        int i2 = cVar.c;
        if ((i2 & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object obj = cVar.f;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                com.amazon.aps.iva.od0.c cVar2 = (com.amazon.aps.iva.od0.c) obj;
                cVar2.getClass();
                try {
                    String r = cVar2.r();
                    if (cVar2.k()) {
                        cVar.f = r;
                    }
                    str = r;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            }
        } else {
            if ((i2 & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                List<String> list = d;
                int size = list.size();
                int i3 = cVar.e;
                if (i3 >= 0 && i3 < size) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    str = list.get(i3);
                }
            }
            str = this.a[i];
        }
        if (cVar.h.size() >= 2) {
            List<Integer> list2 = cVar.h;
            j.e(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            j.e(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                j.e(num2, "end");
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (cVar.j.size() >= 2) {
            List<Integer> list3 = cVar.j;
            j.e(list3, "replaceCharList");
            j.e(str, "string");
            str = m.e0(str, (char) list3.get(0).intValue(), (char) list3.get(1).intValue());
        }
        a.d.c.EnumC0485c enumC0485c = cVar.g;
        if (enumC0485c == null) {
            enumC0485c = a.d.c.EnumC0485c.NONE;
        }
        int i4 = a.a[enumC0485c.ordinal()];
        if (i4 != 2) {
            if (i4 == 3) {
                if (str.length() >= 2) {
                    str = str.substring(1, str.length() - 1);
                    j.e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                str = m.e0(str, '$', '.');
            }
        } else {
            j.e(str, "string");
            str = m.e0(str, '$', '.');
        }
        j.e(str, "string");
        return str;
    }
}
