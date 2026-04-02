package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class l {
    protected static Application a;
    static final Comparator<ResolveInfo> b = new Comparator<ResolveInfo>() { // from class: com.fyber.inneractive.sdk.util.l.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            ResolveInfo resolveInfo3 = resolveInfo;
            ResolveInfo resolveInfo4 = resolveInfo2;
            if (resolveInfo3.activityInfo == null || resolveInfo4.activityInfo == null || resolveInfo3.activityInfo.packageName == null) {
                return 1;
            }
            return resolveInfo3.activityInfo.packageName.compareTo(resolveInfo4.activityInfo.packageName);
        }
    };

    public static Application p() {
        return a;
    }

    public static void a(Application application) {
        a = application;
    }

    public static void q() {
        a.a();
    }

    public static int a(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) a.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return (int) ((i / displayMetrics.density) + 0.5f);
        }
        return i;
    }

    public static int b(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((i * displayMetrics.density) + 0.5f);
    }

    public static int s() {
        return a((Context) a);
    }

    public static boolean c(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean a(String... strArr) {
        for (int i = 0; i < 2; i++) {
            if (!c(strArr[i])) {
                return false;
            }
        }
        return true;
    }

    private static int a(Context context) {
        int i = (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) ? 1 : context.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        Object[] objArr = new Object[1];
        objArr[0] = i == 1 ? "portrait" : "landscape";
        IAlog.b("The device orientation: %s", objArr);
        return i;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void t() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.createInstance(a);
            CookieSyncManager.getInstance().startSync();
        }
    }

    public static void u() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().startSync();
        }
    }

    public static void v() {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.getInstance().stopSync();
        }
    }

    public static double a(Location location) {
        if (Build.VERSION.SDK_INT < 17) {
            long currentTimeMillis = System.currentTimeMillis();
            long time = location.getTime();
            if (time <= 0 || currentTimeMillis <= 0) {
                return 0.0d;
            }
            return (currentTimeMillis - time) / 1000.0d;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtimeNanos2 = location.getElapsedRealtimeNanos();
        if (elapsedRealtimeNanos <= 0 || elapsedRealtimeNanos2 <= 0) {
            return 0.0d;
        }
        return (elapsedRealtimeNanos - elapsedRealtimeNanos2) / 1.0E9d;
    }

    public static float b(Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return location.getVerticalAccuracyMeters();
        }
        return 0.0f;
    }

    public static void a(final WebView webView) {
        new Runnable() { // from class: com.fyber.inneractive.sdk.util.l.2
            @Override // java.lang.Runnable
            public final void run() {
                webView.getSettings().setDisplayZoomControls(false);
            }
        }.run();
    }

    public static Drawable c(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.getDrawable(i);
        }
        return a.getResources().getDrawable(i);
    }

    public static <P> void a(AsyncTask<P, ?, ?> asyncTask, P... pArr) {
        asyncTask.executeOnExecutor(m.a, pArr);
    }

    public static String e(String str) {
        return a.a(str);
    }

    public static void a(Throwable th, SharedPreferences sharedPreferences) {
        String b2 = q.b(th);
        if (b2.contains("com.fyber.inneractive")) {
            sharedPreferences.edit().putString("FyberExceptionKey", b2).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
        }
    }

    /* loaded from: classes.dex */
    private static class a {
        private static Map<String, String> a = new HashMap();

        static String a(String str) {
            String str2 = a.get(str);
            if (TextUtils.isEmpty(str2)) {
                IAlog.b("Assets cache: reading file: %s", str);
                try {
                    InputStream open = l.a.getAssets().open(str, 3);
                    StringBuffer stringBuffer = new StringBuffer();
                    byte[] bArr = new byte[4096];
                    for (int i = 0; i != -1; i = open.read(bArr)) {
                        stringBuffer.append(new String(bArr, 0, i));
                    }
                    open.close();
                    str2 = stringBuffer.toString();
                    IAlog.b("Assets cache: success - %s", str);
                } catch (IOException e) {
                    IAlog.b("Assets cache: Could not read response from file", new Object[0]);
                    IAlog.a(q.a(e), new Object[0]);
                }
                if (!TextUtils.isEmpty(str2)) {
                    a.put(str, str2);
                }
            } else {
                IAlog.b("Assets cache: returning cached assets for %s", str);
            }
            return str2;
        }

        static void a() {
            a.clear();
        }
    }

    public static String a(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            return String.join(str, collection);
        }
        return TextUtils.join(str, collection);
    }

    public static String b(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(String.valueOf(num));
        }
        return a(str, arrayList);
    }

    public static String a(String str, Context context) {
        FileInputStream fileInputStream;
        String str2 = null;
        try {
            fileInputStream = context.openFileInput(str);
        } catch (Throwable unused) {
            fileInputStream = null;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            if (fileInputStream.read(bArr) == available) {
                str2 = new String(bArr, "UTF-8");
            }
        } catch (Throwable unused2) {
            try {
                IAlog.b("readFileFromContext failed reading %s", str);
                return str2;
            } finally {
                q.b(fileInputStream);
            }
        }
        return str2;
    }

    public static boolean a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            return true;
        } catch (Throwable unused2) {
            try {
                IAlog.b("writeFileWithContext failed writing %s", str);
                return false;
            } finally {
                q.b(fileOutputStream);
            }
        }
    }

    public static String y() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void a(final com.fyber.inneractive.sdk.a.a aVar) {
        m.a(new Runnable() { // from class: com.fyber.inneractive.sdk.util.l.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (l.a == null || com.fyber.inneractive.sdk.a.a.this == null) {
                        return;
                    }
                    l.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().remove(com.fyber.inneractive.sdk.a.a.this.a()).apply();
                } catch (Throwable unused) {
                }
            }
        });
    }

    public static int a(float f) {
        return (int) (TypedValue.applyDimension(1, f, a.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int r() {
        return ((WindowManager) a.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static boolean d(String str) {
        return a.checkCallingOrSelfPermission(str) == 0;
    }

    public static int w() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        Application application = a;
        if (application == null || (windowManager = (WindowManager) application.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i == -1) {
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.heightPixels;
                }
            } catch (Throwable unused) {
            }
            if (i == -1) {
                return 480;
            }
            return i;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x() {
        /*
            r0 = -1
            android.app.Application r1 = com.fyber.inneractive.sdk.util.l.a     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L22
            android.app.Application r1 = com.fyber.inneractive.sdk.util.l.a     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L22
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L22
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L22
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            r1.getSize(r2)     // Catch: java.lang.Throwable -> L22
            int r1 = r2.x     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r1 = r0
        L23:
            if (r1 != r0) goto L35
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L31
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L31
            int r1 = r2.widthPixels     // Catch: java.lang.Throwable -> L31
        L31:
            if (r1 != r0) goto L35
            r1 = 320(0x140, float:4.48E-43)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.l.x():int");
    }
}
