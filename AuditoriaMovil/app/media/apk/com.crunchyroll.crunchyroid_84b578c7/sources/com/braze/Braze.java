package com.braze;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import bo.app.c2;
import bo.app.f4;
import bo.app.j;
import bo.app.j0;
import bo.app.j3;
import bo.app.k0;
import bo.app.l6;
import bo.app.m6;
import bo.app.o3;
import bo.app.v3;
import bo.app.v4;
import bo.app.x0;
import bo.app.x4;
import bo.app.y;
import bo.app.y3;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.f1.d0;
import com.amazon.aps.iva.se0.g0;
import com.braze.configuration.BrazeConfig;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.configuration.RuntimeAppConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazePushEventType;
import com.braze.events.BrazePushEvent;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.FeedUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.IValueCallback;
import com.braze.events.InAppMessageEvent;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.PermissionUtils;
import com.braze.support.StringUtils;
import com.braze.support.ValidationUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 Ì\u00012\u00020\u0001:\u0002Ì\u0001B\u0015\b\u0001\u0012\b\u0010É\u0001\u001a\u00030\u0082\u0001¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J&\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J0\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J.\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J8\u0010\u0010\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0019\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u001b\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\u0016\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016J\u0016\u0010(\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0#H\u0016J\u0016\u0010*\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020)0#H\u0016J*\u0010.\u001a\u00020\u0004\"\u0004\b\u0000\u0010+2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016J,\u0010/\u001a\u00020\u0004\"\u0004\b\u0000\u0010+2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010#2\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016J\u0012\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u00101\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u00072\b\u00102\u001a\u0004\u0018\u00010\u0007H\u0016J\u0016\u00106\u001a\u00020\u00042\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u00107\u001a\u00020\u0011H\u0016J\u0017\u0010<\u001a\u00020\u00042\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;J!\u0010@\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b>\u0010?J\u0017\u0010C\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010F\u001a\u00020\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010J\u001a\u00020\u00042\u0006\u0010G\u001a\u00020$H\u0000¢\u0006\u0004\bH\u0010IJ\u001f\u0010Q\u001a\u00020\u00042\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020MH\u0000¢\u0006\u0004\bO\u0010PJ\u001f\u0010V\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010S\u001a\u00020RH\u0000¢\u0006\u0004\bT\u0010UJ\u0017\u0010Y\u001a\u00020\u00042\u0006\u0010S\u001a\u00020RH\u0000¢\u0006\u0004\bW\u0010XJ\u000f\u0010[\u001a\u00020\u0004H\u0000¢\u0006\u0004\bZ\u0010EJ\u0017\u0010_\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\u0007H\u0000¢\u0006\u0004\b]\u0010^J7\u0010f\u001a\u00020\u00042\u000e\u0010a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010`2\b\b\u0002\u0010b\u001a\u0002082\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00040`H\u0001¢\u0006\u0004\bd\u0010eJ\b\u0010h\u001a\u00020gH\u0002J\u0010\u0010j\u001a\u00020\u00042\u0006\u0010i\u001a\u000208H\u0002J\u0010\u0010m\u001a\u00020\u00042\u0006\u0010l\u001a\u00020kH\u0002J\b\u0010n\u001a\u00020\u0004H\u0002J\u0010\u0010q\u001a\u00020\u00042\u0006\u0010p\u001a\u00020oH\u0002J\u0010\u0010s\u001a\u0002082\u0006\u0010r\u001a\u00020\u0007H\u0002J\\\u0010y\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\u0006\u0010t\u001a\u00028\u00002\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070`2\b\b\u0002\u0010b\u001a\u0002082\"\u0010c\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020v\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000w\u0012\u0006\u0012\u0004\u0018\u00010x0uH\u0002ø\u0001\u0000¢\u0006\u0004\by\u0010zR$\u0010|\u001a\u00020{8\u0016@\u0016X\u0096.¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R2\u0010\u008a\u0001\u001a\u0004\u0018\u0001088\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u0012\u0005\b\u0090\u0001\u0010E\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0091\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R1\u0010\u0094\u0001\u001a\u00030\u0093\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u0012\u0005\b\u009a\u0001\u0010E\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R1\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u0012\u0005\b¢\u0001\u0010E\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R!\u0010¤\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0083.¢\u0006\u000f\n\u0006\b¤\u0001\u0010¥\u0001\u0012\u0005\b¦\u0001\u0010ER1\u0010¨\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b¨\u0001\u0010©\u0001\u0012\u0005\b®\u0001\u0010E\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R1\u0010°\u0001\u001a\u00030¯\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b°\u0001\u0010±\u0001\u0012\u0005\b¶\u0001\u0010E\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R1\u0010¸\u0001\u001a\u00030·\u00018\u0000@\u0000X\u0081.¢\u0006\u001f\n\u0006\b¸\u0001\u0010¹\u0001\u0012\u0005\b¾\u0001\u0010E\u001a\u0006\bº\u0001\u0010»\u0001\"\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010À\u0001\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b6\u0010¿\u0001R-\u0010Å\u0001\u001a\u0004\u0018\u00010\u00072\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u00078V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0005\bÄ\u0001\u0010^R\u0019\u0010È\u0001\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010Ç\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Í\u0001"}, d2 = {"Lcom/braze/Braze;", "Lcom/braze/IBraze;", "Landroid/app/Activity;", "activity", "Lcom/amazon/aps/iva/kb0/q;", "openSession", "closeSession", "", "eventName", "logCustomEvent", "Lcom/braze/models/outgoing/BrazeProperties;", "properties", "productId", "currencyCode", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "logPurchase", "", FirebaseAnalytics.Param.QUANTITY, "Landroid/content/Intent;", "intent", "logPushNotificationOpened", "campaignId", "actionId", "actionType", "logPushNotificationActionClicked", "pageId", "logPushStoryPageClicked", "logFeedDisplayed", "requestFeedRefreshFromCache", "requestFeedRefresh", "requestContentCardsRefresh", "requestContentCardsRefreshFromCache", "refreshFeatureFlags", "requestImmediateDataFlush", "Lcom/braze/events/IEventSubscriber;", "Lcom/braze/events/InAppMessageEvent;", "subscriber", "subscribeToNewInAppMessages", "Lcom/braze/events/ContentCardsUpdatedEvent;", "subscribeToContentCardsUpdates", "Lcom/braze/events/FeedUpdatedEvent;", "subscribeToFeedUpdates", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/lang/Class;", "eventClass", "addSingleSynchronousSubscription", "removeSingleSubscription", "userId", "changeUser", "sdkAuthSignature", "Lcom/braze/events/IValueCallback;", "Lcom/braze/BrazeUser;", "completionCallback", "getCurrentUser", "getContentCardUnviewedCount", "", "ignoreRateLimit", "requestGeofenceRefresh$android_sdk_base_release", "(Z)V", "requestGeofenceRefresh", "serializedCardJson", "addSerializedCardJsonToStorage$android_sdk_base_release", "(Ljava/lang/String;Ljava/lang/String;)V", "addSerializedCardJsonToStorage", "handleInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;)V", "handleInAppMessageTestPush", "applyPendingRuntimeConfiguration$android_sdk_base_release", "()V", "applyPendingRuntimeConfiguration", "event", "retryInAppMessage$android_sdk_base_release", "(Lcom/braze/events/InAppMessageEvent;)V", "retryInAppMessage", "Lcom/braze/enums/BrazePushEventType;", "pushActionType", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "publishBrazePushAction$android_sdk_base_release", "(Lcom/braze/enums/BrazePushEventType;Lcom/braze/models/push/BrazeNotificationPayload;)V", "publishBrazePushAction", "", "timeInMs", "logPushDelivery$android_sdk_base_release", "(Ljava/lang/String;J)V", "logPushDelivery", "schedulePushDelivery$android_sdk_base_release", "(J)V", "schedulePushDelivery", "performPushDeliveryFlush$android_sdk_base_release", "performPushDeliveryFlush", FirebaseAnalytics.Param.CAMPAIGN, "logPushMaxCampaign$android_sdk_base_release", "(Ljava/lang/String;)V", "logPushMaxCampaign", "Lkotlin/Function0;", "errorLog", "earlyReturnIfDisabled", "block", "run$android_sdk_base_release", "(Lcom/amazon/aps/iva/xb0/a;ZLcom/amazon/aps/iva/xb0/a;)V", "run", "Lbo/app/v1;", "getDeviceDataProvider", "isOffline", "setSyncPolicyOfflineStatus", "", "throwable", "publishError", "verifyProperSdkSetup", "Lbo/app/m6;", "dependencyProvider", "setUserSpecificMemberVariablesAndStartDispatch", "key", "isEphemeralEventKey", "defaultValueOnException", "Lkotlin/Function2;", "Lcom/amazon/aps/iva/se0/g0;", "Lcom/amazon/aps/iva/ob0/d;", "", "runForResult", "(Ljava/lang/Object;Lcom/amazon/aps/iva/xb0/a;ZLcom/amazon/aps/iva/xb0/p;)Ljava/lang/Object;", "Lcom/braze/images/IBrazeImageLoader;", "imageLoader", "Lcom/braze/images/IBrazeImageLoader;", "getImageLoader", "()Lcom/braze/images/IBrazeImageLoader;", "setImageLoader", "(Lcom/braze/images/IBrazeImageLoader;)V", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "Lbo/app/j3;", "offlineUserStorageProvider", "Lbo/app/j3;", "brazeUser", "Lcom/braze/BrazeUser;", "isApiKeyPresent", "Ljava/lang/Boolean;", "isApiKeyPresent$android_sdk_base_release", "()Ljava/lang/Boolean;", "setApiKeyPresent$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "isApiKeyPresent$android_sdk_base_release$annotations", "isInstanceStopped", "Z", "Lbo/app/w1;", "deviceIdProvider", "Lbo/app/w1;", "getDeviceIdProvider$android_sdk_base_release", "()Lbo/app/w1;", "setDeviceIdProvider$android_sdk_base_release", "(Lbo/app/w1;)V", "getDeviceIdProvider$android_sdk_base_release$annotations", "Lbo/app/z1;", "externalIEventMessenger", "Lbo/app/z1;", "getExternalIEventMessenger$android_sdk_base_release", "()Lbo/app/z1;", "setExternalIEventMessenger$android_sdk_base_release", "(Lbo/app/z1;)V", "getExternalIEventMessenger$android_sdk_base_release$annotations", "Lbo/app/c2;", "registrationDataProvider", "Lbo/app/c2;", "getRegistrationDataProvider$annotations", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider$android_sdk_base_release", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider$android_sdk_base_release", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "getConfigurationProvider$android_sdk_base_release$annotations", "Lbo/app/a4;", "pushDeliveryManager", "Lbo/app/a4;", "getPushDeliveryManager$android_sdk_base_release", "()Lbo/app/a4;", "setPushDeliveryManager$android_sdk_base_release", "(Lbo/app/a4;)V", "getPushDeliveryManager$android_sdk_base_release$annotations", "Lbo/app/r2;", "udm", "Lbo/app/r2;", "getUdm$android_sdk_base_release", "()Lbo/app/r2;", "setUdm$android_sdk_base_release", "(Lbo/app/r2;)V", "getUdm$android_sdk_base_release$annotations", "()Lcom/braze/BrazeUser;", "currentUser", "value", "getRegisteredPushToken", "()Ljava/lang/String;", "setRegisteredPushToken", "registeredPushToken", "getCachedContentCardsUpdatedEvent", "()Lcom/braze/events/ContentCardsUpdatedEvent;", "cachedContentCardsUpdatedEvent", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Braze implements IBraze {
    private static boolean areOutboundNetworkRequestsOffline;
    private static IBrazeNotificationFactory customBrazeNotificationFactory;
    private static bo.app.v1 deviceDataProvider;
    private static IBrazeEndpointProvider endpointProvider;
    private static volatile Braze instance;
    private static v4 sdkEnablementProvider;
    private static boolean shouldMockNetworkRequestsAndDropEvents;
    private Context applicationContext;
    private BrazeUser brazeUser;
    public BrazeConfigurationProvider configurationProvider;
    public bo.app.w1 deviceIdProvider;
    private bo.app.z1 externalIEventMessenger;
    public IBrazeImageLoader imageLoader;
    private Boolean isApiKeyPresent;
    private boolean isInstanceStopped;
    private j3 offlineUserStorageProvider;
    public bo.app.a4 pushDeliveryManager;
    private c2 registrationDataProvider;
    public bo.app.r2 udm;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock brazeClassLock = new ReentrantLock();
    private static final Set<String> KNOWN_APP_CRAWLER_DEVICE_MODELS = l1.H("calypso appcrawler");
    private static final Set<String> NECESSARY_BRAZE_SDK_PERMISSIONS = l1.I("android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET");
    private static final ReentrantLock endpointProviderLock = new ReentrantLock();
    private static final List<BrazeConfig> pendingConfigurations = new ArrayList();
    private static final BrazeConfig clearConfigSentinel = new BrazeConfig.Builder().build();

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bP\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u001a\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J\b\u0010\u0015\u001a\u00020\u0013H\u0007J\u0019\u0010\u0019\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002R*\u0010$\u001a\u0004\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R*\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b-\u0010.\u0012\u0004\b3\u0010+\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010:\u001a\u00020\u00132\u0006\u00104\u001a\u00020\u00138F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b9\u0010+\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010;\u001a\u00020\u00138FX\u0087\u0004¢\u0006\f\u0012\u0004\b<\u0010+\u001a\u0004\b;\u00106R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020\b0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00110L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010B¨\u0006Q"}, d2 = {"Lcom/braze/Braze$Companion;", "", "Landroid/content/Context;", "context", "Lcom/braze/Braze;", "getInstance", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "", "getConfiguredApiKey", "Lcom/braze/IBrazeEndpointProvider;", "endpointProvider", "Lcom/amazon/aps/iva/kb0/q;", "setEndpointProvider", "Landroid/net/Uri;", "brazeEndpoint", "getApiEndpoint", "Lcom/braze/configuration/BrazeConfig;", "config", "", "configure", "enableMockNetworkRequestsAndDropEventsMode", "configuredCustomEndpoint", "setConfiguredCustomEndpoint$android_sdk_base_release", "(Ljava/lang/String;)V", "setConfiguredCustomEndpoint", "Landroid/content/Intent;", "intent", "Lbo/app/r1;", "brazeManager", "requestTriggersIfInAppMessageTestPush$android_sdk_base_release", "(Landroid/content/Intent;Lbo/app/r1;)V", "requestTriggersIfInAppMessageTestPush", "Lbo/app/v4;", "getSdkEnablementProvider", "shouldAllowSingletonInitialization", "sdkEnablementProvider", "Lbo/app/v4;", "getSdkEnablementProvider$android_sdk_base_release", "()Lbo/app/v4;", "setSdkEnablementProvider$android_sdk_base_release", "(Lbo/app/v4;)V", "getSdkEnablementProvider$android_sdk_base_release$annotations", "()V", "Lcom/braze/IBrazeNotificationFactory;", "customBrazeNotificationFactory", "Lcom/braze/IBrazeNotificationFactory;", "getCustomBrazeNotificationFactory", "()Lcom/braze/IBrazeNotificationFactory;", "setCustomBrazeNotificationFactory", "(Lcom/braze/IBrazeNotificationFactory;)V", "getCustomBrazeNotificationFactory$annotations", "isOffline", "getOutboundNetworkRequestsOffline", "()Z", "setOutboundNetworkRequestsOffline", "(Z)V", "getOutboundNetworkRequestsOffline$annotations", "outboundNetworkRequestsOffline", "isDisabled", "isDisabled$annotations", "", "KNOWN_APP_CRAWLER_DEVICE_MODELS", "Ljava/util/Set;", "NECESSARY_BRAZE_SDK_PERMISSIONS", "areOutboundNetworkRequestsOffline", "Z", "Ljava/util/concurrent/locks/ReentrantLock;", "brazeClassLock", "Ljava/util/concurrent/locks/ReentrantLock;", "clearConfigSentinel", "Lcom/braze/configuration/BrazeConfig;", "Lcom/braze/IBrazeEndpointProvider;", "endpointProviderLock", "instance", "Lcom/braze/Braze;", "", "pendingConfigurations", "Ljava/util/List;", "shouldMockNetworkRequestsAndDropEvents", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ BrazeConfig b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(BrazeConfig brazeConfig) {
                super(0);
                this.b = brazeConfig;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Braze.configure() called with configuration: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final d b = new d();

            public d() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Braze.configure() cannot be called while the singleton is still live.";
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final e b = new e();

            public e() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Braze.configure() called with a null config; Clearing all configuration values.";
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final h b = new h();

            public h() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests already being mocked. Note that events dispatched in this mode are dropped.";
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final i b = new i();

            public i() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Braze network requests will be mocked. Events dispatchedin this mode will be dropped.";
            }
        }

        /* loaded from: classes.dex */
        public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final j b = new j();

            public j() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Attempt to enable mocking Braze network requests had no effect since getInstance() has already been called.";
            }
        }

        /* loaded from: classes.dex */
        public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final m b = new m();

            public m() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Caught exception trying to get a Braze API endpoint from the BrazeEndpointProvider. Using the original URI";
            }
        }

        /* loaded from: classes.dex */
        public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final n b = new n();

            public n() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Caught exception while retrieving API key.";
            }
        }

        /* loaded from: classes.dex */
        public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final o b = new o();

            public o() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "SDK enablement provider was null. Returning SDK as enabled.";
            }
        }

        /* loaded from: classes.dex */
        public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final p b = new p();

            public p() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "API key not present. Actions will not be performed on the SDK.";
            }
        }

        /* loaded from: classes.dex */
        public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final q b = new q();

            public q() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "SDK is disabled. Actions will not be performed on the SDK.";
            }
        }

        /* loaded from: classes.dex */
        public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public r(boolean z) {
                super(0);
                this.b = z;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                String str;
                if (this.b) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                return "Braze SDK outbound network requests are now ".concat(str);
            }
        }

        /* loaded from: classes.dex */
        public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final s b = new s();

            public s() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Push contained key for fetching test triggers, fetching triggers.";
            }
        }

        /* loaded from: classes.dex */
        public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final t b = new t();

            public t() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "The instance is null. Allowing instance initialization";
            }
        }

        /* loaded from: classes.dex */
        public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final u b = new u();

            public u() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "The instance was stopped. Allowing instance initialization";
            }
        }

        /* loaded from: classes.dex */
        public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final v b = new v();

            public v() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "No API key was found previously. Allowing instance initialization";
            }
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final v4 getSdkEnablementProvider(Context context) {
            v4 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release == null) {
                v4 v4Var = new v4(context);
                setSdkEnablementProvider$android_sdk_base_release(v4Var);
                return v4Var;
            }
            return sdkEnablementProvider$android_sdk_base_release;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Uri setConfiguredCustomEndpoint$lambda$12$lambda$11(String str, Uri uri) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(uri, "brazeEndpoint");
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String encodedAuthority = parse.getEncodedAuthority();
            Uri.Builder buildUpon = uri.buildUpon();
            boolean z2 = false;
            if (scheme != null && !com.amazon.aps.iva.oe0.m.b0(scheme)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (encodedAuthority == null || com.amazon.aps.iva.oe0.m.b0(encodedAuthority)) {
                    z2 = true;
                }
                if (!z2) {
                    buildUpon.encodedAuthority(encodedAuthority);
                    buildUpon.scheme(scheme);
                    return buildUpon.build();
                }
            }
            return buildUpon.encodedAuthority(str).build();
        }

        private final boolean shouldAllowSingletonInitialization() {
            Braze braze = Braze.instance;
            if (braze == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, t.b, 2, (Object) null);
                return true;
            } else if (braze.isInstanceStopped) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, u.b, 3, (Object) null);
                return true;
            } else if (com.amazon.aps.iva.yb0.j.a(Boolean.FALSE, braze.isApiKeyPresent$android_sdk_base_release())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, v.b, 3, (Object) null);
                return true;
            } else {
                return false;
            }
        }

        public final boolean configure(Context context, BrazeConfig brazeConfig) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.I;
            BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new c(brazeConfig), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze braze = Braze.instance;
                if (braze != null && !braze.isInstanceStopped && com.amazon.aps.iva.yb0.j.a(Boolean.TRUE, braze.isApiKeyPresent$android_sdk_base_release())) {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.Companion, priority, (Throwable) null, d.b, 2, (Object) null);
                    reentrantLock.unlock();
                    return false;
                }
                if (brazeConfig != null) {
                    Braze.pendingConfigurations.add(brazeConfig);
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, Braze.Companion, priority, (Throwable) null, e.b, 2, (Object) null);
                    Braze.pendingConfigurations.add(Braze.clearConfigSentinel);
                }
                reentrantLock.unlock();
                return true;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        public final boolean enableMockNetworkRequestsAndDropEventsMode() {
            if (Braze.instance == null) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.instance == null) {
                        if (Braze.shouldMockNetworkRequestsAndDropEvents) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, h.b, 2, (Object) null);
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.Companion, BrazeLogger.Priority.I, (Throwable) null, i.b, 2, (Object) null);
                            Braze.shouldMockNetworkRequestsAndDropEvents = true;
                        }
                        return true;
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, j.b, 2, (Object) null);
            return false;
        }

        public final Uri getApiEndpoint(Uri uri) {
            com.amazon.aps.iva.yb0.j.f(uri, "brazeEndpoint");
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                IBrazeEndpointProvider iBrazeEndpointProvider = Braze.endpointProvider;
                if (iBrazeEndpointProvider != null) {
                    try {
                        Uri a = ((d0) iBrazeEndpointProvider).a(uri);
                        if (a != null) {
                            return a;
                        }
                    } catch (Exception e2) {
                        BrazeLogger.INSTANCE.brazelog(Braze.Companion, BrazeLogger.Priority.W, e2, m.b);
                    }
                }
                return uri;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final String getConfiguredApiKey(BrazeConfigurationProvider brazeConfigurationProvider) {
            com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "configurationProvider");
            try {
                return brazeConfigurationProvider.getBrazeApiKey().toString();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, n.b);
                return null;
            }
        }

        public final IBrazeNotificationFactory getCustomBrazeNotificationFactory() {
            return Braze.customBrazeNotificationFactory;
        }

        public final Braze getInstance(Context context) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            if (shouldAllowSingletonInitialization()) {
                ReentrantLock reentrantLock = Braze.brazeClassLock;
                reentrantLock.lock();
                try {
                    if (Braze.Companion.shouldAllowSingletonInitialization()) {
                        Braze braze = new Braze(context);
                        braze.isInstanceStopped = false;
                        Braze.instance = braze;
                        return braze;
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            Braze braze2 = Braze.instance;
            com.amazon.aps.iva.yb0.j.d(braze2, "null cannot be cast to non-null type com.braze.Braze");
            return braze2;
        }

        public final boolean getOutboundNetworkRequestsOffline() {
            return Braze.areOutboundNetworkRequestsOffline;
        }

        public final v4 getSdkEnablementProvider$android_sdk_base_release() {
            return Braze.sdkEnablementProvider;
        }

        public final boolean isDisabled() {
            v4 sdkEnablementProvider$android_sdk_base_release = getSdkEnablementProvider$android_sdk_base_release();
            if (sdkEnablementProvider$android_sdk_base_release != null) {
                Braze braze = Braze.instance;
                if (braze != null && com.amazon.aps.iva.yb0.j.a(Boolean.FALSE, braze.isApiKeyPresent$android_sdk_base_release())) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
                    return true;
                }
                boolean a = sdkEnablementProvider$android_sdk_base_release.a();
                if (a) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q.b, 2, (Object) null);
                }
                return a;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
            return false;
        }

        public final void requestTriggersIfInAppMessageTestPush$android_sdk_base_release(Intent intent, bo.app.r1 r1Var) {
            com.amazon.aps.iva.yb0.j.f(intent, "intent");
            com.amazon.aps.iva.yb0.j.f(r1Var, "brazeManager");
            String stringExtra = intent.getStringExtra("ab_push_fetch_test_triggers_key");
            if (stringExtra != null && com.amazon.aps.iva.yb0.j.a(stringExtra, "true")) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, s.b, 2, (Object) null);
                r1Var.a(new o3.a(null, null, null, null, 15, null).c());
            }
        }

        public final void setConfiguredCustomEndpoint$android_sdk_base_release(String str) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.Companion.setEndpointProvider(new d0(str, 7));
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setEndpointProvider(IBrazeEndpointProvider iBrazeEndpointProvider) {
            ReentrantLock reentrantLock = Braze.endpointProviderLock;
            reentrantLock.lock();
            try {
                Braze.endpointProvider = iBrazeEndpointProvider;
                com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setOutboundNetworkRequestsOffline(boolean z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(z), 2, (Object) null);
            ReentrantLock reentrantLock = Braze.brazeClassLock;
            reentrantLock.lock();
            try {
                Braze.areOutboundNetworkRequestsOffline = z;
                Braze braze = Braze.instance;
                if (braze != null) {
                    braze.setSyncPolicyOfflineStatus(z);
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void setSdkEnablementProvider$android_sdk_base_release(v4 v4Var) {
            Braze.sdkEnablementProvider = v4Var;
        }

        private Companion() {
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Braze SDK Initializing";
        }
    }

    /* loaded from: classes.dex */
    public static final class a1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public a1() {
            super(0);
        }

        public final void a() {
            bo.app.p1 a = bo.app.j.h.a();
            if (a != null) {
                Braze.this.getUdm$android_sdk_base_release().d().a(a);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Feature flags not enabled. Not refreshing feature flags.";
            }
        }

        public a2() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().j().q()) {
                Braze.this.getUdm$android_sdk_base_release().q().g();
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class a4 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a4 b = new a4();

        public a4() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK requires a non-empty API key. Check your braze.xml or BrazeConfig.";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Device build model matches a known crawler. Enabling mock network request mode. Device it: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ InAppMessageEvent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b3(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.b = inAppMessageEvent;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error retrying In-App Message from event " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b4 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final b4 b = new b4();

        public b4() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The Braze SDK is not integrated correctly. Please visit https://www.braze.com/docs/developer_guide/platform_integration_guides/android/initial_sdk_setup/android_sdk_integration/";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final c b = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to perform initial Braze singleton setup.";
        }
    }

    /* loaded from: classes.dex */
    public static final class c3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ InAppMessageEvent c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c3(InAppMessageEvent inAppMessageEvent) {
            super(0);
            this.c = inAppMessageEvent;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().p().a(this.c.getTriggerEvent(), this.c.getTriggerAction());
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Context c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to startup user dependency manager.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final b b = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging found. Setting up Firebase Cloud Messaging.";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final c b = new c();

            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Firebase Cloud Messaging requirements not met. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* renamed from: com.braze.Braze$d$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0935d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final C0935d b = new C0935d();

            public C0935d() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Automatic Firebase Cloud Messaging registration not enabled in configuration. Braze will not register for Firebase Cloud Messaging.";
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final e b = new e();

            public e() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Amazon Device Messaging found. Setting up Amazon Device Messaging";
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final f b = new f();

            public f() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "ADM manifest requirements not met. Braze will not register for ADM.";
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final g b = new g();

            public g() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Automatic ADM registration not enabled in configuration. Braze will not register for ADM.";
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final h b = new h();

            public h() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to setup pre SDK tasks";
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final i b = new i();

            public i() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Starting up a new user dependency manager";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(0);
            this.c = context;
        }

        public final void a() {
            boolean z;
            Braze.this.applyPendingRuntimeConfiguration$android_sdk_base_release();
            Braze.this.setConfigurationProvider$android_sdk_base_release(new BrazeConfigurationProvider(Braze.this.applicationContext));
            Braze braze = Braze.this;
            Companion companion = Braze.Companion;
            String configuredApiKey = companion.getConfiguredApiKey(braze.getConfigurationProvider$android_sdk_base_release());
            boolean z2 = false;
            if (configuredApiKey != null && !com.amazon.aps.iva.oe0.m.b0(configuredApiKey)) {
                z = false;
            } else {
                z = true;
            }
            braze.setApiKeyPresent$android_sdk_base_release(Boolean.valueOf(!z));
            BrazeLogger.setInitialLogLevelFromConfiguration(Braze.this.getConfigurationProvider$android_sdk_base_release().getLoggerInitialLogLevel());
            BrazeLogger.checkForSystemLogLevelProperty$default(false, 1, null);
            if (companion.getSdkEnablementProvider(this.c).a()) {
                companion.setOutboundNetworkRequestsOffline(true);
            }
            Braze.this.setPushDeliveryManager$android_sdk_base_release(new bo.app.a4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString()));
            Braze.this.setDeviceIdProvider$android_sdk_base_release(new k0(Braze.this.applicationContext));
            Braze.this.offlineUserStorageProvider = new j3(Braze.this.applicationContext);
            Braze.this.registrationDataProvider = new f4(Braze.this.applicationContext, Braze.this.getConfigurationProvider$android_sdk_base_release());
            String customEndpoint = Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint();
            if (customEndpoint == null || com.amazon.aps.iva.oe0.m.b0(customEndpoint)) {
                z2 = true;
            }
            if (!z2) {
                companion.setConfiguredCustomEndpoint$android_sdk_base_release(Braze.this.getConfigurationProvider$android_sdk_base_release().getCustomEndpoint());
            }
            try {
                if (Braze.this.getConfigurationProvider$android_sdk_base_release().isFirebaseCloudMessagingRegistrationEnabled()) {
                    Context context = this.c;
                    c2 c2Var = Braze.this.registrationDataProvider;
                    if (c2Var != null) {
                        bo.app.i1 i1Var = new bo.app.i1(context, c2Var);
                        if (i1Var.a()) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, b.b, 2, (Object) null);
                            String firebaseCloudMessagingSenderIdKey = Braze.this.getConfigurationProvider$android_sdk_base_release().getFirebaseCloudMessagingSenderIdKey();
                            if (firebaseCloudMessagingSenderIdKey != null) {
                                i1Var.a(firebaseCloudMessagingSenderIdKey);
                            }
                        } else {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
                        }
                    } else {
                        com.amazon.aps.iva.yb0.j.m("registrationDataProvider");
                        throw null;
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, C0935d.b, 2, (Object) null);
                }
                if (Braze.this.getConfigurationProvider$android_sdk_base_release().isAdmMessagingRegistrationEnabled()) {
                    if (bo.app.b.c.a(Braze.this.applicationContext)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, e.b, 2, (Object) null);
                        Context context2 = Braze.this.applicationContext;
                        c2 c2Var2 = Braze.this.registrationDataProvider;
                        if (c2Var2 != null) {
                            new bo.app.b(context2, c2Var2).a();
                        } else {
                            com.amazon.aps.iva.yb0.j.m("registrationDataProvider");
                            throw null;
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.I, (Throwable) null, g.b, 2, (Object) null);
                }
                Braze.this.verifyProperSdkSetup();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e2, h.b);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, i.b, 2, (Object) null);
            try {
                Braze braze2 = Braze.this;
                Context context3 = braze2.applicationContext;
                j3 j3Var = Braze.this.offlineUserStorageProvider;
                if (j3Var != null) {
                    BrazeConfigurationProvider configurationProvider$android_sdk_base_release = Braze.this.getConfigurationProvider$android_sdk_base_release();
                    bo.app.z1 externalIEventMessenger$android_sdk_base_release = Braze.this.getExternalIEventMessenger$android_sdk_base_release();
                    bo.app.w1 deviceIdProvider$android_sdk_base_release = Braze.this.getDeviceIdProvider$android_sdk_base_release();
                    c2 c2Var3 = Braze.this.registrationDataProvider;
                    if (c2Var3 != null) {
                        braze2.setUserSpecificMemberVariablesAndStartDispatch(new m6(context3, j3Var, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, c2Var3, Braze.this.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, Braze.this.getDeviceDataProvider()));
                        return;
                    } else {
                        com.amazon.aps.iva.yb0.j.m("registrationDataProvider");
                        throw null;
                    }
                }
                com.amazon.aps.iva.yb0.j.m("offlineUserStorageProvider");
                throw null;
            } catch (Exception e3) {
                BrazeLogger.INSTANCE.brazelog(Braze.this, BrazeLogger.Priority.E, e3, a.b);
                Braze.this.publishError(e3);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log purchase event of: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d2(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set the push token " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class d3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ com.amazon.aps.iva.xb0.a c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            final /* synthetic */ com.amazon.aps.iva.xb0.a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.c = aVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                return new a(this.c, dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    x.i0(obj);
                    this.c.invoke();
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d3(com.amazon.aps.iva.xb0.a aVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((d3) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new d3(this.c, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                x.i0(obj);
                com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new a(this.c, null));
                return com.amazon.aps.iva.kb0.q.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2) {
            super(0);
            this.b = j;
            this.c = j2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return com.amazon.aps.iva.c.b.b(new StringBuilder("Braze SDK loaded in "), TimeUnit.MILLISECONDS.convert(this.b - this.c, TimeUnit.NANOSECONDS), " ms.");
        }
    }

    /* loaded from: classes.dex */
    public static final class e1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ BigDecimal d;
        final /* synthetic */ int e;
        final /* synthetic */ Braze f;
        final /* synthetic */ BrazeProperties g;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Log purchase input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final b b = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Purchase logged with invalid properties. Not logging custom event to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e1(String str, String str2, BigDecimal bigDecimal, int i, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = bigDecimal;
            this.e = i;
            this.f = braze;
            this.g = brazeProperties;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
            if (r2.isInvalid() == true) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = r0.b
                java.lang.String r2 = r0.c
                java.math.BigDecimal r3 = r0.d
                int r4 = r0.e
                com.braze.Braze r5 = r0.f
                bo.app.r2 r5 = r5.getUdm$android_sdk_base_release()
                bo.app.a5 r5 = r5.j()
                boolean r2 = com.braze.support.ValidationUtils.isValidLogPurchaseInput(r1, r2, r3, r4, r5)
                if (r2 != 0) goto L29
                com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.Braze r4 = r0.f
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$e1$a r7 = com.braze.Braze.e1.a.b
                r6 = 0
                r8 = 2
                r9 = 0
                com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)
                return
            L29:
                com.braze.models.outgoing.BrazeProperties r2 = r0.g
                if (r2 == 0) goto L35
                boolean r2 = r2.isInvalid()
                r3 = 1
                if (r2 != r3) goto L35
                goto L36
            L35:
                r3 = 0
            L36:
                if (r3 == 0) goto L47
                com.braze.support.BrazeLogger r4 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.Braze r5 = r0.f
                com.braze.support.BrazeLogger$Priority r6 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$e1$b r8 = com.braze.Braze.e1.b.b
                r7 = 0
                r9 = 2
                r10 = 0
                com.braze.support.BrazeLogger.brazelog$default(r4, r5, r6, r7, r8, r9, r10)
                return
            L47:
                java.lang.String r1 = com.braze.support.ValidationUtils.ensureBrazeFieldLength(r1)
                bo.app.j$a r11 = bo.app.j.h
                java.lang.String r13 = r0.c
                com.amazon.aps.iva.yb0.j.c(r13)
                java.math.BigDecimal r14 = r0.d
                com.amazon.aps.iva.yb0.j.c(r14)
                int r15 = r0.e
                com.braze.models.outgoing.BrazeProperties r2 = r0.g
                r12 = r1
                r16 = r2
                bo.app.p1 r2 = r11.a(r12, r13, r14, r15, r16)
                if (r2 != 0) goto L65
                return
            L65:
                com.braze.Braze r3 = r0.f
                bo.app.r2 r3 = r3.getUdm$android_sdk_base_release()
                bo.app.r1 r3 = r3.d()
                boolean r3 = r3.a(r2)
                if (r3 == 0) goto L89
                com.braze.Braze r3 = r0.f
                bo.app.r2 r3 = r3.getUdm$android_sdk_base_release()
                bo.app.c6 r3 = r3.p()
                bo.app.t3 r4 = new bo.app.t3
                com.braze.models.outgoing.BrazeProperties r5 = r0.g
                r4.<init>(r1, r5, r2)
                r3.a(r4)
            L89:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.e1.a():void");
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Push token "), this.b, " registered and immediately being flushed.");
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final b b = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Push token must not be null or blank. Not registering for push with Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e2(String str) {
            super(0);
            this.c = str;
        }

        public final void a() {
            boolean z;
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.I, (Throwable) null, new a(this.c), 2, (Object) null);
            String str = this.c;
            if (str != null && !com.amazon.aps.iva.oe0.m.b0(str)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                c2 c2Var = Braze.this.registrationDataProvider;
                if (c2Var != null) {
                    c2Var.a(this.c);
                    Braze.this.getUdm$android_sdk_base_release().h().e();
                    Braze.this.requestImmediateDataFlush();
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("registrationDataProvider");
                throw null;
            }
            BrazeLogger.brazelog$default(brazeLogger, Braze.this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final e3 b = new e3();

        public e3() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Got error in singleton run without result";
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to update ContentCard storage provider with single card update. User id: " + this.b + " Serialized json: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class f0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final f0 b = new f0();

        public f0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "The ContentCardsUpdatedEvent was null. Returning the default value for the unviewed card count.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f1(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error logging Push Delivery " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f2(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to remove " + this.b.getName() + " subscriber.";
        }
    }

    /* loaded from: classes.dex */
    public static final class f3 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ com.amazon.aps.iva.xb0.p c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            final /* synthetic */ com.amazon.aps.iva.xb0.p c;

            /* renamed from: com.braze.Braze$f3$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0936a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
                int b;
                private /* synthetic */ Object c;
                final /* synthetic */ com.amazon.aps.iva.xb0.p d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0936a(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.ob0.d dVar) {
                    super(2, dVar);
                    this.d = pVar;
                }

                @Override // com.amazon.aps.iva.xb0.p
                /* renamed from: a */
                public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                    return ((C0936a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                    C0936a c0936a = new C0936a(this.d, dVar);
                    c0936a.c = obj;
                    return c0936a;
                }

                @Override // com.amazon.aps.iva.qb0.a
                public final Object invokeSuspend(Object obj) {
                    com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                    int i = this.b;
                    if (i != 0) {
                        if (i == 1) {
                            x.i0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        x.i0(obj);
                        com.amazon.aps.iva.xb0.p pVar = this.d;
                        this.b = 1;
                        obj = pVar.invoke((g0) this.c, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.c = pVar;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                return new a(this.c, dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                Object e;
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    x.i0(obj);
                    e = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new C0936a(this.c, null));
                    return e;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f3(com.amazon.aps.iva.xb0.p pVar, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = pVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((f3) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new f3(this.c, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.se0.n0 b = com.amazon.aps.iva.se0.i.b(x4.a, null, null, new a(this.c, null), 3);
                this.b = 1;
                obj = b.K(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Cannot add null or blank card json to storage. Returning. User id: " + this.b + " Serialized json: " + this.c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Braze braze, String str2) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
        }

        public final void a() {
            if (com.amazon.aps.iva.oe0.m.b0(this.b)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new a(this.d, this.b), 2, (Object) null);
                return;
            }
            this.c.getUdm$android_sdk_base_release().o().a(new y(this.b), this.d);
            this.c.getExternalIEventMessenger$android_sdk_base_release().a(this.c.getUdm$android_sdk_base_release().o().b(), ContentCardsUpdatedEvent.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g1(String str, long j) {
            super(0);
            this.c = str;
            this.d = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().d().a(this.c);
            Braze.this.schedulePushDelivery$android_sdk_base_release(this.d);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g2 b = new g2();

        public g2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request Content Cards refresh from Braze servers.";
        }
    }

    /* loaded from: classes.dex */
    public static final class g3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final g3 b = new g3();

        public g3() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error scheduling push delivery";
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Class b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Class cls) {
            super(0);
            this.b = cls;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add synchronous subscriber for class: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h0 extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ IValueCallback c;
        final /* synthetic */ Braze d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            final /* synthetic */ IValueCallback c;
            final /* synthetic */ Braze d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(IValueCallback iValueCallback, Braze braze, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.c = iValueCallback;
                this.d = braze;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((a) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                return new a(this.c, this.d, dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    x.i0(obj);
                    IValueCallback iValueCallback = this.c;
                    BrazeUser brazeUser = this.d.brazeUser;
                    if (brazeUser != null) {
                        iValueCallback.onSuccess(brazeUser);
                        return com.amazon.aps.iva.kb0.q.a;
                    }
                    com.amazon.aps.iva.yb0.j.m("brazeUser");
                    throw null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(IValueCallback iValueCallback, Braze braze, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = iValueCallback;
            this.d = braze;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((h0) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new h0(this.c, this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ob0.g coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
                a aVar2 = new a(this.c, this.d, null);
                this.b = 1;
                if (com.amazon.aps.iva.se0.i.g(this, coroutineContext, aVar2) == aVar) {
                    return aVar;
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h1 b = new h1();

        public h1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to flush push delivery events";
        }
    }

    /* loaded from: classes.dex */
    public static final class h2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Content Cards is not enabled, skipping API call to refresh";
            }
        }

        public h2() {
            super(0);
        }

        public final void a() {
            if (Braze.this.getUdm$android_sdk_base_release().j().o()) {
                bo.app.r1.a(Braze.this.getUdm$android_sdk_base_release().d(), Braze.this.getUdm$android_sdk_base_release().o().e(), Braze.this.getUdm$android_sdk_base_release().o().f(), 0, true, 4, null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h3(long j) {
            super(0);
            this.c = j;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().d().a(this.c);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Applying any pending runtime configuration values";
        }
    }

    /* loaded from: classes.dex */
    public static final class i0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i0 b = new i0();

        public i0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    /* loaded from: classes.dex */
    public static final class i1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i1(String str) {
            super(0);
            this.c = str;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().d().b(this.c);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i2 b = new i2();

        public i2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request Content Cards refresh from the cache.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j b = new j();

        public j() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Clearing config values";
        }
    }

    /* loaded from: classes.dex */
    public static final class j1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final j1 b = new j1();

        public j1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log push notification action clicked.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public j2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger$android_sdk_base_release().a(Braze.this.getUdm$android_sdk_base_release().o().b(), ContentCardsUpdatedEvent.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ BrazeConfig b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(BrazeConfig brazeConfig) {
            super(0);
            this.b = brazeConfig;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Setting pending config object: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push notification action clicked.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final b b = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Action ID cannot be null or blank.";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final c b = new c();

            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Action Type cannot be null or blank.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k1(String str, Braze braze, String str2, String str3) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
            this.e = str3;
        }

        public final void a() {
            boolean z;
            boolean z2;
            String str = this.b;
            boolean z3 = false;
            if (str != null && !com.amazon.aps.iva.oe0.m.b0(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            String str2 = this.d;
            if (str2 != null && !com.amazon.aps.iva.oe0.m.b0(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
                return;
            }
            String str3 = this.e;
            if (str3 == null || com.amazon.aps.iva.oe0.m.b0(str3)) {
                z3 = true;
            }
            if (z3) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, c.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().d().a(v3.k.a(this.b, this.d, this.e));
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k2 b = new k2();

        public k2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request refresh of feed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the cached ContentCardsUpdatedEvent.";
        }
    }

    /* loaded from: classes.dex */
    public static final class l2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public l2() {
            super(0);
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().d().a(new o3.a(null, null, null, null, 15, null).b());
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;

        public m(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((m) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new m(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                x.i0(obj);
                if (Braze.this.getUdm$android_sdk_base_release().j().o()) {
                    return Braze.this.getUdm$android_sdk_base_release().o().b();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class m2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final m2 b = new m2();

        public m2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve and publish feed from offline cache.";
        }
    }

    /* loaded from: classes.dex */
    public static final class m3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m3(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set sync policy offline to " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to set external id to: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n0 b = new n0();

        public n0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error handling test in-app message push";
        }
    }

    /* loaded from: classes.dex */
    public static final class n1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Intent b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n1(Intent intent) {
            super(0);
            this.b = intent;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Error logging push notification with intent: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public n2() {
            super(0);
        }

        public final void a() {
            Braze.this.getExternalIEventMessenger$android_sdk_base_release().a(Braze.this.getUdm$android_sdk_base_release().b().a(), FeedUpdatedEvent.class);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ boolean b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z) {
                super(0);
                this.b = z;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Setting the image loader deny network downloads to " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n3(boolean z) {
            super(0);
            this.c = z;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().d().b(this.c);
            Braze.this.getUdm$android_sdk_base_release().i().a(this.c);
            Braze braze = Braze.this;
            if (braze.imageLoader != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, braze, (BrazeLogger.Priority) null, (Throwable) null, new a(this.c), 3, (Object) null);
                Braze.this.getImageLoader().setOffline(this.c);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ String d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "userId passed to changeUser was null or empty. The current user will remain the active user.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Rejected user id with byte length longer than 997. Not changing user. Input user id: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Received request to change current user "), this.b, " to the same user id. Not changing user.");
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Set sdk auth signature on changeUser call: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Changing anonymous user to " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                StringBuilder sb = new StringBuilder("Changing current user ");
                sb.append(this.b);
                sb.append(" to new user ");
                return com.amazon.aps.iva.o0.t1.b(sb, this.c, '.');
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Set sdk auth signature on changeUser call: " + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, Braze braze, String str2) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = str2;
        }

        public final void a() {
            boolean z;
            String str = this.b;
            boolean z2 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            } else if (StringUtils.getByteSize(this.b) <= 997) {
                BrazeUser brazeUser = this.c.brazeUser;
                if (brazeUser != null) {
                    String userId = brazeUser.getUserId();
                    if (com.amazon.aps.iva.yb0.j.a(userId, this.b)) {
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, this.c, BrazeLogger.Priority.I, (Throwable) null, new c(this.b), 2, (Object) null);
                        String str2 = this.d;
                        if (str2 == null || com.amazon.aps.iva.oe0.m.b0(str2)) {
                            z2 = true;
                        }
                        if (!z2) {
                            BrazeLogger.brazelog$default(brazeLogger, this.c, (BrazeLogger.Priority) null, (Throwable) null, new d(this.d), 3, (Object) null);
                            this.c.getUdm$android_sdk_base_release().f().a(this.d);
                            return;
                        }
                        return;
                    }
                    this.c.getUdm$android_sdk_base_release().c().b();
                    this.c.getUdm$android_sdk_base_release().l().a(DateTimeUtils.nowInSeconds());
                    if (com.amazon.aps.iva.yb0.j.a(userId, "")) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new e(this.b), 2, (Object) null);
                        j3 j3Var = this.c.offlineUserStorageProvider;
                        if (j3Var != null) {
                            j3Var.a(this.b);
                            BrazeUser brazeUser2 = this.c.brazeUser;
                            if (brazeUser2 != null) {
                                brazeUser2.setUserId(this.b);
                            } else {
                                com.amazon.aps.iva.yb0.j.m("brazeUser");
                                throw null;
                            }
                        } else {
                            com.amazon.aps.iva.yb0.j.m("offlineUserStorageProvider");
                            throw null;
                        }
                    } else {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new f(userId, this.b), 2, (Object) null);
                        this.c.getExternalIEventMessenger$android_sdk_base_release().a(new FeedUpdatedEvent(new ArrayList(), this.b, false, DateTimeUtils.nowInSeconds()), FeedUpdatedEvent.class);
                    }
                    this.c.getUdm$android_sdk_base_release().d().e();
                    j3 j3Var2 = this.c.offlineUserStorageProvider;
                    if (j3Var2 != null) {
                        j3Var2.a(this.b);
                        bo.app.r2 udm$android_sdk_base_release = this.c.getUdm$android_sdk_base_release();
                        Context context = this.c.applicationContext;
                        j3 j3Var3 = this.c.offlineUserStorageProvider;
                        if (j3Var3 != null) {
                            BrazeConfigurationProvider configurationProvider$android_sdk_base_release = this.c.getConfigurationProvider$android_sdk_base_release();
                            bo.app.z1 externalIEventMessenger$android_sdk_base_release = this.c.getExternalIEventMessenger$android_sdk_base_release();
                            bo.app.w1 deviceIdProvider$android_sdk_base_release = this.c.getDeviceIdProvider$android_sdk_base_release();
                            c2 c2Var = this.c.registrationDataProvider;
                            if (c2Var != null) {
                                this.c.setUserSpecificMemberVariablesAndStartDispatch(new m6(context, j3Var3, configurationProvider$android_sdk_base_release, externalIEventMessenger$android_sdk_base_release, deviceIdProvider$android_sdk_base_release, c2Var, this.c.getPushDeliveryManager$android_sdk_base_release(), Braze.shouldMockNetworkRequestsAndDropEvents, Braze.areOutboundNetworkRequestsOffline, this.c.getDeviceDataProvider()));
                                String str3 = this.d;
                                if (str3 == null || com.amazon.aps.iva.oe0.m.b0(str3)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, (BrazeLogger.Priority) null, (Throwable) null, new g(this.d), 3, (Object) null);
                                    this.c.getUdm$android_sdk_base_release().f().a(this.d);
                                }
                                this.c.getUdm$android_sdk_base_release().g().g();
                                this.c.getUdm$android_sdk_base_release().d().d();
                                this.c.getUdm$android_sdk_base_release().d().a(new o3.a(null, null, null, null, 15, null).b());
                                udm$android_sdk_base_release.a();
                                return;
                            }
                            com.amazon.aps.iva.yb0.j.m("registrationDataProvider");
                            throw null;
                        }
                        com.amazon.aps.iva.yb0.j.m("offlineUserStorageProvider");
                        throw null;
                    }
                    com.amazon.aps.iva.yb0.j.m("offlineUserStorageProvider");
                    throw null;
                }
                com.amazon.aps.iva.yb0.j.m("brazeUser");
                throw null;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, new b(this.b), 2, (Object) null);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Intent b;
        final /* synthetic */ Braze c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(Intent intent, Braze braze) {
            super(0);
            this.b = intent;
            this.c = braze;
        }

        public final void a() {
            Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.b, this.c.getUdm$android_sdk_base_release().d());
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Intent b;
        final /* synthetic */ Braze c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Cannot logPushNotificationOpened with null intent. Not logging push click.";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Logging push click. Campaign Id: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final c b = new c();

            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "No campaign Id associated with this notification (this is expected for test sends). Not logging push click.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o1(Intent intent, Braze braze) {
            super(0);
            this.b = intent;
            this.c = braze;
        }

        public final void a() {
            boolean z;
            Intent intent = this.b;
            if (intent == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            String stringExtra = intent.getStringExtra("cid");
            if (stringExtra != null && !com.amazon.aps.iva.oe0.m.b0(stringExtra)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, new b(stringExtra), 2, (Object) null);
                this.c.getUdm$android_sdk_base_release().d().a(y3.j.a(stringExtra));
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
            }
            Braze.Companion.requestTriggersIfInAppMessageTestPush$android_sdk_base_release(this.b, this.c.getUdm$android_sdk_base_release().d());
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final o3 b = new o3();

        public o3() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for Content Cards updates.";
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final p b = new p();

        public p() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to close session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class p0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final p0 b = new p0();

        public p0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Ephemeral events enabled";
        }
    }

    /* loaded from: classes.dex */
    public static final class p1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p1(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log push story page clicked for pageId: " + this.b + " campaignId: " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Activity b;
        final /* synthetic */ Braze c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Cannot close session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Activity activity, Braze braze) {
            super(0);
            this.b = activity;
            this.c = braze;
        }

        public final void a() {
            if (this.b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().d().closeSession(this.b);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Set c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(String str, Set set, boolean z) {
            super(0);
            this.b = str;
            this.c = set;
            this.d = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Checking event key [" + this.b + "] against ephemeral event list " + this.c + " and got match?: " + this.d;
        }
    }

    /* loaded from: classes.dex */
    public static final class q1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ Braze d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Push story page click input was invalid. Not logging in-app purchase to Braze.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q1(String str, String str2, Braze braze) {
            super(0);
            this.b = str;
            this.c = str2;
            this.d = braze;
        }

        public final void a() {
            if (!ValidationUtils.isValidPushStoryClickInput(this.b, this.c)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.d, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
                return;
            }
            j.a aVar = bo.app.j.h;
            String str = this.b;
            com.amazon.aps.iva.yb0.j.c(str);
            String str2 = this.c;
            com.amazon.aps.iva.yb0.j.c(str2);
            bo.app.p1 e = aVar.e(str, str2);
            if (e != null) {
                this.d.getUdm$android_sdk_base_release().d().a(e);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q2(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request geofence refresh with rate limit ignore: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final r b = new r();

        public r() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve the current user.";
        }
    }

    /* loaded from: classes.dex */
    public static final class r0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log custom event: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class r1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final r1 b = new r1();

        public r1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to open session.";
        }
    }

    /* loaded from: classes.dex */
    public static final class r2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r2(boolean z) {
            super(0);
            this.c = z;
        }

        public final void a() {
            Braze.this.getUdm$android_sdk_base_release().n().requestGeofenceRefresh(this.c);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;

        public s(com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((s) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new s(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                x.i0(obj);
                BrazeUser brazeUser = Braze.this.brazeUser;
                if (brazeUser != null) {
                    return brazeUser;
                }
                com.amazon.aps.iva.yb0.j.m("brazeUser");
                throw null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class s0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Braze c;
        final /* synthetic */ BrazeProperties d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.amazon.aps.iva.yb0.d0 d0Var) {
                super(0);
                this.b = d0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Logged custom event with name "), (String) this.b.b, " was invalid. Not logging custom event to Braze.");
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ com.amazon.aps.iva.yb0.d0 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(com.amazon.aps.iva.yb0.d0 d0Var) {
                super(0);
                this.b = d0Var;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return defpackage.b.c(new StringBuilder("Custom event with name "), (String) this.b.b, " logged with invalid properties. Not logging custom event to Braze.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(String str, Braze braze, BrazeProperties brazeProperties) {
            super(0);
            this.b = str;
            this.c = braze;
            this.d = brazeProperties;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r1.isInvalid() == true) goto L10;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r10 = this;
                com.amazon.aps.iva.yb0.d0 r0 = new com.amazon.aps.iva.yb0.d0
                r0.<init>()
                java.lang.String r1 = r10.b
                r0.b = r1
                com.braze.Braze r2 = r10.c
                bo.app.r2 r2 = r2.getUdm$android_sdk_base_release()
                bo.app.a5 r2 = r2.j()
                boolean r1 = com.braze.support.ValidationUtils.isValidLogCustomEventInput(r1, r2)
                if (r1 != 0) goto L2b
                com.braze.support.BrazeLogger r2 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.Braze r3 = r10.c
                com.braze.support.BrazeLogger$Priority r4 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$s0$a r6 = new com.braze.Braze$s0$a
                r6.<init>(r0)
                r5 = 0
                r7 = 2
                r8 = 0
                com.braze.support.BrazeLogger.brazelog$default(r2, r3, r4, r5, r6, r7, r8)
                return
            L2b:
                com.braze.models.outgoing.BrazeProperties r1 = r10.d
                if (r1 == 0) goto L37
                boolean r1 = r1.isInvalid()
                r2 = 1
                if (r1 != r2) goto L37
                goto L38
            L37:
                r2 = 0
            L38:
                if (r2 == 0) goto L4c
                com.braze.support.BrazeLogger r3 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.Braze r4 = r10.c
                com.braze.support.BrazeLogger$Priority r5 = com.braze.support.BrazeLogger.Priority.W
                com.braze.Braze$s0$b r7 = new com.braze.Braze$s0$b
                r7.<init>(r0)
                r6 = 0
                r8 = 2
                r9 = 0
                com.braze.support.BrazeLogger.brazelog$default(r3, r4, r5, r6, r7, r8, r9)
                return
            L4c:
                T r1 = r0.b
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = com.braze.support.ValidationUtils.ensureBrazeFieldLength(r1)
                r0.b = r1
                bo.app.j$a r2 = bo.app.j.h
                com.braze.models.outgoing.BrazeProperties r3 = r10.d
                bo.app.p1 r1 = r2.a(r1, r3)
                if (r1 != 0) goto L61
                return
            L61:
                com.braze.Braze r2 = r10.c
                T r3 = r0.b
                java.lang.String r3 = (java.lang.String) r3
                boolean r2 = com.braze.Braze.access$isEphemeralEventKey(r2, r3)
                if (r2 == 0) goto L7c
                com.braze.Braze r2 = r10.c
                bo.app.r2 r2 = r2.getUdm$android_sdk_base_release()
                bo.app.a5 r2 = r2.j()
                boolean r2 = r2.p()
                goto L8a
            L7c:
                com.braze.Braze r2 = r10.c
                bo.app.r2 r2 = r2.getUdm$android_sdk_base_release()
                bo.app.r1 r2 = r2.d()
                boolean r2 = r2.a(r1)
            L8a:
                if (r2 == 0) goto La4
                com.braze.Braze r2 = r10.c
                bo.app.r2 r2 = r2.getUdm$android_sdk_base_release()
                bo.app.c6 r2 = r2.p()
                bo.app.c0 r3 = new bo.app.c0
                T r0 = r0.b
                java.lang.String r0 = (java.lang.String) r0
                com.braze.models.outgoing.BrazeProperties r4 = r10.d
                r3.<init>(r0, r4, r1)
                r2.a(r3)
            La4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.Braze.s0.a():void");
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Activity b;
        final /* synthetic */ Braze c;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Cannot open session with null activity.";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s1(Activity activity, Braze braze) {
            super(0);
            this.b = activity;
            this.c = braze;
        }

        public final void a() {
            if (this.b == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this.c, BrazeLogger.Priority.I, (Throwable) null, a.b, 2, (Object) null);
            } else {
                this.c.getUdm$android_sdk_base_release().d().openSession(this.b);
            }
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final s3 b = new s3();

        public s3() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber for feed updates.";
        }
    }

    /* loaded from: classes.dex */
    public static final class t1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final t1 b = new t1();

        public t1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to flush push delivery events";
        }
    }

    /* loaded from: classes.dex */
    public static final class u1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public u1() {
            super(0);
        }

        public final void a() {
            bo.app.r1.a(Braze.this.getUdm$android_sdk_base_release().d(), 0L, 1, (Object) null);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final u3 b = new u3();

        public u3() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to add subscriber to new in-app messages.";
        }
    }

    /* loaded from: classes.dex */
    public static final class v1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final v1 b = new v1();

        public v1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "User dependency manager is uninitialized. Not publishing error.";
        }
    }

    /* loaded from: classes.dex */
    public static final class w1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w1(Throwable th) {
            super(0);
            this.b = th;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log throwable: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class w2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final w2 b = new w2();

        public w2() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to request data flush.";
        }
    }

    /* loaded from: classes.dex */
    public static final class x2 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "requestImmediateDataFlush() called";
            }
        }

        public x2() {
            super(0);
        }

        public final void a() {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, Braze.this, BrazeLogger.Priority.V, (Throwable) null, a.b, 2, (Object) null);
            Braze.this.getUdm$android_sdk_base_release().d().c();
        }

        @Override // com.amazon.aps.iva.xb0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final z0 b = new z0();

        public z0() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log that the feed was displayed.";
        }
    }

    /* loaded from: classes.dex */
    public static final class z1 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final z1 b = new z1();

        public z1() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to refresh feature flags.";
        }
    }

    /* loaded from: classes.dex */
    public static final class z3 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z3(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return defpackage.b.c(new StringBuilder("The Braze SDK requires the permission "), this.b, ". Check your AndroidManifest.");
        }
    }

    public Braze(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        long nanoTime = System.nanoTime();
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, a.b, 3, (Object) null);
        Context applicationContext = context.getApplicationContext();
        com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
        String str = Build.MODEL;
        if (str != null) {
            Set<String> set = KNOWN_APP_CRAWLER_DEVICE_MODELS;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (set.contains(lowerCase)) {
                BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.I, (Throwable) null, new b(str), 2, (Object) null);
                Companion.enableMockNetworkRequestsAndDropEventsMode();
            }
        }
        setImageLoader(new DefaultBrazeImageLoader(this.applicationContext));
        this.externalIEventMessenger = new x0(Companion.getSdkEnablementProvider(this.applicationContext));
        run$android_sdk_base_release(c.b, false, new d(context));
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, new e(System.nanoTime(), nanoTime), 3, (Object) null);
    }

    public static final boolean configure(Context context, BrazeConfig brazeConfig) {
        return Companion.configure(context, brazeConfig);
    }

    private final ContentCardsUpdatedEvent getCachedContentCardsUpdatedEvent() {
        return (ContentCardsUpdatedEvent) runForResult$default(this, null, l.b, false, new m(null), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bo.app.v1 getDeviceDataProvider() {
        bo.app.v1 v1Var = deviceDataProvider;
        if (v1Var == null) {
            v1Var = new j0(this.applicationContext, getConfigurationProvider$android_sdk_base_release());
        }
        deviceDataProvider = v1Var;
        return v1Var;
    }

    public static final Braze getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isEphemeralEventKey(String str) {
        if (!getConfigurationProvider$android_sdk_base_release().isEphemeralEventsEnabled()) {
            return false;
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, p0.b, 2, (Object) null);
        Set<String> ephemeralEventKeys = getConfigurationProvider$android_sdk_base_release().getEphemeralEventKeys();
        boolean contains = ephemeralEventKeys.contains(str);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new q0(str, ephemeralEventKeys, contains), 2, (Object) null);
        return contains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishError(Throwable th) {
        if (this.udm == null) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.V, th, v1.b);
            return;
        }
        try {
            getUdm$android_sdk_base_release().c().a(th, Throwable.class);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e4, new w1(th));
        }
    }

    public static /* synthetic */ void run$android_sdk_base_release$default(Braze braze, com.amazon.aps.iva.xb0.a aVar, boolean z, com.amazon.aps.iva.xb0.a aVar2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = true;
        }
        braze.run$android_sdk_base_release(aVar, z, aVar2);
    }

    private final <T> T runForResult(T t, com.amazon.aps.iva.xb0.a<String> aVar, boolean z, com.amazon.aps.iva.xb0.p<? super g0, ? super com.amazon.aps.iva.ob0.d<? super T>, ? extends Object> pVar) {
        Object e4;
        if (!z || !Companion.isDisabled()) {
            try {
                e4 = com.amazon.aps.iva.se0.i.e(com.amazon.aps.iva.ob0.h.b, new f3(pVar, null));
                return (T) e4;
            } catch (Exception e5) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e5, aVar);
                publishError(e5);
                return t;
            }
        }
        return t;
    }

    public static /* synthetic */ Object runForResult$default(Braze braze, Object obj, com.amazon.aps.iva.xb0.a aVar, boolean z, com.amazon.aps.iva.xb0.p pVar, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            z = true;
        }
        return braze.runForResult(obj, aVar, z, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSyncPolicyOfflineStatus(boolean z) {
        run$android_sdk_base_release$default(this, new m3(z), false, new n3(z), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserSpecificMemberVariablesAndStartDispatch(m6 m6Var) {
        setUdm$android_sdk_base_release(m6Var);
        x4.a.a(getUdm$android_sdk_base_release().c());
        l6 g4 = getUdm$android_sdk_base_release().g();
        bo.app.r1 d4 = getUdm$android_sdk_base_release().d();
        j3 j3Var = this.offlineUserStorageProvider;
        if (j3Var != null) {
            this.brazeUser = new BrazeUser(g4, d4, j3Var.a(), getUdm$android_sdk_base_release().m(), getUdm$android_sdk_base_release().j());
            getUdm$android_sdk_base_release().r().a(getUdm$android_sdk_base_release().c());
            getUdm$android_sdk_base_release().e().d();
            getUdm$android_sdk_base_release().k().a(getUdm$android_sdk_base_release().e());
            return;
        }
        com.amazon.aps.iva.yb0.j.m("offlineUserStorageProvider");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void verifyProperSdkSetup() {
        boolean z = true;
        for (String str : NECESSARY_BRAZE_SDK_PERMISSIONS) {
            if (!PermissionUtils.hasPermission(this.applicationContext, str)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new z3(str), 2, (Object) null);
                z = false;
            }
        }
        if (com.amazon.aps.iva.oe0.m.b0(getConfigurationProvider$android_sdk_base_release().getBrazeApiKey().toString())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a4.b, 2, (Object) null);
            z = false;
        }
        if (!z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b4.b, 2, (Object) null);
        }
    }

    public final /* synthetic */ void addSerializedCardJsonToStorage$android_sdk_base_release(String str, String str2) {
        com.amazon.aps.iva.yb0.j.f(str, "serializedCardJson");
        run$android_sdk_base_release$default(this, new f(str2, str), false, new g(str, this, str2), 2, null);
    }

    public <T> void addSingleSynchronousSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        try {
            this.externalIEventMessenger.b(cls, iEventSubscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, new h(cls));
            publishError(e4);
        }
    }

    public final /* synthetic */ void applyPendingRuntimeConfiguration$android_sdk_base_release() {
        ReentrantLock reentrantLock = brazeClassLock;
        reentrantLock.lock();
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
            RuntimeAppConfigurationProvider runtimeAppConfigurationProvider = new RuntimeAppConfigurationProvider(this.applicationContext);
            for (BrazeConfig brazeConfig : pendingConfigurations) {
                if (com.amazon.aps.iva.yb0.j.a(brazeConfig, clearConfigSentinel)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, j.b, 2, (Object) null);
                    runtimeAppConfigurationProvider.clearAllConfigurationValues();
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new k(brazeConfig), 2, (Object) null);
                    runtimeAppConfigurationProvider.setConfiguration(brazeConfig);
                }
            }
            pendingConfigurations.clear();
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.braze.IBraze
    public void changeUser(String str) {
        changeUser(str, null);
    }

    @Override // com.braze.IBraze
    public void closeSession(Activity activity) {
        run$android_sdk_base_release$default(this, p.b, false, new q(activity, this), 2, null);
    }

    public final BrazeConfigurationProvider getConfigurationProvider$android_sdk_base_release() {
        BrazeConfigurationProvider brazeConfigurationProvider = this.configurationProvider;
        if (brazeConfigurationProvider != null) {
            return brazeConfigurationProvider;
        }
        com.amazon.aps.iva.yb0.j.m("configurationProvider");
        throw null;
    }

    public int getContentCardUnviewedCount() {
        if (Companion.isDisabled()) {
            return -1;
        }
        ContentCardsUpdatedEvent cachedContentCardsUpdatedEvent = getCachedContentCardsUpdatedEvent();
        if (cachedContentCardsUpdatedEvent != null) {
            return cachedContentCardsUpdatedEvent.getUnviewedCardCount();
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f0.b, 2, (Object) null);
        return -1;
    }

    @Override // com.braze.IBraze
    public BrazeUser getCurrentUser() {
        return (BrazeUser) runForResult(null, r.b, false, new s(null));
    }

    public final bo.app.w1 getDeviceIdProvider$android_sdk_base_release() {
        bo.app.w1 w1Var = this.deviceIdProvider;
        if (w1Var != null) {
            return w1Var;
        }
        com.amazon.aps.iva.yb0.j.m("deviceIdProvider");
        throw null;
    }

    public final bo.app.z1 getExternalIEventMessenger$android_sdk_base_release() {
        return this.externalIEventMessenger;
    }

    public IBrazeImageLoader getImageLoader() {
        IBrazeImageLoader iBrazeImageLoader = this.imageLoader;
        if (iBrazeImageLoader != null) {
            return iBrazeImageLoader;
        }
        com.amazon.aps.iva.yb0.j.m("imageLoader");
        throw null;
    }

    public final bo.app.a4 getPushDeliveryManager$android_sdk_base_release() {
        bo.app.a4 a4Var = this.pushDeliveryManager;
        if (a4Var != null) {
            return a4Var;
        }
        com.amazon.aps.iva.yb0.j.m("pushDeliveryManager");
        throw null;
    }

    public final bo.app.r2 getUdm$android_sdk_base_release() {
        bo.app.r2 r2Var = this.udm;
        if (r2Var != null) {
            return r2Var;
        }
        com.amazon.aps.iva.yb0.j.m("udm");
        throw null;
    }

    public final /* synthetic */ void handleInAppMessageTestPush$android_sdk_base_release(Intent intent) {
        com.amazon.aps.iva.yb0.j.f(intent, "intent");
        run$android_sdk_base_release$default(this, n0.b, false, new o0(intent, this), 2, null);
    }

    public final Boolean isApiKeyPresent$android_sdk_base_release() {
        return this.isApiKeyPresent;
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str) {
        logCustomEvent(str, null);
    }

    public void logFeedDisplayed() {
        run$android_sdk_base_release$default(this, z0.b, false, new a1(), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal) {
        logPurchase(str, str2, bigDecimal, 1);
    }

    public final /* synthetic */ void logPushDelivery$android_sdk_base_release(String str, long j3) {
        com.amazon.aps.iva.yb0.j.f(str, "campaignId");
        run$android_sdk_base_release$default(this, new f1(str), false, new g1(str, j3), 2, null);
    }

    public final /* synthetic */ void logPushMaxCampaign$android_sdk_base_release(String str) {
        com.amazon.aps.iva.yb0.j.f(str, FirebaseAnalytics.Param.CAMPAIGN);
        run$android_sdk_base_release$default(this, h1.b, false, new i1(str), 2, null);
    }

    public void logPushNotificationActionClicked(String str, String str2, String str3) {
        run$android_sdk_base_release$default(this, j1.b, false, new k1(str, this, str2, str3), 2, null);
    }

    public void logPushNotificationOpened(Intent intent) {
        run$android_sdk_base_release$default(this, new n1(intent), false, new o1(intent, this), 2, null);
    }

    public void logPushStoryPageClicked(String str, String str2) {
        run$android_sdk_base_release$default(this, new p1(str2, str), false, new q1(str, str2, this), 2, null);
    }

    @Override // com.braze.IBraze
    public void openSession(Activity activity) {
        run$android_sdk_base_release$default(this, r1.b, false, new s1(activity, this), 2, null);
    }

    public final /* synthetic */ void performPushDeliveryFlush$android_sdk_base_release() {
        run$android_sdk_base_release$default(this, t1.b, false, new u1(), 2, null);
    }

    public final /* synthetic */ void publishBrazePushAction$android_sdk_base_release(BrazePushEventType brazePushEventType, BrazeNotificationPayload brazeNotificationPayload) {
        com.amazon.aps.iva.yb0.j.f(brazePushEventType, "pushActionType");
        com.amazon.aps.iva.yb0.j.f(brazeNotificationPayload, "payload");
        this.externalIEventMessenger.a(new BrazePushEvent(brazePushEventType, brazeNotificationPayload), BrazePushEvent.class);
    }

    public void refreshFeatureFlags() {
        run$android_sdk_base_release$default(this, z1.b, false, new a2(), 2, null);
    }

    public <T> void removeSingleSubscription(IEventSubscriber<T> iEventSubscriber, Class<T> cls) {
        com.amazon.aps.iva.yb0.j.f(cls, "eventClass");
        if (iEventSubscriber != null) {
            try {
                this.externalIEventMessenger.c(cls, iEventSubscriber);
            } catch (Exception e4) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, new f2(cls));
                publishError(e4);
            }
        }
    }

    public void requestContentCardsRefresh() {
        run$android_sdk_base_release$default(this, g2.b, false, new h2(), 2, null);
    }

    public void requestContentCardsRefreshFromCache() {
        run$android_sdk_base_release$default(this, i2.b, false, new j2(), 2, null);
    }

    public void requestFeedRefresh() {
        run$android_sdk_base_release$default(this, k2.b, false, new l2(), 2, null);
    }

    public void requestFeedRefreshFromCache() {
        run$android_sdk_base_release$default(this, m2.b, false, new n2(), 2, null);
    }

    public final /* synthetic */ void requestGeofenceRefresh$android_sdk_base_release(boolean z) {
        run$android_sdk_base_release$default(this, new q2(z), false, new r2(z), 2, null);
    }

    @Override // com.braze.IBraze
    public void requestImmediateDataFlush() {
        run$android_sdk_base_release$default(this, w2.b, false, new x2(), 2, null);
    }

    public final /* synthetic */ void retryInAppMessage$android_sdk_base_release(InAppMessageEvent inAppMessageEvent) {
        com.amazon.aps.iva.yb0.j.f(inAppMessageEvent, "event");
        run$android_sdk_base_release$default(this, new b3(inAppMessageEvent), false, new c3(inAppMessageEvent), 2, null);
    }

    public final /* synthetic */ void run$android_sdk_base_release(com.amazon.aps.iva.xb0.a aVar, boolean z, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar2, "block");
        if (z && Companion.isDisabled()) {
            return;
        }
        try {
            com.amazon.aps.iva.se0.i.d(x4.a, null, null, new d3(aVar2, null), 3);
        } catch (Exception e4) {
            if (aVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, e4, e3.b, 1, (Object) null);
            } else {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, aVar);
            }
            publishError(e4);
        }
    }

    public final /* synthetic */ void schedulePushDelivery$android_sdk_base_release(long j3) {
        run$android_sdk_base_release$default(this, g3.b, false, new h3(j3), 2, null);
    }

    public final void setApiKeyPresent$android_sdk_base_release(Boolean bool) {
        this.isApiKeyPresent = bool;
    }

    public final void setConfigurationProvider$android_sdk_base_release(BrazeConfigurationProvider brazeConfigurationProvider) {
        com.amazon.aps.iva.yb0.j.f(brazeConfigurationProvider, "<set-?>");
        this.configurationProvider = brazeConfigurationProvider;
    }

    public final void setDeviceIdProvider$android_sdk_base_release(bo.app.w1 w1Var) {
        com.amazon.aps.iva.yb0.j.f(w1Var, "<set-?>");
        this.deviceIdProvider = w1Var;
    }

    public void setImageLoader(IBrazeImageLoader iBrazeImageLoader) {
        com.amazon.aps.iva.yb0.j.f(iBrazeImageLoader, "<set-?>");
        this.imageLoader = iBrazeImageLoader;
    }

    public final void setPushDeliveryManager$android_sdk_base_release(bo.app.a4 a4Var) {
        com.amazon.aps.iva.yb0.j.f(a4Var, "<set-?>");
        this.pushDeliveryManager = a4Var;
    }

    public void setRegisteredPushToken(String str) {
        run$android_sdk_base_release$default(this, new d2(str), false, new e2(str), 2, null);
    }

    public final void setUdm$android_sdk_base_release(bo.app.r2 r2Var) {
        com.amazon.aps.iva.yb0.j.f(r2Var, "<set-?>");
        this.udm = r2Var;
    }

    public void subscribeToContentCardsUpdates(IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(ContentCardsUpdatedEvent.class, iEventSubscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, o3.b);
            publishError(e4);
        }
    }

    public void subscribeToFeedUpdates(IEventSubscriber<FeedUpdatedEvent> iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(FeedUpdatedEvent.class, iEventSubscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, s3.b);
            publishError(e4);
        }
    }

    public void subscribeToNewInAppMessages(IEventSubscriber<InAppMessageEvent> iEventSubscriber) {
        com.amazon.aps.iva.yb0.j.f(iEventSubscriber, "subscriber");
        try {
            this.externalIEventMessenger.a(InAppMessageEvent.class, iEventSubscriber);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, u3.b);
            publishError(e4);
        }
    }

    public void changeUser(String str, String str2) {
        run$android_sdk_base_release$default(this, new n(str), false, new o(str, this, str2), 2, null);
    }

    public void getCurrentUser(IValueCallback<BrazeUser> iValueCallback) {
        com.amazon.aps.iva.yb0.j.f(iValueCallback, "completionCallback");
        if (Companion.isDisabled()) {
            iValueCallback.onError();
            return;
        }
        try {
            com.amazon.aps.iva.se0.i.d(x4.a, null, null, new h0(iValueCallback, this, null), 3);
        } catch (Exception e4) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e4, i0.b);
            iValueCallback.onError();
            publishError(e4);
        }
    }

    @Override // com.braze.IBraze
    public void logCustomEvent(String str, BrazeProperties brazeProperties) {
        run$android_sdk_base_release$default(this, new r0(str), false, new s0(str, this, brazeProperties != null ? brazeProperties.clone() : null), 2, null);
    }

    @Override // com.braze.IBraze
    public void logPurchase(String str, String str2, BigDecimal bigDecimal, BrazeProperties brazeProperties) {
        logPurchase(str, str2, bigDecimal, 1, brazeProperties);
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i3) {
        logPurchase(str, str2, bigDecimal, i3, null);
    }

    public void logPurchase(String str, String str2, BigDecimal bigDecimal, int i3, BrazeProperties brazeProperties) {
        run$android_sdk_base_release$default(this, new d1(str), false, new e1(str, str2, bigDecimal, i3, this, brazeProperties != null ? brazeProperties.clone() : null), 2, null);
    }
}
