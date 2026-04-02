package com.vungle.publisher;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.vungle.publisher.inject.Injector;
import com.vungle.publisher.log.Logger;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class sv implements sz {
    @Inject
    ConnectivityManager a;
    @Inject
    Provider<ta> b;
    @Inject
    TelephonyManager c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Inject
    public sv() {
        Injector.c().a(this);
    }

    public sy a() {
        sy syVar = null;
        try {
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                switch (type) {
                    case 0:
                        syVar = sy.MOBILE;
                        break;
                    case 1:
                    case 6:
                        syVar = sy.WIFI;
                        break;
                    default:
                        Logger.d(Logger.NETWORK_TAG, "unknown connectivity type: " + type);
                        break;
                }
            }
        } catch (Exception e) {
            Logger.d(Logger.NETWORK_TAG, "error getting connectivity type", e);
        }
        return syVar;
    }

    public boolean b() {
        return this.a != null && this.a.isActiveNetworkMetered();
    }
}
