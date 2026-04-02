package okio;

import java.io.IOException;
/* JADX WARN: Classes with same name are omitted:
  classes4.dex
 */
/* loaded from: classes3.dex */
public final class Pipe {
    final long maxBufferSize;
    boolean sinkClosed;
    boolean sourceClosed;
    final Buffer buffer = new Buffer();
    private final Sink sink = new PipeSink();
    private final Source source = new PipeSource();

    public Pipe(long maxBufferSize) {
        if (maxBufferSize < 1) {
            throw new IllegalArgumentException("maxBufferSize < 1: " + maxBufferSize);
        }
        this.maxBufferSize = maxBufferSize;
    }

    public Source source() {
        return this.source;
    }

    public Sink sink() {
        return this.sink;
    }

    /* loaded from: classes3.dex */
    final class PipeSink implements Sink {
        final Timeout timeout = new Timeout();

        PipeSink() {
        }

        @Override // okio.Sink
        public void write(Buffer source, long byteCount) throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException("closed");
                }
                while (byteCount > 0) {
                    if (Pipe.this.sourceClosed) {
                        throw new IOException("source is closed");
                    }
                    long bufferSpaceAvailable = Pipe.this.maxBufferSize - Pipe.this.buffer.size();
                    if (bufferSpaceAvailable == 0) {
                        this.timeout.waitUntilNotified(Pipe.this.buffer);
                    } else {
                        long bytesToWrite = Math.min(bufferSpaceAvailable, byteCount);
                        Pipe.this.buffer.write(source, bytesToWrite);
                        byteCount -= bytesToWrite;
                        Pipe.this.buffer.notifyAll();
                    }
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    throw new IllegalStateException("closed");
                }
                if (Pipe.this.sourceClosed && Pipe.this.buffer.size() > 0) {
                    throw new IOException("source is closed");
                }
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sinkClosed) {
                    return;
                }
                if (Pipe.this.sourceClosed && Pipe.this.buffer.size() > 0) {
                    throw new IOException("source is closed");
                }
                Pipe.this.sinkClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* loaded from: classes4.dex */
    final class a implements Sink {
        final Timeout a = new Timeout();

        a() {
        }

        @Override // okio.Sink
        public void write(Buffer buffer, long j) {
            synchronized (Pipe.this.b) {
                if (Pipe.this.c) {
                    throw new IllegalStateException("closed");
                }
                while (j > 0) {
                    if (Pipe.this.d) {
                        throw new IOException("source is closed");
                    }
                    long size = Pipe.this.a - Pipe.this.b.size();
                    if (size == 0) {
                        this.a.waitUntilNotified(Pipe.this.b);
                    } else {
                        long min = Math.min(size, j);
                        Pipe.this.b.write(buffer, min);
                        j -= min;
                        Pipe.this.b.notifyAll();
                    }
                }
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() {
            synchronized (Pipe.this.b) {
                if (Pipe.this.c) {
                    throw new IllegalStateException("closed");
                }
                while (Pipe.this.b.size() > 0) {
                    if (Pipe.this.d) {
                        throw new IOException("source is closed");
                    }
                    this.a.waitUntilNotified(Pipe.this.b);
                }
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Pipe.this.b) {
                if (!Pipe.this.c) {
                    flush();
                    Pipe.this.c = true;
                    Pipe.this.b.notifyAll();
                }
            }
        }

        @Override // okio.Sink
        public Timeout timeout() {
            return this.a;
        }
    }

    /* loaded from: classes3.dex */
    final class PipeSource implements Source {
        final Timeout timeout = new Timeout();

        PipeSource() {
        }

        @Override // okio.Source
        public long read(Buffer sink, long byteCount) throws IOException {
            synchronized (Pipe.this.buffer) {
                if (Pipe.this.sourceClosed) {
                    throw new IllegalStateException("closed");
                }
                while (Pipe.this.buffer.size() == 0) {
                    if (Pipe.this.sinkClosed) {
                        return -1L;
                    }
                    this.timeout.waitUntilNotified(Pipe.this.buffer);
                }
                long result = Pipe.this.buffer.read(sink, byteCount);
                Pipe.this.buffer.notifyAll();
                return result;
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (Pipe.this.buffer) {
                Pipe.this.sourceClosed = true;
                Pipe.this.buffer.notifyAll();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.timeout;
        }
    }

    /* loaded from: classes4.dex */
    final class b implements Source {
        final Timeout a = new Timeout();

        b() {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) {
            long read;
            synchronized (Pipe.this.b) {
                if (Pipe.this.d) {
                    throw new IllegalStateException("closed");
                }
                while (true) {
                    if (Pipe.this.b.size() == 0) {
                        if (Pipe.this.c) {
                            read = -1;
                            break;
                        }
                        this.a.waitUntilNotified(Pipe.this.b);
                    } else {
                        read = Pipe.this.b.read(buffer, j);
                        Pipe.this.b.notifyAll();
                        break;
                    }
                }
                return read;
            }
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            synchronized (Pipe.this.b) {
                Pipe.this.d = true;
                Pipe.this.b.notifyAll();
            }
        }

        @Override // okio.Source
        public Timeout timeout() {
            return this.a;
        }
    }
}
