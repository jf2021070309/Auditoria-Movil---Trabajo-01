package com.amazon.aps.iva.vs;

import com.amazon.aps.iva.js.p;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.us.s;
import com.amazon.aps.iva.x50.t;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.DurationProviderKt;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: VideoMediaPropertyFactory.kt */
/* loaded from: classes2.dex */
public final class d {
    public l<? super String, Channel> a;
    public com.amazon.aps.iva.xb0.a<Boolean> b;

    /* compiled from: VideoMediaPropertyFactory.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.EPISODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.SERIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.MOVIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[t.MOVIE_LISTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[t.SEASON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public final w a(PlayableAsset playableAsset, Streams streams) {
        w wVar;
        String str;
        String audioLocale;
        String str2;
        String audioLocale2;
        j.f(playableAsset, "asset");
        if (playableAsset instanceof Movie) {
            Movie movie = (Movie) playableAsset;
            l<? super String, Channel> lVar = this.a;
            if (lVar != null) {
                String d = s.d(movie, lVar);
                p pVar = p.MOVIE;
                String id = movie.getId();
                String parentId = movie.getParentId();
                String title = movie.getTitle();
                String title2 = movie.getTitle();
                String b = s.b(streams);
                if (streams == null || (audioLocale2 = streams.getAudioLocale()) == null) {
                    str2 = "";
                } else {
                    str2 = audioLocale2;
                }
                Integer valueOf = Integer.valueOf((int) DurationProviderKt.getDurationSecs(movie));
                com.amazon.aps.iva.xb0.a<Boolean> aVar = this.b;
                if (aVar != null) {
                    wVar = new w(d, pVar, "", id, "", parentId, title, title2, "", "", "", "", b, str2, valueOf, !aVar.invoke().booleanValue());
                } else {
                    j.m("isUserPremium");
                    throw null;
                }
            } else {
                j.m("getChannelById");
                throw null;
            }
        } else if (playableAsset instanceof Episode) {
            Episode episode = (Episode) playableAsset;
            ArrayList O = o.O(new String[]{episode.getSeriesTitle(), episode.getSeasonTitle(), episode.getEpisodeNumberLegacy(), episode.getTitle()});
            ArrayList arrayList = new ArrayList();
            Iterator it = O.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!m.b0((String) next)) {
                    arrayList.add(next);
                }
            }
            String B0 = x.B0(arrayList, "|", null, null, null, 62);
            l<? super String, Channel> lVar2 = this.a;
            if (lVar2 != null) {
                String d2 = s.d(episode, lVar2);
                p pVar2 = p.EPISODE;
                String id2 = episode.getId();
                String parentId2 = episode.getParentId();
                String seriesTitle = episode.getSeriesTitle();
                String seasonTitle = episode.getSeasonTitle();
                String title3 = episode.getTitle();
                String episodeNumberLegacy = episode.getEpisodeNumberLegacy();
                String b2 = s.b(streams);
                if (streams == null || (audioLocale = streams.getAudioLocale()) == null) {
                    str = "";
                } else {
                    str = audioLocale;
                }
                Integer valueOf2 = Integer.valueOf((int) DurationProviderKt.getDurationSecs(episode));
                com.amazon.aps.iva.xb0.a<Boolean> aVar2 = this.b;
                if (aVar2 != null) {
                    wVar = new w(d2, pVar2, "", id2, "", parentId2, B0, seriesTitle, seasonTitle, title3, episodeNumberLegacy, "", b2, str, valueOf2, !aVar2.invoke().booleanValue());
                } else {
                    j.m("isUserPremium");
                    throw null;
                }
            } else {
                j.m("getChannelById");
                throw null;
            }
        } else {
            throw new IllegalArgumentException(e.e("Cannot create VideoMediaProperty for asset of type ", playableAsset.getClass().getSimpleName(), "."));
        }
        return wVar;
    }
}
