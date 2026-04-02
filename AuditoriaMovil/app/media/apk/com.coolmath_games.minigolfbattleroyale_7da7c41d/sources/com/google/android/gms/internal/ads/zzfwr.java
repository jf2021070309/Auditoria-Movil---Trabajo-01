package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfwr {
    private final zzftg zza;
    private final zzftj zzb;

    public zzfwr(zzftg zzftgVar) {
        this.zza = zzftgVar;
        this.zzb = null;
    }

    public zzfwr(zzftj zzftjVar) {
        this.zza = null;
        this.zzb = zzftjVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzftg zzftgVar = this.zza;
        return zzftgVar != null ? zzftgVar.zza(bArr, bArr2) : this.zzb.zza(bArr, bArr2);
    }
}
