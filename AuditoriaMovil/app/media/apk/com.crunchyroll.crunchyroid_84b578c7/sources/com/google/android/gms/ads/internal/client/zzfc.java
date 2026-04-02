package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvj;
import com.google.android.gms.internal.ads.zzbvn;
import com.google.android.gms.internal.ads.zzbvr;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbvy;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
public final class zzfc extends zzbvj {
    private static void zzr(final zzbvr zzbvrVar) {
        zzbzo.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        zzbzh.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfb
            @Override // java.lang.Runnable
            public final void run() {
                zzbvr zzbvrVar2 = zzbvr.this;
                if (zzbvrVar2 != null) {
                    try {
                        zzbvrVar2.zze(1);
                    } catch (RemoteException e) {
                        zzbzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final zzdn zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final zzbvh zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzf(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException {
        zzr(zzbvrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzg(zzl zzlVar, zzbvr zzbvrVar) throws RemoteException {
        zzr(zzbvrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzi(zzdd zzddVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzj(zzdg zzdgVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzk(zzbvn zzbvnVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzl(zzbvy zzbvyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzn(IObjectWrapper iObjectWrapper, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvk
    public final void zzp(zzbvs zzbvsVar) throws RemoteException {
    }
}
