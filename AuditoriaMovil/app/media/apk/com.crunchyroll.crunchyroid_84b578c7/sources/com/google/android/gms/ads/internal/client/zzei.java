package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzbkf;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes2.dex */
final class zzei extends zzbkf {
    final /* synthetic */ zzej zza;

    public /* synthetic */ zzei(zzej zzejVar, zzeh zzehVar) {
        this.zza = zzejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkg
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (zzej.zzg(this.zza)) {
            zzej.zzk(this.zza, false);
            zzej.zzj(this.zza, true);
            arrayList = new ArrayList(zzej.zzi(this.zza));
            zzej.zzi(this.zza).clear();
        }
        InitializationStatus zzd = zzej.zzd(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(zzd);
        }
    }
}
