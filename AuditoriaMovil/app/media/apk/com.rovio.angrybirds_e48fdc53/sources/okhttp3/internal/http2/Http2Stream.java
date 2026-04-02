package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public final class Http2Stream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    long bytesLeftInWriteWindow;
    final Http2Connection connection;
    private boolean hasResponseHeaders;
    final int id;
    private final List<Header> requestHeaders;
    private List<Header> responseHeaders;
    final FramingSink sink;
    private final FramingSource source;
    long unacknowledgedBytesRead = 0;
    final StreamTimeout readTimeout = new StreamTimeout();
    final StreamTimeout writeTimeout = new StreamTimeout();
    ErrorCode errorCode = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Http2Stream(int id, Http2Connection connection, boolean outFinished, boolean inFinished, List<Header> requestHeaders) {
        if (connection == null) {
            throw new NullPointerException("connection == null");
        }
        if (requestHeaders == null) {
            throw new NullPointerException("requestHeaders == null");
        }
        this.id = id;
        this.connection = connection;
        this.bytesLeftInWriteWindow = connection.peerSettings.getInitialWindowSize();
        FramingSource framingSource = new FramingSource(connection.okHttpSettings.getInitialWindowSize());
        this.source = framingSource;
        FramingSink framingSink = new FramingSink();
        this.sink = framingSink;
        framingSource.finished = inFinished;
        framingSink.finished = outFinished;
        this.requestHeaders = requestHeaders;
    }

    public int getId() {
        return this.id;
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && (this.sink.finished || this.sink.closed)) {
            if (this.hasResponseHeaders) {
                return false;
            }
        }
        return true;
    }

    public boolean isLocallyInitiated() {
        boolean streamIsClient = (this.id & 1) == 1;
        return this.connection.client == streamIsClient;
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public List<Header> getRequestHeaders() {
        return this.requestHeaders;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:9|10|(1:12)(1:13))|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.List<okhttp3.internal.http2.Header> takeResponseHeaders() throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.isLocallyInitiated()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L38
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r3.readTimeout     // Catch: java.lang.Throwable -> L40
            r0.enter()     // Catch: java.lang.Throwable -> L40
        Lc:
            java.util.List<okhttp3.internal.http2.Header> r0 = r3.responseHeaders     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L1a
            okhttp3.internal.http2.ErrorCode r0 = r3.errorCode     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1a
            r3.waitForIo()     // Catch: java.lang.Throwable -> L18
            goto Lc
        L18:
            r0 = move-exception
            goto L32
        L1a:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r0 = r3.readTimeout     // Catch: java.lang.Throwable -> L40
            r0.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L40
            java.util.List<okhttp3.internal.http2.Header> r0 = r3.responseHeaders     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L29
            r1 = 0
            r3.responseHeaders = r1     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            return r0
        L29:
            okhttp3.internal.http2.StreamResetException r1 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> L40
            okhttp3.internal.http2.ErrorCode r2 = r3.errorCode     // Catch: java.lang.Throwable -> L40
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L40
            throw r1     // Catch: java.lang.Throwable -> L40
        L31:
            r0 = move-exception
        L32:
            okhttp3.internal.http2.Http2Stream$StreamTimeout r1 = r3.readTimeout     // Catch: java.lang.Throwable -> L40
            r1.exitAndThrowIfTimedOut()     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "servers cannot read response headers"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeResponseHeaders():java.util.List");
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public void sendResponseHeaders(List<Header> responseHeaders, boolean out) throws IOException {
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (responseHeaders == null) {
            throw new NullPointerException("responseHeaders == null");
        }
        boolean outFinished = false;
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (!out) {
                this.sink.finished = true;
                outFinished = true;
            }
        }
        this.connection.writeSynReply(this.id, outFinished, responseHeaders);
        if (outFinished) {
            this.connection.flush();
        }
    }

    public Timeout readTimeout() {
        return this.readTimeout;
    }

    public Timeout writeTimeout() {
        return this.writeTimeout;
    }

    public Source getSource() {
        return this.source;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders && !isLocallyInitiated()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.sink;
    }

    public void close(ErrorCode rstStatusCode) throws IOException {
        if (!closeInternal(rstStatusCode)) {
            return;
        }
        this.connection.writeSynReset(this.id, rstStatusCode);
    }

    public void closeLater(ErrorCode errorCode) {
        if (!closeInternal(errorCode)) {
            return;
        }
        this.connection.writeSynResetLater(this.id, errorCode);
    }

    private boolean closeInternal(ErrorCode errorCode) {
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode;
            notifyAll();
            this.connection.removeStream(this.id);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveHeaders(List<Header> headers) {
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        boolean open = true;
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (this.responseHeaders == null) {
                this.responseHeaders = headers;
                open = isOpen();
                notifyAll();
            } else {
                List<Header> newHeaders = new ArrayList<>();
                newHeaders.addAll(this.responseHeaders);
                newHeaders.add(null);
                newHeaders.addAll(headers);
                this.responseHeaders = newHeaders;
            }
        }
        if (!open) {
            this.connection.removeStream(this.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveData(BufferedSource in, int length) throws IOException {
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.source.receive(in, length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void receiveFin() {
        boolean open;
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.source.finished = true;
            open = isOpen();
            notifyAll();
        }
        if (!open) {
            this.connection.removeStream(this.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void receiveRstStream(ErrorCode errorCode) {
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    /* loaded from: classes4.dex */
    private final class b implements Source {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        private final Buffer e = new Buffer();
        private final Buffer f = new Buffer();
        private final long g;

        static {
            c = !Http2Stream.class.desiredAssertionStatus();
        }

        b(long j) {
            this.g = j;
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            long read;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            synchronized (Http2Stream.this) {
                a();
                b();
                if (this.f.size() == 0) {
                    read = -1;
                } else {
                    read = this.f.read(buffer, Math.min(j, this.f.size()));
                    Http2Stream.this.a += read;
                    if (Http2Stream.this.a >= Http2Stream.this.d.l.d() / 2) {
                        Http2Stream.this.d.a(Http2Stream.this.c, Http2Stream.this.a);
                        Http2Stream.this.a = 0L;
                    }
                    synchronized (Http2Stream.this.d) {
                        Http2Stream.this.d.j += read;
                        if (Http2Stream.this.d.j >= Http2Stream.this.d.l.d() / 2) {
                            Http2Stream.this.d.a(0, Http2Stream.this.d.j);
                            Http2Stream.this.d.j = 0L;
                        }
                    }
                }
            }
            return read;
        }

        private void a() {
            Http2Stream.this.f.enter();
            while (this.f.size() == 0 && !this.b && !this.a && Http2Stream.this.h == null) {
                try {
                    Http2Stream.this.d();
                } finally {
                    Http2Stream.this.f.a();
                }
            }
        }

        void a(BufferedSource bufferedSource, long j) {
            boolean z;
            boolean z2;
            if (!c && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.b;
                    z2 = this.f.size() + j > this.g;
                }
                if (z2) {
                    bufferedSource.skip(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.e, j);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    j -= read;
                    synchronized (Http2Stream.this) {
                        boolean z3 = this.f.size() == 0;
                        this.f.writeAll(this.e);
                        if (z3) {
                            Http2Stream.this.notifyAll();
                        }
                    }
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.f;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Http2Stream.this) {
                this.a = true;
                this.f.clear();
                Http2Stream.this.notifyAll();
            }
            Http2Stream.this.b();
        }

        private void b() {
            if (this.a) {
                throw new IOException("stream closed");
            }
            if (Http2Stream.this.h != null) {
                throw new StreamResetException(Http2Stream.this.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class FramingSource implements Source {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        boolean closed;
        boolean finished;
        private final long maxByteCount;
        private final Buffer receiveBuffer = new Buffer();
        private final Buffer readBuffer = new Buffer();

        FramingSource(long maxByteCount) {
            this.maxByteCount = maxByteCount;
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            if (byteCount < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + byteCount);
            }
            synchronized (Http2Stream.this) {
                waitUntilReadable();
                checkNotClosed();
                if (this.readBuffer.size() == 0) {
                    return -1L;
                }
                Buffer buffer = this.readBuffer;
                long read = buffer.read(sink, Math.min(byteCount, buffer.size()));
                Http2Stream.this.unacknowledgedBytesRead += read;
                if (Http2Stream.this.unacknowledgedBytesRead >= Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2) {
                    Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.id, Http2Stream.this.unacknowledgedBytesRead);
                    Http2Stream.this.unacknowledgedBytesRead = 0L;
                }
                synchronized (Http2Stream.this.connection) {
                    Http2Stream.this.connection.unacknowledgedBytesRead += read;
                    if (Http2Stream.this.connection.unacknowledgedBytesRead >= Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2) {
                        Http2Stream.this.connection.writeWindowUpdateLater(0, Http2Stream.this.connection.unacknowledgedBytesRead);
                        Http2Stream.this.connection.unacknowledgedBytesRead = 0L;
                    }
                }
                return read;
            }
        }

        private void waitUntilReadable() throws IOException {
            Http2Stream.this.readTimeout.enter();
            while (this.readBuffer.size() == 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                try {
                    Http2Stream.this.waitForIo();
                } finally {
                    Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                }
            }
        }

        void receive(BufferedSource in, long byteCount) throws IOException {
            boolean finished;
            boolean z;
            boolean flowControlError;
            if (Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            while (byteCount > 0) {
                synchronized (Http2Stream.this) {
                    finished = this.finished;
                    z = true;
                    flowControlError = this.readBuffer.size() + byteCount > this.maxByteCount;
                }
                if (flowControlError) {
                    in.skip(byteCount);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (finished) {
                    in.skip(byteCount);
                    return;
                } else {
                    long read = in.read(this.receiveBuffer, byteCount);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    long byteCount2 = byteCount - read;
                    synchronized (Http2Stream.this) {
                        if (this.readBuffer.size() != 0) {
                            z = false;
                        }
                        boolean wasEmpty = z;
                        this.readBuffer.writeAll(this.receiveBuffer);
                        if (wasEmpty) {
                            Http2Stream.this.notifyAll();
                        }
                    }
                    byteCount = byteCount2;
                }
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return Http2Stream.this.readTimeout;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Http2Stream.this) {
                this.closed = true;
                this.readBuffer.clear();
                Http2Stream.this.notifyAll();
            }
            Http2Stream.this.cancelStreamIfNecessary();
        }

        private void checkNotClosed() throws IOException {
            if (this.closed) {
                throw new IOException("stream closed");
            }
            if (Http2Stream.this.errorCode != null) {
                throw new StreamResetException(Http2Stream.this.errorCode);
            }
        }
    }

    void cancelStreamIfNecessary() throws IOException {
        boolean cancel;
        boolean open;
        if (Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            cancel = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            open = isOpen();
        }
        if (cancel) {
            close(ErrorCode.CANCEL);
        } else if (!open) {
            this.connection.removeStream(this.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class FramingSink implements Sink {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private static final long EMIT_BUFFER_SIZE = 16384;
        boolean closed;
        boolean finished;
        private final Buffer sendBuffer = new Buffer();

        FramingSink() {
        }

        @Override // okio.Sink
        public void write(Buffer source, long byteCount) throws IOException {
            if (Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            this.sendBuffer.write(source, byteCount);
            while (this.sendBuffer.size() >= 16384) {
                emitFrame(false);
            }
        }

        private void emitFrame(boolean outFinished) throws IOException {
            long toWrite;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    Http2Stream.this.waitForIo();
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                toWrite = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.size());
                Http2Stream.this.bytesLeftInWriteWindow -= toWrite;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.id, outFinished && toWrite == this.sendBuffer.size(), this.sendBuffer, toWrite);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            if (Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                if (!Http2Stream.this.sink.finished) {
                    if (this.sendBuffer.size() > 0) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else {
                        Http2Stream.this.connection.writeData(Http2Stream.this.id, true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                }
                Http2Stream.this.connection.flush();
                Http2Stream.this.cancelStreamIfNecessary();
            }
        }
    }

    /* loaded from: classes4.dex */
    final class a implements Sink {
        static final /* synthetic */ boolean c;
        boolean a;
        boolean b;
        private final Buffer e = new Buffer();

        static {
            c = !Http2Stream.class.desiredAssertionStatus();
        }

        a() {
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            if (!c && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            this.e.write(buffer, j);
            while (this.e.size() >= 16384) {
                a(false);
            }
        }

        private void a(boolean z) {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.g.enter();
                while (Http2Stream.this.b <= 0 && !this.b && !this.a && Http2Stream.this.h == null) {
                    Http2Stream.this.d();
                }
                Http2Stream.this.g.a();
                Http2Stream.this.c();
                min = Math.min(Http2Stream.this.b, this.e.size());
                Http2Stream.this.b -= min;
            }
            Http2Stream.this.g.enter();
            try {
                Http2Stream.this.d.writeData(Http2Stream.this.c, z && min == this.e.size(), this.e, min);
            } finally {
                Http2Stream.this.g.a();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            if (!c && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.c();
            }
            while (this.e.size() > 0) {
                a(false);
                Http2Stream.this.d.flush();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return Http2Stream.this.g;
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!c && Thread.holdsLock(Http2Stream.this)) {
                throw new AssertionError();
            }
            synchronized (Http2Stream.this) {
                if (!this.a) {
                    if (!Http2Stream.this.e.b) {
                        if (this.e.size() > 0) {
                            while (this.e.size() > 0) {
                                a(true);
                            }
                        } else {
                            Http2Stream.this.d.writeData(Http2Stream.this.c, true, null, 0L);
                        }
                    }
                    synchronized (Http2Stream.this) {
                        this.a = true;
                    }
                    Http2Stream.this.d.flush();
                    Http2Stream.this.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addBytesToWriteWindow(long delta) {
        this.bytesLeftInWriteWindow += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    void checkOutNotClosed() throws IOException {
        if (this.sink.closed) {
            throw new IOException("stream closed");
        }
        if (this.sink.finished) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException e) {
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class StreamTimeout extends AsyncTimeout {
        StreamTimeout() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }

        @Override // okio.AsyncTimeout
        protected IOException newTimeoutException(IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c extends AsyncTimeout {
        c() {
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }

        @Override // okio.AsyncTimeout
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public void a() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }
    }
}
