package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: CompositeOnPageChangeCallback.java */
/* loaded from: classes.dex */
public final class a extends ViewPager2.e {
    public final ArrayList a = new ArrayList(3);

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrollStateChanged(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageScrolled(int i, float f, int i2) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void onPageSelected(int i) {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.e) it.next()).onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
