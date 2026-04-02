package com.amazon.aps.iva.ni;

import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: WatchMusicUiModel.kt */
/* loaded from: classes.dex */
public final class p {
    public final MusicAsset a;
    public final com.amazon.aps.iva.qi.g b;

    public p(MusicAsset musicAsset, com.amazon.aps.iva.qi.g gVar) {
        this.a = musicAsset;
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, pVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, pVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WatchMusicUiModel(currentAsset=" + this.a + ", summary=" + this.b + ")";
    }
}
