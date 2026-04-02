package com.amazon.aps.iva.bd0;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.m0;
import com.amazon.aps.iva.ee0.r1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.lb0.i0;
import com.amazon.aps.iva.lc0.o;
import com.amazon.aps.iva.oc0.c1;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.oc0.y0;
import com.amazon.aps.iva.sd0.t;
import com.amazon.aps.iva.xc0.d0;
import com.amazon.aps.iva.yb0.e0;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: LazyJavaAnnotationDescriptor.kt */
/* loaded from: classes4.dex */
public final class d implements com.amazon.aps.iva.pc0.c, com.amazon.aps.iva.zc0.g {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] i = {e0.c(new com.amazon.aps.iva.yb0.v(e0.a(d.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(d.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), e0.c(new com.amazon.aps.iva.yb0.v(e0.a(d.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final com.amazon.aps.iva.la0.c a;
    public final com.amazon.aps.iva.ed0.a b;
    public final com.amazon.aps.iva.de0.j c;
    public final com.amazon.aps.iva.de0.i d;
    public final com.amazon.aps.iva.dd0.a e;
    public final com.amazon.aps.iva.de0.i f;
    public final boolean g;
    public final boolean h;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<?>>> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Map<com.amazon.aps.iva.nd0.f, ? extends com.amazon.aps.iva.sd0.g<?>> invoke() {
            com.amazon.aps.iva.kb0.j jVar;
            d dVar = d.this;
            ArrayList<com.amazon.aps.iva.ed0.b> d = dVar.b.d();
            ArrayList arrayList = new ArrayList();
            for (com.amazon.aps.iva.ed0.b bVar : d) {
                com.amazon.aps.iva.nd0.f name = bVar.getName();
                if (name == null) {
                    name = d0.b;
                }
                com.amazon.aps.iva.sd0.g<?> b = dVar.b(bVar);
                if (b != null) {
                    jVar = new com.amazon.aps.iva.kb0.j(name, b);
                } else {
                    jVar = null;
                }
                if (jVar != null) {
                    arrayList.add(jVar);
                }
            }
            return i0.Z(arrayList);
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.nd0.c> {
        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.nd0.c invoke() {
            com.amazon.aps.iva.nd0.b i = d.this.b.i();
            if (i != null) {
                return i.b();
            }
            return null;
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<m0> {
        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final m0 invoke() {
            com.amazon.aps.iva.oc0.e eVar;
            d dVar = d.this;
            com.amazon.aps.iva.nd0.c c = dVar.c();
            com.amazon.aps.iva.ed0.a aVar = dVar.b;
            if (c == null) {
                return com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, aVar.toString());
            }
            com.amazon.aps.iva.b50.w wVar = com.amazon.aps.iva.b50.w.e;
            com.amazon.aps.iva.la0.c cVar = dVar.a;
            com.amazon.aps.iva.oc0.e p = com.amazon.aps.iva.b50.w.p(wVar, c, cVar.a().j());
            if (p == null) {
                com.amazon.aps.iva.uc0.r v = aVar.v();
                Object obj = cVar.a;
                if (v != null) {
                    eVar = ((com.amazon.aps.iva.ad0.c) obj).k.a(v);
                } else {
                    eVar = null;
                }
                if (eVar == null) {
                    p = com.amazon.aps.iva.oc0.u.c(cVar.a(), com.amazon.aps.iva.nd0.b.l(c), ((com.amazon.aps.iva.ad0.c) obj).d.c().l);
                } else {
                    p = eVar;
                }
            }
            return p.m();
        }
    }

    public d(com.amazon.aps.iva.la0.c cVar, com.amazon.aps.iva.ed0.a aVar, boolean z) {
        com.amazon.aps.iva.yb0.j.f(cVar, "c");
        com.amazon.aps.iva.yb0.j.f(aVar, "javaAnnotation");
        this.a = cVar;
        this.b = aVar;
        this.c = cVar.b().b(new b());
        this.d = cVar.b().g(new c());
        this.e = ((com.amazon.aps.iva.ad0.c) cVar.a).j.a(aVar);
        this.f = cVar.b().g(new a());
        aVar.j();
        this.g = false;
        aVar.G();
        this.h = z;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final Map<com.amazon.aps.iva.nd0.f, com.amazon.aps.iva.sd0.g<?>> a() {
        return (Map) com.amazon.aps.iva.ab.x.T(this.f, i[2]);
    }

    public final com.amazon.aps.iva.sd0.g<?> b(com.amazon.aps.iva.ed0.b bVar) {
        com.amazon.aps.iva.sd0.g<?> tVar;
        com.amazon.aps.iva.ee0.e0 h;
        if (bVar instanceof com.amazon.aps.iva.ed0.o) {
            return com.amazon.aps.iva.sd0.h.b(((com.amazon.aps.iva.ed0.o) bVar).getValue(), null);
        }
        if (bVar instanceof com.amazon.aps.iva.ed0.m) {
            com.amazon.aps.iva.ed0.m mVar = (com.amazon.aps.iva.ed0.m) bVar;
            com.amazon.aps.iva.nd0.b d = mVar.d();
            com.amazon.aps.iva.nd0.f e = mVar.e();
            if (d == null || e == null) {
                return null;
            }
            return new com.amazon.aps.iva.sd0.j(d, e);
        }
        boolean z = bVar instanceof com.amazon.aps.iva.ed0.e;
        com.amazon.aps.iva.la0.c cVar = this.a;
        if (z) {
            com.amazon.aps.iva.ed0.e eVar = (com.amazon.aps.iva.ed0.e) bVar;
            com.amazon.aps.iva.nd0.f name = eVar.getName();
            if (name == null) {
                name = d0.b;
            }
            com.amazon.aps.iva.yb0.j.e(name, "argument.name ?: DEFAULT_ANNOTATION_MEMBER_NAME");
            ArrayList<com.amazon.aps.iva.ed0.b> c2 = eVar.c();
            m0 m0Var = (m0) com.amazon.aps.iva.ab.x.T(this.d, i[1]);
            com.amazon.aps.iva.yb0.j.e(m0Var, "type");
            if (l1.D(m0Var)) {
                return null;
            }
            com.amazon.aps.iva.oc0.e d2 = com.amazon.aps.iva.ud0.b.d(this);
            com.amazon.aps.iva.yb0.j.c(d2);
            c1 j = com.amazon.aps.iva.hc.m.j(name, d2);
            if (j == null || (h = j.getType()) == null) {
                h = ((com.amazon.aps.iva.ad0.c) cVar.a).o.j().h(com.amazon.aps.iva.ge0.k.c(com.amazon.aps.iva.ge0.j.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]), v1.INVARIANT);
            }
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(c2));
            for (com.amazon.aps.iva.ed0.b bVar2 : c2) {
                com.amazon.aps.iva.sd0.g<?> b2 = b(bVar2);
                if (b2 == null) {
                    b2 = new com.amazon.aps.iva.sd0.v();
                }
                arrayList.add(b2);
            }
            tVar = new com.amazon.aps.iva.sd0.y(arrayList, h);
        } else if (bVar instanceof com.amazon.aps.iva.ed0.c) {
            return new com.amazon.aps.iva.sd0.a(new d(cVar, ((com.amazon.aps.iva.ed0.c) bVar).a(), false));
        } else {
            if (!(bVar instanceof com.amazon.aps.iva.ed0.h)) {
                return null;
            }
            com.amazon.aps.iva.ee0.e0 d3 = ((com.amazon.aps.iva.cd0.d) cVar.e).d(((com.amazon.aps.iva.ed0.h) bVar).b(), com.amazon.aps.iva.a60.b.w(r1.COMMON, false, false, null, 7));
            if (l1.D(d3)) {
                return null;
            }
            com.amazon.aps.iva.ee0.e0 e0Var = d3;
            int i2 = 0;
            while (com.amazon.aps.iva.lc0.k.z(e0Var)) {
                e0Var = ((j1) com.amazon.aps.iva.lb0.x.P0(e0Var.G0())).getType();
                com.amazon.aps.iva.yb0.j.e(e0Var, "type.arguments.single().type");
                i2++;
            }
            com.amazon.aps.iva.oc0.h k = e0Var.I0().k();
            if (k instanceof com.amazon.aps.iva.oc0.e) {
                com.amazon.aps.iva.nd0.b f = com.amazon.aps.iva.ud0.b.f(k);
                if (f == null) {
                    return new com.amazon.aps.iva.sd0.t(new t.a.C0704a(d3));
                }
                tVar = new com.amazon.aps.iva.sd0.t(f, i2);
            } else if (!(k instanceof y0)) {
                return null;
            } else {
                tVar = new com.amazon.aps.iva.sd0.t(com.amazon.aps.iva.nd0.b.l(o.a.a.h()), 0);
            }
        }
        return tVar;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.nd0.c c() {
        com.amazon.aps.iva.fc0.l<Object> lVar = i[0];
        com.amazon.aps.iva.de0.j jVar = this.c;
        com.amazon.aps.iva.yb0.j.f(jVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(lVar, "p");
        return (com.amazon.aps.iva.nd0.c) jVar.invoke();
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final t0 g() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.pc0.c
    public final com.amazon.aps.iva.ee0.e0 getType() {
        return (m0) com.amazon.aps.iva.ab.x.T(this.d, i[1]);
    }

    @Override // com.amazon.aps.iva.zc0.g
    public final boolean j() {
        return this.g;
    }

    public final String toString() {
        return com.amazon.aps.iva.pd0.c.a.p(this, null);
    }
}
