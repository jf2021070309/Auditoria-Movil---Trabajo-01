package com.ellation.crunchyroll.presentation.content.panel;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: PanelFeedRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\n\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/panel/PanelFeedRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getSpanCount", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "getLayoutManager", "b", "Lcom/amazon/aps/iva/kb0/e;", "getGridLayoutManager", "()Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "gridLayoutManager", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public class PanelFeedRecyclerView extends RecyclerView {
    public final m b;

    /* compiled from: PanelFeedRecyclerView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<StaggeredGridLayoutManager> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final StaggeredGridLayoutManager invoke() {
            return new StaggeredGridLayoutManager(PanelFeedRecyclerView.this.getSpanCount());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PanelFeedRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StaggeredGridLayoutManager getGridLayoutManager() {
        return (StaggeredGridLayoutManager) this.b.getValue();
    }

    public int getSpanCount() {
        return getResources().getInteger(R.integer.panel_feed_span_count);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int spanCount = getSpanCount();
        if (isLaidOut()) {
            getGridLayoutManager().v(spanCount);
            RecyclerView.h adapter = getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new com.amazon.aps.iva.l00.a(this, spanCount));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelFeedRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = f.b(new a());
        setHasFixedSize(true);
        setLayoutManager(getGridLayoutManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public StaggeredGridLayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }
}
