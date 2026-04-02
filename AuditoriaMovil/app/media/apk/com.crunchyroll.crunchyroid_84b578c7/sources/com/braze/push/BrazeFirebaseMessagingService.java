package com.braze.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.braze.support.ReflectionUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BrazeFirebaseMessagingService.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "", "newToken", "Lcom/amazon/aps/iva/kb0/q;", "onNewToken", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeFirebaseMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BrazeFirebaseMessagingService.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/braze/push/BrazeFirebaseMessagingService$Companion;", "", "Landroid/content/Context;", "context", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "", "handleBrazeRemoteMessage", "isBrazePushNotification", "", "classpath", "Lcom/amazon/aps/iva/kb0/q;", "invokeFallbackFirebaseService$android_sdk_ui_release", "(Ljava/lang/String;Lcom/google/firebase/messaging/RemoteMessage;)V", "invokeFallbackFirebaseService", "FCM_SERVICE_OMR_METHOD", "Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
            j.f(context, "context");
            j.f(remoteMessage, "remoteMessage");
            if (!isBrazePushNotification(remoteMessage)) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.Priority priority = BrazeLogger.Priority.I;
                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$1(remoteMessage), 2, (Object) null);
                BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
                if (brazeConfigurationProvider.isFallbackFirebaseMessagingServiceEnabled()) {
                    String fallbackFirebaseMessagingServiceClasspath = brazeConfigurationProvider.getFallbackFirebaseMessagingServiceClasspath();
                    if (fallbackFirebaseMessagingServiceClasspath != null) {
                        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$2(fallbackFirebaseMessagingServiceClasspath), 2, (Object) null);
                        invokeFallbackFirebaseService$android_sdk_ui_release(fallbackFirebaseMessagingServiceClasspath, remoteMessage);
                        return false;
                    }
                    BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$3.INSTANCE, 3, (Object) null);
                    return false;
                }
                return false;
            }
            Map<String, String> data = remoteMessage.getData();
            j.e(data, "remoteMessage.data");
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$4(data), 2, (Object) null);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : data.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$Companion$handleBrazeRemoteMessage$5(key, value), 2, (Object) null);
                bundle.putString(key, value);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, context, intent, false, 4, null);
            return true;
        }

        public final void invokeFallbackFirebaseService$android_sdk_ui_release(String str, RemoteMessage remoteMessage) {
            j.f(str, "classpath");
            j.f(remoteMessage, "remoteMessage");
            Object constructObjectQuietly$default = ReflectionUtils.constructObjectQuietly$default(ReflectionUtils.INSTANCE, str, null, null, 6, null);
            if (constructObjectQuietly$default == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$1(str), 3, (Object) null);
                return;
            }
            Method methodQuietly = ReflectionUtils.getMethodQuietly(str, "onMessageReceived", RemoteMessage.class);
            if (methodQuietly == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$2(str), 3, (Object) null);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeFirebaseMessagingService$Companion$invokeFallbackFirebaseService$3(str), 3, (Object) null);
            ReflectionUtils.invokeMethodQuietly(constructObjectQuietly$default, methodQuietly, remoteMessage);
        }

        public final boolean isBrazePushNotification(RemoteMessage remoteMessage) {
            j.f(remoteMessage, "remoteMessage");
            Map<String, String> data = remoteMessage.getData();
            j.e(data, "remoteMessage.data");
            return j.a("true", data.get("_ab"));
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        j.f(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        Companion.handleBrazeRemoteMessage(this, remoteMessage);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        boolean z;
        j.f(str, "newToken");
        super.onNewToken(str);
        BrazeInternal.applyPendingRuntimeConfiguration(this);
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(this);
        Braze.Companion companion = Braze.Companion;
        String configuredApiKey = companion.getConfiguredApiKey(brazeConfigurationProvider);
        if (configuredApiKey != null && configuredApiKey.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$1(str), 2, (Object) null);
        } else if (!brazeConfigurationProvider.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$2(str), 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new BrazeFirebaseMessagingService$onNewToken$3(str), 2, (Object) null);
            companion.getInstance(this).setRegisteredPushToken(str);
        }
    }
}
