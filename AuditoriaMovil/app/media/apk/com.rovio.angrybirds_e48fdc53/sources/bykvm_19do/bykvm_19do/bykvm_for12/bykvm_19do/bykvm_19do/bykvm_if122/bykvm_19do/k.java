package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class k implements s {
    private final e a;
    private final Inflater b;
    private int c;
    private boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.a = eVar;
        this.b = inflater;
    }

    private void i() throws IOException {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public long a(c cVar, long j) throws IOException {
        o b;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.d) {
            throw new IllegalStateException("closed");
        } else {
            if (i == 0) {
                return 0L;
            }
            while (true) {
                boolean h = h();
                try {
                    b = cVar.b(1);
                    int inflate = this.b.inflate(b.a, b.c, (int) Math.min(j, 8192 - b.c));
                    if (inflate <= 0) {
                        if (this.b.finished() || this.b.needsDictionary()) {
                            break;
                        } else if (h) {
                            throw new EOFException("source exhausted prematurely");
                        }
                    } else {
                        b.c += inflate;
                        long j2 = inflate;
                        cVar.b += j2;
                        return j2;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            i();
            if (b.b == b.c) {
                cVar.a = b.b();
                p.a(b);
            }
            return -1L;
        }
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s
    public t b() {
        return this.a.b();
    }

    @Override // bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public final boolean h() throws IOException {
        if (this.b.needsInput()) {
            i();
            if (this.b.getRemaining() != 0) {
                throw new IllegalStateException("?");
            }
            if (this.a.f()) {
                return true;
            }
            o oVar = this.a.a().a;
            int i = oVar.c;
            int i2 = oVar.b;
            this.c = i - i2;
            this.b.setInput(oVar.a, i2, this.c);
        }
        return false;
    }
}
