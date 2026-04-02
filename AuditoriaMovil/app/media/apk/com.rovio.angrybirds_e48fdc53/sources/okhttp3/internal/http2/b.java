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
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class b implements Closeable {
    static final Logger a = Logger.getLogger(Http2.class.getName());
    final a.C0339a b;
    private final BufferedSource c;
    private final a d;
    private final boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: okhttp3.internal.http2.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0340b {
        void a();

        void a(int i, int i2, int i3, boolean z);

        void a(int i, int i2, List<Header> list);

        void a(int i, long j);

        void a(int i, ErrorCode errorCode);

        void a(int i, ErrorCode errorCode, ByteString byteString);

        void a(boolean z, int i, int i2);

        void a(boolean z, int i, int i2, List<Header> list);

        void a(boolean z, int i, BufferedSource bufferedSource, int i2);

        void a(boolean z, Settings settings);
    }

    public b(BufferedSource bufferedSource, boolean z) {
        this.c = bufferedSource;
        this.e = z;
        this.d = new a(this.c);
        this.b = new a.C0339a(4096, this.d);
    }

    public void a(InterfaceC0340b interfaceC0340b) {
        if (this.e) {
            if (!a(true, interfaceC0340b)) {
                throw Http2.b("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        ByteString readByteString = this.c.readByteString(Http2.a.size());
        if (a.isLoggable(Level.FINE)) {
            a.fine(Util.format("<< CONNECTION %s", readByteString.hex()));
        }
        if (!Http2.a.equals(readByteString)) {
            throw Http2.b("Expected a connection header but was %s", new Object[]{readByteString.utf8()});
        }
    }

    public boolean a(boolean z, InterfaceC0340b interfaceC0340b) {
        try {
            this.c.require(9L);
            int a2 = a(this.c);
            if (a2 < 0 || a2 > 16384) {
                throw Http2.b("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(a2)});
            }
            byte readByte = (byte) (this.c.readByte() & Constants.UNKNOWN);
            if (z && readByte != 4) {
                throw Http2.b("Expected a SETTINGS frame but was %s", new Object[]{Byte.valueOf(readByte)});
            }
            byte readByte2 = (byte) (this.c.readByte() & Constants.UNKNOWN);
            int readInt = this.c.readInt() & Integer.MAX_VALUE;
            if (a.isLoggable(Level.FINE)) {
                a.fine(Http2.a(true, readInt, a2, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    b(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 1:
                    a(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 2:
                    c(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 3:
                    d(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 4:
                    e(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 5:
                    f(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 6:
                    g(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 7:
                    h(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                case 8:
                    i(interfaceC0340b, a2, readByte2, readInt);
                    return true;
                default:
                    this.c.skip(a2);
                    return true;
            }
        } catch (IOException e) {
            return false;
        }
    }

    private void a(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i2 == 0) {
            throw Http2.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z = (b & 1) != 0;
        short readByte = (b & 8) != 0 ? (short) (this.c.readByte() & Constants.UNKNOWN) : (short) 0;
        if ((b & 32) != 0) {
            a(interfaceC0340b, i2);
            i -= 5;
        }
        interfaceC0340b.a(z, i2, -1, a(a(i, b, readByte), readByte, b, i2));
    }

    private List<Header> a(int i, short s, byte b, int i2) {
        a aVar = this.d;
        this.d.d = i;
        aVar.a = i;
        this.d.e = s;
        this.d.b = b;
        this.d.c = i2;
        this.b.a();
        return this.b.b();
    }

    private void b(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            throw Http2.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short readByte = (b & 8) != 0 ? (short) (this.c.readByte() & Constants.UNKNOWN) : (short) 0;
        interfaceC0340b.a(z, i2, this.c, a(i, b, readByte));
        this.c.skip(readByte);
    }

    private void c(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i != 5) {
            throw Http2.b("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
        }
        if (i2 == 0) {
            throw Http2.b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        a(interfaceC0340b, i2);
    }

    private void a(InterfaceC0340b interfaceC0340b, int i) {
        int readInt = this.c.readInt();
        interfaceC0340b.a(i, readInt & Integer.MAX_VALUE, (this.c.readByte() & Constants.UNKNOWN) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    private void d(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i != 4) {
            throw Http2.b("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
        }
        if (i2 == 0) {
            throw Http2.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int readInt = this.c.readInt();
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
        if (fromHttp2 == null) {
            throw Http2.b("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt)});
        }
        interfaceC0340b.a(i2, fromHttp2);
    }

    private void e(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i2 != 0) {
            throw Http2.b("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b & 1) != 0) {
            if (i != 0) {
                throw Http2.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            interfaceC0340b.a();
        } else if (i % 6 != 0) {
            throw Http2.b("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
        } else {
            Settings settings = new Settings();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.c.readShort();
                int readInt = this.c.readInt();
                switch (readShort) {
                    case 2:
                        if (readInt != 0 && readInt != 1) {
                            throw Http2.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    case 3:
                        readShort = 4;
                        break;
                    case 4:
                        readShort = 7;
                        if (readInt < 0) {
                            throw Http2.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    case 5:
                        if (readInt < 16384 || readInt > 16777215) {
                            throw Http2.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt)});
                        }
                        break;
                }
                settings.a(readShort, readInt);
            }
            interfaceC0340b.a(false, settings);
        }
    }

    private void f(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i2 == 0) {
            throw Http2.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short readByte = (b & 8) != 0 ? (short) (this.c.readByte() & Constants.UNKNOWN) : (short) 0;
        interfaceC0340b.a(i2, this.c.readInt() & Integer.MAX_VALUE, a(a(i - 4, b, readByte), readByte, b, i2));
    }

    private void g(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i != 8) {
            throw Http2.b("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
        }
        if (i2 != 0) {
            throw Http2.b("TYPE_PING streamId != 0", new Object[0]);
        }
        interfaceC0340b.a((b & 1) != 0, this.c.readInt(), this.c.readInt());
    }

    private void h(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i < 8) {
            throw Http2.b("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
        }
        if (i2 != 0) {
            throw Http2.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int readInt = this.c.readInt();
        int readInt2 = this.c.readInt();
        int i3 = i - 8;
        ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
        if (fromHttp2 == null) {
            throw Http2.b("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
        }
        ByteString byteString = ByteString.EMPTY;
        if (i3 > 0) {
            byteString = this.c.readByteString(i3);
        }
        interfaceC0340b.a(readInt, fromHttp2, byteString);
    }

    private void i(InterfaceC0340b interfaceC0340b, int i, byte b, int i2) {
        if (i != 4) {
            throw Http2.b("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
        }
        long readInt = this.c.readInt() & 2147483647L;
        if (readInt == 0) {
            throw Http2.b("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt)});
        }
        interfaceC0340b.a(i2, readInt);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.c.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a implements Source {
        int a;
        byte b;
        int c;
        int d;
        short e;
        private final BufferedSource f;

        public a(BufferedSource bufferedSource) {
            this.f = bufferedSource;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            while (this.d == 0) {
                this.f.skip(this.e);
                this.e = (short) 0;
                if ((this.b & 4) != 0) {
                    return -1L;
                }
                a();
            }
            long read = this.f.read(buffer, Math.min(j, this.d));
            if (read != -1) {
                this.d = (int) (this.d - read);
                return read;
            }
            return -1L;
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.f.timeout();
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        private void a() {
            int i = this.c;
            int a = b.a(this.f);
            this.d = a;
            this.a = a;
            byte readByte = (byte) (this.f.readByte() & Constants.UNKNOWN);
            this.b = (byte) (this.f.readByte() & Constants.UNKNOWN);
            if (b.a.isLoggable(Level.FINE)) {
                b.a.fine(Http2.a(true, this.c, this.a, readByte, this.b));
            }
            this.c = this.f.readInt() & Integer.MAX_VALUE;
            if (readByte != 9) {
                throw Http2.b("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
            }
            if (this.c != i) {
                throw Http2.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }

    static int a(BufferedSource bufferedSource) {
        return ((bufferedSource.readByte() & Constants.UNKNOWN) << 16) | ((bufferedSource.readByte() & Constants.UNKNOWN) << 8) | (bufferedSource.readByte() & Constants.UNKNOWN);
    }

    static int a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s > i) {
            throw Http2.b("PROTOCOL_ERROR padding %s > remaining length %s", new Object[]{Short.valueOf(s), Integer.valueOf(i)});
        }
        return (short) (i - s);
    }
}
