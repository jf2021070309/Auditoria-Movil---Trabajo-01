package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
/* loaded from: classes.dex */
public final class zzefl extends zzbxa {
    public final /* synthetic */ zzefn zza;
    private final zzeef<zzbxn, zzefy> zzb;

    public /* synthetic */ zzefl(zzefn zzefnVar, zzeef zzeefVar, zzefm zzefmVar) {
        this.zza = zzefnVar;
        this.zzb = zzeefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzefn.zzc(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        this.zzb.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(String str) throws RemoteException {
        this.zzb.zzc.zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(zzbcz zzbczVar) throws RemoteException {
        this.zzb.zzc.zzx(zzbczVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzh(zzbvp zzbvpVar) throws RemoteException {
        zzefn.zzd(this.zza, zzbvpVar);
        this.zzb.zzc.zzj();
    }
}
