package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class zzfwc implements zzftj {
    private final zzfud<zzftj> zza;

    public zzfwc(zzfud<zzftj> zzfudVar) {
        this.zza = zzfudVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(bArr, bArr2));
    }
}
