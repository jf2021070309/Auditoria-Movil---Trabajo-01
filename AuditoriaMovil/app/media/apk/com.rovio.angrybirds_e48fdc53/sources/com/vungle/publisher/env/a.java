package com.vungle.publisher.env;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class a extends d {
    @Inject
    Context a;
    @Inject
    WifiManager b;

    @Override // com.vungle.publisher.env.d
    protected boolean a(AndroidDevice androidDevice) {
        return androidDevice.i();
    }

    @Override // com.vungle.publisher.env.d
    protected boolean b(AndroidDevice androidDevice) {
        try {
            boolean b = super.b(androidDevice);
            if (b) {
                Logger.v(Logger.DEVICE_TAG, "have advertising ID - not fetching fallback device IDs");
            } else {
                Logger.d(Logger.DEVICE_TAG, "ensuring fallback device IDs");
                c(androidDevice);
                b = true;
            }
            return b;
        } catch (Exception e) {
            Logger.w(Logger.DEVICE_TAG, e);
            return androidDevice.i();
        }
    }

    protected void c(AndroidDevice androidDevice) {
        if (!androidDevice.f()) {
            String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
            Logger.d(Logger.DEVICE_TAG, "fetched android ID " + string);
            androidDevice.b(string);
            return;
        }
        Logger.v(Logger.DEVICE_TAG, "existing android ID " + androidDevice.d());
    }
}
