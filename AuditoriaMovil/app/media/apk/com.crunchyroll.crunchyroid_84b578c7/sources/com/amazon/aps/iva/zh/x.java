package com.amazon.aps.iva.zh;

import com.amazon.aps.iva.ot.a;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: ArtistViewModel.kt */
/* loaded from: classes.dex */
public final class x {
    public static final ArrayList a(List list, com.amazon.aps.iva.at.d dVar, com.amazon.aps.iva.yh.c cVar) {
        MusicVideo musicVideo;
        com.amazon.aps.iva.pe0.b bVar;
        List<MusicGenre> genres;
        com.amazon.aps.iva.at.d dVar2 = dVar;
        List<MusicAsset> list2 = list;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list2));
        for (MusicAsset musicAsset : list2) {
            String id = musicAsset.getId();
            String c = cVar.c(musicAsset);
            com.amazon.aps.iva.pe0.b p0 = com.amazon.aps.iva.ab.x.p0(musicAsset.getImages().getThumbnails());
            long seconds = TimeUnit.MILLISECONDS.toSeconds(musicAsset.getDurationMs());
            if (musicAsset instanceof MusicVideo) {
                musicVideo = (MusicVideo) musicAsset;
            } else {
                musicVideo = null;
            }
            if (musicVideo == null || (genres = musicVideo.getGenres()) == null || (bVar = com.amazon.aps.iva.ab.x.p0(genres)) == null) {
                bVar = com.amazon.aps.iva.qe0.h.c;
            }
            arrayList.add(new com.amazon.aps.iva.ci.h(id, c, p0, seconds, bVar, a.c.a(dVar2.b(musicAsset)), com.amazon.aps.iva.ab.x.p0(dVar2.a(musicAsset)), musicAsset.getType(), cVar.b(musicAsset), cVar.a(musicAsset), false, LabelUiModelKt.toLabelUiModel$default(musicAsset, false, 1, null)));
            dVar2 = dVar;
        }
        return arrayList;
    }
}
