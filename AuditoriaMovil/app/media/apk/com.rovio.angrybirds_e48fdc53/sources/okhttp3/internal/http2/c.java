package okhttp3.internal.http2;

import com.flurry.android.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.a;
import okio.Buffer;
import okio.BufferedSink;
/* loaded from: classes4.dex */
final class c implements Closeable {
    private static final Logger b = Logger.getLogger(Http2.class.getName());
    private final BufferedSink c;
    private final boolean d;
    private boolean g;
    private final Buffer e = new Buffer();
    final a.b a = new a.b(this.e);
    private int f = 16384;

    public c(BufferedSink bufferedSink, boolean z) {
        this.c = bufferedSink;
        this.d = z;
    }

    public synchronized void a() {
        if (this.g) {
            throw new IOException("closed");
        }
        if (this.d) {
            if (b.isLoggable(Level.FINE)) {
                b.fine(Util.format(">> CONNECTION %s", Http2.a.hex()));
            }
            this.c.write(Http2.a.toByteArray());
            this.c.flush();
        }
    }

    public synchronized void a(Settings settings) {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f = settings.d(this.f);
        if (settings.c() != -1) {
            this.a.a(settings.c());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.c.flush();
    }

    public synchronized void a(int i, int i2, List<Header> list) {
        if (this.g) {
            throw new IOException("closed");
        }
        this.a.a(list);
        long size = this.e.size();
        int min = (int) Math.min(this.f - 4, size);
        a(i, min + 4, (byte) 5, size == ((long) min) ? (byte) 4 : (byte) 0);
        this.c.writeInt(Integer.MAX_VALUE & i2);
        this.c.write(this.e, min);
        if (size > min) {
            b(i, size - min);
        }
    }

    public synchronized void b() {
        if (this.g) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public synchronized void a(boolean z, int i, int i2, List<Header> list) {
        if (this.g) {
            throw new IOException("closed");
        }
        b(z, i, list);
    }

    public synchronized void a(boolean z, int i, List<Header> list) {
        if (this.g) {
            throw new IOException("closed");
        }
        b(z, i, list);
    }

    public synchronized void a(int i, ErrorCode errorCode) {
        if (this.g) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte) 3, (byte) 0);
        this.c.writeInt(errorCode.httpCode);
        this.c.flush();
    }

    public int c() {
        return this.f;
    }

    public synchronized void a(boolean z, int i, Buffer buffer, int i2) {
        if (this.g) {
            throw new IOException("closed");
        }
        a(i, z ? (byte) 1 : (byte) 0, buffer, i2);
    }

    void a(int i, byte b2, Buffer buffer, int i2) {
        a(i, i2, (byte) 0, b2);
        if (i2 > 0) {
            this.c.write(buffer, i2);
        }
    }

    public synchronized void b(Settings settings) {
        int i;
        int i2 = 0;
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            a(0, settings.b() * 6, (byte) 4, (byte) 0);
            while (i2 < 10) {
                if (settings.a(i2)) {
                    if (i2 == 4) {
                        i = 3;
                    } else {
                        i = i2 == 7 ? 4 : i2;
                    }
                    this.c.writeShort(i);
                    this.c.writeInt(settings.b(i2));
                }
                i2++;
            }
            this.c.flush();
        }
    }

    public synchronized void a(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.g) {
                throw new IOException("closed");
            }
            a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            this.c.writeInt(i);
            this.c.writeInt(i2);
            this.c.flush();
        }
    }

    public synchronized void a(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.g) {
            throw new IOException("closed");
        }
        if (errorCode.httpCode == -1) {
            throw Http2.a("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.c.writeInt(i);
        this.c.writeInt(errorCode.httpCode);
        if (bArr.length > 0) {
            this.c.write(bArr);
        }
        this.c.flush();
    }

    public synchronized void a(int i, long j) {
        if (this.g) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw Http2.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
        }
        a(i, 4, (byte) 8, (byte) 0);
        this.c.writeInt((int) j);
        this.c.flush();
    }

    public void a(int i, int i2, byte b2, byte b3) {
        if (b.isLoggable(Level.FINE)) {
            b.fine(Http2.a(false, i, i2, b2, b3));
        }
        if (i2 > this.f) {
            throw Http2.a("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(this.f), Integer.valueOf(i2)});
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw Http2.a("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
        }
        a(this.c, i2);
        this.c.writeByte(b2 & Constants.UNKNOWN);
        this.c.writeByte(b3 & Constants.UNKNOWN);
        this.c.writeInt(Integer.MAX_VALUE & i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.g = true;
        this.c.close();
    }

    private static void a(BufferedSink bufferedSink, int i) {
        bufferedSink.writeByte((i >>> 16) & 255);
        bufferedSink.writeByte((i >>> 8) & 255);
        bufferedSink.writeByte(i & 255);
    }

    private void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min(this.f, j);
            j -= min;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.c.write(this.e, min);
        }
    }

    void b(boolean z, int i, List<Header> list) {
        if (this.g) {
            throw new IOException("closed");
        }
        this.a.a(list);
        long size = this.e.size();
        int min = (int) Math.min(this.f, size);
        byte b2 = size == ((long) min) ? (byte) 4 : (byte) 0;
        if (z) {
            b2 = (byte) (b2 | 1);
        }
        a(i, min, (byte) 1, b2);
        this.c.write(this.e, min);
        if (size > min) {
            b(i, size - min);
        }
    }
}
