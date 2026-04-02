package com.braze;

import android.content.Context;
import android.content.Intent;
import com.amazon.aps.iva.yb0.j;
import com.braze.enums.BrazePushEventType;
import com.braze.events.InAppMessageEvent;
import com.braze.models.push.BrazeNotificationPayload;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018J\u001e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010 \u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\t¨\u0006#"}, d2 = {"Lcom/braze/BrazeInternal;", "", "Landroid/content/Context;", "context", "", "ignoreRateLimit", "Lcom/amazon/aps/iva/kb0/q;", "requestGeofenceRefresh", "refreshFeatureFlags", "", "serializedCardJson", "userId", "addSerializedContentCardToStorage", "Landroid/content/Intent;", "intent", "handleInAppMessageTestPush", "applyPendingRuntimeConfiguration", "Lcom/braze/events/InAppMessageEvent;", "inAppMessageEvent", "retryInAppMessage", "Lcom/braze/Braze;", "getInstance", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction", "campaignId", "", "waitTimeMs", "logPushDelivery", "performPushDeliveryFlush", "logPushCampaign", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeInternal {
    public static final BrazeInternal INSTANCE = new BrazeInternal();

    private BrazeInternal() {
    }

    public static final void addSerializedContentCardToStorage(Context context, String str, String str2) {
        j.f(context, "context");
        j.f(str, "serializedCardJson");
        INSTANCE.getInstance(context).addSerializedCardJsonToStorage$android_sdk_base_release(str, str2);
    }

    public static final void applyPendingRuntimeConfiguration(Context context) {
        j.f(context, "context");
        INSTANCE.getInstance(context).applyPendingRuntimeConfiguration$android_sdk_base_release();
    }

    private final Braze getInstance(Context context) {
        return Braze.Companion.getInstance(context);
    }

    public static final void handleInAppMessageTestPush(Context context, Intent intent) {
        j.f(context, "context");
        j.f(intent, "intent");
        INSTANCE.getInstance(context).handleInAppMessageTestPush$android_sdk_base_release(intent);
    }

    public static final void refreshFeatureFlags(Context context) {
        j.f(context, "context");
        INSTANCE.getInstance(context).refreshFeatureFlags();
    }

    public static final void requestGeofenceRefresh(Context context, boolean z) {
        j.f(context, "context");
        INSTANCE.getInstance(context).requestGeofenceRefresh$android_sdk_base_release(z);
    }

    public static final void retryInAppMessage(Context context, InAppMessageEvent inAppMessageEvent) {
        j.f(context, "context");
        j.f(inAppMessageEvent, "inAppMessageEvent");
        INSTANCE.getInstance(context).retryInAppMessage$android_sdk_base_release(inAppMessageEvent);
    }

    public final /* synthetic */ void logPushCampaign(Context context, String str) {
        j.f(context, "context");
        j.f(str, "campaignId");
        getInstance(context).logPushMaxCampaign$android_sdk_base_release(str);
    }

    public final /* synthetic */ void logPushDelivery(Context context, String str, long j) {
        j.f(context, "context");
        j.f(str, "campaignId");
        getInstance(context).logPushDelivery$android_sdk_base_release(str, j);
    }

    public final /* synthetic */ void performPushDeliveryFlush(Context context) {
        j.f(context, "context");
        getInstance(context).performPushDeliveryFlush$android_sdk_base_release();
    }

    public final /* synthetic */ void publishBrazePushAction(Context context, BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        j.f(context, "context");
        j.f(brazePushEventType, "pushActionType");
        j.f(brazeNotificationPayload, "payload");
        getInstance(context).publishBrazePushAction$android_sdk_base_release(brazePushEventType, brazeNotificationPayload);
    }
}
