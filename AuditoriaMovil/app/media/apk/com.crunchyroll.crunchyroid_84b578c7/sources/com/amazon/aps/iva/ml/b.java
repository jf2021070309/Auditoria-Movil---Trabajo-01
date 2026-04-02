package com.amazon.aps.iva.ml;

import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.ye.j;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: CastMediaPropertyProvider.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final j a;

    public b(j jVar) {
        this.a = jVar;
    }

    @Override // com.amazon.aps.iva.ml.a
    public final w a() {
        PlayableAsset metadataPlayableAsset;
        com.amazon.aps.iva.ye.b castSession = this.a.getCastSession();
        if (castSession != null && (metadataPlayableAsset = castSession.getMetadataPlayableAsset()) != null) {
            return n.c.a(metadataPlayableAsset, null);
        }
        t.Companion.getClass();
        return new w("", com.amazon.aps.iva.dj.c.a(t.a.a(null)), "", "", null, "", "", "", "", "", "", null, null, "", 0, false);
    }
}
