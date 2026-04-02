package k;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes2.dex */
public final class l implements x {
    public byte a;

    /* renamed from: b  reason: collision with root package name */
    public final r f9626b;

    /* renamed from: c  reason: collision with root package name */
    public final Inflater f9627c;

    /* renamed from: d  reason: collision with root package name */
    public final m f9628d;

    /* renamed from: e  reason: collision with root package name */
    public final CRC32 f9629e;

    public l(x xVar) {
        h.o.c.j.e(xVar, "source");
        r rVar = new r(xVar);
        this.f9626b = rVar;
        Inflater inflater = new Inflater(true);
        this.f9627c = inflater;
        this.f9628d = new m(rVar, inflater);
        this.f9629e = new CRC32();
    }

    @Override // k.x
    public long S(d dVar, long j2) throws IOException {
        long j3;
        h.o.c.j.e(dVar, "sink");
        if (j2 >= 0) {
            if (j2 == 0) {
                return 0L;
            }
            if (this.a == 0) {
                this.f9626b.Y(10L);
                byte r = this.f9626b.f9637b.r(3L);
                boolean z = ((r >> 1) & 1) == 1;
                if (z) {
                    f(this.f9626b.f9637b, 0L, 10L);
                }
                r rVar = this.f9626b;
                rVar.Y(2L);
                a("ID1ID2", 8075, rVar.f9637b.readShort());
                this.f9626b.skip(8L);
                if (((r >> 2) & 1) == 1) {
                    this.f9626b.Y(2L);
                    if (z) {
                        f(this.f9626b.f9637b, 0L, 2L);
                    }
                    long H = this.f9626b.f9637b.H();
                    this.f9626b.Y(H);
                    if (z) {
                        j3 = H;
                        f(this.f9626b.f9637b, 0L, H);
                    } else {
                        j3 = H;
                    }
                    this.f9626b.skip(j3);
                }
                if (((r >> 3) & 1) == 1) {
                    long a = this.f9626b.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        f(this.f9626b.f9637b, 0L, a + 1);
                    }
                    this.f9626b.skip(a + 1);
                }
                if (((r >> 4) & 1) == 1) {
                    long a2 = this.f9626b.a((byte) 0, 0L, Long.MAX_VALUE);
                    if (a2 == -1) {
                        throw new EOFException();
                    }
                    if (z) {
                        f(this.f9626b.f9637b, 0L, a2 + 1);
                    }
                    this.f9626b.skip(a2 + 1);
                }
                if (z) {
                    r rVar2 = this.f9626b;
                    rVar2.Y(2L);
                    a("FHCRC", rVar2.f9637b.H(), (short) this.f9629e.getValue());
                    this.f9629e.reset();
                }
                this.a = (byte) 1;
            }
            if (this.a == 1) {
                long j4 = dVar.f9620b;
                long S = this.f9628d.S(dVar, j2);
                if (S != -1) {
                    f(dVar, j4, S);
                    return S;
                }
                this.a = (byte) 2;
            }
            if (this.a == 2) {
                a("CRC", this.f9626b.h(), (int) this.f9629e.getValue());
                a("ISIZE", this.f9626b.h(), (int) this.f9627c.getBytesWritten());
                this.a = (byte) 3;
                if (!this.f9626b.p()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(h.o.c.j.i("byteCount < 0: ", Long.valueOf(j2)).toString());
    }

    public final void a(String str, int i2, int i3) {
        if (i3 == i2) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3));
        h.o.c.j.d(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    @Override // k.x
    public y c() {
        return this.f9626b.c();
    }

    @Override // k.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f9628d.close();
    }

    public final void f(d dVar, long j2, long j3) {
        int i2;
        s sVar = dVar.a;
        h.o.c.j.c(sVar);
        while (true) {
            int i3 = sVar.f9640c;
            int i4 = sVar.f9639b;
            if (j2 < i3 - i4) {
                break;
            }
            j2 -= i3 - i4;
            sVar = sVar.f9643f;
            h.o.c.j.c(sVar);
        }
        while (j3 > 0) {
            int min = (int) Math.min(sVar.f9640c - i2, j3);
            this.f9629e.update(sVar.a, (int) (sVar.f9639b + j2), min);
            j3 -= min;
            sVar = sVar.f9643f;
            h.o.c.j.c(sVar);
            j2 = 0;
        }
    }
}
