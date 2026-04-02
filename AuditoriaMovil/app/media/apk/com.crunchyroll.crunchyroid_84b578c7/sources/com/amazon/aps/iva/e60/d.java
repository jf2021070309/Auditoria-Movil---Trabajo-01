package com.amazon.aps.iva.e60;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.kb0.k;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.ob0.g;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.qb0.i;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.ContentApiResponse;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.Panel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: WatchlistImagesInteractor.kt */
/* loaded from: classes2.dex */
public final class d implements c, g0 {
    public final EtpContentService b;
    public final /* synthetic */ com.amazon.aps.iva.xe0.d c = z.j();
    public b d = new b(0);

    /* compiled from: WatchlistImagesInteractor.kt */
    @e(c = "com.ellation.crunchyroll.watchlist.images.WatchlistImagesInteractorImpl$loadImages$1", f = "WatchlistImagesInteractor.kt", l = {45}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ l<Throwable, q> j;
        public final /* synthetic */ d k;
        public final /* synthetic */ String l;
        public final /* synthetic */ l<b, q> m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super Throwable, q> lVar, d dVar, String str, l<? super b, q> lVar2, com.amazon.aps.iva.ob0.d<? super a> dVar2) {
            super(2, dVar2);
            this.j = lVar;
            this.k = dVar;
            this.l = str;
            this.m = lVar2;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(this.j, this.k, this.l, this.m, dVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            Object H;
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            d dVar = this.k;
            try {
                if (i != 0) {
                    if (i == 1) {
                        x.i0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    x.i0(obj);
                    g0 g0Var = (g0) this.i;
                    String str = this.l;
                    EtpContentService etpContentService = dVar.b;
                    this.h = 1;
                    obj = etpContentService.getPanelImages(str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                H = ((ContentApiResponse) obj).getData();
            } catch (Throwable th) {
                H = x.H(th);
            }
            if (!(H instanceof k.a)) {
                List<Panel> list = (List) H;
                ArrayList arrayList = new ArrayList(r.Y(list));
                for (Panel panel : list) {
                    arrayList.add(new com.amazon.aps.iva.e60.a(panel));
                }
                b bVar = new b(com.amazon.aps.iva.lb0.x.L0(arrayList, dVar.d.a));
                dVar.d = bVar;
                this.m.invoke(bVar);
            }
            Throwable a = k.a(H);
            if (a != null) {
                this.j.invoke(a);
            }
            return q.a;
        }
    }

    public d(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    @Override // com.amazon.aps.iva.e60.c
    public final void a(List<com.amazon.aps.iva.b60.k> list, l<? super b, q> lVar, l<? super Throwable, q> lVar2) {
        boolean z;
        boolean z2;
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        j.f(lVar2, "failure");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.amazon.aps.iva.b60.k kVar = (com.amazon.aps.iva.b60.k) next;
            b bVar = this.d;
            bVar.getClass();
            j.f(kVar, "item");
            if (bVar.a(kVar) != null) {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((com.amazon.aps.iva.b60.k) it2.next()).g.getMetadata().getParentId());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            String str = (String) next2;
            if (str != null && !m.b0(str)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                arrayList3.add(next2);
            }
        }
        String B0 = com.amazon.aps.iva.lb0.x.B0(arrayList3, ",", null, null, null, 62);
        if (B0.length() > 0) {
            z = true;
        }
        if (z) {
            com.amazon.aps.iva.se0.i.d(this, null, null, new a(lVar2, this, B0, lVar, null), 3);
        } else {
            lVar.invoke(this.d);
        }
    }

    @Override // com.amazon.aps.iva.e60.c
    public final b b() {
        return this.d;
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final g getCoroutineContext() {
        return this.c.b;
    }
}
