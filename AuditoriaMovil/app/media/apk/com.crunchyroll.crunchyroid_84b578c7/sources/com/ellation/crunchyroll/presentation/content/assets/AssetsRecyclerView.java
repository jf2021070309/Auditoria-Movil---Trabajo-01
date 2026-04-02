package com.ellation.crunchyroll.presentation.content.assets;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.d00.c;
import com.amazon.aps.iva.d00.d;
import com.amazon.aps.iva.d00.f;
import com.amazon.aps.iva.f00.u;
import com.amazon.aps.iva.f00.v;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssetsRecyclerView.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\f\u001a\u00020\u0007H\u0016R\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/assets/AssetsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/amazon/aps/iva/d00/f;", "Landroidx/recyclerview/widget/GridLayoutManager;", "layout", "Lcom/amazon/aps/iva/kb0/q;", "setLayoutManager", "", "spanCount", "setSpanCount", "Lcom/amazon/aps/iva/d00/b;", "getAssetsComponent", "getGridLayoutManagerSpanCount", "Lcom/amazon/aps/iva/d00/c;", "b", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/d00/c;", "presenter", "Lcom/amazon/aps/iva/d00/a;", "getAssetItemViewInteractionListener", "()Lcom/amazon/aps/iva/d00/a;", "assetItemViewInteractionListener", "Lcom/amazon/aps/iva/f00/u;", "getAssetsAdapter", "()Lcom/amazon/aps/iva/f00/u;", "assetsAdapter", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AssetsRecyclerView extends RecyclerView implements f {
    public final m b;

    /* compiled from: AssetsRecyclerView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<d> {
        public final /* synthetic */ Context h;
        public final /* synthetic */ AssetsRecyclerView i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, AssetsRecyclerView assetsRecyclerView) {
            super(0);
            this.h = context;
            this.i = assetsRecyclerView;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            boolean c = k.n(this.h).c();
            AssetsRecyclerView assetsRecyclerView = this.i;
            d dVar = new d(c, assetsRecyclerView);
            com.ellation.crunchyroll.mvp.lifecycle.a.b(dVar, assetsRecyclerView);
            return dVar;
        }
    }

    /* compiled from: AssetsRecyclerView.kt */
    /* loaded from: classes2.dex */
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            if (i == -1) {
                return 1;
            }
            AssetsRecyclerView assetsRecyclerView = AssetsRecyclerView.this;
            return assetsRecyclerView.getPresenter().D4(assetsRecyclerView.getAssetsAdapter().getItemViewType(i));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssetsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c getPresenter() {
        return (c) this.b.getValue();
    }

    private final void setLayoutManager(GridLayoutManager gridLayoutManager) {
        gridLayoutManager.g = new b();
        super.setLayoutManager((RecyclerView.p) gridLayoutManager);
    }

    private final void setSpanCount(int i) {
        RecyclerView.p layoutManager = getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).g(i);
    }

    @Override // com.amazon.aps.iva.d00.f
    public final void R(List<? extends com.amazon.aps.iva.f00.a> list) {
        j.f(list, "assets");
        getAssetsAdapter().e(list);
    }

    @Override // com.amazon.aps.iva.d00.f
    public final boolean S0() {
        Configuration configuration = getResources().getConfiguration();
        if (configuration == null || configuration.orientation != 2) {
            return false;
        }
        return true;
    }

    @Override // com.amazon.aps.iva.d00.f
    public final Integer W7(String str) {
        v vVar;
        String str2;
        j.f(str, "seasonId");
        List<T> list = getAssetsAdapter().a.f;
        j.e(list, "assetsAdapter.currentList");
        Iterator it = list.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                com.amazon.aps.iva.f00.a aVar = (com.amazon.aps.iva.f00.a) it.next();
                if (aVar instanceof v) {
                    vVar = (v) aVar;
                } else {
                    vVar = null;
                }
                if (vVar != null) {
                    str2 = vVar.b;
                } else {
                    str2 = null;
                }
                if (j.a(str, str2)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() >= 0) {
            z = true;
        }
        if (!z) {
            return null;
        }
        return valueOf;
    }

    @Override // com.amazon.aps.iva.d00.f
    public final void Wc() {
        setSpanCount(1);
    }

    @Override // com.amazon.aps.iva.d00.f
    public final void Y0(int i) {
        RecyclerView.p layoutManager = getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
    }

    @Override // com.amazon.aps.iva.d00.f
    public final void b9() {
        setSpanCount(getResources().getInteger(R.integer.episode_list_columns_count));
    }

    public final com.amazon.aps.iva.d00.a getAssetItemViewInteractionListener() {
        return getPresenter();
    }

    public final u getAssetsAdapter() {
        RecyclerView.h adapter = getAdapter();
        j.d(adapter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.list.item.PlayableAssetsAdapter");
        return (u) adapter;
    }

    public final com.amazon.aps.iva.d00.b getAssetsComponent() {
        c presenter = getPresenter();
        j.d(presenter, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.content.assets.AssetsComponent");
        return (com.amazon.aps.iva.d00.b) presenter;
    }

    @Override // com.amazon.aps.iva.d00.f
    public int getGridLayoutManagerSpanCount() {
        RecyclerView.p layoutManager = getLayoutManager();
        j.d(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        return ((GridLayoutManager) layoutManager).b;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        getPresenter().onConfigurationChanged(configuration);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = com.amazon.aps.iva.kb0.f.b(new a(context, this));
        setLayoutManager(new GridLayoutManager(context, attributeSet, i, 0));
        RecyclerView.m itemAnimator = getItemAnimator();
        if (itemAnimator == null) {
            return;
        }
        itemAnimator.f = 0L;
    }
}
