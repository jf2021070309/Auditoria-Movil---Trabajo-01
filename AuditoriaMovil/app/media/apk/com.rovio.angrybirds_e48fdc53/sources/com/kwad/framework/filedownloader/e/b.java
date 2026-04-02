package com.kwad.framework.filedownloader.e;

import com.kwad.framework.filedownloader.f.c;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class b implements com.kwad.framework.filedownloader.e.a {
    private final BufferedOutputStream aeP;
    private final RandomAccessFile aeQ;
    private final FileDescriptor fd;

    /* loaded from: classes.dex */
    public static class a implements c.e {
        @Override // com.kwad.framework.filedownloader.f.c.e
        public final com.kwad.framework.filedownloader.e.a c(File file) {
            return new b(file);
        }
    }

    b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.aeQ = randomAccessFile;
        this.fd = randomAccessFile.getFD();
        this.aeP = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    @Override // com.kwad.framework.filedownloader.e.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.aeP.close();
        this.aeQ.close();
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void seek(long j) {
        this.aeQ.seek(j);
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void setLength(long j) {
        this.aeQ.setLength(j);
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void vM() {
        this.aeP.flush();
        this.fd.sync();
    }

    @Override // com.kwad.framework.filedownloader.e.a
    public final void write(byte[] bArr, int i, int i2) {
        this.aeP.write(bArr, 0, i2);
    }
}
