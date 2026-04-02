package com.amazon.aps.iva.g9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ d c;
    public final /* synthetic */ FragmentStateAdapter d;

    public a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, d dVar) {
        this.d = fragmentStateAdapter;
        this.b = frameLayout;
        this.c = dVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.b;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.d.h(this.c);
        }
    }
}
