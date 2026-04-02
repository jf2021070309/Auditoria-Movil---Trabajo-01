package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbvd;
import com.google.android.gms.internal.ads.zzcgt;
@KeepForSdk
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            zzber.zzb().zzr(this, new zzbvd()).zze(intent);
        } catch (RemoteException e2) {
            zzcgt.zzf("RemoteException calling handleNotificationIntent: ".concat(e2.toString()));
        }
    }
}
