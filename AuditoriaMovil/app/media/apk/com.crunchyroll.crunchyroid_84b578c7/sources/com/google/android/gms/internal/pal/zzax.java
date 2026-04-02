package com.google.android.gms.internal.pal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzax extends zzbg {
    private final Context zza;

    public zzax(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, zzagc.zzb(2L));
        this.zza = context;
    }

    private final zzil zzf() {
        if (this.zza.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            try {
                ContentResolver contentResolver = this.zza.getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                boolean z = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z = false;
                }
                return zzil.zzf(new zzaz(string, "afai", z));
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return zzil.zze();
    }

    private final zzil zzg() {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zza);
            String id = advertisingIdInfo.getId();
            if (id == null) {
                id = "";
            }
            return zzil.zzf(new zzaz(id, "adid", advertisingIdInfo.isLimitAdTrackingEnabled()));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException unused) {
            return zzil.zze();
        }
    }

    @Override // com.google.android.gms.internal.pal.zzbg
    public final zzil zza() {
        zzil zzf = zzf();
        if (!zzf.zzd()) {
            return zzg();
        }
        return zzf;
    }
}
