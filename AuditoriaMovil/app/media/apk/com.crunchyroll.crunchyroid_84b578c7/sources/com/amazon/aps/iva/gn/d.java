package com.amazon.aps.iva.gn;

import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.ContentContainer;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ShareContentPresenter.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.b<e> implements c {
    public final f b;
    public final com.amazon.aps.iva.hn.a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, f fVar, com.amazon.aps.iva.hn.a aVar) {
        super(eVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(eVar, "view");
        this.b = fVar;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void F5(ContentContainer contentContainer) {
        getView().Tb(this.b.g(contentContainer));
        this.c.b(contentContainer);
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void G2(a aVar, ContentContainer contentContainer) {
        aVar.a(this.b.e(contentContainer));
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void L4(PlayableAsset playableAsset) {
        getView().Tb(this.b.i(playableAsset));
        this.c.c(playableAsset);
    }

    @Override // com.amazon.aps.iva.gn.c
    public final void V(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "panel");
        getView().Tb(this.b.h(new h(panel)));
        this.c.a(panel);
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void f0(a aVar, String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "artistName");
        aVar.a(this.b.a(str));
        this.c.d(new com.amazon.aps.iva.ks.e(null, p.MUSIC_ARTIST, str, null, str2, null, null, null, 481));
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void g3(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(str2, "artistName");
        getView().Tb(this.b.d(str));
        this.c.d(new com.amazon.aps.iva.ks.e(null, p.MUSIC_ARTIST, str, null, str2, null, null, null, 481));
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void q0(String str, String str2, t tVar, String str3) {
        p pVar;
        com.amazon.aps.iva.yb0.j.f(str, "id");
        com.amazon.aps.iva.yb0.j.f(tVar, "type");
        com.amazon.aps.iva.yb0.j.f(str2, "title");
        getView().Tb(this.b.c(str, tVar));
        if (tVar == t.MUSIC_VIDEO) {
            pVar = p.MUSIC_VIDEO;
        } else {
            pVar = p.MUSIC_CONCERT;
        }
        this.c.d(new com.amazon.aps.iva.ks.e(null, pVar, str, null, str3, null, str2, null, 417));
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void r0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
        getView().Tb(this.b.f(str));
    }

    @Override // com.amazon.aps.iva.gn.b
    public final void w4(a aVar, PlayableAsset playableAsset) {
        aVar.a(this.b.b(playableAsset));
    }
}
