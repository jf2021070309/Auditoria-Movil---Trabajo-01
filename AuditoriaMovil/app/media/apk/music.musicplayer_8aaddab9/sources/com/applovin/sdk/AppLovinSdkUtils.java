package com.applovin.sdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class AppLovinSdkUtils {
    private static final Handler a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        private int a;

        /* renamed from: b  reason: collision with root package name */
        private int f4455b;

        private Size() {
        }

        public Size(int i2, int i3) {
            this.a = i2;
            this.f4455b = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Size) {
                Size size = (Size) obj;
                return this.a == size.getWidth() && this.f4455b == size.getHeight();
            }
            return false;
        }

        public int getHeight() {
            return this.f4455b;
        }

        public int getWidth() {
            return this.a;
        }

        public int hashCode() {
            int i2 = this.f4455b;
            int i3 = this.a;
            return i2 ^ ((i3 >>> 16) | (i3 << 16));
        }

        public String toString() {
            return this.a + "x" + this.f4455b;
        }
    }

    public static int dpToPx(Context context, int i2) {
        return (int) TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str);
    }

    public static boolean isTablet(Context context) {
        Point a2 = g.a(context);
        return Math.min(a2.x, a2.y) >= dpToPx(context, 600);
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i2) {
        return (int) Math.ceil(i2 / context.getResources().getDisplayMetrics().density);
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

    public static void runOnUiThreadDelayed(Runnable runnable, long j2) {
        runOnUiThreadDelayed(runnable, j2, a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j2, Handler handler) {
        if (j2 > 0) {
            handler.postDelayed(runnable, j2);
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
