package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.q.c0;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
/* compiled from: JavaToKotlinClassMap.kt */
/* loaded from: classes4.dex */
public final class c {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final com.amazon.aps.iva.nd0.b e;
    public static final com.amazon.aps.iva.nd0.c f;
    public static final com.amazon.aps.iva.nd0.b g;
    public static final HashMap<com.amazon.aps.iva.nd0.d, com.amazon.aps.iva.nd0.b> h;
    public static final HashMap<com.amazon.aps.iva.nd0.d, com.amazon.aps.iva.nd0.b> i;
    public static final HashMap<com.amazon.aps.iva.nd0.d, com.amazon.aps.iva.nd0.c> j;
    public static final HashMap<com.amazon.aps.iva.nd0.d, com.amazon.aps.iva.nd0.c> k;
    public static final HashMap<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> l;
    public static final HashMap<com.amazon.aps.iva.nd0.b, com.amazon.aps.iva.nd0.b> m;
    public static final List<a> n;

    /* compiled from: JavaToKotlinClassMap.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public final com.amazon.aps.iva.nd0.b a;
        public final com.amazon.aps.iva.nd0.b b;
        public final com.amazon.aps.iva.nd0.b c;

        public a(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.b bVar2, com.amazon.aps.iva.nd0.b bVar3) {
            this.a = bVar;
            this.b = bVar2;
            this.c = bVar3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (com.amazon.aps.iva.yb0.j.a(this.a, aVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode();
            return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
        }
    }

    static {
        com.amazon.aps.iva.vd0.c[] values;
        StringBuilder sb = new StringBuilder();
        com.amazon.aps.iva.mc0.c cVar = com.amazon.aps.iva.mc0.c.Function;
        sb.append(cVar.getPackageFqName().toString());
        sb.append('.');
        sb.append(cVar.getClassNamePrefix());
        a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        com.amazon.aps.iva.mc0.c cVar2 = com.amazon.aps.iva.mc0.c.KFunction;
        sb2.append(cVar2.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(cVar2.getClassNamePrefix());
        b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        com.amazon.aps.iva.mc0.c cVar3 = com.amazon.aps.iva.mc0.c.SuspendFunction;
        sb3.append(cVar3.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(cVar3.getClassNamePrefix());
        c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        com.amazon.aps.iva.mc0.c cVar4 = com.amazon.aps.iva.mc0.c.KSuspendFunction;
        sb4.append(cVar4.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(cVar4.getClassNamePrefix());
        d = sb4.toString();
        com.amazon.aps.iva.nd0.b l2 = com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.functions.FunctionN"));
        e = l2;
        com.amazon.aps.iva.nd0.c b2 = l2.b();
        com.amazon.aps.iva.yb0.j.e(b2, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f = b2;
        g = com.amazon.aps.iva.nd0.i.o;
        d(Class.class);
        h = new HashMap<>();
        i = new HashMap<>();
        j = new HashMap<>();
        k = new HashMap<>();
        l = new HashMap<>();
        m = new HashMap<>();
        com.amazon.aps.iva.nd0.b l3 = com.amazon.aps.iva.nd0.b.l(o.a.A);
        com.amazon.aps.iva.nd0.c cVar5 = o.a.I;
        com.amazon.aps.iva.nd0.c h2 = l3.h();
        com.amazon.aps.iva.nd0.c h3 = l3.h();
        com.amazon.aps.iva.yb0.j.e(h3, "kotlinReadOnly.packageFqName");
        com.amazon.aps.iva.nd0.c a2 = com.amazon.aps.iva.nd0.e.a(cVar5, h3);
        a aVar = new a(d(Iterable.class), l3, new com.amazon.aps.iva.nd0.b(h2, a2, false));
        com.amazon.aps.iva.nd0.b l4 = com.amazon.aps.iva.nd0.b.l(o.a.z);
        com.amazon.aps.iva.nd0.c cVar6 = o.a.H;
        com.amazon.aps.iva.nd0.c h4 = l4.h();
        com.amazon.aps.iva.nd0.c h5 = l4.h();
        com.amazon.aps.iva.yb0.j.e(h5, "kotlinReadOnly.packageFqName");
        a aVar2 = new a(d(Iterator.class), l4, new com.amazon.aps.iva.nd0.b(h4, com.amazon.aps.iva.nd0.e.a(cVar6, h5), false));
        com.amazon.aps.iva.nd0.b l5 = com.amazon.aps.iva.nd0.b.l(o.a.B);
        com.amazon.aps.iva.nd0.c cVar7 = o.a.J;
        com.amazon.aps.iva.nd0.c h6 = l5.h();
        com.amazon.aps.iva.nd0.c h7 = l5.h();
        com.amazon.aps.iva.yb0.j.e(h7, "kotlinReadOnly.packageFqName");
        a aVar3 = new a(d(Collection.class), l5, new com.amazon.aps.iva.nd0.b(h6, com.amazon.aps.iva.nd0.e.a(cVar7, h7), false));
        com.amazon.aps.iva.nd0.b l6 = com.amazon.aps.iva.nd0.b.l(o.a.C);
        com.amazon.aps.iva.nd0.c cVar8 = o.a.K;
        com.amazon.aps.iva.nd0.c h8 = l6.h();
        com.amazon.aps.iva.nd0.c h9 = l6.h();
        com.amazon.aps.iva.yb0.j.e(h9, "kotlinReadOnly.packageFqName");
        a aVar4 = new a(d(List.class), l6, new com.amazon.aps.iva.nd0.b(h8, com.amazon.aps.iva.nd0.e.a(cVar8, h9), false));
        com.amazon.aps.iva.nd0.b l7 = com.amazon.aps.iva.nd0.b.l(o.a.E);
        com.amazon.aps.iva.nd0.c cVar9 = o.a.M;
        com.amazon.aps.iva.nd0.c h10 = l7.h();
        com.amazon.aps.iva.nd0.c h11 = l7.h();
        com.amazon.aps.iva.yb0.j.e(h11, "kotlinReadOnly.packageFqName");
        a aVar5 = new a(d(Set.class), l7, new com.amazon.aps.iva.nd0.b(h10, com.amazon.aps.iva.nd0.e.a(cVar9, h11), false));
        com.amazon.aps.iva.nd0.b l8 = com.amazon.aps.iva.nd0.b.l(o.a.D);
        com.amazon.aps.iva.nd0.c cVar10 = o.a.L;
        com.amazon.aps.iva.nd0.c h12 = l8.h();
        com.amazon.aps.iva.nd0.c h13 = l8.h();
        com.amazon.aps.iva.yb0.j.e(h13, "kotlinReadOnly.packageFqName");
        a aVar6 = new a(d(ListIterator.class), l8, new com.amazon.aps.iva.nd0.b(h12, com.amazon.aps.iva.nd0.e.a(cVar10, h13), false));
        com.amazon.aps.iva.nd0.c cVar11 = o.a.F;
        com.amazon.aps.iva.nd0.b l9 = com.amazon.aps.iva.nd0.b.l(cVar11);
        com.amazon.aps.iva.nd0.c cVar12 = o.a.N;
        com.amazon.aps.iva.nd0.c h14 = l9.h();
        com.amazon.aps.iva.nd0.c h15 = l9.h();
        com.amazon.aps.iva.yb0.j.e(h15, "kotlinReadOnly.packageFqName");
        a aVar7 = new a(d(Map.class), l9, new com.amazon.aps.iva.nd0.b(h14, com.amazon.aps.iva.nd0.e.a(cVar12, h15), false));
        com.amazon.aps.iva.nd0.b d2 = com.amazon.aps.iva.nd0.b.l(cVar11).d(o.a.G.f());
        com.amazon.aps.iva.nd0.c cVar13 = o.a.O;
        com.amazon.aps.iva.nd0.c h16 = d2.h();
        com.amazon.aps.iva.nd0.c h17 = d2.h();
        com.amazon.aps.iva.yb0.j.e(h17, "kotlinReadOnly.packageFqName");
        List<a> K = f1.K(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a(d(Map.Entry.class), d2, new com.amazon.aps.iva.nd0.b(h16, com.amazon.aps.iva.nd0.e.a(cVar13, h17), false)));
        n = K;
        c(Object.class, o.a.a);
        c(String.class, o.a.f);
        c(CharSequence.class, o.a.e);
        a(d(Throwable.class), com.amazon.aps.iva.nd0.b.l(o.a.k));
        c(Cloneable.class, o.a.c);
        c(Number.class, o.a.i);
        a(d(Comparable.class), com.amazon.aps.iva.nd0.b.l(o.a.l));
        c(Enum.class, o.a.j);
        a(d(Annotation.class), com.amazon.aps.iva.nd0.b.l(o.a.s));
        for (a aVar8 : K) {
            com.amazon.aps.iva.nd0.b bVar = aVar8.a;
            com.amazon.aps.iva.nd0.b bVar2 = aVar8.b;
            a(bVar, bVar2);
            com.amazon.aps.iva.nd0.b bVar3 = aVar8.c;
            com.amazon.aps.iva.nd0.c b3 = bVar3.b();
            com.amazon.aps.iva.yb0.j.e(b3, "mutableClassId.asSingleFqName()");
            b(b3, bVar);
            l.put(bVar3, bVar2);
            m.put(bVar2, bVar3);
            com.amazon.aps.iva.nd0.c b4 = bVar2.b();
            com.amazon.aps.iva.yb0.j.e(b4, "readOnlyClassId.asSingleFqName()");
            com.amazon.aps.iva.nd0.c b5 = bVar3.b();
            com.amazon.aps.iva.yb0.j.e(b5, "mutableClassId.asSingleFqName()");
            com.amazon.aps.iva.nd0.d i2 = bVar3.b().i();
            com.amazon.aps.iva.yb0.j.e(i2, "mutableClassId.asSingleFqName().toUnsafe()");
            j.put(i2, b4);
            com.amazon.aps.iva.nd0.d i3 = b4.i();
            com.amazon.aps.iva.yb0.j.e(i3, "readOnlyFqName.toUnsafe()");
            k.put(i3, b5);
        }
        for (com.amazon.aps.iva.vd0.c cVar14 : com.amazon.aps.iva.vd0.c.values()) {
            com.amazon.aps.iva.nd0.b l10 = com.amazon.aps.iva.nd0.b.l(cVar14.getWrapperFqName());
            com.amazon.aps.iva.lc0.l primitiveType = cVar14.getPrimitiveType();
            com.amazon.aps.iva.yb0.j.e(primitiveType, "jvmType.primitiveType");
            a(l10, com.amazon.aps.iva.nd0.b.l(com.amazon.aps.iva.lc0.o.k.c(primitiveType.getTypeName())));
        }
        for (com.amazon.aps.iva.nd0.b bVar4 : com.amazon.aps.iva.lc0.c.a) {
            a(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.jvm.internal." + bVar4.j().b() + "CompanionObject")), bVar4.d(com.amazon.aps.iva.nd0.h.b));
        }
        for (int i4 = 0; i4 < 23; i4++) {
            a(com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(c0.a("kotlin.jvm.functions.Function", i4))), new com.amazon.aps.iva.nd0.b(com.amazon.aps.iva.lc0.o.k, com.amazon.aps.iva.nd0.f.h("Function" + i4)));
            b(new com.amazon.aps.iva.nd0.c(b + i4), g);
        }
        for (int i5 = 0; i5 < 22; i5++) {
            com.amazon.aps.iva.mc0.c cVar15 = com.amazon.aps.iva.mc0.c.KSuspendFunction;
            b(new com.amazon.aps.iva.nd0.c((cVar15.getPackageFqName().toString() + '.' + cVar15.getClassNamePrefix()) + i5), g);
        }
        com.amazon.aps.iva.nd0.c h18 = o.a.b.h();
        com.amazon.aps.iva.yb0.j.e(h18, "nothing.toSafe()");
        b(h18, d(Void.class));
    }

    public static void a(com.amazon.aps.iva.nd0.b bVar, com.amazon.aps.iva.nd0.b bVar2) {
        com.amazon.aps.iva.nd0.d i2 = bVar.b().i();
        com.amazon.aps.iva.yb0.j.e(i2, "javaClassId.asSingleFqName().toUnsafe()");
        h.put(i2, bVar2);
        com.amazon.aps.iva.nd0.c b2 = bVar2.b();
        com.amazon.aps.iva.yb0.j.e(b2, "kotlinClassId.asSingleFqName()");
        b(b2, bVar);
    }

    public static void b(com.amazon.aps.iva.nd0.c cVar, com.amazon.aps.iva.nd0.b bVar) {
        com.amazon.aps.iva.nd0.d i2 = cVar.i();
        com.amazon.aps.iva.yb0.j.e(i2, "kotlinFqNameUnsafe.toUnsafe()");
        i.put(i2, bVar);
    }

    public static void c(Class cls, com.amazon.aps.iva.nd0.d dVar) {
        com.amazon.aps.iva.nd0.c h2 = dVar.h();
        com.amazon.aps.iva.yb0.j.e(h2, "kotlinFqName.toSafe()");
        a(d(cls), com.amazon.aps.iva.nd0.b.l(h2));
    }

    public static com.amazon.aps.iva.nd0.b d(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(cls.getCanonicalName()));
        }
        return d(declaringClass).d(com.amazon.aps.iva.nd0.f.h(cls.getSimpleName()));
    }

    public static boolean e(com.amazon.aps.iva.nd0.d dVar, String str) {
        boolean z;
        String str2 = dVar.a;
        if (str2 != null) {
            String I0 = com.amazon.aps.iva.oe0.q.I0(str2, str, "");
            if (I0.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || com.amazon.aps.iva.oe0.q.G0(I0, '0')) {
                return false;
            }
            Integer W = com.amazon.aps.iva.oe0.l.W(I0);
            if (W != null && W.intValue() >= 23) {
                return true;
            }
            return false;
        }
        com.amazon.aps.iva.nd0.d.a(4);
        throw null;
    }

    public static com.amazon.aps.iva.nd0.b f(com.amazon.aps.iva.nd0.c cVar) {
        return h.get(cVar.i());
    }

    public static com.amazon.aps.iva.nd0.b g(com.amazon.aps.iva.nd0.d dVar) {
        if (e(dVar, a) || e(dVar, c)) {
            return e;
        }
        if (e(dVar, b) || e(dVar, d)) {
            return g;
        }
        return i.get(dVar);
    }
}
