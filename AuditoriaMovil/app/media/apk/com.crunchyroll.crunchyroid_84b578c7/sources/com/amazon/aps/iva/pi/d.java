package com.amazon.aps.iva.pi;

import com.amazon.aps.iva.kj.c;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.ellation.crunchyroll.model.maturityrating.ExtendedMaturityRating;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: WatchMusicPlayerMappers.kt */
/* loaded from: classes.dex */
public final class d {
    public static final c.b a(Streams streams) {
        Stream stream;
        String str;
        String url;
        Collection<Stream> values;
        Object obj;
        com.amazon.aps.iva.yb0.j.f(streams, "<this>");
        Map<String, Stream> map = streams.getStreams().get("drm_adaptive_dash");
        String str2 = null;
        if (map != null && (values = map.values()) != null) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (!com.amazon.aps.iva.oe0.m.b0(((Stream) obj).getUrl())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            stream = (Stream) obj;
        } else {
            stream = null;
        }
        if (stream == null || (url = stream.getUrl()) == null) {
            str = "";
        } else {
            str = url;
        }
        if (stream != null) {
            str2 = stream.getVideoToken();
        }
        String str3 = str2;
        String assetId = streams.getAssetId();
        String str4 = (String) x.v0(streams.getBifs());
        com.amazon.aps.iva.kj.b bVar = com.amazon.aps.iva.kj.b.DASH;
        Collection<Subtitle> values2 = streams.getSubtitles().values();
        ArrayList arrayList = new ArrayList(r.Y(values2));
        for (Subtitle subtitle : values2) {
            String locale = subtitle.getLocale();
            String url2 = subtitle.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            arrayList.add(new com.amazon.aps.iva.kj.d(locale, url2));
        }
        return new c.b(assetId, str4, bVar, str, arrayList, str3, null, streams.getSessionState(), 386);
    }

    public static final com.amazon.aps.iva.kj.e b(MusicAsset musicAsset, com.amazon.aps.iva.yh.c cVar) {
        String str;
        String str2;
        com.amazon.aps.iva.yb0.j.f(musicAsset, "<this>");
        com.amazon.aps.iva.yb0.j.f(cVar, "multipleArtistsFormatter");
        String id = musicAsset.getId();
        String c = cVar.c(musicAsset);
        t type = musicAsset.getType();
        String c2 = cVar.c(musicAsset);
        String a = cVar.a(musicAsset);
        long durationMs = musicAsset.getDurationMs();
        boolean isPremiumOnly = musicAsset.isPremiumOnly();
        boolean isMature = musicAsset.isMature();
        boolean isMatureBlocked = musicAsset.isMatureBlocked();
        List<Image> thumbnails = musicAsset.getImages().getThumbnails();
        ExtendedMaturityRating extendedMaturityRating = musicAsset.getExtendedMaturityRating();
        if (extendedMaturityRating != null) {
            str = extendedMaturityRating.getRating();
        } else {
            str = null;
        }
        ExtendedMaturityRating extendedMaturityRating2 = musicAsset.getExtendedMaturityRating();
        if (extendedMaturityRating2 != null) {
            str2 = extendedMaturityRating2.getSystem();
        } else {
            str2 = null;
        }
        return new com.amazon.aps.iva.kj.e(id, null, c, null, type, c2, null, null, null, a, Boolean.valueOf(isPremiumOnly), Boolean.valueOf(isMature), Boolean.valueOf(isMatureBlocked), null, null, Long.valueOf(durationMs), thumbnails, null, musicAsset, 0L, null, null, str, str2, 7659978);
    }
}
