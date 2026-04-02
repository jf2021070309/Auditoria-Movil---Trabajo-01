package com.braze.ui.contentcards.recycler;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: SimpleItemTouchHelperCallback.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/braze/ui/contentcards/recycler/SimpleItemTouchHelperCallback;", "Landroidx/recyclerview/widget/q$d;", "", "isLongPressDragEnabled", "isItemViewSwipeEnabled", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$f0;", "viewHolder", "", "getMovementFlags", "target", "onMove", "direction", "Lcom/amazon/aps/iva/kb0/q;", "onSwiped", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "adapter", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "<init>", "(Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;)V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class SimpleItemTouchHelperCallback extends q.d {
    private final ItemTouchHelperAdapter adapter;

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        j.f(itemTouchHelperAdapter, "adapter");
        this.adapter = itemTouchHelperAdapter;
    }

    @Override // androidx.recyclerview.widget.q.d
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.f0 f0Var) {
        int i;
        j.f(recyclerView, "recyclerView");
        j.f(f0Var, "viewHolder");
        if (this.adapter.isItemDismissable(f0Var.getBindingAdapterPosition())) {
            i = 16;
        } else {
            i = 0;
        }
        return q.d.makeMovementFlags(0, i);
    }

    @Override // androidx.recyclerview.widget.q.d
    public boolean isItemViewSwipeEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.q.d
    public boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // androidx.recyclerview.widget.q.d
    public boolean onMove(RecyclerView recyclerView, RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
        j.f(recyclerView, "recyclerView");
        j.f(f0Var, "viewHolder");
        j.f(f0Var2, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.q.d
    public void onSwiped(RecyclerView.f0 f0Var, int i) {
        j.f(f0Var, "viewHolder");
        this.adapter.onItemDismiss(f0Var.getBindingAdapterPosition());
    }
}
