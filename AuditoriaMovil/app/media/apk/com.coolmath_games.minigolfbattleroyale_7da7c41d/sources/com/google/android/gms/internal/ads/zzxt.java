package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzxt extends zzgkh {
    ByteBuffer zza;

    public zzxt(String str) {
        super(str);
    }

    @Override // com.google.android.gms.internal.ads.zzgkh
    public final void zzf(ByteBuffer byteBuffer) {
        this.zza = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
