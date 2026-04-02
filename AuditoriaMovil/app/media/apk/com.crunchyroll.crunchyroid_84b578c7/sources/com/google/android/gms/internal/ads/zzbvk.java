package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public interface zzbvk extends IInterface {
    Bundle zzb() throws RemoteException;

    zzdn zzc() throws RemoteException;

    zzbvh zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException;

    void zzg(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(zzdd zzddVar) throws RemoteException;

    void zzj(zzdg zzdgVar) throws RemoteException;

    void zzk(zzbvn zzbvnVar) throws RemoteException;

    void zzl(zzbvy zzbvyVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbvs zzbvsVar) throws RemoteException;
}
