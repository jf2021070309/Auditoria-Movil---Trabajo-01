package com.facebook.ads.internal.q.a;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public class d {
    public static <P, PR, R> AsyncTask<P, PR, R> a(Executor executor, AsyncTask<P, PR, R> asyncTask, P... pArr) {
        if (Build.VERSION.SDK_INT >= 11) {
            asyncTask.executeOnExecutor(executor, pArr);
        } else {
            asyncTask.execute(pArr);
        }
        return asyncTask;
    }

    public static void a() {
        try {
            Class.forName("android.os.AsyncTask");
        } catch (Throwable th) {
        }
    }

    public static void a(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            Log.d("FBAudienceNetworkLog", str + " (displayed for test ads only)");
        }
    }
}
