package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzqp extends zzpq {
    public zzqp(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.pal.zzpq
    public final /* bridge */ /* synthetic */ Object zza(zzaef zzaefVar) throws GeneralSecurityException {
        zzup zzupVar = (zzup) zzaefVar;
        int zzg = zzupVar.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzupVar.zzh().zzt(), "HMAC");
        int zza = zzupVar.zzg().zza();
        int i = zzg - 2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return new zzyo(new zzyn("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzyo(new zzyn("HMACSHA512", secretKeySpec), zza);
                }
                return new zzyo(new zzyn("HMACSHA256", secretKeySpec), zza);
            }
            return new zzyo(new zzyn("HMACSHA384", secretKeySpec), zza);
        }
        return new zzyo(new zzyn("HMACSHA1", secretKeySpec), zza);
    }
}
