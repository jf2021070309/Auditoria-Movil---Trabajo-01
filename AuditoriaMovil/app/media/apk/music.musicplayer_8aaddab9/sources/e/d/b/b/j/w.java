package e.d.b.b.j;

import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class w implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((k) this).f6273g.get().close();
    }
}
