package com.amazon.aps.iva.y10;

import android.view.MotionEvent;
import android.view.View;
import com.ellation.crunchyroll.presentation.main.lists.tabs.MyListsTabLayout;
import com.google.android.material.tabs.TabLayout;
/* compiled from: ManageDownloadsAnimation.kt */
/* loaded from: classes2.dex */
public final class e {
    public final View a;
    public final TabLayout b;
    public int c;
    public int d;

    public e(MyListsTabLayout myListsTabLayout, View view) {
        com.amazon.aps.iva.yb0.j.f(view, "toolbarContainer");
        com.amazon.aps.iva.yb0.j.f(myListsTabLayout, "tabLayout");
        this.a = view;
        this.b = myListsTabLayout;
        if (view.isLaidOut()) {
            this.c = view.getHeight();
            this.d = myListsTabLayout.getHeight();
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new d(view, this));
    }

    public static final void a(e eVar, TabLayout tabLayout, final boolean z) {
        View customView;
        eVar.getClass();
        int tabCount = tabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(i);
            if (tabAt != null && (customView = tabAt.getCustomView()) != null) {
                customView.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.iva.y10.a
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        return !z;
                    }
                });
            }
        }
    }
}
