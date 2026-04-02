package com.google.android.gms.cast.tv.internal;

import android.content.Intent;
import android.os.IInterface;
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
public interface zzam extends IInterface {
    void broadcastReceiverContextStartedIntent(IObjectWrapper iObjectWrapper, zzey zzeyVar) throws RemoteException;

    com.google.android.gms.internal.cast_tv.zzi createReceiverCacChannelImpl(com.google.android.gms.internal.cast_tv.zzf zzfVar) throws RemoteException;

    com.google.android.gms.internal.cast_tv.zzr createReceiverMediaControlChannelImpl(IObjectWrapper iObjectWrapper, com.google.android.gms.internal.cast_tv.zzo zzoVar, CastReceiverOptions castReceiverOptions) throws RemoteException;

    void onWargInfoReceived() throws RemoteException;

    CastLaunchRequest parseCastLaunchRequest(zzes zzesVar) throws RemoteException;

    CastLaunchRequest parseCastLaunchRequestFromLaunchIntent(Intent intent) throws RemoteException;

    SenderInfo parseSenderInfo(zzfe zzfeVar) throws RemoteException;

    void setUmaEventSink(zzap zzapVar) throws RemoteException;
}
