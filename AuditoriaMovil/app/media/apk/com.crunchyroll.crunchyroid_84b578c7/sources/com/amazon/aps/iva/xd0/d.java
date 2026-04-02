package com.amazon.aps.iva.xd0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.lb0.z;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MemberScope.kt */
/* loaded from: classes4.dex */
public final class d {
    public static final a c = new a();
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final ArrayList r;
    public static final ArrayList s;
    public final List<c> a;
    public final int b;

    /* compiled from: MemberScope.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* compiled from: MemberScope.kt */
        /* renamed from: com.amazon.aps.iva.xd0.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0851a {
            public final int a;
            public final String b;

            public C0851a(int i, String str) {
                this.a = i;
                this.b = str;
            }
        }
    }

    static {
        boolean z;
        a.C0851a c0851a;
        d dVar;
        int i2 = d;
        int i3 = i2 << 1;
        e = i2;
        int i4 = i3 << 1;
        f = i3;
        int i5 = i4 << 1;
        g = i4;
        int i6 = i5 << 1;
        h = i5;
        int i7 = i6 << 1;
        i = i6;
        int i8 = i7 << 1;
        j = i7;
        d = i8 << 1;
        int i9 = i8 - 1;
        k = i9;
        int i10 = i2 | i3 | i4;
        l = i10;
        m = new d(i9);
        n = new d(i6 | i7);
        new d(i2);
        new d(i3);
        new d(i4);
        o = new d(i10);
        new d(i5);
        p = new d(i6);
        q = new d(i7);
        new d(i3 | i6 | i7);
        Field[] fields = d.class.getFields();
        com.amazon.aps.iva.yb0.j.e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            a.C0851a c0851a2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            if (obj instanceof d) {
                dVar = (d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                String name = field2.getName();
                com.amazon.aps.iva.yb0.j.e(name, "field.name");
                c0851a2 = new a.C0851a(dVar.b, name);
            }
            if (c0851a2 != null) {
                arrayList2.add(c0851a2);
            }
        }
        r = arrayList2;
        Field[] fields2 = d.class.getFields();
        com.amazon.aps.iva.yb0.j.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (com.amazon.aps.iva.yb0.j.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get(null);
            com.amazon.aps.iva.yb0.j.d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String name2 = field4.getName();
                com.amazon.aps.iva.yb0.j.e(name2, "field.name");
                c0851a = new a.C0851a(intValue, name2);
            } else {
                c0851a = null;
            }
            if (c0851a != null) {
                arrayList5.add(c0851a);
            }
        }
        s = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i2, List<? extends c> list) {
        com.amazon.aps.iva.yb0.j.f(list, "excludes");
        this.a = list;
        for (c cVar : list) {
            i2 &= ~cVar.a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        if ((i2 & this.b) != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(d.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, dVar.a) && this.b == dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object obj;
        String str;
        String str2;
        boolean z;
        Iterator it = r.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((a.C0851a) obj).a == this.b) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        a.C0851a c0851a = (a.C0851a) obj;
        if (c0851a != null) {
            str = c0851a.b;
        } else {
            str = null;
        }
        if (str == null) {
            ArrayList arrayList = s;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a.C0851a c0851a2 = (a.C0851a) it2.next();
                if (a(c0851a2.a)) {
                    str2 = c0851a2.b;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            str = x.B0(arrayList2, " | ", null, null, null, 62);
        }
        StringBuilder c2 = com.amazon.aps.iva.k.q.c("DescriptorKindFilter(", str, ", ");
        c2.append(this.a);
        c2.append(')');
        return c2.toString();
    }

    public /* synthetic */ d(int i2) {
        this(i2, z.b);
    }
}
