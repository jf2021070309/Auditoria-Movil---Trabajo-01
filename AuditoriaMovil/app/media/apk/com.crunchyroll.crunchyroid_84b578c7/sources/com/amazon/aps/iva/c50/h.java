package com.amazon.aps.iva.c50;

import android.view.View;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Images;
/* compiled from: WatchlistItemProvider.kt */
/* loaded from: classes2.dex */
public final class h extends i {
    public h(e eVar) {
        super(eVar);
    }

    public final void b1(com.amazon.aps.iva.e60.a aVar) {
        Images images;
        View view = this.itemView;
        j.d(view, "null cannot be cast to non-null type com.ellation.crunchyroll.presentation.watchlist.adapter.WatchlistItemLayout");
        f fVar = ((e) view).j;
        fVar.getClass();
        if (aVar != null && (images = aVar.c) != null) {
            fVar.getView().setThumbnailImage(images.getPostersTall());
        }
    }
}
