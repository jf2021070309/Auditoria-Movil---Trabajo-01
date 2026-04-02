package com.amazon.aps.iva.iy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: SmoothCarouselView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class c extends ConstraintLayout implements f {
    public static final /* synthetic */ l<Object>[] f = {q.a(c.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(c.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final com.amazon.aps.iva.jy.a<g> b;
    public final v c;
    public final v d;
    public final m e;

    /* compiled from: SmoothCarouselView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            c cVar = c.this;
            j.f(cVar, "view");
            return new e(cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, RecyclerView.v vVar, com.amazon.aps.iva.jy.a<? extends g> aVar) {
        super(context);
        j.f(vVar, "viewPool");
        j.f(aVar, "itemDelegate");
        this.b = aVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.carousel_title, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.carousel_recycler_view, this);
        this.e = com.amazon.aps.iva.kb0.f.b(new a());
        View.inflate(context, R.layout.layout_carousel, this);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(context, R.color.activity_background));
        RecyclerView carousel = getCarousel();
        carousel.addItemDecoration(new com.amazon.aps.iva.ht.a(null));
        carousel.setHasFixedSize(true);
        carousel.setRecycledViewPool(vVar);
    }

    private final RecyclerView getCarousel() {
        return (RecyclerView) this.d.getValue(this, f[1]);
    }

    private final d getPresenter() {
        return (d) this.e.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.c.getValue(this, f[0]);
    }

    public final void G(int i, com.amazon.aps.iva.xx.g gVar) {
        getPresenter().V5(i, gVar);
    }

    @Override // com.amazon.aps.iva.iy.f
    public final void R1(int i, List list) {
        j.f(list, "panels");
        RecyclerView carousel = getCarousel();
        com.amazon.aps.iva.iy.a aVar = new com.amazon.aps.iva.iy.a(this.b, i);
        aVar.e(list);
        aVar.setHasStableIds(true);
        carousel.setAdapter(aVar);
    }

    public final void nc(List<Panel> list) {
        j.f(list, "list");
        RecyclerView.h adapter = getCarousel().getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.smoothcarousel.SmoothCarouselAdapter");
        ((com.amazon.aps.iva.iy.a) adapter).e(list);
    }

    @Override // com.amazon.aps.iva.iy.f
    public final void p() {
        getTitle().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.iy.f
    public void setTitle(String str) {
        j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.iy.f
    public final void x2() {
        getTitle().setVisibility(0);
    }
}
