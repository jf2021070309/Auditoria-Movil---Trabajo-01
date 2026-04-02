package com.amazon.aps.iva.dt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
/* compiled from: BentoCarouselView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class a extends ConstraintLayout implements d {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] f = {q.a(a.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(a.class, "backgroundImage", "getBackgroundImage()Landroid/widget/ImageView;", 0)};
    public final com.amazon.aps.iva.xh.b b;
    public final v c;
    public final v d;
    public final m e;

    /* compiled from: BentoCarouselView.kt */
    /* renamed from: com.amazon.aps.iva.dt.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0205a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.dt.b> {
        public C0205a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.dt.b invoke() {
            a aVar = a.this;
            com.amazon.aps.iva.yb0.j.f(aVar, "view");
            return new c(aVar);
        }
    }

    /* compiled from: BentoCarouselView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends RecyclerView.u {
        public final /* synthetic */ float b;
        public final /* synthetic */ a c;
        public final /* synthetic */ float d;

        public b(float f, a aVar, float f2) {
            this.b = f;
            this.c = aVar;
            this.d = f2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            com.amazon.aps.iva.yb0.j.f(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            float computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int width = recyclerView.getChildAt(0).getWidth();
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            com.amazon.aps.iva.yb0.j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            float f = this.d;
            a aVar = this.c;
            if (findFirstVisibleItemPosition <= 0) {
                float f2 = width;
                float f3 = 2;
                float f4 = this.b;
                if (computeHorizontalScrollOffset < (f4 / f3) + f2) {
                    aVar.getBackgroundImage().setTranslationX((f4 / f3) + (-computeHorizontalScrollOffset) + f2 + f);
                    return;
                }
            }
            aVar.getBackgroundImage().setTranslationX(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, com.amazon.aps.iva.xh.b bVar) {
        super(context);
        com.amazon.aps.iva.yb0.j.f(bVar, "upgradeFlowRouter");
        this.b = bVar;
        this.c = com.amazon.aps.iva.xw.g.c(R.id.carousel_recycler_view, this);
        this.d = com.amazon.aps.iva.xw.g.c(R.id.carousel_background_image, this);
        this.e = com.amazon.aps.iva.kb0.f.b(new C0205a());
        View.inflate(context, R.layout.layout_bento_carousel, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        setBackgroundColor(com.amazon.aps.iva.d3.a.getColor(getContext(), R.color.activity_background));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getBackgroundImage() {
        return (ImageView) this.d.getValue(this, f[1]);
    }

    private final RecyclerView getCarousel() {
        return (RecyclerView) this.c.getValue(this, f[0]);
    }

    private final com.amazon.aps.iva.dt.b getPresenter() {
        return (com.amazon.aps.iva.dt.b) this.e.getValue();
    }

    @Override // com.amazon.aps.iva.dt.d
    public final void Kh(com.amazon.aps.iva.xx.e eVar, int i) {
        RecyclerView carousel = getCarousel();
        com.amazon.aps.iva.et.b bVar = new com.amazon.aps.iva.et.b(i);
        bVar.e(eVar.g);
        com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        carousel.setAdapter(new androidx.recyclerview.widget.f(new com.amazon.aps.iva.et.a(this.b), bVar));
        if (getCarousel().getItemDecorationCount() < 1) {
            getCarousel().addItemDecoration(new com.amazon.aps.iva.et.d());
        }
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        float b2 = com.amazon.aps.iva.xw.q.b(context, 80.0f);
        Context context2 = getContext();
        com.amazon.aps.iva.yb0.j.e(context2, "context");
        getCarousel().addOnScrollListener(new b(com.amazon.aps.iva.xw.q.b(context2, getContext().getResources().getDimension(R.dimen.bento_background_scroll_treshold)), this, b2));
    }

    @Override // com.amazon.aps.iva.dt.d
    public final void Qf(com.amazon.aps.iva.xx.e eVar, int i) {
        getPresenter().h6(eVar, i);
    }
}
