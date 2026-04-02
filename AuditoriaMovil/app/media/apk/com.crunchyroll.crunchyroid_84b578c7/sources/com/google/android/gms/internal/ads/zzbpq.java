package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.dynamic.IObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public interface zzbpq extends IInterface {
    zzdq zze() throws RemoteException;

    zzbqe zzf() throws RemoteException;

    zzbqe zzg() throws RemoteException;

    void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, zzbpt zzbptVar) throws RemoteException;

    void zzi(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpb zzbpbVar, zzbnz zzbnzVar) throws RemoteException;

    void zzj(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException;

    void zzk(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, zzbnz zzbnzVar, zzq zzqVar) throws RemoteException;

    void zzl(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbph zzbphVar, zzbnz zzbnzVar) throws RemoteException;

    void zzm(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar) throws RemoteException;

    void zzn(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpk zzbpkVar, zzbnz zzbnzVar, zzbdz zzbdzVar) throws RemoteException;

    void zzo(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException;

    void zzp(String str, String str2, zzl zzlVar, IObjectWrapper iObjectWrapper, zzbpn zzbpnVar, zzbnz zzbnzVar) throws RemoteException;

    void zzq(String str) throws RemoteException;

    boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException;
}
