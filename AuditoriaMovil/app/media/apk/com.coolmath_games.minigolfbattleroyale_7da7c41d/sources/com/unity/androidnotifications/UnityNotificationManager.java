package com.unity.androidnotifications;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.BadParcelableException;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.drive.DriveFile;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes2.dex */
public class UnityNotificationManager extends BroadcastReceiver {
    protected static final String NOTIFICATION_CHANNELS_SHARED_PREFS = "UNITY_NOTIFICATIONS";
    protected static final String NOTIFICATION_CHANNELS_SHARED_PREFS_KEY = "ChannelIDs";
    protected static final String NOTIFICATION_IDS_SHARED_PREFS = "UNITY_STORED_NOTIFICATION_IDS";
    protected static final String NOTIFICATION_IDS_SHARED_PREFS_KEY = "UNITY_NOTIFICATION_IDS";
    protected static NotificationCallback mNotificationCallback;
    protected static UnityNotificationManager mUnityNotificationManager;
    protected Activity mActivity;
    public Context mContext;
    protected Class mOpenActivity;
    protected boolean mRescheduleOnRestart;

    public UnityNotificationManager() {
        this.mContext = null;
        this.mActivity = null;
        this.mOpenActivity = null;
        this.mRescheduleOnRestart = false;
    }

    public UnityNotificationManager(Context context, Activity activity) {
        this.mContext = null;
        this.mActivity = null;
        this.mOpenActivity = null;
        this.mRescheduleOnRestart = false;
        this.mContext = context;
        this.mActivity = activity;
        try {
            Boolean valueOf = Boolean.valueOf(activity.getPackageManager().getApplicationInfo(activity.getPackageName(), 128).metaData.getBoolean("reschedule_notifications_on_restart"));
            if (valueOf.booleanValue()) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, UnityNotificationRestartOnBootReceiver.class), 1, 1);
            }
            this.mRescheduleOnRestart = valueOf.booleanValue();
            Class<?> openAppActivity = UnityNotificationUtilities.getOpenAppActivity(context, false);
            this.mOpenActivity = openAppActivity;
            if (openAppActivity == null) {
                this.mOpenActivity = activity.getClass();
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("UnityNotifications", "Failed to load meta-data, NameNotFound: " + e.getMessage());
        } catch (NullPointerException e2) {
            Log.e("UnityNotifications", "Failed to load meta-data, NullPointer: " + e2.getMessage());
        }
    }

    public static UnityNotificationManager getNotificationManagerImpl(Context context) {
        return getNotificationManagerImpl(context, (Activity) context);
    }

    public static UnityNotificationManager getNotificationManagerImpl(Context context, Activity activity) {
        UnityNotificationManager unityNotificationManager = mUnityNotificationManager;
        if (unityNotificationManager != null) {
            return unityNotificationManager;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            mUnityNotificationManager = new UnityNotificationManagerOreo(context, activity);
        } else {
            mUnityNotificationManager = new UnityNotificationManager(context, activity);
        }
        return mUnityNotificationManager;
    }

    public NotificationManager getNotificationManager() {
        return getNotificationManager(this.mContext);
    }

    public static NotificationManager getNotificationManager(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    public void setNotificationCallback(NotificationCallback notificationCallback) {
        mNotificationCallback = notificationCallback;
    }

    public void registerNotificationChannel(String str, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4, long[] jArr, int i2) {
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet()));
        hashSet.add(str);
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        clear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
        clear.apply();
        SharedPreferences.Editor edit = this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit();
        edit.putString("title", str2);
        edit.putInt("importance", i);
        edit.putString("description", str3);
        edit.putBoolean("enableLights", z);
        edit.putBoolean("enableVibration", z2);
        edit.putBoolean("canBypassDnd", z3);
        edit.putBoolean("canShowBadge", z4);
        edit.putString("vibrationPattern", Arrays.toString(jArr));
        edit.putInt("lockscreenVisibility", i2);
        edit.apply();
    }

    protected static String getSharedPrefsNameByChannelId(String str) {
        return String.format("unity_notification_channel_%s", str);
    }

    protected static NotificationChannelWrapper getNotificationChannel(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return UnityNotificationManagerOreo.getOreoNotificationChannel(context, str);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0);
        NotificationChannelWrapper notificationChannelWrapper = new NotificationChannelWrapper();
        notificationChannelWrapper.id = str;
        notificationChannelWrapper.name = sharedPreferences.getString("title", AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.importance = sharedPreferences.getInt("importance", 3);
        notificationChannelWrapper.description = sharedPreferences.getString("description", AdError.UNDEFINED_DOMAIN);
        notificationChannelWrapper.enableLights = sharedPreferences.getBoolean("enableLights", false);
        notificationChannelWrapper.enableVibration = sharedPreferences.getBoolean("enableVibration", false);
        notificationChannelWrapper.canBypassDnd = sharedPreferences.getBoolean("canBypassDnd", false);
        notificationChannelWrapper.canShowBadge = sharedPreferences.getBoolean("canShowBadge", false);
        notificationChannelWrapper.lockscreenVisibility = sharedPreferences.getInt("lockscreenVisibility", 1);
        String[] split = sharedPreferences.getString("vibrationPattern", "[]").split(",");
        int length = split.length;
        long[] jArr = new long[length];
        if (length > 1) {
            for (int i = 0; i < split.length; i++) {
                try {
                    jArr[i] = Long.parseLong(split[i]);
                } catch (NumberFormatException unused) {
                    jArr[i] = 1;
                }
            }
        }
        if (length <= 1) {
            jArr = null;
        }
        notificationChannelWrapper.vibrationPattern = jArr;
        return notificationChannelWrapper;
    }

    protected NotificationChannelWrapper getNotificationChannel(String str) {
        return getNotificationChannel(this.mContext, str);
    }

    public void deleteNotificationChannel(String str) {
        SharedPreferences sharedPreferences = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet()));
        if (hashSet.contains(str)) {
            hashSet.remove(str);
            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
            clear.putStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, hashSet);
            clear.apply();
            this.mContext.getSharedPreferences(getSharedPrefsNameByChannelId(str), 0).edit().clear().apply();
        }
    }

    public Object[] getNotificationChannels() {
        Set<String> stringSet = this.mContext.getSharedPreferences(NOTIFICATION_CHANNELS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_CHANNELS_SHARED_PREFS_KEY, new HashSet());
        ArrayList arrayList = new ArrayList();
        for (String str : stringSet) {
            arrayList.add(getNotificationChannel(str));
        }
        return arrayList.toArray();
    }

    public void scheduleNotificationIntent(Intent intent) {
        Intent deserializeNotificationIntent = UnityNotificationUtilities.deserializeNotificationIntent(this.mContext, UnityNotificationUtilities.serializeNotificationIntent(intent));
        int intExtra = deserializeNotificationIntent.getIntExtra("id", 0);
        Intent buildNotificationIntent = buildNotificationIntent(this.mContext, deserializeNotificationIntent, getActivityPendingIntent(this.mContext, intExtra, buildOpenAppIntent(deserializeNotificationIntent, this.mContext, this.mOpenActivity), 0));
        if (buildNotificationIntent != null) {
            if (this.mRescheduleOnRestart) {
                saveNotificationIntent(this.mContext, deserializeNotificationIntent);
            }
            scheduleNotificationIntentAlarm(this.mContext, buildNotificationIntent, getBroadcastPendingIntent(this.mContext, intExtra, buildNotificationIntent, 134217728));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Intent buildOpenAppIntent(Intent intent, Context context, Class cls) {
        Intent intent2 = new Intent(context, cls);
        intent2.addFlags(DriveFile.MODE_READ_WRITE);
        intent2.putExtras(intent);
        return intent2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Intent buildNotificationIntent(Context context, Intent intent, PendingIntent pendingIntent) {
        Intent intent2 = (Intent) intent.clone();
        intent2.putExtra("tapIntent", pendingIntent);
        SharedPreferences sharedPreferences = context.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0);
        HashSet<String> hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet()));
        HashSet hashSet2 = new HashSet();
        for (String str : hashSet) {
            if (getBroadcastPendingIntent(context, Integer.valueOf(str).intValue(), intent, DriveFile.MODE_WRITE_ONLY) != null) {
                hashSet2.add(str);
            }
        }
        if (Build.MANUFACTURER.equals("samsung") && hashSet2.size() >= 499) {
            Log.w("UnityNotifications", "Attempting to schedule more than 500 notifications. There is a limit of 500 concurrently scheduled Alarms on Samsung devices either wait for the currently scheduled ones to be triggered or cancel them if you wish to schedule additional notifications.");
            intent2 = null;
        } else {
            hashSet2.add(Integer.toString(intent2.getIntExtra("id", 0)));
            intent2.setFlags(268468224);
        }
        SharedPreferences.Editor clear = sharedPreferences.edit().clear();
        clear.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, hashSet2);
        clear.apply();
        return intent2;
    }

    public static PendingIntent getActivityPendingIntent(Context context, int i, Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return PendingIntent.getActivity(context, i, intent, i2 | 67108864);
        }
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    public static PendingIntent getBroadcastPendingIntent(Context context, int i, Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return PendingIntent.getBroadcast(context, i, intent, i2 | 67108864);
        }
        return PendingIntent.getBroadcast(context, i, intent, i2);
    }

    protected static void saveNotificationIntent(Context context, Intent intent) {
        String num = Integer.toString(intent.getIntExtra("id", 0));
        SharedPreferences.Editor clear = context.getSharedPreferences(getSharedPrefsNameByNotificationId(num), 0).edit().clear();
        clear.putString("data", UnityNotificationUtilities.serializeNotificationIntent(intent));
        clear.apply();
        SharedPreferences sharedPreferences = context.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet()));
        hashSet.add(num);
        SharedPreferences.Editor clear2 = sharedPreferences.edit().clear();
        clear2.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, hashSet);
        clear2.apply();
        loadNotificationIntents(context);
    }

    protected static String getSharedPrefsNameByNotificationId(String str) {
        return String.format("u_notification_data_%s", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static List<Intent> loadNotificationIntents(Context context) {
        HashSet<String> hashSet = new HashSet(context.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet()));
        ArrayList arrayList = new ArrayList();
        HashSet<String> hashSet2 = new HashSet();
        for (String str : hashSet) {
            String string = context.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0).getString("data", "");
            if (string.length() > 1) {
                arrayList.add(UnityNotificationUtilities.deserializeNotificationIntent(context, string));
            } else {
                hashSet2.add(str);
            }
        }
        for (String str2 : hashSet2) {
            deleteExpiredNotificationIntent(context, str2);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void scheduleNotificationIntentAlarm(Context context, Intent intent, PendingIntent pendingIntent) {
        long longExtra = intent.getLongExtra("repeatInterval", 0L);
        long longExtra2 = intent.getLongExtra("fireTime", 0L);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (longExtra <= 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setExactAndAllowWhileIdle(0, longExtra2, pendingIntent);
                return;
            } else {
                alarmManager.set(0, longExtra2, pendingIntent);
                return;
            }
        }
        alarmManager.setInexactRepeating(0, longExtra2, longExtra, pendingIntent);
    }

    public int checkNotificationStatus(int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (StatusBarNotification statusBarNotification : getNotificationManager().getActiveNotifications()) {
                if (i == statusBarNotification.getId()) {
                    return 2;
                }
            }
            return checkIfPendingNotificationIsRegistered(i) ? 1 : 0;
        }
        return -1;
    }

    public boolean checkIfPendingNotificationIsRegistered(int i) {
        return getBroadcastPendingIntent(this.mContext, i, new Intent(this.mActivity, UnityNotificationManager.class), DriveFile.MODE_WRITE_ONLY) != null;
    }

    public void cancelAllPendingNotificationIntents() {
        for (int i : getScheduledNotificationIDs()) {
            cancelPendingNotificationIntent(i);
        }
    }

    protected int[] getScheduledNotificationIDs() {
        int i = 0;
        Set<String> stringSet = this.mContext.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0).getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet());
        int[] iArr = new int[stringSet.size()];
        for (String str : stringSet) {
            iArr[i] = Integer.valueOf(str).intValue();
            i++;
        }
        return iArr;
    }

    public void cancelPendingNotificationIntent(int i) {
        cancelPendingNotificationIntent(this.mContext, i);
        if (this.mRescheduleOnRestart) {
            deleteExpiredNotificationIntent(this.mContext, Integer.toString(i));
        }
    }

    protected static void cancelPendingNotificationIntent(Context context, int i) {
        PendingIntent broadcastPendingIntent = getBroadcastPendingIntent(context, i, new Intent(context, UnityNotificationManager.class), DriveFile.MODE_WRITE_ONLY);
        if (broadcastPendingIntent != null) {
            if (context != null) {
                ((AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)).cancel(broadcastPendingIntent);
            }
            broadcastPendingIntent.cancel();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet()));
        if (hashSet.contains(Integer.toString(i))) {
            hashSet.remove(Integer.toString(i));
            SharedPreferences.Editor clear = sharedPreferences.edit().clear();
            clear.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, hashSet);
            clear.apply();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void deleteExpiredNotificationIntent(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(NOTIFICATION_IDS_SHARED_PREFS, 0);
        HashSet hashSet = new HashSet(sharedPreferences.getStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, new HashSet()));
        cancelPendingNotificationIntent(context, Integer.valueOf(str).intValue());
        hashSet.remove(str);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putStringSet(NOTIFICATION_IDS_SHARED_PREFS_KEY, hashSet);
        edit.apply();
        context.getSharedPreferences(getSharedPrefsNameByNotificationId(str), 0).edit().clear().apply();
    }

    public void cancelDisplayedNotification(int i) {
        getNotificationManager().cancel(i);
    }

    public void cancelAllNotifications() {
        getNotificationManager().cancelAll();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if (intent.hasExtra("channelID") && intent.hasExtra("smallIconStr")) {
                sendNotification(context, intent);
            }
        } catch (BadParcelableException e) {
            Log.w("UnityNotifications", e.toString());
        }
    }

    protected static void sendNotification(Context context, Intent intent) {
        notify(context, intent.getIntExtra("id", -1), buildNotification(context, intent).build(), intent);
    }

    protected static Notification.Builder buildNotification(Context context, Intent intent) {
        Notification.Builder builder;
        int intExtra;
        String stringExtra = intent.getStringExtra("channelID");
        if (Build.VERSION.SDK_INT < 26) {
            builder = new Notification.Builder(context);
        } else {
            builder = new Notification.Builder(context, stringExtra);
        }
        int findResourceIdInContextByName = UnityNotificationUtilities.findResourceIdInContextByName(context, intent.getStringExtra("largeIconStr"));
        if (findResourceIdInContextByName != 0) {
            builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), findResourceIdInContextByName));
        }
        int findResourceIdInContextByName2 = UnityNotificationUtilities.findResourceIdInContextByName(context, intent.getStringExtra("smallIconStr"));
        if (findResourceIdInContextByName2 == 0) {
            findResourceIdInContextByName2 = context.getApplicationInfo().icon;
        }
        builder.setSmallIcon(findResourceIdInContextByName2);
        String stringExtra2 = intent.getStringExtra("textTitle");
        String stringExtra3 = intent.getStringExtra("textContent");
        builder.setContentTitle(stringExtra2).setContentText(stringExtra3).setContentIntent((PendingIntent) intent.getParcelableExtra("tapIntent")).setAutoCancel(intent.getBooleanExtra("autoCancel", true));
        int i = 0;
        int intExtra2 = intent.getIntExtra("number", 0);
        if (intExtra2 >= 0) {
            builder.setNumber(intExtra2);
        }
        if (intent.getIntExtra(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, 0) == 2) {
            builder.setStyle(new Notification.BigTextStyle().bigText(stringExtra3));
        }
        builder.setWhen(intent.getLongExtra(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP, -1L));
        if (Build.VERSION.SDK_INT >= 20) {
            String stringExtra4 = intent.getStringExtra("group");
            if (stringExtra4 != null && stringExtra4.length() > 0) {
                builder.setGroup(stringExtra4);
            }
            boolean booleanExtra = intent.getBooleanExtra("groupSummary", false);
            if (booleanExtra) {
                builder.setGroupSummary(booleanExtra);
            }
            String stringExtra5 = intent.getStringExtra("sortKey");
            if (stringExtra5 != null && stringExtra5.length() > 0) {
                builder.setSortKey(stringExtra5);
            }
        }
        if (Build.VERSION.SDK_INT >= 17) {
            builder.setShowWhen(intent.getBooleanExtra("showTimestamp", false));
        }
        if (Build.VERSION.SDK_INT >= 21 && (intExtra = intent.getIntExtra("color", 0)) != 0) {
            builder.setColor(intExtra);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setColorized(true);
            }
        }
        if (Build.VERSION.SDK_INT >= 22) {
            builder.setUsesChronometer(intent.getBooleanExtra("usesChronometer", false));
        }
        if (Build.VERSION.SDK_INT < 26) {
            NotificationChannelWrapper notificationChannel = getNotificationChannel(context, stringExtra);
            if (notificationChannel.vibrationPattern != null && notificationChannel.vibrationPattern.length > 0) {
                builder.setDefaults(5);
                builder.setVibrate(notificationChannel.vibrationPattern);
            } else {
                builder.setDefaults(-1);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                builder.setVisibility(notificationChannel.lockscreenVisibility);
            }
            int i2 = notificationChannel.importance;
            if (i2 == 0) {
                i = -2;
            } else if (i2 == 2) {
                i = -1;
            } else if (i2 != 3 && i2 == 4) {
                i = 2;
            }
            builder.setPriority(i);
        } else {
            builder.setGroupAlertBehavior(intent.getIntExtra("groupAlertBehaviour", 0));
        }
        return builder;
    }

    protected static void notify(Context context, int i, Notification notification, Intent intent) {
        getNotificationManager(context).notify(i, notification);
        try {
            mNotificationCallback.onSentNotification(intent);
        } catch (RuntimeException unused) {
            Log.w("UnityNotifications", "Can not invoke OnNotificationReceived event when the app is not running!");
        }
        if (intent.getLongExtra("repeatInterval", 0L) > 0) {
            return;
        }
        deleteExpiredNotificationIntent(context, Integer.toString(i));
    }
}
