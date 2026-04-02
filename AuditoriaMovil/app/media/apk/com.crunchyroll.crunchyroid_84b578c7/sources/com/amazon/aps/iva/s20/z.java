package com.amazon.aps.iva.s20;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.i5.d0;
import com.amazon.aps.iva.se0.n0;
import com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService;
import com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProduct;
import java.util.ArrayList;
import java.util.List;
/* compiled from: UpgradeViewModel.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.ez.b implements t, com.amazon.aps.iva.d30.d {
    public final com.amazon.aps.iva.j30.h b;
    public final SubscriptionProcessorService c;
    public final com.amazon.aps.iva.ct.j d;
    public final String e;
    public final /* synthetic */ com.amazon.aps.iva.d30.d f;
    public n0 g;
    public List<com.amazon.aps.iva.b30.c> h;
    public final com.amazon.aps.iva.i5.v<SubscriptionProduct> i;
    public boolean j;
    public final com.amazon.aps.iva.i5.u k;
    public final com.amazon.aps.iva.i5.u l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.amazon.aps.iva.d30.d dVar, com.amazon.aps.iva.j30.i iVar, SubscriptionProcessorService subscriptionProcessorService, com.amazon.aps.iva.ct.j jVar, String str) {
        super(iVar);
        com.amazon.aps.iva.yb0.j.f(subscriptionProcessorService, "subscriptionProcessorService");
        com.amazon.aps.iva.yb0.j.f(jVar, "userBenefitsStore");
        this.b = iVar;
        this.c = subscriptionProcessorService;
        this.d = jVar;
        this.e = str;
        this.f = dVar;
        this.i = new com.amazon.aps.iva.i5.v<>(null);
        this.k = d0.c(H0(), new y(this));
        this.l = d0.b(R7(), new w(this));
        this.g = com.amazon.aps.iva.se0.i.b(com.amazon.aps.iva.e.w.D(this), null, null, new v(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N8(com.amazon.aps.iva.s20.z r4, com.amazon.aps.iva.ob0.d r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.amazon.aps.iva.s20.u
            if (r0 == 0) goto L16
            r0 = r5
            com.amazon.aps.iva.s20.u r0 = (com.amazon.aps.iva.s20.u) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.j = r1
            goto L1b
        L16:
            com.amazon.aps.iva.s20.u r0 = new com.amazon.aps.iva.s20.u
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r5)     // Catch: java.io.IOException -> L69
            goto L40
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            com.amazon.aps.iva.ab.x.i0(r5)
            com.ellation.crunchyroll.api.etp.subscription.SubscriptionProcessorService r4 = r4.c     // Catch: java.io.IOException -> L69
            r0.j = r3     // Catch: java.io.IOException -> L69
            java.lang.Object r5 = r4.getUserSubscription(r0)     // Catch: java.io.IOException -> L69
            if (r5 != r1) goto L40
            goto L68
        L40:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r5 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r5     // Catch: java.io.IOException -> L69
            java.util.List r4 = r5.getItems()     // Catch: java.io.IOException -> L69
            java.util.List r4 = com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductKt.getOrderedSubscriptions(r4)     // Catch: java.io.IOException -> L69
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L66
            java.lang.Object r5 = r4.next()
            r0 = r5
            com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper r0 = (com.ellation.crunchyroll.api.etp.subscription.model.SubscriptionProductWrapper) r0
            boolean r0 = r0.isCancelled()
            r0 = r0 ^ r3
            if (r0 == 0) goto L50
            r1 = r5
            goto L68
        L66:
            r4 = 0
            r1 = r4
        L68:
            return r1
        L69:
            com.amazon.aps.iva.d30.a r4 = new com.amazon.aps.iva.d30.a
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.s20.z.N8(com.amazon.aps.iva.s20.z, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    public static final ArrayList O8(z zVar, List list) {
        String str;
        ArrayList arrayList;
        boolean z;
        SubscriptionProduct d = zVar.i.d();
        if (d != null) {
            str = d.getSku();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1666493765) {
                if (hashCode == -447375682 ? str.equals("crunchyroll.google.fanpack.annually") : hashCode == 1568935424 && str.equals("crunchyroll.google.superfanpack.monthly")) {
                    throw new com.amazon.aps.iva.d30.b();
                }
            } else if (str.equals("crunchyroll.google.fanpack.monthly")) {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    com.amazon.aps.iva.b30.c cVar = (com.amazon.aps.iva.b30.c) obj;
                    if (!com.amazon.aps.iva.yb0.j.a(cVar.b, "crunchyroll.google.premium.monthly") && !com.amazon.aps.iva.yb0.j.a(cVar.b, "crunchyroll.google.fanpack.monthly")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }
        }
        arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!com.amazon.aps.iva.yb0.j.a(((com.amazon.aps.iva.b30.c) obj2).b, "crunchyroll.google.premium.monthly")) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void E6(String str, com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.f.E6(str, bVar);
    }

    @Override // com.amazon.aps.iva.s20.t
    public final com.amazon.aps.iva.i5.u F() {
        return this.l;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.b30.c>>> H0() {
        return this.f.H0();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void Q7(com.amazon.aps.iva.fs.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "clickedView");
        this.f.Q7(bVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.d<com.amazon.aps.iva.b30.c>> R7() {
        return this.f.R7();
    }

    @Override // com.amazon.aps.iva.s20.t
    public final void S1(com.amazon.aps.iva.fs.b bVar) {
        if (this.d.getHasPremiumBenefit()) {
            SubscriptionProduct d = this.i.d();
            com.amazon.aps.iva.yb0.j.c(d);
            E6(d.getSku(), bVar);
            return;
        }
        Q7(bVar);
    }

    @Override // com.amazon.aps.iva.s20.t
    public final com.amazon.aps.iva.i5.u c() {
        return this.k;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final LiveData<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.wh.a>> e1() {
        return this.f.e1();
    }

    @Override // com.amazon.aps.iva.s20.t
    public final void i2() {
        n4();
        this.g = com.amazon.aps.iva.se0.i.b(com.amazon.aps.iva.e.w.D(this), null, null, new v(this, null), 3);
    }

    @Override // com.amazon.aps.iva.s20.t
    public final com.amazon.aps.iva.b30.c l(int i) {
        com.amazon.aps.iva.b30.c cVar;
        List<com.amazon.aps.iva.b30.c> list = this.h;
        if (list != null) {
            cVar = list.get(i);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            this.f.p2(cVar);
        }
        return cVar;
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void n4() {
        this.f.n4();
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void p2(com.amazon.aps.iva.b30.c cVar) {
        this.f.p2(cVar);
    }

    @Override // com.amazon.aps.iva.d30.d
    public final void w5(com.amazon.aps.iva.fs.b bVar, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "activeSubscriptionSku");
        this.f.w5(bVar, str);
    }
}
