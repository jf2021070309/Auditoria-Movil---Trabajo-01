package com.amazon.aps.iva.p30;

import com.amazon.aps.iva.us.r;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: SearchResultAnalytics.kt */
/* loaded from: classes2.dex */
public interface f extends r {

    /* compiled from: SearchResultAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static g a(com.amazon.aps.iva.yh.d dVar, com.amazon.aps.iva.ws.f fVar) {
            com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
            j.f(dVar, "multipleArtistsFormatter");
            e eVar = e.h;
            j.f(eVar, "createTimer");
            return new g(dVar, cVar, fVar, eVar);
        }
    }

    void B(String str, com.amazon.aps.iva.ls.a aVar);

    void E(int i, MusicAsset musicAsset, String str, boolean z);

    void s(int i, Panel panel, String str, boolean z);
}
