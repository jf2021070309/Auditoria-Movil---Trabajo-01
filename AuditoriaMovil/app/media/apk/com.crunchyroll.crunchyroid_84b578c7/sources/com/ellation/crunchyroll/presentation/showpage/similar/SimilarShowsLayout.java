package com.ellation.crunchyroll.presentation.showpage.similar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.nt.a;
import com.amazon.aps.iva.p40.i;
import com.amazon.aps.iva.p40.m;
import com.amazon.aps.iva.p40.n;
import com.amazon.aps.iva.q40.d;
import com.amazon.aps.iva.tz.h0;
import com.amazon.aps.iva.uz.h;
import com.amazon.aps.iva.xw.f0;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.presentation.content.panel.PanelFeedRecyclerView;
import com.ellation.crunchyroll.presentation.showpage.ShowPageActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SimilarShowsLayout.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0005\u001a\u0004\b\u0014\u0010\u0007R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/ellation/crunchyroll/presentation/showpage/similar/SimilarShowsLayout;", "Landroid/widget/FrameLayout;", "Lcom/amazon/aps/iva/p40/m;", "Landroid/view/View;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getPopularFallbackDescription", "()Landroid/view/View;", "popularFallbackDescription", "Lcom/ellation/crunchyroll/presentation/content/panel/PanelFeedRecyclerView;", "c", "getRecycler", "()Lcom/ellation/crunchyroll/presentation/content/panel/PanelFeedRecyclerView;", "recycler", "Landroid/view/ViewGroup;", "d", "getErrorLayout", "()Landroid/view/ViewGroup;", "errorLayout", "e", "getRetryButton", "retryButton", "Lcom/amazon/aps/iva/p40/n;", "f", "Lcom/amazon/aps/iva/kb0/e;", "getViewModel", "()Lcom/amazon/aps/iva/p40/n;", "viewModel", "Lcom/amazon/aps/iva/p40/d;", "g", "getPresenter", "()Lcom/amazon/aps/iva/p40/d;", "presenter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "", "getSpanCount", "()I", "spanCount", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SimilarShowsLayout extends FrameLayout implements m {
    public static final /* synthetic */ l<Object>[] i = {q.a(SimilarShowsLayout.class, "popularFallbackDescription", "getPopularFallbackDescription()Landroid/view/View;", 0), q.a(SimilarShowsLayout.class, "recycler", "getRecycler()Lcom/ellation/crunchyroll/presentation/content/panel/PanelFeedRecyclerView;", 0), q.a(SimilarShowsLayout.class, "errorLayout", "getErrorLayout()Landroid/view/ViewGroup;", 0), q.a(SimilarShowsLayout.class, "retryButton", "getRetryButton()Landroid/view/View;", 0)};
    public final v b;
    public final v c;
    public final v d;
    public final v e;
    public final com.amazon.aps.iva.kb0.m f;
    public final com.amazon.aps.iva.kb0.m g;
    public d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimilarShowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = g.c(R.id.popular_shows_fallback_description, this);
        this.c = g.c(R.id.panel_feed_recycler, this);
        this.d = g.c(R.id.similar_shows_error, this);
        this.e = g.c(R.id.show_page_similar_retry, this);
        this.f = f.b(new com.amazon.aps.iva.p40.l(context));
        this.g = f.b(new com.amazon.aps.iva.p40.j(this));
        View.inflate(context, R.layout.layout_similar_shows, this);
        getRecycler().addItemDecoration(new h0());
    }

    public static void G(SimilarShowsLayout similarShowsLayout) {
        j.f(similarShowsLayout, "this$0");
        similarShowsLayout.getPresenter().b();
    }

    private final ViewGroup getErrorLayout() {
        return (ViewGroup) this.d.getValue(this, i[2]);
    }

    private final View getPopularFallbackDescription() {
        return (View) this.b.getValue(this, i[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.p40.d getPresenter() {
        return (com.amazon.aps.iva.p40.d) this.g.getValue();
    }

    private final PanelFeedRecyclerView getRecycler() {
        return (PanelFeedRecyclerView) this.c.getValue(this, i[1]);
    }

    private final View getRetryButton() {
        return (View) this.e.getValue(this, i[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n getViewModel() {
        return (n) this.f.getValue();
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void D6(List<? extends h> list) {
        j.f(list, "data");
        d dVar = this.h;
        if (dVar != null) {
            dVar.e(list);
            getRecycler().setVisibility(0);
            return;
        }
        j.m("similarAdapter");
        throw null;
    }

    public final void G4(ContentContainer contentContainer, a aVar) {
        j.f(contentContainer, FirebaseAnalytics.Param.CONTENT);
        if (getRecycler().getAdapter() == null) {
            this.h = new d(aVar, new i(this));
            PanelFeedRecyclerView recycler = getRecycler();
            d dVar = this.h;
            if (dVar != null) {
                recycler.setAdapter(dVar);
            } else {
                j.m("similarAdapter");
                throw null;
            }
        }
        getPresenter().Z1(contentContainer);
        getRetryButton().setOnClickListener(new com.amazon.aps.iva.c8.h(this, 20));
    }

    public final void H6(com.amazon.aps.iva.b60.j jVar) {
        getPresenter().U0(jVar);
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void V4() {
        getPopularFallbackDescription().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    public int getSpanCount() {
        return getRecycler().getLayoutManager().a;
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void m() {
        getErrorLayout().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void s(int i2) {
        d dVar = this.h;
        if (dVar != null) {
            dVar.notifyItemChanged(i2);
        } else {
            j.m("similarAdapter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void t(Panel panel) {
        j.f(panel, "panel");
        Activity a = com.amazon.aps.iva.xw.q.a(getContext());
        j.c(a);
        Intent intent = new Intent(a, ShowPageActivity.class);
        intent.putExtra("show_page_input", new com.amazon.aps.iva.o40.j(f0.c(panel), f0.a(panel), null));
        a.startActivityForResult(intent, 228);
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void t0() {
        getRecycler().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void tg() {
        getPopularFallbackDescription().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.p40.m
    public final void y4() {
        getErrorLayout().setVisibility(0);
    }
}
