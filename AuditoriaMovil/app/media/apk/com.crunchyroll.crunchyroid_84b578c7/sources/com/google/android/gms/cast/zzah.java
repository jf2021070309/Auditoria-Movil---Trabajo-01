package com.google.android.gms.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzah implements Runnable {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzah(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        z = this.zza.zzs;
        this.zza.zzv("onCreate after delay. The local service been started: " + z);
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.zza;
        z2 = castRemoteDisplayLocalService.zzs;
        if (!z2) {
            CastRemoteDisplayLocalService.zza.e("[Instance: %s] %s", castRemoteDisplayLocalService, "The local service has not been been started, stopping it");
            this.zza.stopSelf();
        }
    }
}
