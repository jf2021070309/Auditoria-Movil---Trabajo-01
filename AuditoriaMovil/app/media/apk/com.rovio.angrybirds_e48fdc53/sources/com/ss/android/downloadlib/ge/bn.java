package com.ss.android.downloadlib.ge;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.downloadlib.rb.yk;
import com.ss.android.socialbase.downloader.common.AppStatusManager;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class bn {
    private static Handler dr = new Handler(Looper.getMainLooper());

    public static void dr(final com.ss.android.downloadad.api.dr.ge geVar, final xu xuVar) {
        boolean isAppForeground = AppStatusManager.getInstance().isAppForeground();
        if (!isAppForeground && Build.VERSION.SDK_INT >= 29) {
            yk.ge();
        }
        boolean isAppForeground2 = AppStatusManager.getInstance().isAppForeground();
        boolean z = !isAppForeground && isAppForeground2;
        if (geVar != null) {
            geVar.yk(z);
        }
        xuVar.dr(z);
        if (geVar == null) {
            return;
        }
        ge(geVar, wb(geVar));
        if (isAppForeground2) {
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        AppStatusManager.getInstance().registerAppSwitchListener(new AppStatusManager.AppStatusChangeListener() { // from class: com.ss.android.downloadlib.ge.bn.1
            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppForeground() {
                AppStatusManager.getInstance().unregisterAppSwitchListener(this);
                com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.ge.bn.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        boolean o = yk.o(com.ss.android.downloadad.api.dr.ge.this.q());
                        long q = bn.q(com.ss.android.downloadad.api.dr.ge.this);
                        if (!o || q >= System.currentTimeMillis() - currentTimeMillis) {
                            if (System.currentTimeMillis() - currentTimeMillis > bn.xu(com.ss.android.downloadad.api.dr.ge.this)) {
                                com.ss.android.downloadlib.g.dr.dr().dr("deeplink_delay_timeout", com.ss.android.downloadad.api.dr.ge.this);
                                return;
                            }
                            com.ss.android.downloadad.api.dr.ge.this.yk(true);
                            com.ss.android.downloadlib.g.dr.dr().dr("deeplink_delay_invoke", com.ss.android.downloadad.api.dr.ge.this);
                            xuVar.dr(true);
                            bn.ge(com.ss.android.downloadad.api.dr.ge.this, bn.wb(com.ss.android.downloadad.api.dr.ge.this));
                        }
                    }
                });
            }

            @Override // com.ss.android.socialbase.downloader.common.AppStatusManager.AppStatusChangeListener
            public void onAppBackground() {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ge(final com.ss.android.downloadad.api.dr.ge geVar, final int i) {
        if (i <= 0) {
            return;
        }
        com.ss.android.downloadlib.g.dr().dr(new Runnable() { // from class: com.ss.android.downloadlib.ge.bn.2
            @Override // java.lang.Runnable
            public void run() {
                int i2 = 1;
                if (yk.o(com.ss.android.downloadad.api.dr.ge.this.q())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (!com.ss.android.downloadad.api.dr.ge.this.tk()) {
                            i2 = 2;
                        }
                        jSONObject.putOpt("deeplink_source", Integer.valueOf(i2));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    com.ss.android.downloadlib.g.dr.dr().dr("deeplink_success_2", jSONObject, com.ss.android.downloadad.api.dr.ge.this);
                    return;
                }
                bn.ge(com.ss.android.downloadad.api.dr.ge.this, i - 1);
            }
        }, ll(geVar) * 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long xu(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optLong("app_link_check_timeout", 300000L);
    }

    private static int ll(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_check_delay", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int wb(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_check_count", 10);
    }

    public static boolean dr(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_opt_switch") == 1;
    }

    public static boolean ge(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_opt_install_switch") == 1;
    }

    public static boolean o(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_opt_invoke_switch") == 1;
    }

    public static boolean g(com.ss.android.downloadad.api.dr.ge geVar) {
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_opt_dialog_switch") == 1;
    }

    public static long q(com.ss.android.downloadad.api.dr.ge geVar) {
        if (geVar == null) {
            return 3000L;
        }
        return com.ss.android.downloadlib.rb.q.dr(geVar).optInt("app_link_opt_back_time_limit", 3) * 1000;
    }
}
