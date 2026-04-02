package com.fyber.inneractive.sdk.player.c.j;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class p implements g {
    private final u<? super p> a;
    private RandomAccessFile b;
    private Uri c;
    private long d;
    private boolean e;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public p() {
        this(null);
    }

    public p(u<? super p> uVar) {
        this.a = uVar;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final long a(i iVar) throws a {
        try {
            this.c = iVar.a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(iVar.a.getPath(), "r");
            this.b = randomAccessFile;
            randomAccessFile.seek(iVar.d);
            long length = iVar.e == -1 ? this.b.length() - iVar.d : iVar.e;
            this.d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.e = true;
            u<? super p> uVar = this.a;
            if (uVar != null) {
                uVar.a();
            }
            return this.d;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.d -= read;
                u<? super p> uVar = this.a;
                if (uVar != null) {
                    uVar.a(read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final Uri a() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.g
    public final void b() throws a {
        this.c = null;
        try {
            try {
                if (this.b != null) {
                    this.b.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                u<? super p> uVar = this.a;
                if (uVar != null) {
                    uVar.b();
                }
            }
        }
    }
}
