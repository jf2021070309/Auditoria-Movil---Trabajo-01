package androidx.viewpager2.adapter;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class a extends ViewPager2.e {
    public final /* synthetic */ FragmentStateAdapter.b a;

    public a(FragmentStateAdapter.b bVar) {
        this.a = bVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        this.a.b(false);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        this.a.b(false);
    }
}
