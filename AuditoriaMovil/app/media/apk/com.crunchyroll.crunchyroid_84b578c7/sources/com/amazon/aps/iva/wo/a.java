package com.amazon.aps.iva.wo;

import com.crunchyroll.downloading.presentation.download.button.DownloadButtonState;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenAssetsAdapterModel.kt */
/* loaded from: classes2.dex */
public final class a implements g, com.amazon.aps.iva.qg.c<a> {
    public final String b;
    public final com.amazon.aps.iva.kz.i c;
    public final DownloadButtonState d;
    public final PlayableAsset e;

    public a(String str, com.amazon.aps.iva.kz.i iVar, DownloadButtonState downloadButtonState, PlayableAsset playableAsset) {
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        com.amazon.aps.iva.yb0.j.f(iVar, "data");
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
        com.amazon.aps.iva.yb0.j.f(playableAsset, "rawData");
        this.b = str;
        this.c = iVar;
        this.d = downloadButtonState;
        this.e = playableAsset;
    }

    @Override // com.amazon.aps.iva.qg.c
    public final a a(DownloadButtonState downloadButtonState) {
        com.amazon.aps.iva.yb0.j.f(downloadButtonState, "downloadButtonState");
        String str = this.b;
        com.amazon.aps.iva.yb0.j.f(str, "adapterId");
        com.amazon.aps.iva.kz.i iVar = this.c;
        com.amazon.aps.iva.yb0.j.f(iVar, "data");
        PlayableAsset playableAsset = this.e;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "rawData");
        return new a(str, iVar, downloadButtonState, playableAsset);
    }

    @Override // com.amazon.aps.iva.qg.c
    public final String b() {
        return this.c.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, aVar.b) && com.amazon.aps.iva.yb0.j.a(this.c, aVar.c) && com.amazon.aps.iva.yb0.j.a(this.d, aVar.d) && com.amazon.aps.iva.yb0.j.a(this.e, aVar.e)) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.wo.g
    public final String getAdapterId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode();
        int hashCode2 = this.d.hashCode();
        return this.e.hashCode() + ((hashCode2 + ((hashCode + (this.b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WatchScreenAssetAdapterModel(adapterId=" + this.b + ", data=" + this.c + ", downloadButtonState=" + this.d + ", rawData=" + this.e + ")";
    }
}
