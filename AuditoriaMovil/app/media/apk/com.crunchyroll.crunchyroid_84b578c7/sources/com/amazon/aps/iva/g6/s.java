package com.amazon.aps.iva.g6;

import com.amazon.aps.iva.g6.m;
import java.util.UUID;
/* compiled from: LocalMediaDrmCallback.java */
/* loaded from: classes.dex */
public final class s implements t {
    public final byte[] a;

    public s(byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.amazon.aps.iva.g6.t
    public final byte[] a(UUID uuid, m.a aVar) {
        return this.a;
    }

    @Override // com.amazon.aps.iva.g6.t
    public final byte[] b(m.d dVar) {
        throw new UnsupportedOperationException();
    }
}
