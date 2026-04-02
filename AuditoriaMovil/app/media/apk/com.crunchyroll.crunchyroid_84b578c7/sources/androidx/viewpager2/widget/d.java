package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class d extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public d(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.a.d();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.e != i) {
            viewPager2.e = i;
            viewPager2.u.b();
        }
    }
}
