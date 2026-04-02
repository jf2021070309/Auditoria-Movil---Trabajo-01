package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.4.0 */
/* loaded from: classes2.dex */
public interface zzay extends IInterface {
    int zze() throws RemoteException;

    IObjectWrapper zzf() throws RemoteException;

    IObjectWrapper zzg() throws RemoteException;

    void zzh(zzao zzaoVar) throws RemoteException;

    void zzi(zzba zzbaVar) throws RemoteException;

    void zzj(boolean z, boolean z2) throws RemoteException;

    void zzk(zzao zzaoVar) throws RemoteException;

    void zzl(zzba zzbaVar) throws RemoteException;

    void zzm(Bundle bundle) throws RemoteException;
}
