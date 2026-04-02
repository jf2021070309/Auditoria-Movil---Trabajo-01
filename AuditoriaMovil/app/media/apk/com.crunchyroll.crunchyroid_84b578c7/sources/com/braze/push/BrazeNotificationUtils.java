package com.braze.push;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.c80.a;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.IBrazeNotificationFactory;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazePushEventType;
import com.braze.enums.BrazeViewBounds;
import com.braze.enums.Channel;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.support.JsonUtils;
import com.braze.support.PermissionUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.UriAction;
import com.braze.ui.support.UriUtils;
import com.google.common.primitives.Ints;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: BrazeNotificationUtils.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001RB\t\b\u0002¢\u0006\u0004\bP\u0010QJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\f\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J.\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0007J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\"\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\"\u0010%\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\"\u0010&\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\u0018\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0007J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010*\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010+\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010-\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010/\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u00100\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u00101\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u0016H\u0007J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u00105\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0010\u00107\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u00108\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010:\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0018\u0010;\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001c\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020<2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007J\"\u0010B\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u0002062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J.\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\"\u0010E\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010G\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0011\u0010L\u001a\u00020I8G¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0015\u0010O\u001a\u0006\u0012\u0002\b\u00030\u00148G¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006S"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils;", "", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/amazon/aps/iva/kb0/q;", "handleNotificationOpened", "handleNotificationDeleted", "routeUserWithNotificationOpenedIntent", "", "isBrazePushMessage", "isNotificationMessage", "Landroid/os/Bundle;", "notificationExtras", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "sendPushMessageReceivedBroadcast", "requestGeofenceRefreshIfAppropriate", "refreshFeatureFlagsIfAppropriate", "Ljava/lang/Class;", "thisClass", "", "notificationId", "durationInMillis", "setNotificationDurationAlarm", "getNotificationId", "getNotificationPriority", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "wakeScreenIfAppropriate", "prefetchBitmapsIfNewlyReceivedStoryPush", "Lcom/amazon/aps/iva/c3/s;", "notificationBuilder", "setTitleIfPresent", "setContentIfPresent", "setTickerIfPresent", "setContentIntentIfPresent", "setDeleteIntent", "appConfigurationProvider", "setSmallIcon", "setSetShowWhen", "setLargeIconIfPresentAndSupported", "setSoundIfPresentAndSupported", "setSummaryTextIfPresentAndSupported", "setPriorityIfPresentAndSupported", "setAccentColorIfPresentAndSupported", "setCategoryIfPresentAndSupported", "setVisibilityIfPresentAndSupported", "setPublicVersionIfPresentAndSupported", "visibility", "isValidNotificationVisibility", "handleCancelNotificationAction", "cancelNotification", "", "getOrCreateNotificationChannelId", "setNotificationBadgeNumberIfPresent", "handlePushStoryPageClicked", "handleContentCardsSerializedCardIfPresent", "sendNotificationOpenedBroadcast", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/app/NotificationChannel;", "getValidNotificationChannel", "action", "Landroid/app/PendingIntent;", "getPushActionPendingIntent", "Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "broadcastType", "sendPushActionIntent", "pushIntent", "TAG", "Ljava/lang/String;", "Lcom/braze/IBrazeNotificationFactory;", "getActiveNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "activeNotificationFactory", "getNotificationReceiverClass", "()Ljava/lang/Class;", "notificationReceiverClass", "<init>", "()V", "BrazeNotificationBroadcastType", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeNotificationUtils {
    public static final BrazeNotificationUtils INSTANCE = new BrazeNotificationUtils();
    private static final String TAG = BrazeLogger.getBrazeLogTag(BrazeNotificationUtils.class);

    /* compiled from: BrazeNotificationUtils.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/braze/push/BrazeNotificationUtils$BrazeNotificationBroadcastType;", "", "brazePushEventType", "Lcom/braze/enums/BrazePushEventType;", "(Ljava/lang/String;ILcom/braze/enums/BrazePushEventType;)V", "getBrazePushEventType", "()Lcom/braze/enums/BrazePushEventType;", "OPENED", "RECEIVED", "DELETED", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public enum BrazeNotificationBroadcastType {
        OPENED(BrazePushEventType.NOTIFICATION_OPENED),
        RECEIVED(BrazePushEventType.NOTIFICATION_RECEIVED),
        DELETED(BrazePushEventType.NOTIFICATION_DELETED);
        
        private final BrazePushEventType brazePushEventType;

        BrazeNotificationBroadcastType(BrazePushEventType brazePushEventType) {
            this.brazePushEventType = brazePushEventType;
        }

        public final BrazePushEventType getBrazePushEventType() {
            return this.brazePushEventType;
        }
    }

    /* compiled from: BrazeNotificationUtils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrazeNotificationBroadcastType.values().length];
            try {
                iArr[BrazeNotificationBroadcastType.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrazeNotificationBroadcastType.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BrazeNotificationUtils() {
    }

    public static final void cancelNotification(Context context, int i) {
        j.f(context, "context");
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$cancelNotification$1(i), 3, (Object) null);
            Intent intent = new Intent("com.braze.action.CANCEL_NOTIFICATION").setClass(context, getNotificationReceiverClass());
            j.e(intent, "Intent(Constants.BRAZE_C…otificationReceiverClass)");
            intent.setPackage(context.getPackageName());
            intent.putExtra("nid", i);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$cancelNotification$2.INSTANCE);
        }
    }

    public static final IBrazeNotificationFactory getActiveNotificationFactory() {
        IBrazeNotificationFactory customBrazeNotificationFactory = Braze.Companion.getCustomBrazeNotificationFactory();
        if (customBrazeNotificationFactory == null) {
            return BrazeNotificationFactory.Companion.getInstance();
        }
        return customBrazeNotificationFactory;
    }

    public static final int getNotificationId(BrazeNotificationPayload brazeNotificationPayload) {
        int i;
        j.f(brazeNotificationPayload, "payload");
        Integer customNotificationId = brazeNotificationPayload.getCustomNotificationId();
        if (customNotificationId != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getNotificationId$1(customNotificationId), 3, (Object) null);
            return customNotificationId.intValue();
        }
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null) {
            titleText = "";
        }
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText != null) {
            titleText = a.f(titleText, contentText);
        }
        if (titleText != null) {
            i = titleText.hashCode();
        } else {
            i = 0;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getNotificationId$4(i), 3, (Object) null);
        return i;
    }

    public static final int getNotificationPriority(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        j.f(brazeNotificationPayload, "payload");
        Integer notificationPriorityInt = brazeNotificationPayload.getNotificationPriorityInt();
        Integer notificationPriorityInt2 = brazeNotificationPayload.getNotificationPriorityInt();
        if (notificationPriorityInt2 != null) {
            int intValue = notificationPriorityInt2.intValue();
            if (-2 <= intValue && intValue < 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return intValue;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new BrazeNotificationUtils$getNotificationPriority$1$1(notificationPriorityInt), 2, (Object) null);
        }
        return 0;
    }

    public static final Class<?> getNotificationReceiverClass() {
        if (Constants.isAmazonDevice()) {
            return BrazeAmazonDeviceMessagingReceiver.class;
        }
        return BrazePushReceiver.class;
    }

    public static final String getOrCreateNotificationChannelId(BrazeNotificationPayload brazeNotificationPayload) {
        Object obj;
        String str;
        j.f(brazeNotificationPayload, "payload");
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        String str2 = null;
        if (context != null) {
            obj = context.getSystemService("notification");
        } else {
            obj = null;
        }
        j.d(obj, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) obj;
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getOrCreateNotificationChannelId$1(notificationChannelId), 3, (Object) null);
                return notificationChannelId;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getOrCreateNotificationChannelId$2(notificationChannelId), 3, (Object) null);
        }
        if (notificationManager.getNotificationChannel("com_appboy_default_notification_channel") == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$getOrCreateNotificationChannelId$3.INSTANCE, 3, (Object) null);
            if (configurationProvider != null) {
                str = configurationProvider.getDefaultNotificationChannelName();
            } else {
                str = null;
            }
            NotificationChannel notificationChannel = new NotificationChannel("com_appboy_default_notification_channel", str, 3);
            if (configurationProvider != null) {
                str2 = configurationProvider.getDefaultNotificationChannelDescription();
            }
            notificationChannel.setDescription(str2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return "com_appboy_default_notification_channel";
    }

    private final PendingIntent getPushActionPendingIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        j.e(intent, "Intent(action).setClass(…lineActivity::class.java)");
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
        j.e(activity, "getActivity(context, get… pushActionIntent, flags)");
        return activity;
    }

    @TargetApi(26)
    public static final NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle bundle) {
        boolean z;
        j.f(notificationManager, "notificationManager");
        if (bundle == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$getValidNotificationChannel$1.INSTANCE, 3, (Object) null);
            return null;
        }
        String string = bundle.getString("ab_nc", null);
        if (string != null && !m.b0(string)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(string);
            if (notificationChannel != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getValidNotificationChannel$2(string), 3, (Object) null);
                return notificationChannel;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$getValidNotificationChannel$3(string), 3, (Object) null);
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("com_appboy_default_notification_channel");
        if (notificationChannel2 != null) {
            return notificationChannel2;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$getValidNotificationChannel$4.INSTANCE, 3, (Object) null);
        return null;
    }

    public static final void handleCancelNotificationAction(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        try {
            if (intent.hasExtra("nid")) {
                int intExtra = intent.getIntExtra("nid", -1);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$handleCancelNotificationAction$1(intExtra), 3, (Object) null);
                Object systemService = context.getSystemService("notification");
                j.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancel("appboy_notification", intExtra);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$handleCancelNotificationAction$2.INSTANCE);
        }
    }

    public static final void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazeNotificationPayload, "payload");
        String contentCardSyncData = brazeNotificationPayload.getContentCardSyncData();
        String contentCardSyncUserId = brazeNotificationPayload.getContentCardSyncUserId();
        Context context = brazeNotificationPayload.getContext();
        if (contentCardSyncData != null && context != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$handleContentCardsSerializedCardIfPresent$1(contentCardSyncUserId, contentCardSyncData), 3, (Object) null);
            BrazeInternal.addSerializedContentCardToStorage(context, contentCardSyncData, contentCardSyncUserId);
        }
    }

    public static final void handleNotificationDeleted(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        try {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$handleNotificationDeleted$1.INSTANCE, 3, (Object) null);
            Bundle extras = intent.getExtras();
            if (extras != null) {
                brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.DELETED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            } else {
                sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.DELETED, extras, null, 8, null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$handleNotificationDeleted$2.INSTANCE);
        }
    }

    public static final void handleNotificationOpened(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (new BrazeConfigurationProvider(context).getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, BrazeNotificationUtils$handleNotificationOpened$1.INSTANCE, 2, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$handleNotificationOpened$2.INSTANCE);
        }
    }

    public static final void handlePushStoryPageClicked(Context context, Intent intent) {
        boolean z;
        j.f(context, "context");
        j.f(intent, "intent");
        try {
            Braze.Companion.getInstance(context).logPushStoryPageClicked(intent.getStringExtra("braze_campaign_id"), intent.getStringExtra("braze_story_page_id"));
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            boolean z2 = false;
            int intExtra = intent.getIntExtra("nid", 0);
            if (brazeConfigurationProvider.getDoesPushStoryDismissOnClick() && intExtra != 0) {
                cancelNotification(context, intExtra);
            }
            String stringExtra = intent.getStringExtra("braze_action_uri");
            if (stringExtra != null && !m.b0(stringExtra)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                intent.putExtra("uri", intent.getStringExtra("braze_action_uri"));
                String stringExtra2 = intent.getStringExtra("braze_action_use_webview");
                if (stringExtra2 == null || m.b0(stringExtra2)) {
                    z2 = true;
                }
                if (!z2) {
                    intent.putExtra("ab_use_webview", stringExtra2);
                }
            } else {
                intent.removeExtra("uri");
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (brazeConfigurationProvider.getDoesHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.I, (Throwable) null, new BrazeNotificationUtils$handlePushStoryPageClicked$1(stringExtra), 2, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$handlePushStoryPageClicked$2.INSTANCE);
        }
    }

    public static final boolean isBrazePushMessage(Intent intent) {
        j.f(intent, "<this>");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return m.Z("true", extras.getString("_ab"));
    }

    public static final boolean isNotificationMessage(Intent intent) {
        j.f(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("t") || !extras.containsKey("a")) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public static final boolean isValidNotificationVisibility(int i) {
        if (i == -1 || i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public static final void prefetchBitmapsIfNewlyReceivedStoryPush(BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (context != null && brazeNotificationPayload.isPushStory() && brazeNotificationPayload.isNewlyReceivedPushStory()) {
            ArrayList<String> arrayList = new ArrayList();
            for (BrazeNotificationPayload.PushStoryPage pushStoryPage : brazeNotificationPayload.getPushStoryPages()) {
                String bitmapUrl = pushStoryPage.getBitmapUrl();
                if (bitmapUrl != null) {
                    arrayList.add(bitmapUrl);
                }
            }
            for (String str : arrayList) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationUtils$prefetchBitmapsIfNewlyReceivedStoryPush$2$1(str), 2, (Object) null);
                Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getBrazeExtras(), str, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            }
            brazeNotificationPayload.setNewlyReceivedPushStory(false);
        }
    }

    public static final boolean refreshFeatureFlagsIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (brazeNotificationPayload.getShouldRefreshFeatureFlags() && context != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$1.INSTANCE, 3, (Object) null);
            BrazeInternal.refreshFeatureFlags(context);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.V, (Throwable) null, BrazeNotificationUtils$refreshFeatureFlagsIfAppropriate$2.INSTANCE, 2, (Object) null);
        return false;
    }

    public static final boolean requestGeofenceRefreshIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        j.f(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (brazeNotificationPayload.getShouldSyncGeofences() && context != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$1.INSTANCE, 3, (Object) null);
            BrazeInternal.requestGeofenceRefresh(context, true);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$requestGeofenceRefreshIfAppropriate$2.INSTANCE, 3, (Object) null);
        return false;
    }

    public static final void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        boolean z;
        j.f(context, "context");
        j.f(intent, "intent");
        Bundle bundleExtra = intent.getBundleExtra("extra");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString("cid", intent.getStringExtra("cid"));
        bundleExtra.putString(FirebaseAnalytics.Param.SOURCE, "Appboy");
        String stringExtra = intent.getStringExtra("uri");
        if (stringExtra != null && !m.b0(stringExtra)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            boolean Z = m.Z("true", intent.getStringExtra("ab_use_webview"));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$1(stringExtra, Z), 3, (Object) null);
            bundleExtra.putString("uri", stringExtra);
            bundleExtra.putBoolean("ab_use_webview", Z);
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.Companion;
            UriAction createUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(stringExtra, bundleExtra, Z, Channel.PUSH);
            if (createUriActionFromUrlString != null) {
                companion.getInstance().gotoUri(context, createUriActionFromUrlString);
                return;
            }
            return;
        }
        Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundleExtra);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$routeUserWithNotificationOpenedIntent$3(mainActivityIntent), 3, (Object) null);
        context.startActivity(mainActivityIntent);
    }

    public static final void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$sendNotificationOpenedBroadcast$1.INSTANCE, 3, (Object) null);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.OPENED, extras, new BrazeNotificationPayload(extras, null, context, null, 10, null));
            return;
        }
        sendPushActionIntent$default(brazeNotificationUtils, context, BrazeNotificationBroadcastType.OPENED, extras, null, 8, null);
    }

    private final void sendPushActionIntent(Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        Intent intent;
        int i = WhenMappings.$EnumSwitchMapping$0[brazeNotificationBroadcastType.ordinal()];
        if (i == 1) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_OPENED").setPackage(context.getPackageName());
            j.e(intent, "{\n                Intent…ackageName)\n            }");
        } else if (i == 2) {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_RECEIVED").setPackage(context.getPackageName());
            j.e(intent, "{\n                Intent…ackageName)\n            }");
        } else if (i != 3) {
            throw new h();
        } else {
            intent = new Intent("com.braze.push.intent.NOTIFICATION_DELETED").setPackage(context.getPackageName());
            j.e(intent, "{\n                Intent…ackageName)\n            }");
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$1(brazeNotificationBroadcastType), 2, (Object) null);
        sendPushActionIntent(context, intent, bundle);
        if (brazeNotificationPayload != null) {
            BrazeInternal.INSTANCE.publishBrazePushAction(context, brazeNotificationBroadcastType.getBrazePushEventType(), brazeNotificationPayload);
        }
    }

    public static /* synthetic */ void sendPushActionIntent$default(BrazeNotificationUtils brazeNotificationUtils, Context context, BrazeNotificationBroadcastType brazeNotificationBroadcastType, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload, int i, Object obj) {
        if ((i & 8) != 0) {
            brazeNotificationPayload = null;
        }
        brazeNotificationUtils.sendPushActionIntent(context, brazeNotificationBroadcastType, bundle, brazeNotificationPayload);
    }

    public static final void sendPushMessageReceivedBroadcast(Context context, Bundle bundle, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(context, "context");
        j.f(bundle, "notificationExtras");
        j.f(brazeNotificationPayload, "payload");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeNotificationUtils brazeNotificationUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$sendPushMessageReceivedBroadcast$1.INSTANCE, 3, (Object) null);
        brazeNotificationUtils.sendPushActionIntent(context, BrazeNotificationBroadcastType.RECEIVED, bundle, brazeNotificationPayload);
    }

    public static final void setAccentColorIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        Integer accentColor = brazeNotificationPayload.getAccentColor();
        if (accentColor != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setAccentColorIfPresentAndSupported$1.INSTANCE, 3, (Object) null);
            sVar.v = accentColor.intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setAccentColorIfPresentAndSupported$2$1.INSTANCE, 3, (Object) null);
            sVar.v = configurationProvider.getDefaultNotificationAccentColor();
        }
    }

    public static final void setCategoryIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        String notificationCategory = brazeNotificationPayload.getNotificationCategory();
        if (notificationCategory != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setCategoryIfPresentAndSupported$2.INSTANCE, 3, (Object) null);
            sVar.t = notificationCategory;
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setCategoryIfPresentAndSupported$3.INSTANCE, 3, (Object) null);
    }

    public static final void setContentIfPresent(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setContentIfPresent$1.INSTANCE, 3, (Object) null);
        String contentText = brazeNotificationPayload.getContentText();
        if (contentText == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return;
        }
        sVar.d(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
    }

    public static final void setContentIntentIfPresent(Context context, s sVar, Bundle bundle) {
        j.f(context, "context");
        j.f(sVar, "notificationBuilder");
        try {
            sVar.g = INSTANCE.getPushActionPendingIntent(context, "com.braze.action.BRAZE_PUSH_CLICKED", bundle);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$setContentIntentIfPresent$1.INSTANCE);
        }
    }

    public static final void setDeleteIntent(Context context, s sVar, Bundle bundle) {
        j.f(context, "context");
        j.f(sVar, "notificationBuilder");
        try {
            Intent intent = new Intent("com.braze.action.BRAZE_PUSH_DELETED").setClass(context, getNotificationReceiverClass());
            j.e(intent, "Intent(Constants.BRAZE_P…otificationReceiverClass)");
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            sVar.E.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags() | Ints.MAX_POWER_OF_TWO);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$setDeleteIntent$1.INSTANCE);
        }
    }

    public static final boolean setLargeIconIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        BrazeLogger brazeLogger;
        BrazeNotificationUtils brazeNotificationUtils;
        String largeIcon;
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$1.INSTANCE, 3, (Object) null);
            return false;
        }
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        try {
            brazeLogger = BrazeLogger.INSTANCE;
            brazeNotificationUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$2.INSTANCE, 3, (Object) null);
            largeIcon = brazeNotificationPayload.getLargeIcon();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$6.INSTANCE);
        }
        if (largeIcon != null) {
            sVar.g(Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$4.INSTANCE, 3, (Object) null);
        int largeNotificationIconResourceId = configurationProvider.getLargeNotificationIconResourceId();
        if (largeNotificationIconResourceId != 0) {
            sVar.g(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
            return true;
        }
        BrazeLogger.brazelog$default(brazeLogger, brazeNotificationUtils, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$5.INSTANCE, 3, (Object) null);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setLargeIconIfPresentAndSupported$7.INSTANCE, 3, (Object) null);
        return false;
    }

    public static final void setNotificationBadgeNumberIfPresent(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        Integer notificationBadgeNumber = brazeNotificationPayload.getNotificationBadgeNumber();
        if (notificationBadgeNumber != null) {
            sVar.i = notificationBadgeNumber.intValue();
        }
    }

    public static final void setNotificationDurationAlarm(Context context, Class<?> cls, int i, int i2) {
        j.f(context, "context");
        Intent intent = new Intent(context, cls);
        intent.setAction("com.braze.action.CANCEL_NOTIFICATION");
        intent.putExtra("nid", i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728 | IntentUtils.getImmutablePendingIntentFlags());
        Object systemService = context.getSystemService("alarm");
        j.d(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
        AlarmManager alarmManager = (AlarmManager) systemService;
        if (i2 >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$setNotificationDurationAlarm$1(i2), 3, (Object) null);
            alarmManager.set(3, SystemClock.elapsedRealtime() + i2, broadcast);
        }
    }

    public static final void setPriorityIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setPriorityIfPresentAndSupported$1.INSTANCE, 3, (Object) null);
        sVar.j = getNotificationPriority(brazeNotificationPayload);
    }

    public static final void setPublicVersionIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (context != null && brazeNotificationPayload.getPublicNotificationExtras() != null && configurationProvider != null) {
            String orCreateNotificationChannelId = getOrCreateNotificationChannelId(brazeNotificationPayload);
            Bundle parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(brazeNotificationPayload.getPublicNotificationExtras());
            if (parseJsonObjectIntoBundle.isEmpty()) {
                return;
            }
            BrazeNotificationPayload brazeNotificationPayload2 = new BrazeNotificationPayload(parseJsonObjectIntoBundle, null, context, configurationProvider, 2, null);
            s sVar2 = new s(context, orCreateNotificationChannelId);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$setPublicVersionIfPresentAndSupported$2(brazeNotificationPayload2), 3, (Object) null);
            setContentIfPresent(sVar2, brazeNotificationPayload2);
            setTitleIfPresent(sVar2, brazeNotificationPayload2);
            setSummaryTextIfPresentAndSupported(sVar2, brazeNotificationPayload2);
            setSmallIcon(configurationProvider, sVar2);
            setAccentColorIfPresentAndSupported(sVar2, brazeNotificationPayload2);
            sVar.x = sVar2.b();
        }
    }

    public static final void setSetShowWhen(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.isPushStory()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSetShowWhen$1.INSTANCE, 3, (Object) null);
            sVar.k = false;
        }
    }

    public static final int setSmallIcon(BrazeConfigurationProvider brazeConfigurationProvider, s sVar) {
        j.f(brazeConfigurationProvider, "appConfigurationProvider");
        j.f(sVar, "notificationBuilder");
        int smallNotificationIconResourceId = brazeConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSmallIcon$1.INSTANCE, 3, (Object) null);
            smallNotificationIconResourceId = brazeConfigurationProvider.getApplicationIconResourceId();
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSmallIcon$2.INSTANCE, 3, (Object) null);
        }
        sVar.E.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    public static final void setSoundIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        String notificationSound = brazeNotificationPayload.getNotificationSound();
        if (notificationSound == null) {
            return;
        }
        boolean a = j.a(notificationSound, "d");
        Notification notification = sVar.E;
        if (a) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSoundIfPresentAndSupported$1.INSTANCE, 3, (Object) null);
            notification.defaults = 1;
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSoundIfPresentAndSupported$2.INSTANCE, 3, (Object) null);
        notification.sound = Uri.parse(notificationSound);
        notification.audioStreamType = -1;
        notification.audioAttributes = s.a.a(s.a.e(s.a.c(s.a.b(), 4), 5));
    }

    public static final void setSummaryTextIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        String summaryText = brazeNotificationPayload.getSummaryText();
        if (summaryText != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$1.INSTANCE, 3, (Object) null);
            sVar.m = s.c(summaryText);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setSummaryTextIfPresentAndSupported$2.INSTANCE, 3, (Object) null);
    }

    public static final void setTickerIfPresent(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setTickerIfPresent$1.INSTANCE, 3, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null) {
            return;
        }
        sVar.E.tickerText = s.c(titleText);
    }

    public static final void setTitleIfPresent(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setTitleIfPresent$1.INSTANCE, 3, (Object) null);
        String titleText = brazeNotificationPayload.getTitleText();
        if (titleText == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return;
        }
        sVar.e(HtmlUtils.getHtmlSpannedTextIfEnabled(titleText, configurationProvider));
    }

    public static final void setVisibilityIfPresentAndSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        Integer notificationVisibility = brazeNotificationPayload.getNotificationVisibility();
        if (notificationVisibility != null) {
            if (isValidNotificationVisibility(notificationVisibility.intValue())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$setVisibilityIfPresentAndSupported$2.INSTANCE, 3, (Object) null);
                sVar.w = notificationVisibility.intValue();
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new BrazeNotificationUtils$setVisibilityIfPresentAndSupported$3(notificationVisibility), 2, (Object) null);
        }
    }

    public static final boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle) {
        j.f(context, "context");
        j.f(brazeConfigurationProvider, "configurationProvider");
        return wakeScreenIfAppropriate(new BrazeNotificationPayload(bundle, null, context, brazeConfigurationProvider, 2, null));
    }

    @SuppressLint({"WakelockTimeout"})
    public static final boolean wakeScreenIfAppropriate(BrazeNotificationPayload brazeNotificationPayload) {
        BrazeConfigurationProvider configurationProvider;
        j.f(brazeNotificationPayload, "payload");
        Context context = brazeNotificationPayload.getContext();
        if (context == null || (configurationProvider = brazeNotificationPayload.getConfigurationProvider()) == null) {
            return false;
        }
        Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
        if (PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") && configurationProvider.isPushWakeScreenForNotificationEnabled()) {
            try {
                Object systemService = context.getSystemService("uimode");
                j.d(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService).getCurrentModeType() == 4) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$wakeScreenIfAppropriate$1.INSTANCE, 3, (Object) null);
                    return false;
                }
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(INSTANCE, BrazeLogger.Priority.E, e, BrazeNotificationUtils$wakeScreenIfAppropriate$2.INSTANCE);
            }
            Object systemService2 = context.getSystemService("notification");
            j.d(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) systemService2, notificationExtras);
            if (validNotificationChannel == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$wakeScreenIfAppropriate$3.INSTANCE, 3, (Object) null);
                return false;
            } else if (validNotificationChannel.getImportance() == 1) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationUtils$wakeScreenIfAppropriate$4(validNotificationChannel), 3, (Object) null);
                return false;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationUtils$wakeScreenIfAppropriate$5.INSTANCE, 3, (Object) null);
                Object systemService3 = context.getSystemService("power");
                j.d(systemService3, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager.WakeLock newWakeLock = ((PowerManager) systemService3).newWakeLock(268435482, TAG);
                newWakeLock.acquire();
                newWakeLock.release();
                return true;
            }
        }
        return false;
    }

    private final void sendPushActionIntent(Context context, Intent intent, Bundle bundle) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationUtils$sendPushActionIntent$2(intent), 2, (Object) null);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        IntentUtils.addComponentAndSendBroadcast(context, intent);
    }
}
