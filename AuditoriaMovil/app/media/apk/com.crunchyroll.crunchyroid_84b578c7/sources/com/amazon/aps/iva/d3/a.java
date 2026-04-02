package com.amazon.aps.iva.d3;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.app.NotificationManagerCompat;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.f3.f;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
/* compiled from: ContextCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    /* compiled from: ContextCompat.java */
    /* renamed from: com.amazon.aps.iva.d3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0189a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static File[] a(Context context) {
            return context.getExternalCacheDirs();
        }

        public static File[] b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        public static File[] c(Context context) {
            return context.getObbDirs();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class f {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            if ((i & 4) != 0 && str == null) {
                return context.registerReceiver(broadcastReceiver, intentFilter, a.obtainAndCheckReceiverPermission(context), handler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class h {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class i {
        public static String a(Context context) {
            return context.getAttributionTag();
        }

        public static Display b(Context context) {
            try {
                return context.getDisplay();
            } catch (UnsupportedOperationException unused) {
                Objects.toString(context);
                return ((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0);
            }
        }
    }

    /* compiled from: ContextCompat.java */
    /* loaded from: classes.dex */
    public static class j {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i);
        }
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        return f.a(context);
    }

    private static File createFilesDir(File file) {
        synchronized (sSync) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                file.getPath();
            }
            return file;
        }
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return d.a(context);
    }

    public static int getColor(Context context, int i2) {
        return e.a(context, i2);
    }

    public static ColorStateList getColorStateList(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        f.c cVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        f.d dVar = new f.d(resources, theme);
        synchronized (com.amazon.aps.iva.f3.f.c) {
            SparseArray<f.c> sparseArray = com.amazon.aps.iva.f3.f.b.get(dVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (cVar = sparseArray.get(i2)) != null) {
                if (cVar.b.equals(resources.getConfiguration()) && ((theme == null && cVar.c == 0) || (theme != null && cVar.c == theme.hashCode()))) {
                    colorStateList2 = cVar.a;
                } else {
                    sparseArray.remove(i2);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = com.amazon.aps.iva.f3.f.a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i2, typedValue, true);
            int i3 = typedValue.type;
            if (!((i3 < 28 || i3 > 31) ? false : false)) {
                try {
                    colorStateList = com.amazon.aps.iva.f3.b.a(resources, resources.getXml(i2), theme);
                } catch (Exception unused) {
                }
            }
            if (colorStateList != null) {
                synchronized (com.amazon.aps.iva.f3.f.c) {
                    WeakHashMap<f.d, SparseArray<f.c>> weakHashMap = com.amazon.aps.iva.f3.f.b;
                    SparseArray<f.c> sparseArray2 = weakHashMap.get(dVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray<>();
                        weakHashMap.put(dVar, sparseArray2);
                    }
                    sparseArray2.append(i2, new f.c(colorStateList, dVar.a.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return f.b.b(resources, i2, theme);
        }
        return colorStateList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Context getContextForLanguage(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L20
            java.lang.String r0 = "locale"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L1d
            android.os.LocaleList r0 = com.amazon.aps.iva.c3.j.a(r0)
            com.amazon.aps.iva.k3.j r1 = new com.amazon.aps.iva.k3.j
            com.amazon.aps.iva.k3.l r2 = new com.amazon.aps.iva.k3.l
            r2.<init>(r0)
            r1.<init>(r2)
            goto L83
        L1d:
            com.amazon.aps.iva.k3.j r1 = com.amazon.aps.iva.k3.j.b
            goto L83
        L20:
            java.lang.Object r0 = com.amazon.aps.iva.c3.f.a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L7e java.lang.Throwable -> La4
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
        L38:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            r6 = 1
            if (r5 == r6) goto L61
            r6 = 3
            if (r5 != r6) goto L48
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            if (r7 <= r4) goto L61
        L48:
            if (r5 == r6) goto L38
            r6 = 4
            if (r5 != r6) goto L4e
            goto L38
        L4e:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
            if (r5 == 0) goto L38
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L6b
        L61:
            if (r2 == 0) goto L70
            goto L6d
        L64:
            r8 = move-exception
            if (r2 == 0) goto L6a
            r2.close()     // Catch: java.io.IOException -> L6a java.lang.Throwable -> La4
        L6a:
            throw r8     // Catch: java.lang.Throwable -> La4
        L6b:
            if (r2 == 0) goto L70
        L6d:
            r2.close()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> La4
        L70:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> La4
            if (r2 != 0) goto L77
            goto L7c
        L77:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> La4
        L7c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            goto L7f
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
        L7f:
            com.amazon.aps.iva.k3.j r1 = com.amazon.aps.iva.k3.j.a(r1)
        L83:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 32
            if (r0 > r2) goto La3
            boolean r0 = r1.b()
            if (r0 != 0) goto La3
            android.content.res.Configuration r0 = new android.content.res.Configuration
            android.content.res.Resources r2 = r8.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r0.<init>(r2)
            com.amazon.aps.iva.k3.g.b(r0, r1)
            android.content.Context r8 = com.amazon.aps.iva.d3.a.b.a(r8, r0)
        La3:
            return r8
        La4:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.d3.a.getContextForLanguage(android.content.Context):android.content.Context");
    }

    public static File getDataDir(Context context) {
        return f.b(context);
    }

    public static Display getDisplayOrDefault(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i.b(context);
        }
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static Drawable getDrawable(Context context, int i2) {
        return d.b(context, i2);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return c.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return c.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return h.a(context);
        }
        return new com.amazon.aps.iva.k3.h(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return d.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return c.c(context);
    }

    public static String getString(Context context, int i2) {
        return getContextForLanguage(context).getString(i2);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) e.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return e.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return f.c(context);
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (x.z(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(defpackage.e.e("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i2) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i2);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        C0189a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        g.b(context, intent);
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        int i3 = i2 & 1;
        if (i3 == 0 || (i2 & 4) == 0) {
            if (i3 != 0) {
                i2 |= 2;
            }
            int i4 = i2;
            int i5 = i4 & 2;
            if (i5 == 0 && (i4 & 4) == 0) {
                throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
            }
            if (i5 != 0 && (i4 & 4) != 0) {
                throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return j.a(context, broadcastReceiver, intentFilter, str, handler, i4);
            }
            return g.a(context, broadcastReceiver, intentFilter, str, handler, i4);
        }
        throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        C0189a.a(context, intentArr, bundle);
        return true;
    }
}
