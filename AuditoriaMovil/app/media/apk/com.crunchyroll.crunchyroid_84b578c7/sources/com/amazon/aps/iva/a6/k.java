package com.amazon.aps.iva.a6;

import android.content.Context;
import android.os.Handler;
import com.amazon.aps.iva.c6.s;
import java.util.ArrayList;
/* compiled from: DefaultRenderersFactory.java */
/* loaded from: classes.dex */
public final class k implements r1 {
    public final Context a;
    public final com.amazon.aps.iva.k6.j b = new com.amazon.aps.iva.k6.j();
    public int c = 0;
    public com.amazon.aps.iva.k6.q d = com.amazon.aps.iva.k6.q.a;

    public k(Context context) {
        this.a = context;
    }

    @Override // com.amazon.aps.iva.a6.r1
    public final o1[] a(Handler handler, com.amazon.aps.iva.v6.m mVar, com.amazon.aps.iva.c6.j jVar, com.amazon.aps.iva.r6.c cVar, com.amazon.aps.iva.l6.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        Context context = this.a;
        int i5 = this.c;
        arrayList.add(new com.amazon.aps.iva.v6.c(context, this.b, this.d, handler, mVar));
        if (i5 != 0) {
            int size = arrayList.size();
            if (i5 == 2) {
                size--;
            }
            try {
                try {
                    i4 = size + 1;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating VP9 extension", e);
                }
            } catch (ClassNotFoundException unused) {
            }
            try {
                arrayList.add(size, (o1) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, com.amazon.aps.iva.v6.m.class, Integer.TYPE).newInstance(5000L, handler, mVar, 50));
                com.amazon.aps.iva.t5.p.f();
            } catch (ClassNotFoundException unused2) {
                size = i4;
                i4 = size;
                arrayList.add(i4, (o1) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.amazon.aps.iva.v6.m.class, Integer.TYPE).newInstance(5000L, handler, mVar, 50));
                com.amazon.aps.iva.t5.p.f();
            }
            try {
                arrayList.add(i4, (o1) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, com.amazon.aps.iva.v6.m.class, Integer.TYPE).newInstance(5000L, handler, mVar, 50));
                com.amazon.aps.iva.t5.p.f();
            } catch (ClassNotFoundException unused3) {
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating AV1 extension", e2);
            }
        }
        s.e eVar = new s.e(this.a);
        eVar.d = false;
        eVar.e = false;
        eVar.f = 0;
        if (eVar.c == null) {
            eVar.c = new s.g(new com.amazon.aps.iva.r5.b[0]);
        }
        com.amazon.aps.iva.c6.s sVar = new com.amazon.aps.iva.c6.s(eVar);
        Context context2 = this.a;
        int i6 = this.c;
        arrayList.add(new com.amazon.aps.iva.c6.w(context2, this.b, this.d, handler, jVar, sVar));
        if (i6 != 0) {
            int size2 = arrayList.size();
            if (i6 == 2) {
                size2--;
            }
            try {
                try {
                    i = size2 + 1;
                    try {
                        arrayList.add(size2, (o1) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
                        com.amazon.aps.iva.t5.p.f();
                    } catch (ClassNotFoundException unused4) {
                        size2 = i;
                        i = size2;
                        try {
                            i2 = i + 1;
                        } catch (ClassNotFoundException unused5) {
                        }
                        try {
                            arrayList.add(i, (o1) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                            com.amazon.aps.iva.t5.p.f();
                        } catch (ClassNotFoundException unused6) {
                            i = i2;
                            i2 = i;
                            try {
                                i3 = i2 + 1;
                                arrayList.add(i2, (o1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                                com.amazon.aps.iva.t5.p.f();
                                arrayList.add(i3, (o1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                                com.amazon.aps.iva.t5.p.f();
                            } catch (Exception e3) {
                                throw new RuntimeException("Error instantiating FLAC extension", e3);
                            }
                        }
                        try {
                            i3 = i2 + 1;
                            arrayList.add(i2, (o1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                            com.amazon.aps.iva.t5.p.f();
                        } catch (ClassNotFoundException unused7) {
                        }
                        arrayList.add(i3, (o1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                        com.amazon.aps.iva.t5.p.f();
                    }
                } catch (Exception e4) {
                    throw new RuntimeException("Error instantiating MIDI extension", e4);
                }
            } catch (ClassNotFoundException unused8) {
            }
            try {
                i2 = i + 1;
                arrayList.add(i, (o1) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                com.amazon.aps.iva.t5.p.f();
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (o1) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                    com.amazon.aps.iva.t5.p.f();
                } catch (ClassNotFoundException unused9) {
                    i2 = i3;
                    i3 = i2;
                    arrayList.add(i3, (o1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                    com.amazon.aps.iva.t5.p.f();
                }
                try {
                    arrayList.add(i3, (o1) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.amazon.aps.iva.c6.j.class, com.amazon.aps.iva.c6.k.class).newInstance(handler, jVar, sVar));
                    com.amazon.aps.iva.t5.p.f();
                } catch (ClassNotFoundException unused10) {
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e5);
                }
            } catch (Exception e6) {
                throw new RuntimeException("Error instantiating Opus extension", e6);
            }
        }
        arrayList.add(new com.amazon.aps.iva.r6.d(cVar, handler.getLooper()));
        arrayList.add(new com.amazon.aps.iva.l6.c(bVar, handler.getLooper()));
        arrayList.add(new com.amazon.aps.iva.w6.b());
        return (o1[]) arrayList.toArray(new o1[0]);
    }
}
