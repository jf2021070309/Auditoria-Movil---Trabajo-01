package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
final class zzbhr extends zzbrr {
    final /* synthetic */ zzbhs zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbhr(zzbhs zzbhsVar, zzbhp zzbhpVar) {
        this.zza = zzbhsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrs
    public final void zzb(List<zzbrl> list) throws RemoteException {
        zzbhs.zzb(this.zza, false);
        zzbhs.zzc(this.zza, true);
        InitializationStatus zzq = zzbhs.zzq(this.zza, list);
        ArrayList zza = zzbhs.zza(zzbhs.zze());
        int size = zza.size();
        for (int i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) zza.get(i)).onInitializationComplete(zzq);
        }
        zzbhs.zza(zzbhs.zze()).clear();
    }
}
