package com.amazon.aps.iva.el;

import com.amazon.aps.iva.kj.a;
import com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout;
/* compiled from: InternalPlayerViewLayout.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.player.presentation.playerview.InternalPlayerViewLayout$8", f = "InternalPlayerViewLayout.kt", l = {196}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.se0.g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ InternalPlayerViewLayout i;

    /* compiled from: InternalPlayerViewLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a implements com.amazon.aps.iva.ve0.g<com.amazon.aps.iva.kj.a> {
        public final /* synthetic */ InternalPlayerViewLayout b;

        public a(InternalPlayerViewLayout internalPlayerViewLayout) {
            this.b = internalPlayerViewLayout;
        }

        @Override // com.amazon.aps.iva.ve0.g
        public final Object a(com.amazon.aps.iva.kj.a aVar, com.amazon.aps.iva.ob0.d dVar) {
            com.amazon.aps.iva.kj.a aVar2 = aVar;
            boolean z = aVar2 instanceof a.C0445a;
            InternalPlayerViewLayout internalPlayerViewLayout = this.b;
            if (z) {
                internalPlayerViewLayout.L.q6(new Integer(1), r.h);
            } else if (aVar2 instanceof a.b) {
                internalPlayerViewLayout.I.getView().closeScreen();
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InternalPlayerViewLayout internalPlayerViewLayout, com.amazon.aps.iva.ob0.d<? super s> dVar) {
        super(2, dVar);
        this.i = internalPlayerViewLayout;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new s(this.i, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.se0.g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((s) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
            com.amazon.aps.iva.cj.h hVar = com.amazon.aps.iva.cj.n.e;
            if (hVar != null) {
                com.amazon.aps.iva.ve0.l0 l0Var = hVar.V().f;
                a aVar2 = new a(this.i);
                this.h = 1;
                l0Var.getClass();
                if (com.amazon.aps.iva.ve0.l0.l(l0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("player");
                throw null;
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
