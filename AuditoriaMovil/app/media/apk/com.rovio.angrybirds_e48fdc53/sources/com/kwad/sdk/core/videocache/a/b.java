package com.kwad.sdk.core.videocache.a;

import com.kuaishou.weapon.p0.t;
import com.kwad.sdk.core.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class b implements com.kwad.sdk.core.videocache.a {
    private final a awr;
    private RandomAccessFile axf;
    public File file;

    public b(File file, a aVar) {
        File file2;
        try {
            if (aVar == null) {
                throw new NullPointerException();
            }
            this.awr = aVar;
            d.u(file.getParentFile());
            boolean exists = file.exists();
            if (exists) {
                file2 = file;
            } else {
                File parentFile = file.getParentFile();
                file2 = new File(parentFile, file.getName() + ".download");
            }
            this.file = file2;
            this.axf = new RandomAccessFile(this.file, exists ? t.k : "rw");
        } catch (IOException e) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e);
        }
    }

    private static boolean t(File file) {
        return file.getName().endsWith(".download");
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized long DA() {
        try {
        } catch (IOException e) {
            throw new ProxyCacheException("Error reading length of file " + this.file, e);
        }
        return (int) this.axf.length();
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized int a(byte[] bArr, long j, int i) {
        try {
            this.axf.seek(j);
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i), Long.valueOf(j), Long.valueOf(DA()), Integer.valueOf(bArr.length)), e);
        }
        return this.axf.read(bArr, 0, i);
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized void close() {
        try {
            this.axf.close();
            this.awr.s(this.file);
        } catch (IOException e) {
            throw new ProxyCacheException("Error closing file " + this.file, e);
        }
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized void complete() {
        if (isCompleted()) {
            return;
        }
        close();
        File file = new File(this.file.getParentFile(), this.file.getName().substring(0, this.file.getName().length() - 9));
        if (!this.file.renameTo(file)) {
            throw new ProxyCacheException("Error renaming file " + this.file + " to " + file + " for completion!");
        }
        this.file = file;
        try {
            this.axf = new RandomAccessFile(this.file, t.k);
            this.awr.s(this.file);
        } catch (IOException e) {
            throw new ProxyCacheException("Error opening " + this.file + " as disc cache", e);
        }
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized void d(byte[] bArr, int i) {
        try {
            if (isCompleted()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.file + " is completed!");
            }
            this.axf.seek(DA());
            this.axf.write(bArr, 0, i);
        } catch (IOException e) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i), this.axf, 8192), e);
        }
    }

    @Override // com.kwad.sdk.core.videocache.a
    public final synchronized boolean isCompleted() {
        return !t(this.file);
    }
}
