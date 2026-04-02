package com.amazon.aps.iva.ni;

import com.amazon.aps.iva.ni.f;
import com.crunchyroll.music.artist.ArtistActivity;
/* compiled from: WatchMusicRouter.kt */
/* loaded from: classes.dex */
public final class o implements com.amazon.aps.iva.k50.d {
    public final q a;
    public final com.amazon.aps.iva.xb0.a<String> b;
    public final com.amazon.aps.iva.k50.d c;

    public o(q qVar, f.d dVar, com.amazon.aps.iva.ii.a aVar) {
        this.a = qVar;
        this.b = dVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.k50.d
    public final void C1(com.amazon.aps.iva.l50.c cVar) {
        this.c.C1(cVar);
    }

    @Override // com.amazon.aps.iva.k50.d
    public final void D1(com.amazon.aps.iva.l50.a aVar) {
        if (!com.amazon.aps.iva.yb0.j.a(this.b.invoke(), ArtistActivity.class.getName())) {
            this.c.D1(aVar);
        }
        this.a.closeScreen();
    }
}
