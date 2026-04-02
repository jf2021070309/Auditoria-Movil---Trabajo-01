package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfxa implements zzfty {
    private final zzfud<zzfty> zza;
    private final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzfty
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzd() == 4) {
            return zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(zzgco.zza(bArr, this.zzb)));
        }
        return zzgco.zza(this.zza.zza().zzb(), this.zza.zza().zza().zza(bArr));
    }
}
