package okhttp3.internal.ws;

import java.io.IOException;
import java.util.Random;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Timeout;
/* loaded from: classes4.dex */
final class a {
    static final /* synthetic */ boolean j;
    final boolean a;
    final Random b;
    final BufferedSink c;
    boolean d;
    final Buffer e = new Buffer();
    final C0342a f = new C0342a();
    boolean g;
    final byte[] h;
    final byte[] i;

    static {
        j = !a.class.desiredAssertionStatus();
    }

    a(boolean z, BufferedSink bufferedSink, Random random) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        }
        if (random == null) {
            throw new NullPointerException("random == null");
        }
        this.a = z;
        this.c = bufferedSink;
        this.b = random;
        this.h = z ? new byte[4] : null;
        this.i = z ? new byte[8192] : null;
    }

    void a(ByteString byteString) {
        synchronized (this) {
            b(9, byteString);
        }
    }

    void b(ByteString byteString) {
        synchronized (this) {
            b(10, byteString);
        }
    }

    void a(int i, ByteString byteString) {
        ByteString byteString2 = ByteString.EMPTY;
        if (i != 0 || byteString != null) {
            if (i != 0) {
                WebSocketProtocol.b(i);
            }
            Buffer buffer = new Buffer();
            buffer.writeShort(i);
            if (byteString != null) {
                buffer.write(byteString);
            }
            byteString2 = buffer.readByteString();
        }
        synchronized (this) {
            b(8, byteString2);
            this.d = true;
        }
    }

    private void b(int i, ByteString byteString) {
        if (!j && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.d) {
            throw new IOException("closed");
        }
        int size = byteString.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.c.writeByte(i | 128);
        if (this.a) {
            this.c.writeByte(size | 128);
            this.b.nextBytes(this.h);
            this.c.write(this.h);
            byte[] byteArray = byteString.toByteArray();
            WebSocketProtocol.a(byteArray, byteArray.length, this.h, 0L);
            this.c.write(byteArray);
        } else {
            this.c.writeByte(size);
            this.c.write(byteString);
        }
        this.c.flush();
    }

    Sink a(int i, long j2) {
        if (this.g) {
            throw new IllegalStateException("Another message writer is active. Did you call close()?");
        }
        this.g = true;
        this.f.a = i;
        this.f.b = j2;
        this.f.c = true;
        this.f.d = false;
        return this.f;
    }

    void a(int i, long j2, boolean z, boolean z2) {
        if (!j && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (this.d) {
            throw new IOException("closed");
        }
        int i2 = z ? i : 0;
        if (z2) {
            i2 |= 128;
        }
        this.c.writeByte(i2);
        int i3 = this.a ? 128 : 0;
        if (j2 <= 125) {
            this.c.writeByte(i3 | ((int) j2));
        } else if (j2 <= 65535) {
            this.c.writeByte(i3 | 126);
            this.c.writeShort((int) j2);
        } else {
            this.c.writeByte(i3 | 127);
            this.c.writeLong(j2);
        }
        if (this.a) {
            this.b.nextBytes(this.h);
            this.c.write(this.h);
            long j3 = 0;
            while (j3 < j2) {
                int read = this.e.read(this.i, 0, (int) Math.min(j2, this.i.length));
                if (read == -1) {
                    throw new AssertionError();
                }
                WebSocketProtocol.a(this.i, read, this.h, j3);
                this.c.write(this.i, 0, read);
                j3 += read;
            }
        } else {
            this.c.write(this.e, j2);
        }
        this.c.emit();
    }

    /* renamed from: okhttp3.internal.ws.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    final class C0342a implements Sink {
        int a;
        long b;
        boolean c;
        boolean d;

        C0342a() {
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (this.d) {
                throw new IOException("closed");
            }
            a.this.e.write(buffer, j);
            boolean z = this.c && this.b != -1 && a.this.e.size() > this.b - 8192;
            long completeSegmentByteCount = a.this.e.completeSegmentByteCount();
            if (completeSegmentByteCount > 0 && !z) {
                synchronized (a.this) {
                    a.this.a(this.a, completeSegmentByteCount, this.c, false);
                }
                this.c = false;
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (this.d) {
                throw new IOException("closed");
            }
            synchronized (a.this) {
                a.this.a(this.a, a.this.e.size(), this.c, false);
            }
            this.c = false;
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return a.this.c.timeout();
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.d) {
                throw new IOException("closed");
            }
            synchronized (a.this) {
                a.this.a(this.a, a.this.e.size(), this.c, true);
            }
            this.d = true;
            a.this.g = false;
        }
    }
}
