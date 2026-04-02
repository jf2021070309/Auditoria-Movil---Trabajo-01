package com.amazon.aps.iva.zx;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.zx.a;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
/* compiled from: FeedCarouselLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b<T extends com.amazon.aps.iva.zx.a> extends ConstraintLayout implements e<T> {
    public static final /* synthetic */ l<Object>[] f = {q.a(b.class, "title", "getTitle()Landroid/widget/TextView;", 0), q.a(b.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final com.amazon.aps.iva.ay.b<T> b;
    public final v c;
    public final v d;
    public final m e;

    /* compiled from: FeedCarouselLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<c<T>> {
        public final /* synthetic */ b<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b<T> bVar) {
            super(0);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            b<T> bVar = this.h;
            j.f(bVar, "view");
            return new d(bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, RecyclerView.v vVar, com.amazon.aps.iva.ay.b<T> bVar) {
        super(context);
        j.f(vVar, "viewPool");
        j.f(bVar, "carouselDelegate");
        this.b = bVar;
        this.c = g.c(R.id.carousel_title, this);
        this.d = g.c(R.id.carousel_recycler_view, this);
        this.e = f.b(new a(this));
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

    private final c<T> getPresenter() {
        return (c) this.e.getValue();
    }

    private final TextView getTitle() {
        return (TextView) this.c.getValue(this, f[0]);
    }

    public final void G(int i, com.amazon.aps.iva.xx.j jVar) {
        getPresenter().k1(i, jVar);
    }

    @Override // com.amazon.aps.iva.zx.e
    public final void R1(int i, List list) {
        j.f(list, FirebaseAnalytics.Param.ITEMS);
        RecyclerView carousel = getCarousel();
        com.amazon.aps.iva.ay.a aVar = new com.amazon.aps.iva.ay.a(this.b, i);
        aVar.e(list);
        aVar.setHasStableIds(true);
        carousel.setAdapter(aVar);
    }

    @Override // com.amazon.aps.iva.zx.e
    public final void p() {
        getTitle().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.zx.e
    public void setTitle(String str) {
        j.f(str, "title");
        getTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.zx.e
    public final void x2() {
        getTitle().setVisibility(0);
    }
}
