package c.i.d;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import java.util.Objects;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class a {
    public static final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1993b = new Object();

    /* renamed from: c.i.d.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0034a {
        public static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        public static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
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

    /* loaded from: classes.dex */
    public static class c {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i2) {
            return context.getDrawable(i2);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static int a(Context context, int i2) {
            return context.getColor(i2);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* loaded from: classes.dex */
    public static class e {
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

    /* loaded from: classes.dex */
    public static class f {
        public static ComponentName a(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int a(Context context, String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static int b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? d.a(context, i2) : context.getResources().getColor(i2);
    }

    public static Drawable c(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 21 ? c.b(context, i2) : context.getResources().getDrawable(i2);
    }
}
