package com.google.android.gms.cast;

import com.amazon.aps.iva.f8.f0;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzag extends f0.a {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzag(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteUnselected(f0 f0Var, f0.h hVar) {
        CastDevice castDevice;
        CastDevice castDevice2;
        this.zza.zzv("onRouteUnselected");
        CastRemoteDisplayLocalService castRemoteDisplayLocalService = this.zza;
        castDevice = castRemoteDisplayLocalService.zzm;
        if (castDevice == null) {
            castRemoteDisplayLocalService.zzv("onRouteUnselected, no device was selected");
            return;
        }
        CastDevice fromBundle = CastDevice.getFromBundle(hVar.r);
        if (fromBundle != null) {
            CastRemoteDisplayLocalService castRemoteDisplayLocalService2 = this.zza;
            String deviceId = fromBundle.getDeviceId();
            castDevice2 = castRemoteDisplayLocalService2.zzm;
            if (deviceId.equals(castDevice2.getDeviceId())) {
                CastRemoteDisplayLocalService.stopService();
                return;
            }
        }
        this.zza.zzv("onRouteUnselected, device does not match");
    }
}
