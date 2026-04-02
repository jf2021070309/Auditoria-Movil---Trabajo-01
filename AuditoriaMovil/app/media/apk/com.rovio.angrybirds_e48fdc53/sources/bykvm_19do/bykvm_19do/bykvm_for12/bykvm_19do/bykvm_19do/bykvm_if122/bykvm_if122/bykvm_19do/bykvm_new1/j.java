package bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1;

import bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.bykvm_new1.d;
import com.flurry.android.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
final class j implements Closeable {
    private static final Logger g = Logger.getLogger(e.class.getName());
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d a;
    private final boolean b;
    private final bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c c;
    private int d;
    private boolean e;
    final d.b f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d dVar, boolean z) {
        this.a = dVar;
        this.b = z;
        bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar = new bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c();
        this.c = cVar;
        this.f = new d.b(cVar);
        this.d = 16384;
    }

    private static void a(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.d dVar, int i) throws IOException {
        dVar.writeByte((i >>> 16) & 255);
        dVar.writeByte((i >>> 8) & 255);
        dVar.writeByte(i & 255);
    }

    private void b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min(this.d, j);
            long j2 = min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.a.b(this.c, j2);
        }
    }

    void a(int i, byte b, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, int i2) throws IOException {
        a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.a.b(cVar, i2);
        }
    }

    public void a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i, i2, b, b2));
        }
        int i3 = this.d;
        if (i2 > i3) {
            e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) != 0) {
            e.a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        } else {
            a(this.a, i2);
            this.a.writeByte(b & Constants.UNKNOWN);
            this.a.writeByte(b2 & Constants.UNKNOWN);
            this.a.writeInt(i & Integer.MAX_VALUE);
        }
    }

    public void a(int i, int i2, List<c> list) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.f.a(list);
            long o = this.c.o();
            int min = (int) Math.min(this.d - 4, o);
            long j = min;
            int i3 = (o > j ? 1 : (o == j ? 0 : -1));
            a(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : (byte) 0);
            this.a.writeInt(i2 & Integer.MAX_VALUE);
            this.a.b(this.c, j);
            if (i3 > 0) {
                b(i, o - j);
            }
        }
    }

    public void a(int i, long j) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (j == 0 || j > 2147483647L) {
                e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
                throw null;
            }
            a(i, 4, (byte) 8, (byte) 0);
            this.a.writeInt((int) j);
            this.a.flush();
        }
    }

    public void a(int i, b bVar) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (bVar.a == -1) {
                throw new IllegalArgumentException();
            }
            a(i, 4, (byte) 3, (byte) 0);
            this.a.writeInt(bVar.a);
            this.a.flush();
        }
    }

    public void a(int i, b bVar, byte[] bArr) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (bVar.a == -1) {
                e.a("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.a.writeInt(i);
            this.a.writeInt(bVar.a);
            if (bArr.length > 0) {
                this.a.write(bArr);
            }
            this.a.flush();
        }
    }

    public void a(n nVar) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.d = nVar.c(this.d);
            if (nVar.b() != -1) {
                this.f.a(nVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.a.flush();
        }
    }

    public void a(boolean z, int i, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.a.writeInt(i);
            this.a.writeInt(i2);
            this.a.flush();
        }
    }

    public void a(boolean z, int i, int i2, List<c> list) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(z, i, list);
        }
    }

    public void a(boolean z, int i, bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.c cVar, int i2) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            a(i, z ? (byte) 1 : (byte) 0, cVar, i2);
        }
    }

    void a(boolean z, int i, List<c> list) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.a(list);
        long o = this.c.o();
        int min = (int) Math.min(this.d, o);
        long j = min;
        int i2 = (o > j ? 1 : (o == j ? 0 : -1));
        byte b = i2 == 0 ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        a(i, min, (byte) 1, b);
        this.a.b(this.c, j);
        if (i2 > 0) {
            b(i, o - j);
        }
    }

    public void b(n nVar) throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            int i = 0;
            a(0, nVar.d() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (nVar.d(i)) {
                    this.a.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.a.writeInt(nVar.a(i));
                }
                i++;
            }
            this.a.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this) {
            this.e = true;
            this.a.close();
        }
    }

    public void flush() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            this.a.flush();
        }
    }

    public void i() throws IOException {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
            if (this.b) {
                Logger logger = g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(bykvm_19do.bykvm_19do.bykvm_for12.bykvm_19do.bykvm_19do.bykvm_if122.bykvm_if122.bykvm_19do.c.a(">> CONNECTION %s", e.a.b()));
                }
                this.a.write(e.a.g());
                this.a.flush();
            }
        }
    }

    public int j() {
        return this.d;
    }
}
