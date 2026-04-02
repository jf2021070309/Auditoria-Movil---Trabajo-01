package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbnq;
import com.google.android.gms.internal.ads.zzbzo;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            zzay.zza().zzm(this, new zzbnq()).zze(intent);
        } catch (RemoteException e) {
            zzbzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
