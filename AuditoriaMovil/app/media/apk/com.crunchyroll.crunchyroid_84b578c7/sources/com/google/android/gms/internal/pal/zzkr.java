package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzkr {
    @Deprecated
    public static final zzkm zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzwb zzf = zzwb.zzf(bArr, zzacm.zza());
            for (zzwa zzwaVar : zzf.zzg()) {
                if (zzwaVar.zzc().zzc() == zzvn.UNKNOWN_KEYMATERIAL || zzwaVar.zzc().zzc() == zzvn.SYMMETRIC || zzwaVar.zzc().zzc() == zzvn.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzkm.zza(zzf);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
