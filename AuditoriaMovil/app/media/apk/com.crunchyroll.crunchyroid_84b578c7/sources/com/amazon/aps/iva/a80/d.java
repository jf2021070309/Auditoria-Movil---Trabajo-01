package com.amazon.aps.iva.a80;

import android.view.View;
import com.google.android.material.tabs.TabLayout;
/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class d implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ h c;

    public d(TabLayout tabLayout, h hVar) {
        this.b = tabLayout;
        this.c = hVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        this.b.removeOnAttachStateChangeListener(this);
        h hVar = this.c;
        int tabCount = hVar.c.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = hVar.c.getTabAt(i);
            com.amazon.aps.iva.yb0.j.c(tabAt);
            View customView = tabAt.getCustomView();
            if (customView == null) {
                customView = tabAt.view;
            }
            customView.setOnTouchListener(new b(new e(hVar, i)));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
    }
}
