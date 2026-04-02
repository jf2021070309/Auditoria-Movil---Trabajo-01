package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.c3.p;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BrazeNotificationActionUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¨\u0006\u0015"}, d2 = {"Lcom/braze/push/BrazeNotificationActionUtils;", "", "Lcom/amazon/aps/iva/c3/s;", "notificationBuilder", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Lcom/amazon/aps/iva/kb0/q;", "addNotificationActions", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "handleNotificationActionClicked", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButton", "addNotificationAction", "", "actionType", "logNotificationActionClicked", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeNotificationActionUtils {
    public static final BrazeNotificationActionUtils INSTANCE = new BrazeNotificationActionUtils();

    private BrazeNotificationActionUtils() {
    }

    public static final void addNotificationActions(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        if (brazeNotificationPayload.getContext() == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationActionUtils$addNotificationActions$1.INSTANCE, 3, (Object) null);
            return;
        }
        List<BrazeNotificationPayload.ActionButton> actionButtons = brazeNotificationPayload.getActionButtons();
        if (actionButtons.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationActionUtils$addNotificationActions$2.INSTANCE, 3, (Object) null);
            return;
        }
        for (BrazeNotificationPayload.ActionButton actionButton : actionButtons) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeNotificationActionUtils brazeNotificationActionUtils = INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, brazeNotificationActionUtils, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationActionUtils$addNotificationActions$3(actionButton), 2, (Object) null);
            brazeNotificationActionUtils.addNotificationAction(sVar, brazeNotificationPayload, actionButton);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x002f, B:15:0x003d, B:23:0x0054, B:33:0x0073, B:36:0x007e, B:39:0x0086, B:44:0x0091, B:47:0x00a0, B:51:0x00a9, B:53:0x00b6, B:55:0x00c4, B:56:0x00c8, B:52:0x00b3, B:26:0x005d, B:29:0x0067, B:30:0x006c, B:57:0x00d5), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x002f, B:15:0x003d, B:23:0x0054, B:33:0x0073, B:36:0x007e, B:39:0x0086, B:44:0x0091, B:47:0x00a0, B:51:0x00a9, B:53:0x00b6, B:55:0x00c4, B:56:0x00c8, B:52:0x00b3, B:26:0x005d, B:29:0x0067, B:30:0x006c, B:57:0x00d5), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e A[Catch: Exception -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x002f, B:15:0x003d, B:23:0x0054, B:33:0x0073, B:36:0x007e, B:39:0x0086, B:44:0x0091, B:47:0x00a0, B:51:0x00a9, B:53:0x00b6, B:55:0x00c4, B:56:0x00c8, B:52:0x00b3, B:26:0x005d, B:29:0x0067, B:30:0x006c, B:57:0x00d5), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x002f, B:15:0x003d, B:23:0x0054, B:33:0x0073, B:36:0x007e, B:39:0x0086, B:44:0x0091, B:47:0x00a0, B:51:0x00a9, B:53:0x00b6, B:55:0x00c4, B:56:0x00c8, B:52:0x00b3, B:26:0x005d, B:29:0x0067, B:30:0x006c, B:57:0x00d5), top: B:62:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[Catch: Exception -> 0x00e2, TryCatch #0 {Exception -> 0x00e2, blocks: (B:3:0x000a, B:5:0x0014, B:11:0x0020, B:13:0x002f, B:15:0x003d, B:23:0x0054, B:33:0x0073, B:36:0x007e, B:39:0x0086, B:44:0x0091, B:47:0x00a0, B:51:0x00a9, B:53:0x00b6, B:55:0x00c4, B:56:0x00c8, B:52:0x00b3, B:26:0x005d, B:29:0x0067, B:30:0x006c, B:57:0x00d5), top: B:62:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void handleNotificationActionClicked(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.push.BrazeNotificationActionUtils.handleNotificationActionClicked(android.content.Context, android.content.Intent):void");
    }

    public final void addNotificationAction(s sVar, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.ActionButton actionButton) {
        PendingIntent activity;
        j.f(sVar, "notificationBuilder");
        j.f(brazeNotificationPayload, "payload");
        j.f(actionButton, "actionButton");
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationActionUtils$addNotificationAction$1.INSTANCE, 3, (Object) null);
            return;
        }
        Bundle bundle = new Bundle(brazeNotificationPayload.getNotificationExtras());
        actionButton.putIntoBundle(bundle);
        String type = actionButton.getType();
        int immutablePendingIntentFlags = 134217728 | IntentUtils.getImmutablePendingIntentFlags();
        if (j.a("ab_none", type)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationActionUtils$addNotificationAction$2(type), 2, (Object) null);
            Intent intent = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            j.e(intent, "Intent(Constants.BRAZE_A…ceiverClass\n            )");
            intent.putExtras(bundle);
            activity = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, immutablePendingIntentFlags);
            j.e(activity, "getBroadcast(\n          …IntentFlags\n            )");
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationActionUtils$addNotificationAction$3(type), 2, (Object) null);
            Intent intent2 = new Intent("com.braze.action.BRAZE_ACTION_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            j.e(intent2, "Intent(Constants.BRAZE_A…lineActivity::class.java)");
            intent2.setFlags(intent2.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK));
            intent2.putExtras(bundle);
            activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent2, immutablePendingIntentFlags);
            j.e(activity, "getActivity(\n           …IntentFlags\n            )");
        }
        p.a aVar = new p.a(0, actionButton.getText(), activity);
        aVar.e.putAll(new Bundle(bundle));
        sVar.b.add(aVar.a());
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeNotificationActionUtils$addNotificationAction$4(bundle), 2, (Object) null);
    }

    public final void logNotificationActionClicked(Context context, Intent intent, String str) {
        j.f(context, "context");
        j.f(intent, "intent");
        Braze.Companion.getInstance(context).logPushNotificationActionClicked(intent.getStringExtra("cid"), intent.getStringExtra("braze_action_id"), str);
    }
}
