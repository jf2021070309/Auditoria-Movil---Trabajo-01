package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzayg implements zzaww {
    final /* synthetic */ zzayj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzayg(zzayj zzayjVar) {
        this.zza = zzayjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaww
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzayj.zzj(this.zza);
        }
    }
}
