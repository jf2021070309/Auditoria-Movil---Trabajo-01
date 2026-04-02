package com.amazon.aps.iva.w5;

import android.net.Uri;
import java.io.IOException;
/* compiled from: PlaceholderDataSource.java */
/* loaded from: classes.dex */
public final class u implements f {
    public static final u a = new u();

    @Override // com.amazon.aps.iva.w5.f
    public final long b(i iVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.amazon.aps.iva.w5.f
    public final Uri getUri() {
        return null;
    }

    @Override // com.amazon.aps.iva.q5.o
    public final int l(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void close() {
    }

    @Override // com.amazon.aps.iva.w5.f
    public final void j(y yVar) {
    }
}
