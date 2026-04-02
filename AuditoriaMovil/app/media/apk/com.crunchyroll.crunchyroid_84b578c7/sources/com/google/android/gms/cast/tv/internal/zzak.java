package com.google.android.gms.cast.tv.internal;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.tv.CastLaunchRequest;
import com.google.android.gms.cast.tv.CastReceiverOptions;
import com.google.android.gms.cast.tv.SenderInfo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast_tv.zzes;
import com.google.android.gms.internal.cast_tv.zzey;
import com.google.android.gms.internal.cast_tv.zzfe;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzak extends com.google.android.gms.internal.cast_tv.zza implements zzam {
    public zzak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.tv.internal.ICastTvDynamiteModule");
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final void broadcastReceiverContextStartedIntent(IObjectWrapper iObjectWrapper, zzey zzeyVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzf(zza, iObjectWrapper);
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, zzeyVar);
        zzG(1, zza);
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final com.google.android.gms.internal.cast_tv.zzi createReceiverCacChannelImpl(com.google.android.gms.internal.cast_tv.zzf zzfVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzf(zza, zzfVar);
        Parcel zzF = zzF(3, zza);
        com.google.android.gms.internal.cast_tv.zzi zze = com.google.android.gms.internal.cast_tv.zzh.zze(zzF.readStrongBinder());
        zzF.recycle();
        return zze;
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final com.google.android.gms.internal.cast_tv.zzr createReceiverMediaControlChannelImpl(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.cast_tv.zzo zzoVar, CastReceiverOptions castReceiverOptions) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzf(zza, iObjectWrapper);
        com.google.android.gms.internal.cast_tv.zzc.zzf(zza, zzoVar);
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, castReceiverOptions);
        Parcel zzF = zzF(2, zza);
        com.google.android.gms.internal.cast_tv.zzr zzb = com.google.android.gms.internal.cast_tv.zzq.zzb(zzF.readStrongBinder());
        zzF.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final void onWargInfoReceived() throws RemoteException {
        zzG(8, zza());
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final CastLaunchRequest parseCastLaunchRequest(zzes zzesVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, zzesVar);
        Parcel zzF = zzF(5, zza);
        CastLaunchRequest castLaunchRequest = (CastLaunchRequest) com.google.android.gms.internal.cast_tv.zzc.zza(zzF, CastLaunchRequest.CREATOR);
        zzF.recycle();
        return castLaunchRequest;
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final CastLaunchRequest parseCastLaunchRequestFromLaunchIntent(Intent intent) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, intent);
        Parcel zzF = zzF(6, zza);
        CastLaunchRequest castLaunchRequest = (CastLaunchRequest) com.google.android.gms.internal.cast_tv.zzc.zza(zzF, CastLaunchRequest.CREATOR);
        zzF.recycle();
        return castLaunchRequest;
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final SenderInfo parseSenderInfo(zzfe zzfeVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzd(zza, zzfeVar);
        Parcel zzF = zzF(4, zza);
        SenderInfo senderInfo = (SenderInfo) com.google.android.gms.internal.cast_tv.zzc.zza(zzF, SenderInfo.CREATOR);
        zzF.recycle();
        return senderInfo;
    }

    @Override // com.google.android.gms.cast.tv.internal.zzam
    public final void setUmaEventSink(zzap zzapVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast_tv.zzc.zzf(zza, zzapVar);
        zzG(7, zza);
    }
}
