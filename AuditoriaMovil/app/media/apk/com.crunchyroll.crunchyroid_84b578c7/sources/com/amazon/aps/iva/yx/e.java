package com.amazon.aps.iva.yx;

import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.xx.g;
/* compiled from: ContinueWatchingItemDelegate.kt */
/* loaded from: classes2.dex */
public final class e extends RecyclerView.f0 implements com.amazon.aps.iva.wx.c {
    public final com.amazon.aps.iva.mt.i b;

    public e(com.amazon.aps.iva.mt.i iVar) {
        super(iVar);
        this.b = iVar;
    }

    @Override // com.amazon.aps.iva.wx.c
    public final void G(com.amazon.aps.iva.xx.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "collectionItem");
        com.amazon.aps.iva.mt.i iVar = this.b;
        iVar.setItems$home_feed_release(((g.c.a) gVar).i);
        iVar.l(0);
    }
}
