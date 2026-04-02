package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzkm {
    private final zzwb zza;
    private final zzrb zzb = zzrb.zza;

    private zzkm(zzwb zzwbVar) {
        this.zza = zzwbVar;
    }

    public static final zzkm zza(zzwb zzwbVar) throws GeneralSecurityException {
        if (zzwbVar != null && zzwbVar.zza() > 0) {
            return new zzkm(zzwbVar);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final zzkm zzb(zzkn zzknVar) throws GeneralSecurityException, IOException {
        try {
            zzwb zzb = zzknVar.zzb();
            for (zzwa zzwaVar : zzb.zzg()) {
                if (zzwaVar.zzc().zzc() == zzvn.UNKNOWN_KEYMATERIAL || zzwaVar.zzc().zzc() == zzvn.SYMMETRIC || zzwaVar.zzc().zzc() == zzvn.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzwaVar.zzc().zzc().name(), zzwaVar.zzc().zzg()));
                }
            }
            return zza(zzb);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public final String toString() {
        return zzlh.zza(this.zza).toString();
    }

    public final Object zzc(Class cls) throws GeneralSecurityException {
        Class zze = zzlf.zze(cls);
        if (zze != null) {
            zzlh.zzb(this.zza);
            zzku zzkuVar = new zzku(zze, null);
            zzkuVar.zzc(this.zzb);
            for (zzwa zzwaVar : this.zza.zzg()) {
                if (zzwaVar.zzi() == 3) {
                    Object zzf = zzlf.zzf(zzwaVar.zzc(), zze);
                    if (zzwaVar.zza() == this.zza.zzc()) {
                        zzkuVar.zza(zzf, zzwaVar);
                    } else {
                        zzkuVar.zzb(zzf, zzwaVar);
                    }
                }
            }
            return zzlf.zzj(zzkuVar.zzd(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
