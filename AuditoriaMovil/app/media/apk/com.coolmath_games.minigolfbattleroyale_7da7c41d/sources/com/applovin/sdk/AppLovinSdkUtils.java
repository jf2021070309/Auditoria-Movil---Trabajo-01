package com.applovin.sdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.f;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinSdkUtils {
    private static final Handler a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        private int a;
        private int b;

        private Size() {
        }

        public Size(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Size) {
                Size size = (Size) obj;
                return this.a == size.getWidth() && this.b == size.getHeight();
            }
            return false;
        }

        public int getHeight() {
            return this.b;
        }

        public int getWidth() {
            return this.a;
        }

        public int hashCode() {
            int i = this.b;
            int i2 = this.a;
            return i ^ ((i2 >>> 16) | (i2 << 16));
        }

        public String toString() {
            return this.a + "x" + this.b;
        }
    }

    public static int dpToPx(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str);
    }

    public static boolean isTablet(Context context) {
        Point a2 = f.a(context);
        return Math.min(a2.x, a2.y) >= dpToPx(context, IronSourceError.ERROR_BN_LOAD_AFTER_INIT_FAILED);
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i) {
        return (int) Math.ceil(i / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z, Runnable runnable) {
        if (z || !Utils.isMainThread()) {
            a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (Utils.isMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }
}
