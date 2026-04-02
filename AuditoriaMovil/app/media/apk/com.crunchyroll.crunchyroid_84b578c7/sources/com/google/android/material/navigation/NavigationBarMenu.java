package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import com.amazon.aps.iva.k.q;
/* loaded from: classes3.dex */
public final class NavigationBarMenu extends f {
    private final int maxItemCount;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    @Override // androidx.appcompat.view.menu.f
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i, i2, i3, charSequence);
            if (addInternal instanceof h) {
                ((h) addInternal).f(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder c = q.c("Maximum number of items supported by ", simpleName, " is ");
        c.append(this.maxItemCount);
        c.append(". Limit can be checked with ");
        c.append(simpleName);
        c.append("#getMaxItemCount()");
        throw new IllegalArgumentException(c.toString());
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
