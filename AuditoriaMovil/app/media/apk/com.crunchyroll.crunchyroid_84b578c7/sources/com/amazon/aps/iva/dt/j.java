package com.amazon.aps.iva.dt;

import com.crunchyroll.crunchyroid.R;
/* compiled from: BentoDetailPresenter.kt */
/* loaded from: classes2.dex */
public final class j extends com.amazon.aps.iva.wy.b<k> implements i {
    public final com.amazon.aps.iva.xb0.a<Boolean> b;
    public final com.amazon.aps.iva.xb0.a<Boolean> c;
    public final com.amazon.aps.iva.xh.b d;
    public final com.amazon.aps.iva.ft.a e;
    public final com.amazon.aps.iva.rh.a f;

    public j(com.amazon.aps.iva.rh.a aVar, com.amazon.aps.iva.xh.b bVar, h hVar, com.amazon.aps.iva.ft.a aVar2, f fVar, g gVar) {
        super(hVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = fVar;
        this.c = gVar;
        this.d = bVar;
        this.e = aVar2;
        this.f = aVar;
    }

    @Override // com.amazon.aps.iva.dt.i
    public final void F3(com.amazon.aps.iva.fs.b bVar) {
        boolean booleanValue = this.b.invoke().booleanValue();
        com.amazon.aps.iva.ft.a aVar = this.e;
        if (booleanValue) {
            aVar.F(bVar);
        } else {
            aVar.G(bVar);
        }
        this.d.a(null);
    }

    @Override // com.amazon.aps.iva.dt.i
    public final void z0() {
        getView().Z0();
        com.amazon.aps.iva.xb0.a<Boolean> aVar = this.c;
        boolean booleanValue = aVar.invoke().booleanValue();
        com.amazon.aps.iva.xb0.a<Boolean> aVar2 = this.b;
        if (booleanValue) {
            getView().Xd();
        } else if (aVar2.invoke().booleanValue()) {
            getView().Za();
        } else {
            getView().setFreeDescription(this.f.c(Integer.valueOf((int) R.string.bento_carousel_description_free), null));
        }
        if (aVar.invoke().booleanValue()) {
            getView().q();
        } else if (aVar2.invoke().booleanValue()) {
            getView().setCtaTitle(R.string.subscription_upgrade_now_button_title);
            getView().w();
        } else {
            getView().setCtaTitle(R.string.subscription_button_title);
            getView().w();
        }
    }
}
