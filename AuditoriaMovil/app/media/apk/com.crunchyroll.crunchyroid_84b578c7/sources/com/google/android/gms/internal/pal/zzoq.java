package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzoq {
    private final zzjt zza;
    private final zzjw zzb;

    public zzoq(zzjt zzjtVar) {
        this.zza = zzjtVar;
        this.zzb = null;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzjt zzjtVar = this.zza;
        if (zzjtVar != null) {
            return zzjtVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }

    public zzoq(zzjw zzjwVar) {
        this.zza = null;
        this.zzb = zzjwVar;
    }
}
