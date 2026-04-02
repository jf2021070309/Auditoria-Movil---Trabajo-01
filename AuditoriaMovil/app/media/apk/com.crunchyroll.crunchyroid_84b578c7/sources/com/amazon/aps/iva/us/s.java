package com.amazon.aps.iva.us;

import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.Channel;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.PlayableAsset;
/* compiled from: SegmentMediaExtensions.kt */
/* loaded from: classes2.dex */
public final class s {

    /* compiled from: SegmentMediaExtensions.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.x50.t.values().length];
            try {
                iArr[com.amazon.aps.iva.x50.t.MOVIE_LISTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.MOVIE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.SERIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.EPISODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.MUSIC_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.amazon.aps.iva.x50.t.CONCERT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final String a(String str, com.amazon.aps.iva.xb0.l lVar) {
        String name;
        Channel channel = (Channel) lVar.invoke(str);
        if (channel == null || (name = channel.getName()) == null) {
            return "";
        }
        return name;
    }

    public static final String b(Streams streams) {
        String hardsubLocale;
        if (streams == null) {
            return "";
        }
        Stream stream = streams.getHlsStreams().get("en-US");
        if (stream == null) {
            stream = streams.getHlsStreams().get("");
        }
        if (stream == null || (hardsubLocale = stream.getHardsubLocale()) == null) {
            return "";
        }
        return hardsubLocale;
    }

    public static final String c(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        if (e(panel.getId(), panel.getResourceType()) == com.amazon.aps.iva.js.p.EPISODE) {
            return panel.getEpisodeMetadata().getParentTitle();
        }
        return panel.getTitle();
    }

    public static final String d(PlayableAsset playableAsset, com.amazon.aps.iva.xb0.l<? super String, Channel> lVar) {
        com.amazon.aps.iva.yb0.j.f(playableAsset, "<this>");
        return a(playableAsset.getChannelId(), lVar);
    }

    public static final com.amazon.aps.iva.js.p e(String str, com.amazon.aps.iva.x50.t tVar) {
        com.amazon.aps.iva.yb0.j.f(tVar, "<this>");
        com.amazon.aps.iva.yb0.j.f(str, "mediaId");
        switch (a.a[tVar.ordinal()]) {
            case 1:
            case 2:
                return com.amazon.aps.iva.js.p.MOVIE;
            case 3:
                return com.amazon.aps.iva.js.p.SERIES;
            case 4:
                return com.amazon.aps.iva.js.p.EPISODE;
            case 5:
                return com.amazon.aps.iva.js.p.MUSIC_VIDEO;
            case 6:
                return com.amazon.aps.iva.js.p.MUSIC_CONCERT;
            default:
                throw new IllegalArgumentException("Resource type \"" + tVar + "\" is not supported. Media ID = " + str);
        }
    }
}
