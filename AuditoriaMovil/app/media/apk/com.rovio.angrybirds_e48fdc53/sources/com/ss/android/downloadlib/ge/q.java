package com.ss.android.downloadlib.ge;

import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
/* loaded from: classes3.dex */
public class q implements AppStatusManager.AppStatusChangeListener {
    private long dr;

    /* loaded from: classes3.dex */
    private static class dr {
        private static q dr = new q();
    }

    public static q dr() {
        return dr.dr;
    }

    private q() {
        this.dr = 0L;
        AppStatusManager.getInstance().registerAppSwitchListener(this);
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppForeground() {
        this.dr = System.currentTimeMillis();
    }

    @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
    public void onAppBackground() {
    }

    public void dr(final g gVar, final long j) {
        if (gVar == null) {
            return;
        }
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.ge.q.1
            @Override // java.lang.Runnable
            public void run() {
                if (!AppStatusManager.getInstance().isAppFocus() || System.currentTimeMillis() - q.this.dr <= j) {
                    gVar.dr(true);
                } else {
                    gVar.dr(false);
                }
            }
        }, j);
    }

    public void dr(g gVar) {
        dr(gVar, PushUIConfig.dismissTime);
    }

    public void ge(g gVar) {
        if (gVar == null) {
            return;
        }
        int i = 1200;
        int optInt = com.ss.android.downloadlib.addownload.wb.ll().optInt("check_an_result_delay", 1200);
        if (optInt > 0) {
            i = optInt;
        }
        dr(gVar, i);
    }
}
