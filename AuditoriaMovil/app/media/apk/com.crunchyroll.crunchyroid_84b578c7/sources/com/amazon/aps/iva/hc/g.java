package com.amazon.aps.iva.hc;

import android.graphics.drawable.Drawable;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.hc.a;
import com.amazon.aps.iva.hc.l;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
/* compiled from: GlideModifier.kt */
@com.amazon.aps.iva.qb0.e(c = "com.bumptech.glide.integration.compose.GlideNode$launchRequest$1$1", f = "GlideModifier.kt", l = {367}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class g extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ e j;
    public final /* synthetic */ com.amazon.aps.iva.ec.f<Drawable> k;

    /* compiled from: GlideModifier.kt */
    /* loaded from: classes.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.ic.d<Drawable>> {
        public final /* synthetic */ e b;
        public final /* synthetic */ g0 c;
        public final /* synthetic */ com.amazon.aps.iva.ec.f<Drawable> d;

        /* compiled from: GlideModifier.kt */
        /* renamed from: com.amazon.aps.iva.hc.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0332a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[com.amazon.aps.iva.ic.i.values().length];
                iArr[com.amazon.aps.iva.ic.i.RUNNING.ordinal()] = 1;
                iArr[com.amazon.aps.iva.ic.i.CLEARED.ordinal()] = 2;
                iArr[com.amazon.aps.iva.ic.i.FAILED.ordinal()] = 3;
                iArr[com.amazon.aps.iva.ic.i.SUCCEEDED.ordinal()] = 4;
                a = iArr;
            }
        }

        public a(e eVar, g0 g0Var, com.amazon.aps.iva.ec.f<Drawable> fVar) {
            this.b = eVar;
            this.c = g0Var;
            this.d = fVar;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.ic.d<Drawable> dVar, com.amazon.aps.iva.ob0.d dVar2) {
            Object obj;
            com.amazon.aps.iva.i1.c cVar;
            com.amazon.aps.iva.kb0.j jVar;
            com.amazon.aps.iva.ic.d<Drawable> dVar3 = dVar;
            boolean z = dVar3 instanceof com.amazon.aps.iva.ic.g;
            e eVar = this.b;
            if (z) {
                com.amazon.aps.iva.ic.g gVar = (com.amazon.aps.iva.ic.g) dVar3;
                eVar.getClass();
                if (gVar.d != com.amazon.aps.iva.kc.a.MEMORY_CACHE && eVar.A && !com.amazon.aps.iva.yb0.j.a(eVar.u, a.C0329a.a)) {
                    eVar.A = false;
                    eVar.u.build();
                    eVar.F = com.amazon.aps.iva.hc.a.a;
                    com.amazon.aps.iva.se0.i.d(this.c, null, null, new i(eVar, null), 3);
                } else {
                    eVar.A = false;
                    eVar.F = com.amazon.aps.iva.hc.a.a;
                }
                jVar = new com.amazon.aps.iva.kb0.j(new l.c(gVar.d), gVar.b);
            } else if (dVar3 instanceof com.amazon.aps.iva.ic.f) {
                Drawable drawable = ((com.amazon.aps.iva.ic.f) dVar3).b;
                int i = C0332a.a[dVar3.a().ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new com.amazon.aps.iva.kb0.h();
                        }
                        throw new IllegalStateException();
                    }
                    obj = l.a.a;
                } else {
                    obj = l.b.a;
                }
                if (drawable != null) {
                    cVar = com.amazon.aps.iva.cq.b.q0(drawable);
                } else {
                    cVar = null;
                }
                eVar.z = cVar;
                eVar.B = null;
                jVar = new com.amazon.aps.iva.kb0.j(obj, drawable);
            } else {
                throw new com.amazon.aps.iva.kb0.h();
            }
            l lVar = (l) jVar.b;
            eVar.x1((Drawable) jVar.c);
            eVar.getClass();
            if (eVar.D) {
                com.amazon.aps.iva.u1.p.a(eVar);
            } else {
                w.F(eVar);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, com.amazon.aps.iva.ec.f<Drawable> fVar, com.amazon.aps.iva.ob0.d<? super g> dVar) {
        super(2, dVar);
        this.j = eVar;
        this.k = fVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        g gVar = new g(this.j, this.k, dVar);
        gVar.i = obj;
        return gVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        return ((g) create(g0Var, dVar)).invokeSuspend(q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i == 1) {
                x.i0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            x.i0(obj);
            g0 g0Var = (g0) this.i;
            e eVar = this.j;
            eVar.z = null;
            eVar.B = null;
            com.amazon.aps.iva.ab.a aVar2 = eVar.r;
            if (aVar2 != null) {
                com.amazon.aps.iva.ec.f<Drawable> fVar = this.k;
                com.amazon.aps.iva.yb0.j.f(fVar, "<this>");
                com.amazon.aps.iva.ve0.b bVar = new com.amazon.aps.iva.ve0.b(new com.amazon.aps.iva.ic.c(aVar2, fVar, fVar.C, null), com.amazon.aps.iva.ob0.h.b, -2, com.amazon.aps.iva.ue0.e.SUSPEND);
                a aVar3 = new a(eVar, g0Var, fVar);
                this.h = 1;
                if (bVar.c(aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("resolvableGlideSize");
                throw null;
            }
        }
        return q.a;
    }
}
