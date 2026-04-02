package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzbon extends zzbnr {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbon(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbns
    public final void zze(zzbfn zzbfnVar, IObjectWrapper iObjectWrapper) {
        if (zzbfnVar == null || iObjectWrapper == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
        try {
            if (zzbfnVar.zzD() instanceof zzbdb) {
                zzbdb zzbdbVar = (zzbdb) zzbfnVar.zzD();
                adManagerAdView.setAdListener(zzbdbVar != null ? zzbdbVar.zzj() : null);
            }
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
        try {
            if (zzbfnVar.zzC() instanceof zzawr) {
                zzawr zzawrVar = (zzawr) zzbfnVar.zzC();
                adManagerAdView.setAppEventListener(zzawrVar != null ? zzawrVar.zzc() : null);
            }
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
        zzcgm.zza.post(new zzbom(this, adManagerAdView, zzbfnVar));
    }
}
