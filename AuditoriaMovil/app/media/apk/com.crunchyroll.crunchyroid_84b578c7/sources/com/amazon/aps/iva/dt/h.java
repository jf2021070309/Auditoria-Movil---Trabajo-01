package com.amazon.aps.iva.dt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BentoDetailView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.g implements k {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] g = {q.a(h.class, "bentoTitle", "getBentoTitle()Landroid/widget/TextView;", 0), q.a(h.class, "bentoDescription", "getBentoDescription()Landroid/widget/TextView;", 0), q.a(h.class, "bentoSubscriptionCta", "getBentoSubscriptionCta()Landroid/widget/TextView;", 0)};
    public final com.amazon.aps.iva.xh.b b;
    public final v c;
    public final v d;
    public final v e;
    public final m f;

    /* compiled from: BentoDetailView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<i> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final i invoke() {
            h hVar = h.this;
            com.amazon.aps.iva.xh.b bVar = hVar.b;
            com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
            if (kVar != null) {
                com.amazon.aps.iva.rh.a g = kVar.g();
                com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.ARCADE_CAROUSEL;
                com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                com.amazon.aps.iva.yb0.j.f(aVar, "screen");
                com.amazon.aps.iva.ft.b bVar2 = new com.amazon.aps.iva.ft.b(cVar, aVar);
                f fVar = f.h;
                com.amazon.aps.iva.yb0.j.f(fVar, "hasPremiumBenefit");
                g gVar = g.h;
                com.amazon.aps.iva.yb0.j.f(gVar, "hasBentoBenefit");
                com.amazon.aps.iva.yb0.j.f(bVar, "upgradeRouter");
                com.amazon.aps.iva.yb0.j.f(g, "upgradeMessageProvider");
                return new j(g, bVar, hVar, bVar2, fVar, gVar);
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, com.amazon.aps.iva.xh.b bVar) {
        super(context, null, 0, 6, null);
        com.amazon.aps.iva.yb0.j.f(bVar, "upgradeFlow");
        this.b = bVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.bento_title, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.bento_description, this);
        this.e = com.amazon.aps.iva.xw.g.c(R.id.bento_subscription_cta, this);
        this.f = com.amazon.aps.iva.kb0.f.b(new a());
        View.inflate(context, R.layout.layout_bento_detail, this);
    }

    private final TextView getBentoDescription() {
        return (TextView) this.d.getValue(this, g[1]);
    }

    private final TextView getBentoSubscriptionCta() {
        return (TextView) this.e.getValue(this, g[2]);
    }

    private final TextView getBentoTitle() {
        return (TextView) this.c.getValue(this, g[0]);
    }

    @Override // com.amazon.aps.iva.dt.k
    public final void Xd() {
        getBentoDescription().setText(getContext().getString(R.string.bento_carousel_description_fan));
    }

    @Override // com.amazon.aps.iva.dt.k
    public final void Z0() {
        getBentoTitle().setText(getContext().getString(R.string.bento_carousel_title));
    }

    @Override // com.amazon.aps.iva.dt.k
    public final void Za() {
        getBentoDescription().setText(getContext().getString(R.string.bento_carousel_description_premium));
    }

    public final void b1() {
        getPresenter().z0();
        getBentoSubscriptionCta().setOnClickListener(new com.amazon.aps.iva.fe.a(this, 6));
    }

    public final i getPresenter() {
        return (i) this.f.getValue();
    }

    @Override // com.amazon.aps.iva.dt.k
    public final void q() {
        getBentoSubscriptionCta().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.dt.k
    public void setCtaTitle(int i) {
        getBentoSubscriptionCta().setText(getContext().getString(i));
    }

    public void setDescription(String str) {
        getBentoDescription().setText(str);
    }

    @Override // com.amazon.aps.iva.dt.k
    public void setFreeDescription(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "text");
        getBentoDescription().setText(str);
    }

    @Override // com.amazon.aps.iva.dt.k
    public final void w() {
        getBentoSubscriptionCta().setVisibility(0);
    }
}
