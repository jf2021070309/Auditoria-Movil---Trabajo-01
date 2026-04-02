package com.amazon.aps.iva.g9;

import androidx.viewpager2.adapter.FragmentStateAdapter;
/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ FragmentStateAdapter b;

    public c(FragmentStateAdapter fragmentStateAdapter) {
        this.b = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.b;
        fragmentStateAdapter.g = false;
        fragmentStateAdapter.f();
    }
}
