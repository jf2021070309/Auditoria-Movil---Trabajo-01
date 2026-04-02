package com.amazon.aps.iva.wo;

import androidx.recyclerview.widget.n;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
/* compiled from: WatchScreenAssetsDiffCallback.kt */
/* loaded from: classes2.dex */
public final class h extends n.e<g> {
    public static final h a = new h();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        com.amazon.aps.iva.yb0.j.f(gVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(gVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(gVar3, gVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        com.amazon.aps.iva.yb0.j.f(gVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(gVar4, "newItem");
        if ((gVar3 instanceof a) && (gVar4 instanceof a)) {
            return com.amazon.aps.iva.yb0.j.a(((a) gVar3).c.a, ((a) gVar4).c.a);
        }
        return com.amazon.aps.iva.yb0.j.a(gVar3.getAdapterId(), gVar4.getAdapterId());
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(g gVar, g gVar2) {
        g gVar3 = gVar;
        g gVar4 = gVar2;
        com.amazon.aps.iva.yb0.j.f(gVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(gVar4, "newItem");
        if ((gVar3 instanceof a) && (gVar4 instanceof a)) {
            DownloadButtonState downloadButtonState = ((a) gVar3).d;
            DownloadButtonState downloadButtonState2 = ((a) gVar4).d;
            if (!com.amazon.aps.iva.yb0.j.a(downloadButtonState2, downloadButtonState)) {
                return downloadButtonState2;
            }
        }
        return null;
    }
}
