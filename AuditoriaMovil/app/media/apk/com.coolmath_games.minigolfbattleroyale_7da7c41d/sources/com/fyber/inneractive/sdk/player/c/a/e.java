package com.fyber.inneractive.sdk.player.c.a;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.work.WorkRequest;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.m;
import com.google.android.gms.games.GamesStatusCodes;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
/* loaded from: classes.dex */
public final class e {
    public static boolean a;
    public static boolean b;
    private final long[] B;
    private final LinkedList<g> C;
    private AudioTrack D;
    private AudioTrack E;
    private m F;
    private long G;
    private long H;
    private ByteBuffer I;
    private int J;
    private int K;
    private long L;
    private long M;
    private boolean N;
    private long O;
    private Method P;
    private long Q;
    private long R;
    private long S;
    private long T;
    private int U;
    private long V;
    private long W;
    private long X;
    private com.fyber.inneractive.sdk.player.c.a.c[] Y;
    private ByteBuffer[] Z;
    private ByteBuffer aa;
    private ByteBuffer ab;
    private byte[] ac;
    private int ad;
    private int ae;
    private boolean af;
    private long ag;
    final com.fyber.inneractive.sdk.player.c.a.f d;
    final com.fyber.inneractive.sdk.player.c.a.c[] e;
    final a f;
    int g;
    int h;
    int i;
    int j;
    int k;
    boolean l;
    int m;
    long n;
    m o;
    int p;
    int q;
    int r;
    int s;
    float t;
    boolean u;
    boolean v;
    int w;
    boolean x;
    private final k y;
    private final f z;
    final com.fyber.inneractive.sdk.player.c.a.b c = null;
    private final ConditionVariable A = new ConditionVariable(true);

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void a(int i);

        void a(int i, long j, long j2);
    }

    /* loaded from: classes.dex */
    public static final class c extends Exception {
        public c(Throwable th) {
            super(th);
        }

        public c(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Exception {
        public final int a;

        public d(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
            this.a = i;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends Exception {
        public final int a;

        public h(int i) {
            super("AudioTrack write failed: " + i);
            this.a = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.a.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0052e extends RuntimeException {
        public C0052e(String str) {
            super(str);
        }
    }

    public e(com.fyber.inneractive.sdk.player.c.a.c[] cVarArr, f fVar) {
        this.z = fVar;
        if (t.a >= 18) {
            try {
                this.P = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (t.a >= 19) {
            this.f = new b();
        } else {
            this.f = new a((byte) 0);
        }
        this.d = new com.fyber.inneractive.sdk.player.c.a.f();
        this.y = new k();
        com.fyber.inneractive.sdk.player.c.a.c[] cVarArr2 = new com.fyber.inneractive.sdk.player.c.a.c[cVarArr.length + 3];
        this.e = cVarArr2;
        cVarArr2[0] = new i();
        com.fyber.inneractive.sdk.player.c.a.c[] cVarArr3 = this.e;
        cVarArr3[1] = this.d;
        System.arraycopy(cVarArr, 0, cVarArr3, 2, cVarArr.length);
        this.e[cVarArr.length + 2] = this.y;
        this.B = new long[10];
        this.t = 1.0f;
        this.s = 0;
        this.k = 3;
        this.w = 0;
        this.o = m.a;
        this.ae = -1;
        this.Y = new com.fyber.inneractive.sdk.player.c.a.c[0];
        this.Z = new ByteBuffer[0];
        this.C = new LinkedList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        com.fyber.inneractive.sdk.player.c.a.c[] cVarArr;
        ArrayList arrayList = new ArrayList();
        for (com.fyber.inneractive.sdk.player.c.a.c cVar : this.e) {
            if (cVar.a()) {
                arrayList.add(cVar);
            } else {
                cVar.g();
            }
        }
        int size = arrayList.size();
        this.Y = (com.fyber.inneractive.sdk.player.c.a.c[]) arrayList.toArray(new com.fyber.inneractive.sdk.player.c.a.c[size]);
        this.Z = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            com.fyber.inneractive.sdk.player.c.a.c cVar2 = this.Y[i];
            cVar2.g();
            this.Z[i] = cVar2.e();
        }
    }

    public final void b() {
        this.v = true;
        if (h()) {
            this.W = System.nanoTime() / 1000;
            this.E.play();
        }
    }

    public final boolean a(ByteBuffer byteBuffer, long j) throws d, h {
        int a2;
        ByteBuffer byteBuffer2 = this.aa;
        com.fyber.inneractive.sdk.player.c.k.a.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!h()) {
            this.A.block();
            if (this.x) {
                this.E = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.h).setEncoding(this.j).setSampleRate(this.g).build(), this.m, 1, this.w);
            } else if (this.w == 0) {
                this.E = new AudioTrack(this.k, this.g, this.h, this.j, this.m, 1);
            } else {
                this.E = new AudioTrack(this.k, this.g, this.h, this.j, this.m, 1, this.w);
            }
            int state = this.E.getState();
            if (state == 1) {
                int audioSessionId = this.E.getAudioSessionId();
                if (a && t.a < 21) {
                    AudioTrack audioTrack = this.D;
                    if (audioTrack != null && audioSessionId != audioTrack.getAudioSessionId()) {
                        g();
                    }
                    if (this.D == null) {
                        this.D = new AudioTrack(this.k, GamesStatusCodes.STATUS_SNAPSHOT_NOT_FOUND, 4, 2, 2, 0, audioSessionId);
                    }
                }
                if (this.w != audioSessionId) {
                    this.w = audioSessionId;
                    this.z.a(audioSessionId);
                }
                this.f.a(this.E, l());
                e();
                this.af = false;
                if (this.v) {
                    b();
                }
            } else {
                try {
                    this.E.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.E = null;
                    throw th;
                }
                this.E = null;
                throw new d(state, this.g, this.h, this.m);
            }
        }
        if (l()) {
            if (this.E.getPlayState() == 2) {
                this.af = false;
                return false;
            } else if (this.E.getPlayState() == 1 && this.f.b() != 0) {
                return false;
            }
        }
        boolean z = this.af;
        boolean d2 = d();
        this.af = d2;
        if (z && !d2 && this.E.getPlayState() != 1) {
            this.z.a(this.m, com.fyber.inneractive.sdk.player.c.b.a(this.n), SystemClock.elapsedRealtime() - this.ag);
        }
        if (this.aa == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.l && this.U == 0) {
                int i = this.j;
                if (i == 7 || i == 8) {
                    a2 = com.fyber.inneractive.sdk.player.c.a.g.a(byteBuffer);
                } else if (i == 5) {
                    a2 = com.fyber.inneractive.sdk.player.c.a.a.a();
                } else if (i == 6) {
                    a2 = com.fyber.inneractive.sdk.player.c.a.a.a(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i);
                }
                this.U = a2;
            }
            if (this.F != null) {
                if (!c()) {
                    return false;
                }
                this.C.add(new g(this.F, Math.max(0L, j), a(i()), (byte) 0));
                this.F = null;
                a();
            }
            if (this.s == 0) {
                this.V = Math.max(0L, j);
                this.s = 1;
            } else {
                long a3 = this.V + a(k());
                if (this.s == 1 && Math.abs(a3 - j) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + a3 + ", got " + j + "]");
                    this.s = 2;
                }
                if (this.s == 2) {
                    this.V += j - a3;
                    this.s = 1;
                    this.z.a();
                }
            }
            if (this.l) {
                this.R += this.U;
            } else {
                this.Q += byteBuffer.remaining();
            }
            this.aa = byteBuffer;
        }
        if (this.l) {
            b(this.aa, j);
        } else {
            c(j);
        }
        if (this.aa.hasRemaining()) {
            return false;
        }
        this.aa = null;
        return true;
    }

    private void c(long j) throws h {
        ByteBuffer byteBuffer;
        int length = this.Y.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.Z[i - 1];
            } else {
                byteBuffer = this.aa;
                if (byteBuffer == null) {
                    byteBuffer = com.fyber.inneractive.sdk.player.c.a.c.a;
                }
            }
            if (i == length) {
                b(byteBuffer, j);
            } else {
                com.fyber.inneractive.sdk.player.c.a.c cVar = this.Y[i];
                cVar.a(byteBuffer);
                ByteBuffer e = cVar.e();
                this.Z[i] = e;
                if (e.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i--;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
        if (r11 < r10) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.c.a.e.h {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.a.e.b(java.nio.ByteBuffer, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() throws com.fyber.inneractive.sdk.player.c.a.e.h {
        /*
            r9 = this;
            int r0 = r9.ae
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.l
            if (r0 == 0) goto Lf
            com.fyber.inneractive.sdk.player.c.a.c[] r0 = r9.Y
            int r0 = r0.length
            goto L10
        Lf:
            r0 = r3
        L10:
            r9.ae = r0
        L12:
            r0 = r2
            goto L15
        L14:
            r0 = r3
        L15:
            int r4 = r9.ae
            com.fyber.inneractive.sdk.player.c.a.c[] r5 = r9.Y
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.d()
        L28:
            r9.c(r7)
            boolean r0 = r4.f()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.ae
            int r0 = r0 + r2
            r9.ae = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.ab
            if (r0 == 0) goto L44
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.ab
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.ae = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.a.e.c():boolean");
    }

    public final boolean d() {
        if (h()) {
            if (i() <= this.f.b()) {
                if (l() && this.E.getPlayState() == 2 && this.E.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final m a(m mVar) {
        if (this.l) {
            m mVar2 = m.a;
            this.o = mVar2;
            return mVar2;
        }
        k kVar = this.y;
        kVar.b = t.a(mVar.b);
        float f2 = kVar.b;
        k kVar2 = this.y;
        float f3 = mVar.c;
        kVar2.c = t.a(f3);
        m mVar3 = new m(f2, f3);
        m mVar4 = this.F;
        if (mVar4 == null) {
            if (this.C.isEmpty()) {
                mVar4 = this.o;
            } else {
                mVar4 = this.C.getLast().a;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (h()) {
                this.F = mVar3;
            } else {
                this.o = mVar3;
            }
        }
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (h()) {
            if (t.a < 21) {
                AudioTrack audioTrack = this.E;
                float f2 = this.t;
                audioTrack.setStereoVolume(f2, f2);
                return;
            }
            this.E.setVolume(this.t);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.fyber.inneractive.sdk.player.c.a.e$1] */
    public final void f() {
        if (h()) {
            this.Q = 0L;
            this.R = 0L;
            this.S = 0L;
            this.T = 0L;
            this.U = 0;
            m mVar = this.F;
            if (mVar != null) {
                this.o = mVar;
                this.F = null;
            } else if (!this.C.isEmpty()) {
                this.o = this.C.getLast().a;
            }
            this.C.clear();
            this.G = 0L;
            this.H = 0L;
            this.aa = null;
            this.ab = null;
            int i = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.c.a.c[] cVarArr = this.Y;
                if (i >= cVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.c.a.c cVar = cVarArr[i];
                cVar.g();
                this.Z[i] = cVar.e();
                i++;
            }
            this.u = false;
            this.ae = -1;
            this.I = null;
            this.p = 0;
            this.s = 0;
            this.X = 0L;
            j();
            if (this.E.getPlayState() == 3) {
                this.E.pause();
            }
            final AudioTrack audioTrack = this.E;
            this.E = null;
            this.f.a(null, false);
            this.A.close();
            new Thread() { // from class: com.fyber.inneractive.sdk.player.c.a.e.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        e.this.A.open();
                    }
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.fyber.inneractive.sdk.player.c.a.e$2] */
    public final void g() {
        final AudioTrack audioTrack = this.D;
        if (audioTrack == null) {
            return;
        }
        this.D = null;
        new Thread() { // from class: com.fyber.inneractive.sdk.player.c.a.e.2
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                audioTrack.release();
            }
        }.start();
    }

    private long d(long j) {
        long j2;
        long j3;
        while (!this.C.isEmpty() && j >= this.C.getFirst().c) {
            g remove = this.C.remove();
            this.o = remove.a;
            this.H = remove.c;
            this.G = remove.b - this.V;
        }
        if (this.o.b == 1.0f) {
            return (j + this.G) - this.H;
        }
        if (this.C.isEmpty() && this.y.e >= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = this.G;
            j3 = t.a(j - this.H, this.y.d, this.y.e);
        } else {
            j2 = this.G;
            j3 = (long) (this.o.b * (j - this.H));
        }
        return j2 + j3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this.E != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        return (j * 1000000) / this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long b(long j) {
        return (j * this.g) / 1000000;
    }

    private long k() {
        return this.l ? this.R : this.Q / this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long i() {
        return this.l ? this.T : this.S / this.r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.L = 0L;
        this.K = 0;
        this.J = 0;
        this.M = 0L;
        this.N = false;
        this.O = 0L;
    }

    private boolean l() {
        if (t.a < 23) {
            int i = this.j;
            return i == 5 || i == 6;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(String str) {
        char c2;
        switch (str.hashCode()) {
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    return c2 != 3 ? 0 : 8;
                }
                return 7;
            }
            return 6;
        }
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        protected AudioTrack a;
        private boolean b;
        private int c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;
        private long i;

        public boolean d() {
            return false;
        }

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public void a(AudioTrack audioTrack, boolean z) {
            this.a = audioTrack;
            this.b = z;
            this.g = -9223372036854775807L;
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            if (audioTrack != null) {
                this.c = audioTrack.getSampleRate();
            }
        }

        public final void a(long j) {
            this.h = b();
            this.g = SystemClock.elapsedRealtime() * 1000;
            this.i = j;
            this.a.stop();
        }

        public final void a() {
            if (this.g != -9223372036854775807L) {
                return;
            }
            this.a.pause();
        }

        public final long b() {
            if (this.g != -9223372036854775807L) {
                return Math.min(this.i, this.h + ((((SystemClock.elapsedRealtime() * 1000) - this.g) * this.c) / 1000000));
            }
            int playState = this.a.getPlayState();
            if (playState == 1) {
                return 0L;
            }
            long playbackHeadPosition = 4294967295L & this.a.getPlaybackHeadPosition();
            if (this.b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f = this.d;
                }
                playbackHeadPosition += this.f;
            }
            if (this.d > playbackHeadPosition) {
                this.e++;
            }
            this.d = playbackHeadPosition;
            return playbackHeadPosition + (this.e << 32);
        }

        public final long c() {
            return (b() * 1000000) / this.c;
        }

        public long e() {
            throw new UnsupportedOperationException();
        }

        public long f() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static class b extends a {
        private final AudioTimestamp b;
        private long c;
        private long d;
        private long e;

        public b() {
            super((byte) 0);
            this.b = new AudioTimestamp();
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.a
        public final void a(AudioTrack audioTrack, boolean z) {
            super.a(audioTrack, z);
            this.c = 0L;
            this.d = 0L;
            this.e = 0L;
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.a
        public final boolean d() {
            boolean timestamp = this.a.getTimestamp(this.b);
            if (timestamp) {
                long j = this.b.framePosition;
                if (this.d > j) {
                    this.c++;
                }
                this.d = j;
                this.e = j + (this.c << 32);
            }
            return timestamp;
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.a
        public final long e() {
            return this.b.nanoTime;
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.a
        public final long f() {
            return this.e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class g {
        final m a;
        final long b;
        final long c;

        /* synthetic */ g(m mVar, long j, long j2, byte b) {
            this(mVar, j, j2);
        }

        private g(m mVar, long j, long j2) {
            this.a = mVar;
            this.b = j;
            this.c = j2;
        }
    }

    public final long a(boolean z) {
        long j;
        Method method;
        if (h() && this.s != 0) {
            if (this.E.getPlayState() == 3) {
                long c2 = this.f.c();
                if (c2 != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - this.M >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                        long[] jArr = this.B;
                        int i = this.J;
                        jArr[i] = c2 - nanoTime;
                        this.J = (i + 1) % 10;
                        int i2 = this.K;
                        if (i2 < 10) {
                            this.K = i2 + 1;
                        }
                        this.M = nanoTime;
                        this.L = 0L;
                        int i3 = 0;
                        while (true) {
                            int i4 = this.K;
                            if (i3 >= i4) {
                                break;
                            }
                            this.L += this.B[i3] / i4;
                            i3++;
                        }
                    }
                    if (!l() && nanoTime - this.O >= 500000) {
                        boolean d2 = this.f.d();
                        this.N = d2;
                        if (d2) {
                            long e = this.f.e() / 1000;
                            long f2 = this.f.f();
                            if (e < this.W) {
                                this.N = false;
                            } else if (Math.abs(e - nanoTime) > 5000000) {
                                String str = "Spurious audio timestamp (system clock mismatch): " + f2 + ", " + e + ", " + nanoTime + ", " + c2 + ", " + k() + ", " + i();
                                if (b) {
                                    throw new C0052e(str);
                                }
                                Log.w("AudioTrack", str);
                                this.N = false;
                            } else if (Math.abs(a(f2) - c2) > 5000000) {
                                String str2 = "Spurious audio timestamp (frame position mismatch): " + f2 + ", " + e + ", " + nanoTime + ", " + c2 + ", " + k() + ", " + i();
                                if (b) {
                                    throw new C0052e(str2);
                                }
                                Log.w("AudioTrack", str2);
                                this.N = false;
                            }
                        }
                        if (this.P != null && !this.l) {
                            try {
                                long intValue = (((Integer) method.invoke(this.E, null)).intValue() * 1000) - this.n;
                                this.X = intValue;
                                long max = Math.max(intValue, 0L);
                                this.X = max;
                                if (max > 5000000) {
                                    Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.X);
                                    this.X = 0L;
                                }
                            } catch (Exception unused) {
                                this.P = null;
                            }
                        }
                        this.O = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (this.N) {
                j = a(this.f.f() + b(nanoTime2 - (this.f.e() / 1000)));
            } else {
                if (this.K == 0) {
                    j = this.f.c();
                } else {
                    j = nanoTime2 + this.L;
                }
                if (!z) {
                    j -= this.X;
                }
            }
            return this.V + d(j);
        }
        return Long.MIN_VALUE;
    }
}
