package com.amazon.aps.iva.p;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import com.amazon.aps.iva.x.h;
/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class b {
    public final Context a;
    public h<com.amazon.aps.iva.i3.b, MenuItem> b;
    public h<com.amazon.aps.iva.i3.c, SubMenu> c;

    public b(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof com.amazon.aps.iva.i3.b) {
            com.amazon.aps.iva.i3.b bVar = (com.amazon.aps.iva.i3.b) menuItem;
            if (this.b == null) {
                this.b = new h<>();
            }
            MenuItem orDefault = this.b.getOrDefault(bVar, null);
            if (orDefault == null) {
                c cVar = new c(this.a, bVar);
                this.b.put(bVar, cVar);
                return cVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof com.amazon.aps.iva.i3.c) {
            com.amazon.aps.iva.i3.c cVar = (com.amazon.aps.iva.i3.c) subMenu;
            if (this.c == null) {
                this.c = new h<>();
            }
            SubMenu orDefault = this.c.getOrDefault(cVar, null);
            if (orDefault == null) {
                g gVar = new g(this.a, cVar);
                this.c.put(cVar, gVar);
                return gVar;
            }
            return orDefault;
        }
        return subMenu;
    }
}
