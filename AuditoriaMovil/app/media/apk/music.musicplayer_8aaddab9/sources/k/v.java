package k;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
/* loaded from: classes2.dex */
public interface v extends Closeable, Flushable {
    void E(d dVar, long j2) throws IOException;

    y c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
