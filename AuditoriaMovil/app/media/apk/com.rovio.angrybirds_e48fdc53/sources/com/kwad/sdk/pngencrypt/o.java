package com.kwad.sdk.pngencrypt;

import com.kwad.sdk.pngencrypt.chunk.w;
import java.io.Closeable;
import java.io.InputStream;
/* loaded from: classes3.dex */
public final class o implements Closeable {
    protected ErrorBehaviour aDK = ErrorBehaviour.STRICT;
    public final k aEK;
    public final boolean aFg;
    protected final c aFh;
    protected final a aFi;
    protected final w aFj;
    protected int aFk;
    private i<? extends Object> aFl;

    public o(InputStream inputStream, boolean z) {
        this.aFk = -1;
        a aVar = new a(inputStream);
        this.aFi = aVar;
        boolean z2 = true;
        aVar.bt(true);
        c GT = GT();
        this.aFh = GT;
        try {
            if (aVar.b(GT, 36) != 36) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Could not read first 36 bytes (PNG signature+IHDR chunk)"));
            }
            this.aEK = GT.Gt();
            if (GT.Gu() == null) {
                z2 = false;
            }
            this.aFg = z2;
            ap(5024024L);
            an(901001001L);
            ao(2024024L);
            this.aFj = new w(GT.aDQ);
            a(m.GM());
            this.aFk = -1;
        } catch (RuntimeException e) {
            this.aFi.close();
            this.aFh.close();
            throw e;
        }
    }

    private void GP() {
        while (this.aFh.aDP < 4) {
            if (this.aFi.a(this.aFh) <= 0) {
                com.kwad.sdk.core.e.c.printStackTrace(new PngjException("Premature ending reading first chunks"));
            }
        }
    }

    private void GS() {
        this.aFh.bv(false);
    }

    private static c GT() {
        return new c(false);
    }

    private void a(i<? extends Object> iVar) {
        this.aFl = iVar;
    }

    private void an(long j) {
        this.aFh.an(901001001L);
    }

    private void ao(long j) {
        this.aFh.ao(2024024L);
    }

    private void ap(long j) {
        this.aFh.ap(5024024L);
    }

    public final w GQ() {
        if (this.aFh.Gr()) {
            GP();
        }
        return this.aFj;
    }

    public final void GR() {
        GS();
        if (this.aFh.Gr()) {
            GP();
        }
        end();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.kwad.sdk.crash.utils.b.closeQuietly(this.aFh);
        com.kwad.sdk.crash.utils.b.closeQuietly(this.aFi);
    }

    public final void end() {
        try {
            if (this.aFh.Gr()) {
                GP();
            }
            if (this.aFh.Gs() != null && !this.aFh.Gs().isDone()) {
                this.aFh.Gs().Gz();
            }
            while (!this.aFh.isDone() && this.aFi.a(this.aFh) > 0) {
            }
        } finally {
            close();
        }
    }

    public final String toString() {
        return this.aEK.toString() + " interlaced=" + this.aFg;
    }
}
