package com.ss.android.downloadlib.ge;

import android.os.Build;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import com.ss.android.socialbase.downloader.logger.Logger;
/* loaded from: classes3.dex */
public class o {
    public static void dr(final com.ss.android.downloadad.api.dr.ge geVar, final com.ss.android.downloadlib.guide.install.dr drVar) {
        boolean isAppForeground = AppStatusManager.getInstance().isAppForeground();
        if (!isAppForeground && Build.VERSION.SDK_INT >= 29) {
            yk.ge();
        }
        boolean isAppForeground2 = AppStatusManager.getInstance().isAppForeground();
        if (!isAppForeground && isAppForeground2 && geVar != null) {
            geVar.yk(true);
        }
        drVar.dr();
        Logger.d("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->isAppForegroundSecond:::" + isAppForeground2);
        if (!isAppForeground2) {
            AppStatusManager.getInstance().registerAppSwitchListener(new AppStatusManager.AppStatusChangeListener() { // from class: com.ss.android.downloadlib.ge.o.1
                @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
                public void onAppForeground() {
                    Logger.d("AppInstallOptimiseHelper", "AppInstallOptimiseHelper-->onAppForeground");
                    AppStatusManager.getInstance().unregisterAppSwitchListener(this);
                    if (!yk.ge(com.ss.android.downloadad.api.dr.ge.this)) {
                        com.ss.android.downloadad.api.dr.ge.this.cu(true);
                        com.ss.android.downloadlib.g.dr.dr().dr("install_delay_invoke", com.ss.android.downloadad.api.dr.ge.this);
                        drVar.dr();
                    }
                }

                @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
                public void onAppBackground() {
                }
            });
        }
    }
}
