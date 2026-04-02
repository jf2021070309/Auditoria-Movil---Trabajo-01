package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzgdw extends zzgcs {
    public zzgdw(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    final zzgcq zzb(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgdv(bArr, i);
    }
}
