package e.c.a.m.u.c;

import android.media.MediaDataSource;
import e.c.a.m.u.c.b0;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class c0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer a;

    public c0(b0.d dVar, ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
        return this.a.limit();
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j2, byte[] bArr, int i2, int i3) {
        if (j2 >= this.a.limit()) {
            return -1;
        }
        this.a.position((int) j2);
        int min = Math.min(i3, this.a.remaining());
        this.a.get(bArr, i2, min);
        return min;
    }
}
