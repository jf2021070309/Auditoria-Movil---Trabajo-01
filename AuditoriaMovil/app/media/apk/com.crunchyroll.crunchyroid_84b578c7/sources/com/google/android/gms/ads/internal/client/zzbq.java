package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfj;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbfp;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbku;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public interface zzbq extends IInterface {
    zzbn zze() throws RemoteException;

    void zzf(zzbfj zzbfjVar) throws RemoteException;

    void zzg(zzbfm zzbfmVar) throws RemoteException;

    void zzh(String str, zzbfs zzbfsVar, zzbfp zzbfpVar) throws RemoteException;

    void zzi(zzbku zzbkuVar) throws RemoteException;

    void zzj(zzbfw zzbfwVar, zzq zzqVar) throws RemoteException;

    void zzk(zzbfz zzbfzVar) throws RemoteException;

    void zzl(zzbh zzbhVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzbkl zzbklVar) throws RemoteException;

    void zzo(zzbdz zzbdzVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcf zzcfVar) throws RemoteException;
}
