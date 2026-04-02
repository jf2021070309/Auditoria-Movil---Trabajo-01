package com.amazon.aps.iva.c6;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.amazon.aps.iva.c6.s;
import com.amazon.aps.iva.t5.g0;
import java.lang.reflect.Method;
/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes.dex */
public final class m {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public final a a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public int e;
    public l f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, long j);

        void b(long j);

        void c(long j);

        void d(long j, long j2, long j3, long j4);

        void e(long j, long j2, long j3, long j4);
    }

    public m(s.j jVar) {
        this.a = jVar;
        if (g0.a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ac A[Catch: Exception -> 0x01b2, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b2, blocks: (B:82:0x0184, B:84:0x01ac), top: B:121:0x0184 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(boolean r27) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.m.a(boolean):long");
    }

    public final long b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((((g0.x((elapsedRealtime * 1000) - j, this.j) * this.g) + 1000000) - 1) / 1000000));
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (g0.a <= 29) {
                    if (playbackHeadPosition == 0 && this.t > 0 && playState == 3) {
                        if (this.z == -9223372036854775807L) {
                            this.z = elapsedRealtime;
                        }
                    } else {
                        this.z = -9223372036854775807L;
                    }
                }
                if (this.t > playbackHeadPosition) {
                    this.u++;
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(long r8) {
        /*
            r7 = this;
            r0 = 0
            long r1 = r7.a(r0)
            int r3 = r7.g
            int r4 = com.amazon.aps.iva.t5.g0.a
            long r3 = (long) r3
            long r1 = r1 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r1 + r3
            r5 = 1
            long r1 = r1 - r5
            long r1 = r1 / r3
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r9 = 1
            if (r8 > 0) goto L37
            boolean r8 = r7.h
            if (r8 == 0) goto L34
            android.media.AudioTrack r8 = r7.c
            r8.getClass()
            int r8 = r8.getPlayState()
            r1 = 2
            if (r8 != r1) goto L34
            long r1 = r7.b()
            r3 = 0
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L34
            r8 = r9
            goto L35
        L34:
            r8 = r0
        L35:
            if (r8 == 0) goto L38
        L37:
            r0 = r9
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.m.c(long):boolean");
    }

    public final void d() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r4 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.c = r3
            r2.d = r6
            r2.e = r7
            com.amazon.aps.iva.c6.l r0 = new com.amazon.aps.iva.c6.l
            r0.<init>(r3)
            r2.f = r0
            int r3 = r3.getSampleRate()
            r2.g = r3
            r3 = 0
            if (r4 == 0) goto L29
            int r4 = com.amazon.aps.iva.t5.g0.a
            r0 = 23
            r1 = 1
            if (r4 >= r0) goto L25
            r4 = 5
            if (r5 == r4) goto L23
            r4 = 6
            if (r5 != r4) goto L25
        L23:
            r4 = r1
            goto L26
        L25:
            r4 = r3
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            r2.h = r1
            boolean r4 = com.amazon.aps.iva.t5.g0.M(r5)
            r2.q = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L42
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.g
            long r4 = com.amazon.aps.iva.t5.g0.W(r6, r4)
            goto L43
        L42:
            r4 = r0
        L43:
            r2.i = r4
            r4 = 0
            r2.t = r4
            r2.u = r4
            r2.v = r4
            r2.p = r3
            r2.y = r0
            r2.z = r0
            r2.r = r4
            r2.o = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c6.m.e(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
