package com.fyber.inneractive.sdk.player.c.d.d;

import android.util.Log;
import com.fyber.inneractive.sdk.player.c.f.a;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.ironsource.mediationsdk.IronSourceSegment;
/* loaded from: classes.dex */
final class f {
    private static final int a = t.e("nam");
    private static final int b = t.e("trk");
    private static final int c = t.e("cmt");
    private static final int d = t.e("day");
    private static final int e = t.e("ART");
    private static final int f = t.e("too");
    private static final int g = t.e("alb");
    private static final int h = t.e("com");
    private static final int i = t.e("wrt");
    private static final int j = t.e("lyr");
    private static final int k = t.e(IronSourceSegment.GENDER);
    private static final int l = t.e("covr");
    private static final int m = t.e("gnre");
    private static final int n = t.e("grp");
    private static final int o = t.e("disk");
    private static final int p = t.e("trkn");
    private static final int q = t.e("tmpo");
    private static final int r = t.e("cpil");
    private static final int s = t.e("aART");
    private static final int t = t.e("sonm");
    private static final int u = t.e("soal");
    private static final int v = t.e("soar");
    private static final int w = t.e("soaa");
    private static final int x = t.e("soco");
    private static final int y = t.e("rtng");
    private static final int z = t.e("pgap");
    private static final int A = t.e("sosn");
    private static final int B = t.e("tvsh");
    private static final int C = t.e("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private static com.fyber.inneractive.sdk.player.c.f.a.j a(int i2, String str, com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int j2 = kVar.j();
        if (kVar.j() == a.aF) {
            kVar.d(8);
            return new com.fyber.inneractive.sdk.player.c.f.a.j(str, null, kVar.f(j2 - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + a.c(i2));
        return null;
    }

    private static com.fyber.inneractive.sdk.player.c.f.a.h a(int i2, String str, com.fyber.inneractive.sdk.player.c.k.k kVar, boolean z2, boolean z3) {
        int b2 = b(kVar);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 >= 0) {
            if (z2) {
                return new com.fyber.inneractive.sdk.player.c.f.a.j(str, null, Integer.toString(b2));
            }
            return new com.fyber.inneractive.sdk.player.c.f.a.e("und", str, Integer.toString(b2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + a.c(i2));
        return null;
    }

    private static com.fyber.inneractive.sdk.player.c.f.a.j b(int i2, String str, com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int j2 = kVar.j();
        if (kVar.j() == a.aF && j2 >= 22) {
            kVar.d(10);
            int e2 = kVar.e();
            if (e2 > 0) {
                String valueOf = String.valueOf(e2);
                int e3 = kVar.e();
                if (e3 > 0) {
                    valueOf = valueOf + "/" + e3;
                }
                return new com.fyber.inneractive.sdk.player.c.f.a.j(str, null, valueOf);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + a.c(i2));
        return null;
    }

    private static int b(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        kVar.d(4);
        if (kVar.j() == a.aF) {
            kVar.d(8);
            return kVar.d();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static a.InterfaceC0060a a(com.fyber.inneractive.sdk.player.c.k.k kVar) {
        int j2 = kVar.b + kVar.j();
        int j3 = kVar.j();
        int i2 = (j3 >> 24) & 255;
        a.InterfaceC0060a interfaceC0060a = null;
        try {
            if (i2 == 169 || i2 == 65533) {
                int i3 = 16777215 & j3;
                if (i3 == c) {
                    int j4 = kVar.j();
                    if (kVar.j() == a.aF) {
                        kVar.d(8);
                        String f2 = kVar.f(j4 - 16);
                        interfaceC0060a = new com.fyber.inneractive.sdk.player.c.f.a.e("und", f2, f2);
                    } else {
                        Log.w("MetadataUtil", "Failed to parse comment attribute: " + a.c(j3));
                    }
                    return interfaceC0060a;
                }
                if (i3 != a && i3 != b) {
                    if (i3 != h && i3 != i) {
                        if (i3 == d) {
                            return a(j3, "TDRC", kVar);
                        }
                        if (i3 == e) {
                            return a(j3, "TPE1", kVar);
                        }
                        if (i3 == f) {
                            return a(j3, "TSSE", kVar);
                        }
                        if (i3 == g) {
                            return a(j3, "TALB", kVar);
                        }
                        if (i3 == j) {
                            return a(j3, "USLT", kVar);
                        }
                        if (i3 == k) {
                            return a(j3, "TCON", kVar);
                        }
                        if (i3 == n) {
                            return a(j3, "TIT1", kVar);
                        }
                    }
                    return a(j3, "TCOM", kVar);
                }
                return a(j3, "TIT2", kVar);
            } else if (j3 == m) {
                int b2 = b(kVar);
                String str = (b2 <= 0 || b2 > D.length) ? null : D[b2 - 1];
                if (str != null) {
                    interfaceC0060a = new com.fyber.inneractive.sdk.player.c.f.a.j("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return interfaceC0060a;
            } else if (j3 == o) {
                return b(j3, "TPOS", kVar);
            } else {
                if (j3 == p) {
                    return b(j3, "TRCK", kVar);
                }
                if (j3 == q) {
                    return a(j3, "TBPM", kVar, true, false);
                }
                if (j3 == r) {
                    return a(j3, "TCMP", kVar, true, true);
                }
                if (j3 == l) {
                    int j5 = kVar.j();
                    if (kVar.j() == a.aF) {
                        int b3 = a.b(kVar.j());
                        String str2 = b3 == 13 ? "image/jpeg" : b3 == 14 ? "image/png" : null;
                        if (str2 == null) {
                            Log.w("MetadataUtil", "Unrecognized cover art flags: " + b3);
                        } else {
                            kVar.d(4);
                            int i4 = j5 - 16;
                            byte[] bArr = new byte[i4];
                            kVar.a(bArr, 0, i4);
                            interfaceC0060a = new com.fyber.inneractive.sdk.player.c.f.a.a(str2, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return interfaceC0060a;
                } else if (j3 == s) {
                    return a(j3, "TPE2", kVar);
                } else {
                    if (j3 == t) {
                        return a(j3, "TSOT", kVar);
                    }
                    if (j3 == u) {
                        return a(j3, "TSO2", kVar);
                    }
                    if (j3 == v) {
                        return a(j3, "TSOA", kVar);
                    }
                    if (j3 == w) {
                        return a(j3, "TSOP", kVar);
                    }
                    if (j3 == x) {
                        return a(j3, "TSOC", kVar);
                    }
                    if (j3 == y) {
                        return a(j3, "ITUNESADVISORY", kVar, false, false);
                    }
                    if (j3 == z) {
                        return a(j3, "ITUNESGAPLESS", kVar, false, true);
                    }
                    if (j3 == A) {
                        return a(j3, "TVSHOWSORT", kVar);
                    }
                    if (j3 == B) {
                        return a(j3, "TVSHOW", kVar);
                    }
                    if (j3 == C) {
                        return a(kVar, j2);
                    }
                }
            }
            Log.d("MetadataUtil", "Skipped unknown metadata entry: " + a.c(j3));
            return null;
        } finally {
            kVar.c(j2);
        }
    }

    private static com.fyber.inneractive.sdk.player.c.f.a.h a(com.fyber.inneractive.sdk.player.c.k.k kVar, int i2) {
        int i3 = -1;
        int i4 = -1;
        String str = null;
        String str2 = null;
        while (kVar.b < i2) {
            int i5 = kVar.b;
            int j2 = kVar.j();
            int j3 = kVar.j();
            kVar.d(4);
            if (j3 == a.aD) {
                str = kVar.f(j2 - 12);
            } else if (j3 == a.aE) {
                str2 = kVar.f(j2 - 12);
            } else {
                if (j3 == a.aF) {
                    i3 = i5;
                    i4 = j2;
                }
                kVar.d(j2 - 12);
            }
        }
        if ("com.apple.iTunes".equals(str) && "iTunSMPB".equals(str2) && i3 != -1) {
            kVar.c(i3);
            kVar.d(16);
            return new com.fyber.inneractive.sdk.player.c.f.a.e("und", str2, kVar.f(i4 - 16));
        }
        return null;
    }
}
