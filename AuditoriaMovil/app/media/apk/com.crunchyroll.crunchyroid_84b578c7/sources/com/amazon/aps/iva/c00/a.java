package com.amazon.aps.iva.c00;

import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.IOException;
/* compiled from: StreamsInteractor.kt */
/* loaded from: classes2.dex */
public final class a extends IOException {
    public final PlayableAsset b;

    static {
        int i = PlayableAsset.$stable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PlayableAsset playableAsset) {
        super(com.amazon.aps.iva.c.b.a("No streams found for asset - ", playableAsset.getTitle(), " with id - ", playableAsset.getId()));
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        this.b = playableAsset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && com.amazon.aps.iva.yb0.j.a(this.b, ((a) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "NoStreamForAssetException(asset=" + this.b + ")";
    }
}
