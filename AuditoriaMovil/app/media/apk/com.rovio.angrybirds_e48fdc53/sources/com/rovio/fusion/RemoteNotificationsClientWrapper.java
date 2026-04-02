package com.rovio.fusion;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2.dex */
public class RemoteNotificationsClientWrapper implements IActivityListener {
    private static final String DEFAULT_CHANNEL_DESCRIPTION = "General";
    private static final String DEFAULT_CHANNEL_ID = "general_01";
    private static final String DEFAULT_CHANNEL_TITLE = "General";
    private static final String SENDER_ID_KEY = "gcm_defaultSenderId";
    private static final String TAG = "RemoteNotificationsClientWrapper";
    static RemoteNotificationsClientWrapper m_receiver;
    private static boolean sm_enabled = false;
    public static boolean sm_paused = true;

    public native void announceRemoteMessage(String str);

    public native void announceRemoteRegistrationID(String str);

    static /* synthetic */ String access$000() {
        return getSenderId();
    }

    RemoteNotificationsClientWrapper() {
        Globals.registerActivityListener(this);
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onResume() {
        sm_paused = false;
        checkStoredRemoteNotificationPayload();
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
        checkStoredRemoteNotificationPayload();
    }

    @Override // com.rovio.fusion.IActivityListener
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static void checkStoredRemoteNotificationPayload() {
        Intent intent = Globals.getActivity().getIntent();
        String stringExtra = intent.getStringExtra("remoteNotificationPayload");
        if (stringExtra != null && stringExtra.length() > 0) {
            intent.removeExtra("remoteNotificationPayload");
            announceMessage(stringExtra);
        }
    }

    public static void setEnabled(boolean z) {
        if (z) {
            if (sm_enabled != z) {
                start();
            }
        } else {
            stop();
        }
        sm_enabled = z;
    }

    public static boolean areSettingsProvidedByThePlatform() {
        return Integer.valueOf(Build.VERSION.SDK).intValue() >= 16;
    }

    public static boolean areRemoteNotificationsEnabled() {
        return NotificationManagerCompat.from(Globals.getActivity()).areNotificationsEnabled();
    }

    static void start() {
        sm_paused = false;
        m_receiver = new RemoteNotificationsClientWrapper();
        createDefaultNotificationChannel(Globals.getActivity());
        register();
        checkStoredRemoteNotificationPayload();
    }

    static void stop() {
        RovioFirebaseMessagingService.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.rovio.fusion.RemoteNotificationsClientWrapper$1] */
    public static void register() {
        new AsyncTask<Void, Void, String>() { // from class: com.rovio.fusion.RemoteNotificationsClientWrapper.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public String doInBackground(Void... voidArr) {
                String str;
                Exception e;
                try {
                    str = FirebaseInstanceId.getInstance().getToken(RemoteNotificationsClientWrapper.access$000(), FirebaseMessaging.INSTANCE_ID_SCOPE);
                    try {
                        Log.i(RemoteNotificationsClientWrapper.TAG, "Feteched token: " + str);
                    } catch (Exception e2) {
                        e = e2;
                        Log.i(RemoteNotificationsClientWrapper.TAG, "Can't get device token. Error: " + e.getMessage());
                        return str;
                    }
                } catch (Exception e3) {
                    str = null;
                    e = e3;
                }
                return str;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(String str) {
                if (str != null) {
                    RemoteNotificationsClientWrapper.announceRegistrationID(str);
                }
            }
        }.execute(new Void[0]);
    }

    public static void announceRegistrationID(final String str) {
        if (m_receiver != null && Globals.getActivity() != null) {
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.RemoteNotificationsClientWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    RemoteNotificationsClientWrapper.m_receiver.announceRemoteRegistrationID(str);
                }
            });
        }
    }

    public static void announceMessage(final String str) {
        if (m_receiver != null) {
            if (str == null) {
                str = "";
            }
            Globals.runOnGLThread(new Runnable() { // from class: com.rovio.fusion.RemoteNotificationsClientWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    RemoteNotificationsClientWrapper.m_receiver.announceRemoteMessage(str);
                }
            });
        }
    }

    public static String getStringResourceByName(Context context, String str) {
        return context.getString(context.getResources().getIdentifier(str, "string", context.getPackageName()));
    }

    private static String getSenderId() {
        try {
            return getStringResourceByName(Globals.getActivity(), SENDER_ID_KEY);
        } catch (Exception e) {
            return null;
        }
    }

    public static NotificationManager createDefaultNotificationChannel(Context context) {
        return createNotificationChannel(context, DEFAULT_CHANNEL_ID, "General", "General");
    }

    public static NotificationManager createNotificationChannel(Context context, String str, String str2, String str3) {
        Log.i(TAG, "Creating notification channel");
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 4);
            notificationChannel.setDescription(str3);
            notificationChannel.enableVibration(true);
            try {
                notificationManager.createNotificationChannel(notificationChannel);
                return notificationManager;
            } catch (Exception e) {
                Log.w(TAG, "Failed to create notification channel! Error: " + e.getMessage());
                return notificationManager;
            }
        }
        return null;
    }
}
