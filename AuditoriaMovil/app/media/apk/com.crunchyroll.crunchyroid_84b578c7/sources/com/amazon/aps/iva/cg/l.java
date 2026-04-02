package com.amazon.aps.iva.cg;

import com.amazon.aps.iva.cg.a0;
import com.amazon.aps.iva.cg.p;
import com.amazon.aps.iva.cg.u;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.model.Panel;
import com.google.android.gms.cast.MediaError;
import java.util.NoSuchElementException;
/* compiled from: DeepLinkDataManager.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.deeplinks.DeepLinkDataManagerImpl$prepareDataForContent$1", f = "DeepLinkDataManager.kt", l = {MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class l extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ i j;
    public final /* synthetic */ a0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, a0 a0Var, com.amazon.aps.iva.ob0.d<? super l> dVar) {
        super(2, dVar);
        this.j = iVar;
        this.k = a0Var;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        l lVar = new l(this.j, this.k, dVar);
        lVar.i = obj;
        return lVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((l) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        Object H;
        p aVar;
        com.amazon.aps.iva.pb0.a aVar2 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        a0 a0Var = this.k;
        i iVar = this.j;
        try {
            if (i != 0) {
                if (i == 1) {
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var = (g0) this.i;
                f fVar = iVar.a;
                this.h = 1;
                obj = fVar.u0(a0Var, this);
                if (obj == aVar2) {
                    return aVar2;
                }
            }
            H = (Panel) obj;
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        if (!(H instanceof k.a)) {
            Panel panel = (Panel) H;
            a0Var.getClass();
            com.amazon.aps.iva.yb0.j.f(panel, "panel");
            int[] iArr = a0.a.a;
            u.a aVar3 = a0Var.c;
            int i2 = iArr[aVar3.ordinal()];
            com.amazon.aps.iva.dg.a aVar4 = a0Var.d;
            if (i2 != 1) {
                if (i2 == 2) {
                    aVar = new p.f.b(aVar4, panel);
                } else {
                    throw new IllegalArgumentException("Unsupported screenToLaunch value " + aVar3);
                }
            } else {
                aVar = new p.f.a(aVar4, panel);
            }
            iVar.c(aVar);
        }
        Throwable a = com.amazon.aps.iva.kb0.k.a(H);
        if (a != null) {
            if (a instanceof NoSuchElementException) {
                q qVar = iVar.e;
                if (qVar != null) {
                    qVar.T0(new p.d.a(a0Var.e));
                }
            } else {
                q qVar2 = iVar.e;
                if (qVar2 != null) {
                    qVar2.T0(p.d.b.b);
                }
            }
            iVar.b.a(a0Var.d, a);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
