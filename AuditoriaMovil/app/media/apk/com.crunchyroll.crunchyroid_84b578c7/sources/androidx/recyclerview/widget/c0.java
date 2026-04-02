package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class c0 extends com.amazon.aps.iva.p3.a {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public static class a extends com.amazon.aps.iva.p3.a {
        public final c0 a;
        public final WeakHashMap b = new WeakHashMap();

        public a(c0 c0Var) {
            this.a = c0Var;
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final com.amazon.aps.iva.q3.m getAccessibilityNodeProvider(View view) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) com.amazon.aps.iva.q3.l lVar) {
            c0 c0Var = this.a;
            if (!c0Var.shouldIgnore() && c0Var.mRecyclerView.getLayoutManager() != null) {
                c0Var.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, lVar);
                com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
                if (aVar != null) {
                    aVar.onInitializeAccessibilityNodeInfo(view, lVar);
                    return;
                } else {
                    super.onInitializeAccessibilityNodeInfo(view, lVar);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, lVar);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            c0 c0Var = this.a;
            if (!c0Var.shouldIgnore() && c0Var.mRecyclerView.getLayoutManager() != null) {
                com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
                if (aVar != null) {
                    if (aVar.performAccessibilityAction(view, i, bundle)) {
                        return true;
                    }
                } else if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                return c0Var.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
            }
            return super.performAccessibilityAction(view, i, bundle);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void sendAccessibilityEvent(View view, int i) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            com.amazon.aps.iva.p3.a aVar = (com.amazon.aps.iva.p3.a) this.b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public c0(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        com.amazon.aps.iva.p3.a itemDelegate = getItemDelegate();
        if (itemDelegate != null && (itemDelegate instanceof a)) {
            this.mItemDelegate = (a) itemDelegate;
        } else {
            this.mItemDelegate = new a(this);
        }
    }

    public com.amazon.aps.iva.p3.a getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // com.amazon.aps.iva.p3.a
    public void onInitializeAccessibilityEvent(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !shouldIgnore()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }

    @Override // com.amazon.aps.iva.p3.a
    public void onInitializeAccessibilityNodeInfo(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) com.amazon.aps.iva.q3.l lVar) {
        super.onInitializeAccessibilityNodeInfo(view, lVar);
        if (!shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(lVar);
        }
    }

    @Override // com.amazon.aps.iva.p3.a
    public boolean performAccessibilityAction(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (!shouldIgnore() && this.mRecyclerView.getLayoutManager() != null) {
            return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
        }
        return false;
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
