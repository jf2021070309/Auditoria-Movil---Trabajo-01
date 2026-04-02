package com.braze.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.support.BrazeLogger;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010#\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u000f\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u0010\u001a\u00020\u0006\"\u0010\b\u0000\u0010\r*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004J\u0016\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\tJ(\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0019J\u000e\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0007J\u0018\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J.\u0010 \u001a\u00020\u0006\"\u0010\b\u0000\u0010\r*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020\u0006R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00065"}, d2 = {"Lcom/braze/configuration/RuntimeAppConfigurationProvider;", "", "", "key", "", "value", "Lcom/amazon/aps/iva/kb0/q;", "putInt", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "putBoolean", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/EnumSet;", "enumSet", "putEnumSet", "Lcom/braze/configuration/BrazeConfig;", "config", "setConfiguration", "clearAllConfigurationValues", "defaultValue", "getStringValue", "getIntValue", "getBooleanValue", "", "", "getStringSetValue", "containsKey", "putEnumAsString", "putString", "updateValue", "updateEnumSetData", "startEdit", "applyEdit", "Landroid/content/SharedPreferences;", "storageMap", "Landroid/content/SharedPreferences;", "getStorageMap", "()Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences$Editor;", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "setEditor", "(Landroid/content/SharedPreferences$Editor;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RuntimeAppConfigurationProvider {
    public static final a Companion = new a(null);
    private SharedPreferences.Editor editor;
    private final SharedPreferences storageMap;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.a {
        public static final b b = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Clearing Braze Override configuration cache";
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ BrazeConfig b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BrazeConfig brazeConfig) {
            super(0);
            this.b = brazeConfig;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Setting Braze Override configuration with config: " + this.b;
        }
    }

    public RuntimeAppConfigurationProvider(Context context) {
        j.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.override.configuration.cache", 0);
        j.e(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.storageMap = sharedPreferences;
    }

    private final void putBoolean(String str, Boolean bool) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putBoolean(str, booleanValue);
            }
        }
    }

    private final <T extends Enum<T>> void putEnumSet(EnumSet<T> enumSet, String str) {
        if (enumSet == null) {
            return;
        }
        Set<String> a2 = com.braze.support.c.a(enumSet);
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.putStringSet(str, a2);
        }
    }

    private final void putInt(String str, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            SharedPreferences.Editor editor = this.editor;
            if (editor != null) {
                editor.putInt(str, intValue);
            }
        }
    }

    public final void applyEdit() {
        SharedPreferences.Editor editor = this.editor;
        if (editor != null) {
            editor.apply();
        }
    }

    public final void clearAllConfigurationValues() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
        this.storageMap.edit().clear().apply();
    }

    public final boolean containsKey(String str) {
        j.f(str, "key");
        return this.storageMap.contains(str);
    }

    public final boolean getBooleanValue(String str, boolean z) {
        j.f(str, "key");
        return this.storageMap.getBoolean(str, z);
    }

    public final int getIntValue(String str, int i) {
        j.f(str, "key");
        return this.storageMap.getInt(str, i);
    }

    public final Set<String> getStringSetValue(String str, Set<String> set) {
        j.f(str, "key");
        return this.storageMap.getStringSet(str, set);
    }

    public final String getStringValue(String str, String str2) {
        j.f(str, "key");
        return this.storageMap.getString(str, str2);
    }

    public final void putEnumAsString(String str, Enum<?> r3) {
        j.f(str, "key");
        if (r3 != null) {
            putString(str, r3.toString());
        }
    }

    public final void putString(String str, String str2) {
        SharedPreferences.Editor editor;
        j.f(str, "key");
        if (str2 != null && (editor = this.editor) != null) {
            editor.putString(str, str2);
        }
    }

    public final void setConfiguration(BrazeConfig brazeConfig) {
        j.f(brazeConfig, "config");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new c(brazeConfig), 2, (Object) null);
        startEdit();
        putString(BrazeConfigurationProvider.b.API_KEY.b(), brazeConfig.apiKey);
        putString(BrazeConfigurationProvider.b.SERVER_TARGET_KEY.b(), brazeConfig.serverTarget);
        putEnumAsString(BrazeConfigurationProvider.b.SDK_FLAVOR.b(), brazeConfig.sdkFlavor);
        putBoolean(BrazeConfigurationProvider.b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.b(), brazeConfig.isNewsFeedVisualIndicatorOn);
        putString(BrazeConfigurationProvider.b.CUSTOM_ENDPOINT.b(), brazeConfig.customEndpoint);
        putString(BrazeConfigurationProvider.b.SMALL_NOTIFICATION_ICON_KEY.b(), brazeConfig.smallNotificationIcon);
        putString(BrazeConfigurationProvider.b.LARGE_NOTIFICATION_ICON_KEY.b(), brazeConfig.largeNotificationIcon);
        putInt(BrazeConfigurationProvider.b.SESSION_TIMEOUT_KEY.b(), brazeConfig.sessionTimeout);
        putInt(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.b(), brazeConfig.defaultNotificationAccentColor);
        putInt(BrazeConfigurationProvider.b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.b(), brazeConfig.triggerActionMinimumTimeIntervalSeconds);
        putBoolean(BrazeConfigurationProvider.b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.b(), brazeConfig.isAdmMessagingRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.b(), brazeConfig.willHandlePushDeepLinksAutomatically);
        putBoolean(BrazeConfigurationProvider.b.ENABLE_LOCATION_COLLECTION_KEY.b(), brazeConfig.isLocationCollectionEnabled);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_BAD_NETWORK_INTERVAL_KEY.b(), brazeConfig.badNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY.b(), brazeConfig.goodNetworkInterval);
        putInt(BrazeConfigurationProvider.b.DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY.b(), brazeConfig.greatNetworkInterval);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_NAME.b(), brazeConfig.defaultNotificationChannelName);
        putString(BrazeConfigurationProvider.b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.b(), brazeConfig.defaultNotificationChannelDescription);
        putBoolean(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.b(), brazeConfig.isPushDeepLinkBackStackActivityEnabled);
        putString(BrazeConfigurationProvider.b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.b(), brazeConfig.pushDeepLinkBackStackActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.b(), brazeConfig.isSessionStartBasedTimeoutEnabled);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.b(), brazeConfig.isFirebaseCloudMessagingRegistrationEnabled);
        putString(BrazeConfigurationProvider.b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.b(), brazeConfig.firebaseCloudMessagingSenderIdKey);
        putBoolean(BrazeConfigurationProvider.b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.b(), brazeConfig.isContentCardsUnreadVisualIndicatorEnabled);
        putBoolean(BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.b(), brazeConfig.isDeviceObjectAllowlistEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.b(), brazeConfig.isInAppMessageAccessibilityExclusiveModeEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.b(), brazeConfig.isPushWakeScreenForNotificationEnabled);
        putBoolean(BrazeConfigurationProvider.b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.b(), brazeConfig.isPushHtmlRenderingEnabled);
        putBoolean(BrazeConfigurationProvider.b.DOES_PUSH_STORY_DISMISS_ON_CLICK.b(), brazeConfig.doesPushStoryDismissOnClick);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_ENABLED.b(), brazeConfig.areGeofencesEnabled);
        putBoolean(BrazeConfigurationProvider.b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.b(), brazeConfig.isInAppMessageTestPushEagerDisplayEnabled);
        putString(BrazeConfigurationProvider.b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.b(), brazeConfig.customHtmlWebViewActivityClassName);
        putBoolean(BrazeConfigurationProvider.b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.b(), brazeConfig.areAutomaticGeofenceRequestsEnabled);
        putInt(BrazeConfigurationProvider.b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.b(), brazeConfig.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
        putBoolean(BrazeConfigurationProvider.b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.b(), brazeConfig.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
        putBoolean(BrazeConfigurationProvider.b.SDK_AUTH_ENABLED.b(), brazeConfig.isSdkAuthEnabled);
        putBoolean(BrazeConfigurationProvider.b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.b(), brazeConfig.isTouchModeRequiredForHtmlInAppMessages);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.b(), brazeConfig.isHtmlInAppMessageApplyWindowInsetsEnabled);
        putBoolean(BrazeConfigurationProvider.b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.b(), brazeConfig.isHtmlInAppMessageHtmlLinkTargetEnabled);
        putEnumSet(brazeConfig.deviceObjectAllowlist, BrazeConfigurationProvider.b.DEVICE_OBJECT_ALLOWLIST_VALUE.b());
        putEnumSet(brazeConfig.customLocationProviderNames, BrazeConfigurationProvider.b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY.b());
        EnumSet<BrazeSdkMetadata> enumSet = brazeConfig.brazeSdkMetadata;
        if (enumSet != null) {
            updateEnumSetData(BrazeConfigurationProvider.b.SDK_METADATA_PUBLIC_KEY.b(), enumSet);
        }
        putBoolean(BrazeConfigurationProvider.b.FALLBACK_FCM_SERVICE_ENABLED.b(), brazeConfig.isFallbackFirebaseMessagingServiceEnabled);
        putString(BrazeConfigurationProvider.b.FALLBACK_FCM_SERVICE_CLASSPATH.b(), brazeConfig.fallbackFirebaseMessagingServiceClasspath);
        applyEdit();
    }

    public final void startEdit() {
        this.editor = this.storageMap.edit();
    }

    public final <T extends Enum<T>> void updateEnumSetData(String str, EnumSet<T> enumSet) {
        j.f(str, "key");
        j.f(enumSet, "updateValue");
        Set<String> stringSetValue = getStringSetValue(str, new HashSet());
        if (stringSetValue != null) {
            stringSetValue.addAll(com.braze.support.c.a(enumSet));
        }
        this.storageMap.edit().putStringSet(str, stringSetValue).apply();
    }
}
