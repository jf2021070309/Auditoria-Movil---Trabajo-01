package com.amazon.aps.iva.gd0;

import com.amazon.aps.iva.ae0.e0;
import com.amazon.aps.iva.de0.c;
import com.amazon.aps.iva.gd0.d;
import com.amazon.aps.iva.oc0.t0;
import com.amazon.aps.iva.sd0.c0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
/* loaded from: classes4.dex */
public abstract class a<A, C> extends d<A, C0300a<? extends A, ? extends C>> implements com.amazon.aps.iva.ae0.d<A, C> {
    public final com.amazon.aps.iva.de0.g<t, C0300a<A, C>> b;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* renamed from: com.amazon.aps.iva.gd0.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0300a<A, C> extends d.a<A> {
        public final Map<w, List<A>> a;
        public final Map<w, C> b;
        public final Map<w, C> c;

        public C0300a(HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
            this.a = hashMap;
            this.b = hashMap2;
            this.c = hashMap3;
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes4.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<C0300a<? extends A, ? extends C>, w, C> {
        public static final b h = new b();

        public b() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, w wVar) {
            C0300a c0300a = (C0300a) obj;
            w wVar2 = wVar;
            com.amazon.aps.iva.yb0.j.f(c0300a, "$this$loadConstantFromProperty");
            com.amazon.aps.iva.yb0.j.f(wVar2, "it");
            return c0300a.c.get(wVar2);
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    /* loaded from: classes4.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<C0300a<? extends A, ? extends C>, w, C> {
        public static final c h = new c();

        public c() {
            super(2);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(Object obj, w wVar) {
            C0300a c0300a = (C0300a) obj;
            w wVar2 = wVar;
            com.amazon.aps.iva.yb0.j.f(c0300a, "$this$loadConstantFromProperty");
            com.amazon.aps.iva.yb0.j.f(wVar2, "it");
            return c0300a.b.get(wVar2);
        }
    }

    public a(com.amazon.aps.iva.de0.c cVar, com.amazon.aps.iva.tc0.f fVar) {
        super(fVar);
        this.b = cVar.f(new com.amazon.aps.iva.gd0.c(this));
    }

    @Override // com.amazon.aps.iva.ae0.d
    public final C e(e0 e0Var, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ee0.e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        return t(e0Var, mVar, com.amazon.aps.iva.ae0.c.PROPERTY_GETTER, e0Var2, b.h);
    }

    @Override // com.amazon.aps.iva.ae0.d
    public final C k(e0 e0Var, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ee0.e0 e0Var2) {
        com.amazon.aps.iva.yb0.j.f(mVar, "proto");
        return t(e0Var, mVar, com.amazon.aps.iva.ae0.c.PROPERTY, e0Var2, c.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C t(e0 e0Var, com.amazon.aps.iva.id0.m mVar, com.amazon.aps.iva.ae0.c cVar, com.amazon.aps.iva.ee0.e0 e0Var2, com.amazon.aps.iva.xb0.p<? super C0300a<? extends A, ? extends C>, ? super w, ? extends C> pVar) {
        C invoke;
        com.amazon.aps.iva.sd0.r rVar;
        v vVar;
        t o = o(e0Var, true, true, com.amazon.aps.iva.kd0.b.A.c(mVar.e), com.amazon.aps.iva.md0.h.d(mVar));
        if (o == null) {
            if (e0Var instanceof e0.a) {
                t0 t0Var = ((e0.a) e0Var).c;
                if (t0Var instanceof v) {
                    vVar = (v) t0Var;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    o = vVar.b;
                }
            }
            o = null;
        }
        if (o == null) {
            return null;
        }
        com.amazon.aps.iva.md0.e eVar = o.b().b;
        com.amazon.aps.iva.md0.e eVar2 = l.e;
        eVar.getClass();
        com.amazon.aps.iva.yb0.j.f(eVar2, "version");
        w n = d.n(mVar, e0Var.a, e0Var.b, cVar, eVar.a(eVar2.b, eVar2.c, eVar2.d));
        if (n == null || (invoke = pVar.invoke((Object) ((c.k) this.b).invoke(o), n)) == null) {
            return null;
        }
        if (com.amazon.aps.iva.lc0.s.a(e0Var2)) {
            C c2 = (C) ((com.amazon.aps.iva.sd0.g) invoke);
            if (c2 instanceof com.amazon.aps.iva.sd0.d) {
                rVar = new com.amazon.aps.iva.sd0.z(((Number) ((com.amazon.aps.iva.sd0.d) c2).a).byteValue());
            } else if (c2 instanceof com.amazon.aps.iva.sd0.w) {
                rVar = new c0(((Number) ((com.amazon.aps.iva.sd0.w) c2).a).shortValue());
            } else if (c2 instanceof com.amazon.aps.iva.sd0.m) {
                rVar = new com.amazon.aps.iva.sd0.a0(((Number) ((com.amazon.aps.iva.sd0.m) c2).a).intValue());
            } else if (c2 instanceof com.amazon.aps.iva.sd0.u) {
                rVar = new com.amazon.aps.iva.sd0.b0(((Number) ((com.amazon.aps.iva.sd0.u) c2).a).longValue());
            } else {
                return c2;
            }
            return rVar;
        }
        return invoke;
    }
}
