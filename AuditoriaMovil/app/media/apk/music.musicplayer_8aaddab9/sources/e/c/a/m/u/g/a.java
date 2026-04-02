package e.c.a.m.u.g;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e.c.a.m.m;
import e.c.a.m.o;
import e.c.a.m.s.w;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
/* loaded from: classes.dex */
public class a implements o<ByteBuffer, c> {
    public static final C0128a a = new C0128a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f5906b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Context f5907c;

    /* renamed from: d  reason: collision with root package name */
    public final List<ImageHeaderParser> f5908d;

    /* renamed from: e  reason: collision with root package name */
    public final b f5909e;

    /* renamed from: f  reason: collision with root package name */
    public final C0128a f5910f;

    /* renamed from: g  reason: collision with root package name */
    public final e.c.a.m.u.g.b f5911g;

    /* renamed from: e.c.a.m.u.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128a {
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Queue<e.c.a.l.d> a;

        public b() {
            char[] cArr = e.c.a.s.j.a;
            this.a = new ArrayDeque(0);
        }

        public synchronized void a(e.c.a.l.d dVar) {
            dVar.f5537b = null;
            dVar.f5538c = null;
            this.a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, e.c.a.m.s.c0.d dVar, e.c.a.m.s.c0.b bVar) {
        b bVar2 = f5906b;
        C0128a c0128a = a;
        this.f5907c = context.getApplicationContext();
        this.f5908d = list;
        this.f5910f = c0128a;
        this.f5911g = new e.c.a.m.u.g.b(dVar, bVar);
        this.f5909e = bVar2;
    }

    @Override // e.c.a.m.o
    public boolean a(ByteBuffer byteBuffer, m mVar) throws IOException {
        ByteBuffer byteBuffer2 = byteBuffer;
        if (!((Boolean) mVar.c(i.f5940b)).booleanValue()) {
            if ((byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : c.t.m.o(this.f5908d, new e.c.a.m.f(byteBuffer2))) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // e.c.a.m.o
    public w<c> b(ByteBuffer byteBuffer, int i2, int i3, m mVar) throws IOException {
        e.c.a.l.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f5909e;
        synchronized (bVar) {
            e.c.a.l.d poll = bVar.a.poll();
            if (poll == null) {
                poll = new e.c.a.l.d();
            }
            dVar = poll;
            dVar.f5537b = null;
            Arrays.fill(dVar.a, (byte) 0);
            dVar.f5538c = new e.c.a.l.c();
            dVar.f5539d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f5537b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f5537b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i2, i3, dVar, mVar);
        } finally {
            this.f5909e.a(dVar);
        }
    }

    public final e c(ByteBuffer byteBuffer, int i2, int i3, e.c.a.l.d dVar, m mVar) {
        int i4 = e.c.a.s.f.f6026b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            e.c.a.l.c b2 = dVar.b();
            if (b2.f5528c > 0 && b2.f5527b == 0) {
                Bitmap.Config config = mVar.c(i.a) == e.c.a.m.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int min = Math.min(b2.f5532g / i3, b2.f5531f / i2);
                int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                Log.isLoggable("BufferGifDecoder", 2);
                C0128a c0128a = this.f5910f;
                e.c.a.m.u.g.b bVar = this.f5911g;
                Objects.requireNonNull(c0128a);
                e.c.a.l.e eVar = new e.c.a.l.e(bVar, b2, byteBuffer, max);
                eVar.i(config);
                eVar.f5550l = (eVar.f5550l + 1) % eVar.f5551m.f5528c;
                Bitmap a2 = eVar.a();
                if (a2 == null) {
                    return null;
                }
                e eVar2 = new e(new c(this.f5907c, eVar, (e.c.a.m.u.b) e.c.a.m.u.b.f5847b, i2, i3, a2));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    e.c.a.s.f.a(elapsedRealtimeNanos);
                }
                return eVar2;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                e.c.a.s.f.a(elapsedRealtimeNanos);
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                e.c.a.s.f.a(elapsedRealtimeNanos);
            }
        }
    }
}
