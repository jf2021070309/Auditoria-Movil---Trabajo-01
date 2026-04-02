package com.fyber.inneractive.sdk.player.c.a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.c.a.d;
import com.fyber.inneractive.sdk.player.c.a.e;
import com.fyber.inneractive.sdk.player.c.e.d;
import com.fyber.inneractive.sdk.player.c.k.t;
import com.fyber.inneractive.sdk.player.c.m;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h extends com.fyber.inneractive.sdk.player.c.e.b implements com.fyber.inneractive.sdk.player.c.k.g {
    private final d.a j;
    private final e k;
    private boolean l;
    private boolean m;
    private MediaFormat n;
    private int o;
    private int p;
    private long q;
    private boolean r;

    protected static void s() {
    }

    protected static void t() {
    }

    protected static void u() {
    }

    @Override // com.fyber.inneractive.sdk.player.c.a, com.fyber.inneractive.sdk.player.c.n
    public final com.fyber.inneractive.sdk.player.c.k.g c() {
        return this;
    }

    static /* synthetic */ boolean b(h hVar) {
        hVar.r = true;
        return true;
    }

    public h(com.fyber.inneractive.sdk.player.c.e.c cVar) {
        this(cVar, (byte) 0);
    }

    private h(com.fyber.inneractive.sdk.player.c.e.c cVar, byte b) {
        this(cVar, (char) 0);
    }

    private h(com.fyber.inneractive.sdk.player.c.e.c cVar, char c) {
        this(cVar, new c[0]);
    }

    private h(com.fyber.inneractive.sdk.player.c.e.c cVar, c... cVarArr) {
        super(1, cVar, true);
        this.k = new e(cVarArr, new a(this, (byte) 0));
        this.j = new d.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r4 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
        if (r11 == false) goto L26;
     */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.fyber.inneractive.sdk.player.c.e.c r11, com.fyber.inneractive.sdk.player.c.h r12) throws com.fyber.inneractive.sdk.player.c.e.d.b {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.a.h.a(com.fyber.inneractive.sdk.player.c.e.c, com.fyber.inneractive.sdk.player.c.h):int");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final com.fyber.inneractive.sdk.player.c.e.a a(com.fyber.inneractive.sdk.player.c.e.c cVar, com.fyber.inneractive.sdk.player.c.h hVar, boolean z) throws d.b {
        com.fyber.inneractive.sdk.player.c.e.a a2;
        if (a(hVar.f) && (a2 = cVar.a()) != null) {
            this.l = true;
            return a2;
        }
        this.l = false;
        return super.a(cVar, hVar, z);
    }

    private boolean a(String str) {
        e eVar = this.k;
        if (eVar.c != null) {
            if (Arrays.binarySearch(eVar.c.b, e.a(str)) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void a(com.fyber.inneractive.sdk.player.c.e.a aVar, MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.c.h hVar, MediaCrypto mediaCrypto) {
        this.m = t.a < 24 && "OMX.SEC.aac.dec".equals(aVar.a) && "samsung".equals(t.c) && (t.b.startsWith("zeroflte") || t.b.startsWith("herolte") || t.b.startsWith("heroqlte"));
        if (this.l) {
            MediaFormat b = hVar.b();
            this.n = b;
            b.setString("mime", "audio/raw");
            mediaCodec.configure(this.n, (Surface) null, mediaCrypto, 0);
            this.n.setString("mime", hVar.f);
            return;
        }
        mediaCodec.configure(hVar.b(), (Surface) null, mediaCrypto, 0);
        this.n = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void a(final String str, final long j, final long j2) {
        final d.a aVar = this.j;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.2
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void b(final com.fyber.inneractive.sdk.player.c.h hVar) throws com.fyber.inneractive.sdk.player.c.d {
        super.b(hVar);
        final d.a aVar = this.j;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        this.o = "audio/raw".equals(hVar.f) ? hVar.t : 2;
        this.p = hVar.r;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0161 A[Catch: c -> 0x0185, TryCatch #0 {c -> 0x0185, blocks: (B:22:0x003f, B:24:0x004a, B:27:0x0052, B:29:0x0063, B:30:0x0065, B:32:0x006a, B:34:0x0070, B:35:0x0078, B:37:0x007c, B:38:0x0081, B:40:0x0084, B:43:0x008d, B:44:0x0090, B:112:0x0173, B:113:0x0184, B:45:0x0094, B:53:0x00a8, B:55:0x00af, B:57:0x00b9, B:65:0x00cc, B:67:0x00d0, B:69:0x00d6, B:76:0x00e8, B:78:0x00ee, B:80:0x00f2, B:82:0x00f6, B:84:0x00fa, B:88:0x010a, B:90:0x0114, B:92:0x0118, B:106:0x0157, B:110:0x016b, B:109:0x0161, B:97:0x0124, B:100:0x012e), top: B:117:0x003f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0114 A[Catch: c -> 0x0185, TryCatch #0 {c -> 0x0185, blocks: (B:22:0x003f, B:24:0x004a, B:27:0x0052, B:29:0x0063, B:30:0x0065, B:32:0x006a, B:34:0x0070, B:35:0x0078, B:37:0x007c, B:38:0x0081, B:40:0x0084, B:43:0x008d, B:44:0x0090, B:112:0x0173, B:113:0x0184, B:45:0x0094, B:53:0x00a8, B:55:0x00af, B:57:0x00b9, B:65:0x00cc, B:67:0x00d0, B:69:0x00d6, B:76:0x00e8, B:78:0x00ee, B:80:0x00f2, B:82:0x00f6, B:84:0x00fa, B:88:0x010a, B:90:0x0114, B:92:0x0118, B:106:0x0157, B:110:0x016b, B:109:0x0161, B:97:0x0124, B:100:0x012e), top: B:117:0x003f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0124 A[Catch: c -> 0x0185, TryCatch #0 {c -> 0x0185, blocks: (B:22:0x003f, B:24:0x004a, B:27:0x0052, B:29:0x0063, B:30:0x0065, B:32:0x006a, B:34:0x0070, B:35:0x0078, B:37:0x007c, B:38:0x0081, B:40:0x0084, B:43:0x008d, B:44:0x0090, B:112:0x0173, B:113:0x0184, B:45:0x0094, B:53:0x00a8, B:55:0x00af, B:57:0x00b9, B:65:0x00cc, B:67:0x00d0, B:69:0x00d6, B:76:0x00e8, B:78:0x00ee, B:80:0x00f2, B:82:0x00f6, B:84:0x00fa, B:88:0x010a, B:90:0x0114, B:92:0x0118, B:106:0x0157, B:110:0x016b, B:109:0x0161, B:97:0x0124, B:100:0x012e), top: B:117:0x003f, inners: #1 }] */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.media.MediaCodec r14, android.media.MediaFormat r15) throws com.fyber.inneractive.sdk.player.c.d {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.c.a.h.a(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void a(boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        super.a(z);
        final d.a aVar = this.j;
        final com.fyber.inneractive.sdk.player.c.b.c cVar = this.i;
        if (aVar.b != null) {
            aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                }
            });
        }
        int i = this.a.b;
        if (i != 0) {
            e eVar = this.k;
            com.fyber.inneractive.sdk.player.c.k.a.b(t.a >= 21);
            if (eVar.x && eVar.w == i) {
                return;
            }
            eVar.x = true;
            eVar.w = i;
            eVar.f();
            return;
        }
        e eVar2 = this.k;
        if (eVar2.x) {
            eVar2.x = false;
            eVar2.w = 0;
            eVar2.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void a(long j, boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        super.a(j, z);
        this.k.f();
        this.q = j;
        this.r = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void n() {
        super.n();
        this.k.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void o() {
        e eVar = this.k;
        eVar.v = false;
        if (eVar.h()) {
            eVar.j();
            eVar.f.a();
        }
        super.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.a
    public final void p() {
        try {
            e eVar = this.k;
            eVar.f();
            eVar.g();
            for (c cVar : eVar.e) {
                cVar.h();
            }
            eVar.w = 0;
            eVar.v = false;
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.n
    public final boolean r() {
        if (super.r()) {
            e eVar = this.k;
            if (!eVar.h() || (eVar.u && !eVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.c.e.b, com.fyber.inneractive.sdk.player.c.n
    public final boolean q() {
        return this.k.d() || super.q();
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final long v() {
        long a2 = this.k.a(r());
        if (a2 != Long.MIN_VALUE) {
            if (!this.r) {
                a2 = Math.max(this.q, a2);
            }
            this.q = a2;
            this.r = false;
        }
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final m a(m mVar) {
        return this.k.a(mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.c.k.g
    public final m w() {
        return this.k.o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final boolean a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws com.fyber.inneractive.sdk.player.c.d {
        if (this.l && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.i.e++;
            e eVar = this.k;
            if (eVar.s == 1) {
                eVar.s = 2;
            }
            return true;
        } else {
            try {
                if (this.k.a(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.i.d++;
                    return true;
                }
                return false;
            } catch (e.d | e.h e) {
                throw com.fyber.inneractive.sdk.player.c.d.a(e, this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.fyber.inneractive.sdk.player.c.e.b
    public final void x() throws com.fyber.inneractive.sdk.player.c.d {
        try {
            e eVar = this.k;
            if (!eVar.u && eVar.h() && eVar.c()) {
                eVar.f.a(eVar.i());
                eVar.p = 0;
                eVar.u = true;
            }
        } catch (e.h e) {
            throw com.fyber.inneractive.sdk.player.c.d.a(e, this.b);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.a, com.fyber.inneractive.sdk.player.c.e.b
    public final void a(int i, Object obj) throws com.fyber.inneractive.sdk.player.c.d {
        if (i == 2) {
            e eVar = this.k;
            float floatValue = ((Float) obj).floatValue();
            if (eVar.t != floatValue) {
                eVar.t = floatValue;
                eVar.e();
            }
        } else if (i == 3) {
            int intValue = ((Integer) obj).intValue();
            e eVar2 = this.k;
            if (eVar2.k != intValue) {
                eVar2.k = intValue;
                if (eVar2.x) {
                    return;
                }
                eVar2.f();
                eVar2.w = 0;
            }
        } else {
            super.a(i, obj);
        }
    }

    /* loaded from: classes.dex */
    private final class a implements e.f {
        private a() {
        }

        /* synthetic */ a(h hVar, byte b) {
            this();
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.f
        public final void a(final int i) {
            final d.a aVar = h.this.j;
            if (aVar.b != null) {
                aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.6
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
            h.s();
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.f
        public final void a() {
            h.t();
            h.b(h.this);
        }

        @Override // com.fyber.inneractive.sdk.player.c.a.e.f
        public final void a(final int i, final long j, final long j2) {
            final d.a aVar = h.this.j;
            if (aVar.b != null) {
                aVar.a.post(new Runnable() { // from class: com.fyber.inneractive.sdk.player.c.a.d.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }
            h.u();
        }
    }
}
