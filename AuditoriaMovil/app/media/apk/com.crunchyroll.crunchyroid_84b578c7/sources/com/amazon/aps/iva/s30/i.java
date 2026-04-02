package com.amazon.aps.iva.s30;

import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.x50.t;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Panel;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.concurrent.TimeUnit;
/* compiled from: SearchResultAdapterItem.kt */
/* loaded from: classes2.dex */
public final class i {

    /* compiled from: SearchResultAdapterItem.kt */
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
                iArr[t.MUSIC_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[t.CONCERT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final j a(MusicAsset musicAsset, com.amazon.aps.iva.at.d dVar, com.amazon.aps.iva.yh.c cVar) {
        int i;
        com.amazon.aps.iva.yb0.j.f(musicAsset, "<this>");
        com.amazon.aps.iva.yb0.j.f(dVar, "availabilityProvider");
        com.amazon.aps.iva.yb0.j.f(cVar, "multipleArtistsFormatter");
        String id = musicAsset.getId();
        t type = musicAsset.getType();
        t type2 = musicAsset.getType();
        int i2 = a.a[type2.ordinal()];
        if (i2 != 5) {
            if (i2 == 6) {
                i = R.string.music_type_concert;
            } else {
                throw new IllegalArgumentException(type2 + " is not supported!");
            }
        } else {
            i = R.string.music_type_video;
        }
        return new j(id, type, i, cVar.a(musicAsset), cVar.b(musicAsset), cVar.c(musicAsset), musicAsset.getImages().getThumbnails(), TimeUnit.MILLISECONDS.toSeconds(musicAsset.getDurationMs()), a.c.a(dVar.b(musicAsset)), dVar.a(musicAsset), musicAsset);
    }

    public static final k b(Panel panel) {
        com.amazon.aps.iva.yb0.j.f(panel, "<this>");
        int i = a.a[panel.getResourceType().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                t resourceType = panel.getResourceType();
                throw new IllegalArgumentException(resourceType + " is not supported");
            }
            return new com.amazon.aps.iva.s30.a(panel);
        }
        return new c(panel);
    }
}
