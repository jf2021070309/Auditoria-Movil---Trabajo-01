package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class zzfwv extends zzftt<zzfty, zzgai> {
    public zzfwv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ zzfty zzb(zzgai zzgaiVar) throws GeneralSecurityException {
        zzgai zzgaiVar2 = zzgaiVar;
        int zzg = zzgaiVar2.zzc().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgaiVar2.zzd().zzz(), "HMAC");
        int zza = zzgaiVar2.zzc().zza();
        int i2 = zzg - 2;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return new zzgdq(new zzgdp("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgdq(new zzgdp("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgdq(new zzgdp("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgdq(new zzgdp("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgdq(new zzgdp("HMACSHA1", secretKeySpec), zza);
    }
}
