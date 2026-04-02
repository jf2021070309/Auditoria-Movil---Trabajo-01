package com.amazon.aps.iva.vx;

import com.amazon.aps.iva.ez.g;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: HomeFeedViewModel.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.HomeFeedViewModelImpl$feed$1$1", f = "HomeFeedViewModel.kt", l = {60, 67}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>>, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> gVar, com.amazon.aps.iva.ob0.d<? super y> dVar) {
        super(2, dVar);
        this.j = gVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        y yVar = new y(this.j, dVar);
        yVar.i = obj;
        return yVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(com.amazon.aps.iva.i5.s<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>>> sVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        return ((y) create(sVar, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<Panel> b;
        com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
        int i = this.h;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.amazon.aps.iva.ab.x.i0(obj);
        } else {
            com.amazon.aps.iva.ab.x.i0(obj);
            com.amazon.aps.iva.i5.s sVar = (com.amazon.aps.iva.i5.s) this.i;
            com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.xx.l>> gVar = this.j;
            if (gVar instanceof g.c) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) ((g.c) gVar).a).iterator();
                while (true) {
                    com.amazon.aps.iva.xx.g gVar2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    com.amazon.aps.iva.xx.l lVar = (com.amazon.aps.iva.xx.l) next;
                    if (lVar instanceof com.amazon.aps.iva.xx.g) {
                        gVar2 = (com.amazon.aps.iva.xx.g) lVar;
                    }
                    if (gVar2 != null && (b = gVar2.b()) != null && b.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
                g.c cVar = new g.c(arrayList, null);
                this.h = 1;
                if (sVar.a(cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                this.h = 2;
                if (sVar.a(gVar, this) == aVar) {
                    return aVar;
                }
            }
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
