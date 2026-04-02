package com.amazon.aps.iva.yc;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.amazon.aps.iva.hd.l;
import com.amazon.aps.iva.kc.j;
import com.amazon.aps.iva.nc.w;
import com.amazon.aps.iva.yc.c;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public final class a implements j<ByteBuffer, c> {
    public static final C0888a f = new C0888a();
    public static final b g = new b();
    public final Context a;
    public final List<ImageHeaderParser> b;
    public final b c;
    public final C0888a d;
    public final com.amazon.aps.iva.yc.b e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: com.amazon.aps.iva.yc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0888a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {
        public final ArrayDeque a;

        public b() {
            char[] cArr = l.a;
            this.a = new ArrayDeque(0);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, com.amazon.aps.iva.oc.c cVar, com.amazon.aps.iva.oc.b bVar) {
        C0888a c0888a = f;
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = c0888a;
        this.e = new com.amazon.aps.iva.yc.b(cVar, bVar);
        this.c = g;
    }

    @Override // com.amazon.aps.iva.kc.j
    public final w<c> a(ByteBuffer byteBuffer, int i, int i2, com.amazon.aps.iva.kc.h hVar) throws IOException {
        com.amazon.aps.iva.gc.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.c;
        synchronized (bVar) {
            com.amazon.aps.iva.gc.d dVar2 = (com.amazon.aps.iva.gc.d) bVar.a.poll();
            if (dVar2 == null) {
                dVar2 = new com.amazon.aps.iva.gc.d();
            }
            dVar = dVar2;
            dVar.b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.c = new com.amazon.aps.iva.gc.c();
            dVar.d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            d c = c(byteBuffer2, i, i2, dVar, hVar);
            b bVar2 = this.c;
            synchronized (bVar2) {
                dVar.b = null;
                dVar.c = null;
                bVar2.a.offer(dVar);
            }
            return c;
        } catch (Throwable th) {
            b bVar3 = this.c;
            synchronized (bVar3) {
                dVar.b = null;
                dVar.c = null;
                bVar3.a.offer(dVar);
                throw th;
            }
        }
    }

    @Override // com.amazon.aps.iva.kc.j
    public final boolean b(ByteBuffer byteBuffer, com.amazon.aps.iva.kc.h hVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) hVar.c(h.b)).booleanValue() && com.bumptech.glide.load.a.c(this.b, byteBuffer2) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public final d c(ByteBuffer byteBuffer, int i, int i2, com.amazon.aps.iva.gc.d dVar, com.amazon.aps.iva.kc.h hVar) {
        Bitmap.Config config;
        int highestOneBit;
        int i3 = com.amazon.aps.iva.hd.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            com.amazon.aps.iva.gc.c b2 = dVar.b();
            if (b2.c > 0 && b2.b == 0) {
                if (hVar.c(h.a) == com.amazon.aps.iva.kc.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int min = Math.min(b2.g / i2, b2.f / i);
                if (min == 0) {
                    highestOneBit = 0;
                } else {
                    highestOneBit = Integer.highestOneBit(min);
                }
                int max = Math.max(1, highestOneBit);
                Log.isLoggable("BufferGifDecoder", 2);
                C0888a c0888a = this.d;
                com.amazon.aps.iva.yc.b bVar = this.e;
                c0888a.getClass();
                com.amazon.aps.iva.gc.e eVar = new com.amazon.aps.iva.gc.e(bVar, b2, byteBuffer, max);
                eVar.h(config);
                eVar.b();
                Bitmap a = eVar.a();
                if (a == null) {
                    return null;
                }
                d dVar2 = new d(new c(new c.a(new f(com.bumptech.glide.a.a(this.a), eVar, i, i2, com.amazon.aps.iva.tc.b.b, a))));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
                return dVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
