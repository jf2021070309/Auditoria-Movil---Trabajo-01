package okhttp3.internal.cache;

import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;
/* loaded from: classes4.dex */
class a extends ForwardingSink {
    private boolean a;

    public a(Sink sink) {
        super(sink);
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j) {
        if (this.a) {
            buffer.skip(j);
            return;
        }
        try {
            super.write(buffer, j);
        } catch (IOException e) {
            this.a = true;
            a(e);
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Flushable
    public void flush() {
        if (!this.a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.a = true;
                a(e);
            }
        }
    }

    @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.a) {
            try {
                super.close();
            } catch (IOException e) {
                this.a = true;
                a(e);
            }
        }
    }

    protected void a(IOException iOException) {
    }
}
