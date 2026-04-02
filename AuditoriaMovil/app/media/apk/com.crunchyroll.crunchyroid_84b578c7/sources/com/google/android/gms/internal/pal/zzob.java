package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzob implements zzjy {
    private static final byte[] zza = new byte[0];
    private final zzvj zzb;
    private final zzoc zzc;
    private final zzny zzd;
    private final zznx zze;

    private zzob(zzvj zzvjVar, zzoc zzocVar, zznx zznxVar, zzny zznyVar, byte[] bArr) {
        this.zzb = zzvjVar;
        this.zzc = zzocVar;
        this.zze = zznxVar;
        this.zzd = zznyVar;
    }

    public static zzob zzb(zzvj zzvjVar) throws GeneralSecurityException {
        if (!zzvjVar.zzh().zzs()) {
            zzvd zzc = zzvjVar.zzc();
            return new zzob(zzvjVar, zzof.zzb(zzc), zzof.zzc(zzc), zzof.zza(zzc), null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    @Override // com.google.android.gms.internal.pal.zzjy
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzvj zzvjVar = this.zzb;
        zzoc zzocVar = this.zzc;
        zznx zznxVar = this.zze;
        zzny zznyVar = this.zzd;
        zzod zza2 = zzocVar.zza(zzvjVar.zzh().zzt());
        zznz zzc = zznz.zzc(zza2.zza(), zza2.zzb(), zzocVar, zznxVar, zznyVar, bArr3);
        return zzxo.zzc(zzc.zza(), zzc.zzb(bArr, zza));
    }
}
