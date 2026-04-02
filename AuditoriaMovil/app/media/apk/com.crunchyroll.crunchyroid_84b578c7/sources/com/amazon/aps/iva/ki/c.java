package com.amazon.aps.iva.ki;

import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.es.w;
import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.ks.e;
import com.amazon.aps.iva.ks.g;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: WatchMusicAnalytics.kt */
/* loaded from: classes.dex */
public final class c implements b {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> b;
    public final com.amazon.aps.iva.yh.c c;
    public final g d;
    public com.amazon.aps.iva.fs.c e;

    public c(com.amazon.aps.iva.yh.d dVar, com.amazon.aps.iva.ds.a aVar, g gVar, com.amazon.aps.iva.xb0.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
        this.c = dVar;
        this.d = gVar;
        this.e = (com.amazon.aps.iva.fs.c) aVar2.invoke();
    }

    @Override // com.amazon.aps.iva.ki.b
    public final void b() {
        this.e = this.b.invoke();
    }

    @Override // com.amazon.aps.iva.ki.b
    public final void c(com.amazon.aps.iva.li.a aVar) {
        com.amazon.aps.iva.ls.a aVar2;
        MusicAsset musicAsset = aVar.a;
        if (d.a[musicAsset.getType().ordinal()] == 1) {
            aVar2 = com.amazon.aps.iva.ls.a.WATCH_MUSIC_VIDEO;
        } else {
            aVar2 = com.amazon.aps.iva.ls.a.WATCH_CONCERT;
        }
        com.amazon.aps.iva.ls.a aVar3 = aVar2;
        float a = this.e.a();
        com.amazon.aps.iva.yh.c cVar = this.c;
        String c = cVar.c(musicAsset);
        String a2 = cVar.a(musicAsset);
        j.f(c, "assetTitle");
        j.f(a2, "artistName");
        this.a.c(i.s(aVar3, a, new e(null, s.e(musicAsset.getId(), musicAsset.getType()), musicAsset.getId(), "", a2, null, c, null, 417), this.d, null, new com.amazon.aps.iva.is.a[0], 16));
    }

    @Override // com.amazon.aps.iva.ki.b
    public final void d(Throwable th, com.amazon.aps.iva.li.b bVar) {
        com.amazon.aps.iva.ls.a aVar;
        j.f(th, "error");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        String str = message;
        int[] iArr = d.a;
        t tVar = bVar.b;
        if (iArr[tVar.ordinal()] == 1) {
            aVar = com.amazon.aps.iva.ls.a.WATCH_MUSIC_VIDEO;
        } else {
            aVar = com.amazon.aps.iva.ls.a.WATCH_CONCERT;
        }
        String str2 = bVar.a;
        p e = s.e(str2, tVar);
        j.f(e, "mediaType");
        l1.L(this.a, th, new w(str, aVar, new e(null, e, str2, "", "", null, null, null, 481), this.d, null, 36));
    }
}
