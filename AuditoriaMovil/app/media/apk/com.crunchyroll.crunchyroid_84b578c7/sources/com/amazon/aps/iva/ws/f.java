package com.amazon.aps.iva.ws;

import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.es.s;
import com.amazon.aps.iva.es.x;
import com.amazon.aps.iva.js.k;
import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.i;
import com.amazon.aps.iva.ks.v;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.google.android.material.internal.ViewUtils;
/* compiled from: PanelAnalytics.kt */
/* loaded from: classes2.dex */
public final class f implements d {
    public final com.amazon.aps.iva.ds.a a;
    public final com.amazon.aps.iva.ls.a b;

    public f(com.amazon.aps.iva.ds.a aVar, com.amazon.aps.iva.ls.a aVar2) {
        j.f(aVar2, "screen");
        this.a = aVar;
        this.b = aVar2;
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void a(com.amazon.aps.iva.jt.a aVar, String str, String str2, String str3, String str4, t tVar, String str5) {
        j.f(aVar, "data");
        j.f(str, "feedId");
        j.f(str3, "mediaId");
        j.f(str4, "mediaTitle");
        j.f(tVar, "mediaType");
        j.f(str5, "episodeTitle");
        this.a.e(new s(this.b, new i(aVar.a, str, str2), new com.amazon.aps.iva.ks.e(null, com.amazon.aps.iva.us.s.e(str3, tVar), str3, "", str4, null, str5, null, 417), aVar.b, aVar.c, null, null, null, null, 992));
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void b(e eVar) {
        j.f(eVar, "data");
        this.a.e(new s(this.b, eVar.f, eVar.c, eVar.d, eVar.a, eVar.b, eVar.e));
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void c(int i, MusicAsset musicAsset, String str, String str2, String str3, boolean z) {
        j.f(musicAsset, "musicAsset");
        j.f(str, "assetTitle");
        j.f(str2, "artistName");
        j.f(str3, "searchTerms");
        this.a.e(new x(i, new com.amazon.aps.iva.ks.e(null, com.amazon.aps.iva.us.s.e(musicAsset.getId(), musicAsset.getType()), musicAsset.getId(), "", str2, null, str, null, 417), str3, z));
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void d(Panel panel, com.amazon.aps.iva.jt.a aVar, String str, Boolean bool, Boolean bool2) {
        String str2;
        j.f(aVar, "data");
        if (panel != null) {
            com.amazon.aps.iva.ls.a aVar2 = this.b;
            k kVar = aVar.a;
            if (kVar == null) {
                if (j.a(panel.getFeedType(), "shelf")) {
                    kVar = k.COLLECTION;
                } else {
                    k[] values = k.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            k kVar2 = values[i];
                            if (j.a(kVar2.toString(), panel.getFeedType())) {
                                kVar = kVar2;
                                break;
                            }
                            i++;
                        } else {
                            kVar = null;
                            break;
                        }
                    }
                }
            }
            String feedId = panel.getFeedId();
            if (feedId == null) {
                feedId = panel.getId();
            }
            if (str == null) {
                str2 = panel.getFeedTitle();
                if (str2 == null) {
                    str2 = panel.getTitle();
                }
            } else {
                str2 = str;
            }
            this.a.e(new s(aVar2, new i(kVar, feedId, str2), w.w(panel), aVar.b, aVar.c, aVar.e, aVar.f, new v(bool, bool2), null, ViewUtils.EDGE_TO_EDGE_FLAGS));
        }
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void e(int i, Panel panel, String str, boolean z) {
        j.f(str, "searchTerms");
        if (panel != null) {
            this.a.e(new x(i, w.w(panel), str, z));
        }
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void f(com.amazon.aps.iva.jt.a aVar, String str, String str2, String str3, String str4) {
        j.f(str, "feedId");
        j.f(str3, "mediaId");
        j.f(str4, "mediaTitle");
        com.amazon.aps.iva.ls.a aVar2 = this.b;
        i iVar = new i(aVar.a, str, str2);
        p pVar = p.MUSIC_ARTIST;
        j.f(pVar, "mediaType");
        this.a.e(new s(aVar2, iVar, new com.amazon.aps.iva.ks.e(null, pVar, str3, "", str4, null, null, null, 481), aVar.b, aVar.c, null, null, null, null, 992));
    }

    @Override // com.amazon.aps.iva.ws.d
    public final void g(Panel panel, com.amazon.aps.iva.fs.b bVar) {
        j.f(bVar, "view");
        if (panel != null) {
            this.a.e(new com.amazon.aps.iva.es.w(a.C0456a.c(this.b, bVar), w.w(panel)));
        }
    }
}
