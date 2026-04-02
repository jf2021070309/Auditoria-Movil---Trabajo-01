package com.amazon.aps.iva.oo;

import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: WatchScreenToolbarTitleMapper.kt */
/* loaded from: classes2.dex */
public final class n implements com.amazon.aps.iva.cl.f {
    public final a a;

    public n(b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.cl.f
    public final com.amazon.aps.iva.cl.g a(com.amazon.aps.iva.kj.e eVar) {
        PlayableAsset playableAsset;
        String str;
        com.amazon.aps.iva.yb0.j.f(eVar, "metadata");
        Object obj = eVar.t;
        if (obj instanceof PlayableAsset) {
            playableAsset = (PlayableAsset) obj;
        } else {
            playableAsset = null;
        }
        if (playableAsset == null) {
            return null;
        }
        boolean z = playableAsset instanceof Episode;
        String str2 = "";
        if (z) {
            str = ((Episode) playableAsset).getSeriesTitle();
        } else if (!(playableAsset instanceof Movie)) {
            str = "";
        } else {
            str = playableAsset.getTitle();
        }
        if (z) {
            str2 = this.a.a((Episode) playableAsset);
        }
        return new com.amazon.aps.iva.cl.g(str, str2);
    }
}
