package com.amazon.aps.iva.k6;

import android.media.MediaCodec;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.k6.d;
import com.amazon.aps.iva.k6.l;
import com.amazon.aps.iva.k6.u;
import com.amazon.aps.iva.t5.g0;
import java.io.IOException;
/* compiled from: DefaultMediaCodecAdapterFactory.java */
/* loaded from: classes.dex */
public final class j implements l.b {
    @Override // com.amazon.aps.iva.k6.l.b
    public final l a(l.a aVar) throws IOException {
        int i = g0.a;
        if (i >= 23 && i >= 31) {
            int i2 = com.amazon.aps.iva.q5.g0.i(aVar.c.m);
            g0.G(i2);
            com.amazon.aps.iva.t5.p.f();
            return new d.a(i2).a(aVar);
        }
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = u.a.b(aVar);
            x.u("configureCodec");
            mediaCodec.configure(aVar.b, aVar.d, aVar.e, 0);
            x.I();
            x.u("startCodec");
            mediaCodec.start();
            x.I();
            return new u(mediaCodec);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }
}
