package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes2.dex */
final class zzad extends zzaf {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ CastRemoteDisplayClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(CastRemoteDisplayClient castRemoteDisplayClient, TaskCompletionSource taskCompletionSource) {
        super(null);
        this.zzb = castRemoteDisplayClient;
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zzd(int i) throws RemoteException {
        Logger logger;
        logger = this.zzb.zzc;
        logger.d("onError: %d", Integer.valueOf(i));
        CastRemoteDisplayClient.zzd(this.zzb);
        TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, this.zza);
    }

    @Override // com.google.android.gms.cast.zzaf, com.google.android.gms.internal.cast.zzds
    public final void zzf() throws RemoteException {
        Logger logger;
        logger = this.zzb.zzc;
        logger.d("onDisconnected", new Object[0]);
        CastRemoteDisplayClient.zzd(this.zzb);
        TaskUtil.setResultOrApiException(Status.RESULT_SUCCESS, this.zza);
    }
}
