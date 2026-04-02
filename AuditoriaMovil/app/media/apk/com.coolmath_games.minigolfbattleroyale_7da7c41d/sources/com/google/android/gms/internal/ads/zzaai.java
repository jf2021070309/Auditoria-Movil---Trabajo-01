package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzaai implements zzfjl {
    final /* synthetic */ zzfii zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaai(zzfii zzfiiVar) {
        this.zza = zzfiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zza(int i, long j) {
        this.zza.zzb(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfjl
    public final void zzb(int i, long j, String str) {
        this.zza.zzf(i, System.currentTimeMillis() - j, str);
    }
}
