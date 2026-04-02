package com.google.android.gms.internal.cast_tv;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.tv.media.StoreSessionResponseData;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public interface zzr extends IInterface {
    MediaStatus zze() throws RemoteException;

    MediaStatus zzf() throws RemoteException;

    void zzg(int i) throws RemoteException;

    void zzh(MediaLoadRequestData mediaLoadRequestData) throws RemoteException;

    void zzi(String str, MediaError mediaError) throws RemoteException;

    void zzj(com.google.android.gms.cast.tv.media.zzm zzmVar) throws RemoteException;

    void zzk(String str, String str2, zzeq zzeqVar) throws RemoteException;

    void zzl(String str, com.google.android.gms.cast.tv.media.zzo zzoVar) throws RemoteException;

    void zzm(String str, com.google.android.gms.cast.tv.media.zzr zzrVar) throws RemoteException;

    void zzn(String str, StoreSessionResponseData storeSessionResponseData) throws RemoteException;

    void zzo(MediaSession.Token token) throws RemoteException;

    boolean zzp(Intent intent) throws RemoteException;
}
