package com.amazon.aps.iva.ey;

import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.jt.a;
import com.amazon.aps.iva.k50.h;
import com.amazon.aps.iva.k50.n;
import com.amazon.aps.iva.ws.d;
import com.amazon.aps.iva.ws.f;
import com.amazon.aps.iva.wy.j;
import com.ellation.crunchyroll.model.Panel;
/* compiled from: HeroPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final h b;
    public final n c;
    public final com.amazon.aps.iva.ws.d d;
    public final boolean e;
    public Panel f;

    public d(a aVar, h hVar, n nVar, f fVar, boolean z) {
        super(aVar, new j[0]);
        this.b = hVar;
        this.c = nVar;
        this.d = fVar;
        this.e = z;
    }

    @Override // com.amazon.aps.iva.ey.c
    public final void N1(Panel panel) {
        boolean z;
        this.f = panel;
        getView().setTitle(panel.getTitle());
        e view = getView();
        String promoDescription = panel.getPromoDescription();
        boolean z2 = true;
        if (promoDescription.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            promoDescription = null;
        }
        if (promoDescription == null) {
            promoDescription = panel.getDescription();
        }
        if (promoDescription.length() <= 0) {
            z2 = false;
        }
        if (z2) {
            view.setDescription(promoDescription);
        } else {
            view.g();
        }
        if (this.e) {
            getView().g2(panel.getImages().getPostersWide());
        } else {
            getView().g2(panel.getImages().getPostersTall());
        }
    }

    @Override // com.amazon.aps.iva.ey.c
    public final void h() {
        com.amazon.aps.iva.ws.d dVar = this.d;
        Panel panel = this.f;
        if (panel != null) {
            d.b.a(dVar, panel, a.C0423a.a(k.HERO, 0, 0, "", "", 32), null, null, null, 28);
            Panel panel2 = this.f;
            if (panel2 != null) {
                this.b.t(panel2);
                return;
            } else {
                com.amazon.aps.iva.yb0.j.m("panel");
                throw null;
            }
        }
        com.amazon.aps.iva.yb0.j.m("panel");
        throw null;
    }

    @Override // com.amazon.aps.iva.ey.c
    public final void o5() {
        Panel panel = this.f;
        if (panel != null) {
            this.c.d(panel);
        } else {
            com.amazon.aps.iva.yb0.j.m("panel");
            throw null;
        }
    }
}
