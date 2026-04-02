package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfjl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzh implements zzfjl {
    final /* synthetic */ zzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zza(int i, long j) {
        zzfii zzfiiVar;
        zzfiiVar = this.zza.zzi;
        zzfiiVar.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(int i, long j, String str) {
        zzfii zzfiiVar;
        zzfiiVar = this.zza.zzi;
        zzfiiVar.zzf(i, System.currentTimeMillis() - j, str);
    }
}
