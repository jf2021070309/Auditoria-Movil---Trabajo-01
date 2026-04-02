package com.amazon.aps.iva.l8;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.amazon.aps.iva.q3.l;
/* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
@Deprecated
/* loaded from: classes.dex */
public final class f extends c0 {
    public final RecyclerView a;
    public final com.amazon.aps.iva.p3.a b;
    public final a c;

    /* compiled from: PreferenceRecyclerViewAccessibilityDelegate.java */
    /* loaded from: classes.dex */
    public class a extends com.amazon.aps.iva.p3.a {
        public a() {
        }

        @Override // com.amazon.aps.iva.p3.a
        public final void onInitializeAccessibilityNodeInfo(View view, l lVar) {
            f fVar = f.this;
            fVar.b.onInitializeAccessibilityNodeInfo(view, lVar);
            int childAdapterPosition = fVar.a.getChildAdapterPosition(view);
            RecyclerView.h adapter = fVar.a.getAdapter();
            if (!(adapter instanceof androidx.preference.c)) {
                return;
            }
            ((androidx.preference.c) adapter).f(childAdapterPosition);
        }

        @Override // com.amazon.aps.iva.p3.a
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return f.this.b.performAccessibilityAction(view, i, bundle);
        }
    }

    public f(RecyclerView recyclerView) {
        super(recyclerView);
        this.b = super.getItemDelegate();
        this.c = new a();
        this.a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.c0
    public final com.amazon.aps.iva.p3.a getItemDelegate() {
        return this.c;
    }
}
