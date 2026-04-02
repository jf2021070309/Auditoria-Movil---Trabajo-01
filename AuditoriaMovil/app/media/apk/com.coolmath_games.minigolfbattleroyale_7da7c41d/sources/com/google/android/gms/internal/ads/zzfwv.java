package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfwv extends zzftt<zzfty, zzgai> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfwv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final /* bridge */ /* synthetic */ zzfty zzb(zzgai zzgaiVar) throws GeneralSecurityException {
        zzgai zzgaiVar2 = zzgaiVar;
        int zzg = zzgaiVar2.zzc().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgaiVar2.zzd().zzz(), "HMAC");
        int zza = zzgaiVar2.zzc().zza();
        int i = zzg - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
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
