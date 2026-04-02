package com.google.android.gms.internal.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.aps.iva.f8.f0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes3.dex */
public final class zzat extends f0.a {
    private static final Logger zza = new Logger("MediaRouterCallback");
    private final zzao zzb;

    public zzat(zzao zzaoVar) {
        this.zzb = (zzao) Preconditions.checkNotNull(zzaoVar);
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteAdded(f0 f0Var, f0.h hVar) {
        try {
            this.zzb.zzf(hVar.c, hVar.r);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "onRouteAdded", "zzao");
        }
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteChanged(f0 f0Var, f0.h hVar) {
        try {
            this.zzb.zzg(hVar.c, hVar.r);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "onRouteChanged", "zzao");
        }
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteRemoved(f0 f0Var, f0.h hVar) {
        try {
            this.zzb.zzh(hVar.c, hVar.r);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "onRouteRemoved", "zzao");
        }
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteSelected(f0 f0Var, f0.h hVar, int i) {
        String str;
        CastDevice fromBundle;
        CastDevice fromBundle2;
        zza.i("onRouteSelected with reason = %d, routeId = %s", Integer.valueOf(i), hVar.c);
        if (hVar.k != 1) {
            return;
        }
        try {
            String str2 = hVar.c;
            if (str2 != null && str2.endsWith("-groupRoute") && (fromBundle = CastDevice.getFromBundle(hVar.r)) != null) {
                String deviceId = fromBundle.getDeviceId();
                f0Var.getClass();
                for (f0.h hVar2 : f0.f()) {
                    str = hVar2.c;
                    if (str != null && !str.endsWith("-groupRoute") && (fromBundle2 = CastDevice.getFromBundle(hVar2.r)) != null && TextUtils.equals(fromBundle2.getDeviceId(), deviceId)) {
                        zza.d("routeId is changed from %s to %s", str2, str);
                        break;
                    }
                }
            }
            str = str2;
            if (this.zzb.zze() >= 220400000) {
                this.zzb.zzj(str, str2, hVar.r);
            } else {
                this.zzb.zzi(str, hVar.r);
            }
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "onRouteSelected", "zzao");
        }
    }

    @Override // com.amazon.aps.iva.f8.f0.a
    public final void onRouteUnselected(f0 f0Var, f0.h hVar, int i) {
        Logger logger = zza;
        logger.i("onRouteUnselected with reason = %d, routeId = %s", Integer.valueOf(i), hVar.c);
        if (hVar.k != 1) {
            logger.d("skip route unselection for non-cast route", new Object[0]);
            return;
        }
        try {
            this.zzb.zzk(hVar.c, hVar.r, i);
        } catch (RemoteException e) {
            zza.d(e, "Unable to call %s on %s.", "onRouteUnselected", "zzao");
        }
    }
}
