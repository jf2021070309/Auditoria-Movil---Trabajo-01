package com.google.android.gms.cast;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzaj implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ CastRemoteDisplayLocalService zzb;

    public zzaj(CastRemoteDisplayLocalService castRemoteDisplayLocalService, boolean z) {
        this.zzb = castRemoteDisplayLocalService;
        this.zza = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzx(this.zza);
    }
}
