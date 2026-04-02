package com.amazon.aps.iva.ci;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.o0.i;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.google.android.gms.ads.AdRequest;
/* compiled from: MusicAssetsAdapter.kt */
/* loaded from: classes.dex */
public final class c extends l implements p<i, Integer, q> {
    public final /* synthetic */ h h;
    public final /* synthetic */ e i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, h hVar) {
        super(2);
        this.h = hVar;
        this.i = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(i iVar, Integer num) {
        String str;
        i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            h hVar = this.h;
            j.e(hVar, "item");
            String str2 = hVar.a;
            String str3 = hVar.j;
            String str4 = hVar.k;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = str4;
            com.amazon.aps.iva.pe0.b<Image> bVar2 = hVar.c;
            String str6 = hVar.b;
            long j = hVar.d;
            MusicGenre musicGenre = (MusicGenre) x.v0(hVar.e);
            if (musicGenre != null) {
                str = musicGenre.getDisplayValue();
            } else {
                str = null;
            }
            com.amazon.aps.iva.fi.a aVar = new com.amazon.aps.iva.fi.a(str2, str3, str5, str6, bVar2, j, str, hVar.f, hVar.g, hVar.m, hVar.i, hVar.l);
            e eVar = this.i;
            a.c(aVar, com.amazon.aps.iva.ab.x.m0(eVar.c.a(hVar)), eVar.e, eVar.d, new b(eVar, hVar), null, iVar2, Image.$stable | 0 | 0 | LabelUiModel.$stable | AdRequest.MAX_CONTENT_URL_LENGTH | 0, 32);
        }
        return q.a;
    }
}
