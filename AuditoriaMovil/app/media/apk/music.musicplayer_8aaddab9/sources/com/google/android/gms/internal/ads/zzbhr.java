package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzbhr extends zzbrr {
    public final /* synthetic */ zzbhs zza;

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
        for (int i2 = 0; i2 < size; i2++) {
            ((OnInitializationCompleteListener) zza.get(i2)).onInitializationComplete(zzq);
        }
        zzbhs.zza(zzbhs.zze()).clear();
    }
}
