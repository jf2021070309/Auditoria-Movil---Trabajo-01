package k;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes2.dex */
public interface x extends Closeable {
    long S(d dVar, long j2) throws IOException;

    y c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
