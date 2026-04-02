package com.amazon.aps.iva.x1;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.amazon.aps.iva.e1.e;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.j;
/* compiled from: FloatingTextActionModeCallback.android.kt */
/* loaded from: classes.dex */
public final class a extends ActionMode.Callback2 {
    public final c a;

    public a(c cVar) {
        j.f(cVar, "callback");
        this.a = cVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.c(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.a.d(actionMode, menu);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        com.amazon.aps.iva.xb0.a<q> aVar = this.a.a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        e eVar = this.a.b;
        if (rect != null) {
            rect.set((int) eVar.a, (int) eVar.b, (int) eVar.c, (int) eVar.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        c cVar = this.a;
        cVar.getClass();
        if (actionMode != null && menu != null) {
            c.b(menu, b.Copy, cVar.c);
            c.b(menu, b.Paste, cVar.d);
            c.b(menu, b.Cut, cVar.e);
            c.b(menu, b.SelectAll, cVar.f);
            return true;
        }
        return false;
    }
}
