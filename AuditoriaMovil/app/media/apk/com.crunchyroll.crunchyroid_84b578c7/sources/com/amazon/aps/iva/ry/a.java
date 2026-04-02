package com.amazon.aps.iva.ry;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CrunchyrollPagerAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends FragmentStateAdapter {
    public final b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Fragment fragment, b bVar) {
        super(fragment);
        j.f(fragment, "fragment");
        j.f(bVar, "fragmentProvider");
        this.i = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.i.p().size();
    }
}
