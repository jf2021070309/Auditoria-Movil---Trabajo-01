package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public interface zzavm extends IInterface {
    zzbu zze() throws RemoteException;

    zzdn zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(zzdg zzdgVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzavt zzavtVar) throws RemoteException;
}
