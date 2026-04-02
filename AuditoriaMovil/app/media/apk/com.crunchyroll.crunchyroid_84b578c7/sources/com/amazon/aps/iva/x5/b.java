package com.amazon.aps.iva.x5;

import com.amazon.aps.iva.t5.g0;
import com.amazon.aps.iva.x5.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: CacheDataSink.java */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.w5.e {
    public final com.amazon.aps.iva.x5.a a;
    public final long b = 5242880;
    public final int c = 20480;
    public com.amazon.aps.iva.w5.i d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public p j;

    /* compiled from: CacheDataSink.java */
    /* loaded from: classes.dex */
    public static final class a extends a.C0842a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.amazon.aps.iva.x5.a aVar) {
        this.a = aVar;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            g0.g(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            this.a.i(file, this.h);
        } catch (Throwable th) {
            g0.g(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    @Override // com.amazon.aps.iva.w5.e
    public final void b(com.amazon.aps.iva.w5.i iVar) throws a {
        long j;
        boolean z;
        iVar.h.getClass();
        int i = (iVar.g > (-1L) ? 1 : (iVar.g == (-1L) ? 0 : -1));
        boolean z2 = true;
        int i2 = iVar.i;
        if (i == 0) {
            if ((i2 & 2) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.d = null;
                return;
            }
        }
        this.d = iVar;
        if ((i2 & 4) != 4) {
            z2 = false;
        }
        if (z2) {
            j = this.b;
        } else {
            j = Long.MAX_VALUE;
        }
        this.e = j;
        this.i = 0L;
        try {
            c(iVar);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public final void c(com.amazon.aps.iva.w5.i iVar) throws IOException {
        long j = iVar.g;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.i, this.e);
        }
        com.amazon.aps.iva.x5.a aVar = this.a;
        String str = iVar.h;
        int i = g0.a;
        this.f = aVar.g(iVar.f + this.i, j2, str);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        int i2 = this.c;
        if (i2 > 0) {
            p pVar = this.j;
            if (pVar == null) {
                this.j = new p(fileOutputStream, i2);
            } else {
                pVar.a(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // com.amazon.aps.iva.w5.e
    public final void close() throws a {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.amazon.aps.iva.w5.e
    public final void write(byte[] bArr, int i, int i2) throws a {
        com.amazon.aps.iva.w5.i iVar = this.d;
        if (iVar == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.e) {
                    a();
                    c(iVar);
                }
                int min = (int) Math.min(i2 - i3, this.e - this.h);
                OutputStream outputStream = this.g;
                int i4 = g0.a;
                outputStream.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }
}
