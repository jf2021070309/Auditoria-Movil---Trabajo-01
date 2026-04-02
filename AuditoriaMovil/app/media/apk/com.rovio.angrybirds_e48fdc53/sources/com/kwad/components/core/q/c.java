package com.kwad.components.core.q;

import java.io.InputStream;
/* loaded from: classes.dex */
public final class c extends InputStream {
    private InputStream QB;
    private int QC;
    private volatile float QE;
    private volatile long QF;
    private int Qy = -1;
    private int Qz = 10000;
    private long QA = -1;
    private long QD = -1;
    private int QG = 20480;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(InputStream inputStream, int i) {
        i = i < 20480 ? 20480 : i;
        this.QB = inputStream;
        this.QE = i / 1000.0f;
    }

    private static void A(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static long e(long j, long j2) {
        if (j <= 0) {
            return 0L;
        }
        if (j2 <= 0) {
            return -1L;
        }
        return j / j2;
    }

    private void pS() {
        this.Qy = 0;
        this.QA = System.currentTimeMillis();
    }

    private void pT() {
        if (this.Qy < this.Qz) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.QA;
        float f = this.Qy / this.QE;
        this.QF = e(this.QC, currentTimeMillis - this.QD);
        float f2 = (float) j;
        if (f > f2) {
            A(f - f2);
        }
        pS();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.QB.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.QB.close();
        b.a(this);
        this.QD = -1L;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.QB.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.QB.markSupported();
    }

    public final long pR() {
        return this.QF;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.QD <= 0) {
            this.QD = System.currentTimeMillis();
        }
        this.QC++;
        if (b.Qw && b.Qv) {
            if (this.Qy < 0) {
                pS();
            }
            int read = this.QB.read();
            this.Qy++;
            pT();
            return read;
        }
        return this.QB.read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.QB.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.QB.skip(j);
    }
}
