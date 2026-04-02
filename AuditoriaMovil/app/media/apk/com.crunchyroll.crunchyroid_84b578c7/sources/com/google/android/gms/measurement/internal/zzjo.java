package com.google.android.gms.measurement.internal;

import com.amazon.aps.iva.m80.a;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzjo implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjz zze;

    public zzjo(zzjz zzjzVar, boolean z, zzq zzqVar, boolean z2, zzau zzauVar, String str) {
        this.zze = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzej zzejVar;
        zzau zzauVar;
        zzjz zzjzVar = this.zze;
        zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            a.a(zzjzVar.zzt, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjz zzjzVar2 = this.zze;
        if (this.zzb) {
            zzauVar = null;
        } else {
            zzauVar = this.zzc;
        }
        zzjzVar2.zzD(zzejVar, zzauVar, this.zza);
        this.zze.zzQ();
    }
}
