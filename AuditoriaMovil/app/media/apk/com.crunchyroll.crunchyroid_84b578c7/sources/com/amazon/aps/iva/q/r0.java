package com.amazon.aps.iva.q;

import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import com.amazon.aps.iva.q.t0;
/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public final class r0 implements f.a {
    public final /* synthetic */ t0 b;

    public r0(t0 t0Var) {
        this.b = t0Var;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean onMenuItemSelected(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        t0.a aVar = this.b.c;
        if (aVar != null) {
            com.amazon.aps.iva.a70.h hVar = (com.amazon.aps.iva.a70.h) ((com.amazon.aps.iva.g1.q) aVar).c;
            com.amazon.aps.iva.yb0.j.f(hVar, "this$0");
            return hVar.e.r6(menuItem.getItemId());
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void onMenuModeChange(androidx.appcompat.view.menu.f fVar) {
    }
}
