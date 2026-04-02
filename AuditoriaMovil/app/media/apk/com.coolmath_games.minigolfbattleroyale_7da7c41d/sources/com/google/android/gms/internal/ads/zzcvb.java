package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcvb extends zzaxv {
    private final zzcva zza;
    private final zzbfn zzb;
    private final zzevv zzc;
    private boolean zzd = false;

    public zzcvb(zzcva zzcvaVar, zzbfn zzbfnVar, zzevv zzevvVar) {
        this.zza = zzcvaVar;
        this.zzb = zzbfnVar;
        this.zzc = zzevvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final zzbfn zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzf(IObjectWrapper iObjectWrapper, zzayd zzaydVar) {
        try {
            this.zzc.zzi(zzaydVar);
            this.zza.zzb((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzaydVar, this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final zzbgz zzg() {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfb)).booleanValue()) {
            return this.zza.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzh(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzi(zzbgw zzbgwVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzevv zzevvVar = this.zzc;
        if (zzevvVar != null) {
            zzevvVar.zzl(zzbgwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzj(zzaya zzayaVar) {
    }
}
