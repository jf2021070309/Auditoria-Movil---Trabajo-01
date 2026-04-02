package com.rovio.fusion;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadExpSwitchCode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class LocalNotificationsWrapper extends BroadcastReceiver implements IActivityListener {
    private static final String CHANNEL_ID = "general_01";
    private static final String NOTIFICATION_DELETED_ACTION = "NOTIFICATION_DELETED";
    private static final String TAG = "LocalNotificationsWrapp";
    private static final boolean VERBOSE_LOGGING = false;
    private static PendingIntent mAlarmSender;
    private static int sm_notificationSerialNumber = 1;
    private static int sm_notificationNextId = 1;
    private static Map<String, Integer> sm_notificationIds = new HashMap();
    private static List<String> sm_stackedLines = new ArrayList();
    public static boolean sm_paused = true;
    private static int NOTIFICATION_WINDOW_MS = 300000;

    public native void notificationReceived(String str);

    public LocalNotificationsWrapper() {
        Globals.registerActivityListener(this);
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        sm_paused = false;
        sm_stackedLines.clear();
        createNotificationChannel(Globals.getActivity());
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onPause() {
        sm_paused = true;
    }

    @Override // com.rovio.fusion.IActivityListener
    public synchronized void onDestroy() {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onNewIntent(Intent intent) {
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive()");
        final String stringExtra = intent.getStringExtra("notification_eventName");
        String stringExtra2 = intent.getStringExtra("notification_eventTitle");
        String stringExtra3 = intent.getStringExtra("notification_eventText");
        String stringExtra4 = intent.getStringExtra("notification_eventIcon");
        String stringExtra5 = intent.getStringExtra("notification_eventSound");
        if (stringExtra != null) {
        }
        if (stringExtra2 != null) {
        }
        if (stringExtra3 != null) {
        }
        if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
            Globals.loadLibraries();
            if (sm_paused) {
                notifyImmediately(context, stringExtra, stringExtra2, stringExtra3, sm_notificationNextId, stringExtra4, stringExtra5, "", null);
            }
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.LocalNotificationsWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    LocalNotificationsWrapper.this.notificationReceived(stringExtra);
                }
            });
            return;
        }
        Log.e(TAG, "onReceive() malformed event");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class DeleteIntentReceiver extends BroadcastReceiver {
        DeleteIntentReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LocalNotificationsWrapper.sm_stackedLines.clear();
            context.unregisterReceiver(this);
        }
    }

    public static String getNameFor(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("app_name", "string", context.getPackageName());
        if (identifier == 0) {
            return "";
        }
        return resources.getText(identifier).toString();
    }

    public static void clearNotificationStack() {
        sm_stackedLines.clear();
    }

    public static void removeNotification(String str, int i) {
        sm_paused = false;
        Activity activity = Globals.getActivity();
        sm_stackedLines.clear();
        ((AlarmManager) activity.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(activity, i, new Intent(activity, LocalNotificationsWrapper.class), 0));
        Integer num = sm_notificationIds.get(str);
        if (num != null && num.intValue() >= 0) {
            ((NotificationManager) activity.getSystemService("notification")).cancel(str, num.intValue());
            sm_notificationIds.remove(str);
        }
    }

    private static void setAlarm(PendingIntent pendingIntent, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.add(13, i);
        AlarmManager alarmManager = (AlarmManager) Globals.getActivity().getSystemService("alarm");
        if (Build.VERSION.SDK_INT < 19) {
            alarmManager.set(0, calendar.getTimeInMillis(), pendingIntent);
        } else {
            alarmManager.setWindow(0, calendar.getTimeInMillis(), NOTIFICATION_WINDOW_MS, pendingIntent);
        }
    }

    public static int notifyAfter(int i, String str, String str2, String str3, String str4) {
        sm_paused = false;
        Activity activity = Globals.getActivity();
        activity.getResources();
        String nameFor = getNameFor(activity);
        Intent intent = new Intent(activity, LocalNotificationsWrapper.class);
        intent.putExtra("notification_eventName", str);
        intent.putExtra("notification_eventTitle", nameFor);
        intent.putExtra("notification_eventText", str2);
        intent.putExtra("notification_eventIcon", str3);
        intent.putExtra("notification_eventSound", str4);
        int i2 = sm_notificationSerialNumber;
        setAlarm(PendingIntent.getBroadcast(activity, i2, intent, DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25), i);
        sm_notificationSerialNumber++;
        return i2;
    }

    public static void notifyImmediately(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7) {
        Class<?> cls;
        Uri uri = null;
        if (str3 != null) {
            if (str2 == null) {
                str2 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            if (str5 == null) {
                str5 = "";
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            int i2 = 0;
            if (str4.length() > 0) {
                i2 = context.getResources().getIdentifier(str4, null, null);
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(context.getPackageName() + ":" + str4, null, null);
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(context.getPackageName() + ":drawable/" + str4, null, null);
            }
            if (i2 == 0) {
                i2 = Resources.getSystem().getIdentifier("emo_im_happy", "drawable", "android");
            }
            String packageName = context.getPackageName();
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(NOTIFICATION_DELETED_ACTION), 0);
            context.getApplicationContext().registerReceiver(new DeleteIntentReceiver(), new IntentFilter(NOTIFICATION_DELETED_ACTION));
            NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
            builder.setChannelId(CHANNEL_ID);
            builder.setGroup(packageName);
            builder.setSmallIcon(i2);
            builder.setContentTitle(str2);
            builder.setContentText(str3);
            builder.setDeleteIntent(broadcast);
            builder.setAutoCancel(true);
            if (str5 != null) {
                if (str5.equals(DownloadSettingKeys.BugFix.DEFAULT) || str5.length() == 0) {
                    uri = RingtoneManager.getDefaultUri(2);
                } else if (str5.length() > 0) {
                    uri = Uri.parse("android.resource://" + context.getPackageName() + "/" + str5);
                }
                builder.setSound(uri);
            }
            if (uri != null) {
            }
            if (str6 != null && str6.length() > 0 && Integer.valueOf(Build.VERSION.SDK).intValue() >= 11) {
                try {
                    int identifier = context.getResources().getIdentifier(context.getPackageName() + ":drawable/" + str6, null, null);
                    new BitmapFactory();
                    builder.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), identifier));
                } catch (Exception e) {
                }
            }
            try {
                Globals.loadLibraries();
                try {
                    cls = Globals.getActivity().getClass();
                } catch (Exception e2) {
                    cls = Class.forName("com.rovio.fusion.App");
                }
                Intent intent = new Intent(context, cls);
                intent.setAction("android.intent.action.VIEW");
                if (str7 != null && str7.length() > 0) {
                    intent.putExtra("remoteNotificationPayload", str7);
                }
                PendingIntent activity = PendingIntent.getActivity(context, 0, intent, DownloadExpSwitchCode.BUGFIX_SIGBUS_24_25);
                builder.setContentIntent(activity);
                sm_stackedLines.add(str3);
                if (sm_stackedLines.size() > 1) {
                    NotificationCompat.Builder groupSummary = new NotificationCompat.Builder(context).setSmallIcon(i2).setGroup(packageName).setGroupSummary(true);
                    NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                    for (int size = sm_stackedLines.size() - 1; size >= 0; size--) {
                        inboxStyle.addLine(sm_stackedLines.get(size));
                    }
                    groupSummary.setContentTitle(str2);
                    groupSummary.setContentText(str3);
                    groupSummary.setNumber(sm_stackedLines.size());
                    groupSummary.setDeleteIntent(broadcast);
                    inboxStyle.setBigContentTitle(str2);
                    groupSummary.setContentIntent(activity);
                    groupSummary.setAutoCancel(true);
                    groupSummary.setStyle(inboxStyle);
                    notificationManager.notify(str, i, groupSummary.build());
                } else {
                    notificationManager.notify(str, i, builder.build());
                }
                sm_notificationIds.put(str, Integer.valueOf(i));
            } catch (Exception e3) {
            }
        }
    }

    private static void createNotificationChannel(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "General", 3);
            notificationChannel.setDescription("General");
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(notificationChannel);
        }
    }
}
