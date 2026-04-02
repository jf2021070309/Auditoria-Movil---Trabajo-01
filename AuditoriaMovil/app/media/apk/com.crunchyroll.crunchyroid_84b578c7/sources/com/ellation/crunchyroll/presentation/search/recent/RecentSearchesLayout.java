package com.ellation.crunchyroll.presentation.search.recent;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ne.a;
import com.amazon.aps.iva.q30.b;
import com.amazon.aps.iva.q30.d;
import com.amazon.aps.iva.q30.o;
import com.amazon.aps.iva.q30.p;
import com.amazon.aps.iva.q30.w;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.beloo.widget.chipslayoutmanager.ChipsLayoutManager;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.animation.AnimationUtil;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RecentSearchesView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/ellation/crunchyroll/presentation/search/recent/RecentSearchesLayout;", "Landroid/widget/RelativeLayout;", "Lcom/amazon/aps/iva/q30/w;", "", "Lcom/amazon/aps/iva/q30/b;", "recentSearches", "Lcom/amazon/aps/iva/kb0/q;", "setRecentSearches", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/TextView;", "c", "getClearRecentSearchesButton", "()Landroid/widget/TextView;", "clearRecentSearchesButton", "Lcom/amazon/aps/iva/q30/q;", "d", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/q30/q;", "presenter", "Lcom/amazon/aps/iva/q30/d;", "e", "getRecentSearchesAdapter", "()Lcom/amazon/aps/iva/q30/d;", "recentSearchesAdapter", "Landroidx/lifecycle/g;", "getLifecycle", "()Landroidx/lifecycle/g;", "lifecycle", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class RecentSearchesLayout extends RelativeLayout implements w {
    public static final /* synthetic */ l<Object>[] f = {q.a(RecentSearchesLayout.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(RecentSearchesLayout.class, "clearRecentSearchesButton", "getClearRecentSearchesButton()Landroid/widget/TextView;", 0)};
    public final v b;
    public final v c;
    public final m d;
    public final m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentSearchesLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        j.f(context, "context");
        this.b = g.c(R.id.recent_searches_recycler_view, this);
        this.c = g.c(R.id.clear_recent_searches_button, this);
        this.d = f.b(new o(this, context));
        this.e = f.b(new p(this));
        ChipsLayoutManager chipsLayoutManager = new ChipsLayoutManager(context);
        ChipsLayoutManager.b bVar = new ChipsLayoutManager.b(chipsLayoutManager);
        bVar.a = 48;
        chipsLayoutManager.f = false;
        chipsLayoutManager.e = new com.amazon.aps.iva.g1.f(9);
        if (k.n(context).c()) {
            i = 1;
        } else {
            i = 2;
        }
        if (i == 1 || i == 2) {
            chipsLayoutManager.h = i;
        }
        chipsLayoutManager.i = k.n(context).c() ? 1 : 4;
        ChipsLayoutManager a = bVar.a();
        View.inflate(context, R.layout.layout_recent_searches, this);
        getClearRecentSearchesButton().setOnClickListener(new a(this, 18));
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setLayoutManager(a);
        Resources resources = context.getResources();
        j.e(resources, "context.resources");
        recyclerView.addItemDecoration(new com.amazon.aps.iva.q30.a(resources));
        recyclerView.setAdapter(getRecentSearchesAdapter());
    }

    public static void G(RecentSearchesLayout recentSearchesLayout) {
        j.f(recentSearchesLayout, "this$0");
        recentSearchesLayout.getPresenter().B5();
    }

    private final TextView getClearRecentSearchesButton() {
        return (TextView) this.c.getValue(this, f[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.amazon.aps.iva.q30.q getPresenter() {
        return (com.amazon.aps.iva.q30.q) this.d.getValue();
    }

    private final d getRecentSearchesAdapter() {
        return (d) this.e.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.b.getValue(this, f[0]);
    }

    @Override // com.amazon.aps.iva.q30.w
    public final void Pg() {
        setVisibility(0);
    }

    @Override // com.amazon.aps.iva.q30.w
    public final void fe() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.i5.o
    public androidx.lifecycle.g getLifecycle() {
        return t0.d(this).getLifecycle();
    }

    @Override // com.amazon.aps.iva.q30.w
    public final void hd() {
        AnimationUtil.INSTANCE.showViewWithFade(this);
    }

    @Override // com.amazon.aps.iva.q30.w
    public final boolean isVisible() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.q30.w
    public final void se() {
        AnimationUtil.INSTANCE.hideViewWithFade(this);
    }

    @Override // com.amazon.aps.iva.q30.w
    public void setRecentSearches(List<b> list) {
        j.f(list, "recentSearches");
        getRecentSearchesAdapter().e(list);
    }
}
