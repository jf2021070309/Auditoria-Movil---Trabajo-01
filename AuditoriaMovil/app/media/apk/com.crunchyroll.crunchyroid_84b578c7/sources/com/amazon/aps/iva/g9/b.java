package com.amazon.aps.iva.g9;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class b extends FragmentManager.l {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FragmentStateAdapter c;

    public b(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.c = fragmentStateAdapter;
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.l
    public final void j(FragmentManager fragmentManager, Fragment fragment, View view) {
        if (fragment == this.a) {
            fragmentManager.h0(this);
            this.c.getClass();
            FragmentStateAdapter.d(view, this.b);
        }
    }
}
