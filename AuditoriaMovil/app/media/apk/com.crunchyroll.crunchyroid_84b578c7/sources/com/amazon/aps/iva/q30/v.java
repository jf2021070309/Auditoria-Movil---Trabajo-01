package com.amazon.aps.iva.q30;

import com.amazon.aps.iva.xw.f0;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
/* compiled from: RecentSearchesRouter.kt */
/* loaded from: classes2.dex */
public final class v implements u {
    public final com.amazon.aps.iva.i50.b a;
    public final com.amazon.aps.iva.k50.d b;
    public final com.amazon.aps.iva.xb0.p<String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.kb0.q> c;

    /* JADX WARN: Multi-variable type inference failed */
    public v(com.amazon.aps.iva.i50.b bVar, com.amazon.aps.iva.k50.d dVar, com.amazon.aps.iva.xb0.p<? super String, ? super com.amazon.aps.iva.x50.t, com.amazon.aps.iva.kb0.q> pVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = pVar;
    }

    @Override // com.amazon.aps.iva.q30.u
    public final void a(b bVar) {
        com.amazon.aps.iva.x50.t tVar;
        Panel c = bVar.c();
        String str = null;
        if (c == null || (tVar = c.getResourceType()) == null) {
            MusicAsset b = bVar.b();
            if (b != null) {
                tVar = b.getType();
            } else {
                tVar = null;
            }
        }
        com.amazon.aps.iva.yb0.j.c(tVar);
        if (tVar.isAsset()) {
            String a = bVar.a();
            Panel c2 = bVar.c();
            com.amazon.aps.iva.yb0.j.c(c2);
            String a2 = f0.a(c2);
            com.amazon.aps.iva.yb0.j.f(a, "assetId");
            com.amazon.aps.iva.yb0.j.f(a2, "containerId");
            com.amazon.aps.iva.ap.a aVar = new com.amazon.aps.iva.ap.a(a2, f0.b(tVar));
            int i = com.amazon.aps.iva.ap.i.a[tVar.ordinal()];
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            if (z) {
                str = a;
            }
            this.a.a(new com.amazon.aps.iva.ap.h(aVar, str), com.amazon.aps.iva.no.a.SEARCH_ITEM);
        } else if (tVar != com.amazon.aps.iva.x50.t.MUSIC_VIDEO && tVar != com.amazon.aps.iva.x50.t.CONCERT) {
            Panel c3 = bVar.c();
            com.amazon.aps.iva.yb0.j.c(c3);
            this.c.invoke(f0.a(c3), tVar);
        } else {
            this.b.C1(new com.amazon.aps.iva.l50.c(bVar.a(), tVar));
        }
    }
}
