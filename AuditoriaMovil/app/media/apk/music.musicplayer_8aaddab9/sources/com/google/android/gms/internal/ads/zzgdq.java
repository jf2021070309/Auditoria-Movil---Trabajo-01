package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public final class zzgdq implements zzfty {
    private final zzfxc zza;
    private final int zzb;

    public zzgdq(zzfxc zzfxcVar, int i2) throws GeneralSecurityException {
        this.zza = zzfxcVar;
        this.zzb = i2;
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzfxcVar.zza(new byte[0], i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfty
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
