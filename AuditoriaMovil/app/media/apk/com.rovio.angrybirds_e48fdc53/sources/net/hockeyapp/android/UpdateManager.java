package net.hockeyapp.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Date;
import net.hockeyapp.android.tasks.CheckUpdateTask;
import net.hockeyapp.android.tasks.CheckUpdateTaskWithUI;
import net.hockeyapp.android.utils.AsyncTaskUtils;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class UpdateManager {
    public static final String INSTALLER_ADB = "adb";
    public static final String INSTALLER_PACKAGE_INSTALLER_NOUGAT = "com.google.android.packageinstaller";
    public static final String INSTALLER_PACKAGE_INSTALLER_NOUGAT2 = "com.android.packageinstaller";
    private static CheckUpdateTask a = null;
    private static UpdateManagerListener b = null;

    public static void register(Activity activity) {
        register(activity, Util.getAppIdentifier(activity));
    }

    public static void register(Activity activity, UpdateManagerListener updateManagerListener) {
        register(activity, Util.getAppIdentifier(activity), updateManagerListener);
    }

    public static void register(Activity activity, String str) {
        register(activity, str, true);
    }

    public static void register(Activity activity, String str, boolean z) {
        register(activity, str, (UpdateManagerListener) null, z);
    }

    public static void register(Activity activity, String str, UpdateManagerListener updateManagerListener) {
        register(activity, Constants.BASE_URL, str, updateManagerListener, true);
    }

    public static void register(Activity activity, String str, UpdateManagerListener updateManagerListener, boolean z) {
        register(activity, Constants.BASE_URL, str, updateManagerListener, z);
    }

    public static void register(Activity activity, String str, String str2, UpdateManagerListener updateManagerListener) {
        register(activity, str, str2, updateManagerListener, true);
    }

    public static void register(Activity activity, String str, String str2, UpdateManagerListener updateManagerListener, boolean z) {
        String sanitizeAppIdentifier = Util.sanitizeAppIdentifier(str2);
        b = updateManagerListener;
        WeakReference weakReference = new WeakReference(activity);
        if ((Util.fragmentsSupported().booleanValue() && b(weakReference)) || a(weakReference, updateManagerListener)) {
            return;
        }
        if ((updateManagerListener != null && updateManagerListener.canUpdateInMarket()) || !installedFromMarket(weakReference)) {
            a(weakReference, str, sanitizeAppIdentifier, updateManagerListener, z);
        }
    }

    public static void registerForBackground(Context context, String str, UpdateManagerListener updateManagerListener) {
        registerForBackground(context, Constants.BASE_URL, str, updateManagerListener);
    }

    public static void registerForBackground(Context context, String str, String str2, UpdateManagerListener updateManagerListener) {
        String sanitizeAppIdentifier = Util.sanitizeAppIdentifier(str2);
        b = updateManagerListener;
        WeakReference weakReference = new WeakReference(context);
        if (a(updateManagerListener)) {
            return;
        }
        if ((updateManagerListener != null && updateManagerListener.canUpdateInMarket()) || !installedFromMarket(weakReference)) {
            a(weakReference, str, sanitizeAppIdentifier, updateManagerListener);
        }
    }

    public static void unregister() {
        if (a != null) {
            a.cancel(true);
            a.detach();
            a = null;
        }
        b = null;
    }

    private static boolean a(WeakReference<Activity> weakReference, UpdateManagerListener updateManagerListener) {
        boolean z = false;
        boolean a2 = a(updateManagerListener);
        if (a2) {
            z = updateManagerListener.onBuildExpired();
        }
        if (a2 && z) {
            a(weakReference);
        }
        return a2;
    }

    private static boolean a(UpdateManagerListener updateManagerListener) {
        Date expiryDate;
        return (updateManagerListener == null || (expiryDate = updateManagerListener.getExpiryDate()) == null || new Date().compareTo(expiryDate) <= 0) ? false : true;
    }

    protected static boolean installedFromMarket(WeakReference<? extends Context> weakReference) {
        Context context = weakReference.get();
        if (context != null) {
            try {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (!TextUtils.isEmpty(installerPackageName)) {
                    boolean z = true;
                    try {
                        if (Build.VERSION.SDK_INT >= 24 && (TextUtils.equals(installerPackageName, INSTALLER_PACKAGE_INSTALLER_NOUGAT) || TextUtils.equals(installerPackageName, INSTALLER_PACKAGE_INSTALLER_NOUGAT2))) {
                            z = false;
                        }
                        if (TextUtils.equals(installerPackageName, INSTALLER_ADB)) {
                            return false;
                        }
                        return z;
                    } catch (Throwable th) {
                        return z;
                    }
                }
            } catch (Throwable th2) {
                return false;
            }
        }
        return false;
    }

    private static void a(WeakReference<Activity> weakReference) {
        Activity activity;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            activity.finish();
            Intent intent = new Intent(activity, ExpiryInfoActivity.class);
            intent.addFlags(335544320);
            activity.startActivity(intent);
        }
    }

    private static void a(WeakReference<Activity> weakReference, String str, String str2, UpdateManagerListener updateManagerListener, boolean z) {
        if (a == null || a.getStatus() == AsyncTask.Status.FINISHED) {
            a = new CheckUpdateTaskWithUI(weakReference, str, str2, updateManagerListener, z);
            AsyncTaskUtils.execute(a);
            return;
        }
        a.attach(weakReference);
    }

    private static void a(WeakReference<Context> weakReference, String str, String str2, UpdateManagerListener updateManagerListener) {
        if (a == null || a.getStatus() == AsyncTask.Status.FINISHED) {
            a = new CheckUpdateTask(weakReference, str, str2, updateManagerListener);
            AsyncTaskUtils.execute(a);
            return;
        }
        a.attach(weakReference);
    }

    private static boolean b(WeakReference<Activity> weakReference) {
        Activity activity;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return false;
        }
        return activity.getFragmentManager().findFragmentByTag("hockey_update_dialog") != null;
    }

    public static UpdateManagerListener getLastListener() {
        return b;
    }
}
