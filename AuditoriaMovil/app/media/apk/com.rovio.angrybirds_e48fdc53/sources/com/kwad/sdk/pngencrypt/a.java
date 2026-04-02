package com.kwad.sdk.pngencrypt;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes3.dex */
public class a implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int aDq;
    private boolean aDr;
    private long aDs;
    private byte[] buf;
    private boolean eof;
    private int offset;
    private InputStream stream;

    public a(InputStream inputStream) {
        this(inputStream, 16384);
    }

    private a(InputStream inputStream, int i) {
        this.eof = false;
        this.aDr = true;
        this.aDs = 0L;
        this.stream = inputStream;
        this.buf = new byte[16384];
    }

    private void Gi() {
        if (this.aDq > 0 || this.eof) {
            return;
        }
        try {
            this.offset = 0;
            int read = this.stream.read(this.buf);
            this.aDq = read;
            if (read == 0) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen: stream.read(buf) returned 0"));
            } else if (read < 0) {
                close();
            } else {
                this.aDs += read;
            }
        } catch (IOException e) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException(e));
        }
    }

    private int a(f fVar, int i) {
        Gi();
        if (i <= 0 || i >= this.aDq) {
            i = this.aDq;
        }
        if (i <= 0) {
            if (!this.eof) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen"));
            }
            return fVar.isDone() ? -1 : 0;
        }
        int b = fVar.b(this.buf, this.offset, i);
        if (b > 0) {
            this.offset += b;
            int i2 = this.aDq - b;
            this.aDq = i2;
            if (i2 < 0) {
                throw new AssertionError();
            }
        }
        if (b > 0) {
            return b;
        }
        if (!fVar.isDone()) {
            com.kwad.sdk.core.e.c.printStackTrace(new PngjException("This should not happen!"));
        }
        return -1;
    }

    public final int a(f fVar) {
        return a(fVar, Integer.MAX_VALUE);
    }

    public final int b(f fVar, int i) {
        int i2 = 36;
        while (i2 > 0) {
            int a = a(fVar, i2);
            if (a <= 0) {
                return a;
            }
            i2 -= a;
        }
        if (i2 == 0) {
            return 36;
        }
        throw new AssertionError();
    }

    public final void bt(boolean z) {
        this.aDr = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.eof = true;
        this.buf = null;
        this.aDq = 0;
        this.offset = 0;
        InputStream inputStream = this.stream;
        if (inputStream != null && this.aDr) {
            com.kwad.sdk.crash.utils.b.closeQuietly(inputStream);
        }
        this.stream = null;
    }
}
