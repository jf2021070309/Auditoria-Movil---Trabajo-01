package com.amazon.aps.iva.p30;

import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: SearchResultAnalytics.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.us.b implements f {
    public final com.amazon.aps.iva.yh.c e;
    public final com.amazon.aps.iva.ds.a f;
    public final com.amazon.aps.iva.ws.d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.amazon.aps.iva.yh.d dVar, com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ws.f fVar, com.amazon.aps.iva.xb0.a aVar2) {
        super(aVar2);
        j.f(dVar, "multipleArtistsFormatter");
        this.e = dVar;
        this.f = aVar;
        this.g = fVar;
    }

    @Override // com.amazon.aps.iva.p30.f
    public final void B(String str, com.amazon.aps.iva.ls.a aVar) {
        j.f(aVar, "screenName");
        if (str == null) {
            str = "";
        }
        this.f.e(new w(str, aVar, null, null, null, 60));
    }

    @Override // com.amazon.aps.iva.p30.f
    public final void E(int i, MusicAsset musicAsset, String str, boolean z) {
        j.f(musicAsset, "musicAsset");
        j.f(str, "searchString");
        com.amazon.aps.iva.ws.d dVar = this.g;
        com.amazon.aps.iva.yh.c cVar = this.e;
        dVar.c(i, musicAsset, cVar.c(musicAsset), cVar.a(musicAsset), str, z);
    }

    @Override // com.amazon.aps.iva.us.b
    public final void O(float f) {
        this.f.c(i.s(com.amazon.aps.iva.ls.a.SEARCH_RESULTS, f, null, null, null, new com.amazon.aps.iva.is.a[0], 28));
    }

    @Override // com.amazon.aps.iva.p30.f
    public final void s(int i, Panel panel, String str, boolean z) {
        j.f(panel, "panel");
        j.f(str, "searchString");
        this.g.e(i, panel, str, z);
    }
}
