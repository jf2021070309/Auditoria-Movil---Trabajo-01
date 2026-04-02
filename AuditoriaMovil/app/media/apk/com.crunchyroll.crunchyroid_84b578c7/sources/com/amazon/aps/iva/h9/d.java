package com.amazon.aps.iva.h9;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class d implements RecyclerView.r {
    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void b(View view) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) qVar).width == -1 && ((ViewGroup.MarginLayoutParams) qVar).height == -1) {
            return;
        }
        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void a(View view) {
    }
}
