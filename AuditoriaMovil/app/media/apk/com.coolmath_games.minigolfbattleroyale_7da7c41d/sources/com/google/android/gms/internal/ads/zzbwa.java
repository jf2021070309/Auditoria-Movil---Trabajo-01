package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbwa implements InitializationCompleteCallback {
    final /* synthetic */ zzbrp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwa(zzbwf zzbwfVar, zzbrp zzbrpVar) {
        this.zza = zzbrpVar;
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationFailed(String str) {
        try {
            this.zza.zzf(str);
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.InitializationCompleteCallback
    public final void onInitializationSucceeded() {
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            zzcgt.zzg("", e);
        }
    }
}
