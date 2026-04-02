package com.amazon.aps.iva.p10;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.q10.e;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xb0.r;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: SubgenreCarouselView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class b extends ConstraintLayout implements e {
    public static final /* synthetic */ l<Object>[] g = {q.a(b.class, "carouselTitle", "getCarouselTitle()Landroid/widget/TextView;", 0), q.a(b.class, "carousel", "getCarousel()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(b.class, "viewAll", "getViewAll()Landroid/view/View;", 0)};
    public final com.amazon.aps.iva.n70.d<Panel> b;
    public final v c;
    public final v d;
    public final v e;
    public final d f;

    /* compiled from: SubgenreCarouselView.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(d dVar) {
            super(0, dVar, c.class, "onMoreClick", "onMoreClick()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((c) this.receiver).V3();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SubgenreCarouselView.kt */
    /* renamed from: com.amazon.aps.iva.p10.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0593b extends i implements p<Panel, Integer, com.amazon.aps.iva.kb0.q> {
        public C0593b(d dVar) {
            super(2, dVar, c.class, "onItemClick", "onItemClick(Lcom/ellation/crunchyroll/model/Panel;I)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final com.amazon.aps.iva.kb0.q invoke(Panel panel, Integer num) {
            Panel panel2 = panel;
            int intValue = num.intValue();
            j.f(panel2, "p0");
            ((c) this.receiver).i(panel2, intValue);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.p10.a, com.amazon.aps.iva.kb0.q> lVar, com.amazon.aps.iva.n70.d<Panel> dVar, r<? super Panel, ? super Integer, ? super Integer, ? super String, com.amazon.aps.iva.kb0.q> rVar) {
        super(context);
        j.f(lVar, "openBrowseAll");
        j.f(dVar, "menuProvider");
        j.f(rVar, "onItemClick");
        this.b = dVar;
        this.c = g.c(R.id.subgenre_carousel_title, this);
        this.d = g.c(R.id.subgenre_carousel_recycler_view, this);
        this.e = g.c(R.id.subgenre_carousel_view_all, this);
        this.f = new d(this, lVar, rVar);
        View.inflate(context, R.layout.layout_genre_carousel, this);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        getCarousel().setHasFixedSize(true);
        getCarousel().addItemDecoration(new com.amazon.aps.iva.ht.a(0));
        getViewAll().setOnClickListener(new com.amazon.aps.iva.fe.a(this, 11));
    }

    private final RecyclerView getCarousel() {
        return (RecyclerView) this.d.getValue(this, g[1]);
    }

    private final TextView getCarouselTitle() {
        return (TextView) this.c.getValue(this, g[0]);
    }

    private final View getViewAll() {
        return (View) this.e.getValue(this, g[2]);
    }

    public final void G(com.amazon.aps.iva.p10.a aVar, int i) {
        Integer num;
        int i2;
        d dVar = this.f;
        dVar.getClass();
        dVar.d = aVar;
        dVar.e = i;
        com.amazon.aps.iva.a00.b bVar = aVar.e;
        if (bVar != null) {
            if (bVar == com.amazon.aps.iva.a00.b.Popularity) {
                i2 = R.string.subgenre_carousel_popular;
            } else if (bVar == com.amazon.aps.iva.a00.b.NewlyAdded) {
                i2 = R.string.subgenre_carousel_new;
            } else {
                throw new IllegalArgumentException("Unsupported type " + bVar);
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        String str = aVar.c;
        if (str != null) {
            dVar.getView().a6();
            dVar.getView().setTitle(str);
        } else if (num != null) {
            dVar.getView().a6();
            dVar.getView().setTitle(num.intValue());
        } else {
            dVar.getView().he();
            dVar.getView().p();
        }
        List<com.amazon.aps.iva.q10.e> list = aVar.b;
        if (list.size() < aVar.a) {
            dVar.getView().Ge(x.M0(list, e.d.a), bVar);
        } else {
            dVar.getView().Ge(list, bVar);
        }
    }

    @Override // com.amazon.aps.iva.p10.e
    public final void Ge(List<? extends com.amazon.aps.iva.q10.e> list, com.amazon.aps.iva.a00.b bVar) {
        j.f(list, "subgenreItems");
        RecyclerView carousel = getCarousel();
        com.amazon.aps.iva.n70.d<Panel> dVar = this.b;
        d dVar2 = this.f;
        carousel.setAdapter(new com.amazon.aps.iva.q10.d(list, dVar, new a(dVar2), new C0593b(dVar2), bVar));
    }

    @Override // com.amazon.aps.iva.p10.e
    public final void a6() {
        getViewAll().setEnabled(true);
    }

    public final void b1(int i) {
        RecyclerView.h adapter = getCarousel().getAdapter();
        if (adapter != null) {
            adapter.notifyItemChanged(i);
        }
    }

    @Override // com.amazon.aps.iva.p10.e
    public final void he() {
        getViewAll().setEnabled(false);
    }

    @Override // com.amazon.aps.iva.p10.e
    public final void p() {
        getCarouselTitle().setVisibility(4);
    }

    @Override // com.amazon.aps.iva.p10.e
    public void setTitle(String str) {
        j.f(str, "title");
        getCarouselTitle().setVisibility(0);
        getCarouselTitle().setText(str);
    }

    @Override // com.amazon.aps.iva.p10.e
    public void setTitle(int i) {
        getCarouselTitle().setVisibility(0);
        getCarouselTitle().setText(i);
    }
}
