package com.amazon.aps.iva.vx;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.lb0.e0;
import com.amazon.aps.iva.se0.g0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: HomeFeedViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$updateUserItem$1", f = "HomeFeedViewModel.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public final /* synthetic */ a0 i;
    public final /* synthetic */ com.amazon.aps.iva.xx.g j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(a0 a0Var, com.amazon.aps.iva.xx.g gVar, com.amazon.aps.iva.ob0.d<? super c0> dVar) {
        super(2, dVar);
        this.i = a0Var;
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        return new c0(this.i, this.j, dVar);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> d;
        g.c<List<com.amazon.aps.iva.xx.l>> a;
        Object obj2;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        a0 a0Var = this.i;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                com.amazon.aps.iva.gy.g gVar = a0Var.c;
                com.amazon.aps.iva.xx.g gVar2 = this.j;
                this.h = 1;
                obj = gVar.i1(gVar2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.amazon.aps.iva.xx.l lVar = (com.amazon.aps.iva.xx.l) obj;
            if (lVar != null && (d = a0Var.e.d()) != null && (a = d.a()) != null) {
                com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> vVar = a0Var.e;
                ArrayList Z0 = com.amazon.aps.iva.lb0.x.Z0(a.a);
                Iterator it = com.amazon.aps.iva.lb0.x.d1(Z0).iterator();
                while (true) {
                    e0 e0Var = (e0) it;
                    if (e0Var.hasNext()) {
                        obj2 = e0Var.next();
                        if (com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.xx.l) ((com.amazon.aps.iva.lb0.c0) obj2).b).a(), lVar.a())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.amazon.aps.iva.lb0.c0 c0Var = (com.amazon.aps.iva.lb0.c0) obj2;
                if (c0Var != null) {
                    Z0.set(c0Var.a, lVar);
                }
                vVar.k(new g.c(Z0, null));
            }
        } catch (IOException unused) {
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
