package com.amazon.aps.iva.vx;

import android.content.Intent;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.js.f;
import com.amazon.aps.iva.xx.c;
import java.util.LinkedHashSet;
/* compiled from: HomeFeedAnalytics.kt */
/* loaded from: classes2.dex */
public final class i extends com.amazon.aps.iva.us.f implements h {
    public final com.amazon.aps.iva.xb0.a<Boolean> g;
    public final com.amazon.aps.iva.xb0.a<Boolean> h;
    public final com.amazon.aps.iva.vw.a i;
    public final com.amazon.aps.iva.ds.a j;
    public final com.amazon.aps.iva.ls.a k;
    public final LinkedHashSet l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.amazon.aps.iva.xb0.a<Boolean> aVar, com.amazon.aps.iva.xb0.a<Boolean> aVar2, com.amazon.aps.iva.vw.a aVar3, com.amazon.aps.iva.ds.a aVar4, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar5, com.amazon.aps.iva.xb0.l<? super Intent, Boolean> lVar, com.amazon.aps.iva.ls.a aVar6) {
        super(aVar5, null, lVar, 2);
        com.amazon.aps.iva.yb0.j.f(aVar, "isInGraceButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar2, "isSubscriptionButtonVisible");
        com.amazon.aps.iva.yb0.j.f(aVar6, "screen");
        this.g = aVar;
        this.h = aVar2;
        this.i = aVar3;
        this.j = aVar4;
        this.k = aVar6;
        this.l = new LinkedHashSet();
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        com.amazon.aps.iva.ks.g gVar;
        com.amazon.aps.iva.ls.a aVar = this.k;
        com.amazon.aps.iva.is.a aVar2 = null;
        com.amazon.aps.iva.vw.a aVar3 = this.i;
        if (aVar3 != null) {
            gVar = aVar3.y();
        } else {
            gVar = null;
        }
        com.amazon.aps.iva.is.a[] aVarArr = new com.amazon.aps.iva.is.a[1];
        if (this.g.invoke().booleanValue()) {
            aVar2 = f.a.a;
        } else if (this.h.invoke().booleanValue()) {
            aVar2 = f.d.a;
        }
        aVarArr[0] = aVar2;
        this.j.c(defpackage.i.s(aVar, f, null, gVar, null, aVarArr, 20));
    }

    @Override // com.amazon.aps.iva.vx.h
    public final void f(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "e");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        l1.L(this.j, th, new com.amazon.aps.iva.es.w(message, this.k, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.vx.h
    public final void q(com.amazon.aps.iva.xx.h hVar, int i) {
        com.amazon.aps.iva.js.k kVar;
        int size;
        String a = hVar.a();
        LinkedHashSet linkedHashSet = this.l;
        if (linkedHashSet.contains(a)) {
            return;
        }
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.HOME;
        String str = hVar.d;
        if (str == null) {
            str = "";
        }
        if (hVar instanceof c.C0868c) {
            kVar = com.amazon.aps.iva.js.k.HERO;
        } else if (hVar instanceof c.a) {
            kVar = com.amazon.aps.iva.js.k.CARD;
        } else if (hVar instanceof c.b) {
            kVar = com.amazon.aps.iva.js.k.CARD;
        } else if (hVar instanceof com.amazon.aps.iva.xx.g) {
            kVar = com.amazon.aps.iva.js.k.COLLECTION;
        } else if (hVar instanceof com.amazon.aps.iva.xx.e) {
            kVar = com.amazon.aps.iva.js.k.COLLECTION;
        } else if (hVar instanceof com.amazon.aps.iva.xx.j) {
            kVar = com.amazon.aps.iva.js.k.COLLECTION;
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        com.amazon.aps.iva.yb0.j.f(kVar, "feedType");
        com.amazon.aps.iva.yb0.j.f(a, "feedId");
        com.amazon.aps.iva.ks.i iVar = new com.amazon.aps.iva.ks.i(kVar, a, str);
        if (hVar instanceof com.amazon.aps.iva.xx.c) {
            size = 1;
        } else if (hVar instanceof com.amazon.aps.iva.xx.g) {
            size = ((com.amazon.aps.iva.xx.g) hVar).b().size();
        } else if (hVar instanceof com.amazon.aps.iva.xx.e) {
            size = ((com.amazon.aps.iva.xx.e) hVar).g.size();
        } else if (hVar instanceof com.amazon.aps.iva.xx.j) {
            size = ((com.amazon.aps.iva.xx.j) hVar).e.size();
        } else {
            throw new com.amazon.aps.iva.kb0.h();
        }
        this.j.e(new com.amazon.aps.iva.es.j(iVar, hVar.c, aVar, i, size, i, "", ""));
        linkedHashSet.add(a);
    }
}
