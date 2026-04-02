package com.google.android.gms.cast.framework;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public interface zzag extends IInterface {
    void zzb(int i) throws RemoteException;

    void zzc(String str, String str2) throws RemoteException;

    void zzd(String str, LaunchOptions launchOptions) throws RemoteException;

    void zze(String str) throws RemoteException;
}
