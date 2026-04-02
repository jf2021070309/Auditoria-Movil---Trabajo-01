package com.amazon.aps.iva.zh;

import com.amazon.aps.iva.e4.l1;
/* compiled from: ArtistAnalytics.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final com.amazon.aps.iva.l50.a a;
    public final com.amazon.aps.iva.ds.a b;
    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.fs.c> c;
    public com.amazon.aps.iva.fs.c d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(com.amazon.aps.iva.l50.a aVar, com.amazon.aps.iva.ds.a aVar2, com.amazon.aps.iva.xb0.a<? extends com.amazon.aps.iva.fs.c> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = (com.amazon.aps.iva.fs.c) aVar3.invoke();
    }

    @Override // com.amazon.aps.iva.zh.c
    public final void a(Throwable th) {
        com.amazon.aps.iva.yb0.j.f(th, "error");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.ARTIST;
        String str = this.a.b;
        com.amazon.aps.iva.js.p pVar = com.amazon.aps.iva.js.p.MUSIC_ARTIST;
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        l1.L(this.b, th, new com.amazon.aps.iva.es.w(message, aVar, new com.amazon.aps.iva.ks.e(null, pVar, str, "", "", null, null, null, 481), null, null, 52));
    }

    @Override // com.amazon.aps.iva.zh.c
    public final void b() {
        this.d = this.c.invoke();
    }

    @Override // com.amazon.aps.iva.zh.c
    public final void c(t tVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "artistUiModel");
        com.amazon.aps.iva.ls.a aVar = com.amazon.aps.iva.ls.a.ARTIST;
        float a = this.d.a();
        String str = tVar.b.a;
        com.amazon.aps.iva.js.p pVar = com.amazon.aps.iva.js.p.MUSIC_ARTIST;
        String str2 = tVar.a;
        com.amazon.aps.iva.yb0.j.f(str2, "mediaId");
        com.amazon.aps.iva.yb0.j.f(str, "mediaTitle");
        com.amazon.aps.iva.yb0.j.f(pVar, "mediaType");
        this.b.c(defpackage.i.s(aVar, a, new com.amazon.aps.iva.ks.e(null, pVar, str2, "", str, null, null, null, 481), null, null, new com.amazon.aps.iva.is.a[0], 24));
    }
}
