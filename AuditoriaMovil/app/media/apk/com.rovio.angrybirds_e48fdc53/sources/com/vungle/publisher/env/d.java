package com.vungle.publisher.env;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.vungle.publisher.bw;
import com.vungle.publisher.env.AndroidDevice;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.pf;
import com.vungle.publisher.qg;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class d extends AndroidDevice.DeviceIdStrategy {
    @Inject
    protected Context c;
    @Inject
    protected qg d;
    @Inject
    protected bw e;

    @Override // com.vungle.publisher.env.AndroidDevice.DeviceIdStrategy
    protected void d(AndroidDevice androidDevice) {
        this.e.a(e.a(this, androidDevice), bw.b.deviceId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void f(AndroidDevice androidDevice) {
        boolean z = !a(androidDevice);
        if (b(androidDevice) && z) {
            this.d.a(new pf());
        }
    }

    protected boolean a(AndroidDevice androidDevice) {
        return androidDevice.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(AndroidDevice androidDevice) {
        boolean z;
        String str;
        try {
            if (w.a) {
                try {
                    ContentResolver contentResolver = this.c.getContentResolver();
                    z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1;
                    try {
                        str = Settings.Secure.getString(contentResolver, "advertising_id");
                    } catch (Settings.SettingNotFoundException e) {
                        e = e;
                        Logger.w(Logger.DEVICE_TAG, "Error getting Amazon advertising info", e);
                        str = null;
                        androidDevice.a(z);
                        if (str != null) {
                            androidDevice.a(str);
                        }
                        return androidDevice.b();
                    }
                } catch (Settings.SettingNotFoundException e2) {
                    e = e2;
                    z = false;
                }
            } else {
                if (androidDevice.m()) {
                    Logger.d(Logger.DEVICE_TAG, "fetching advertising ID and ad tracking preference");
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.c);
                    if (advertisingIdInfo != null) {
                        str = advertisingIdInfo.getId();
                        z = advertisingIdInfo.isLimitAdTrackingEnabled();
                        Logger.d(Logger.DEVICE_TAG, "advertising ID " + str + "; ad tracking enabled " + z);
                    }
                }
                z = false;
                str = null;
            }
            androidDevice.a(z);
            if (str != null && !z) {
                androidDevice.a(str);
            }
        } catch (Exception e3) {
            Logger.w(Logger.DEVICE_TAG, "error fetching advertising ID and ad tracking preference", e3);
        }
        try {
            return androidDevice.b();
        } catch (Exception e4) {
            Logger.w(Logger.DEVICE_TAG, "error verifying advertising ID", e4);
            return false;
        }
    }
}
