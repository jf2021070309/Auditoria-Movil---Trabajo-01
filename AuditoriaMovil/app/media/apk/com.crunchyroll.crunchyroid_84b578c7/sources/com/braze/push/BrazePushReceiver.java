package com.braze.push;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.amazon.aps.iva.cc0.c;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: BrazePushReceiver.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000b"}, d2 = {"Lcom/braze/push/BrazePushReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/amazon/aps/iva/kb0/q;", "onReceive", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazePushReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BrazePushReceiver.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J \u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u00198\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001bR\u0014\u0010$\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0014\u0010%\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001b¨\u0006("}, d2 = {"Lcom/braze/push/BrazePushReceiver$Companion;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/amazon/aps/iva/kb0/q;", "handlePush", "", "runOnThread", "handleReceivedIntent", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "handleAdmRegistrationEventIfEnabled", "handleAdmRegistrationIntent", "handlePushNotificationPayload", "Landroid/os/Bundle;", "notificationExtras", "brazeExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "createPayload", "payload", "logNotificationMetadata$android_sdk_ui_release", "(Landroid/content/Context;Lcom/braze/models/push/BrazeNotificationPayload;)V", "logNotificationMetadata", "", "ADM_ERROR_DESCRIPTION_KEY", "Ljava/lang/String;", "ADM_ERROR_KEY", "ADM_RECEIVE_INTENT_ACTION", "ADM_REGISTRATION_ID_KEY", "ADM_REGISTRATION_INTENT_ACTION", "ADM_UNREGISTERED_KEY", "DELETED_MESSAGES_KEY", "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION", "HMS_PUSH_SERVICE_ROUTING_ACTION", "MESSAGE_TYPE_KEY", "NUMBER_OF_MESSAGES_DELETED_KEY", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handlePush(Context context, Intent intent) {
            Context applicationContext = context.getApplicationContext();
            String action = intent.getAction();
            try {
                handlePush$performWork(action, applicationContext, intent, context);
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new BrazePushReceiver$Companion$handlePush$1(action, intent));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
            if (r9.equals("hms_push_service_routing_action") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (r9.equals("com.amazon.device.messaging.intent.RECEIVE") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
            if (r9.equals("com.braze.action.STORY_TRAVERSE") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
            if (r9.equals("firebase_messaging_service_routing_action") == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
            r8.handlePushNotificationPayload(r10, r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void handlePush$performWork(java.lang.String r9, android.content.Context r10, android.content.Intent r11, android.content.Context r12) {
            /*
                com.braze.support.BrazeLogger r7 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.push.BrazePushReceiver$Companion r8 = com.braze.push.BrazePushReceiver.Companion
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.I
                r3 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$1 r4 = new com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$1
                r4.<init>(r11)
                r5 = 2
                r6 = 0
                r0 = r7
                r1 = r8
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6)
                if (r9 == 0) goto L1e
                int r0 = r9.length()
                if (r0 != 0) goto L1c
                goto L1e
            L1c:
                r0 = 0
                goto L1f
            L1e:
                r0 = 1
            L1f:
                if (r0 == 0) goto L31
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                r3 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$2 r4 = new com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$2
                r4.<init>(r11)
                r5 = 2
                r6 = 0
                r0 = r7
                r1 = r8
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6)
                return
            L31:
                java.lang.String r0 = "applicationContext"
                com.amazon.aps.iva.yb0.j.e(r10, r0)
                com.braze.BrazeInternal.applyPendingRuntimeConfiguration(r10)
                int r0 = r9.hashCode()
                switch(r0) {
                    case -2147185193: goto Lb4;
                    case -1799205286: goto La7;
                    case -1584985748: goto L9a;
                    case -1249868226: goto L8d;
                    case -743092218: goto L7b;
                    case -711830027: goto L72;
                    case -559929808: goto L65;
                    case 34673601: goto L56;
                    case 1060266838: goto L4c;
                    case 1740454061: goto L42;
                    default: goto L40;
                }
            L40:
                goto Lc1
            L42:
                java.lang.String r12 = "hms_push_service_routing_action"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto La3
                goto Lc1
            L4c:
                java.lang.String r12 = "com.amazon.device.messaging.intent.RECEIVE"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto La3
                goto Lc1
            L56:
                java.lang.String r10 = "com.braze.action.BRAZE_STORY_CLICKED"
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto L60
                goto Lc1
            L60:
                com.braze.push.BrazeNotificationUtils.handlePushStoryPageClicked(r12, r11)
                goto Lcd
            L65:
                java.lang.String r12 = "com.braze.action.BRAZE_PUSH_DELETED"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto L6e
                goto Lc1
            L6e:
                com.braze.push.BrazeNotificationUtils.handleNotificationDeleted(r10, r11)
                goto Lcd
            L72:
                java.lang.String r12 = "com.braze.action.STORY_TRAVERSE"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto La3
                goto Lc1
            L7b:
                java.lang.String r12 = "com.amazon.device.messaging.intent.REGISTRATION"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto L84
                goto Lc1
            L84:
                com.braze.configuration.BrazeConfigurationProvider r9 = new com.braze.configuration.BrazeConfigurationProvider
                r9.<init>(r10)
                r8.handleAdmRegistrationEventIfEnabled(r9, r10, r11)
                goto Lcd
            L8d:
                java.lang.String r10 = "com.braze.action.BRAZE_PUSH_CLICKED"
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto L96
                goto Lc1
            L96:
                com.braze.push.BrazeNotificationUtils.handleNotificationOpened(r12, r11)
                goto Lcd
            L9a:
                java.lang.String r12 = "firebase_messaging_service_routing_action"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto La3
                goto Lc1
            La3:
                r8.handlePushNotificationPayload(r10, r11)
                goto Lcd
            La7:
                java.lang.String r10 = "com.braze.action.BRAZE_ACTION_CLICKED"
                boolean r9 = r9.equals(r10)
                if (r9 != 0) goto Lb0
                goto Lc1
            Lb0:
                com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(r12, r11)
                goto Lcd
            Lb4:
                java.lang.String r12 = "com.braze.action.CANCEL_NOTIFICATION"
                boolean r9 = r9.equals(r12)
                if (r9 != 0) goto Lbd
                goto Lc1
            Lbd:
                com.braze.push.BrazeNotificationUtils.handleCancelNotificationAction(r10, r11)
                goto Lcd
            Lc1:
                com.braze.support.BrazeLogger$Priority r2 = com.braze.support.BrazeLogger.Priority.W
                r3 = 0
                com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3 r4 = com.braze.push.BrazePushReceiver$Companion$handlePush$performWork$3.INSTANCE
                r5 = 2
                r6 = 0
                r0 = r7
                r1 = r8
                com.braze.support.BrazeLogger.brazelog$default(r0, r1, r2, r3, r4, r5, r6)
            Lcd:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazePushReceiver.Companion.handlePush$performWork(java.lang.String, android.content.Context, android.content.Intent, android.content.Context):void");
        }

        public static /* synthetic */ void handleReceivedIntent$default(Companion companion, Context context, Intent intent, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = true;
            }
            companion.handleReceivedIntent(context, intent, z);
        }

        public final BrazeNotificationPayload createPayload(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle, Bundle bundle2) {
            j.f(context, "context");
            j.f(brazeConfigurationProvider, "appConfigurationProvider");
            j.f(bundle, "notificationExtras");
            j.f(bundle2, "brazeExtras");
            if (Constants.isAmazonDevice()) {
                return new BrazeNotificationPayload(bundle, BrazeNotificationPayload.Companion.getAttachedBrazeExtras(bundle), context, brazeConfigurationProvider);
            }
            return new BrazeNotificationPayload(bundle, bundle2, context, brazeConfigurationProvider);
        }

        public final boolean handleAdmRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
            j.f(brazeConfigurationProvider, "appConfigurationProvider");
            j.f(context, "context");
            j.f(intent, "intent");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$1(intent), 2, (Object) null);
            if (Constants.isAmazonDevice() && brazeConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
                BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$2.INSTANCE, 3, (Object) null);
                handleAdmRegistrationIntent(context, intent);
                return true;
            }
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$3.INSTANCE, 2, (Object) null);
            return false;
        }

        public final boolean handleAdmRegistrationIntent(Context context, Intent intent) {
            j.f(context, "context");
            j.f(intent, "intent");
            String stringExtra = intent.getStringExtra("error");
            String stringExtra2 = intent.getStringExtra("error_description");
            String stringExtra3 = intent.getStringExtra("registration_id");
            String stringExtra4 = intent.getStringExtra("unregistered");
            if (stringExtra != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$1(stringExtra, stringExtra2), 2, (Object) null);
                return true;
            } else if (stringExtra3 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$2(stringExtra3), 2, (Object) null);
                Braze.Companion.getInstance(context).setRegisteredPushToken(stringExtra3);
                return true;
            } else if (stringExtra4 != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new BrazePushReceiver$Companion$handleAdmRegistrationIntent$3(stringExtra4), 2, (Object) null);
                return true;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazePushReceiver$Companion$handleAdmRegistrationIntent$4.INSTANCE, 2, (Object) null);
                return false;
            }
        }

        public final boolean handlePushNotificationPayload(Context context, Intent intent) {
            j.f(context, "context");
            j.f(intent, "intent");
            if (!BrazeNotificationUtils.isBrazePushMessage(intent)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$1.INSTANCE, 3, (Object) null);
                return false;
            } else if (j.a("deleted_messages", intent.getStringExtra("message_type"))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new BrazePushReceiver$Companion$handlePushNotificationPayload$2(intent.getIntExtra("total_deleted", -1)), 2, (Object) null);
                return false;
            } else {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return false;
                }
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BrazePushReceiver$Companion$handlePushNotificationPayload$3(extras), 2, (Object) null);
                Bundle attachedBrazeExtras = BrazeNotificationPayload.Companion.getAttachedBrazeExtras(extras);
                extras.putBundle("extra", attachedBrazeExtras);
                if (!extras.containsKey("braze_push_received_timestamp")) {
                    extras.putLong("braze_push_received_timestamp", System.currentTimeMillis());
                }
                BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
                BrazeNotificationPayload createPayload = createPayload(context, brazeConfigurationProvider, extras, attachedBrazeExtras);
                if (createPayload.isUninstallTrackingPush()) {
                    BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$4.INSTANCE, 2, (Object) null);
                    return false;
                }
                BrazeNotificationUtils.handleContentCardsSerializedCardIfPresent(createPayload);
                if (createPayload.getShouldFetchTestTriggers() && brazeConfigurationProvider.isInAppMessageTestPushEagerDisplayEnabled() && BrazeInAppMessageManager.Companion.getInstance().getActivity() != null) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$5.INSTANCE, 3, (Object) null);
                    BrazeInternal.handleInAppMessageTestPush(context, intent);
                    return false;
                } else if (BrazeNotificationUtils.isNotificationMessage(intent)) {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$6.INSTANCE, 3, (Object) null);
                    int notificationId = BrazeNotificationUtils.getNotificationId(createPayload);
                    extras.putInt("nid", notificationId);
                    if (createPayload.isPushStory()) {
                        if (Constants.isAmazonDevice()) {
                            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$7.INSTANCE, 3, (Object) null);
                            return false;
                        } else if (!extras.containsKey("braze_story_newly_received")) {
                            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$8.INSTANCE, 3, (Object) null);
                            extras.putBoolean("braze_story_newly_received", true);
                        }
                    }
                    BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new BrazePushReceiver$Companion$handlePushNotificationPayload$9(createPayload), 2, (Object) null);
                    Notification createNotification = BrazeNotificationUtils.getActiveNotificationFactory().createNotification(createPayload);
                    if (createNotification == null) {
                        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$10.INSTANCE, 3, (Object) null);
                        return false;
                    }
                    NotificationManagerCompat from = NotificationManagerCompat.from(context);
                    j.e(from, "from(context)");
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazePushReceiver$Companion$handlePushNotificationPayload$11(from), 3, (Object) null);
                    from.notify("appboy_notification", notificationId, createNotification);
                    BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                    BrazeNotificationUtils.wakeScreenIfAppropriate(context, brazeConfigurationProvider, extras);
                    Integer pushDuration = createPayload.getPushDuration();
                    if (pushDuration != null) {
                        BrazeNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, pushDuration.intValue());
                    }
                    logNotificationMetadata$android_sdk_ui_release(context, createPayload);
                    return true;
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazePushReceiver$Companion$handlePushNotificationPayload$13.INSTANCE, 3, (Object) null);
                    BrazeNotificationUtils.sendPushMessageReceivedBroadcast(context, extras, createPayload);
                    BrazeNotificationUtils.requestGeofenceRefreshIfAppropriate(createPayload);
                    BrazeNotificationUtils.refreshFeatureFlagsIfAppropriate(createPayload);
                    return false;
                }
            }
        }

        public final void handleReceivedIntent(Context context, Intent intent, boolean z) {
            j.f(context, "context");
            j.f(intent, "intent");
            if (z) {
                i.d(BrazeCoroutineScope.INSTANCE, null, null, new BrazePushReceiver$Companion$handleReceivedIntent$1(context, intent, null), 3);
            } else {
                handlePush(context, intent);
            }
        }

        public final void logNotificationMetadata$android_sdk_ui_release(Context context, BrazeNotificationPayload brazeNotificationPayload) {
            String campaignId;
            j.f(context, "context");
            j.f(brazeNotificationPayload, "payload");
            if (brazeNotificationPayload.isPushDeliveryEnabled() && (campaignId = brazeNotificationPayload.getCampaignId()) != null) {
                long flushMinMinutes = brazeNotificationPayload.getFlushMinMinutes();
                if (flushMinMinutes < 0) {
                    flushMinMinutes = 0;
                }
                long flushMaxMinutes = brazeNotificationPayload.getFlushMaxMinutes();
                if (flushMaxMinutes < flushMinMinutes) {
                    flushMaxMinutes = flushMinMinutes;
                }
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long millis = timeUnit.toMillis(flushMinMinutes);
                if (flushMaxMinutes > flushMinMinutes) {
                    millis = c.b.d(millis, timeUnit.toMillis(flushMaxMinutes));
                }
                BrazeInternal.INSTANCE.logPushDelivery(context, campaignId, millis);
            }
            String campaignId2 = brazeNotificationPayload.getCampaignId();
            if (campaignId2 != null) {
                BrazeInternal.INSTANCE.logPushCampaign(context, campaignId2);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        Companion.handleReceivedIntent$default(Companion, context, intent, false, 4, null);
    }
}
