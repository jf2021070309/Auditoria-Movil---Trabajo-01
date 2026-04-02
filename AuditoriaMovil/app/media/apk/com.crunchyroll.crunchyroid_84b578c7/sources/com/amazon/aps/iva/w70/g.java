package com.amazon.aps.iva.w70;

import com.amazon.aps.iva.yb0.j;
import com.google.android.material.tabs.TabLayout;
/* compiled from: SimpleOnTabSelectedListener.kt */
/* loaded from: classes2.dex */
public class g implements TabLayout.OnTabSelectedListener {
    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        j.f(tab, "tab");
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        j.f(tab, "tab");
    }
}
