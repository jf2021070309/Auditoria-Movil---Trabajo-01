package com.amazon.aps.iva.lc;

import com.google.android.gms.cast.Cast;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {
    public final OutputStream b;
    public byte[] c;
    public final com.amazon.aps.iva.oc.b d;
    public int e;

    public c(FileOutputStream fileOutputStream, com.amazon.aps.iva.oc.b bVar) {
        this.b = fileOutputStream;
        this.d = bVar;
        this.c = (byte[]) bVar.c(byte[].class, Cast.MAX_MESSAGE_LENGTH);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.b;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.c;
            if (bArr != null) {
                this.d.put(bArr);
                this.c = null;
            }
        } catch (Throwable th) {
            outputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.e;
        OutputStream outputStream = this.b;
        if (i > 0) {
            outputStream.write(this.c, 0, i);
            this.e = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.c;
        int i2 = this.e;
        int i3 = i2 + 1;
        this.e = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.b.write(bArr, 0, i3);
        this.e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.e;
            OutputStream outputStream = this.b;
            if (i6 == 0 && i4 >= this.c.length) {
                outputStream.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.c.length - i6);
            System.arraycopy(bArr, i5, this.c, this.e, min);
            int i7 = this.e + min;
            this.e = i7;
            i3 += min;
            byte[] bArr2 = this.c;
            if (i7 == bArr2.length && i7 > 0) {
                outputStream.write(bArr2, 0, i7);
                this.e = 0;
                continue;
            }
        } while (i3 < i2);
    }
}
