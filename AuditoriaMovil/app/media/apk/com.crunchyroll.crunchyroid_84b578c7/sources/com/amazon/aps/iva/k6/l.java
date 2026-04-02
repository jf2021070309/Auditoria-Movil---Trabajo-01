package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.amazon.aps.iva.q5.v;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes.dex */
public interface l {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public final n a;
        public final MediaFormat b;
        public final v c;
        public final Surface d;
        public final MediaCrypto e;

        public a(n nVar, MediaFormat mediaFormat, v vVar, Surface surface, MediaCrypto mediaCrypto) {
            this.a = nVar;
            this.b = mediaFormat;
            this.c = vVar;
            this.d = surface;
            this.e = mediaCrypto;
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
        l a(a aVar) throws IOException;
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    MediaFormat a();

    void b(c cVar, Handler handler);

    void c(int i);

    ByteBuffer d(int i);

    void e(Surface surface);

    void f();

    void flush();

    void g(int i, com.amazon.aps.iva.z5.c cVar, long j);

    void h(Bundle bundle);

    void i(int i, long j);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i, int i2, int i3, long j);

    void m(int i, boolean z);

    ByteBuffer n(int i);

    void release();
}
