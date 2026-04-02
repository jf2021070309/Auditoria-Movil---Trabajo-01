package com.amazon.aps.iva.yh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.model.music.Artist;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: MultipleArtistsFormatterImpl.kt */
/* loaded from: classes.dex */
public final class d implements c {
    public final com.amazon.aps.iva.yh.a a;

    /* compiled from: MultipleArtistsFormatterImpl.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.l<Artist, CharSequence> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final CharSequence invoke(Artist artist) {
            Artist artist2 = artist;
            j.f(artist2, "it");
            return artist2.getName();
        }
    }

    public d(b bVar) {
        this.a = bVar;
    }

    @Override // com.amazon.aps.iva.yh.c
    public final String a(MusicAsset musicAsset) {
        j.f(musicAsset, "musicAsset");
        if (musicAsset.getDisplayArtistNameRequired()) {
            return musicAsset.getDisplayArtistName();
        }
        return x.B0(musicAsset.getArtists().getMainArtists(), ", ", null, null, a.h, 30);
    }

    @Override // com.amazon.aps.iva.yh.c
    public final String b(MusicAsset musicAsset) {
        String id;
        j.f(musicAsset, "musicAsset");
        Artist artist = (Artist) x.v0(musicAsset.getArtists().getMainArtists());
        if (artist == null || (id = artist.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // com.amazon.aps.iva.yh.c
    public final String c(MusicAsset musicAsset) {
        j.f(musicAsset, "musicAsset");
        ArrayList L0 = x.L0(musicAsset.getArtists().getFeaturedArtists(), musicAsset.getArtists().getSecondaryArtists());
        if (L0.isEmpty()) {
            return musicAsset.getTitle();
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = L0.iterator();
        while (it.hasNext()) {
            Artist artist = (Artist) it.next();
            String a2 = this.a.a(artist.getConnector());
            String name = artist.getName();
            sb.append(" " + a2 + " " + name);
        }
        String title = musicAsset.getTitle();
        return title + " -" + ((Object) sb);
    }

    @Override // com.amazon.aps.iva.yh.c
    public final List<com.amazon.aps.iva.kb0.j<String, String>> d(MusicAsset musicAsset) {
        if (musicAsset.getDisplayArtistNameRequired()) {
            String displayArtistName = musicAsset.getDisplayArtistName();
            Artist artist = (Artist) x.v0(musicAsset.getArtists().getMainArtists());
            return f1.J(new com.amazon.aps.iva.kb0.j(displayArtistName, (artist == null || (r5 = artist.getId()) == null) ? "" : ""));
        }
        List<Artist> mainArtists = musicAsset.getArtists().getMainArtists();
        ArrayList arrayList = new ArrayList(r.Y(mainArtists));
        for (Artist artist2 : mainArtists) {
            arrayList.add(new com.amazon.aps.iva.kb0.j(artist2.getName(), artist2.getId()));
        }
        return arrayList;
    }
}
