package com.amazon.aps.iva.yx;

import android.util.SparseIntArray;
import android.view.View;
import com.amazon.aps.iva.zx.a;
/* compiled from: FeedCarouselItemDelegate.kt */
/* loaded from: classes2.dex */
public final class k<T extends com.amazon.aps.iva.zx.a> extends com.amazon.aps.iva.xx.f implements com.amazon.aps.iva.wx.c {
    public final com.amazon.aps.iva.zx.b<T> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SparseIntArray sparseIntArray, com.amazon.aps.iva.zx.b<T> bVar) {
        super(sparseIntArray, bVar);
        com.amazon.aps.iva.yb0.j.f(sparseIntArray, "scrollPositions");
        this.e = bVar;
    }

    @Override // com.amazon.aps.iva.wx.c
    public final void G(com.amazon.aps.iva.xx.g gVar) {
        com.amazon.aps.iva.yb0.j.f(gVar, "collectionItem");
        View view = this.itemView;
        com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.feed.smoothcarousel.SmoothCarouselLayout");
        ((com.amazon.aps.iva.iy.c) view).nc(gVar.b());
    }
}
