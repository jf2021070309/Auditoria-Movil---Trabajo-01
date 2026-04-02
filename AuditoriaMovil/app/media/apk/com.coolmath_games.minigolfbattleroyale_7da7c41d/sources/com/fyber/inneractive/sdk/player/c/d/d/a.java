package com.fyber.inneractive.sdk.player.c.d.d;

import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
abstract class a {
    public final int aP;
    public static final int a = t.e("ftyp");
    public static final int b = t.e("avc1");
    public static final int c = t.e("avc3");
    public static final int d = t.e("hvc1");
    public static final int e = t.e("hev1");
    public static final int f = t.e("s263");
    public static final int g = t.e("d263");
    public static final int h = t.e("mdat");
    public static final int i = t.e("mp4a");
    public static final int j = t.e(".mp3");
    public static final int k = t.e("wave");
    public static final int l = t.e("lpcm");
    public static final int m = t.e("sowt");
    public static final int n = t.e("ac-3");
    public static final int o = t.e("dac3");
    public static final int p = t.e("ec-3");
    public static final int q = t.e("dec3");
    public static final int r = t.e("dtsc");
    public static final int s = t.e("dtsh");
    public static final int t = t.e("dtsl");
    public static final int u = t.e("dtse");
    public static final int v = t.e("ddts");
    public static final int w = t.e("tfdt");
    public static final int x = t.e("tfhd");
    public static final int y = t.e("trex");
    public static final int z = t.e("trun");
    public static final int A = t.e("sidx");
    public static final int B = t.e("moov");
    public static final int C = t.e("mvhd");
    public static final int D = t.e("trak");
    public static final int E = t.e("mdia");
    public static final int F = t.e("minf");
    public static final int G = t.e("stbl");
    public static final int H = t.e("avcC");
    public static final int I = t.e("hvcC");
    public static final int J = t.e("esds");
    public static final int K = t.e("moof");
    public static final int L = t.e("traf");
    public static final int M = t.e("mvex");
    public static final int N = t.e("mehd");
    public static final int O = t.e("tkhd");
    public static final int P = t.e("edts");
    public static final int Q = t.e("elst");
    public static final int R = t.e("mdhd");
    public static final int S = t.e("hdlr");
    public static final int T = t.e("stsd");
    public static final int U = t.e("pssh");
    public static final int V = t.e("sinf");
    public static final int W = t.e("schm");
    public static final int X = t.e("schi");
    public static final int Y = t.e("tenc");
    public static final int Z = t.e("encv");
    public static final int aa = t.e("enca");
    public static final int ab = t.e("frma");
    public static final int ac = t.e("saiz");
    public static final int ad = t.e("saio");
    public static final int ae = t.e("sbgp");
    public static final int af = t.e("sgpd");
    public static final int ag = t.e("uuid");
    public static final int ah = t.e("senc");
    public static final int ai = t.e("pasp");
    public static final int aj = t.e("TTML");
    public static final int ak = t.e("vmhd");
    public static final int al = t.e("mp4v");
    public static final int am = t.e("stts");
    public static final int an = t.e("stss");
    public static final int ao = t.e("ctts");
    public static final int ap = t.e("stsc");
    public static final int aq = t.e("stsz");
    public static final int ar = t.e("stz2");
    public static final int as = t.e("stco");
    public static final int at = t.e("co64");
    public static final int au = t.e("tx3g");
    public static final int av = t.e("wvtt");
    public static final int aw = t.e("stpp");
    public static final int ax = t.e("c608");
    public static final int ay = t.e("samr");
    public static final int az = t.e("sawb");
    public static final int aA = t.e("udta");
    public static final int aB = t.e("meta");
    public static final int aC = t.e("ilst");
    public static final int aD = t.e("mean");
    public static final int aE = t.e("name");
    public static final int aF = t.e("data");
    public static final int aG = t.e("emsg");
    public static final int aH = t.e("st3d");
    public static final int aI = t.e("sv3d");
    public static final int aJ = t.e("proj");
    public static final int aK = t.e("vp08");
    public static final int aL = t.e("vp09");
    public static final int aM = t.e("vpcC");
    public static final int aN = t.e("camm");
    public static final int aO = t.e("alac");

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & ViewCompat.MEASURED_SIZE_MASK;
    }

    public a(int i2) {
        this.aP = i2;
    }

    public String toString() {
        return c(this.aP);
    }

    /* loaded from: classes.dex */
    static final class b extends a {
        public final com.fyber.inneractive.sdk.player.c.k.k aQ;

        public b(int i, com.fyber.inneractive.sdk.player.c.k.k kVar) {
            super(i);
            this.aQ = kVar;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0055a extends a {
        public final long aQ;
        public final List<b> aR;
        public final List<C0055a> aS;

        public C0055a(int i, long j) {
            super(i);
            this.aQ = j;
            this.aR = new ArrayList();
            this.aS = new ArrayList();
        }

        public final void a(b bVar) {
            this.aR.add(bVar);
        }

        public final void a(C0055a c0055a) {
            this.aS.add(c0055a);
        }

        public final b d(int i) {
            int size = this.aR.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.aR.get(i2);
                if (bVar.aP == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final C0055a e(int i) {
            int size = this.aS.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0055a c0055a = this.aS.get(i2);
                if (c0055a.aP == i) {
                    return c0055a;
                }
            }
            return null;
        }

        @Override // com.fyber.inneractive.sdk.player.c.d.d.a
        public final String toString() {
            return c(this.aP) + " leaves: " + Arrays.toString(this.aR.toArray()) + " containers: " + Arrays.toString(this.aS.toArray());
        }
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }
}
