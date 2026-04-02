package net.hockeyapp.android.utils;

import android.app.Activity;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.hockeyapp.android.R;
/* loaded from: classes4.dex */
public class Util {
    public static final String APP_IDENTIFIER_KEY = "net.hockeyapp.android.appIdentifier";
    public static final int APP_IDENTIFIER_LENGTH = 32;
    public static final String LOG_IDENTIFIER = "HockeyApp";
    public static final String PREFS_FEEDBACK_TOKEN = "net.hockeyapp.android.prefs_feedback_token";
    public static final String PREFS_KEY_FEEDBACK_TOKEN = "net.hockeyapp.android.prefs_key_feedback_token";
    public static final String PREFS_KEY_NAME_EMAIL_SUBJECT = "net.hockeyapp.android.prefs_key_name_email";
    public static final String PREFS_NAME_EMAIL_SUBJECT = "net.hockeyapp.android.prefs_name_email";
    public static final String APP_IDENTIFIER_PATTERN = "[0-9a-f]+";
    private static final Pattern a = Pattern.compile(APP_IDENTIFIER_PATTERN, 2);
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private static final ThreadLocal<DateFormat> c = new ThreadLocal<DateFormat>() { // from class: net.hockeyapp.android.utils.Util.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    };

    public static String encodeParam(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final boolean isValidEmail(String str) {
        return !TextUtils.isEmpty(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static Boolean fragmentsSupported() {
        try {
            return Boolean.valueOf(Build.VERSION.SDK_INT >= 11 && classExists("android.app.Fragment"));
        } catch (NoClassDefFoundError e) {
            return false;
        }
    }

    public static Boolean runsOnTablet(WeakReference<Activity> weakReference) {
        Activity activity;
        if (weakReference != null && (activity = weakReference.get()) != null) {
            Configuration configuration = activity.getResources().getConfiguration();
            return Boolean.valueOf((configuration.screenLayout & 15) == 3 || (configuration.screenLayout & 15) == 4);
        }
        return false;
    }

    public static String sanitizeAppIdentifier(String str) {
        if (str == null) {
            throw new IllegalArgumentException("App ID must not be null.");
        }
        String trim = str.trim();
        Matcher matcher = a.matcher(trim);
        if (trim.length() != 32) {
            throw new IllegalArgumentException("App ID length must be 32 characters.");
        }
        if (!matcher.matches()) {
            throw new IllegalArgumentException("App ID must match regex pattern /[0-9a-f]+/i");
        }
        return trim;
    }

    public static String getFormString(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            String encode = URLEncoder.encode(str, "UTF-8");
            arrayList.add(encode + "=" + URLEncoder.encode(map.get(str), "UTF-8"));
        }
        return TextUtils.join("&", arrayList);
    }

    public static boolean classExists(String str) {
        try {
            return Class.forName(str) != null;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean isNotificationBuilderSupported() {
        return Build.VERSION.SDK_INT >= 11 && classExists("android.app.Notification.Builder");
    }

    public static Notification createNotification(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        if (isNotificationBuilderSupported()) {
            return b(context, pendingIntent, str, str2, i);
        }
        return a(context, pendingIntent, str, str2, i);
    }

    private static Notification a(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        Notification notification = new Notification(i, "", System.currentTimeMillis());
        try {
            notification.getClass().getMethod("setLatestEventInfo", Context.class, CharSequence.class, CharSequence.class, PendingIntent.class).invoke(notification, context, str, str2, pendingIntent);
        } catch (Exception e) {
        }
        return notification;
    }

    private static Notification b(Context context, PendingIntent pendingIntent, String str, String str2, int i) {
        Notification.Builder smallIcon = new Notification.Builder(context).setContentTitle(str).setContentText(str2).setContentIntent(pendingIntent).setSmallIcon(i);
        return Build.VERSION.SDK_INT < 16 ? smallIcon.getNotification() : smallIcon.build();
    }

    public static void announceForAccessibility(View view, CharSequence charSequence) {
        int i;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (Build.VERSION.SDK_INT < 16) {
                i = 8;
            } else {
                i = 16384;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
            obtain.getText().add(charSequence);
            if (Build.VERSION.SDK_INT >= 14) {
                obtain.setSource(view);
            }
            obtain.setEnabled(view.isEnabled());
            obtain.setClassName(view.getClass().getName());
            obtain.setPackageName(view.getContext().getPackageName());
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    public static String getAppIdentifier(Context context) {
        String manifestString = getManifestString(context, APP_IDENTIFIER_KEY);
        if (TextUtils.isEmpty(manifestString)) {
            throw new IllegalArgumentException("HockeyApp app identifier was not configured correctly in manifest or build configuration.");
        }
        return manifestString;
    }

    public static String getAppSecret(Context context) {
        return getManifestString(context, "net.hockeyapp.android.appSecret");
    }

    public static String getManifestString(Context context, String str) {
        return a(context).getString(str);
    }

    private static Bundle a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isConnectedToNetwork(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Exception e) {
            HockeyLog.error("Exception thrown when check network is connected:");
            e.printStackTrace();
        }
        return false;
    }

    public static String getAppName(Context context) {
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
        }
        return applicationInfo != null ? (String) packageManager.getApplicationLabel(applicationInfo) : context.getString(R.string.hockeyapp_crash_dialog_app_name_fallback);
    }

    public static String getSdkVersionFromManifest(Context context) {
        return getManifestString(context, "net.hockeyapp.android.sdkVersion");
    }

    public static String convertAppIdentifierToGuid(String str) {
        try {
            String sanitizeAppIdentifier = sanitizeAppIdentifier(str);
            if (sanitizeAppIdentifier == null) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer(sanitizeAppIdentifier);
            stringBuffer.insert(20, '-');
            stringBuffer.insert(16, '-');
            stringBuffer.insert(12, '-');
            stringBuffer.insert(8, '-');
            return stringBuffer.toString();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static boolean isEmulator() {
        return Build.BRAND.equalsIgnoreCase(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE);
    }

    public static String dateToISO8601(Date date) {
        if (date == null) {
            date = new Date();
        }
        return c.get().format(date);
    }

    public static boolean sessionTrackingSupported() {
        return Build.VERSION.SDK_INT >= 14;
    }

    public static boolean isDebuggerConnected() {
        return Debug.isDebuggerConnected();
    }
}
