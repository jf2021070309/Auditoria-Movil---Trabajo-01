package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzim implements Runnable {
    final /* synthetic */ zzp zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkq zzc;
    final /* synthetic */ zzjk zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzim(zzjk zzjkVar, zzp zzpVar, boolean z, zzkq zzkqVar) {
        this.zzd = zzjkVar;
        this.zza = zzpVar;
        this.zzb = z;
        this.zzc = zzkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzed zzedVar;
        zzedVar = this.zzd.zzb;
        if (zzedVar == null) {
            this.zzd.zzs.zzau().zzb().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zzd.zzk(zzedVar, this.zzb ? null : this.zzc, this.zza);
        this.zzd.zzP();
    }
}
