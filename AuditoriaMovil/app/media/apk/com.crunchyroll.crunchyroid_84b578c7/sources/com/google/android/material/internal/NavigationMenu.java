package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
/* loaded from: classes3.dex */
public class NavigationMenu extends f {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        h hVar = (h) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, hVar);
        hVar.o = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(hVar.e);
        return navigationSubMenu;
    }
}
