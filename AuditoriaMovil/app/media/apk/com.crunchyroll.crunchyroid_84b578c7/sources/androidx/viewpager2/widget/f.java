package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
/* compiled from: ViewPager2.java */
/* loaded from: classes.dex */
public final class f extends ViewPager2.c {
    public final /* synthetic */ ViewPager2.f a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ViewPager2.f fVar) {
        super(0);
        this.a = fVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.c, androidx.recyclerview.widget.RecyclerView.j
    public final void onChanged() {
        this.a.b();
    }
}
