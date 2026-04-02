package com.amazon.aps.iva.o7;

import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.t5.v;
import com.google.common.collect.ImmutableList;
import com.google.common.net.HttpHeaders;
/* compiled from: MetadataUtil.java */
/* loaded from: classes.dex */
public final class f {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static com.amazon.aps.iva.i7.e a(int i, v vVar) {
        int e = vVar.e();
        if (vVar.e() == 1684108385) {
            vVar.G(8);
            String p = vVar.p(e - 16);
            return new com.amazon.aps.iva.i7.e("und", p, p);
        }
        a.a(i);
        p.g();
        return null;
    }

    public static com.amazon.aps.iva.i7.a b(v vVar) {
        String str;
        int e = vVar.e();
        if (vVar.e() == 1684108385) {
            int e2 = vVar.e() & 16777215;
            if (e2 == 13) {
                str = "image/jpeg";
            } else if (e2 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                p.g();
                return null;
            }
            vVar.G(4);
            int i = e - 16;
            byte[] bArr = new byte[i];
            vVar.d(0, bArr, i);
            return new com.amazon.aps.iva.i7.a(str, null, 3, bArr);
        }
        p.g();
        return null;
    }

    public static com.amazon.aps.iva.i7.l c(int i, v vVar, String str) {
        int e = vVar.e();
        if (vVar.e() == 1684108385 && e >= 22) {
            vVar.G(10);
            int z = vVar.z();
            if (z > 0) {
                String a2 = c0.a("", z);
                int z2 = vVar.z();
                if (z2 > 0) {
                    a2 = a2 + "/" + z2;
                }
                return new com.amazon.aps.iva.i7.l(str, null, ImmutableList.of(a2));
            }
        }
        a.a(i);
        p.g();
        return null;
    }

    public static com.amazon.aps.iva.i7.l d(int i, v vVar, String str) {
        int e = vVar.e();
        if (vVar.e() == 1684108385) {
            vVar.G(8);
            return new com.amazon.aps.iva.i7.l(str, null, ImmutableList.of(vVar.p(e - 16)));
        }
        a.a(i);
        p.g();
        return null;
    }

    public static com.amazon.aps.iva.i7.h e(int i, String str, v vVar, boolean z, boolean z2) {
        int f = f(vVar);
        if (z2) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            if (z) {
                return new com.amazon.aps.iva.i7.l(str, null, ImmutableList.of(Integer.toString(f)));
            }
            return new com.amazon.aps.iva.i7.e("und", str, Integer.toString(f));
        }
        a.a(i);
        p.g();
        return null;
    }

    public static int f(v vVar) {
        vVar.G(4);
        if (vVar.e() == 1684108385) {
            vVar.G(8);
            return vVar.u();
        }
        p.g();
        return -1;
    }
}
