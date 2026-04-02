package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class zzxt extends zzgkh {
    public ByteBuffer zza;

    public zzxt(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }
}
