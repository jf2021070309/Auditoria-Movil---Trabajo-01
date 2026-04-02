package c.b.h.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
/* loaded from: classes.dex */
public abstract class c {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public c.f.h<c.i.f.a.b, MenuItem> f969b;

    /* renamed from: c  reason: collision with root package name */
    public c.f.h<c.i.f.a.c, SubMenu> f970c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof c.i.f.a.b) {
            c.i.f.a.b bVar = (c.i.f.a.b) menuItem;
            if (this.f969b == null) {
                this.f969b = new c.f.h<>();
            }
            MenuItem orDefault = this.f969b.getOrDefault(menuItem, null);
            if (orDefault == null) {
                j jVar = new j(this.a, bVar);
                this.f969b.put(bVar, jVar);
                return jVar;
            }
            return orDefault;
        }
        return menuItem;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (subMenu instanceof c.i.f.a.c) {
            c.i.f.a.c cVar = (c.i.f.a.c) subMenu;
            if (this.f970c == null) {
                this.f970c = new c.f.h<>();
            }
            SubMenu subMenu2 = this.f970c.get(cVar);
            if (subMenu2 == null) {
                s sVar = new s(this.a, cVar);
                this.f970c.put(cVar, sVar);
                return sVar;
            }
            return subMenu2;
        }
        return subMenu;
    }
}
