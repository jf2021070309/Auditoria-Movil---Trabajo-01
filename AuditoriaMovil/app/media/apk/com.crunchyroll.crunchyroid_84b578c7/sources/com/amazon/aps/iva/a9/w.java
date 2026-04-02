package com.amazon.aps.iva.a9;

import android.content.Context;
import android.util.SparseArray;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/* compiled from: ViewGroupOverlayApi18.java */
/* loaded from: classes.dex */
public class w implements com.amazon.aps.iva.hb.i, com.amazon.aps.iva.jb.f {
    public static w d;
    public final /* synthetic */ int b;
    public Object c;

    public w(Context context) {
        this.b = 4;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.c = context;
    }

    public static w c() {
        if (d == null) {
            d = new w(1);
        }
        return d;
    }

    public static String d(Episode episode) {
        boolean isDigit = Character.isDigit(episode.getEpisodeNumber().charAt(0));
        String episodeNumber = episode.getEpisodeNumber();
        if (!isDigit) {
            return com.amazon.aps.iva.oa.a.a("-", episodeNumber);
        }
        return episodeNumber;
    }

    @Override // com.amazon.aps.iva.hb.i
    public final com.amazon.aps.iva.hb.h a(int i) {
        com.amazon.aps.iva.hb.h hVar = (com.amazon.aps.iva.hb.h) ((SparseArray) this.c).get(i);
        if (hVar == null) {
            return (com.amazon.aps.iva.hb.h) ((SparseArray) this.c).get(1);
        }
        return hVar;
    }

    public final Gson b() {
        if (((Gson) this.c) == null) {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.excludeFieldsWithModifiers(128);
            this.c = gsonBuilder.create();
        }
        return (Gson) this.c;
    }

    public final String e(PlayableAsset playableAsset) {
        boolean z = playableAsset instanceof Episode;
        if (z) {
            Episode episode = (Episode) playableAsset;
            if (!com.amazon.aps.iva.oe0.m.b0(episode.getSeasonNumber())) {
                return ((Context) this.c).getString(R.string.notification_content_with_season, episode.getSeasonNumber(), d(episode), episode.getTitle());
            }
        }
        if (z) {
            Episode episode2 = (Episode) playableAsset;
            if (com.amazon.aps.iva.oe0.m.b0(episode2.getSeasonNumber())) {
                return ((Context) this.c).getString(R.string.notification_content_no_season, d(episode2), episode2.getTitle());
            }
        }
        return playableAsset.getTitle();
    }

    public final String f(PlayableAsset playableAsset, String str) {
        if (playableAsset instanceof Episode) {
            String string = ((Context) this.c).getString(R.string.notification_multiline_text, e(playableAsset), str);
            com.amazon.aps.iva.yb0.j.e(string, "context.getString(\n     …set), state\n            )");
            return string;
        }
        return str;
    }

    @Override // com.amazon.aps.iva.jb.f
    public boolean h(com.amazon.aps.iva.ib.a aVar) {
        return ((com.amazon.aps.iva.jb.f) this.c).h(aVar);
    }

    public final String toString() {
        switch (this.b) {
            case 5:
                return (String) this.c;
            default:
                return super.toString();
        }
    }

    public w(int i) {
        this.b = i;
        if (i != 2) {
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.c = sparseArray;
        com.amazon.aps.iva.hb.b bVar = new com.amazon.aps.iva.hb.b();
        sparseArray.put(17, bVar);
        ((SparseArray) this.c).put(1, bVar);
        ((SparseArray) this.c).put(3, new com.amazon.aps.iva.hb.l(0));
        ((SparseArray) this.c).put(5, new com.amazon.aps.iva.hb.m());
    }

    public w(String str) {
        this.b = 5;
        this.c = str;
    }

    public w(com.amazon.aps.iva.jb.f fVar) {
        this.b = 3;
        this.c = fVar;
    }
}
