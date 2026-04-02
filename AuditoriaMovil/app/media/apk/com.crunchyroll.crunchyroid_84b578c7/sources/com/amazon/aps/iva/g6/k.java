package com.amazon.aps.iva.g6;

import android.media.MediaDrmException;
import com.amazon.aps.iva.g6.b;
import com.amazon.aps.iva.g6.m;
import com.amazon.aps.iva.q5.r;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: DummyExoMediaDrm.java */
/* loaded from: classes.dex */
public final class k implements m {
    @Override // com.amazon.aps.iva.g6.m
    public final Map<String, String> a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final m.d b() {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void d(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void e(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final int f() {
        return 1;
    }

    @Override // com.amazon.aps.iva.g6.m
    public final com.amazon.aps.iva.z5.b h(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final byte[] k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final m.a l(byte[] bArr, List<r.b> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final boolean m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void release() {
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void i(b.a aVar) {
    }

    @Override // com.amazon.aps.iva.g6.m
    public final void j(byte[] bArr) {
    }
}
