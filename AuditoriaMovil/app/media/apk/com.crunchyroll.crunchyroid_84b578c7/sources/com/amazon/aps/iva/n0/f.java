package com.amazon.aps.iva.n0;

import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.p3;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.ve0.l0;
import com.amazon.aps.iva.z.k1;
import com.amazon.aps.iva.z.y;
import java.util.ArrayList;
/* compiled from: Ripple.kt */
@com.amazon.aps.iva.qb0.e(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class f extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.c0.k j;
    public final /* synthetic */ p k;

    /* compiled from: Ripple.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.c0.j> {
        public final /* synthetic */ p b;
        public final /* synthetic */ g0 c;

        public a(p pVar, g0 g0Var) {
            this.b = pVar;
            this.c = g0Var;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.c0.j jVar, com.amazon.aps.iva.ob0.d dVar) {
            k1<Float> k1Var;
            float f;
            k1<Float> k1Var2;
            com.amazon.aps.iva.c0.j jVar2 = jVar;
            boolean z = jVar2 instanceof com.amazon.aps.iva.c0.o;
            g0 g0Var = this.c;
            p pVar = this.b;
            if (z) {
                pVar.b((com.amazon.aps.iva.c0.o) jVar2, g0Var);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.p) {
                pVar.d(((com.amazon.aps.iva.c0.p) jVar2).a);
            } else if (jVar2 instanceof com.amazon.aps.iva.c0.n) {
                pVar.d(((com.amazon.aps.iva.c0.n) jVar2).a);
            } else {
                pVar.getClass();
                com.amazon.aps.iva.yb0.j.f(jVar2, "interaction");
                com.amazon.aps.iva.yb0.j.f(g0Var, "scope");
                v vVar = pVar.b;
                vVar.getClass();
                boolean z2 = jVar2 instanceof com.amazon.aps.iva.c0.g;
                ArrayList arrayList = vVar.d;
                if (z2) {
                    arrayList.add(jVar2);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.h) {
                    arrayList.remove(((com.amazon.aps.iva.c0.h) jVar2).a);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.d) {
                    arrayList.add(jVar2);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.e) {
                    arrayList.remove(((com.amazon.aps.iva.c0.e) jVar2).a);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.b) {
                    arrayList.add(jVar2);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.c) {
                    arrayList.remove(((com.amazon.aps.iva.c0.c) jVar2).a);
                } else if (jVar2 instanceof com.amazon.aps.iva.c0.a) {
                    arrayList.remove(((com.amazon.aps.iva.c0.a) jVar2).a);
                }
                com.amazon.aps.iva.c0.j jVar3 = (com.amazon.aps.iva.c0.j) x.E0(arrayList);
                if (!com.amazon.aps.iva.yb0.j.a(vVar.e, jVar3)) {
                    if (jVar3 != null) {
                        p3<h> p3Var = vVar.b;
                        if (z2) {
                            f = p3Var.getValue().c;
                        } else if (jVar2 instanceof com.amazon.aps.iva.c0.d) {
                            f = p3Var.getValue().b;
                        } else if (jVar2 instanceof com.amazon.aps.iva.c0.b) {
                            f = p3Var.getValue().a;
                        } else {
                            f = 0.0f;
                        }
                        k1<Float> k1Var3 = q.a;
                        if (!(jVar3 instanceof com.amazon.aps.iva.c0.g)) {
                            if (jVar3 instanceof com.amazon.aps.iva.c0.d) {
                                k1Var2 = new k1<>(45, y.b, 2);
                            } else if (jVar3 instanceof com.amazon.aps.iva.c0.b) {
                                k1Var2 = new k1<>(45, y.b, 2);
                            }
                            com.amazon.aps.iva.se0.i.d(g0Var, null, null, new t(vVar, f, k1Var2, null), 3);
                        }
                        k1Var2 = q.a;
                        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new t(vVar, f, k1Var2, null), 3);
                    } else {
                        com.amazon.aps.iva.c0.j jVar4 = vVar.e;
                        k1<Float> k1Var4 = q.a;
                        if (!(jVar4 instanceof com.amazon.aps.iva.c0.g) && !(jVar4 instanceof com.amazon.aps.iva.c0.d) && (jVar4 instanceof com.amazon.aps.iva.c0.b)) {
                            k1Var = new k1<>(150, y.b, 2);
                        } else {
                            k1Var = q.a;
                        }
                        com.amazon.aps.iva.se0.i.d(g0Var, null, null, new u(vVar, k1Var, null), 3);
                    }
                    vVar.e = jVar3;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.amazon.aps.iva.c0.k kVar, p pVar, com.amazon.aps.iva.ob0.d<? super f> dVar) {
        super(2, dVar);
        this.j = kVar;
        this.k = pVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        f fVar = new f(this.j, this.k, dVar);
        fVar.i = obj;
        return fVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((f) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            l0 c = this.j.c();
            a aVar2 = new a(this.k, (g0) this.i);
            this.h = 1;
            c.getClass();
            if (l0.l(c, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
