package com.google.android.gms.cast;

import com.google.android.gms.cast.CastRemoteDisplayLocalService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
public final class zzan implements OnCompleteListener {
    final /* synthetic */ CastRemoteDisplayLocalService zza;

    public zzan(CastRemoteDisplayLocalService castRemoteDisplayLocalService) {
        this.zza = castRemoteDisplayLocalService;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        WeakReference weakReference;
        if (!task.isSuccessful()) {
            this.zza.zzv("Unable to stop the remote display, result unsuccessful");
            weakReference = this.zza.zzg;
            CastRemoteDisplayLocalService.Callbacks callbacks = (CastRemoteDisplayLocalService.Callbacks) weakReference.get();
            if (callbacks != null) {
                callbacks.onRemoteDisplaySessionError(new Status(CastStatusCodes.ERROR_STOPPING_SERVICE_FAILED));
            }
        } else {
            this.zza.zzv("remote display stopped");
        }
        this.zza.zzn = null;
    }
}
