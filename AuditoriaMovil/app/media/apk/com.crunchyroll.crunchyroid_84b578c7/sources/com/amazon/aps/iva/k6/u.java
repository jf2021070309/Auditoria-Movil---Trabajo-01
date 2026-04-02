package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.k6.l;
import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.v6.c;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class u implements l {
    public final MediaCodec a;
    public ByteBuffer[] b;
    public ByteBuffer[] c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static class a implements l.b {
        public static MediaCodec b(l.a aVar) throws IOException {
            aVar.a.getClass();
            String str = aVar.a.a;
            x.u("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            x.I();
            return createByCodecName;
        }
    }

    public u(MediaCodec mediaCodec) {
        this.a = mediaCodec;
        if (g0.a < 21) {
            this.b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.amazon.aps.iva.k6.l
    public final MediaFormat a() {
        return this.a.getOutputFormat();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void b(final l.c cVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.amazon.aps.iva.k6.t
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                u.this.getClass();
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
        this.a.setVideoScalingMode(i);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final ByteBuffer d(int i) {
        if (g0.a >= 21) {
            return this.a.getInputBuffer(i);
        }
        return this.b[i];
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void e(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void flush() {
        this.a.flush();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void g(int i, com.amazon.aps.iva.z5.c cVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, cVar.i, j, 0);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void h(Bundle bundle) {
        this.a.setParameters(bundle);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final int j() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && g0.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void l(int i, int i2, int i3, long j) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void m(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    @Override // com.amazon.aps.iva.k6.l
    public final ByteBuffer n(int i) {
        if (g0.a >= 21) {
            return this.a.getOutputBuffer(i);
        }
        return this.c[i];
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void release() {
        this.b = null;
        this.c = null;
        this.a.release();
    }

    @Override // com.amazon.aps.iva.k6.l
    public final void f() {
    }
}
