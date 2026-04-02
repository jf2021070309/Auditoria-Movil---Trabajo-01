package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.hd0.a;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.pc0.h;
import com.amazon.aps.iva.rc0.i0;
import com.amazon.aps.iva.yb0.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes4.dex */
public final class m extends i0 {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] o = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(m.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(m.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    public final com.amazon.aps.iva.ed0.t h;
    public final com.amazon.aps.iva.la0.c i;
    public final com.amazon.aps.iva.md0.e j;
    public final com.amazon.aps.iva.de0.i k;
    public final com.amazon.aps.iva.bd0.c l;
    public final com.amazon.aps.iva.de0.i<List<com.amazon.aps.iva.nd0.c>> m;
    public final com.amazon.aps.iva.pc0.h n;

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<String, ? extends com.amazon.aps.iva.gd0.t>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Map<String, ? extends com.amazon.aps.iva.gd0.t> invoke() {
            com.amazon.aps.iva.kb0.j jVar;
            m mVar = m.this;
            ((com.amazon.aps.iva.ad0.c) mVar.i.a).l.a(mVar.f.b());
            ArrayList arrayList = new ArrayList();
            com.amazon.aps.iva.lb0.y yVar = com.amazon.aps.iva.lb0.y.b;
            while (yVar.hasNext()) {
                String str = (String) yVar.next();
                com.amazon.aps.iva.gd0.t a = com.amazon.aps.iva.gd0.s.a(((com.amazon.aps.iva.ad0.c) mVar.i.a).c, com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c(com.amazon.aps.iva.vd0.b.d(str).a.replace('/', '.'))), mVar.j);
                if (a != null) {
                    jVar = new com.amazon.aps.iva.kb0.j(str, a);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return com.amazon.aps.iva.lb0.i0.Z(arrayList);
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<HashMap<com.amazon.aps.iva.vd0.b, com.amazon.aps.iva.vd0.b>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[a.EnumC0334a.values().length];
                try {
                    iArr[a.EnumC0334a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.EnumC0334a.FILE_FACADE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final HashMap<com.amazon.aps.iva.vd0.b, com.amazon.aps.iva.vd0.b> invoke() {
            String str;
            HashMap<com.amazon.aps.iva.vd0.b, com.amazon.aps.iva.vd0.b> hashMap = new HashMap<>();
            m mVar = m.this;
            mVar.getClass();
            for (Map.Entry entry : ((Map) com.amazon.aps.iva.ab.x.T(mVar.k, m.o[0])).entrySet()) {
                com.amazon.aps.iva.vd0.b d = com.amazon.aps.iva.vd0.b.d((String) entry.getKey());
                com.amazon.aps.iva.hd0.a b = ((com.amazon.aps.iva.gd0.t) entry.getValue()).b();
                int i = a.a[b.a.ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i == 2) {
                        hashMap.put(d, d);
                    }
                } else {
                    if (b.a != a.EnumC0334a.MULTIFILE_CLASS_PART) {
                        z = false;
                    }
                    if (z) {
                        str = b.f;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        hashMap.put(d, com.amazon.aps.iva.vd0.b.d(str));
                    }
                }
            }
            return hashMap;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<List<? extends com.amazon.aps.iva.nd0.c>> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final List<? extends com.amazon.aps.iva.nd0.c> invoke() {
            m.this.h.t();
            com.amazon.aps.iva.lb0.z<com.amazon.aps.iva.ed0.t> zVar = com.amazon.aps.iva.lb0.z.b;
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(zVar));
            for (com.amazon.aps.iva.ed0.t tVar : zVar) {
                arrayList.add(tVar.c());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.t tVar) {
        super(cVar.a(), tVar.c());
        com.amazon.aps.iva.pc0.h E;
        com.amazon.aps.iva.yb0.j.f(cVar, "outerContext");
        com.amazon.aps.iva.yb0.j.f(tVar, "jPackage");
        this.h = tVar;
        com.amazon.aps.iva.la0.c a2 = com.amazon.aps.iva.ad0.b.a(cVar, this, null, 6);
        this.i = a2;
        this.j = com.amazon.aps.iva.aq.j.E(((com.amazon.aps.iva.ad0.c) cVar.a).d.c().c);
        this.k = a2.b().g(new a());
        this.l = new com.amazon.aps.iva.bd0.c(a2, tVar, this);
        this.m = a2.b().c(new c());
        if (((com.amazon.aps.iva.ad0.c) a2.a).v.c) {
            E = h.a.a;
        } else {
            E = l1.E(a2, tVar);
        }
        this.n = E;
        a2.b().g(new b());
    }

    @Override // com.amazon.aps.iva.rc0.i0, com.amazon.aps.iva.rc0.q, com.amazon.aps.iva.oc0.n
    public final t0 g() {
        return new com.amazon.aps.iva.gd0.u(this);
    }

    @Override // com.amazon.aps.iva.pc0.b, com.amazon.aps.iva.pc0.a
    public final com.amazon.aps.iva.pc0.h getAnnotations() {
        return this.n;
    }

    @Override // com.amazon.aps.iva.oc0.f0
    public final com.amazon.aps.iva.xd0.i l() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.rc0.i0, com.amazon.aps.iva.rc0.p
    public final String toString() {
        return "Lazy Java package fragment: " + this.f + " of module " + ((com.amazon.aps.iva.ad0.c) this.i.a).o;
    }
}
