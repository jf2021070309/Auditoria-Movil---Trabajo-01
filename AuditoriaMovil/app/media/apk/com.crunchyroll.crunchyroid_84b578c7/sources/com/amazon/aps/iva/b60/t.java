package com.amazon.aps.iva.b60;

import android.util.SparseIntArray;
import android.view.View;
import com.amazon.aps.iva.xx.g;
/* compiled from: WatchlistItemDelegate.kt */
/* loaded from: classes2.dex */
public final class t extends com.amazon.aps.iva.xx.f implements com.amazon.aps.iva.wx.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SparseIntArray sparseIntArray, c cVar) {
        super(sparseIntArray, cVar);
        com.amazon.aps.iva.yb0.j.f(sparseIntArray, "scrollPositions");
    }

    @Override // com.amazon.aps.iva.wx.c
    public final void G(com.amazon.aps.iva.xx.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "collectionItem");
        View view = this.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.watchlist.WatchlistCarouselView");
        ((h) view).Ah((g.c.b) gVar);
        b1();
    }
}
