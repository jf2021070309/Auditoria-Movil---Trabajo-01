package com.ellation.crunchyroll.ui.recycler;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: LoadMoreScrollListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0004H&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/ellation/crunchyroll/ui/recycler/LoadMoreScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$u;", "Landroidx/recyclerview/widget/RecyclerView;", "view", "", "dx", "dy", "Lcom/amazon/aps/iva/kb0/q;", "onScrolled", "reset", "totalItemCount", "", "isItemCountChanged", "getTotalItemCount", "getLastVisiblePosition", "Lcom/ellation/crunchyroll/ui/recycler/OnLoadMoreScrollListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ellation/crunchyroll/ui/recycler/OnLoadMoreScrollListener;", "previousTotalItemCount", "I", "getPreviousTotalItemCount", "()I", "setPreviousTotalItemCount", "(I)V", "loading", "Z", "getLoading", "()Z", "setLoading", "(Z)V", "<init>", "(Lcom/ellation/crunchyroll/ui/recycler/OnLoadMoreScrollListener;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class LoadMoreScrollListener extends RecyclerView.u {
    public static final int $stable = 8;
    private final OnLoadMoreScrollListener listener;
    private boolean loading;
    private int previousTotalItemCount;

    public LoadMoreScrollListener(OnLoadMoreScrollListener onLoadMoreScrollListener) {
        j.f(onLoadMoreScrollListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = onLoadMoreScrollListener;
        this.loading = true;
    }

    public abstract int getLastVisiblePosition();

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getPreviousTotalItemCount() {
        return this.previousTotalItemCount;
    }

    public abstract int getTotalItemCount();

    public abstract boolean isItemCountChanged(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        j.f(recyclerView, "view");
        int totalItemCount = getTotalItemCount();
        int lastVisiblePosition = getLastVisiblePosition();
        if (this.loading && isItemCountChanged(totalItemCount)) {
            this.loading = false;
            this.previousTotalItemCount = totalItemCount;
        }
        if (!this.loading && lastVisiblePosition == totalItemCount) {
            this.loading = true;
            this.listener.onLoadMore();
        }
    }

    public final void reset() {
        this.previousTotalItemCount = 0;
        this.loading = true;
    }

    public final void setLoading(boolean z) {
        this.loading = z;
    }

    public final void setPreviousTotalItemCount(int i) {
        this.previousTotalItemCount = i;
    }
}
