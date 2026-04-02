package com.moat.analytics.mobile.vng;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.AsyncTask;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class s {
    private static String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {
        private boolean a = false;
        private String b = "_unknown_";
        private String c = "_unknown_";

        private void c() {
            try {
                Context c = s.c();
                if (c != null) {
                    PackageManager packageManager = c.getPackageManager();
                    this.c = c.getPackageName();
                    this.b = packageManager.getApplicationLabel(c.getApplicationInfo()).toString();
                    this.a = true;
                } else {
                    p.a(3, "Util", this, "Can't get app name, appContext is null.");
                }
            } catch (Exception e) {
                m.a(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String a() {
            if (this.a) {
                return this.b;
            }
            c();
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String b() {
            if (this.a) {
                return this.c;
            }
            c();
            return this.c;
        }
    }

    s() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double a() {
        try {
            return e() / ((AudioManager) com.moat.analytics.mobile.vng.a.a().getSystemService("audio")).getStreamMaxVolume(3);
        } catch (Exception e) {
            m.a(e);
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(final Context context) {
        try {
            AsyncTask.execute(new Runnable() { // from class: com.moat.analytics.mobile.vng.s.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                            p.a(3, "Util", this, "User has limited ad tracking");
                        } else {
                            String unused = s.a = advertisingIdInfo.getId();
                            p.a(3, "Util", this, "Retrieved Advertising ID = " + s.a);
                        }
                    } catch (Exception e) {
                        m.a(e);
                    }
                }
            });
        } catch (Exception e) {
            m.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context c() {
        return ((k) MoatAnalytics.getInstance()).e.get();
    }

    private static int e() {
        try {
            return ((AudioManager) com.moat.analytics.mobile.vng.a.a().getSystemService("audio")).getStreamVolume(3);
        } catch (Exception e) {
            m.a(e);
            return 0;
        }
    }
}
