package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzkj implements Callable<String> {
    final /* synthetic */ zzp zza;
    final /* synthetic */ zzkn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkj(zzkn zzknVar, zzp zzpVar) {
        this.zzb = zzknVar;
        this.zza = zzpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        if (!this.zzb.zzt((String) Preconditions.checkNotNull(this.zza.zza)).zzh() || !zzaf.zzc(this.zza.zzv).zzh()) {
            this.zzb.zzau().zzk().zza("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.zzb.zzT(this.zza).zzd();
    }
}
