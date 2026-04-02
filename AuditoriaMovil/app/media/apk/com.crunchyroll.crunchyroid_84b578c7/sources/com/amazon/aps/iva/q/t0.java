package com.amazon.aps.iva.q;

import android.content.Context;
import android.view.View;
import com.crunchyroll.crunchyroid.R;
/* compiled from: PopupMenu.java */
/* loaded from: classes.dex */
public final class t0 {
    public final androidx.appcompat.view.menu.f a;
    public final androidx.appcompat.view.menu.i b;
    public a c;

    /* compiled from: PopupMenu.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public t0(Context context, View view) {
        androidx.appcompat.view.menu.f fVar = new androidx.appcompat.view.menu.f(context);
        this.a = fVar;
        fVar.setCallback(new r0(this));
        androidx.appcompat.view.menu.i iVar = new androidx.appcompat.view.menu.i(R.attr.popupMenuStyle, 0, context, view, fVar, false);
        this.b = iVar;
        iVar.g = 8388613;
        iVar.k = new s0(this);
    }
}
