package com.amazon.aps.iva.m40;

import com.amazon.aps.iva.l40.g1;
import com.amazon.aps.iva.o00.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: ShowPageCtaUiModel.kt */
/* loaded from: classes2.dex */
public final class d implements g1<e, c> {
    public final a a;

    public d(b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.l40.g1
    public final c a(e eVar) {
        Episode episode;
        String episodeNumber;
        e eVar2 = eVar;
        j.f(eVar2, "input");
        PlayableAsset playableAsset = eVar2.a;
        boolean z = playableAsset instanceof Episode;
        Episode episode2 = null;
        if (z) {
            episode = (Episode) playableAsset;
        } else {
            episode = null;
        }
        String str = "";
        String str2 = (episode == null || (str2 = episode.getSeasonNumber()) == null) ? "" : "";
        if (z) {
            episode2 = (Episode) playableAsset;
        }
        if (episode2 != null && (episodeNumber = episode2.getEpisodeNumber()) != null) {
            str = episodeNumber;
        }
        boolean z2 = eVar2.b;
        a aVar = this.a;
        if (z2) {
            return new c(aVar.b(str2, str));
        }
        if (eVar2.c) {
            return new c(aVar.a(str2, str));
        }
        return new c(aVar.c(str2, str));
    }
}
