package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzftz {
    @Deprecated
    public static final zzftv zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgbc zze = zzgbc.zze(bArr, zzgfm.zza());
            for (zzgbb zzgbbVar : zze.zzc()) {
                if (zzgbbVar.zzc().zzi() == 2 || zzgbbVar.zzc().zzi() == 3 || zzgbbVar.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzftv.zza(zze);
        } catch (zzggm unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
