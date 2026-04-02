package com.amazon.aps.iva.x1;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.amazon.aps.iva.e1.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.v1.r0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: TextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public final class c {
    public final com.amazon.aps.iva.xb0.a<q> a;
    public e b;
    public com.amazon.aps.iva.xb0.a<q> c;
    public com.amazon.aps.iva.xb0.a<q> d;
    public com.amazon.aps.iva.xb0.a<q> e;
    public com.amazon.aps.iva.xb0.a<q> f;

    public c(r0.a aVar) {
        e eVar = e.e;
        this.a = aVar;
        this.b = eVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public static void a(Menu menu, b bVar) {
        j.f(menu, "menu");
        j.f(bVar, "item");
        menu.add(0, bVar.getId(), bVar.getOrder(), bVar.getTitleResource()).setShowAsAction(1);
    }

    public static void b(Menu menu, b bVar, com.amazon.aps.iva.xb0.a aVar) {
        if (aVar != null && menu.findItem(bVar.getId()) == null) {
            a(menu, bVar);
        } else if (aVar == null && menu.findItem(bVar.getId()) != null) {
            menu.removeItem(bVar.getId());
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        j.c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.getId()) {
            com.amazon.aps.iva.xb0.a<q> aVar = this.c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.Paste.getId()) {
            com.amazon.aps.iva.xb0.a<q> aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.Cut.getId()) {
            com.amazon.aps.iva.xb0.a<q> aVar3 = this.e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == b.SelectAll.getId()) {
            com.amazon.aps.iva.xb0.a<q> aVar4 = this.f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
            return true;
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu != null) {
            if (actionMode != null) {
                if (this.c != null) {
                    a(menu, b.Copy);
                }
                if (this.d != null) {
                    a(menu, b.Paste);
                }
                if (this.e != null) {
                    a(menu, b.Cut);
                }
                if (this.f != null) {
                    a(menu, b.SelectAll);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
