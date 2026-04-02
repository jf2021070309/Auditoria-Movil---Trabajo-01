package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzoo implements zzoc {
    private final zznx zza;

    public zzoo(zznx zznxVar) {
        this.zza = zznxVar;
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final zzod zza(byte[] bArr) throws GeneralSecurityException {
        byte[] zzb = zzyt.zzb();
        byte[] zza = zzyt.zza(zzb, bArr);
        byte[] zzc = zzyt.zzc(zzb);
        byte[] zzc2 = zzxo.zzc(zzc, bArr);
        byte[] zzd = zzol.zzd(zzol.zzb);
        zznx zznxVar = this.zza;
        return new zzod(zznxVar.zzb(null, zza, "eae_prk", zzc2, "shared_secret", zzd, zznxVar.zza()), zzc);
    }

    @Override // com.google.android.gms.internal.pal.zzoc
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzol.zzf)) {
            return zzol.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
