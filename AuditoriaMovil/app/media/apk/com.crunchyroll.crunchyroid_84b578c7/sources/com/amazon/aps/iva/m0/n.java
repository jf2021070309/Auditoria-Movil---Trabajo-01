package com.amazon.aps.iva.m0;

import java.util.Iterator;
import java.util.Map;
/* compiled from: AnchoredDraggable.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", l = {441}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ k<Object> j;
    public final /* synthetic */ com.amazon.aps.iva.a0.g1 k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.q<f, Map<Object, Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> l;

    /* compiled from: AnchoredDraggable.kt */
    @com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", l = {443}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
        public int h;
        public final /* synthetic */ Object i;
        public final /* synthetic */ k<Object> j;
        public final /* synthetic */ com.amazon.aps.iva.xb0.q<f, Map<Object, Float>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, k<Object> kVar, com.amazon.aps.iva.xb0.q<? super f, ? super Map<Object, Float>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(1, dVar);
            this.i = obj;
            this.j = kVar;
            this.k = qVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final Object invoke(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
            return ((a) create(dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                k<Object> kVar = this.j;
                Object obj2 = this.i;
                if (obj2 != null) {
                    kVar.n.setValue(obj2);
                }
                l lVar = kVar.p;
                Map<Object, Float> b = kVar.b();
                this.h = 1;
                if (this.k.invoke(lVar, b, this) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public n(Object obj, k<Object> kVar, com.amazon.aps.iva.a0.g1 g1Var, com.amazon.aps.iva.xb0.q<? super f, ? super Map<Object, Float>, ? super com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, ? extends Object> qVar, com.amazon.aps.iva.ob0.d<? super n> dVar) {
        super(2, dVar);
        this.i = obj;
        this.j = kVar;
        this.k = g1Var;
        this.l = qVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new n(this.i, this.j, this.k, this.l, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((n) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        Object obj3;
        boolean z2;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        Object obj4 = this.i;
        Object obj5 = null;
        k<Object> kVar = this.j;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                if (obj4 != null && !kVar.b().containsKey(obj4)) {
                    if (kVar.d.invoke(obj4).booleanValue()) {
                        kVar.g.setValue(obj4);
                    }
                    return com.amazon.aps.iva.kb0.q.a;
                }
                x0 x0Var = kVar.e;
                com.amazon.aps.iva.a0.g1 g1Var = this.k;
                a aVar2 = new a(obj4, kVar, this.l, null);
                this.h = 1;
                x0Var.getClass();
                if (com.amazon.aps.iva.e.z.p(new y0(g1Var, x0Var, aVar2, null), this) == aVar) {
                    return aVar;
                }
            }
            if (obj4 != null) {
                kVar.n.setValue(null);
            }
            Iterator<T> it = kVar.b().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (Math.abs(((Number) ((Map.Entry) obj3).getValue()).floatValue() - kVar.d()) < 0.5f) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj3;
            if (entry != null) {
                obj5 = entry.getKey();
            }
            if (obj5 != null && kVar.d.invoke(obj5).booleanValue()) {
                kVar.g.setValue(obj5);
            }
            return com.amazon.aps.iva.kb0.q.a;
        } catch (Throwable th) {
            if (obj4 != null) {
                kVar.n.setValue(null);
            }
            Iterator<T> it2 = kVar.b().entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Math.abs(((Number) ((Map.Entry) obj2).getValue()).floatValue() - kVar.d()) < 0.5f) {
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
                    obj2 = null;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            if (entry2 != null) {
                obj5 = entry2.getKey();
            }
            if (obj5 != null && kVar.d.invoke(obj5).booleanValue()) {
                kVar.g.setValue(obj5);
            }
            throw th;
        }
    }
}
