package com.amazon.aps.iva.x5;

import java.nio.ByteBuffer;
/* compiled from: ContentMetadata.java */
/* loaded from: classes.dex */
public interface l {
    static long a(l lVar) {
        byte[] bArr = ((n) lVar).b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1L;
    }
}
