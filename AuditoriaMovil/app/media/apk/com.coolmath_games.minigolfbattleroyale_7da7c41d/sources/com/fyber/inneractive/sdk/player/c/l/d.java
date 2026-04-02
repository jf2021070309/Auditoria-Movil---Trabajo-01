package com.fyber.inneractive.sdk.player.c.l;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.player.c.e.d;
import com.fyber.inneractive.sdk.player.c.h;
import com.fyber.inneractive.sdk.player.c.k.s;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.l.f;
/* loaded from: classes.dex */
public final class d extends com.fyber.inneractive.sdk.player.c.e.b {
    private static final int[] k = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private float A;
    private int B;
    private int C;
    private int D;
    private float E;
    private int F;
    private int G;
    private int H;
    private float I;
    private boolean J;
    private int K;
    b j;
    private final e l;
    private final f.a m;
    private final long n;
    private final int o;
    private final boolean p;
    private h[] q;
    private a r;
    private Surface s;
    private int t;
    private boolean u;
    private long v;
    private long w;
    private int x;
    private int y;
    private int z;

    public d(Context context, com.fyber.inneractive.sdk.player.c.e.c cVar, Handler handler, f fVar) {
        this(context, cVar, handler, fVar, (byte) 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private d(Context context, com.fyber.inneractive.sdk.player.c.e.c cVar, Handler handler, f fVar, byte b2) {
        super(2, cVar, false);
        boolean z = false;
        this.n = 5000L;
        this.o = -1;
        this.l = new e(context);
        this.m = new f.a(handler, fVar);
        if (t.a <= 22 && "foster".equals(t.b) && "NVIDIA".equals(t.c)) {
            z = true;
        }
        this.p = z;
        this.v = -9223372036854775807L;
        this.B = -1;
        this.C = -1;
        this.E = -1.0f;
        this.A = -1.0f;
        this.t = 1;
        v();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0168  */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.e.c r13, com.fyber.inneractive.sdk.player.c.h r14) throws com.fyber.inneractive.sdk.player.c.e.d.b {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.l.d.a(com.fyber.inneractive.sdk.player.c.e.c, com.fyber.inneractive.sdk.player.c.h):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void a(boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        super.a(z);
        int i = this.a.b;
        this.K = i;
        this.J = i != 0;
        final f.a aVar = this.m;
        final com.fyber.inneractive.sdk.player.c.b.c cVar = this.i;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        e eVar = this.l;
        eVar.h = false;
        if (eVar.b) {
            eVar.a.b.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.a
    public final void a(h[] hVarArr) throws com.fyber.inneractive.sdk.player.c.d {
        this.q = hVarArr;
        super.a(hVarArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void a(long j, boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        super.a(j, z);
        u();
        this.y = 0;
        if (z) {
            t();
        } else {
            this.v = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.n
    public final boolean q() {
        if ((this.u || super.z()) && super.q()) {
            this.v = -9223372036854775807L;
            return true;
        } else if (this.v == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.v) {
                return true;
            }
            this.v = -9223372036854775807L;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void n() {
        super.n();
        this.x = 0;
        this.w = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void o() {
        this.v = -9223372036854775807L;
        D();
        super.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void p() {
        this.B = -1;
        this.C = -1;
        this.E = -1.0f;
        this.A = -1.0f;
        v();
        u();
        e eVar = this.l;
        if (eVar.b) {
            eVar.a.b.sendEmptyMessage(2);
        }
        this.j = null;
        try {
            super.p();
        } finally {
            this.i.a();
            this.m.a(this.i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.a, com.fyber.inneractive.sdk.player.c.e.b
    public final void a(int i, Object obj) throws com.fyber.inneractive.sdk.player.c.d {
        if (i != 1) {
            if (i == 4) {
                this.t = ((Integer) obj).intValue();
                MediaCodec mediaCodec = ((com.fyber.inneractive.sdk.player.c.e.b) this).h;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(this.t);
                    return;
                }
                return;
            }
            super.a(i, obj);
            return;
        }
        Surface surface = (Surface) obj;
        if (this.s == surface) {
            if (surface != null) {
                C();
                if (this.u) {
                    this.m.a(this.s);
                    return;
                }
                return;
            }
            return;
        }
        this.s = surface;
        int i2 = this.c;
        if (i2 == 1 || i2 == 2) {
            MediaCodec mediaCodec2 = ((com.fyber.inneractive.sdk.player.c.e.b) this).h;
            if (t.a < 23 || mediaCodec2 == null || surface == null) {
                A();
                y();
            } else {
                mediaCodec2.setOutputSurface(surface);
            }
        }
        if (surface != null) {
            C();
            u();
            if (i2 == 2) {
                t();
                return;
            }
            return;
        }
        v();
        u();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final boolean z() {
        Surface surface;
        return super.z() && (surface = this.s) != null && surface.isValid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void a(com.fyber.inneractive.sdk.player.c.e.a aVar, MediaCodec mediaCodec, h hVar, MediaCrypto mediaCrypto) throws d.b {
        a aVar2;
        h[] hVarArr = this.q;
        int i = hVar.j;
        int i2 = hVar.k;
        int c = c(hVar);
        if (hVarArr.length == 1) {
            aVar2 = new a(i, i2, c);
        } else {
            boolean z = false;
            for (h hVar2 : hVarArr) {
                if (b(aVar.b, hVar, hVar2)) {
                    z |= hVar2.j == -1 || hVar2.k == -1;
                    i = Math.max(i, hVar2.j);
                    i2 = Math.max(i2, hVar2.k);
                    c = Math.max(c, c(hVar2));
                }
            }
            if (z) {
                Log.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
                Point a2 = a(aVar, hVar);
                if (a2 != null) {
                    i = Math.max(i, a2.x);
                    i2 = Math.max(i2, a2.y);
                    c = Math.max(c, a(hVar.f, i, i2));
                    Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
                }
            }
            aVar2 = new a(i, i2, c);
        }
        this.r = aVar2;
        boolean z2 = this.p;
        int i3 = this.K;
        MediaFormat b2 = hVar.b();
        b2.setInteger("max-width", aVar2.a);
        b2.setInteger("max-height", aVar2.b);
        if (aVar2.c != -1) {
            b2.setInteger("max-input-size", aVar2.c);
        }
        if (z2) {
            b2.setInteger("auto-frc", 0);
        }
        if (i3 != 0) {
            b2.setFeatureEnabled("tunneled-playback", true);
            b2.setInteger("audio-session-id", i3);
        }
        mediaCodec.configure(b2, this.s, mediaCrypto, 0);
        if (t.a < 23 || !this.J) {
            return;
        }
        this.j = new b(this, mediaCodec, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void a(final String str, final long j, final long j2) {
        final f.a aVar = this.m;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.2
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void b(final h hVar) throws com.fyber.inneractive.sdk.player.c.d {
        super.b(hVar);
        final f.a aVar = this.m;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.3
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        this.A = hVar.n == -1.0f ? 1.0f : hVar.n;
        this.z = d(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void B() {
        if (t.a >= 23 || !this.J) {
            return;
        }
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_WIDTH_KEY);
        }
        this.B = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY);
        }
        this.C = integer2;
        this.E = this.A;
        if (t.a >= 21) {
            int i = this.z;
            if (i == 90 || i == 270) {
                int i2 = this.B;
                this.B = this.C;
                this.C = i2;
                this.E = 1.0f / this.E;
            }
        } else {
            this.D = this.z;
        }
        mediaCodec.setVideoScalingMode(this.t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final boolean a(boolean z, h hVar, h hVar2) {
        return b(z, hVar, hVar2) && hVar2.j <= this.r.a && hVar2.k <= this.r.b && hVar2.g <= this.r.c;
    }

    private void a(MediaCodec mediaCodec, int i) {
        w();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        s.a();
        this.i.d++;
        this.y = 0;
        s();
    }

    private void a(MediaCodec mediaCodec, int i, long j) {
        w();
        s.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        s.a();
        this.i.d++;
        this.y = 0;
        s();
    }

    private void t() {
        this.v = this.n > 0 ? SystemClock.elapsedRealtime() + this.n : -9223372036854775807L;
    }

    private void u() {
        MediaCodec mediaCodec;
        this.u = false;
        if (t.a < 23 || !this.J || (mediaCodec = ((com.fyber.inneractive.sdk.player.c.e.b) this).h) == null) {
            return;
        }
        this.j = new b(this, mediaCodec, (byte) 0);
    }

    final void s() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.m.a(this.s);
    }

    private void v() {
        this.F = -1;
        this.G = -1;
        this.I = -1.0f;
        this.H = -1;
    }

    private void w() {
        if (this.B == -1 && this.C == -1) {
            return;
        }
        if (this.F == this.B && this.G == this.C && this.H == this.D && this.I == this.E) {
            return;
        }
        this.m.a(this.B, this.C, this.D, this.E);
        this.F = this.B;
        this.G = this.C;
        this.H = this.D;
        this.I = this.E;
    }

    private void C() {
        if (this.F == -1 && this.G == -1) {
            return;
        }
        this.m.a(this.F, this.G, this.H, this.I);
    }

    private void D() {
        if (this.x > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.w;
            final f.a aVar = this.m;
            final int i = this.x;
            if (aVar.b != null) {
                aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.l.f.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
            this.x = 0;
            this.w = elapsedRealtime;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point a(com.fyber.inneractive.sdk.player.c.e.a r13, com.fyber.inneractive.sdk.player.c.h r14) throws com.fyber.inneractive.sdk.player.c.e.d.b {
        /*
            int r0 = r14.k
            int r1 = r14.j
            r2 = 0
            if (r0 <= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = r2
        La:
            if (r0 == 0) goto Lf
            int r1 = r14.k
            goto L11
        Lf:
            int r1 = r14.j
        L11:
            if (r0 == 0) goto L16
            int r3 = r14.j
            goto L18
        L16:
            int r3 = r14.k
        L18:
            float r4 = (float) r3
            float r5 = (float) r1
            float r4 = r4 / r5
            int[] r5 = com.fyber.inneractive.sdk.player.c.l.d.k
            int r6 = r5.length
        L1e:
            r7 = 0
            if (r2 >= r6) goto La0
            r8 = r5[r2]
            float r9 = (float) r8
            float r9 = r9 * r4
            int r9 = (int) r9
            if (r8 <= r1) goto La0
            if (r9 > r3) goto L2c
            goto La0
        L2c:
            int r10 = com.fyber.inneractive.sdk.player.c.k.t.a
            r11 = 21
            if (r10 < r11) goto L79
            if (r0 == 0) goto L36
            r10 = r9
            goto L37
        L36:
            r10 = r8
        L37:
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r8 = r9
        L3b:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r13.e
            if (r9 != 0) goto L45
            java.lang.String r8 = "align.caps"
            r13.a(r8)
            goto L6b
        L45:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r13.e
            android.media.MediaCodecInfo$VideoCapabilities r9 = r9.getVideoCapabilities()
            if (r9 != 0) goto L53
            java.lang.String r8 = "align.vCaps"
            r13.a(r8)
            goto L6b
        L53:
            int r7 = r9.getWidthAlignment()
            int r9 = r9.getHeightAlignment()
            android.graphics.Point r11 = new android.graphics.Point
            int r10 = com.fyber.inneractive.sdk.player.c.k.t.a(r10, r7)
            int r10 = r10 * r7
            int r7 = com.fyber.inneractive.sdk.player.c.k.t.a(r8, r9)
            int r7 = r7 * r9
            r11.<init>(r10, r7)
            r7 = r11
        L6b:
            float r8 = r14.l
            int r9 = r7.x
            int r10 = r7.y
            double r11 = (double) r8
            boolean r8 = r13.a(r9, r10, r11)
            if (r8 == 0) goto L9c
            return r7
        L79:
            r7 = 16
            int r8 = com.fyber.inneractive.sdk.player.c.k.t.a(r8, r7)
            int r8 = r8 * r7
            int r9 = com.fyber.inneractive.sdk.player.c.k.t.a(r9, r7)
            int r9 = r9 * r7
            int r7 = r8 * r9
            int r10 = com.fyber.inneractive.sdk.player.c.e.d.b()
            if (r7 > r10) goto L9c
            android.graphics.Point r13 = new android.graphics.Point
            if (r0 == 0) goto L93
            r14 = r9
            goto L94
        L93:
            r14 = r8
        L94:
            if (r0 == 0) goto L97
            goto L98
        L97:
            r8 = r9
        L98:
            r13.<init>(r14, r8)
            return r13
        L9c:
            int r2 = r2 + 1
            goto L1e
        La0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.l.d.a(com.fyber.inneractive.sdk.player.c.e.a, com.fyber.inneractive.sdk.player.c.h):android.graphics.Point");
    }

    private static int c(h hVar) {
        if (hVar.g != -1) {
            return hVar.g;
        }
        return a(hVar.f, hVar.j, hVar.k);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static int a(String str, int i, int i2) {
        boolean z;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (z && !z) {
            if (z) {
                if ("BRAVIA 4K 2015".equals(t.d)) {
                    return -1;
                }
                i3 = t.a(i, 16) * t.a(i2, 16) * 16 * 16;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            } else if (!z) {
                if (z || z) {
                    i3 = i * i2;
                    return (i3 * 3) / (i4 * 2);
                }
                return -1;
            }
        }
        i3 = i * i2;
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    private static boolean b(boolean z, h hVar, h hVar2) {
        if (hVar.f.equals(hVar2.f) && d(hVar) == d(hVar2)) {
            if (z) {
                return true;
            }
            return hVar.j == hVar2.j && hVar.k == hVar2.k;
        }
        return false;
    }

    private static int d(h hVar) {
        if (hVar.m == -1) {
            return 0;
        }
        return hVar.m;
    }

    /* loaded from: classes.dex */
    protected static final class a {
        public final int a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements MediaCodec.OnFrameRenderedListener {
        /* synthetic */ b(d dVar, MediaCodec mediaCodec, byte b) {
            this(mediaCodec);
        }

        private b(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            if (this != d.this.j) {
                return;
            }
            d.this.s();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(long r20, long r22, android.media.MediaCodec r24, java.nio.ByteBuffer r25, int r26, int r27, long r28, boolean r30) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.l.d.a(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }
}
