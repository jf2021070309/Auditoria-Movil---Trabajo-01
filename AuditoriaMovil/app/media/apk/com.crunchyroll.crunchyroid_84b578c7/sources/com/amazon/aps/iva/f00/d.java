package com.amazon.aps.iva.f00;

import androidx.recyclerview.widget.n;
import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
/* compiled from: PlayableAssetsAdapter.kt */
/* loaded from: classes2.dex */
public final class d extends n.e<a> {
    public static final d a = new d();

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areContentsTheSame(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(aVar4, "newItem");
        return com.amazon.aps.iva.yb0.j.a(aVar3, aVar4);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean areItemsTheSame(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(aVar4, "newItem");
        if ((aVar3 instanceof e) && (aVar4 instanceof q)) {
            return com.amazon.aps.iva.yb0.j.a(aVar3.getAdapterId(), ((q) aVar4).v);
        }
        return com.amazon.aps.iva.yb0.j.a(aVar3.getAdapterId(), aVar4.getAdapterId());
    }

    @Override // androidx.recyclerview.widget.n.e
    public final Object getChangePayload(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        com.amazon.aps.iva.yb0.j.f(aVar3, "oldItem");
        com.amazon.aps.iva.yb0.j.f(aVar4, "newItem");
        if ((aVar3 instanceof q) && (aVar4 instanceof q)) {
            DownloadButtonState downloadButtonState = ((q) aVar4).p;
            if (!com.amazon.aps.iva.yb0.j.a(downloadButtonState, ((q) aVar3).p)) {
                return downloadButtonState;
            }
        }
        return null;
    }
}
