package com.amazon.aps.iva.gt;

import com.amazon.aps.iva.js.l0;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BentoUpsellModalPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements e {
    public final String b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final a d;
    public final com.amazon.aps.iva.xh.b e;

    public g(c cVar, String str, d dVar, b bVar, com.amazon.aps.iva.xh.b bVar2) {
        super(cVar, new j[0]);
        this.b = str;
        this.c = dVar;
        this.d = bVar;
        this.e = bVar2;
    }

    @Override // com.amazon.aps.iva.gt.e
    public final void Z3() {
        getView().Z0();
        if (this.c.invoke().booleanValue()) {
            getView().setCtaTitle(R.string.subscription_upgrade_now_button_title);
        } else {
            getView().setCtaTitle(R.string.subscription_button_title);
        }
        getView().Gg();
        this.e.b(new f(this));
    }

    @Override // com.amazon.aps.iva.gt.e
    public final void c() {
        getView().close();
    }

    @Override // com.amazon.aps.iva.gt.e
    public final void o4(com.amazon.aps.iva.fs.b bVar) {
        boolean booleanValue = this.c.invoke().booleanValue();
        a aVar = this.d;
        if (booleanValue) {
            aVar.b(bVar, com.amazon.aps.iva.ls.a.ARCADE_UPGRADE_MODAL);
        } else {
            aVar.b(bVar, com.amazon.aps.iva.ls.a.ARCADE_UPSELL_MODAL);
        }
        getView().P0(this.b);
    }

    @Override // com.amazon.aps.iva.gt.e
    public final void o6(com.amazon.aps.iva.fs.b bVar) {
        boolean booleanValue = this.c.invoke().booleanValue();
        a aVar = this.d;
        if (booleanValue) {
            aVar.c(bVar);
        } else {
            aVar.a(bVar);
        }
        this.e.a(null);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        l0 l0Var;
        if (this.c.invoke().booleanValue()) {
            l0Var = l0.UPGRADE;
        } else {
            l0Var = l0.SUBSCRIPTION;
        }
        this.d.d(l0Var);
    }
}
