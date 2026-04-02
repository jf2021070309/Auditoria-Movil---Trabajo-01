package com.amazon.aps.iva.b60;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.e60.c;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.xx.g;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: WatchlistCarouselView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class c extends ConstraintLayout implements h {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] e = {com.amazon.aps.iva.k.q.a(c.class, "carouselTitle", "getCarouselTitle()Landroid/widget/TextView;", 0), com.amazon.aps.iva.k.q.a(c.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final v b;
    public final v c;
    public final com.amazon.aps.iva.kb0.m d;

    /* compiled from: WatchlistCarouselView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public final /* synthetic */ Context h;
        public final /* synthetic */ c i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.h = context;
            this.i = cVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
            if (kVar != null) {
                EtpContentService etpContentService = kVar.getEtpContentService();
                com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                if (c.a.a == null) {
                    c.a.a = new com.amazon.aps.iva.e60.d(etpContentService);
                }
                com.amazon.aps.iva.e60.d dVar = c.a.a;
                com.amazon.aps.iva.yb0.j.c(dVar);
                com.amazon.aps.iva.vx.k kVar2 = defpackage.i.f;
                if (kVar2 != null) {
                    com.amazon.aps.iva.vx.n f = kVar2.f();
                    Activity a = com.amazon.aps.iva.xw.q.a(this.h);
                    com.amazon.aps.iva.yb0.j.c(a);
                    com.amazon.aps.iva.ix.k d = f.d(a);
                    com.amazon.aps.iva.yb0.j.f(d, "watchlistRouter");
                    c cVar = this.i;
                    com.amazon.aps.iva.yb0.j.f(cVar, "view");
                    return new g(dVar, d, cVar);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, com.amazon.aps.iva.ls.a aVar) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(aVar, "screen");
        this.b = com.amazon.aps.iva.xw.g.c(R.id.carousel_title, this);
        this.c = com.amazon.aps.iva.xw.g.c(R.id.carousel_recycler_view, this);
        this.d = com.amazon.aps.iva.kb0.f.b(new a(context, this));
        View.inflate(context, R.layout.layout_carousel, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.activity_background));
        getCarousel().setHasFixedSize(true);
        getCarousel().addItemDecoration(new com.amazon.aps.iva.ht.a(0));
        RecyclerView carousel = getCarousel();
        d presenter = getPresenter();
        com.amazon.aps.iva.vx.k kVar = defpackage.i.f;
        if (kVar != null) {
            com.amazon.aps.iva.vx.n f = kVar.f();
            Activity a2 = com.amazon.aps.iva.xw.q.a(context);
            com.amazon.aps.iva.yb0.j.c(a2);
            com.amazon.aps.iva.ix.l b = f.b(a2);
            com.amazon.aps.iva.vx.k kVar2 = defpackage.i.f;
            if (kVar2 != null) {
                com.amazon.aps.iva.vx.n f2 = kVar2.f();
                Activity a3 = com.amazon.aps.iva.xw.q.a(context);
                com.amazon.aps.iva.yb0.j.c(a3);
                carousel.setAdapter(new com.amazon.aps.iva.c60.d(aVar, presenter, b, f2.a(a3)));
                getAdapter().registerAdapterDataObserver(new b(this));
                return;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    private final com.amazon.aps.iva.c60.d getAdapter() {
        RecyclerView.h adapter = getCarousel().getAdapter();
        com.amazon.aps.iva.yb0.j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.watchlist.adapter.WatchlistCarouselViewAdapter");
        return (com.amazon.aps.iva.c60.d) adapter;
    }

    private final RecyclerView getCarousel() {
        return (RecyclerView) this.c.getValue(this, e[1]);
    }

    private final TextView getCarouselTitle() {
        return (TextView) this.b.getValue(this, e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d getPresenter() {
        return (d) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.b60.h
    public final void Ah(g.c.b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "item");
        getPresenter().Y4(bVar);
    }

    @Override // com.amazon.aps.iva.b60.h
    public final void Y0(int i) {
        getCarousel().scrollToPosition(0);
    }

    @Override // com.amazon.aps.iva.b60.h
    public void setContent(List<? extends s> list) {
        com.amazon.aps.iva.yb0.j.f(list, FirebaseAnalytics.Param.ITEMS);
        getAdapter().e(list);
    }

    @Override // com.amazon.aps.iva.b60.h
    public void setTitle(String str) {
        getCarouselTitle().setText(str);
    }
}
