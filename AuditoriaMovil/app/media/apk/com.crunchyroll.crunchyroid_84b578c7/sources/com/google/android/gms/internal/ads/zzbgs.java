package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzbgs extends zzbfv {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbgs(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbfw
    public final void zze(zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        AdListener adListener;
        if (zzbuVar != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbuVar.zzi() instanceof zzg) {
                    zzg zzgVar = (zzg) zzbuVar.zzi();
                    if (zzgVar != null) {
                        adListener = zzgVar.zzb();
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException e) {
                zzbzo.zzh("", e);
            }
            try {
                if (zzbuVar.zzj() instanceof zzauh) {
                    zzauh zzauhVar = (zzauh) zzbuVar.zzj();
                    if (zzauhVar != null) {
                        appEventListener = zzauhVar.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzbzo.zzh("", e2);
            }
            zzbzh.zza.post(new zzbgr(this, adManagerAdView, zzbuVar));
        }
    }
}
