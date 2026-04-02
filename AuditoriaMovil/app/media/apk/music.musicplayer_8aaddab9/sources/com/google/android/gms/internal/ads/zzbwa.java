package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
/* loaded from: classes.dex */
public final class zzbwa implements InitializationCompleteCallback {
    public final /* synthetic */ zzbrp zza;

    public zzbwa(zzbwf zzbwfVar, zzbrp zzbrpVar) {
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e2) {
            zzcgt.zzg("", e2);
        }
    }
}
