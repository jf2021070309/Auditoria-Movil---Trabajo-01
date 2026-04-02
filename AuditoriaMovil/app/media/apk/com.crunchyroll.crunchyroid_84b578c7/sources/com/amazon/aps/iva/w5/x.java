package com.amazon.aps.iva.w5;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
/* compiled from: TeeDataSource.java */
/* loaded from: classes.dex */
public final class x implements f {
    public final f a;
    public final e b;
    public boolean c;
    public long d;

    public x(f fVar, com.amazon.aps.iva.x5.b bVar) {
        this.a = fVar;
        bVar.getClass();
        this.b = bVar;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws IOException {
        long b = this.a.b(iVar);
        this.d = b;
        if (b == 0) {
            return 0L;
        }
        if (iVar.g == -1 && b != -1) {
            iVar = iVar.b(0L, b);
        }
        this.c = true;
        this.b.b(iVar);
        return this.d;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws IOException {
        e eVar = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                eVar.close();
            }
        }
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Map<String, List<String>> d() {
        return this.a.d();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
        yVar.getClass();
        this.a.j(yVar);
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int l = this.a.l(bArr, i, i2);
        if (l > 0) {
            this.b.write(bArr, i, l);
            long j = this.d;
            if (j != -1) {
                this.d = j - l;
            }
        }
        return l;
    }
}
