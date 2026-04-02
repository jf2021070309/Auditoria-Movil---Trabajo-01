package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.k6.f;
import com.amazon.aps.iva.k6.l;
import com.amazon.aps.iva.q.i1;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.c;
import com.google.common.base.Supplier;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class d implements l {
    public final MediaCodec a;
    public final g b;
    public final f c;
    public final boolean d;
    public boolean e;
    public int f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static final class a implements l.b {
        public final Supplier<HandlerThread> a;
        public final Supplier<HandlerThread> b;

        public a(final int i) {
            Supplier<HandlerThread> supplier = new Supplier() { // from class: com.amazon.aps.iva.k6.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new HandlerThread(d.p(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
                }
            };
            Supplier<HandlerThread> supplier2 = new Supplier() { // from class: com.amazon.aps.iva.k6.c
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return new HandlerThread(d.p(i, "ExoPlayer:MediaCodecQueueingThread:"));
                }
            };
            this.a = supplier;
            this.b = supplier2;
        }

        @Override // com.amazon.aps.iva.k6.l.b
        /* renamed from: b */
        public final d a(l.a aVar) throws IOException {
            MediaCodec mediaCodec;
            d dVar;
            String str = aVar.a.a;
            d dVar2 = null;
            try {
                x.u("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    dVar = new d(mediaCodec, this.a.get(), this.b.get(), false);
                } catch (Exception e) {
                    e = e;
                }
                try {
                    x.I();
                    d.o(dVar, aVar.b, aVar.d, aVar.e);
                    return dVar;
                } catch (Exception e2) {
                    e = e2;
                    dVar2 = dVar;
                    if (dVar2 == null) {
                        if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                    } else {
                        dVar2.release();
                    }
                    throw e;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.a = mediaCodec;
        this.b = new g(handlerThread);
        this.c = new f(mediaCodec, handlerThread2);
        this.d = z;
    }

    public static void o(d dVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z;
        g gVar = dVar.b;
        if (gVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.cq.b.C(z);
        HandlerThread handlerThread = gVar.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = dVar.a;
        mediaCodec.setCallback(gVar, handler);
        gVar.c = handler;
        x.u("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        x.I();
        f fVar = dVar.c;
        if (!fVar.f) {
            HandlerThread handlerThread2 = fVar.b;
            handlerThread2.start();
            fVar.c = new e(fVar, handlerThread2.getLooper());
            fVar.f = true;
        }
        x.u("startCodec");
        mediaCodec.start();
        x.I();
        dVar.f = 1;
    }

    public static String p(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        g gVar = this.b;
        synchronized (gVar.a) {
            mediaFormat = gVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void b(final l.c cVar, Handler handler) {
        q();
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.amazon.aps.iva.k6.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                d.this.getClass();
                c.C0786c c0786c = (c.C0786c) cVar;
                c0786c.getClass();
                if (g0.a < 30) {
                    Handler handler2 = c0786c.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                c0786c.a(j);
            }
        }, handler);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void c(int i) {
        q();
        this.a.setVideoScalingMode(i);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final ByteBuffer d(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void e(Surface surface) {
        q();
        this.a.setOutputSurface(surface);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void flush() {
        this.c.a();
        this.a.flush();
        g gVar = this.b;
        synchronized (gVar.a) {
            gVar.k++;
            Handler handler = gVar.c;
            int i = g0.a;
            handler.post(new i1(gVar, 3));
        }
        this.a.start();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void g(int i, com.amazon.aps.iva.z5.c cVar, long j) {
        f.a removeFirst;
        f fVar = this.c;
        fVar.b();
        ArrayDeque<f.a> arrayDeque = f.g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                removeFirst = new f.a();
            } else {
                removeFirst = arrayDeque.removeFirst();
            }
        }
        removeFirst.a = i;
        removeFirst.b = 0;
        removeFirst.c = 0;
        removeFirst.e = j;
        removeFirst.f = 0;
        int i2 = cVar.f;
        MediaCodec.CryptoInfo cryptoInfo = removeFirst.d;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = cVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = cVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = cVar.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = cVar.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = cVar.c;
        if (g0.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.g, cVar.h));
        }
        fVar.c.obtainMessage(1, removeFirst).sendToTarget();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void h(Bundle bundle) {
        q();
        this.a.setParameters(bundle);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[Catch: all -> 0x0056, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x001d, B:17:0x0028, B:19:0x002a, B:26:0x0046, B:25:0x0036, B:28:0x0048, B:29:0x004d, B:30:0x004e, B:31:0x0050, B:32:0x0051, B:33:0x0053), top: B:38:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[Catch: all -> 0x0056, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x001d, B:17:0x0028, B:19:0x002a, B:26:0x0046, B:25:0x0036, B:28:0x0048, B:29:0x004d, B:30:0x004e, B:31:0x0050, B:32:0x0051, B:33:0x0053), top: B:38:0x000a }] */
    @Override // com.amazon.aps.iva.k6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r7 = this;
            com.amazon.aps.iva.k6.f r0 = r7.c
            r0.b()
            com.amazon.aps.iva.k6.g r0 = r7.b
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.m     // Catch: java.lang.Throwable -> L56
            r3 = 0
            if (r2 != 0) goto L51
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L4e
            long r2 = r0.k     // Catch: java.lang.Throwable -> L56
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L24
            boolean r2 = r0.l     // Catch: java.lang.Throwable -> L56
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = r3
            goto L25
        L24:
            r2 = r4
        L25:
            r5 = -1
            if (r2 == 0) goto L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            goto L47
        L2a:
            com.amazon.aps.iva.k6.k r0 = r0.d     // Catch: java.lang.Throwable -> L56
            int r2 = r0.c     // Catch: java.lang.Throwable -> L56
            if (r2 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L34
            goto L46
        L34:
            if (r2 == 0) goto L48
            int[] r3 = r0.d     // Catch: java.lang.Throwable -> L56
            int r6 = r0.a     // Catch: java.lang.Throwable -> L56
            r3 = r3[r6]     // Catch: java.lang.Throwable -> L56
            int r6 = r6 + r4
            int r4 = r0.e     // Catch: java.lang.Throwable -> L56
            r4 = r4 & r6
            r0.a = r4     // Catch: java.lang.Throwable -> L56
            int r2 = r2 + r5
            r0.c = r2     // Catch: java.lang.Throwable -> L56
            r5 = r3
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
        L47:
            return r5
        L48:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L56
            r0.<init>()     // Catch: java.lang.Throwable -> L56
            throw r0     // Catch: java.lang.Throwable -> L56
        L4e:
            r0.j = r3     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L51:
            r0.m = r3     // Catch: java.lang.Throwable -> L56
            throw r2     // Catch: java.lang.Throwable -> L56
        L54:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L56
            throw r0
        L56:
            r0 = move-exception
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.d.j():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[Catch: all -> 0x0080, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x001d, B:17:0x0028, B:19:0x002a, B:23:0x0033, B:26:0x0037, B:28:0x0048, B:32:0x006f, B:31:0x0065, B:35:0x0072, B:36:0x0077, B:37:0x0078, B:38:0x007a, B:39:0x007b, B:40:0x007d), top: B:45:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002a A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x000f, B:8:0x0013, B:10:0x001d, B:17:0x0028, B:19:0x002a, B:23:0x0033, B:26:0x0037, B:28:0x0048, B:32:0x006f, B:31:0x0065, B:35:0x0072, B:36:0x0077, B:37:0x0078, B:38:0x007a, B:39:0x007b, B:40:0x007d), top: B:45:0x000a }] */
    @Override // com.amazon.aps.iva.k6.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            com.amazon.aps.iva.k6.f r0 = r10.c
            r0.b()
            com.amazon.aps.iva.k6.g r0 = r10.b
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.m     // Catch: java.lang.Throwable -> L80
            r3 = 0
            if (r2 != 0) goto L7b
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L78
            long r2 = r0.k     // Catch: java.lang.Throwable -> L80
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 > 0) goto L24
            boolean r2 = r0.l     // Catch: java.lang.Throwable -> L80
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = r3
            goto L25
        L24:
            r2 = r4
        L25:
            r5 = -1
            if (r2 == 0) goto L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            goto L71
        L2a:
            com.amazon.aps.iva.k6.k r2 = r0.e     // Catch: java.lang.Throwable -> L80
            int r6 = r2.c     // Catch: java.lang.Throwable -> L80
            if (r6 != 0) goto L31
            r3 = r4
        L31:
            if (r3 == 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            goto L71
        L35:
            if (r6 == 0) goto L72
            int[] r3 = r2.d     // Catch: java.lang.Throwable -> L80
            int r7 = r2.a     // Catch: java.lang.Throwable -> L80
            r3 = r3[r7]     // Catch: java.lang.Throwable -> L80
            int r7 = r7 + r4
            int r4 = r2.e     // Catch: java.lang.Throwable -> L80
            r4 = r4 & r7
            r2.a = r4     // Catch: java.lang.Throwable -> L80
            int r6 = r6 + r5
            r2.c = r6     // Catch: java.lang.Throwable -> L80
            if (r3 < 0) goto L62
            android.media.MediaFormat r2 = r0.h     // Catch: java.lang.Throwable -> L80
            com.amazon.aps.iva.cq.b.D(r2)     // Catch: java.lang.Throwable -> L80
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f     // Catch: java.lang.Throwable -> L80
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L80
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L80
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L80
            int r6 = r0.size     // Catch: java.lang.Throwable -> L80
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L80
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L80
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L80
            goto L6f
        L62:
            r11 = -2
            if (r3 != r11) goto L6f
            java.util.ArrayDeque<android.media.MediaFormat> r11 = r0.g     // Catch: java.lang.Throwable -> L80
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L80
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L80
            r0.h = r11     // Catch: java.lang.Throwable -> L80
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            r5 = r3
        L71:
            return r5
        L72:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L80
            r11.<init>()     // Catch: java.lang.Throwable -> L80
            throw r11     // Catch: java.lang.Throwable -> L80
        L78:
            r0.j = r3     // Catch: java.lang.Throwable -> L80
            throw r2     // Catch: java.lang.Throwable -> L80
        L7b:
            r0.m = r3     // Catch: java.lang.Throwable -> L80
            throw r2     // Catch: java.lang.Throwable -> L80
        L7e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L80
            throw r11
        L80:
            r11 = move-exception
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.k6.d.k(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void l(int i, int i2, int i3, long j) {
        f.a removeFirst;
        f fVar = this.c;
        fVar.b();
        ArrayDeque<f.a> arrayDeque = f.g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                removeFirst = new f.a();
            } else {
                removeFirst = arrayDeque.removeFirst();
            }
        }
        removeFirst.a = i;
        removeFirst.b = 0;
        removeFirst.c = i2;
        removeFirst.e = j;
        removeFirst.f = i3;
        e eVar = fVar.c;
        int i4 = g0.a;
        eVar.obtainMessage(0, removeFirst).sendToTarget();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final ByteBuffer n(int i) {
        return this.a.getOutputBuffer(i);
    }

    public final void q() {
        if (this.d) {
            try {
                f fVar = this.c;
                com.amazon.aps.iva.t5.f fVar2 = fVar.e;
                synchronized (fVar2) {
                    fVar2.a = false;
                }
                e eVar = fVar.c;
                eVar.getClass();
                eVar.obtainMessage(2).sendToTarget();
                fVar2.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void release() {
        try {
            if (this.f == 1) {
                f fVar = this.c;
                if (fVar.f) {
                    fVar.a();
                    fVar.b.quit();
                }
                fVar.f = false;
                g gVar = this.b;
                synchronized (gVar.a) {
                    gVar.l = true;
                    gVar.b.quit();
                    gVar.a();
                }
            }
            this.f = 2;
        } finally {
            if (!this.e) {
                this.a.release();
                this.e = true;
            }
        }
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void f() {
    }
}
