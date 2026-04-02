package com.amazon.aps.iva.b6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.amazon.aps.iva.b6.b;
import com.amazon.aps.iva.b6.m0;
import com.amazon.aps.iva.c6.k;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.g6.d;
import com.amazon.aps.iva.k6.o;
import com.amazon.aps.iva.o6.v;
import com.amazon.aps.iva.q5.b0;
import com.amazon.aps.iva.q5.l0;
import com.amazon.aps.iva.q5.r0;
import com.amazon.aps.iva.q5.v;
import com.amazon.aps.iva.q5.v0;
import com.amazon.aps.iva.w5.n;
import com.amazon.aps.iva.w5.z;
import com.google.common.collect.UnmodifiableIterator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
/* compiled from: MediaMetricsListener.java */
/* loaded from: classes.dex */
public final class n1 implements com.amazon.aps.iva.b6.b, o1 {
    public boolean A;
    public final Context a;
    public final m0 b;
    public final PlaybackSession c;
    public String i;
    public PlaybackMetrics.Builder j;
    public int k;
    public com.amazon.aps.iva.q5.j0 n;
    public b o;
    public b p;
    public b q;
    public com.amazon.aps.iva.q5.v r;
    public com.amazon.aps.iva.q5.v s;
    public com.amazon.aps.iva.q5.v t;
    public boolean u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;
    public final r0.d e = new r0.d();
    public final r0.b f = new r0.b();
    public final HashMap<String, Long> h = new HashMap<>();
    public final HashMap<String, Long> g = new HashMap<>();
    public final long d = SystemClock.elapsedRealtime();
    public int l = 0;
    public int m = 0;

    /* compiled from: MediaMetricsListener.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: MediaMetricsListener.java */
    /* loaded from: classes.dex */
    public static final class b {
        public final com.amazon.aps.iva.q5.v a;
        public final int b;
        public final String c;

        public b(com.amazon.aps.iva.q5.v vVar, int i, String str) {
            this.a = vVar;
            this.b = i;
            this.c = str;
        }
    }

    public n1(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.c = playbackSession;
        m0 m0Var = new m0();
        this.b = m0Var;
        m0Var.d = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int X(int i) {
        switch (com.amazon.aps.iva.t5.g0.u(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void F(b.a aVar, com.amazon.aps.iva.o6.t tVar) {
        String str;
        if (aVar.d == null) {
            return;
        }
        com.amazon.aps.iva.q5.v vVar = tVar.c;
        vVar.getClass();
        m0 m0Var = this.b;
        v.b bVar = aVar.d;
        bVar.getClass();
        com.amazon.aps.iva.q5.r0 r0Var = aVar.b;
        synchronized (m0Var) {
            str = m0Var.b(r0Var.i(bVar.a, m0Var.b).d, bVar).a;
        }
        b bVar2 = new b(vVar, tVar.d, str);
        int i = tVar.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.q = bVar2;
                        return;
                    }
                    return;
                }
            } else {
                this.p = bVar2;
                return;
            }
        }
        this.o = bVar2;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void K(b.a aVar, com.amazon.aps.iva.a6.f fVar) {
        this.x += fVar.g;
        this.y += fVar.e;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void T(b.a aVar, com.amazon.aps.iva.q5.j0 j0Var) {
        this.n = j0Var;
    }

    public final boolean V(b bVar) {
        String str;
        if (bVar != null) {
            String str2 = bVar.c;
            m0 m0Var = this.b;
            synchronized (m0Var) {
                str = m0Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.z);
            this.j.setVideoFramesDropped(this.x);
            this.j.setVideoFramesPlayed(this.y);
            Long l = this.g.get(this.i);
            PlaybackMetrics.Builder builder2 = this.j;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = this.h.get(this.i);
            PlaybackMetrics.Builder builder3 = this.j;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.j;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            build = this.j.build();
            this.c.reportPlaybackMetrics(build);
        }
        this.j = null;
        this.i = null;
        this.z = 0;
        this.x = 0;
        this.y = 0;
        this.r = null;
        this.s = null;
        this.t = null;
        this.A = false;
    }

    public final void Y(com.amazon.aps.iva.q5.r0 r0Var, v.b bVar) {
        int c;
        int i;
        PlaybackMetrics.Builder builder = this.j;
        if (bVar == null || (c = r0Var.c(bVar.a)) == -1) {
            return;
        }
        r0.b bVar2 = this.f;
        r0Var.g(c, bVar2);
        int i2 = bVar2.d;
        r0.d dVar = this.e;
        r0Var.o(i2, dVar);
        b0.g gVar = dVar.d.c;
        int i3 = 2;
        if (gVar == null) {
            i = 0;
        } else {
            int J = com.amazon.aps.iva.t5.g0.J(gVar.b, gVar.c);
            if (J != 0) {
                if (J != 1) {
                    if (J != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (dVar.o != -9223372036854775807L && !dVar.m && !dVar.j && !dVar.b()) {
            builder.setMediaDurationMillis(dVar.a());
        }
        if (!dVar.b()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.A = true;
    }

    public final void Z(b.a aVar, String str) {
        v.b bVar = aVar.d;
        if ((bVar == null || !bVar.a()) && str.equals(this.i)) {
            W();
        }
        this.g.remove(str);
        this.h.remove(str);
    }

    public final void a0(int i, long j, com.amazon.aps.iva.q5.v vVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i3;
        String str;
        timeSinceCreatedMillis = x0.a(i).setTimeSinceCreatedMillis(j - this.d);
        if (vVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = vVar.l;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = vVar.m;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = vVar.j;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = vVar.i;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = vVar.r;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = vVar.s;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = vVar.z;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = vVar.A;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = vVar.d;
            if (str5 != null) {
                int i9 = com.amazon.aps.iva.t5.g0.a;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = vVar.t;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        PlaybackSession playbackSession = this.c;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void b(b.a aVar, com.amazon.aps.iva.q5.y0 y0Var) {
        b bVar = this.o;
        if (bVar != null) {
            com.amazon.aps.iva.q5.v vVar = bVar.a;
            if (vVar.s == -1) {
                v.a a2 = vVar.a();
                a2.p = y0Var.b;
                a2.q = y0Var.c;
                this.o = new b(a2.a(), bVar.b, bVar.c);
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void e(int i, l0.d dVar, l0.d dVar2, b.a aVar) {
        if (i == 1) {
            this.u = true;
        }
        this.k = i;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void s(b.a aVar, com.amazon.aps.iva.o6.q qVar, com.amazon.aps.iva.o6.t tVar, IOException iOException) {
        this.v = tVar.a;
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void t(com.amazon.aps.iva.q5.l0 l0Var, b.C0132b c0132b) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        a aVar;
        a aVar2;
        a aVar3;
        int i5;
        int i6;
        a aVar4;
        int i7;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        o1 o1Var;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        com.amazon.aps.iva.q5.r rVar;
        int i23;
        if (c0132b.a.c() == 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            boolean z3 = true;
            if (i24 >= c0132b.a.c()) {
                break;
            }
            int b2 = c0132b.a.b(i24);
            b.a aVar5 = c0132b.b.get(b2);
            aVar5.getClass();
            if (b2 == 0) {
                m0 m0Var = this.b;
                synchronized (m0Var) {
                    m0Var.d.getClass();
                    com.amazon.aps.iva.q5.r0 r0Var = m0Var.e;
                    m0Var.e = aVar5.b;
                    Iterator<m0.a> it = m0Var.c.values().iterator();
                    while (it.hasNext()) {
                        m0.a next = it.next();
                        if (!next.b(r0Var, m0Var.e) || next.a(aVar5)) {
                            it.remove();
                            if (next.e) {
                                if (next.a.equals(m0Var.f)) {
                                    m0Var.a(next);
                                }
                                ((n1) m0Var.d).Z(aVar5, next.a);
                            }
                        }
                    }
                    m0Var.c(aVar5);
                }
            } else if (b2 == 11) {
                m0 m0Var2 = this.b;
                int i25 = this.k;
                synchronized (m0Var2) {
                    m0Var2.d.getClass();
                    if (i25 != 0) {
                        z3 = false;
                    }
                    Iterator<m0.a> it2 = m0Var2.c.values().iterator();
                    while (it2.hasNext()) {
                        m0.a next2 = it2.next();
                        if (next2.a(aVar5)) {
                            it2.remove();
                            if (next2.e) {
                                boolean equals = next2.a.equals(m0Var2.f);
                                if (z3 && equals) {
                                    boolean z4 = next2.f;
                                }
                                if (equals) {
                                    m0Var2.a(next2);
                                }
                                ((n1) m0Var2.d).Z(aVar5, next2.a);
                            }
                        }
                    }
                    m0Var2.c(aVar5);
                }
            } else {
                this.b.d(aVar5);
            }
            i24++;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (c0132b.a(0)) {
            b.a aVar6 = c0132b.b.get(0);
            aVar6.getClass();
            if (this.j != null) {
                Y(aVar6.b, aVar6.d);
            }
        }
        if (c0132b.a(2) && this.j != null) {
            UnmodifiableIterator<v0.a> it3 = l0Var.Q().b.iterator();
            loop3: while (true) {
                if (it3.hasNext()) {
                    v0.a next3 = it3.next();
                    for (int i26 = 0; i26 < next3.b; i26++) {
                        if (next3.f[i26] && (rVar = next3.c(i26).p) != null) {
                            break loop3;
                        }
                    }
                } else {
                    rVar = null;
                    break;
                }
            }
            if (rVar != null) {
                PlaybackMetrics.Builder b3 = h1.b(this.j);
                int i27 = 0;
                while (true) {
                    if (i27 < rVar.e) {
                        UUID uuid = rVar.b[i27].c;
                        if (uuid.equals(com.amazon.aps.iva.q5.l.d)) {
                            i23 = 3;
                            break;
                        } else if (uuid.equals(com.amazon.aps.iva.q5.l.e)) {
                            i23 = 2;
                            break;
                        } else if (uuid.equals(com.amazon.aps.iva.q5.l.c)) {
                            i23 = 6;
                            break;
                        } else {
                            i27++;
                        }
                    } else {
                        i23 = 1;
                        break;
                    }
                }
                b3.setDrmType(i23);
            }
        }
        if (c0132b.a(1011)) {
            this.z++;
        }
        com.amazon.aps.iva.q5.j0 j0Var = this.n;
        if (j0Var == null) {
            i8 = 1;
            i9 = 2;
            i4 = 13;
            i2 = 7;
            i3 = 8;
        } else {
            if (this.v == 4) {
                z = true;
            } else {
                z = false;
            }
            int i28 = j0Var.b;
            if (i28 == 1001) {
                aVar2 = new a(20, 0);
            } else {
                if (j0Var instanceof com.amazon.aps.iva.a6.l) {
                    com.amazon.aps.iva.a6.l lVar = (com.amazon.aps.iva.a6.l) j0Var;
                    if (lVar.j == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i = lVar.n;
                } else {
                    i = 0;
                    z2 = false;
                }
                Throwable cause = j0Var.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof com.amazon.aps.iva.w5.r) {
                        aVar2 = new a(5, ((com.amazon.aps.iva.w5.r) cause).f);
                    } else {
                        if (!(cause instanceof com.amazon.aps.iva.w5.q) && !(cause instanceof com.amazon.aps.iva.q5.h0)) {
                            boolean z5 = cause instanceof com.amazon.aps.iva.w5.p;
                            if (!z5 && !(cause instanceof z.a)) {
                                if (i28 == 1002) {
                                    aVar2 = new a(21, 0);
                                } else if (cause instanceof d.a) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i29 = com.amazon.aps.iva.t5.g0.a;
                                    if (i29 >= 21 && (cause2 instanceof MediaDrm.MediaDrmStateException)) {
                                        int v = com.amazon.aps.iva.t5.g0.v(((MediaDrm.MediaDrmStateException) cause2).getDiagnosticInfo());
                                        aVar = new a(X(v), v);
                                        i4 = 13;
                                        i2 = 7;
                                        i3 = 8;
                                    } else if (i29 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                        aVar2 = new a(27, 0);
                                    } else if (i29 >= 18 && (cause2 instanceof NotProvisionedException)) {
                                        aVar2 = new a(24, 0);
                                    } else if (i29 >= 18 && (cause2 instanceof DeniedByServerException)) {
                                        aVar2 = new a(29, 0);
                                    } else if (cause2 instanceof com.amazon.aps.iva.g6.y) {
                                        aVar2 = new a(23, 0);
                                    } else if (cause2 instanceof b.c) {
                                        aVar2 = new a(28, 0);
                                    } else {
                                        aVar2 = new a(30, 0);
                                    }
                                } else if ((cause instanceof n.c) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    if (com.amazon.aps.iva.t5.g0.a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) {
                                        aVar2 = new a(32, 0);
                                    } else {
                                        aVar2 = new a(31, 0);
                                    }
                                } else {
                                    aVar2 = new a(9, 0);
                                }
                            } else {
                                com.amazon.aps.iva.t5.t b4 = com.amazon.aps.iva.t5.t.b(this.a);
                                synchronized (b4.c) {
                                    i6 = b4.d;
                                }
                                if (i6 == 1) {
                                    aVar2 = new a(3, 0);
                                } else {
                                    Throwable cause5 = cause.getCause();
                                    if (cause5 instanceof UnknownHostException) {
                                        aVar2 = new a(6, 0);
                                        i4 = 13;
                                        i2 = 7;
                                        i3 = 8;
                                    } else {
                                        if (cause5 instanceof SocketTimeoutException) {
                                            i2 = 7;
                                            aVar4 = new a(7, 0);
                                        } else {
                                            i2 = 7;
                                            if (z5 && ((com.amazon.aps.iva.w5.p) cause).e == 1) {
                                                aVar4 = new a(4, 0);
                                            } else {
                                                i7 = 8;
                                                aVar4 = new a(8, 0);
                                                aVar2 = aVar4;
                                                i3 = i7;
                                                i4 = 13;
                                            }
                                        }
                                        i7 = 8;
                                        aVar2 = aVar4;
                                        i3 = i7;
                                        i4 = 13;
                                    }
                                }
                            }
                        } else {
                            i2 = 7;
                            if (z) {
                                i5 = 10;
                            } else {
                                i5 = 11;
                            }
                            aVar = new a(i5, 0);
                            i3 = 8;
                            i4 = 13;
                        }
                        aVar2 = aVar;
                    }
                } else {
                    i2 = 7;
                    i3 = 8;
                    if (z2 && (i == 0 || i == 1)) {
                        aVar3 = new a(35, 0);
                    } else if (z2 && i == 3) {
                        aVar3 = new a(15, 0);
                    } else if (z2 && i == 2) {
                        aVar3 = new a(23, 0);
                    } else if (cause instanceof o.b) {
                        i4 = 13;
                        aVar2 = new a(13, com.amazon.aps.iva.t5.g0.v(((o.b) cause).e));
                    } else {
                        i4 = 13;
                        if (cause instanceof com.amazon.aps.iva.k6.m) {
                            aVar2 = new a(14, com.amazon.aps.iva.t5.g0.v(((com.amazon.aps.iva.k6.m) cause).b));
                        } else {
                            if (cause instanceof OutOfMemoryError) {
                                aVar = new a(14, 0);
                            } else if (cause instanceof k.b) {
                                aVar2 = new a(17, ((k.b) cause).b);
                            } else if (cause instanceof k.e) {
                                aVar2 = new a(18, ((k.e) cause).b);
                            } else if (com.amazon.aps.iva.t5.g0.a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                aVar = new a(X(errorCode2), errorCode2);
                            } else {
                                aVar = new a(22, 0);
                            }
                            aVar2 = aVar;
                        }
                    }
                    aVar2 = aVar3;
                    i4 = 13;
                }
                timeSinceCreatedMillis = n0.b().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
                errorCode = timeSinceCreatedMillis.setErrorCode(aVar2.a);
                subErrorCode = errorCode.setSubErrorCode(aVar2.b);
                exception = subErrorCode.setException(j0Var);
                build = exception.build();
                this.c.reportPlaybackErrorEvent(build);
                i8 = 1;
                this.A = true;
                this.n = null;
                i9 = 2;
            }
            i4 = 13;
            i2 = 7;
            i3 = 8;
            timeSinceCreatedMillis = n0.b().setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            errorCode = timeSinceCreatedMillis.setErrorCode(aVar2.a);
            subErrorCode = errorCode.setSubErrorCode(aVar2.b);
            exception = subErrorCode.setException(j0Var);
            build = exception.build();
            this.c.reportPlaybackErrorEvent(build);
            i8 = 1;
            this.A = true;
            this.n = null;
            i9 = 2;
        }
        if (c0132b.a(i9)) {
            com.amazon.aps.iva.q5.v0 Q = l0Var.Q();
            boolean b5 = Q.b(i9);
            boolean b6 = Q.b(i8);
            boolean b7 = Q.b(3);
            if (!b5 && !b6 && !b7) {
                i10 = 9;
                i11 = i4;
                i13 = 3;
                i12 = 10;
            } else {
                if (!b5 && !com.amazon.aps.iva.t5.g0.a(this.r, null)) {
                    if (this.r == null) {
                        i22 = 1;
                    } else {
                        i22 = 0;
                    }
                    this.r = null;
                    i10 = 9;
                    i11 = i4;
                    i12 = 10;
                    i13 = 3;
                    a0(1, elapsedRealtime, null, i22);
                } else {
                    i10 = 9;
                    i11 = i4;
                    i13 = 3;
                    i12 = 10;
                }
                if (!b6 && !com.amazon.aps.iva.t5.g0.a(this.s, null)) {
                    if (this.s == null) {
                        i21 = 1;
                    } else {
                        i21 = 0;
                    }
                    this.s = null;
                    a0(0, elapsedRealtime, null, i21);
                }
                if (!b7 && !com.amazon.aps.iva.t5.g0.a(this.t, null)) {
                    if (this.t == null) {
                        i20 = 1;
                    } else {
                        i20 = 0;
                    }
                    this.t = null;
                    a0(2, elapsedRealtime, null, i20);
                }
            }
        } else {
            i10 = 9;
            i11 = i4;
            i12 = 10;
            i13 = 3;
        }
        if (V(this.o)) {
            b bVar = this.o;
            com.amazon.aps.iva.q5.v vVar = bVar.a;
            if (vVar.s != -1) {
                int i30 = bVar.b;
                if (!com.amazon.aps.iva.t5.g0.a(this.r, vVar)) {
                    if (this.r == null && i30 == 0) {
                        i19 = 1;
                    } else {
                        i19 = i30;
                    }
                    this.r = vVar;
                    a0(1, elapsedRealtime, vVar, i19);
                }
                this.o = null;
            }
        }
        if (V(this.p)) {
            b bVar2 = this.p;
            com.amazon.aps.iva.q5.v vVar2 = bVar2.a;
            int i31 = bVar2.b;
            if (!com.amazon.aps.iva.t5.g0.a(this.s, vVar2)) {
                if (this.s == null && i31 == 0) {
                    i18 = 1;
                } else {
                    i18 = i31;
                }
                this.s = vVar2;
                a0(0, elapsedRealtime, vVar2, i18);
            }
            this.p = null;
        }
        if (V(this.q)) {
            b bVar3 = this.q;
            com.amazon.aps.iva.q5.v vVar3 = bVar3.a;
            int i32 = bVar3.b;
            if (!com.amazon.aps.iva.t5.g0.a(this.t, vVar3)) {
                if (this.t == null && i32 == 0) {
                    i17 = 1;
                } else {
                    i17 = i32;
                }
                this.t = vVar3;
                a0(2, elapsedRealtime, vVar3, i17);
            }
            this.q = null;
        }
        com.amazon.aps.iva.t5.t b8 = com.amazon.aps.iva.t5.t.b(this.a);
        synchronized (b8.c) {
            i14 = b8.d;
        }
        switch (i14) {
            case 0:
                i15 = 0;
                break;
            case 1:
                i15 = i10;
                break;
            case 2:
                i15 = 2;
                break;
            case 3:
                i15 = 4;
                break;
            case 4:
                i15 = 5;
                break;
            case 5:
                i15 = 6;
                break;
            case 6:
            case 8:
            default:
                i15 = 1;
                break;
            case 7:
                i15 = i13;
                break;
            case 9:
                i15 = i3;
                break;
            case 10:
                i15 = i2;
                break;
        }
        if (i15 != this.m) {
            this.m = i15;
            networkType = i1.a().setNetworkType(i15);
            timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            build3 = timeSinceCreatedMillis3.build();
            this.c.reportNetworkEvent(build3);
        }
        if (l0Var.h() != 2) {
            this.u = false;
        }
        if (l0Var.K() == null) {
            this.w = false;
        } else if (c0132b.a(i12)) {
            this.w = true;
        }
        int h = l0Var.h();
        if (this.u) {
            i16 = 5;
        } else if (this.w) {
            i16 = i11;
        } else if (h == 4) {
            i16 = 11;
        } else if (h == 2) {
            int i33 = this.l;
            if (i33 != 0 && i33 != 2) {
                if (!l0Var.k0()) {
                    i16 = i2;
                } else if (l0Var.Z() != 0) {
                    i16 = i12;
                } else {
                    i16 = 6;
                }
            } else {
                i16 = 2;
            }
        } else if (h == i13) {
            if (!l0Var.k0()) {
                i16 = 4;
            } else if (l0Var.Z() != 0) {
                i16 = i10;
            } else {
                i16 = i13;
            }
        } else if (h == 1 && this.l != 0) {
            i16 = 12;
        } else {
            i16 = this.l;
        }
        if (this.l != i16) {
            this.l = i16;
            this.A = true;
            state = e1.a().setState(this.l);
            timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - this.d);
            build2 = timeSinceCreatedMillis2.build();
            this.c.reportPlaybackStateEvent(build2);
        }
        if (c0132b.a(1028)) {
            m0 m0Var3 = this.b;
            b.a aVar7 = c0132b.b.get(1028);
            aVar7.getClass();
            synchronized (m0Var3) {
                String str = m0Var3.f;
                if (str != null) {
                    m0.a aVar8 = m0Var3.c.get(str);
                    aVar8.getClass();
                    m0Var3.a(aVar8);
                }
                Iterator<m0.a> it4 = m0Var3.c.values().iterator();
                while (it4.hasNext()) {
                    m0.a next4 = it4.next();
                    it4.remove();
                    if (next4.e && (o1Var = m0Var3.d) != null) {
                        ((n1) o1Var).Z(aVar7, next4.a);
                    }
                }
            }
        }
    }

    @Override // com.amazon.aps.iva.b6.b
    public final void z(b.a aVar, int i, long j) {
        String str;
        long longValue;
        v.b bVar = aVar.d;
        if (bVar != null) {
            m0 m0Var = this.b;
            com.amazon.aps.iva.q5.r0 r0Var = aVar.b;
            synchronized (m0Var) {
                str = m0Var.b(r0Var.i(bVar.a, m0Var.b).d, bVar).a;
            }
            HashMap<String, Long> hashMap = this.h;
            Long l = hashMap.get(str);
            HashMap<String, Long> hashMap2 = this.g;
            Long l2 = hashMap2.get(str);
            long j2 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap.put(str, Long.valueOf(longValue + j));
            if (l2 != null) {
                j2 = l2.longValue();
            }
            hashMap2.put(str, Long.valueOf(j2 + i));
        }
    }
}
