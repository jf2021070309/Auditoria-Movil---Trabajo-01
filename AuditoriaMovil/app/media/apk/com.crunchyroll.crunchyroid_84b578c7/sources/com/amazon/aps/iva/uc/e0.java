package com.amazon.aps.iva.uc;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;
/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class e0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer b;

    public e0(ByteBuffer byteBuffer) {
        this.b = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.b.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.b;
        if (j >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j);
        int min = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, min);
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
