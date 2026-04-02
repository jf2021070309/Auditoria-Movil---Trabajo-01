package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.se0.g0;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PanelItemInteractor.kt */
@com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.PanelItemInteractor$loadItems$2", f = "PanelItemInteractor.kt", l = {51}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class w extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.xx.c>>, Object> {
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ List<HomeFeedItemRaw> j;
    public final /* synthetic */ v k;
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<HomeFeedItemRaw, Integer> l;

    /* compiled from: PanelItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.PanelItemInteractor$loadItems$2$1$1", f = "PanelItemInteractor.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.c>, Object> {
        public int h;
        public final /* synthetic */ HomeFeedItemRaw i;
        public final /* synthetic */ v j;
        public final /* synthetic */ int k;
        public final /* synthetic */ com.amazon.aps.iva.xx.k l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HomeFeedItemRaw homeFeedItemRaw, v vVar, int i, com.amazon.aps.iva.xx.k kVar, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.i = homeFeedItemRaw;
            this.j = vVar;
            this.k = i;
            this.l = kVar;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.i, this.j, this.k, this.l, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.c> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
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
                Panel panel = this.i.getPanel();
                if (panel != null) {
                    v vVar = this.j;
                    HomeFeedItemRaw homeFeedItemRaw = this.i;
                    int i2 = this.k;
                    com.amazon.aps.iva.xx.k kVar = this.l;
                    this.h = 1;
                    obj = vVar.y0(panel, homeFeedItemRaw, i2, kVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    return null;
                }
            }
            return (com.amazon.aps.iva.xx.c) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(List<? extends HomeFeedItemRaw> list, v vVar, com.amazon.aps.iva.xb0.l<? super HomeFeedItemRaw, Integer> lVar, com.amazon.aps.iva.ob0.d<? super w> dVar) {
        super(2, dVar);
        this.j = list;
        this.k = vVar;
        this.l = lVar;
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final com.amazon.aps.iva.ob0.d<com.amazon.aps.iva.kb0.q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
        w wVar = new w(this.j, this.k, this.l, dVar);
        wVar.i = obj;
        return wVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super List<? extends com.amazon.aps.iva.xx.c>> dVar) {
        return ((w) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
    }

    @Override // com.amazon.aps.iva.qb0.a
    public final Object invokeSuspend(Object obj) {
        com.amazon.aps.iva.xx.k kVar;
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
            g0 g0Var = (g0) this.i;
            List<HomeFeedItemRaw> n0 = com.amazon.aps.iva.lb0.x.n0(this.j);
            ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(n0));
            for (HomeFeedItemRaw homeFeedItemRaw : n0) {
                v vVar = this.k;
                int i2 = vVar.c;
                if (i2 % 2 == 0) {
                    kVar = com.amazon.aps.iva.xx.k.EVEN;
                } else {
                    kVar = com.amazon.aps.iva.xx.k.ODD;
                }
                vVar.c = i2 + 1;
                arrayList.add(com.amazon.aps.iva.se0.i.b(g0Var, null, null, new a(homeFeedItemRaw, vVar, this.l.invoke(homeFeedItemRaw).intValue(), kVar, null), 3));
            }
            this.h = 1;
            obj = com.amazon.aps.iva.se0.d.a(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return com.amazon.aps.iva.lb0.x.r0((Iterable) obj);
    }
}
