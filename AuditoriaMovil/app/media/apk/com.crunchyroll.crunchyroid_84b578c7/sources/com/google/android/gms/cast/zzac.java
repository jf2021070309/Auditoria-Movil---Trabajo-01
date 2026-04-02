package com.google.android.gms.cast;

import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.os.RemoteException;
import android.view.Display;
import android.view.Surface;
import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzac extends zzaf {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.internal.cast.zzdo zzb;
    final /* synthetic */ CastRemoteDisplayClient zzc;
    final /* synthetic */ zzal zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(CastRemoteDisplayClient castRemoteDisplayClient, TaskCompletionSource taskCompletionSource, com.google.android.gms.internal.cast.zzdo zzdoVar, zzal zzalVar) {
        super(null);
        this.zzc = castRemoteDisplayClient;
        this.zza = taskCompletionSource;
        this.zzb = zzdoVar;
        this.zzd = zzalVar;
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zzb(int i, int i2, Surface surface) throws RemoteException {
        Logger logger;
        VirtualDisplay virtualDisplay;
        VirtualDisplay virtualDisplay2;
        Logger logger2;
        Logger logger3;
        Logger logger4;
        Logger logger5;
        logger = this.zzc.zzc;
        logger.d("onConnected", new Object[0]);
        DisplayManager displayManager = (DisplayManager) this.zzc.getApplicationContext().getSystemService("display");
        if (displayManager == null) {
            logger5 = this.zzc.zzc;
            logger5.e("Unable to get the display manager", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
            return;
        }
        CastRemoteDisplayClient.zzd(this.zzc);
        this.zzc.zzd = displayManager.createVirtualDisplay("private_display", i, i2, (Math.min(i, i2) * 320) / 1080, surface, 2);
        CastRemoteDisplayClient castRemoteDisplayClient = this.zzc;
        virtualDisplay = castRemoteDisplayClient.zzd;
        if (virtualDisplay == null) {
            logger4 = castRemoteDisplayClient.zzc;
            logger4.e("Unable to create virtual display", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
            return;
        }
        virtualDisplay2 = castRemoteDisplayClient.zzd;
        Display display = virtualDisplay2.getDisplay();
        if (display == null) {
            logger3 = this.zzc.zzc;
            logger3.e("Virtual display does not have a display", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
            return;
        }
        try {
            ((com.google.android.gms.internal.cast.zzdt) this.zzb.getService()).zzf(this, display.getDisplayId());
        } catch (RemoteException | IllegalStateException unused) {
            logger2 = this.zzc.zzc;
            logger2.e("Unable to provision the route's new virtual Display", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
        }
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zzc() {
        Logger logger;
        VirtualDisplay virtualDisplay;
        VirtualDisplay virtualDisplay2;
        Logger logger2;
        Logger logger3;
        logger = this.zzc.zzc;
        logger.d("onConnectedWithDisplay", new Object[0]);
        CastRemoteDisplayClient castRemoteDisplayClient = this.zzc;
        virtualDisplay = castRemoteDisplayClient.zzd;
        if (virtualDisplay == null) {
            logger3 = castRemoteDisplayClient.zzc;
            logger3.e("There is no virtual display", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
            return;
        }
        virtualDisplay2 = castRemoteDisplayClient.zzd;
        Display display = virtualDisplay2.getDisplay();
        if (display == null) {
            logger2 = this.zzc.zzc;
            logger2.e("Virtual display no longer has a display", new Object[0]);
            TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
            return;
        }
        TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, display, this.zza);
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zzd(int i) throws RemoteException {
        Logger logger;
        logger = this.zzc.zzc;
        logger.d("onError: %d", Integer.valueOf(i));
        CastRemoteDisplayClient.zzd(this.zzc);
        TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.zza);
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zze(boolean z) {
        Logger logger;
        WeakReference weakReference;
        logger = this.zzc.zzc;
        logger.d("onRemoteDisplayMuteStateChanged: %b", Boolean.valueOf(z));
        zzal zzalVar = this.zzd;
        if (zzalVar != null) {
            zzalVar.zza.zzv("onRemoteDisplayMuteStateChanged: " + z);
            weakReference = zzalVar.zza.zzg;
            CastRemoteDisplayLocalService.Callbacks callbacks = (CastRemoteDisplayLocalService.Callbacks) weakReference.get();
            if (callbacks != null) {
                callbacks.onRemoteDisplayMuteStateChanged(z);
            }
        }
    }
}
