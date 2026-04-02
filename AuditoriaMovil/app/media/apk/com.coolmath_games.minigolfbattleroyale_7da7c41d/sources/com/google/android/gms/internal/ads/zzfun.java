package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfun {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzgbh zza(zzgbc zzgbcVar) {
        zzgbe zza2 = zzgbh.zza();
        zza2.zza(zzgbcVar.zza());
        for (zzgbb zzgbbVar : zzgbcVar.zzc()) {
            zzgbf zza3 = zzgbg.zza();
            zza3.zza(zzgbbVar.zzc().zza());
            zza3.zzc(zzgbbVar.zzf());
            zza3.zzd(zzgbbVar.zzg());
            zza3.zzb(zzgbbVar.zzd());
            zza2.zzb(zza3.zzah());
        }
        return zza2.zzah();
    }

    public static void zzb(zzgbc zzgbcVar) throws GeneralSecurityException {
        int zza2 = zzgbcVar.zza();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgbb zzgbbVar : zzgbcVar.zzc()) {
            if (zzgbbVar.zzf() == 3) {
                if (zzgbbVar.zza()) {
                    if (zzgbbVar.zzg() != 2) {
                        if (zzgbbVar.zzf() != 2) {
                            if (zzgbbVar.zzd() == zza2) {
                                if (z) {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                                z = true;
                            }
                            z2 &= zzgbbVar.zzc().zzi() == 5;
                            i++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzgbbVar.zzd())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzgbbVar.zzd())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzgbbVar.zzd())));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
