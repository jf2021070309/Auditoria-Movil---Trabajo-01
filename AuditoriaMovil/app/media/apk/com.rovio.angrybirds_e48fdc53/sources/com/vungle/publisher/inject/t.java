package com.vungle.publisher.inject;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.vungle.publisher.env.AndroidDevice;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
@Module
/* loaded from: classes4.dex */
public class t {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Singleton
    public AndroidDevice.DeviceIdStrategy a(com.vungle.publisher.env.a aVar) {
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    public WifiManager a(Context context) {
        return (WifiManager) context.getSystemService("wifi");
    }
}
