package com.fyber.inneractive.sdk.player.c.j.a;

import com.fyber.inneractive.sdk.player.c.j.a.a;
import com.fyber.inneractive.sdk.player.c.k.o;
import com.fyber.inneractive.sdk.player.c.k.t;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b implements com.fyber.inneractive.sdk.player.c.j.f {
    private final com.fyber.inneractive.sdk.player.c.j.a.a a;
    private final long b;
    private final int c;
    private com.fyber.inneractive.sdk.player.c.j.i d;
    private File e;
    private OutputStream f;
    private FileOutputStream g;
    private long h;
    private long i;
    private o j;

    /* loaded from: classes.dex */
    public static class a extends a.C0064a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.fyber.inneractive.sdk.player.c.j.a.a aVar, long j, int i) {
        this.a = (com.fyber.inneractive.sdk.player.c.j.a.a) com.fyber.inneractive.sdk.player.c.k.a.a(aVar);
        this.b = j;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.f
    public final void a(com.fyber.inneractive.sdk.player.c.j.i iVar) throws a {
        if (iVar.e == -1 && !iVar.a(2)) {
            this.d = null;
            return;
        }
        this.d = iVar;
        this.i = 0L;
        try {
            b();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.f
    public final void a(byte[] bArr, int i, int i2) throws a {
        if (this.d == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.b) {
                    c();
                    b();
                }
                int min = (int) Math.min(i2 - i3, this.b - this.h);
                this.f.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.c.j.f
    public final void a() throws a {
        if (this.d == null) {
            return;
        }
        try {
            c();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    private void b() throws IOException {
        this.e = this.a.a(this.d.f, this.i + this.d.c, this.d.e == -1 ? this.b : Math.min(this.d.e - this.i, this.b));
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        this.g = fileOutputStream;
        if (this.c > 0) {
            o oVar = this.j;
            if (oVar == null) {
                this.j = new o(this.g, this.c);
            } else {
                oVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }

    private void c() throws IOException {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.g.getFD().sync();
            t.a(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            this.a.a(file);
        } catch (Throwable th) {
            t.a(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }
}
