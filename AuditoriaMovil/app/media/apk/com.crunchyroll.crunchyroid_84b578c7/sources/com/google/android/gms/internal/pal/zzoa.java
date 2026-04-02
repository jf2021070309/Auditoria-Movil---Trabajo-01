package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzoa implements zzjx {
    private final zzoe zza;
    private final zzoc zzb;
    private final zzny zzc;
    private final zznx zzd;

    private zzoa(zzoe zzoeVar, zzoc zzocVar, zznx zznxVar, zzny zznyVar, int i, byte[] bArr) {
        this.zza = zzoeVar;
        this.zzb = zzocVar;
        this.zzd = zznxVar;
        this.zzc = zznyVar;
    }

    public static zzoa zza(zzvg zzvgVar) throws GeneralSecurityException {
        zzoe zza;
        if (zzvgVar.zzk()) {
            if (zzvgVar.zzf().zzl()) {
                if (!zzvgVar.zzg().zzs()) {
                    zzvd zzc = zzvgVar.zzf().zzc();
                    zzoc zzb = zzof.zzb(zzc);
                    zznx zzc2 = zzof.zzc(zzc);
                    zzny zza2 = zzof.zza(zzc);
                    int zzg = zzc.zzg();
                    int i = 1;
                    if (zzg - 2 == 1) {
                        int zzg2 = zzvgVar.zzf().zzc().zzg() - 2;
                        if (zzg2 != 1) {
                            if (zzg2 != 2 && zzg2 != 3 && zzg2 != 4) {
                                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                            }
                            byte[] zzt = zzvgVar.zzg().zzt();
                            byte[] zzt2 = zzvgVar.zzf().zzh().zzt();
                            int zzg3 = zzvgVar.zzf().zzc().zzg() - 2;
                            if (zzg3 != 2) {
                                if (zzg3 != 3) {
                                    if (zzg3 == 4) {
                                        i = 3;
                                    } else {
                                        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                    }
                                } else {
                                    i = 2;
                                }
                            }
                            zza = zzon.zza(zzt, zzt2, i);
                        } else {
                            zza = zzop.zza(zzvgVar.zzg().zzt());
                        }
                        return new zzoa(zza, zzb, zzc2, zza2, 32, null);
                    }
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzux.zza(zzg)));
                }
                throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
            }
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
    }
}
