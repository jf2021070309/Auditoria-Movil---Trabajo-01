package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.m;
/* loaded from: classes3.dex */
public class NavigationSubMenu extends m {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, h hVar) {
        super(context, navigationMenu, hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((f) getParentMenu()).onItemsChanged(z);
    }
}
