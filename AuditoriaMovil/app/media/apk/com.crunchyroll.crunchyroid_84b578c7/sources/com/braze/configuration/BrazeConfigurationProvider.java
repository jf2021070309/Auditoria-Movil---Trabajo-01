package com.braze.configuration;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bo.app.t0;
import com.amazon.aps.iva.lb0.b0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.yb0.h0;
import com.braze.configuration.CachedConfigurationProvider;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.braze.support.PackageUtils;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u0000 q2\u00020\u0001:\u0002rsB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\bo\u0010pJ4\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R \u0010\u000b\u001a\u00020\n8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001b\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010 \u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0011\u0010!\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b!\u0010\u0013R\u0011\u0010\"\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0011\u0010&\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010.\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0017\u00101\u001a\u00020#8F¢\u0006\f\u0012\u0004\b0\u0010\u0010\u001a\u0004\b/\u0010%R\u0013\u00103\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b2\u0010\u001aR\u0011\u00105\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b4\u0010\u0013R\u0011\u00106\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b6\u0010\u0013R\u0011\u00108\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b7\u0010\u001aR\u0011\u0010:\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b9\u0010\u001aR\u0011\u0010<\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b;\u0010%R\u0017\u0010?\u001a\u00020#8G¢\u0006\f\u0012\u0004\b>\u0010\u0010\u001a\u0004\b=\u0010%R\u0013\u0010C\u001a\u0004\u0018\u00010@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bD\u0010\u0013R\u0013\u0010F\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bE\u0010\u001aR\u0011\u0010G\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bG\u0010\u0013R\u0011\u0010H\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bH\u0010\u0013R\u0011\u0010I\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bI\u0010\u0013R\u0013\u0010K\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bJ\u0010\u001aR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020L0\b8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010P\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bP\u0010\u0013R\u0011\u0010Q\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bQ\u0010\u0013R\u0011\u0010R\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bR\u0010\u0013R\u0011\u0010S\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bS\u0010\u0013R\u0011\u0010U\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bT\u0010\u0013R\u0011\u0010V\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bV\u0010\u0013R\u0011\u0010W\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bW\u0010\u0013R\u0011\u0010Y\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\bX\u0010%R\u0013\u0010[\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bZ\u0010\u001aR\u0011\u0010]\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\\\u0010%R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020^0\b8F¢\u0006\u0006\u001a\u0004\b_\u0010NR\u0011\u0010a\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\ba\u0010\u0013R\u0011\u0010b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bb\u0010\u0013R\u0011\u0010c\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bc\u0010\u0013R\u0011\u0010d\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bd\u0010\u0013R\u0011\u0010e\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\be\u0010\u0013R\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020f0\b8F¢\u0006\u0006\u001a\u0004\bg\u0010NR\u0011\u0010i\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bi\u0010\u0013R\u0013\u0010k\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bj\u0010\u001aR\u001a\u0010n\u001a\u00020\u00158BX\u0082\u0004¢\u0006\f\u0012\u0004\bm\u0010\u0010\u001a\u0004\bl\u0010\u001a¨\u0006t"}, d2 = {"Lcom/braze/configuration/BrazeConfigurationProvider;", "Lcom/braze/configuration/CachedConfigurationProvider;", "", "E", "Ljava/lang/Class;", "targetEnumClass", "Lcom/braze/configuration/BrazeConfigurationProvider$b;", "configField", "Ljava/util/EnumSet;", "getGenericEnumSetFromStringSet", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext$android_sdk_base_release", "()Landroid/content/Context;", "getContext$android_sdk_base_release$annotations", "()V", "", "isEphemeralEventsEnabled", "()Z", "", "", "getEphemeralEventKeys", "()Ljava/util/Set;", "ephemeralEventKeys", "getBaseUrlForRequests", "()Ljava/lang/String;", "baseUrlForRequests", "Lbo/app/i;", "getBrazeApiKey", "()Lbo/app/i;", "brazeApiKey", "isAdmMessagingRegistrationEnabled", "isLocationCollectionEnabled", "isGeofencesEnabled", "", "getSmallNotificationIconResourceId", "()I", "smallNotificationIconResourceId", "getLargeNotificationIconResourceId", "largeNotificationIconResourceId", "", "getTriggerActionMinimumTimeIntervalInSeconds", "()J", "triggerActionMinimumTimeIntervalInSeconds", "getSessionTimeoutSeconds", "sessionTimeoutSeconds", "getVersionCode", "getVersionCode$annotations", "versionCode", "getCustomEndpoint", "customEndpoint", "getDoesHandlePushDeepLinksAutomatically", "doesHandlePushDeepLinksAutomatically", "isNewsfeedVisualIndicatorOn", "getDefaultNotificationChannelName", "defaultNotificationChannelName", "getDefaultNotificationChannelDescription", "defaultNotificationChannelDescription", "getApplicationIconResourceId", "applicationIconResourceId", "getDefaultNotificationAccentColor", "getDefaultNotificationAccentColor$annotations", "defaultNotificationAccentColor", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor", "()Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "isPushDeepLinkBackStackActivityEnabled", "getPushDeepLinkBackStackActivityClassName", "pushDeepLinkBackStackActivityClassName", "isSessionStartBasedTimeoutEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "getFirebaseCloudMessagingSenderIdKey", "firebaseCloudMessagingSenderIdKey", "Lcom/braze/enums/DeviceKey;", "getDeviceObjectAllowlist", "()Ljava/util/EnumSet;", "deviceObjectAllowlist", "isDeviceObjectAllowlistEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isPushWakeScreenForNotificationEnabled", "isPushNotificationHtmlRenderingEnabled", "getDoesPushStoryDismissOnClick", "doesPushStoryDismissOnClick", "isInAppMessageTestPushEagerDisplayEnabled", "isAutomaticGeofenceRequestsEnabled", "getLoggerInitialLogLevel", "loggerInitialLogLevel", "getCustomHtmlWebViewActivityClassName", "customHtmlWebViewActivityClassName", "getInAppMessageWebViewClientOnPageFinishedMaxWaitMs", "inAppMessageWebViewClientOnPageFinishedMaxWaitMs", "Lcom/braze/enums/LocationProviderName;", "getCustomLocationProviderNames", "customLocationProviderNames", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isSdkAuthenticationEnabled", "isTouchModeRequiredForHtmlInAppMessages", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "Lcom/braze/enums/BrazeSdkMetadata;", "getSdkMetadata", "sdkMetadata", "isFallbackFirebaseMessagingServiceEnabled", "getFallbackFirebaseMessagingServiceClasspath", "fallbackFirebaseMessagingServiceClasspath", "getServerTarget", "getServerTarget$annotations", "serverTarget", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "b", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeConfigurationProvider extends CachedConfigurationProvider {
    public static final a Companion = new a(null);
    public static final int DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS = (int) TimeUnit.SECONDS.toMillis(15);
    private final Context context;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        EPHEMERAL_EVENTS_ENABLED("com_braze_ephemeral_events_enabled"),
        EPHEMERAL_EVENTS_KEYS("com_braze_ephemeral_events_keys"),
        API_KEY("com_braze_api_key"),
        SERVER_TARGET_KEY("com_braze_server_target"),
        ADM_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_push_adm_messaging_registration_enabled"),
        SMALL_NOTIFICATION_ICON_KEY("com_braze_push_small_notification_icon"),
        LARGE_NOTIFICATION_ICON_KEY("com_braze_push_large_notification_icon"),
        SESSION_TIMEOUT_KEY("com_braze_session_timeout"),
        ENABLE_LOCATION_COLLECTION_KEY("com_braze_enable_location_collection"),
        DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY("com_braze_default_notification_accent_color"),
        TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS("com_braze_trigger_action_minimum_time_interval_seconds"),
        HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY("com_braze_handle_push_deep_links_automatically"),
        NEWSFEED_UNREAD_VISUAL_INDICATOR_ON("com_braze_newsfeed_unread_visual_indicator_on"),
        SDK_FLAVOR("com_braze_sdk_flavor"),
        CUSTOM_ENDPOINT("com_braze_custom_endpoint"),
        DEFAULT_NOTIFICATION_CHANNEL_NAME("com_braze_default_notification_channel_name"),
        DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION("com_braze_default_notification_channel_description"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY("com_braze_push_deep_link_back_stack_activity_enabled"),
        PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY("com_braze_push_deep_link_back_stack_activity_class_name"),
        SESSION_START_BASED_TIMEOUT_ENABLED_KEY("com_braze_session_start_based_timeout_enabled"),
        FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY("com_braze_firebase_cloud_messaging_registration_enabled"),
        FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY("com_braze_firebase_cloud_messaging_sender_id"),
        CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED("com_braze_content_cards_unread_visual_indicator_enabled"),
        DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY("com_braze_device_object_whitelisting_enabled"),
        DEVICE_OBJECT_ALLOWLIST_VALUE("com_braze_device_object_whitelist"),
        IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED("com_braze_device_in_app_message_accessibility_exclusive_mode_enabled"),
        PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED("com_braze_push_wake_screen_for_notification_enabled"),
        PUSH_NOTIFICATION_HTML_RENDERING_ENABLED("com_braze_push_notification_html_rendering_enabled"),
        DOES_PUSH_STORY_DISMISS_ON_CLICK("com_braze_does_push_story_dismiss_on_click"),
        GEOFENCES_ENABLED("com_braze_geofences_enabled"),
        IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY("com_braze_in_app_message_push_test_eager_display_enabled"),
        LOGGER_INITIAL_LOG_LEVEL("com_braze_logger_initial_log_level"),
        CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY("com_braze_custom_html_webview_activity_class_name"),
        GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY("com_braze_automatic_geofence_requests_enabled"),
        CUSTOM_LOCATION_PROVIDERS_LIST_KEY("com_braze_custom_location_providers_list"),
        IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY("com_braze_in_app_message_webview_client_max_onpagefinished_wait_ms"),
        FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY("com_braze_firebase_messaging_service_automatically_register_on_new_token"),
        SDK_AUTH_ENABLED("com_braze_sdk_authentication_enabled"),
        REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY("com_braze_require_touch_mode_for_html_in_app_messages"),
        DATA_SYNC_BAD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_bad_network"),
        DATA_SYNC_GOOD_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_good_network"),
        DATA_SYNC_GREAT_NETWORK_INTERVAL_KEY("com_braze_data_flush_interval_great_network"),
        FALLBACK_FCM_SERVICE_ENABLED("com_braze_fallback_firebase_cloud_messaging_service_enabled"),
        FALLBACK_FCM_SERVICE_CLASSPATH("com_braze_fallback_firebase_cloud_messaging_service_classpath"),
        SDK_METADATA_INTERNAL_KEY("com_braze_internal_sdk_metadata"),
        SDK_METADATA_PUBLIC_KEY("com_braze_sdk_metadata"),
        HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS("com_braze_html_in_app_message_apply_insets"),
        HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET("com_braze_html_in_app_message_enable_html_link_target");
        
        private final String b;

        b(String str) {
            this.b = str;
        }

        public final String b() {
            return this.b;
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
            return "Couldn't find application icon for package: " + this.b;
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
            return "****************************************************";
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
            return "Found an override api key. Using it to configure the Braze SDK";
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
            return "****************************************************";
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
            return "**                                                **";
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
            return "**                 !! WARNING !!                  **";
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
            return "**                                                **";
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
            return "**     No API key set in res/values/braze.xml     **";
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final k b = new k();

        public k() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "** No cached API Key found from Braze.configure   **";
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
            return "**          Braze functionality disabled          **";
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
            return "**                                                **";
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
            return "Using default notification accent color found in resources";
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
            return "More than 12 ephemeral/graylisted events detected. Only using first 12 events. Please truncate this list!";
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
            return "Exception while parsing stored SDK flavor. Returning null.";
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
            return "Unable to read the version code.";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrazeConfigurationProvider(Context context) {
        super(context, false, null, 6, null);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        com.amazon.aps.iva.yb0.j.e(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    private final <E extends Enum<E>> EnumSet<E> getGenericEnumSetFromStringSet(Class<E> cls, b bVar) {
        String b2 = bVar.b();
        if (getConfigurationCache().containsKey(b2)) {
            Object obj = getConfigurationCache().get(b2);
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type java.util.EnumSet<E of com.braze.configuration.BrazeConfigurationProvider.getGenericEnumSetFromStringSet>");
            return (EnumSet) obj;
        }
        Set<String> stringSetValue = getStringSetValue(bVar.b(), new HashSet());
        if (stringSetValue == null) {
            stringSetValue = new HashSet<>();
        }
        EnumSet<E> a2 = com.braze.support.c.a(cls, stringSetValue);
        getConfigurationCache().put(b2, a2);
        return a2;
    }

    private final String getServerTarget() {
        String stringValue = getStringValue(b.SERVER_TARGET_KEY.b(), "PROD");
        if (stringValue == null) {
            return "PROD";
        }
        return stringValue;
    }

    public final int getApplicationIconResourceId() {
        int i2;
        ApplicationInfo applicationInfo;
        PackageManager.ApplicationInfoFlags of;
        if (getConfigurationCache().containsKey("application_icon")) {
            Object obj = getConfigurationCache().get("application_icon");
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        String packageName = this.context.getPackageName();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = this.context.getPackageManager();
                of = PackageManager.ApplicationInfoFlags.of(0L);
                applicationInfo = packageManager.getApplicationInfo(packageName, of);
            } else {
                applicationInfo = this.context.getPackageManager().getApplicationInfo(packageName, 0);
            }
            com.amazon.aps.iva.yb0.j.e(applicationInfo, "if (Build.VERSION.SDK_IN… 0)\n                    }");
            i2 = applicationInfo.icon;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new c(packageName));
            i2 = 0;
        }
        getConfigurationCache().put("application_icon", Integer.valueOf(i2));
        return i2;
    }

    public final String getBaseUrlForRequests() {
        String serverTarget = getServerTarget();
        Locale locale = Locale.US;
        com.amazon.aps.iva.yb0.j.e(locale, "US");
        String upperCase = serverTarget.toUpperCase(locale);
        com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (com.amazon.aps.iva.yb0.j.a("STAGING", upperCase)) {
            return "https://sondheim.braze.com/api/v3/";
        }
        return "https://sdk.iad-01.braze.com/api/v3/";
    }

    public final bo.app.i getBrazeApiKey() {
        String b2 = b.API_KEY.b();
        String str = (String) getConfigurationCache().get(b2);
        if (str == null) {
            str = getRuntimeAppConfigurationProvider().getStringValue(b2, null);
            if (str != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, e.b, 2, (Object) null);
            } else {
                str = getStringValue(b2, null);
            }
            if (str != null) {
                getConfigurationCache().put(b2, str);
            }
        }
        if (str != null) {
            return new bo.app.i(str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.W;
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, f.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, g.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, h.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, i.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, j.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, k.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, l.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, m.b, 2, (Object) null);
        BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, d.b, 2, (Object) null);
        throw new RuntimeException("Unable to read the Braze API key from the res/values/braze.xml file or from runtime configuration via BrazeConfig. See log for more details.");
    }

    public final String getCustomEndpoint() {
        return getStringValue(b.CUSTOM_ENDPOINT.b(), null);
    }

    public final String getCustomHtmlWebViewActivityClassName() {
        return getStringValue(b.CUSTOM_HTML_WEBVIEW_ACTIVITY_CLASS_NAME_KEY.b(), "");
    }

    public final EnumSet<LocationProviderName> getCustomLocationProviderNames() {
        return getGenericEnumSetFromStringSet(LocationProviderName.class, b.CUSTOM_LOCATION_PROVIDERS_LIST_KEY);
    }

    public final int getDefaultNotificationAccentColor() {
        Integer colorValue = getColorValue(b.DEFAULT_NOTIFICATION_ACCENT_COLOR_KEY.b());
        if (colorValue != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, n.b, 3, (Object) null);
            return colorValue.intValue();
        }
        return 0;
    }

    public final String getDefaultNotificationChannelDescription() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_DESCRIPTION.b(), "");
        if (stringValue == null) {
            return "";
        }
        return stringValue;
    }

    public final String getDefaultNotificationChannelName() {
        String stringValue = getStringValue(b.DEFAULT_NOTIFICATION_CHANNEL_NAME.b(), "General");
        if (stringValue == null) {
            return "General";
        }
        return stringValue;
    }

    public final EnumSet<DeviceKey> getDeviceObjectAllowlist() {
        return getGenericEnumSetFromStringSet(DeviceKey.class, b.DEVICE_OBJECT_ALLOWLIST_VALUE);
    }

    public final boolean getDoesHandlePushDeepLinksAutomatically() {
        return getBooleanValue(b.HANDLE_PUSH_DEEP_LINKS_AUTOMATICALLY.b(), false);
    }

    public final boolean getDoesPushStoryDismissOnClick() {
        return getBooleanValue(b.DOES_PUSH_STORY_DISMISS_ON_CLICK.b(), true);
    }

    public final Set<String> getEphemeralEventKeys() {
        String b2 = b.EPHEMERAL_EVENTS_KEYS.b();
        Set<String> set = b0.b;
        Set<String> stringSetValue = getStringSetValue(b2, set);
        if (stringSetValue != null) {
            set = stringSetValue;
        }
        if (set.size() > 12) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, o.b, 2, (Object) null);
        }
        return x.c1(x.U0(set, 12));
    }

    public final String getFallbackFirebaseMessagingServiceClasspath() {
        return getStringValue(b.FALLBACK_FCM_SERVICE_CLASSPATH.b(), null);
    }

    public final String getFirebaseCloudMessagingSenderIdKey() {
        return getStringValue(b.FIREBASE_CLOUD_MESSAGING_SENDER_ID_KEY.b(), null);
    }

    public final int getInAppMessageWebViewClientOnPageFinishedMaxWaitMs() {
        return getIntValue(b.IN_APP_MESSAGE_WEBVIEW_CLIENT_MAX_ONPAGEFINISHED_WAIT_KEY.b(), DEFAULT_IN_APP_MESSAGE_WEBVIEW_ONPAGEFINISHED_WAIT_MS);
    }

    public final int getLargeNotificationIconResourceId() {
        return getDrawableValue(b.LARGE_NOTIFICATION_ICON_KEY.b(), 0);
    }

    public final int getLoggerInitialLogLevel() {
        return getIntValue(b.LOGGER_INITIAL_LOG_LEVEL.b(), 4);
    }

    public final String getPushDeepLinkBackStackActivityClassName() {
        return getStringValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_CLASS_NAME_KEY.b(), "");
    }

    public final SdkFlavor getSdkFlavor() {
        boolean z;
        String stringValue = getStringValue(b.SDK_FLAVOR.b(), null);
        if (stringValue != null && !com.amazon.aps.iva.oe0.m.b0(stringValue)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            Locale locale = Locale.US;
            com.amazon.aps.iva.yb0.j.e(locale, "US");
            String upperCase = stringValue.toUpperCase(locale);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            return SdkFlavor.valueOf(upperCase);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, p.b);
            return null;
        }
    }

    public final EnumSet<BrazeSdkMetadata> getSdkMetadata() {
        String upperCase;
        BrazeSdkMetadata[] values;
        int i2;
        String b2 = b.SDK_METADATA_INTERNAL_KEY.b();
        CachedConfigurationProvider.b bVar = CachedConfigurationProvider.b.STRING_ARRAY;
        Object resourceConfigurationValue = getResourceConfigurationValue(bVar, b2, new HashSet());
        com.amazon.aps.iva.yb0.j.d(resourceConfigurationValue, "null cannot be cast to non-null type kotlin.collections.MutableSet<kotlin.String>");
        Set<String> d2 = h0.d(resourceConfigurationValue);
        String b3 = b.SDK_METADATA_PUBLIC_KEY.b();
        Object resourceConfigurationValue2 = getResourceConfigurationValue(bVar, b3, new HashSet());
        com.amazon.aps.iva.yb0.j.d(resourceConfigurationValue2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        Object runtimeConfigurationValue = getRuntimeConfigurationValue(bVar, b3, new HashSet());
        com.amazon.aps.iva.yb0.j.d(runtimeConfigurationValue, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
        d2.addAll((Set) resourceConfigurationValue2);
        d2.addAll((Set) runtimeConfigurationValue);
        com.braze.support.c cVar = com.braze.support.c.a;
        EnumSet<BrazeSdkMetadata> noneOf = EnumSet.noneOf(BrazeSdkMetadata.class);
        for (String str : d2) {
            try {
                com.braze.support.c cVar2 = com.braze.support.c.a;
                Locale locale = Locale.US;
                com.amazon.aps.iva.yb0.j.e(locale, "US");
                upperCase = str.toUpperCase(locale);
                com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(com.braze.support.c.a, BrazeLogger.Priority.E, e2, new t0(str));
            }
            for (BrazeSdkMetadata brazeSdkMetadata : BrazeSdkMetadata.values()) {
                if (com.amazon.aps.iva.yb0.j.a(brazeSdkMetadata.name(), upperCase)) {
                    noneOf.add(brazeSdkMetadata);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        com.amazon.aps.iva.yb0.j.e(noneOf, "result");
        return noneOf;
    }

    public final int getSessionTimeoutSeconds() {
        return getIntValue(b.SESSION_TIMEOUT_KEY.b(), 10);
    }

    public final int getSmallNotificationIconResourceId() {
        return getDrawableValue(b.SMALL_NOTIFICATION_ICON_KEY.b(), 0);
    }

    public final long getTriggerActionMinimumTimeIntervalInSeconds() {
        return getIntValue(b.TRIGGER_ACTION_MINIMUM_TIME_INTERVAL_KEY_SECONDS.b(), 30);
    }

    public final int getVersionCode() {
        int i2;
        if (getConfigurationCache().containsKey("version_code")) {
            Object obj = getConfigurationCache().get("version_code");
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) obj).intValue();
        }
        try {
            i2 = this.context.getPackageManager().getPackageInfo(PackageUtils.getResourcePackageName(this.context), 0).versionCode;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, q.b);
            i2 = -1;
        }
        getConfigurationCache().put("version_code", Integer.valueOf(i2));
        return i2;
    }

    public final boolean isAdmMessagingRegistrationEnabled() {
        return getBooleanValue(b.ADM_MESSAGING_REGISTRATION_ENABLED_KEY.b(), false);
    }

    public final boolean isAutomaticGeofenceRequestsEnabled() {
        return getBooleanValue(b.GEOFENCES_AUTOMATIC_REQUESTS_ENABLED_KEY.b(), true);
    }

    public final boolean isContentCardsUnreadVisualIndicatorEnabled() {
        return getBooleanValue(b.CONTENT_CARDS_UNREAD_VISUAL_INDICATOR_ENABLED.b(), true);
    }

    public final boolean isDeviceObjectAllowlistEnabled() {
        return getBooleanValue(b.DEVICE_OBJECT_ALLOWLISTING_ENABLED_KEY.b(), false);
    }

    public final boolean isEphemeralEventsEnabled() {
        return getBooleanValue(b.EPHEMERAL_EVENTS_ENABLED.b(), false);
    }

    public final boolean isFallbackFirebaseMessagingServiceEnabled() {
        return getBooleanValue(b.FALLBACK_FCM_SERVICE_ENABLED.b(), false);
    }

    public final boolean isFirebaseCloudMessagingRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_CLOUD_MESSAGING_REGISTRATION_ENABLED_KEY.b(), false);
    }

    public final boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled() {
        return getBooleanValue(b.FIREBASE_MESSAGING_SERVICE_AUTOMATICALLY_REGISTER_ON_NEW_TOKEN_KEY.b(), isFirebaseCloudMessagingRegistrationEnabled());
    }

    public final boolean isGeofencesEnabled() {
        return getBooleanValue(b.GEOFENCES_ENABLED.b(), isLocationCollectionEnabled());
    }

    public final boolean isHtmlInAppMessageApplyWindowInsetsEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_APPLY_WINDOW_INSETS.b(), false);
    }

    public final boolean isHtmlInAppMessageHtmlLinkTargetEnabled() {
        return getBooleanValue(b.HTML_IN_APP_MESSAGE_ENABLE_HTML_LINK_TARGET.b(), true);
    }

    public final boolean isInAppMessageAccessibilityExclusiveModeEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_ACCESSIBILITY_EXCLUSIVE_MODE_ENABLED.b(), false);
    }

    public final boolean isInAppMessageTestPushEagerDisplayEnabled() {
        return getBooleanValue(b.IN_APP_MESSAGE_PUSH_TEST_EAGER_DISPLAY.b(), true);
    }

    public final boolean isLocationCollectionEnabled() {
        return getBooleanValue(b.ENABLE_LOCATION_COLLECTION_KEY.b(), false);
    }

    public final boolean isNewsfeedVisualIndicatorOn() {
        return getBooleanValue(b.NEWSFEED_UNREAD_VISUAL_INDICATOR_ON.b(), true);
    }

    public final boolean isPushDeepLinkBackStackActivityEnabled() {
        return getBooleanValue(b.PUSH_DEEP_LINK_BACK_STACK_ACTIVITY_ENABLED_KEY.b(), true);
    }

    public final boolean isPushNotificationHtmlRenderingEnabled() {
        return getBooleanValue(b.PUSH_NOTIFICATION_HTML_RENDERING_ENABLED.b(), false);
    }

    public final boolean isPushWakeScreenForNotificationEnabled() {
        return getBooleanValue(b.PUSH_WAKE_SCREEN_FOR_NOTIFICATION_ENABLED.b(), true);
    }

    public final boolean isSdkAuthenticationEnabled() {
        return getBooleanValue(b.SDK_AUTH_ENABLED.b(), false);
    }

    public final boolean isSessionStartBasedTimeoutEnabled() {
        return getBooleanValue(b.SESSION_START_BASED_TIMEOUT_ENABLED_KEY.b(), false);
    }

    public final boolean isTouchModeRequiredForHtmlInAppMessages() {
        return getBooleanValue(b.REQUIRE_TOUCH_MODE_FOR_HTML_IAMS_KEY.b(), true);
    }
}
