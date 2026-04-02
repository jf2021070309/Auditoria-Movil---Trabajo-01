package com.ellation.crunchyroll.ui.recycler;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.amazon.aps.iva.yb0.j;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: LinearLoadMoreScrollListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ellation/crunchyroll/ui/recycler/LinearLoadMoreScrollListener;", "Lcom/ellation/crunchyroll/ui/recycler/LoadMoreScrollListener;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ellation/crunchyroll/ui/recycler/OnLoadMoreScrollListener;", "(Landroidx/recyclerview/widget/LinearLayoutManager;Lcom/ellation/crunchyroll/ui/recycler/OnLoadMoreScrollListener;)V", "getLastVisiblePosition", "", "getTotalItemCount", "isItemCountChanged", "", "totalItemCount", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinearLoadMoreScrollListener extends LoadMoreScrollListener {
    public static final int $stable = 8;
    private final LinearLayoutManager layoutManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearLoadMoreScrollListener(LinearLayoutManager linearLayoutManager, OnLoadMoreScrollListener onLoadMoreScrollListener) {
        super(onLoadMoreScrollListener);
        j.f(linearLayoutManager, "layoutManager");
        j.f(onLoadMoreScrollListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.layoutManager = linearLayoutManager;
    }

    @Override // com.ellation.crunchyroll.ui.recycler.LoadMoreScrollListener
    public int getLastVisiblePosition() {
        return this.layoutManager.findLastCompletelyVisibleItemPosition() + 1;
    }

    @Override // com.ellation.crunchyroll.ui.recycler.LoadMoreScrollListener
    public int getTotalItemCount() {
        return this.layoutManager.getItemCount();
    }

    @Override // com.ellation.crunchyroll.ui.recycler.LoadMoreScrollListener
    public boolean isItemCountChanged(int i) {
        if (i > getPreviousTotalItemCount()) {
            return true;
        }
        return false;
    }
}
