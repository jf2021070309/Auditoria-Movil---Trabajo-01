package com.amazon.aps.iva.ko;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.lb0.z;
import com.ellation.crunchyroll.api.etp.error.NotFoundException;
import com.ellation.crunchyroll.api.etp.subscription.model.Benefit;
import com.google.ads.AdSize;
import java.util.List;
/* compiled from: UserMigrationViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.usermigration.welcome.UserMigrationViewModelImpl$userMigrationTypeLiveData$1$1", f = "UserMigrationViewModel.kt", l = {44, 45, AdSize.PORTRAIT_AD_HEIGHT, 54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.co.j>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<List<Benefit>> j;
    public final /* synthetic */ b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.amazon.aps.iva.ez.g<List<Benefit>> gVar, b bVar, com.amazon.aps.iva.ob0.d<? super c> dVar) {
        super(2, dVar);
        this.j = gVar;
        this.k = bVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        c cVar = new c(this.j, this.k, dVar);
        cVar.i = obj;
        return cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.co.j>> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((c) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3 && i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x.i0(obj);
        } else {
            x.i0(obj);
            com.amazon.aps.iva.i5.s sVar = (com.amazon.aps.iva.i5.s) this.i;
            com.amazon.aps.iva.ez.g<List<Benefit>> gVar = this.j;
            if (gVar instanceof g.b) {
                g.b bVar = new g.b(null);
                this.h = 1;
                if (sVar.a(bVar, this) == aVar) {
                    return aVar;
                }
            } else {
                boolean z = gVar instanceof g.c;
                b bVar2 = this.k;
                if (z) {
                    g.c cVar = new g.c(bVar2.c.a((List) ((g.c) gVar).a), null);
                    this.h = 2;
                    if (sVar.a(cVar, this) == aVar) {
                        return aVar;
                    }
                } else if (gVar instanceof g.a) {
                    Throwable th = ((g.a) gVar).a;
                    if (th instanceof NotFoundException) {
                        g.c cVar2 = new g.c(bVar2.c.a(z.b), null);
                        this.h = 3;
                        if (sVar.a(cVar2, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        g.a aVar2 = new g.a(null, th);
                        this.h = 4;
                        if (sVar.a(aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
