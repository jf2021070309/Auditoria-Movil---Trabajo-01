package com.amazon.aps.iva.sj;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ViewGroup;
import com.amazon.aps.iva.a6.l;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.e.d;
import com.amazon.aps.iva.m6.e;
import com.amazon.aps.iva.p6.a;
import com.amazon.aps.iva.p6.b;
import com.amazon.aps.iva.q.c0;
import com.amazon.aps.iva.q5.c;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.sj.b;
import com.amazon.aps.iva.sj.c;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.t5.p;
import com.amazon.aps.iva.w5.i;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.common.collect.HashBiMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* compiled from: AdTagLoader.java */
/* loaded from: classes.dex */
public final class a implements l0.c {
    public com.amazon.aps.iva.q5.c A;
    public boolean B;
    public boolean C;
    public int D;
    public AdMediaInfo E;
    public b F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public b K;
    public long L;
    public long M;
    public long N;
    public boolean O;
    public long P;
    public final c.a b;
    public final c.b c;
    public final List<String> d;
    public final i e;
    public final Object f;
    public final r0.b g;
    public final Handler h;
    public final c i;
    public final ArrayList j;
    public final ArrayList k;
    public final d l;
    public final HashBiMap m;
    public final AdDisplayContainer n;
    public final AdsLoader o;
    public final e p;
    public Object q;
    public l0 r;
    public VideoProgressUpdate s;
    public VideoProgressUpdate t;
    public int u;
    public AdsManager v;
    public boolean w;
    public b.a x;
    public r0 y;
    public long z;

    /* compiled from: AdTagLoader.java */
    /* renamed from: com.amazon.aps.iva.sj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0709a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            a = iArr;
            try {
                iArr[AdEvent.AdEventType.AD_BREAK_FETCH_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdEvent.AdEventType.CONTENT_PAUSE_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdEvent.AdEventType.TAPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdEvent.AdEventType.CLICKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AdEvent.AdEventType.CONTENT_RESUME_REQUESTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AdEvent.AdEventType.LOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: AdTagLoader.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (this.a * 31) + this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.a);
            sb.append(", ");
            return b2.b(sb, this.b, ')');
        }
    }

    public a(Context context, c.a aVar, c.b bVar, List<String> list, i iVar, Object obj, ViewGroup viewGroup) {
        this.b = aVar;
        this.c = bVar;
        aVar.getClass();
        b.a aVar2 = (b.a) bVar;
        aVar2.getClass();
        ImaSdkSettings createImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
        createImaSdkSettings.setLanguage(g0.E()[0]);
        createImaSdkSettings.setPlayerType("google/exo.ext.ima");
        createImaSdkSettings.setPlayerVersion("1.1.1");
        this.d = list;
        this.e = iVar;
        this.f = obj;
        this.g = new r0.b();
        this.h = new Handler(Looper.getMainLooper(), null);
        c cVar = new c();
        this.i = cVar;
        this.j = new ArrayList();
        this.k = new ArrayList(1);
        this.l = new d(this, 12);
        this.m = HashBiMap.create();
        VideoProgressUpdate videoProgressUpdate = VideoProgressUpdate.VIDEO_TIME_NOT_READY;
        this.s = videoProgressUpdate;
        this.t = videoProgressUpdate;
        this.L = -9223372036854775807L;
        this.M = -9223372036854775807L;
        this.N = -9223372036854775807L;
        this.P = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.y = r0.b;
        this.A = com.amazon.aps.iva.q5.c.h;
        this.p = new e(this, 5);
        if (viewGroup != null) {
            aVar2.getClass();
            this.n = ImaSdkFactory.createAdDisplayContainer(viewGroup, cVar);
        } else {
            aVar2.getClass();
            this.n = ImaSdkFactory.createAudioAdDisplayContainer(context, cVar);
        }
        AdDisplayContainer adDisplayContainer = this.n;
        aVar2.getClass();
        AdsLoader createAdsLoader = ImaSdkFactory.getInstance().createAdsLoader(context, createImaSdkSettings, adDisplayContainer);
        createAdsLoader.addAdErrorListener(cVar);
        AdErrorEvent.AdErrorListener adErrorListener = aVar.g;
        if (adErrorListener != null) {
            createAdsLoader.addAdErrorListener(adErrorListener);
        }
        createAdsLoader.addAdsLoadedListener(cVar);
        try {
            AdsRequest b2 = com.amazon.aps.iva.sj.c.b(bVar, iVar);
            Object obj2 = new Object();
            this.q = obj2;
            b2.setUserRequestContext(obj2);
            int i = aVar.b;
            if (i != -1) {
                b2.setVastLoadTimeout(i);
            }
            b2.setContentProgressProvider(cVar);
            createAdsLoader.requestAds(b2);
        } catch (IOException e) {
            this.A = new com.amazon.aps.iva.q5.c(this.f, new long[0]);
            C0();
            this.x = new b.a(e);
            A0();
        }
        this.o = createAdsLoader;
    }

    public static void G(a aVar, AdEvent adEvent) {
        int S;
        if (aVar.v != null) {
            int i = C0709a.a[adEvent.getType().ordinal()];
            ArrayList arrayList = aVar.j;
            int i2 = 0;
            switch (i) {
                case 1:
                    String str = adEvent.getAdData().get("adBreakTime");
                    str.getClass();
                    aVar.b.getClass();
                    double parseDouble = Double.parseDouble(str);
                    if (parseDouble == -1.0d) {
                        S = aVar.A.c - 1;
                    } else {
                        S = aVar.S(parseDouble);
                    }
                    aVar.x0(S);
                    return;
                case 2:
                    aVar.C = true;
                    aVar.D = 0;
                    if (aVar.O) {
                        aVar.N = -9223372036854775807L;
                        aVar.O = false;
                        return;
                    }
                    return;
                case 3:
                    while (i2 < arrayList.size()) {
                        ((a.InterfaceC0604a) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    return;
                case 4:
                    while (i2 < arrayList.size()) {
                        ((a.InterfaceC0604a) arrayList.get(i2)).getClass();
                        i2++;
                    }
                    return;
                case 5:
                    aVar.C = false;
                    b bVar = aVar.F;
                    if (bVar != null) {
                        aVar.A = aVar.A.h(bVar.a);
                        aVar.C0();
                        return;
                    }
                    return;
                case 6:
                    Objects.toString(adEvent.getAdData());
                    p.f();
                    return;
                default:
                    return;
            }
        }
    }

    public static void I(a aVar, AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        boolean z;
        boolean z2;
        c.a a;
        int i;
        AdsManager adsManager = aVar.v;
        c.a aVar2 = aVar.b;
        if (adsManager == null) {
            aVar2.getClass();
            return;
        }
        int S = adPodInfo.getPodIndex() == -1 ? aVar.A.c - 1 : aVar.S(adPodInfo.getTimeOffset());
        int adPosition = adPodInfo.getAdPosition() - 1;
        b bVar = new b(S, adPosition);
        aVar.m.forcePut(adMediaInfo, bVar);
        aVar2.getClass();
        com.amazon.aps.iva.q5.c cVar = aVar.A;
        if (S < cVar.c && (i = (a = cVar.a(S)).c) != -1 && adPosition < i && a.f[adPosition] == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            l0 l0Var = aVar.r;
            if (l0Var != null && l0Var.U() == S && aVar.r.z0() == adPosition) {
                aVar.h.removeCallbacks(aVar.p);
            }
            com.amazon.aps.iva.q5.c e = aVar.A.e(S, Math.max(adPodInfo.getTotalAds(), aVar.A.a(S).f.length));
            aVar.A = e;
            c.a a2 = e.a(S);
            for (int i2 = 0; i2 < adPosition; i2++) {
                if (a2.f[i2] == 0) {
                    aVar.A = aVar.A.f(S, i2);
                }
            }
            Uri parse = Uri.parse(adMediaInfo.getUrl());
            com.amazon.aps.iva.q5.c cVar2 = aVar.A;
            int i3 = bVar.a - cVar2.f;
            c.a[] aVarArr = cVar2.g;
            c.a[] aVarArr2 = (c.a[]) g0.S(aVarArr, aVarArr.length);
            if (Uri.EMPTY.equals(parse) && !aVarArr2[i3].i) {
                z2 = false;
            } else {
                z2 = true;
            }
            com.amazon.aps.iva.cq.b.C(z2);
            c.a aVar3 = aVarArr2[i3];
            int i4 = bVar.b;
            int[] iArr = aVar3.f;
            int length = iArr.length;
            int max = Math.max(i4 + 1, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            long[] jArr = aVar3.g;
            if (jArr.length != copyOf.length) {
                jArr = c.a.a(jArr, copyOf.length);
            }
            Uri[] uriArr = (Uri[]) Arrays.copyOf(aVar3.e, copyOf.length);
            uriArr[i4] = parse;
            copyOf[i4] = 1;
            aVarArr2[i3] = new c.a(aVar3.b, aVar3.c, aVar3.d, copyOf, uriArr, jArr, aVar3.h, aVar3.i);
            aVar.A = new com.amazon.aps.iva.q5.c(cVar2.b, aVarArr2, cVar2.d, cVar2.e, cVar2.f);
            aVar.C0();
        }
    }

    public static void K(a aVar, AdMediaInfo adMediaInfo) {
        aVar.b.getClass();
        if (aVar.v != null) {
            if (aVar.D == 1) {
                p.g();
            }
            int i = aVar.D;
            ArrayList arrayList = aVar.k;
            int i2 = 0;
            if (i == 0) {
                aVar.L = -9223372036854775807L;
                aVar.M = -9223372036854775807L;
                aVar.D = 1;
                aVar.E = adMediaInfo;
                b bVar = (b) aVar.m.get(adMediaInfo);
                bVar.getClass();
                aVar.F = bVar;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i3)).onPlay(adMediaInfo);
                }
                b bVar2 = aVar.K;
                if (bVar2 != null && bVar2.equals(aVar.F)) {
                    aVar.K = null;
                    while (i2 < arrayList.size()) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i2)).onError(adMediaInfo);
                        i2++;
                    }
                }
                aVar.D0();
            } else {
                aVar.D = 1;
                com.amazon.aps.iva.cq.b.C(adMediaInfo.equals(aVar.E));
                while (i2 < arrayList.size()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i2)).onResume(adMediaInfo);
                    i2++;
                }
            }
            l0 l0Var = aVar.r;
            if (l0Var == null || !l0Var.k0()) {
                AdsManager adsManager = aVar.v;
                adsManager.getClass();
                adsManager.pause();
            }
        }
    }

    public static void N(a aVar, AdMediaInfo adMediaInfo) {
        c.a a;
        int i;
        aVar.b.getClass();
        if (aVar.v != null) {
            if (aVar.D == 0) {
                b bVar = (b) aVar.m.get(adMediaInfo);
                if (bVar != null) {
                    aVar.A = aVar.A.g(bVar.a, bVar.b);
                    aVar.C0();
                    return;
                }
                return;
            }
            boolean z = false;
            aVar.D = 0;
            aVar.h.removeCallbacks(aVar.l);
            aVar.F.getClass();
            b bVar2 = aVar.F;
            int i2 = bVar2.a;
            com.amazon.aps.iva.q5.c cVar = aVar.A;
            int i3 = cVar.c;
            int i4 = bVar2.b;
            if (i2 < i3 && (i = (a = cVar.a(i2)).c) != -1 && i4 < i && a.f[i4] == 4) {
                z = true;
            }
            if (!z) {
                com.amazon.aps.iva.q5.c cVar2 = aVar.A;
                int i5 = i2 - cVar2.f;
                c.a[] aVarArr = cVar2.g;
                c.a[] aVarArr2 = (c.a[]) g0.S(aVarArr, aVarArr.length);
                aVarArr2[i5] = aVarArr2[i5].d(3, i4);
                Object obj = cVar2.b;
                long j = cVar2.d;
                long j2 = cVar2.e;
                int i6 = cVar2.f;
                com.amazon.aps.iva.q5.c cVar3 = new com.amazon.aps.iva.q5.c(obj, aVarArr2, j, j2, i6);
                if (j != 0) {
                    cVar3 = new com.amazon.aps.iva.q5.c(obj, aVarArr2, 0L, j2, i6);
                }
                aVar.A = cVar3;
                aVar.C0();
                if (!aVar.H) {
                    aVar.E = null;
                    aVar.F = null;
                }
            }
        }
    }

    public static long U(l0 l0Var, r0 r0Var, r0.b bVar) {
        long E0 = l0Var.E0();
        if (r0Var.r()) {
            return E0;
        }
        return E0 - g0.e0(r0Var.h(l0Var.p0(), bVar, false).f);
    }

    public final void A0() {
        if (this.x != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.j;
                if (i < arrayList.size()) {
                    ((a.InterfaceC0604a) arrayList.get(i)).a(this.x, this.e);
                    i++;
                } else {
                    this.x = null;
                    return;
                }
            }
        }
    }

    public final void B0() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i2)).onContentComplete();
            i2++;
        }
        this.G = true;
        this.b.getClass();
        while (true) {
            com.amazon.aps.iva.q5.c cVar = this.A;
            if (i < cVar.c) {
                if (cVar.a(i).b != Long.MIN_VALUE) {
                    this.A = this.A.h(i);
                }
                i++;
            } else {
                C0();
                return;
            }
        }
    }

    public final void C0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.j;
            if (i < arrayList.size()) {
                ((a.InterfaceC0604a) arrayList.get(i)).b(this.A);
                i++;
            } else {
                return;
            }
        }
    }

    public final void D0() {
        VideoProgressUpdate T = T();
        this.b.getClass();
        AdMediaInfo adMediaInfo = this.E;
        adMediaInfo.getClass();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i)).onAdProgress(adMediaInfo, T);
                i++;
            } else {
                Handler handler = this.h;
                d dVar = this.l;
                handler.removeCallbacks(dVar);
                handler.postDelayed(dVar, 200L);
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void H(int i, l0.d dVar, l0.d dVar2) {
        v0();
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void J(int i) {
        l0 l0Var = this.r;
        if (this.v != null && l0Var != null) {
            if (i == 2 && !l0Var.o() && w0()) {
                this.P = SystemClock.elapsedRealtime();
            } else if (i == 3) {
                this.P = -9223372036854775807L;
            }
            u0(i, l0Var.k0());
        }
    }

    public final void Q() {
        AdsManager adsManager = this.v;
        if (adsManager != null) {
            c cVar = this.i;
            adsManager.removeAdErrorListener(cVar);
            c.a aVar = this.b;
            AdErrorEvent.AdErrorListener adErrorListener = aVar.g;
            if (adErrorListener != null) {
                this.v.removeAdErrorListener(adErrorListener);
            }
            this.v.removeAdEventListener(cVar);
            AdEvent.AdEventListener adEventListener = aVar.h;
            if (adEventListener != null) {
                this.v.removeAdEventListener(adEventListener);
            }
            this.v.destroy();
            this.v = null;
        }
    }

    public final void R() {
        boolean z;
        if (!this.G && this.z != -9223372036854775807L && this.N == -9223372036854775807L) {
            l0 l0Var = this.r;
            l0Var.getClass();
            long U = U(l0Var, this.y, this.g);
            if (5000 + U < this.z) {
                return;
            }
            int c2 = this.A.c(g0.Q(U), g0.Q(this.z));
            if (c2 != -1 && this.A.a(c2).b != Long.MIN_VALUE) {
                c.a a = this.A.a(c2);
                int i = a.c;
                if (i != -1 && a.b(-1) >= i) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            B0();
        }
    }

    public final int S(double d) {
        long round = Math.round(((float) d) * 1000000.0d);
        int i = 0;
        while (true) {
            com.amazon.aps.iva.q5.c cVar = this.A;
            if (i < cVar.c) {
                long j = cVar.a(i).b;
                if (j != Long.MIN_VALUE && Math.abs(j - round) < 1000) {
                    return i;
                }
                i++;
            } else {
                throw new IllegalStateException("Failed to find cue point");
            }
        }
    }

    public final VideoProgressUpdate T() {
        l0 l0Var = this.r;
        if (l0Var == null) {
            return this.t;
        }
        if (this.D != 0 && this.H) {
            long duration = l0Var.getDuration();
            if (duration == -9223372036854775807L) {
                return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            }
            return new VideoProgressUpdate(this.r.a(), duration);
        }
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    public final VideoProgressUpdate Y() {
        boolean z;
        long j;
        if (this.z != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.N;
        if (j2 != -9223372036854775807L) {
            this.O = true;
        } else {
            l0 l0Var = this.r;
            if (l0Var == null) {
                return this.s;
            }
            if (this.L != -9223372036854775807L) {
                j2 = this.M + (SystemClock.elapsedRealtime() - this.L);
            } else if (this.D == 0 && !this.H && z) {
                j2 = U(l0Var, this.y, this.g);
            } else {
                return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            }
        }
        if (z) {
            j = this.z;
        } else {
            j = -1;
        }
        return new VideoProgressUpdate(j2, j);
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void Z(l lVar) {
        if (this.D != 0) {
            AdMediaInfo adMediaInfo = this.E;
            adMediaInfo.getClass();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.k;
                if (i < arrayList.size()) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i)).onError(adMediaInfo);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final int a0() {
        l0 l0Var = this.r;
        if (l0Var == null) {
            return -1;
        }
        long Q = g0.Q(U(l0Var, this.y, this.g));
        int c2 = this.A.c(Q, g0.Q(this.z));
        if (c2 == -1) {
            return this.A.b(Q, g0.Q(this.z));
        }
        return c2;
    }

    public final int f0() {
        l0 l0Var = this.r;
        if (l0Var == null) {
            return this.u;
        }
        if (l0Var.V(22)) {
            return (int) (l0Var.getVolume() * 100.0f);
        }
        if (l0Var.Q().b(1)) {
            return 100;
        }
        return 0;
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void g0(int i, boolean z) {
        l0 l0Var;
        AdsManager adsManager = this.v;
        if (adsManager != null && (l0Var = this.r) != null) {
            int i2 = this.D;
            if (i2 == 1 && !z) {
                adsManager.pause();
            } else if (i2 == 2 && z) {
                adsManager.resume();
            } else {
                u0(l0Var.h(), z);
            }
        }
    }

    public final void j0(Exception exc) {
        int a0 = a0();
        if (a0 == -1) {
            p.h("Unable to determine ad group index for ad group load error", exc);
            return;
        }
        x0(a0);
        if (this.x == null) {
            this.x = new b.a(new IOException(c0.a("Failed to load ad group ", a0), exc));
        }
    }

    @Override // com.amazon.aps.iva.q5.l0.c
    public final void q0(r0 r0Var, int i) {
        if (r0Var.r()) {
            return;
        }
        this.y = r0Var;
        l0 l0Var = this.r;
        l0Var.getClass();
        int p0 = l0Var.p0();
        r0.b bVar = this.g;
        long j = r0Var.h(p0, bVar, false).e;
        this.z = g0.e0(j);
        com.amazon.aps.iva.q5.c cVar = this.A;
        long j2 = cVar.e;
        if (j != j2) {
            if (j2 != j) {
                cVar = new com.amazon.aps.iva.q5.c(cVar.b, cVar.g, cVar.d, j, cVar.f);
            }
            this.A = cVar;
            C0();
        }
        y0(U(l0Var, r0Var, bVar), this.z);
        v0();
    }

    public final void release() {
        if (this.B) {
            return;
        }
        this.B = true;
        this.q = null;
        Q();
        AdsLoader adsLoader = this.o;
        c cVar = this.i;
        adsLoader.removeAdsLoadedListener(cVar);
        adsLoader.removeAdErrorListener(cVar);
        AdErrorEvent.AdErrorListener adErrorListener = this.b.g;
        if (adErrorListener != null) {
            adsLoader.removeAdErrorListener(adErrorListener);
        }
        adsLoader.release();
        int i = 0;
        this.C = false;
        this.D = 0;
        this.E = null;
        this.h.removeCallbacks(this.l);
        this.F = null;
        this.x = null;
        while (true) {
            com.amazon.aps.iva.q5.c cVar2 = this.A;
            if (i < cVar2.c) {
                this.A = cVar2.h(i);
                i++;
            } else {
                C0();
                return;
            }
        }
    }

    public final void t0(int i, int i2) {
        this.b.getClass();
        if (this.v == null) {
            p.g();
            return;
        }
        if (this.D == 0) {
            this.L = SystemClock.elapsedRealtime();
            long e0 = g0.e0(this.A.a(i).b);
            this.M = e0;
            if (e0 == Long.MIN_VALUE) {
                this.M = this.z;
            }
            this.K = new b(i, i2);
        } else {
            AdMediaInfo adMediaInfo = this.E;
            adMediaInfo.getClass();
            int i3 = this.J;
            ArrayList arrayList = this.k;
            if (i2 > i3) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i4)).onEnded(adMediaInfo);
                }
            }
            this.J = this.A.a(i).b(-1);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i5)).onError(adMediaInfo);
            }
        }
        this.A = this.A.f(i, i2);
        C0();
    }

    public final void u0(int i, boolean z) {
        boolean z2 = this.H;
        ArrayList arrayList = this.k;
        if (z2 && this.D == 1) {
            boolean z3 = this.I;
            if (!z3 && i == 2) {
                this.I = true;
                AdMediaInfo adMediaInfo = this.E;
                adMediaInfo.getClass();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i2)).onBuffering(adMediaInfo);
                }
                this.h.removeCallbacks(this.l);
            } else if (z3 && i == 3) {
                this.I = false;
                D0();
            }
        }
        int i3 = this.D;
        if (i3 == 0 && i == 2 && z) {
            R();
        } else if (i3 != 0 && i == 4) {
            AdMediaInfo adMediaInfo2 = this.E;
            if (adMediaInfo2 == null) {
                p.g();
            } else {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i4)).onEnded(adMediaInfo2);
                }
            }
            this.b.getClass();
        }
    }

    public final void v0() {
        int i;
        boolean z;
        int U;
        l0 l0Var = this.r;
        if (this.v != null && l0Var != null) {
            boolean z2 = false;
            if (!this.H && !l0Var.o()) {
                R();
                if (!this.G && !this.y.r()) {
                    r0 r0Var = this.y;
                    r0.b bVar = this.g;
                    long U2 = U(l0Var, r0Var, bVar);
                    this.y.g(l0Var.p0(), bVar);
                    if (bVar.h.c(g0.Q(U2), bVar.e) != -1) {
                        this.O = false;
                        this.N = U2;
                    }
                }
            }
            boolean z3 = this.H;
            int i2 = this.J;
            boolean o = l0Var.o();
            this.H = o;
            if (o) {
                i = l0Var.z0();
            } else {
                i = -1;
            }
            this.J = i;
            if (z3 && i != i2) {
                z = true;
            } else {
                z = false;
            }
            c.a aVar = this.b;
            if (z) {
                AdMediaInfo adMediaInfo = this.E;
                if (adMediaInfo == null) {
                    p.g();
                } else {
                    b bVar2 = (b) this.m.get(adMediaInfo);
                    int i3 = this.J;
                    if (i3 == -1 || (bVar2 != null && bVar2.b < i3)) {
                        int i4 = 0;
                        while (true) {
                            ArrayList arrayList = this.k;
                            if (i4 >= arrayList.size()) {
                                break;
                            }
                            ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i4)).onEnded(adMediaInfo);
                            i4++;
                        }
                        aVar.getClass();
                    }
                }
            }
            if (!this.G && !z3 && this.H && this.D == 0) {
                c.a a = this.A.a(l0Var.U());
                if (a.b == Long.MIN_VALUE) {
                    B0();
                } else {
                    this.L = SystemClock.elapsedRealtime();
                    long e0 = g0.e0(a.b);
                    this.M = e0;
                    if (e0 == Long.MIN_VALUE) {
                        this.M = this.z;
                    }
                }
            }
            l0 l0Var2 = this.r;
            if (l0Var2 != null && (U = l0Var2.U()) != -1) {
                c.a a2 = this.A.a(U);
                int z0 = l0Var2.z0();
                int i5 = a2.c;
                if (i5 == -1 || i5 <= z0 || a2.f[z0] == 0) {
                    z2 = true;
                }
            }
            if (z2) {
                Handler handler = this.h;
                e eVar = this.p;
                handler.removeCallbacks(eVar);
                handler.postDelayed(eVar, aVar.a);
            }
        }
    }

    public final boolean w0() {
        int a0;
        l0 l0Var = this.r;
        if (l0Var == null || (a0 = a0()) == -1) {
            return false;
        }
        c.a a = this.A.a(a0);
        int i = a.c;
        if ((i != -1 && i != 0 && a.f[0] != 0) || g0.e0(a.b) - U(l0Var, this.y, this.g) >= this.b.a) {
            return false;
        }
        return true;
    }

    public final void x0(int i) {
        c.a a = this.A.a(i);
        if (a.c == -1) {
            com.amazon.aps.iva.q5.c e = this.A.e(i, Math.max(1, a.f.length));
            this.A = e;
            a = e.a(i);
        }
        for (int i2 = 0; i2 < a.c; i2++) {
            if (a.f[i2] == 0) {
                this.b.getClass();
                this.A = this.A.f(i, i2);
            }
        }
        C0();
        this.N = -9223372036854775807L;
        this.L = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r13 != Long.MIN_VALUE) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r6.a(1).b == Long.MIN_VALUE) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(long r16, long r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sj.a.y0(long, long):void");
    }

    public final void z0(String str, RuntimeException runtimeException) {
        String concat = "Internal error in ".concat(str);
        p.d(concat, runtimeException);
        int i = 0;
        int i2 = 0;
        while (true) {
            com.amazon.aps.iva.q5.c cVar = this.A;
            if (i2 >= cVar.c) {
                break;
            }
            this.A = cVar.h(i2);
            i2++;
        }
        C0();
        while (true) {
            ArrayList arrayList = this.j;
            if (i < arrayList.size()) {
                ((a.InterfaceC0604a) arrayList.get(i)).a(new b.a(new RuntimeException(concat, runtimeException)), this.e);
                i++;
            } else {
                return;
            }
        }
    }

    /* compiled from: AdTagLoader.java */
    /* loaded from: classes.dex */
    public final class c implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {
        public c() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            a.this.k.add(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.AdProgressProvider
        public final VideoProgressUpdate getAdProgress() {
            throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public final VideoProgressUpdate getContentProgress() {
            l0 l0Var;
            a aVar = a.this;
            VideoProgressUpdate Y = aVar.Y();
            aVar.b.getClass();
            if (aVar.P != -9223372036854775807L) {
                if (SystemClock.elapsedRealtime() - aVar.P >= 4000) {
                    aVar.P = -9223372036854775807L;
                    aVar.j0(new IOException("Ad preloading timed out"));
                    aVar.A0();
                }
            } else if (aVar.N != -9223372036854775807L && (l0Var = aVar.r) != null && l0Var.h() == 2 && aVar.w0()) {
                aVar.P = SystemClock.elapsedRealtime();
            }
            return Y;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public final int getVolume() {
            return a.this.f0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
            a aVar = a.this;
            try {
                a.I(aVar, adMediaInfo, adPodInfo);
            } catch (RuntimeException e) {
                aVar.z0("loadAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public final void onAdError(AdErrorEvent adErrorEvent) {
            AdError error = adErrorEvent.getError();
            a aVar = a.this;
            aVar.b.getClass();
            boolean z = false;
            if (aVar.v == null) {
                aVar.q = null;
                aVar.A = new com.amazon.aps.iva.q5.c(aVar.f, new long[0]);
                aVar.C0();
            } else {
                if ((error.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || error.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR) ? true : true) {
                    try {
                        aVar.j0(error);
                    } catch (RuntimeException e) {
                        aVar.z0("onAdError", e);
                    }
                }
            }
            if (aVar.x == null) {
                aVar.x = new b.a(error);
            }
            aVar.A0();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public final void onAdEvent(AdEvent adEvent) {
            adEvent.getType();
            a aVar = a.this;
            aVar.b.getClass();
            try {
                a.G(aVar, adEvent);
            } catch (RuntimeException e) {
                aVar.z0("onAdEvent", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public final void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
            a aVar = a.this;
            if (!g0.a(aVar.q, adsManagerLoadedEvent.getUserRequestContext())) {
                adsManager.destroy();
                return;
            }
            aVar.q = null;
            aVar.v = adsManager;
            adsManager.addAdErrorListener(this);
            c.a aVar2 = aVar.b;
            AdErrorEvent.AdErrorListener adErrorListener = aVar2.g;
            if (adErrorListener != null) {
                adsManager.addAdErrorListener(adErrorListener);
            }
            adsManager.addAdEventListener(this);
            AdEvent.AdEventListener adEventListener = aVar2.h;
            if (adEventListener != null) {
                adsManager.addAdEventListener(adEventListener);
            }
            try {
                aVar.A = new com.amazon.aps.iva.q5.c(aVar.f, com.amazon.aps.iva.sj.c.a(adsManager.getAdCuePoints()));
                aVar.C0();
            } catch (RuntimeException e) {
                aVar.z0("onAdsManagerLoaded", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void pauseAd(AdMediaInfo adMediaInfo) {
            a aVar = a.this;
            try {
                aVar.b.getClass();
                if (aVar.v != null && aVar.D != 0) {
                    aVar.D = 2;
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = aVar.k;
                        if (i < arrayList.size()) {
                            ((VideoAdPlayer.VideoAdPlayerCallback) arrayList.get(i)).onPause(adMediaInfo);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            } catch (RuntimeException e) {
                aVar.z0("pauseAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void playAd(AdMediaInfo adMediaInfo) {
            a aVar = a.this;
            try {
                a.K(aVar, adMediaInfo);
            } catch (RuntimeException e) {
                aVar.z0("playAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
            a.this.k.remove(videoAdPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void stopAd(AdMediaInfo adMediaInfo) {
            a aVar = a.this;
            try {
                a.N(aVar, adMediaInfo);
            } catch (RuntimeException e) {
                aVar.z0("stopAd", e);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer
        public final void release() {
        }
    }
}
