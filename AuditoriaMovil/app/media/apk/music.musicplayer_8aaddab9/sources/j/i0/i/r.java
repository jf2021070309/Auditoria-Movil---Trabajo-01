package j.i0.i;

import j.i0.i.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes2.dex */
public final class r implements Closeable {
    public static final Logger a = Logger.getLogger(e.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public final k.f f9479b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f9480c;

    /* renamed from: d  reason: collision with root package name */
    public final k.d f9481d;

    /* renamed from: e  reason: collision with root package name */
    public int f9482e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9483f;

    /* renamed from: g  reason: collision with root package name */
    public final d.b f9484g;

    public r(k.f fVar, boolean z) {
        this.f9479b = fVar;
        this.f9480c = z;
        k.d dVar = new k.d();
        this.f9481d = dVar;
        this.f9484g = new d.b(dVar);
        this.f9482e = 16384;
    }

    public synchronized void a(u uVar) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        int i2 = this.f9482e;
        int i3 = uVar.a;
        if ((i3 & 32) != 0) {
            i2 = uVar.f9490b[5];
        }
        this.f9482e = i2;
        int i4 = i3 & 2;
        if ((i4 != 0 ? uVar.f9490b[1] : -1) != -1) {
            d.b bVar = this.f9484g;
            int i5 = i4 != 0 ? uVar.f9490b[1] : -1;
            Objects.requireNonNull(bVar);
            int min = Math.min(i5, 16384);
            int i6 = bVar.f9381d;
            if (i6 != min) {
                if (min < i6) {
                    bVar.f9379b = Math.min(bVar.f9379b, min);
                }
                bVar.f9380c = true;
                bVar.f9381d = min;
                int i7 = bVar.f9385h;
                if (min < i7) {
                    if (min == 0) {
                        bVar.a();
                    } else {
                        bVar.b(i7 - min);
                    }
                }
            }
        }
        h(0, 0, (byte) 4, (byte) 1);
        this.f9479b.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f9483f = true;
        this.f9479b.close();
    }

    public synchronized void f(boolean z, int i2, k.d dVar, int i3) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        h(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i3 > 0) {
            this.f9479b.E(dVar, i3);
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        this.f9479b.flush();
    }

    public void h(int i2, int i3, byte b2, byte b3) throws IOException {
        Logger logger = a;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i2, i3, b2, b3));
        }
        int i4 = this.f9482e;
        if (i3 > i4) {
            e.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i4), Integer.valueOf(i3));
            throw null;
        } else if ((Integer.MIN_VALUE & i2) != 0) {
            e.b("reserved bit set: %s", Integer.valueOf(i2));
            throw null;
        } else {
            k.f fVar = this.f9479b;
            fVar.q((i3 >>> 16) & 255);
            fVar.q((i3 >>> 8) & 255);
            fVar.q(i3 & 255);
            this.f9479b.q(b2 & 255);
            this.f9479b.q(b3 & 255);
            this.f9479b.k(i2 & Integer.MAX_VALUE);
        }
    }

    public synchronized void i(int i2, b bVar, byte[] bArr) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        if (bVar.httpCode == -1) {
            e.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        h(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f9479b.k(i2);
        this.f9479b.k(bVar.httpCode);
        if (bArr.length > 0) {
            this.f9479b.O(bArr);
        }
        this.f9479b.flush();
    }

    public void m(boolean z, int i2, List<c> list) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        this.f9484g.e(list);
        long j2 = this.f9481d.f9620b;
        int min = (int) Math.min(this.f9482e, j2);
        long j3 = min;
        byte b2 = j2 == j3 ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        h(i2, min, (byte) 1, b2);
        this.f9479b.E(this.f9481d, j3);
        if (j2 > j3) {
            y(i2, j2 - j3);
        }
    }

    public synchronized void r(boolean z, int i2, int i3) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        h(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f9479b.k(i2);
        this.f9479b.k(i3);
        this.f9479b.flush();
    }

    public synchronized void u(int i2, b bVar) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        if (bVar.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        h(i2, 4, (byte) 3, (byte) 0);
        this.f9479b.k(bVar.httpCode);
        this.f9479b.flush();
    }

    public synchronized void v(int i2, long j2) throws IOException {
        if (this.f9483f) {
            throw new IOException("closed");
        }
        if (j2 == 0 || j2 > 2147483647L) {
            e.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j2));
            throw null;
        }
        h(i2, 4, (byte) 8, (byte) 0);
        this.f9479b.k((int) j2);
        this.f9479b.flush();
    }

    public final void y(int i2, long j2) throws IOException {
        while (j2 > 0) {
            int min = (int) Math.min(this.f9482e, j2);
            long j3 = min;
            j2 -= j3;
            h(i2, min, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
            this.f9479b.E(this.f9481d, j3);
        }
    }
}
