package com.amazon.aps.iva.w5;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: StatsDataSource.java */
/* loaded from: classes.dex */
public final class w implements f {
    public final f a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;

    public w(f fVar) {
        fVar.getClass();
        this.a = fVar;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws IOException {
        this.c = iVar.a;
        this.d = Collections.emptyMap();
        long b = this.a.b(iVar);
        Uri uri = getUri();
        uri.getClass();
        this.c = uri;
        this.d = d();
        return b;
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() throws IOException {
        this.a.close();
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
        int l = this.a.l(bArr, i, i2);
        if (l != -1) {
            this.b += l;
        }
        return l;
    }
}
