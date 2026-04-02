package com.google.android.gms.internal.cast;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
@TargetApi(19)
/* loaded from: classes3.dex */
public final class zzdj extends zzdi {
    final /* synthetic */ zzdl zza;
    private final zzdq zzb;

    public zzdj(zzdl zzdlVar, zzdq zzdqVar) {
        this.zza = zzdlVar;
        this.zzb = zzdqVar;
    }

    @Override // com.google.android.gms.internal.cast.zzdi, com.google.android.gms.internal.cast.zzds
    public final void zzb(int i, int i2, Surface surface) {
        Logger logger;
        int i3;
        VirtualDisplay virtualDisplay;
        VirtualDisplay virtualDisplay2;
        Logger logger2;
        VirtualDisplay virtualDisplay3;
        Logger logger3;
        Logger logger4;
        Logger logger5;
        logger = zzdn.zza;
        logger.d("onConnected", new Object[0]);
        DisplayManager displayManager = (DisplayManager) this.zzb.getContext().getSystemService("display");
        if (displayManager == null) {
            logger5 = zzdn.zza;
            logger5.e("Unable to get the display manager", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        zzdn.zzf(this.zza.zzc);
        if (i < i2) {
            i3 = i;
        } else {
            i3 = i2;
        }
        this.zza.zzc.zzc = displayManager.createVirtualDisplay("private_display", i, i2, (i3 * 320) / 1080, surface, 2);
        zzdn zzdnVar = this.zza.zzc;
        virtualDisplay = zzdnVar.zzc;
        if (virtualDisplay == null) {
            logger4 = zzdn.zza;
            logger4.e("Unable to create virtual display", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        virtualDisplay2 = zzdnVar.zzc;
        if (virtualDisplay2.getDisplay() == null) {
            logger3 = zzdn.zza;
            logger3.e("Virtual display does not have a display", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        try {
            zzdq zzdqVar = this.zzb;
            virtualDisplay3 = this.zza.zzc.zzc;
            ((zzdt) zzdqVar.getService()).zzf(this, virtualDisplay3.getDisplay().getDisplayId());
        } catch (RemoteException | IllegalStateException unused) {
            logger2 = zzdn.zza;
            logger2.e("Unable to provision the route's new virtual Display", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
        }
    }

    @Override // com.google.android.gms.internal.cast.zzdi, com.google.android.gms.internal.cast.zzds
    public final void zzc() {
        Logger logger;
        VirtualDisplay virtualDisplay;
        VirtualDisplay virtualDisplay2;
        Logger logger2;
        Logger logger3;
        logger = zzdn.zza;
        logger.d("onConnectedWithDisplay", new Object[0]);
        zzdn zzdnVar = this.zza.zzc;
        virtualDisplay = zzdnVar.zzc;
        if (virtualDisplay == null) {
            logger3 = zzdn.zza;
            logger3.e("There is no virtual display", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        virtualDisplay2 = zzdnVar.zzc;
        Display display = virtualDisplay2.getDisplay();
        if (display == null) {
            logger2 = zzdn.zza;
            logger2.e("Virtual display no longer has a display", new Object[0]);
            this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
            return;
        }
        this.zza.setResult((zzdl) new zzdm(display));
    }

    @Override // com.google.android.gms.internal.cast.zzdi, com.google.android.gms.internal.cast.zzds
    public final void zzd(int i) throws RemoteException {
        Logger logger;
        logger = zzdn.zza;
        logger.d("onError: %d", Integer.valueOf(i));
        zzdn.zzf(this.zza.zzc);
        this.zza.setResult((zzdl) new zzdm(Status.RESULT_INTERNAL_ERROR));
    }
}
