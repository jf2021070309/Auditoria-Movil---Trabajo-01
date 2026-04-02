package com.amazon.aps.iva.ni;

import com.amazon.aps.iva.ot.a;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: WatchMusicViewModel.kt */
/* loaded from: classes.dex */
public final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<? extends MusicAsset>, List<? extends com.amazon.aps.iva.ci.h>> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final List<? extends com.amazon.aps.iva.ci.h> invoke(List<? extends MusicAsset> list) {
        MusicVideo musicVideo;
        com.amazon.aps.iva.pe0.b bVar;
        List<MusicGenre> genres;
        List<? extends MusicAsset> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        w wVar = this.h;
        com.amazon.aps.iva.at.d dVar = wVar.c;
        String str = ((x) wVar.e.getValue()).b;
        List<? extends MusicAsset> list3 = list2;
        ArrayList arrayList = new ArrayList(com.amazon.aps.iva.lb0.r.Y(list3));
        for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
            MusicAsset musicAsset = (MusicAsset) it.next();
            String id = musicAsset.getId();
            com.amazon.aps.iva.yh.c cVar = wVar.d;
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
            arrayList.add(new com.amazon.aps.iva.ci.h(id, c, p0, seconds, bVar, a.c.a(dVar.b(musicAsset)), com.amazon.aps.iva.ab.x.p0(dVar.a(musicAsset)), musicAsset.getType(), cVar.b(musicAsset), cVar.a(musicAsset), com.amazon.aps.iva.yb0.j.a(musicAsset.getId(), str), LabelUiModelKt.toLabelUiModel$default(musicAsset, false, 1, null)));
        }
        return arrayList;
    }
}
