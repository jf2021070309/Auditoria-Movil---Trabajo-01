package com.amazon.aps.iva.m0;

import com.amazon.aps.iva.m0.f2;
import java.util.Map;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: AnchoredDraggable.kt */
/* loaded from: classes.dex */
public final class k<T> {
    public final com.amazon.aps.iva.xb0.l<Float, Float> a;
    public final com.amazon.aps.iva.xb0.a<Float> b;
    public final com.amazon.aps.iva.z.j<Float> c;
    public final com.amazon.aps.iva.xb0.l<T, Boolean> d;
    public final x0 e;
    public final p f;
    public final com.amazon.aps.iva.o0.y1 g;
    public final com.amazon.aps.iva.o0.q0 h;
    public final com.amazon.aps.iva.o0.q0 i;
    public final com.amazon.aps.iva.o0.y1 j;
    public final com.amazon.aps.iva.o0.v1 k;
    public final com.amazon.aps.iva.o0.q0 l;
    public final com.amazon.aps.iva.o0.q0 m;
    public final com.amazon.aps.iva.o0.y1 n;
    public final com.amazon.aps.iva.o0.y1 o;
    public final l p;

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(Object obj, Map map, com.amazon.aps.iva.mb0.b bVar);
    }

    /* compiled from: AnchoredDraggable.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ k<T> h;
        public final /* synthetic */ T i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k<T> kVar, T t) {
            super(0);
            this.h = kVar;
            this.i = t;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            k<T> kVar = this.h;
            l lVar = kVar.p;
            Map<T, Float> b = kVar.b();
            T t = this.i;
            Float f = b.get(t);
            if (f != null) {
                lVar.a(f.floatValue(), 0.0f);
                kVar.n.setValue(null);
            }
            kVar.g.setValue(t);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public k(Object obj, f2.a aVar, f2.b bVar, com.amazon.aps.iva.z.j jVar, com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(jVar, "animationSpec");
        com.amazon.aps.iva.yb0.j.f(lVar, "confirmValueChange");
        this.a = aVar;
        this.b = bVar;
        this.c = jVar;
        this.d = lVar;
        this.e = new x0();
        this.f = new p(this);
        this.g = com.amazon.aps.iva.cq.b.c0(obj);
        this.h = com.amazon.aps.iva.cq.b.M(new t(this));
        this.i = com.amazon.aps.iva.cq.b.M(new m(this));
        this.j = com.amazon.aps.iva.cq.b.c0(Float.valueOf(Float.NaN));
        com.amazon.aps.iva.cq.b.L(com.amazon.aps.iva.o0.s3.a, new s(this));
        this.k = com.amazon.aps.iva.e.z.I(0.0f);
        this.l = com.amazon.aps.iva.cq.b.M(new r(this));
        this.m = com.amazon.aps.iva.cq.b.M(new q(this));
        this.n = com.amazon.aps.iva.cq.b.c0(null);
        this.o = com.amazon.aps.iva.cq.b.c0(com.amazon.aps.iva.lb0.a0.b);
        this.p = new l(this);
    }

    public final Object a(float f, float f2, Object obj) {
        boolean z;
        Object a2;
        Map<T, Float> b2 = b();
        Float f3 = b2.get(obj);
        float floatValue = this.b.invoke().floatValue();
        if (f3 != null && f3.floatValue() == f) {
            z = true;
        } else {
            z = false;
        }
        if (!z && f3 != null) {
            int i = (f3.floatValue() > f ? 1 : (f3.floatValue() == f ? 0 : -1));
            com.amazon.aps.iva.xb0.l<Float, Float> lVar = this.a;
            if (i < 0) {
                if (f2 >= floatValue) {
                    return j.a(b2, f, true);
                }
                a2 = j.a(b2, f, true);
                if (f < Math.abs(f3.floatValue() + Math.abs(lVar.invoke(Float.valueOf(Math.abs(((Number) com.amazon.aps.iva.lb0.i0.S(a2, b2)).floatValue() - f3.floatValue()))).floatValue()))) {
                    return obj;
                }
            } else if (f2 <= (-floatValue)) {
                return j.a(b2, f, false);
            } else {
                a2 = j.a(b2, f, false);
                float abs = Math.abs(f3.floatValue() - Math.abs(lVar.invoke(Float.valueOf(Math.abs(f3.floatValue() - ((Number) com.amazon.aps.iva.lb0.i0.S(a2, b2)).floatValue()))).floatValue()));
                if (f < 0.0f) {
                    if (Math.abs(f) < abs) {
                        return obj;
                    }
                } else if (f > abs) {
                    return obj;
                }
            }
            return a2;
        }
        return obj;
    }

    public final Map<T, Float> b() {
        return (Map) this.o.getValue();
    }

    public final T c() {
        return this.g.getValue();
    }

    public final float d() {
        return ((Number) this.j.getValue()).floatValue();
    }

    public final float e(float f) {
        float d;
        if (Float.isNaN(d())) {
            d = 0.0f;
        } else {
            d = d();
        }
        return com.amazon.aps.iva.aq.j.i(d + f, ((Number) this.l.getValue()).floatValue(), ((Number) this.m.getValue()).floatValue());
    }

    public final float f() {
        if (!Float.isNaN(d())) {
            return d();
        }
        throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object g(float f, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        T c = c();
        Object a2 = a(f(), f, c);
        if (((Boolean) this.d.invoke(a2)).booleanValue()) {
            Object b2 = j.b(f, this, a2, dVar);
            if (b2 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
                return b2;
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
        Object b3 = j.b(f, this, c, dVar);
        if (b3 == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return b3;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    public final boolean h(T t) {
        b bVar = new b(this, t);
        x0 x0Var = this.e;
        x0Var.getClass();
        com.amazon.aps.iva.ze0.d dVar = x0Var.b;
        boolean b2 = dVar.b(null);
        if (b2) {
            try {
                bVar.invoke();
            } finally {
                dVar.d(null);
            }
        }
        return b2;
    }
}
