package com.amazon.aps.iva.ai;

import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.wy.j;
import com.crunchyroll.music.artist.summary.ArtistSummaryLayout;
/* compiled from: ArtistSummaryPresenter.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.wy.b<d> implements b {
    public c(ArtistSummaryLayout artistSummaryLayout) {
        super(artistSummaryLayout, new j[0]);
    }

    @Override // com.amazon.aps.iva.ai.b
    public final void D5(a aVar) {
        com.amazon.aps.iva.yb0.j.f(aVar, "artistSummary");
        getView().setName(aVar.a);
        getView().setGenres(aVar.b);
        String str = aVar.c;
        if (m.b0(str)) {
            getView().g();
            getView().q();
            getView().Qa();
        } else {
            getView().setDescription(str);
            getView().r();
        }
        getView().V1();
    }
}
