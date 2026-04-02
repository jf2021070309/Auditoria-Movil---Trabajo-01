package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class e extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public e(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        ViewPager2 viewPager2 = this.a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.k.requestFocus(2);
        }
    }
}
