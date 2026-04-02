package com.google.android.gms.internal.cast_tv;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.MediaError;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public interface zzi extends IInterface {
    void zzb(String str, String str2, zzeq zzeqVar) throws RemoteException;

    void zzc(String str, MediaError mediaError) throws RemoteException;

    void zzd(String str, long j) throws RemoteException;
}
