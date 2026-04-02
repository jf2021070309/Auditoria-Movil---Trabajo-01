package com.google.android.gms.internal.cast_tv;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.tv.media.UserActionRequestData;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public interface zzf extends IInterface {
    List zzb() throws RemoteException;

    void zzc(String str, UserActionRequestData userActionRequestData, zzeq zzeqVar) throws RemoteException;

    void zzd(String str, String str2) throws RemoteException;
}
