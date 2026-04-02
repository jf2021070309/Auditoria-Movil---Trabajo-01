package com.google.android.gms.measurement.internal;

import com.amazon.aps.iva.m80.a;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzjp implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzac zzc;
    final /* synthetic */ zzac zzd;
    final /* synthetic */ zzjz zze;

    public zzjp(zzjz zzjzVar, boolean z, zzq zzqVar, boolean z2, zzac zzacVar, zzac zzacVar2) {
        this.zze = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzacVar;
        this.zzd = zzacVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzac zzacVar;
        zzjz zzjzVar = this.zze;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjz zzjzVar2 = this.zze;
        if (this.zzb) {
            zzacVar = null;
        } else {
            zzacVar = this.zzc;
        }
        zzjzVar2.zzD(zzejVar, zzacVar, this.zza);
        this.zze.zzQ();
    }
}
