package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class j implements s {
    private final e b;
    private final Inflater c;
    private final k d;
    private int a = 0;
    private final CRC32 e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        e a = l.a(sVar);
        this.b = a;
        this.d = new k(a, inflater);
    }

    private void a(c cVar, long j, long j2) {
        int i;
        o oVar = cVar.a;
        while (true) {
            long j3 = oVar.c - oVar.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            oVar = oVar.f;
        }
        while (j2 > 0) {
            int min = (int) Math.min(oVar.c - i, j2);
            this.e.update(oVar.a, (int) (oVar.b + j), min);
            j2 -= min;
            oVar = oVar.f;
            j = 0;
        }
    }

    private void a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private void h() throws IOException {
        this.b.c(10L);
        byte f = this.b.a().f(3L);
        boolean z = ((f >> 1) & 1) == 1;
        if (z) {
            a(this.b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.b.readShort());
        this.b.skip(8L);
        if (((f >> 2) & 1) == 1) {
            this.b.c(2L);
            if (z) {
                a(this.b.a(), 0L, 2L);
            }
            long c = this.b.a().c();
            this.b.c(c);
            if (z) {
                a(this.b.a(), 0L, c);
            }
            this.b.skip(c);
        }
        if (((f >> 3) & 1) == 1) {
            long a = this.b.a((byte) 0);
            if (a == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.b.a(), 0L, a + 1);
            }
            this.b.skip(a + 1);
        }
        if (((f >> 4) & 1) == 1) {
            long a2 = this.b.a((byte) 0);
            if (a2 == -1) {
                throw new EOFException();
            }
            if (z) {
                a(this.b.a(), 0L, a2 + 1);
            }
            this.b.skip(a2 + 1);
        }
        if (z) {
            a("FHCRC", this.b.c(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    private void i() throws IOException {
        a("CRC", this.b.e(), (int) this.e.getValue());
        a("ISIZE", this.b.e(), (int) this.c.getBytesWritten());
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public long a(c cVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (i == 0) {
            return 0L;
        } else {
            if (this.a == 0) {
                h();
                this.a = 1;
            }
            if (this.a == 1) {
                long j2 = cVar.b;
                long a = this.d.a(cVar, j);
                if (a != -1) {
                    a(cVar, j2, a);
                    return a;
                }
                this.a = 2;
            }
            if (this.a == 2) {
                i();
                this.a = 3;
                if (!this.b.f()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public t b() {
        return this.b.b();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }
}
