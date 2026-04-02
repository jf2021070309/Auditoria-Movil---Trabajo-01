package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzqo {
    public static final /* synthetic */ int zza = 0;
    private static final zzyv zzb;
    private static final zzpp zzc;
    private static final zzpm zzd;
    private static final zzox zze;
    private static final zzou zzf;

    static {
        zzyv zza2 = zzqd.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzpp.zzc(zzqk.zza, zzqj.class, zzpt.class);
        zzd = zzpm.zzc(zzql.zza, zza2, zzpt.class);
        zze = zzox.zzc(zzqm.zza, zzqe.class, zzps.class);
        zzf = zzou.zzb(new zzos() { // from class: com.google.android.gms.internal.pal.zzqn
            @Override // com.google.android.gms.internal.pal.zzos
            public final zzka zza(zzpu zzpuVar, zzlg zzlgVar) {
                zzqi zzqiVar;
                int i = zzqo.zza;
                if (((zzps) zzpuVar).zze().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zzrm zze2 = zzrm.zze(((zzps) zzpuVar).zzc(), zzacm.zza());
                        if (zze2.zza() == 0) {
                            zzrs zzf2 = zze2.zzf();
                            int zzg = ((zzps) zzpuVar).zzg();
                            int zza3 = zzf2.zza();
                            int i2 = zzg - 2;
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 == 4) {
                                            zzqiVar = zzqi.zzb;
                                        } else {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwu.zza(zzg));
                                        }
                                    } else {
                                        zzqiVar = zzqi.zzd;
                                    }
                                } else {
                                    zzqiVar = zzqi.zzc;
                                }
                            } else {
                                zzqiVar = zzqi.zza;
                            }
                            return zzqe.zzb(zzqj.zzb(zza3, zzqiVar), zzyw.zzb(zze2.zzg().zzt(), zzlgVar), ((zzps) zzpuVar).zzd());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzadi | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            }
        }, zza2, zzps.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzpj zzb2 = zzpj.zzb();
        zzb2.zzf(zzc);
        zzb2.zze(zzd);
        zzb2.zzd(zze);
        zzb2.zzc(zzf);
    }
}
