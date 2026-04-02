package com.rovio.fusion;

import android.util.Log;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class RovioFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "RovioFirebaseMessaging";
    private static boolean sm_enabled = true;

    public static void setEnabled(boolean z) {
        sm_enabled = z;
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        Log.i(TAG, "Received new token: " + str);
        RemoteNotificationsClientWrapper.announceRegistrationID(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        if (sm_enabled) {
            Log.d(TAG, "Received message: ");
            Log.d(TAG, "notification: " + remoteMessage.getNotification().toString());
            Log.d(TAG, "data: " + remoteMessage.getData().toString());
            RemoteMessage.Notification notification = remoteMessage.getNotification();
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("notification", jSONObject2);
                jSONObject2.put("title", notification.getTitle());
                jSONObject2.put("body", notification.getBody());
                if (notification.getIcon() != null) {
                    jSONObject2.put("icon", notification.getIcon());
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_DATA, jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject3.put(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, jSONObject4);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject4.put(MessengerShareContentUtility.ATTACHMENT_PAYLOAD, jSONObject5);
                jSONObject4.put("campaignId", remoteMessage.getCollapseKey());
                jSONObject5.put("title", notification.getTitle());
                jSONObject5.put("alert", notification.getBody());
                if (notification.getIcon() != null) {
                    jSONObject5.put("small-icon", notification.getIcon());
                }
                if (notification.getSound() != null) {
                    jSONObject5.put("sound", notification.getSound());
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject5.put("custom", jSONObject6);
                Map<String, String> data = remoteMessage.getData();
                if (data != null && !data.isEmpty()) {
                    for (Map.Entry<String, String> entry : data.entrySet()) {
                        jSONObject6.put(entry.getKey(), entry.getValue());
                    }
                }
                jSONObject.put("collapseKey", remoteMessage.getCollapseKey());
                jSONObject.put("to", remoteMessage.getTo());
                RemoteNotificationsClientWrapper.announceMessage(jSONObject.toString());
            } catch (Exception e) {
                Log.w(TAG, "Got an exception while building json from push message. Error: " + e.toString());
            }
        }
    }
}
