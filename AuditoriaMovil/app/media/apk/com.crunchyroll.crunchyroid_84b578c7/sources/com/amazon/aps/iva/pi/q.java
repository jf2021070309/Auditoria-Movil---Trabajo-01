package com.amazon.aps.iva.pi;

import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: WatchMusicToolbarTitleMapper.kt */
/* loaded from: classes.dex */
public final class q implements com.amazon.aps.iva.cl.f {
    public final com.amazon.aps.iva.yh.c a;

    public q(com.amazon.aps.iva.yh.d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.cl.f
    public final com.amazon.aps.iva.cl.g a(com.amazon.aps.iva.kj.e eVar) {
        MusicAsset musicAsset;
        com.amazon.aps.iva.yb0.j.f(eVar, "metadata");
        Object obj = eVar.t;
        if (obj instanceof MusicAsset) {
            musicAsset = (MusicAsset) obj;
        } else {
            musicAsset = null;
        }
        if (musicAsset == null) {
            return null;
        }
        com.amazon.aps.iva.yh.c cVar = this.a;
        return new com.amazon.aps.iva.cl.g(cVar.c(musicAsset), cVar.a(musicAsset));
    }
}
