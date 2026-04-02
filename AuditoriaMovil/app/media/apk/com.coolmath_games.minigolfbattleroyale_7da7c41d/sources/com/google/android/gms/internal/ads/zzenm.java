package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzenm implements zzery<zzerx<Bundle>> {
    private final Executor zza;
    private final zzcge zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenm(Executor executor, zzcge zzcgeVar) {
        this.zza = executor;
        this.zzb = zzcgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzerx<Bundle>> zza() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbN)).booleanValue()) {
            return zzfsd.zza(null);
        }
        return zzfsd.zzj(this.zzb.zzr(), zzenk.zza, this.zza);
    }
}
