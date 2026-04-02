package okhttp3.internal.http2;

import com.amazon.aps.iva.ef0.b0;
import com.amazon.aps.iva.ef0.c;
import com.amazon.aps.iva.ef0.d0;
import com.amazon.aps.iva.ef0.e0;
import com.amazon.aps.iva.ef0.h;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal.Util;
/* compiled from: Http2Stream.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u00100\u001a\u00020\u001e\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bi\u0010jJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J$\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0013J\u0018\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u000e\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0015J\u000f\u0010'\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u000e\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(J\u000f\u0010,\u001a\u00020\u000bH\u0000¢\u0006\u0004\b+\u0010&J\u000f\u0010.\u001a\u00020\u000bH\u0000¢\u0006\u0004\b-\u0010&J\u001a\u0010/\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R\u0017\u00100\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R*\u0010:\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R*\u0010@\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R*\u0010C\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R*\u0010F\u001a\u00020(2\u0006\u00109\u001a\u00020(8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010L\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u0010\u001d\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010S\u001a\u00060RR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001e\u0010\u000f\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010ZR\u001e\u0010\u0010\u001a\u00060WR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010X\u001a\u0004\b[\u0010ZR$\u0010\u001a\u001a\u0004\u0018\u00010\u00158@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/Headers;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "", "outFinished", "flushHeaders", "Lcom/amazon/aps/iva/kb0/q;", "writeHeaders", "enqueueTrailers", "Lcom/amazon/aps/iva/ef0/e0;", "readTimeout", "writeTimeout", "Lcom/amazon/aps/iva/ef0/d0;", "getSource", "Lcom/amazon/aps/iva/ef0/b0;", "getSink", "Lokhttp3/internal/http2/ErrorCode;", "rstStatusCode", "Ljava/io/IOException;", "errorException", "close", "errorCode", "closeLater", "Lcom/amazon/aps/iva/ef0/h;", FirebaseAnalytics.Param.SOURCE, "", "length", "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "closeInternal", "id", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", "connection", "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/Headers;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Http2Stream {
    public static final Companion Companion = new Companion(null);
    public static final long EMIT_BUFFER_SIZE = 16384;
    private final Http2Connection connection;
    private ErrorCode errorCode;
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<Headers> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;
    private final StreamTimeout readTimeout;
    private final FramingSink sink;
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;
    private final StreamTimeout writeTimeout;

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$Companion;", "", "()V", "EMIT_BUFFER_SIZE", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0015\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lcom/amazon/aps/iva/ef0/d0;", "", "read", "Lcom/amazon/aps/iva/kb0/q;", "updateConnectionFlowControl", "Lcom/amazon/aps/iva/ef0/e;", "sink", "byteCount", "Lcom/amazon/aps/iva/ef0/h;", FirebaseAnalytics.Param.SOURCE, "receive$okhttp", "(Lcom/amazon/aps/iva/ef0/h;J)V", "receive", "Lcom/amazon/aps/iva/ef0/e0;", "timeout", "close", "maxByteCount", "J", "", "finished", "Z", "getFinished$okhttp", "()Z", "setFinished$okhttp", "(Z)V", "receiveBuffer", "Lcom/amazon/aps/iva/ef0/e;", "getReceiveBuffer", "()Lcom/amazon/aps/iva/ef0/e;", "readBuffer", "getReadBuffer", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed$okhttp", "setClosed$okhttp", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class FramingSource implements d0 {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;
        private Headers trailers;
        private final com.amazon.aps.iva.ef0.e receiveBuffer = new com.amazon.aps.iva.ef0.e();
        private final com.amazon.aps.iva.ef0.e readBuffer = new com.amazon.aps.iva.ef0.e();

        public FramingSource(long j, boolean z) {
            this.maxByteCount = j;
            this.finished = z;
        }

        private final void updateConnectionFlowControl(long j) {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long j;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.closed = true;
                com.amazon.aps.iva.ef0.e eVar = this.readBuffer;
                j = eVar.c;
                eVar.a();
                j.d(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                q qVar = q.a;
            }
            if (j > 0) {
                updateConnectionFlowControl(j);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        public final boolean getClosed$okhttp() {
            return this.closed;
        }

        public final boolean getFinished$okhttp() {
            return this.finished;
        }

        public final com.amazon.aps.iva.ef0.e getReadBuffer() {
            return this.readBuffer;
        }

        public final com.amazon.aps.iva.ef0.e getReceiveBuffer() {
            return this.receiveBuffer;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bc, code lost:
            throw new java.io.IOException("stream closed");
         */
        @Override // com.amazon.aps.iva.ef0.d0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(com.amazon.aps.iva.ef0.e r18, long r19) throws java.io.IOException {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                java.lang.String r4 = "sink"
                com.amazon.aps.iva.yb0.j.f(r0, r4)
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L13
                r6 = 1
                goto L14
            L13:
                r6 = 0
            L14:
                if (r6 == 0) goto Lc9
            L16:
                okhttp3.internal.http2.Http2Stream r6 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r6)
                okhttp3.internal.http2.Http2Stream$StreamTimeout r9 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lc6
                r9.enter()     // Catch: java.lang.Throwable -> Lc6
                okhttp3.internal.http2.ErrorCode r9 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lbd
                if (r9 == 0) goto L3d
                boolean r9 = r1.finished     // Catch: java.lang.Throwable -> Lbd
                if (r9 != 0) goto L3d
                java.io.IOException r9 = r6.getErrorException$okhttp()     // Catch: java.lang.Throwable -> Lbd
                if (r9 != 0) goto L3e
                okhttp3.internal.http2.StreamResetException r9 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lbd
                okhttp3.internal.http2.ErrorCode r10 = r6.getErrorCode$okhttp()     // Catch: java.lang.Throwable -> Lbd
                com.amazon.aps.iva.yb0.j.c(r10)     // Catch: java.lang.Throwable -> Lbd
                r9.<init>(r10)     // Catch: java.lang.Throwable -> Lbd
                goto L3e
            L3d:
                r9 = 0
            L3e:
                boolean r10 = r1.closed     // Catch: java.lang.Throwable -> Lbd
                if (r10 != 0) goto Lb5
                com.amazon.aps.iva.ef0.e r10 = r1.readBuffer     // Catch: java.lang.Throwable -> Lbd
                long r11 = r10.c     // Catch: java.lang.Throwable -> Lbd
                int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                r13 = -1
                if (r4 <= 0) goto L8f
                long r4 = java.lang.Math.min(r2, r11)     // Catch: java.lang.Throwable -> Lbd
                long r4 = r10.read(r0, r4)     // Catch: java.lang.Throwable -> Lbd
                long r10 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lbd
                long r10 = r10 + r4
                r6.setReadBytesTotal$okhttp(r10)     // Catch: java.lang.Throwable -> Lbd
                long r10 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lbd
                long r15 = r6.getReadBytesAcknowledged()     // Catch: java.lang.Throwable -> Lbd
                long r10 = r10 - r15
                if (r9 != 0) goto L8c
                okhttp3.internal.http2.Http2Connection r12 = r6.getConnection()     // Catch: java.lang.Throwable -> Lbd
                okhttp3.internal.http2.Settings r12 = r12.getOkHttpSettings()     // Catch: java.lang.Throwable -> Lbd
                int r12 = r12.getInitialWindowSize()     // Catch: java.lang.Throwable -> Lbd
                int r12 = r12 / 2
                long r7 = (long) r12     // Catch: java.lang.Throwable -> Lbd
                int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
                if (r7 < 0) goto L8c
                okhttp3.internal.http2.Http2Connection r7 = r6.getConnection()     // Catch: java.lang.Throwable -> Lbd
                int r8 = r6.getId()     // Catch: java.lang.Throwable -> Lbd
                r7.writeWindowUpdateLater$okhttp(r8, r10)     // Catch: java.lang.Throwable -> Lbd
                long r7 = r6.getReadBytesTotal()     // Catch: java.lang.Throwable -> Lbd
                r6.setReadBytesAcknowledged$okhttp(r7)     // Catch: java.lang.Throwable -> Lbd
            L8c:
                r7 = r4
                r4 = 0
                goto L9c
            L8f:
                boolean r4 = r1.finished     // Catch: java.lang.Throwable -> Lbd
                if (r4 != 0) goto L9a
                if (r9 != 0) goto L9a
                r6.waitForIo$okhttp()     // Catch: java.lang.Throwable -> Lbd
                r4 = 1
                goto L9b
            L9a:
                r4 = 0
            L9b:
                r7 = r13
            L9c:
                okhttp3.internal.http2.Http2Stream$StreamTimeout r5 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lc6
                r5.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lc6
                com.amazon.aps.iva.kb0.q r5 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> Lc6
                monitor-exit(r6)
                if (r4 == 0) goto Lac
                r4 = 0
                goto L16
            Lac:
                int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r0 == 0) goto Lb1
                return r7
            Lb1:
                if (r9 != 0) goto Lb4
                return r13
            Lb4:
                throw r9
            Lb5:
                java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lbd
                java.lang.String r2 = "stream closed"
                r0.<init>(r2)     // Catch: java.lang.Throwable -> Lbd
                throw r0     // Catch: java.lang.Throwable -> Lbd
            Lbd:
                r0 = move-exception
                okhttp3.internal.http2.Http2Stream$StreamTimeout r2 = r6.getReadTimeout$okhttp()     // Catch: java.lang.Throwable -> Lc6
                r2.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> Lc6
                throw r0     // Catch: java.lang.Throwable -> Lc6
            Lc6:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            Lc9:
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r0 = com.amazon.aps.iva.j0.j0.f(r0, r2)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSource.read(com.amazon.aps.iva.ef0.e, long):long");
        }

        public final void receive$okhttp(h hVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            j.f(hVar, FirebaseAnalytics.Param.SOURCE);
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j2 = j;
            while (j2 > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    if (this.readBuffer.c + j2 > this.maxByteCount) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    q qVar = q.a;
                }
                if (z3) {
                    hVar.e(j2);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    hVar.e(j2);
                    return;
                } else {
                    long read = hVar.read(this.receiveBuffer, j2);
                    if (read != -1) {
                        j2 -= read;
                        Http2Stream http2Stream2 = Http2Stream.this;
                        synchronized (http2Stream2) {
                            if (this.closed) {
                                this.receiveBuffer.a();
                            } else {
                                com.amazon.aps.iva.ef0.e eVar = this.readBuffer;
                                if (eVar.c != 0) {
                                    z2 = false;
                                }
                                eVar.r(this.receiveBuffer);
                                if (z2) {
                                    j.d(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                    http2Stream2.notifyAll();
                                }
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
            updateConnectionFlowControl(j);
        }

        public final void setClosed$okhttp(boolean z) {
            this.closed = z;
        }

        public final void setFinished$okhttp(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // com.amazon.aps.iva.ef0.d0
        public e0 timeout() {
            return Http2Stream.this.getReadTimeout$okhttp();
        }
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lcom/amazon/aps/iva/ef0/c;", "Lcom/amazon/aps/iva/kb0/q;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class StreamTimeout extends c {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (!exit()) {
                return;
            }
            throw newTimeoutException(null);
        }

        @Override // com.amazon.aps.iva.ef0.c
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.amazon.aps.iva.ef0.c
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, Headers headers) {
        j.f(http2Connection, "connection");
        this.id = i;
        this.connection = http2Connection;
        this.writeBytesMaximum = http2Connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<Headers> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(http2Connection.getOkHttpSettings().getInitialWindowSize(), z2);
        this.sink = new FramingSink(z);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (headers != null) {
            if (!isLocallyInitiated()) {
                arrayDeque.add(headers);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (isLocallyInitiated()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException iOException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = iOException;
            notifyAll();
            if (this.source.getFinished$okhttp() && this.sink.getFinished()) {
                return false;
            }
            q qVar = q.a;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j) {
        this.writeBytesMaximum += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z;
        boolean isOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (!this.source.getFinished$okhttp() && this.source.getClosed$okhttp() && (this.sink.getFinished() || this.sink.getClosed())) {
                z = true;
            } else {
                z = false;
            }
            isOpen = isOpen();
            q qVar = q.a;
        }
        if (z) {
            close(ErrorCode.CANCEL, null);
        } else if (!isOpen) {
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (!this.sink.getClosed()) {
            if (!this.sink.getFinished()) {
                if (this.errorCode != null) {
                    IOException iOException = this.errorException;
                    if (iOException == null) {
                        ErrorCode errorCode = this.errorCode;
                        j.c(errorCode);
                        throw new StreamResetException(errorCode);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void close(ErrorCode errorCode, IOException iOException) throws IOException {
        j.f(errorCode, "rstStatusCode");
        if (!closeInternal(errorCode, iOException)) {
            return;
        }
        this.connection.writeSynReset$okhttp(this.id, errorCode);
    }

    public final void closeLater(ErrorCode errorCode) {
        j.f(errorCode, "errorCode");
        if (!closeInternal(errorCode, null)) {
            return;
        }
        this.connection.writeSynResetLater$okhttp(this.id, errorCode);
    }

    public final void enqueueTrailers(Headers headers) {
        j.f(headers, "trailers");
        synchronized (this) {
            boolean z = true;
            if (!this.sink.getFinished()) {
                if (headers.size() == 0) {
                    z = false;
                }
                if (z) {
                    this.sink.setTrailers(headers);
                    q qVar = q.a;
                } else {
                    throw new IllegalArgumentException("trailers.size() == 0".toString());
                }
            } else {
                throw new IllegalStateException("already finished".toString());
            }
        }
    }

    public final Http2Connection getConnection() {
        return this.connection;
    }

    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    public final IOException getErrorException$okhttp() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    public final StreamTimeout getReadTimeout$okhttp() {
        return this.readTimeout;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0011 A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0017 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x0011, B:15:0x0017, B:16:0x0022), top: B:20:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.amazon.aps.iva.ef0.b0 getSink() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto Le
            boolean r0 = r2.isLocallyInitiated()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto Lc
            goto Le
        Lc:
            r0 = 0
            goto Lf
        Le:
            r0 = 1
        Lf:
            if (r0 == 0) goto L17
            com.amazon.aps.iva.kb0.q r0 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Stream$FramingSink r0 = r2.sink
            return r0
        L17:
            java.lang.String r0 = "reply before requesting the sink"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L23
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.lang.Throwable -> L23
        L23:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.getSink():com.amazon.aps.iva.ef0.b0");
    }

    public final FramingSink getSink$okhttp() {
        return this.sink;
    }

    public final d0 getSource() {
        return this.source;
    }

    public final FramingSource getSource$okhttp() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    public final StreamTimeout getWriteTimeout$okhttp() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        boolean z;
        if ((this.id & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.connection.getClient$okhttp() == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.getFinished$okhttp() || this.source.getClosed$okhttp()) && (this.sink.getFinished() || this.sink.getClosed())) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public final e0 readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(h hVar, int i) throws IOException {
        j.f(hVar, FirebaseAnalytics.Param.SOURCE);
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.source.receive$okhttp(hVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c A[Catch: all -> 0x0065, TryCatch #0 {, blocks: (B:10:0x0035, B:14:0x003d, B:17:0x004c, B:18:0x0051, B:15:0x0043), top: B:26:0x0035 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void receiveHeaders(okhttp3.Headers r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            com.amazon.aps.iva.yb0.j.f(r3, r0)
            boolean r0 = okhttp3.internal.Util.assertionsEnabled
            if (r0 == 0) goto L34
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto L10
            goto L34
        L10:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Thread "
            r4.<init>(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r4.append(r0)
            java.lang.String r0 = " MUST NOT hold lock on "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L34:
            monitor-enter(r2)
            boolean r0 = r2.hasResponseHeaders     // Catch: java.lang.Throwable -> L65
            r1 = 1
            if (r0 == 0) goto L43
            if (r4 != 0) goto L3d
            goto L43
        L3d:
            okhttp3.internal.http2.Http2Stream$FramingSource r0 = r2.source     // Catch: java.lang.Throwable -> L65
            r0.setTrailers(r3)     // Catch: java.lang.Throwable -> L65
            goto L4a
        L43:
            r2.hasResponseHeaders = r1     // Catch: java.lang.Throwable -> L65
            java.util.ArrayDeque<okhttp3.Headers> r0 = r2.headersQueue     // Catch: java.lang.Throwable -> L65
            r0.add(r3)     // Catch: java.lang.Throwable -> L65
        L4a:
            if (r4 == 0) goto L51
            okhttp3.internal.http2.Http2Stream$FramingSource r3 = r2.source     // Catch: java.lang.Throwable -> L65
            r3.setFinished$okhttp(r1)     // Catch: java.lang.Throwable -> L65
        L51:
            boolean r3 = r2.isOpen()     // Catch: java.lang.Throwable -> L65
            r2.notifyAll()     // Catch: java.lang.Throwable -> L65
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a     // Catch: java.lang.Throwable -> L65
            monitor-exit(r2)
            if (r3 != 0) goto L64
            okhttp3.internal.http2.Http2Connection r3 = r2.connection
            int r4 = r2.id
            r3.removeStream$okhttp(r4)
        L64:
            return
        L65:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.receiveHeaders(okhttp3.Headers, boolean):void");
    }

    public final synchronized void receiveRstStream(ErrorCode errorCode) {
        j.f(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j) {
        this.readBytesAcknowledged = j;
    }

    public final void setReadBytesTotal$okhttp(long j) {
        this.readBytesTotal = j;
    }

    public final void setWriteBytesMaximum$okhttp(long j) {
        this.writeBytesMaximum = j;
    }

    public final void setWriteBytesTotal$okhttp(long j) {
        this.writeBytesTotal = j;
    }

    public final synchronized Headers takeHeaders() throws IOException {
        Headers removeFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            waitForIo$okhttp();
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
            removeFirst = this.headersQueue.removeFirst();
            j.e(removeFirst, "headersQueue.removeFirst()");
        } else {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                j.c(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        }
        return removeFirst;
    }

    public final synchronized Headers trailers() throws IOException {
        Headers trailers;
        if (this.source.getFinished$okhttp() && this.source.getReceiveBuffer().Y() && this.source.getReadBuffer().Y()) {
            trailers = this.source.getTrailers();
            if (trailers == null) {
                trailers = Util.EMPTY_HEADERS;
            }
        } else if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException == null) {
                ErrorCode errorCode = this.errorCode;
                j.c(errorCode);
                throw new StreamResetException(errorCode);
            }
            throw iOException;
        } else {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(List<Header> list, boolean z, boolean z2) throws IOException {
        boolean z3;
        j.f(list, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            z3 = true;
            this.hasResponseHeaders = true;
            if (z) {
                this.sink.setFinished(true);
            }
            q qVar = q.a;
        }
        if (!z2) {
            synchronized (this.connection) {
                if (this.connection.getWriteBytesTotal() < this.connection.getWriteBytesMaximum()) {
                    z3 = false;
                }
            }
            z2 = z3;
        }
        this.connection.writeHeaders$okhttp(this.id, z, list);
        if (z2) {
            this.connection.flush();
        }
    }

    public final e0 writeTimeout() {
        return this.writeTimeout;
    }

    /* compiled from: Http2Stream.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006#"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lcom/amazon/aps/iva/ef0/b0;", "", "outFinishedOnLastFrame", "Lcom/amazon/aps/iva/kb0/q;", "emitFrame", "Lcom/amazon/aps/iva/ef0/e;", FirebaseAnalytics.Param.SOURCE, "", "byteCount", "write", "flush", "Lcom/amazon/aps/iva/ef0/e0;", "timeout", "close", "finished", "Z", "getFinished", "()Z", "setFinished", "(Z)V", "sendBuffer", "Lcom/amazon/aps/iva/ef0/e;", "Lokhttp3/Headers;", "trailers", "Lokhttp3/Headers;", "getTrailers", "()Lokhttp3/Headers;", "setTrailers", "(Lokhttp3/Headers;)V", "closed", "getClosed", "setClosed", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class FramingSink implements b0 {
        private boolean closed;
        private boolean finished;
        private final com.amazon.aps.iva.ef0.e sendBuffer;
        private Headers trailers;

        public FramingSink(boolean z) {
            this.finished = z;
            this.sendBuffer = new com.amazon.aps.iva.ef0.e();
        }

        private final void emitFrame(boolean z) throws IOException {
            long min;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                http2Stream.getWriteTimeout$okhttp().enter();
                while (http2Stream.getWriteBytesTotal() >= http2Stream.getWriteBytesMaximum() && !this.finished && !this.closed && http2Stream.getErrorCode$okhttp() == null) {
                    http2Stream.waitForIo$okhttp();
                }
                http2Stream.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
                http2Stream.checkOutNotClosed$okhttp();
                min = Math.min(http2Stream.getWriteBytesMaximum() - http2Stream.getWriteBytesTotal(), this.sendBuffer.c);
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + min);
                if (z && min == this.sendBuffer.c) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z2;
                q qVar = q.a;
            }
            Http2Stream.this.getWriteTimeout$okhttp().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z3, this.sendBuffer, min);
            } finally {
                Http2Stream.this.getWriteTimeout$okhttp().exitAndThrowIfTimedOut();
            }
        }

        @Override // com.amazon.aps.iva.ef0.b0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.closed) {
                    return;
                }
                if (http2Stream2.getErrorCode$okhttp() == null) {
                    z = true;
                } else {
                    z = false;
                }
                q qVar = q.a;
                if (!Http2Stream.this.getSink$okhttp().finished) {
                    if (this.sendBuffer.c > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.trailers != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        while (this.sendBuffer.c > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id = Http2Stream.this.getId();
                        Headers headers = this.trailers;
                        j.c(headers);
                        connection.writeHeaders$okhttp(id, z, Util.toHeaderList(headers));
                    } else if (z2) {
                        while (this.sendBuffer.c > 0) {
                            emitFrame(true);
                        }
                    } else if (z) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    q qVar2 = q.a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // com.amazon.aps.iva.ef0.b0, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.checkOutNotClosed$okhttp();
                q qVar = q.a;
            }
            while (this.sendBuffer.c > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        public final Headers getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        public final void setFinished(boolean z) {
            this.finished = z;
        }

        public final void setTrailers(Headers headers) {
            this.trailers = headers;
        }

        @Override // com.amazon.aps.iva.ef0.b0
        public e0 timeout() {
            return Http2Stream.this.getWriteTimeout$okhttp();
        }

        @Override // com.amazon.aps.iva.ef0.b0
        public void write(com.amazon.aps.iva.ef0.e eVar, long j) throws IOException {
            j.f(eVar, FirebaseAnalytics.Param.SOURCE);
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            this.sendBuffer.write(eVar, j);
            while (this.sendBuffer.c >= 16384) {
                emitFrame(false);
            }
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z, int i, e eVar) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
