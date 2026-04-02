package com.google.android.gms.cast.tv.cac;

import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.tv.media.UserActionRequestData;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.cast_tv.zzcb;
import com.google.android.gms.internal.cast_tv.zzdu;
import com.google.android.gms.internal.cast_tv.zzeq;
import com.google.android.gms.internal.cast_tv.zzfu;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzf extends com.google.android.gms.internal.cast_tv.zze {
    final /* synthetic */ zzg zza;

    public /* synthetic */ zzf(zzg zzgVar, zze zzeVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final List zzb() {
        return zzfu.zzg();
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final void zzc(final String str, final UserActionRequestData userActionRequestData, final zzeq zzeqVar) {
        zza zzaVar;
        zzaVar = this.zza.zzc;
        zzaVar.zza(str, userActionRequestData).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.cast.tv.cac.zzd
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                com.google.android.gms.internal.cast_tv.zzi zziVar;
                Logger logger;
                com.google.android.gms.internal.cast_tv.zzi zziVar2;
                Logger logger2;
                com.google.android.gms.internal.cast_tv.zzi zziVar3;
                zzf zzfVar = zzf.this;
                zzeq zzeqVar2 = zzeqVar;
                String str2 = str;
                UserActionRequestData userActionRequestData2 = userActionRequestData;
                zziVar = zzfVar.zza.zzb;
                Preconditions.checkNotNull(zziVar);
                Exception exception = task.getException();
                if (exception == null) {
                    zzdu.zzc(zzeqVar2, 2);
                    try {
                        zziVar3 = zzfVar.zza.zzb;
                        zziVar3.zzd(str2, userActionRequestData2.getRequestId());
                        return;
                    } catch (RemoteException e) {
                        logger2 = zzg.zza;
                        logger2.e("Failed to call sendSuccessResponse: ".concat(String.valueOf(e.getMessage())), new Object[0]);
                        return;
                    }
                }
                zzdu.zzc(zzeqVar2, 3);
                MediaError zza = zzg.zza(userActionRequestData2.getRequestId(), exception);
                try {
                    zziVar2 = zzfVar.zza.zzb;
                    zziVar2.zzc(str2, zza);
                } catch (RemoteException e2) {
                    logger = zzg.zza;
                    logger.e("Failed to call sendErrorResponse: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.cast_tv.zzf
    public final void zzd(String str, String str2) {
        zzcb zzcbVar;
        zzcbVar = this.zza.zzd;
        ((zzb) zzcbVar).zza.zzb(str, str2);
    }
}
