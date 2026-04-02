package com.braze.configuration;

import com.amazon.aps.iva.o0.t1;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.enums.BrazeSdkMetadata;
import com.braze.enums.DeviceKey;
import com.braze.enums.LocationProviderName;
import com.braze.enums.SdkFlavor;
import com.braze.support.BrazeLogger;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.Cast;
import com.google.common.primitives.Ints;
import java.util.EnumSet;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001<B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010;\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010 \u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010!\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010,\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010-\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010.\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010/\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u00100\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0014\u00101\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0012\u00102\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u00106\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00107\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0012\u00108\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u00109\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010:\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006="}, d2 = {"Lcom/braze/configuration/BrazeConfig;", "", "builder", "Lcom/braze/configuration/BrazeConfig$Builder;", "(Lcom/braze/configuration/BrazeConfig$Builder;)V", "apiKey", "", "areAutomaticGeofenceRequestsEnabled", "", "Ljava/lang/Boolean;", "areGeofencesEnabled", "badNetworkInterval", "", "Ljava/lang/Integer;", "brazeSdkMetadata", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "customEndpoint", "customHtmlWebViewActivityClassName", "customLocationProviderNames", "Lcom/braze/enums/LocationProviderName;", "defaultNotificationAccentColor", "defaultNotificationChannelDescription", "defaultNotificationChannelName", "deviceObjectAllowlist", "Lcom/braze/enums/DeviceKey;", "doesPushStoryDismissOnClick", "fallbackFirebaseMessagingServiceClasspath", "firebaseCloudMessagingSenderIdKey", "goodNetworkInterval", "greatNetworkInterval", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "isAdmMessagingRegistrationEnabled", "isContentCardsUnreadVisualIndicatorEnabled", "isDeviceObjectAllowlistEnabled", "isFallbackFirebaseMessagingServiceEnabled", "isFirebaseCloudMessagingRegistrationEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled", "isInAppMessageTestPushEagerDisplayEnabled", "isLocationCollectionEnabled", "isNewsFeedVisualIndicatorOn", "isPushDeepLinkBackStackActivityEnabled", "isPushHtmlRenderingEnabled", "isPushWakeScreenForNotificationEnabled", "isSdkAuthEnabled", "isSessionStartBasedTimeoutEnabled", "isTouchModeRequiredForHtmlInAppMessages", "largeNotificationIcon", "pushDeepLinkBackStackActivityClassName", "sdkFlavor", "Lcom/braze/enums/SdkFlavor;", "serverTarget", "sessionTimeout", "smallNotificationIcon", "triggerActionMinimumTimeIntervalSeconds", "willHandlePushDeepLinksAutomatically", "toString", "Builder", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeConfig {
    public final String apiKey;
    public final Boolean areAutomaticGeofenceRequestsEnabled;
    public final Boolean areGeofencesEnabled;
    public final Integer badNetworkInterval;
    public final EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
    private final Builder builder;
    public final String customEndpoint;
    public final String customHtmlWebViewActivityClassName;
    public final EnumSet<LocationProviderName> customLocationProviderNames;
    public final Integer defaultNotificationAccentColor;
    public final String defaultNotificationChannelDescription;
    public final String defaultNotificationChannelName;
    public final EnumSet<DeviceKey> deviceObjectAllowlist;
    public final Boolean doesPushStoryDismissOnClick;
    public final String fallbackFirebaseMessagingServiceClasspath;
    public final String firebaseCloudMessagingSenderIdKey;
    public final Integer goodNetworkInterval;
    public final Integer greatNetworkInterval;
    public final Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
    public final Boolean isAdmMessagingRegistrationEnabled;
    public final Boolean isContentCardsUnreadVisualIndicatorEnabled;
    public final Boolean isDeviceObjectAllowlistEnabled;
    public final Boolean isFallbackFirebaseMessagingServiceEnabled;
    public final Boolean isFirebaseCloudMessagingRegistrationEnabled;
    public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
    public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
    public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
    public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
    public final Boolean isInAppMessageTestPushEagerDisplayEnabled;
    public final Boolean isLocationCollectionEnabled;
    public final Boolean isNewsFeedVisualIndicatorOn;
    public final Boolean isPushDeepLinkBackStackActivityEnabled;
    public final Boolean isPushHtmlRenderingEnabled;
    public final Boolean isPushWakeScreenForNotificationEnabled;
    public final Boolean isSdkAuthEnabled;
    public final Boolean isSessionStartBasedTimeoutEnabled;
    public final Boolean isTouchModeRequiredForHtmlInAppMessages;
    public final String largeNotificationIcon;
    public final String pushDeepLinkBackStackActivityClassName;
    public final SdkFlavor sdkFlavor;
    public final String serverTarget;
    public final Integer sessionTimeout;
    public final String smallNotificationIcon;
    public final Integer triggerActionMinimumTimeIntervalSeconds;
    public final Boolean willHandlePushDeepLinksAutomatically;

    public /* synthetic */ BrazeConfig(Builder builder, e eVar) {
        this(builder);
    }

    public String toString() {
        return this.builder.toString();
    }

    private BrazeConfig(Builder builder) {
        this.builder = builder;
        this.apiKey = builder.getApiKey$android_sdk_base_release();
        this.serverTarget = builder.getServerTarget$android_sdk_base_release();
        this.smallNotificationIcon = builder.getSmallNotificationIconName$android_sdk_base_release();
        this.largeNotificationIcon = builder.getLargeNotificationIconName$android_sdk_base_release();
        this.customEndpoint = builder.getCustomEndpoint$android_sdk_base_release();
        this.defaultNotificationChannelName = builder.getDefaultNotificationChannelName$android_sdk_base_release();
        this.defaultNotificationChannelDescription = builder.getDefaultNotificationChannelDescription$android_sdk_base_release();
        this.pushDeepLinkBackStackActivityClassName = builder.getPushDeepLinkBackStackActivityClassName$android_sdk_base_release();
        this.firebaseCloudMessagingSenderIdKey = builder.getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release();
        this.customHtmlWebViewActivityClassName = builder.getCustomHtmlWebViewActivityClassName$android_sdk_base_release();
        this.sdkFlavor = builder.getSdkFlavor$android_sdk_base_release();
        this.sessionTimeout = builder.getSessionTimeout$android_sdk_base_release();
        this.defaultNotificationAccentColor = builder.getDefaultNotificationAccentColor$android_sdk_base_release();
        this.triggerActionMinimumTimeIntervalSeconds = builder.getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release();
        this.badNetworkInterval = builder.getBadNetworkInterval$android_sdk_base_release();
        this.goodNetworkInterval = builder.getGoodNetworkInterval$android_sdk_base_release();
        this.greatNetworkInterval = builder.getGreatNetworkInterval$android_sdk_base_release();
        this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = builder.getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release();
        this.isAdmMessagingRegistrationEnabled = builder.getAdmMessagingRegistrationEnabled$android_sdk_base_release();
        this.willHandlePushDeepLinksAutomatically = builder.getHandlePushDeepLinksAutomatically$android_sdk_base_release();
        this.isLocationCollectionEnabled = builder.isLocationCollectionEnabled$android_sdk_base_release();
        this.isNewsFeedVisualIndicatorOn = builder.isNewsFeedVisualIndicatorOn$android_sdk_base_release();
        this.isPushDeepLinkBackStackActivityEnabled = builder.isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release();
        this.isSessionStartBasedTimeoutEnabled = builder.isSessionStartBasedTimeoutEnabled$android_sdk_base_release();
        this.isFirebaseCloudMessagingRegistrationEnabled = builder.isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release();
        this.isContentCardsUnreadVisualIndicatorEnabled = builder.isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release();
        this.isInAppMessageAccessibilityExclusiveModeEnabled = builder.isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release();
        this.isPushWakeScreenForNotificationEnabled = builder.isPushWakeScreenForNotificationEnabled$android_sdk_base_release();
        this.isPushHtmlRenderingEnabled = builder.isPushHtmlRenderingEnabled$android_sdk_base_release();
        this.areGeofencesEnabled = builder.isGeofencesEnabled$android_sdk_base_release();
        this.isInAppMessageTestPushEagerDisplayEnabled = builder.getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release();
        this.areAutomaticGeofenceRequestsEnabled = builder.getAutomaticGeofenceRequestsEnabled$android_sdk_base_release();
        this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release();
        this.isSdkAuthEnabled = builder.isSdkAuthEnabled$android_sdk_base_release();
        this.isTouchModeRequiredForHtmlInAppMessages = builder.isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release();
        this.deviceObjectAllowlist = builder.getDeviceObjectAllowlist$android_sdk_base_release();
        this.isDeviceObjectAllowlistEnabled = builder.isDeviceObjectAllowlistEnabled$android_sdk_base_release();
        this.customLocationProviderNames = builder.getCustomLocationProviderNames$android_sdk_base_release();
        this.brazeSdkMetadata = builder.getBrazeSdkMetadata$android_sdk_base_release();
        this.isHtmlInAppMessageApplyWindowInsetsEnabled = builder.isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release();
        this.isHtmlInAppMessageHtmlLinkTargetEnabled = builder.isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release();
        this.doesPushStoryDismissOnClick = builder.getDoesPushStoryDismissOnClick$android_sdk_base_release();
        this.isFallbackFirebaseMessagingServiceEnabled = builder.isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release();
        this.fallbackFirebaseMessagingServiceClasspath = builder.getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release();
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bs\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bº\u0004\b\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010m\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010v\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u007f\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u0012\b\u0002\u0010\u0089\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0088\u0001\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u0011\b\u0002\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0012\b\u0002\u0010\u0096\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\f\u0012\u000b\b\u0002\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010¢\u0001\u001a\u0004\u0018\u00010\u0014\u0012\u000b\b\u0002\u0010¥\u0001\u001a\u0004\u0018\u00010\u0004¢\u0006\u0006\b¨\u0001\u0010©\u0001B\u000b\b\u0016¢\u0006\u0006\b¨\u0001\u0010ª\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000f\u001a\u00020\u00002\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fJ\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR$\u0010&\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR$\u0010)\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR$\u0010,\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR$\u0010/\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010\u001aR$\u00102\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010:\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010@\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R$\u0010C\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R$\u0010F\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010;\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R$\u0010I\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010;\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R$\u0010L\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010;\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R$\u0010O\u001a\u0004\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010;\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R$\u0010R\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010X\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010S\u001a\u0004\bY\u0010U\"\u0004\bZ\u0010WR$\u0010[\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b[\u0010S\u001a\u0004\b\\\u0010U\"\u0004\b]\u0010WR$\u0010^\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010S\u001a\u0004\b_\u0010U\"\u0004\b`\u0010WR$\u0010a\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010WR$\u0010d\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010S\u001a\u0004\be\u0010U\"\u0004\bf\u0010WR$\u0010g\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bg\u0010S\u001a\u0004\bh\u0010U\"\u0004\bi\u0010WR$\u0010j\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010S\u001a\u0004\bk\u0010U\"\u0004\bl\u0010WR$\u0010m\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010S\u001a\u0004\bn\u0010U\"\u0004\bo\u0010WR$\u0010p\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bp\u0010S\u001a\u0004\bq\u0010U\"\u0004\br\u0010WR$\u0010s\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010S\u001a\u0004\bt\u0010U\"\u0004\bu\u0010WR$\u0010v\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010S\u001a\u0004\bw\u0010U\"\u0004\bx\u0010WR$\u0010y\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010S\u001a\u0004\bz\u0010U\"\u0004\b{\u0010WR$\u0010|\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010S\u001a\u0004\b}\u0010U\"\u0004\b~\u0010WR&\u0010\u007f\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010S\u001a\u0005\b\u0080\u0001\u0010U\"\u0005\b\u0081\u0001\u0010WR(\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010S\u001a\u0005\b\u0083\u0001\u0010U\"\u0005\b\u0084\u0001\u0010WR(\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0085\u0001\u0010S\u001a\u0005\b\u0086\u0001\u0010U\"\u0005\b\u0087\u0001\u0010WR2\u0010\u0089\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0088\u0001\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010S\u001a\u0005\b\u0090\u0001\u0010U\"\u0005\b\u0091\u0001\u0010WR1\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u008a\u0001\u001a\u0006\b\u0093\u0001\u0010\u008c\u0001\"\u0006\b\u0094\u0001\u0010\u008e\u0001R2\u0010\u0096\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0095\u0001\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u008a\u0001\u001a\u0006\b\u0097\u0001\u0010\u008c\u0001\"\u0006\b\u0098\u0001\u0010\u008e\u0001R(\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010S\u001a\u0005\b\u009a\u0001\u0010U\"\u0005\b\u009b\u0001\u0010WR(\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010S\u001a\u0005\b\u009d\u0001\u0010U\"\u0005\b\u009e\u0001\u0010WR(\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u009f\u0001\u0010S\u001a\u0005\b \u0001\u0010U\"\u0005\b¡\u0001\u0010WR(\u0010¢\u0001\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010S\u001a\u0005\b£\u0001\u0010U\"\u0005\b¤\u0001\u0010WR(\u0010¥\u0001\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010\u0016\u001a\u0005\b¦\u0001\u0010\u0018\"\u0005\b§\u0001\u0010\u001a¨\u0006«\u0001"}, d2 = {"Lcom/braze/configuration/BrazeConfig$Builder;", "", "Lcom/braze/configuration/BrazeConfig;", "build", "", "apiKey", "setApiKey", "Lcom/braze/enums/SdkFlavor;", "sdkFlavor", "setSdkFlavor", "customEndpoint", "setCustomEndpoint", "Ljava/util/EnumSet;", "Lcom/braze/enums/BrazeSdkMetadata;", "sdkMetadata", "setSdkMetadata", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getApiKey$android_sdk_base_release", "()Ljava/lang/String;", "setApiKey$android_sdk_base_release", "(Ljava/lang/String;)V", "serverTarget", "getServerTarget$android_sdk_base_release", "setServerTarget$android_sdk_base_release", "smallNotificationIconName", "getSmallNotificationIconName$android_sdk_base_release", "setSmallNotificationIconName$android_sdk_base_release", "largeNotificationIconName", "getLargeNotificationIconName$android_sdk_base_release", "setLargeNotificationIconName$android_sdk_base_release", "getCustomEndpoint$android_sdk_base_release", "setCustomEndpoint$android_sdk_base_release", "defaultNotificationChannelName", "getDefaultNotificationChannelName$android_sdk_base_release", "setDefaultNotificationChannelName$android_sdk_base_release", "defaultNotificationChannelDescription", "getDefaultNotificationChannelDescription$android_sdk_base_release", "setDefaultNotificationChannelDescription$android_sdk_base_release", "pushDeepLinkBackStackActivityClassName", "getPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "setPushDeepLinkBackStackActivityClassName$android_sdk_base_release", "firebaseCloudMessagingSenderIdKey", "getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "setFirebaseCloudMessagingSenderIdKey$android_sdk_base_release", "customHtmlWebViewActivityClassName", "getCustomHtmlWebViewActivityClassName$android_sdk_base_release", "setCustomHtmlWebViewActivityClassName$android_sdk_base_release", "Lcom/braze/enums/SdkFlavor;", "getSdkFlavor$android_sdk_base_release", "()Lcom/braze/enums/SdkFlavor;", "setSdkFlavor$android_sdk_base_release", "(Lcom/braze/enums/SdkFlavor;)V", "sessionTimeout", "Ljava/lang/Integer;", "getSessionTimeout$android_sdk_base_release", "()Ljava/lang/Integer;", "setSessionTimeout$android_sdk_base_release", "(Ljava/lang/Integer;)V", "defaultNotificationAccentColor", "getDefaultNotificationAccentColor$android_sdk_base_release", "setDefaultNotificationAccentColor$android_sdk_base_release", "triggerActionMinimumTimeIntervalSeconds", "getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "setTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release", "badNetworkInterval", "getBadNetworkInterval$android_sdk_base_release", "setBadNetworkInterval$android_sdk_base_release", "goodNetworkInterval", "getGoodNetworkInterval$android_sdk_base_release", "setGoodNetworkInterval$android_sdk_base_release", "greatNetworkInterval", "getGreatNetworkInterval$android_sdk_base_release", "setGreatNetworkInterval$android_sdk_base_release", "inAppMessageWebViewClientMaxOnPageFinishedWaitMs", "getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "setInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release", "admMessagingRegistrationEnabled", "Ljava/lang/Boolean;", "getAdmMessagingRegistrationEnabled$android_sdk_base_release", "()Ljava/lang/Boolean;", "setAdmMessagingRegistrationEnabled$android_sdk_base_release", "(Ljava/lang/Boolean;)V", "handlePushDeepLinksAutomatically", "getHandlePushDeepLinksAutomatically$android_sdk_base_release", "setHandlePushDeepLinksAutomatically$android_sdk_base_release", "isLocationCollectionEnabled", "isLocationCollectionEnabled$android_sdk_base_release", "setLocationCollectionEnabled$android_sdk_base_release", "isNewsFeedVisualIndicatorOn", "isNewsFeedVisualIndicatorOn$android_sdk_base_release", "setNewsFeedVisualIndicatorOn$android_sdk_base_release", "isPushDeepLinkBackStackActivityEnabled", "isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "setPushDeepLinkBackStackActivityEnabled$android_sdk_base_release", "isSessionStartBasedTimeoutEnabled", "isSessionStartBasedTimeoutEnabled$android_sdk_base_release", "setSessionStartBasedTimeoutEnabled$android_sdk_base_release", "isFirebaseCloudMessagingRegistrationEnabled", "isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "setFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release", "isContentCardsUnreadVisualIndicatorEnabled", "isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "setContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release", "isInAppMessageAccessibilityExclusiveModeEnabled", "isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "setInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release", "isPushWakeScreenForNotificationEnabled", "isPushWakeScreenForNotificationEnabled$android_sdk_base_release", "setPushWakeScreenForNotificationEnabled$android_sdk_base_release", "isPushHtmlRenderingEnabled", "isPushHtmlRenderingEnabled$android_sdk_base_release", "setPushHtmlRenderingEnabled$android_sdk_base_release", "isGeofencesEnabled", "isGeofencesEnabled$android_sdk_base_release", "setGeofencesEnabled$android_sdk_base_release", "inAppMessageTestPushEagerDisplayEnabled", "getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "setInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release", "automaticGeofenceRequestsEnabled", "getAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "setAutomaticGeofenceRequestsEnabled$android_sdk_base_release", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled", "isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "setFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release", "isTouchModeRequiredForHtmlInAppMessages", "isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "setTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release", "isSdkAuthEnabled", "isSdkAuthEnabled$android_sdk_base_release", "setSdkAuthEnabled$android_sdk_base_release", "Lcom/braze/enums/DeviceKey;", "deviceObjectAllowlist", "Ljava/util/EnumSet;", "getDeviceObjectAllowlist$android_sdk_base_release", "()Ljava/util/EnumSet;", "setDeviceObjectAllowlist$android_sdk_base_release", "(Ljava/util/EnumSet;)V", "isDeviceObjectAllowlistEnabled", "isDeviceObjectAllowlistEnabled$android_sdk_base_release", "setDeviceObjectAllowlistEnabled$android_sdk_base_release", "brazeSdkMetadata", "getBrazeSdkMetadata$android_sdk_base_release", "setBrazeSdkMetadata$android_sdk_base_release", "Lcom/braze/enums/LocationProviderName;", "customLocationProviderNames", "getCustomLocationProviderNames$android_sdk_base_release", "setCustomLocationProviderNames$android_sdk_base_release", "isHtmlInAppMessageApplyWindowInsetsEnabled", "isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "setHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release", "isHtmlInAppMessageHtmlLinkTargetEnabled", "isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "setHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release", "doesPushStoryDismissOnClick", "getDoesPushStoryDismissOnClick$android_sdk_base_release", "setDoesPushStoryDismissOnClick$android_sdk_base_release", "isFallbackFirebaseMessagingServiceEnabled", "isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "setFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release", "fallbackFirebaseMessagingServiceClasspath", "getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "setFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/SdkFlavor;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/util/EnumSet;Ljava/util/EnumSet;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Builder {
        private Boolean admMessagingRegistrationEnabled;
        private String apiKey;
        private Boolean automaticGeofenceRequestsEnabled;
        private Integer badNetworkInterval;
        private EnumSet<BrazeSdkMetadata> brazeSdkMetadata;
        private String customEndpoint;
        private String customHtmlWebViewActivityClassName;
        private EnumSet<LocationProviderName> customLocationProviderNames;
        private Integer defaultNotificationAccentColor;
        private String defaultNotificationChannelDescription;
        private String defaultNotificationChannelName;
        private EnumSet<DeviceKey> deviceObjectAllowlist;
        private Boolean doesPushStoryDismissOnClick;
        private String fallbackFirebaseMessagingServiceClasspath;
        private String firebaseCloudMessagingSenderIdKey;
        private Integer goodNetworkInterval;
        private Integer greatNetworkInterval;
        private Boolean handlePushDeepLinksAutomatically;
        private Boolean inAppMessageTestPushEagerDisplayEnabled;
        private Integer inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        private Boolean isContentCardsUnreadVisualIndicatorEnabled;
        private Boolean isDeviceObjectAllowlistEnabled;
        private Boolean isFallbackFirebaseMessagingServiceEnabled;
        private Boolean isFirebaseCloudMessagingRegistrationEnabled;
        private Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        private Boolean isGeofencesEnabled;
        private Boolean isHtmlInAppMessageApplyWindowInsetsEnabled;
        private Boolean isHtmlInAppMessageHtmlLinkTargetEnabled;
        private Boolean isInAppMessageAccessibilityExclusiveModeEnabled;
        private Boolean isLocationCollectionEnabled;
        private Boolean isNewsFeedVisualIndicatorOn;
        private Boolean isPushDeepLinkBackStackActivityEnabled;
        private Boolean isPushHtmlRenderingEnabled;
        private Boolean isPushWakeScreenForNotificationEnabled;
        private Boolean isSdkAuthEnabled;
        private Boolean isSessionStartBasedTimeoutEnabled;
        private Boolean isTouchModeRequiredForHtmlInAppMessages;
        private String largeNotificationIconName;
        private String pushDeepLinkBackStackActivityClassName;
        private SdkFlavor sdkFlavor;
        private String serverTarget;
        private Integer sessionTimeout;
        private String smallNotificationIconName;
        private Integer triggerActionMinimumTimeIntervalSeconds;

        /* loaded from: classes.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Cannot set Braze API key to blank string. API key field not set";
            }
        }

        private Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet<DeviceKey> enumSet, Boolean bool18, EnumSet<BrazeSdkMetadata> enumSet2, EnumSet<LocationProviderName> enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11) {
            this.apiKey = str;
            this.serverTarget = str2;
            this.smallNotificationIconName = str3;
            this.largeNotificationIconName = str4;
            this.customEndpoint = str5;
            this.defaultNotificationChannelName = str6;
            this.defaultNotificationChannelDescription = str7;
            this.pushDeepLinkBackStackActivityClassName = str8;
            this.firebaseCloudMessagingSenderIdKey = str9;
            this.customHtmlWebViewActivityClassName = str10;
            this.sdkFlavor = sdkFlavor;
            this.sessionTimeout = num;
            this.defaultNotificationAccentColor = num2;
            this.triggerActionMinimumTimeIntervalSeconds = num3;
            this.badNetworkInterval = num4;
            this.goodNetworkInterval = num5;
            this.greatNetworkInterval = num6;
            this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs = num7;
            this.admMessagingRegistrationEnabled = bool;
            this.handlePushDeepLinksAutomatically = bool2;
            this.isLocationCollectionEnabled = bool3;
            this.isNewsFeedVisualIndicatorOn = bool4;
            this.isPushDeepLinkBackStackActivityEnabled = bool5;
            this.isSessionStartBasedTimeoutEnabled = bool6;
            this.isFirebaseCloudMessagingRegistrationEnabled = bool7;
            this.isContentCardsUnreadVisualIndicatorEnabled = bool8;
            this.isInAppMessageAccessibilityExclusiveModeEnabled = bool9;
            this.isPushWakeScreenForNotificationEnabled = bool10;
            this.isPushHtmlRenderingEnabled = bool11;
            this.isGeofencesEnabled = bool12;
            this.inAppMessageTestPushEagerDisplayEnabled = bool13;
            this.automaticGeofenceRequestsEnabled = bool14;
            this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled = bool15;
            this.isTouchModeRequiredForHtmlInAppMessages = bool16;
            this.isSdkAuthEnabled = bool17;
            this.deviceObjectAllowlist = enumSet;
            this.isDeviceObjectAllowlistEnabled = bool18;
            this.brazeSdkMetadata = enumSet2;
            this.customLocationProviderNames = enumSet3;
            this.isHtmlInAppMessageApplyWindowInsetsEnabled = bool19;
            this.isHtmlInAppMessageHtmlLinkTargetEnabled = bool20;
            this.doesPushStoryDismissOnClick = bool21;
            this.isFallbackFirebaseMessagingServiceEnabled = bool22;
            this.fallbackFirebaseMessagingServiceClasspath = str11;
        }

        public final BrazeConfig build() {
            return new BrazeConfig(this, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Builder)) {
                return false;
            }
            Builder builder = (Builder) obj;
            if (j.a(this.apiKey, builder.apiKey) && j.a(this.serverTarget, builder.serverTarget) && j.a(this.smallNotificationIconName, builder.smallNotificationIconName) && j.a(this.largeNotificationIconName, builder.largeNotificationIconName) && j.a(this.customEndpoint, builder.customEndpoint) && j.a(this.defaultNotificationChannelName, builder.defaultNotificationChannelName) && j.a(this.defaultNotificationChannelDescription, builder.defaultNotificationChannelDescription) && j.a(this.pushDeepLinkBackStackActivityClassName, builder.pushDeepLinkBackStackActivityClassName) && j.a(this.firebaseCloudMessagingSenderIdKey, builder.firebaseCloudMessagingSenderIdKey) && j.a(this.customHtmlWebViewActivityClassName, builder.customHtmlWebViewActivityClassName) && this.sdkFlavor == builder.sdkFlavor && j.a(this.sessionTimeout, builder.sessionTimeout) && j.a(this.defaultNotificationAccentColor, builder.defaultNotificationAccentColor) && j.a(this.triggerActionMinimumTimeIntervalSeconds, builder.triggerActionMinimumTimeIntervalSeconds) && j.a(this.badNetworkInterval, builder.badNetworkInterval) && j.a(this.goodNetworkInterval, builder.goodNetworkInterval) && j.a(this.greatNetworkInterval, builder.greatNetworkInterval) && j.a(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs, builder.inAppMessageWebViewClientMaxOnPageFinishedWaitMs) && j.a(this.admMessagingRegistrationEnabled, builder.admMessagingRegistrationEnabled) && j.a(this.handlePushDeepLinksAutomatically, builder.handlePushDeepLinksAutomatically) && j.a(this.isLocationCollectionEnabled, builder.isLocationCollectionEnabled) && j.a(this.isNewsFeedVisualIndicatorOn, builder.isNewsFeedVisualIndicatorOn) && j.a(this.isPushDeepLinkBackStackActivityEnabled, builder.isPushDeepLinkBackStackActivityEnabled) && j.a(this.isSessionStartBasedTimeoutEnabled, builder.isSessionStartBasedTimeoutEnabled) && j.a(this.isFirebaseCloudMessagingRegistrationEnabled, builder.isFirebaseCloudMessagingRegistrationEnabled) && j.a(this.isContentCardsUnreadVisualIndicatorEnabled, builder.isContentCardsUnreadVisualIndicatorEnabled) && j.a(this.isInAppMessageAccessibilityExclusiveModeEnabled, builder.isInAppMessageAccessibilityExclusiveModeEnabled) && j.a(this.isPushWakeScreenForNotificationEnabled, builder.isPushWakeScreenForNotificationEnabled) && j.a(this.isPushHtmlRenderingEnabled, builder.isPushHtmlRenderingEnabled) && j.a(this.isGeofencesEnabled, builder.isGeofencesEnabled) && j.a(this.inAppMessageTestPushEagerDisplayEnabled, builder.inAppMessageTestPushEagerDisplayEnabled) && j.a(this.automaticGeofenceRequestsEnabled, builder.automaticGeofenceRequestsEnabled) && j.a(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled, builder.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled) && j.a(this.isTouchModeRequiredForHtmlInAppMessages, builder.isTouchModeRequiredForHtmlInAppMessages) && j.a(this.isSdkAuthEnabled, builder.isSdkAuthEnabled) && j.a(this.deviceObjectAllowlist, builder.deviceObjectAllowlist) && j.a(this.isDeviceObjectAllowlistEnabled, builder.isDeviceObjectAllowlistEnabled) && j.a(this.brazeSdkMetadata, builder.brazeSdkMetadata) && j.a(this.customLocationProviderNames, builder.customLocationProviderNames) && j.a(this.isHtmlInAppMessageApplyWindowInsetsEnabled, builder.isHtmlInAppMessageApplyWindowInsetsEnabled) && j.a(this.isHtmlInAppMessageHtmlLinkTargetEnabled, builder.isHtmlInAppMessageHtmlLinkTargetEnabled) && j.a(this.doesPushStoryDismissOnClick, builder.doesPushStoryDismissOnClick) && j.a(this.isFallbackFirebaseMessagingServiceEnabled, builder.isFallbackFirebaseMessagingServiceEnabled) && j.a(this.fallbackFirebaseMessagingServiceClasspath, builder.fallbackFirebaseMessagingServiceClasspath)) {
                return true;
            }
            return false;
        }

        public final Boolean getAdmMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.admMessagingRegistrationEnabled;
        }

        public final String getApiKey$android_sdk_base_release() {
            return this.apiKey;
        }

        public final Boolean getAutomaticGeofenceRequestsEnabled$android_sdk_base_release() {
            return this.automaticGeofenceRequestsEnabled;
        }

        public final Integer getBadNetworkInterval$android_sdk_base_release() {
            return this.badNetworkInterval;
        }

        public final EnumSet<BrazeSdkMetadata> getBrazeSdkMetadata$android_sdk_base_release() {
            return this.brazeSdkMetadata;
        }

        public final String getCustomEndpoint$android_sdk_base_release() {
            return this.customEndpoint;
        }

        public final String getCustomHtmlWebViewActivityClassName$android_sdk_base_release() {
            return this.customHtmlWebViewActivityClassName;
        }

        public final EnumSet<LocationProviderName> getCustomLocationProviderNames$android_sdk_base_release() {
            return this.customLocationProviderNames;
        }

        public final Integer getDefaultNotificationAccentColor$android_sdk_base_release() {
            return this.defaultNotificationAccentColor;
        }

        public final String getDefaultNotificationChannelDescription$android_sdk_base_release() {
            return this.defaultNotificationChannelDescription;
        }

        public final String getDefaultNotificationChannelName$android_sdk_base_release() {
            return this.defaultNotificationChannelName;
        }

        public final EnumSet<DeviceKey> getDeviceObjectAllowlist$android_sdk_base_release() {
            return this.deviceObjectAllowlist;
        }

        public final Boolean getDoesPushStoryDismissOnClick$android_sdk_base_release() {
            return this.doesPushStoryDismissOnClick;
        }

        public final String getFallbackFirebaseMessagingServiceClasspath$android_sdk_base_release() {
            return this.fallbackFirebaseMessagingServiceClasspath;
        }

        public final String getFirebaseCloudMessagingSenderIdKey$android_sdk_base_release() {
            return this.firebaseCloudMessagingSenderIdKey;
        }

        public final Integer getGoodNetworkInterval$android_sdk_base_release() {
            return this.goodNetworkInterval;
        }

        public final Integer getGreatNetworkInterval$android_sdk_base_release() {
            return this.greatNetworkInterval;
        }

        public final Boolean getHandlePushDeepLinksAutomatically$android_sdk_base_release() {
            return this.handlePushDeepLinksAutomatically;
        }

        public final Boolean getInAppMessageTestPushEagerDisplayEnabled$android_sdk_base_release() {
            return this.inAppMessageTestPushEagerDisplayEnabled;
        }

        public final Integer getInAppMessageWebViewClientMaxOnPageFinishedWaitMs$android_sdk_base_release() {
            return this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
        }

        public final String getLargeNotificationIconName$android_sdk_base_release() {
            return this.largeNotificationIconName;
        }

        public final String getPushDeepLinkBackStackActivityClassName$android_sdk_base_release() {
            return this.pushDeepLinkBackStackActivityClassName;
        }

        public final SdkFlavor getSdkFlavor$android_sdk_base_release() {
            return this.sdkFlavor;
        }

        public final String getServerTarget$android_sdk_base_release() {
            return this.serverTarget;
        }

        public final Integer getSessionTimeout$android_sdk_base_release() {
            return this.sessionTimeout;
        }

        public final String getSmallNotificationIconName$android_sdk_base_release() {
            return this.smallNotificationIconName;
        }

        public final Integer getTriggerActionMinimumTimeIntervalSeconds$android_sdk_base_release() {
            return this.triggerActionMinimumTimeIntervalSeconds;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            int hashCode12;
            int hashCode13;
            int hashCode14;
            int hashCode15;
            int hashCode16;
            int hashCode17;
            int hashCode18;
            int hashCode19;
            int hashCode20;
            int hashCode21;
            int hashCode22;
            int hashCode23;
            int hashCode24;
            int hashCode25;
            int hashCode26;
            int hashCode27;
            int hashCode28;
            int hashCode29;
            int hashCode30;
            int hashCode31;
            int hashCode32;
            int hashCode33;
            int hashCode34;
            int hashCode35;
            int hashCode36;
            int hashCode37;
            int hashCode38;
            int hashCode39;
            int hashCode40;
            int hashCode41;
            int hashCode42;
            int hashCode43;
            String str = this.apiKey;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = hashCode * 31;
            String str2 = this.serverTarget;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.smallNotificationIconName;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.largeNotificationIconName;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (i4 + hashCode4) * 31;
            String str5 = this.customEndpoint;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i6 = (i5 + hashCode5) * 31;
            String str6 = this.defaultNotificationChannelName;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            String str7 = this.defaultNotificationChannelDescription;
            if (str7 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str7.hashCode();
            }
            int i8 = (i7 + hashCode7) * 31;
            String str8 = this.pushDeepLinkBackStackActivityClassName;
            if (str8 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str8.hashCode();
            }
            int i9 = (i8 + hashCode8) * 31;
            String str9 = this.firebaseCloudMessagingSenderIdKey;
            if (str9 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str9.hashCode();
            }
            int i10 = (i9 + hashCode9) * 31;
            String str10 = this.customHtmlWebViewActivityClassName;
            if (str10 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str10.hashCode();
            }
            int i11 = (i10 + hashCode10) * 31;
            SdkFlavor sdkFlavor = this.sdkFlavor;
            if (sdkFlavor == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = sdkFlavor.hashCode();
            }
            int i12 = (i11 + hashCode11) * 31;
            Integer num = this.sessionTimeout;
            if (num == null) {
                hashCode12 = 0;
            } else {
                hashCode12 = num.hashCode();
            }
            int i13 = (i12 + hashCode12) * 31;
            Integer num2 = this.defaultNotificationAccentColor;
            if (num2 == null) {
                hashCode13 = 0;
            } else {
                hashCode13 = num2.hashCode();
            }
            int i14 = (i13 + hashCode13) * 31;
            Integer num3 = this.triggerActionMinimumTimeIntervalSeconds;
            if (num3 == null) {
                hashCode14 = 0;
            } else {
                hashCode14 = num3.hashCode();
            }
            int i15 = (i14 + hashCode14) * 31;
            Integer num4 = this.badNetworkInterval;
            if (num4 == null) {
                hashCode15 = 0;
            } else {
                hashCode15 = num4.hashCode();
            }
            int i16 = (i15 + hashCode15) * 31;
            Integer num5 = this.goodNetworkInterval;
            if (num5 == null) {
                hashCode16 = 0;
            } else {
                hashCode16 = num5.hashCode();
            }
            int i17 = (i16 + hashCode16) * 31;
            Integer num6 = this.greatNetworkInterval;
            if (num6 == null) {
                hashCode17 = 0;
            } else {
                hashCode17 = num6.hashCode();
            }
            int i18 = (i17 + hashCode17) * 31;
            Integer num7 = this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs;
            if (num7 == null) {
                hashCode18 = 0;
            } else {
                hashCode18 = num7.hashCode();
            }
            int i19 = (i18 + hashCode18) * 31;
            Boolean bool = this.admMessagingRegistrationEnabled;
            if (bool == null) {
                hashCode19 = 0;
            } else {
                hashCode19 = bool.hashCode();
            }
            int i20 = (i19 + hashCode19) * 31;
            Boolean bool2 = this.handlePushDeepLinksAutomatically;
            if (bool2 == null) {
                hashCode20 = 0;
            } else {
                hashCode20 = bool2.hashCode();
            }
            int i21 = (i20 + hashCode20) * 31;
            Boolean bool3 = this.isLocationCollectionEnabled;
            if (bool3 == null) {
                hashCode21 = 0;
            } else {
                hashCode21 = bool3.hashCode();
            }
            int i22 = (i21 + hashCode21) * 31;
            Boolean bool4 = this.isNewsFeedVisualIndicatorOn;
            if (bool4 == null) {
                hashCode22 = 0;
            } else {
                hashCode22 = bool4.hashCode();
            }
            int i23 = (i22 + hashCode22) * 31;
            Boolean bool5 = this.isPushDeepLinkBackStackActivityEnabled;
            if (bool5 == null) {
                hashCode23 = 0;
            } else {
                hashCode23 = bool5.hashCode();
            }
            int i24 = (i23 + hashCode23) * 31;
            Boolean bool6 = this.isSessionStartBasedTimeoutEnabled;
            if (bool6 == null) {
                hashCode24 = 0;
            } else {
                hashCode24 = bool6.hashCode();
            }
            int i25 = (i24 + hashCode24) * 31;
            Boolean bool7 = this.isFirebaseCloudMessagingRegistrationEnabled;
            if (bool7 == null) {
                hashCode25 = 0;
            } else {
                hashCode25 = bool7.hashCode();
            }
            int i26 = (i25 + hashCode25) * 31;
            Boolean bool8 = this.isContentCardsUnreadVisualIndicatorEnabled;
            if (bool8 == null) {
                hashCode26 = 0;
            } else {
                hashCode26 = bool8.hashCode();
            }
            int i27 = (i26 + hashCode26) * 31;
            Boolean bool9 = this.isInAppMessageAccessibilityExclusiveModeEnabled;
            if (bool9 == null) {
                hashCode27 = 0;
            } else {
                hashCode27 = bool9.hashCode();
            }
            int i28 = (i27 + hashCode27) * 31;
            Boolean bool10 = this.isPushWakeScreenForNotificationEnabled;
            if (bool10 == null) {
                hashCode28 = 0;
            } else {
                hashCode28 = bool10.hashCode();
            }
            int i29 = (i28 + hashCode28) * 31;
            Boolean bool11 = this.isPushHtmlRenderingEnabled;
            if (bool11 == null) {
                hashCode29 = 0;
            } else {
                hashCode29 = bool11.hashCode();
            }
            int i30 = (i29 + hashCode29) * 31;
            Boolean bool12 = this.isGeofencesEnabled;
            if (bool12 == null) {
                hashCode30 = 0;
            } else {
                hashCode30 = bool12.hashCode();
            }
            int i31 = (i30 + hashCode30) * 31;
            Boolean bool13 = this.inAppMessageTestPushEagerDisplayEnabled;
            if (bool13 == null) {
                hashCode31 = 0;
            } else {
                hashCode31 = bool13.hashCode();
            }
            int i32 = (i31 + hashCode31) * 31;
            Boolean bool14 = this.automaticGeofenceRequestsEnabled;
            if (bool14 == null) {
                hashCode32 = 0;
            } else {
                hashCode32 = bool14.hashCode();
            }
            int i33 = (i32 + hashCode32) * 31;
            Boolean bool15 = this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
            if (bool15 == null) {
                hashCode33 = 0;
            } else {
                hashCode33 = bool15.hashCode();
            }
            int i34 = (i33 + hashCode33) * 31;
            Boolean bool16 = this.isTouchModeRequiredForHtmlInAppMessages;
            if (bool16 == null) {
                hashCode34 = 0;
            } else {
                hashCode34 = bool16.hashCode();
            }
            int i35 = (i34 + hashCode34) * 31;
            Boolean bool17 = this.isSdkAuthEnabled;
            if (bool17 == null) {
                hashCode35 = 0;
            } else {
                hashCode35 = bool17.hashCode();
            }
            int i36 = (i35 + hashCode35) * 31;
            EnumSet<DeviceKey> enumSet = this.deviceObjectAllowlist;
            if (enumSet == null) {
                hashCode36 = 0;
            } else {
                hashCode36 = enumSet.hashCode();
            }
            int i37 = (i36 + hashCode36) * 31;
            Boolean bool18 = this.isDeviceObjectAllowlistEnabled;
            if (bool18 == null) {
                hashCode37 = 0;
            } else {
                hashCode37 = bool18.hashCode();
            }
            int i38 = (i37 + hashCode37) * 31;
            EnumSet<BrazeSdkMetadata> enumSet2 = this.brazeSdkMetadata;
            if (enumSet2 == null) {
                hashCode38 = 0;
            } else {
                hashCode38 = enumSet2.hashCode();
            }
            int i39 = (i38 + hashCode38) * 31;
            EnumSet<LocationProviderName> enumSet3 = this.customLocationProviderNames;
            if (enumSet3 == null) {
                hashCode39 = 0;
            } else {
                hashCode39 = enumSet3.hashCode();
            }
            int i40 = (i39 + hashCode39) * 31;
            Boolean bool19 = this.isHtmlInAppMessageApplyWindowInsetsEnabled;
            if (bool19 == null) {
                hashCode40 = 0;
            } else {
                hashCode40 = bool19.hashCode();
            }
            int i41 = (i40 + hashCode40) * 31;
            Boolean bool20 = this.isHtmlInAppMessageHtmlLinkTargetEnabled;
            if (bool20 == null) {
                hashCode41 = 0;
            } else {
                hashCode41 = bool20.hashCode();
            }
            int i42 = (i41 + hashCode41) * 31;
            Boolean bool21 = this.doesPushStoryDismissOnClick;
            if (bool21 == null) {
                hashCode42 = 0;
            } else {
                hashCode42 = bool21.hashCode();
            }
            int i43 = (i42 + hashCode42) * 31;
            Boolean bool22 = this.isFallbackFirebaseMessagingServiceEnabled;
            if (bool22 == null) {
                hashCode43 = 0;
            } else {
                hashCode43 = bool22.hashCode();
            }
            int i44 = (i43 + hashCode43) * 31;
            String str11 = this.fallbackFirebaseMessagingServiceClasspath;
            if (str11 != null) {
                i = str11.hashCode();
            }
            return i44 + i;
        }

        public final Boolean isContentCardsUnreadVisualIndicatorEnabled$android_sdk_base_release() {
            return this.isContentCardsUnreadVisualIndicatorEnabled;
        }

        public final Boolean isDeviceObjectAllowlistEnabled$android_sdk_base_release() {
            return this.isDeviceObjectAllowlistEnabled;
        }

        public final Boolean isFallbackFirebaseMessagingServiceEnabled$android_sdk_base_release() {
            return this.isFallbackFirebaseMessagingServiceEnabled;
        }

        public final Boolean isFirebaseCloudMessagingRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseCloudMessagingRegistrationEnabled;
        }

        public final Boolean isFirebaseMessagingServiceOnNewTokenRegistrationEnabled$android_sdk_base_release() {
            return this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled;
        }

        public final Boolean isGeofencesEnabled$android_sdk_base_release() {
            return this.isGeofencesEnabled;
        }

        public final Boolean isHtmlInAppMessageApplyWindowInsetsEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageApplyWindowInsetsEnabled;
        }

        public final Boolean isHtmlInAppMessageHtmlLinkTargetEnabled$android_sdk_base_release() {
            return this.isHtmlInAppMessageHtmlLinkTargetEnabled;
        }

        public final Boolean isInAppMessageAccessibilityExclusiveModeEnabled$android_sdk_base_release() {
            return this.isInAppMessageAccessibilityExclusiveModeEnabled;
        }

        public final Boolean isLocationCollectionEnabled$android_sdk_base_release() {
            return this.isLocationCollectionEnabled;
        }

        public final Boolean isNewsFeedVisualIndicatorOn$android_sdk_base_release() {
            return this.isNewsFeedVisualIndicatorOn;
        }

        public final Boolean isPushDeepLinkBackStackActivityEnabled$android_sdk_base_release() {
            return this.isPushDeepLinkBackStackActivityEnabled;
        }

        public final Boolean isPushHtmlRenderingEnabled$android_sdk_base_release() {
            return this.isPushHtmlRenderingEnabled;
        }

        public final Boolean isPushWakeScreenForNotificationEnabled$android_sdk_base_release() {
            return this.isPushWakeScreenForNotificationEnabled;
        }

        public final Boolean isSdkAuthEnabled$android_sdk_base_release() {
            return this.isSdkAuthEnabled;
        }

        public final Boolean isSessionStartBasedTimeoutEnabled$android_sdk_base_release() {
            return this.isSessionStartBasedTimeoutEnabled;
        }

        public final Boolean isTouchModeRequiredForHtmlInAppMessages$android_sdk_base_release() {
            return this.isTouchModeRequiredForHtmlInAppMessages;
        }

        public final Builder setApiKey(String str) {
            j.f(str, "apiKey");
            if (!m.b0(str)) {
                this.apiKey = str;
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            }
            return this;
        }

        public final Builder setCustomEndpoint(String str) {
            j.f(str, "customEndpoint");
            this.customEndpoint = str;
            return this;
        }

        public final Builder setSdkFlavor(SdkFlavor sdkFlavor) {
            this.sdkFlavor = sdkFlavor;
            return this;
        }

        public final Builder setSdkMetadata(EnumSet<BrazeSdkMetadata> enumSet) {
            this.brazeSdkMetadata = enumSet;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Builder(apiKey=");
            sb.append(this.apiKey);
            sb.append(", serverTarget=");
            sb.append(this.serverTarget);
            sb.append(", smallNotificationIconName=");
            sb.append(this.smallNotificationIconName);
            sb.append(", largeNotificationIconName=");
            sb.append(this.largeNotificationIconName);
            sb.append(", customEndpoint=");
            sb.append(this.customEndpoint);
            sb.append(", defaultNotificationChannelName=");
            sb.append(this.defaultNotificationChannelName);
            sb.append(", defaultNotificationChannelDescription=");
            sb.append(this.defaultNotificationChannelDescription);
            sb.append(", pushDeepLinkBackStackActivityClassName=");
            sb.append(this.pushDeepLinkBackStackActivityClassName);
            sb.append(", firebaseCloudMessagingSenderIdKey=");
            sb.append(this.firebaseCloudMessagingSenderIdKey);
            sb.append(", customHtmlWebViewActivityClassName=");
            sb.append(this.customHtmlWebViewActivityClassName);
            sb.append(", sdkFlavor=");
            sb.append(this.sdkFlavor);
            sb.append(", sessionTimeout=");
            sb.append(this.sessionTimeout);
            sb.append(", defaultNotificationAccentColor=");
            sb.append(this.defaultNotificationAccentColor);
            sb.append(", triggerActionMinimumTimeIntervalSeconds=");
            sb.append(this.triggerActionMinimumTimeIntervalSeconds);
            sb.append(", badNetworkInterval=");
            sb.append(this.badNetworkInterval);
            sb.append(", goodNetworkInterval=");
            sb.append(this.goodNetworkInterval);
            sb.append(", greatNetworkInterval=");
            sb.append(this.greatNetworkInterval);
            sb.append(", inAppMessageWebViewClientMaxOnPageFinishedWaitMs=");
            sb.append(this.inAppMessageWebViewClientMaxOnPageFinishedWaitMs);
            sb.append(", admMessagingRegistrationEnabled=");
            sb.append(this.admMessagingRegistrationEnabled);
            sb.append(", handlePushDeepLinksAutomatically=");
            sb.append(this.handlePushDeepLinksAutomatically);
            sb.append(", isLocationCollectionEnabled=");
            sb.append(this.isLocationCollectionEnabled);
            sb.append(", isNewsFeedVisualIndicatorOn=");
            sb.append(this.isNewsFeedVisualIndicatorOn);
            sb.append(", isPushDeepLinkBackStackActivityEnabled=");
            sb.append(this.isPushDeepLinkBackStackActivityEnabled);
            sb.append(", isSessionStartBasedTimeoutEnabled=");
            sb.append(this.isSessionStartBasedTimeoutEnabled);
            sb.append(", isFirebaseCloudMessagingRegistrationEnabled=");
            sb.append(this.isFirebaseCloudMessagingRegistrationEnabled);
            sb.append(", isContentCardsUnreadVisualIndicatorEnabled=");
            sb.append(this.isContentCardsUnreadVisualIndicatorEnabled);
            sb.append(", isInAppMessageAccessibilityExclusiveModeEnabled=");
            sb.append(this.isInAppMessageAccessibilityExclusiveModeEnabled);
            sb.append(", isPushWakeScreenForNotificationEnabled=");
            sb.append(this.isPushWakeScreenForNotificationEnabled);
            sb.append(", isPushHtmlRenderingEnabled=");
            sb.append(this.isPushHtmlRenderingEnabled);
            sb.append(", isGeofencesEnabled=");
            sb.append(this.isGeofencesEnabled);
            sb.append(", inAppMessageTestPushEagerDisplayEnabled=");
            sb.append(this.inAppMessageTestPushEagerDisplayEnabled);
            sb.append(", automaticGeofenceRequestsEnabled=");
            sb.append(this.automaticGeofenceRequestsEnabled);
            sb.append(", isFirebaseMessagingServiceOnNewTokenRegistrationEnabled=");
            sb.append(this.isFirebaseMessagingServiceOnNewTokenRegistrationEnabled);
            sb.append(", isTouchModeRequiredForHtmlInAppMessages=");
            sb.append(this.isTouchModeRequiredForHtmlInAppMessages);
            sb.append(", isSdkAuthEnabled=");
            sb.append(this.isSdkAuthEnabled);
            sb.append(", deviceObjectAllowlist=");
            sb.append(this.deviceObjectAllowlist);
            sb.append(", isDeviceObjectAllowlistEnabled=");
            sb.append(this.isDeviceObjectAllowlistEnabled);
            sb.append(", brazeSdkMetadata=");
            sb.append(this.brazeSdkMetadata);
            sb.append(", customLocationProviderNames=");
            sb.append(this.customLocationProviderNames);
            sb.append(", isHtmlInAppMessageApplyWindowInsetsEnabled=");
            sb.append(this.isHtmlInAppMessageApplyWindowInsetsEnabled);
            sb.append(", isHtmlInAppMessageHtmlLinkTargetEnabled=");
            sb.append(this.isHtmlInAppMessageHtmlLinkTargetEnabled);
            sb.append(", doesPushStoryDismissOnClick=");
            sb.append(this.doesPushStoryDismissOnClick);
            sb.append(", isFallbackFirebaseMessagingServiceEnabled=");
            sb.append(this.isFallbackFirebaseMessagingServiceEnabled);
            sb.append(", fallbackFirebaseMessagingServiceClasspath=");
            return t1.b(sb, this.fallbackFirebaseMessagingServiceClasspath, ')');
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SdkFlavor sdkFlavor, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, EnumSet enumSet, Boolean bool18, EnumSet enumSet2, EnumSet enumSet3, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, String str11, int i, int i2, e eVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str10, (i & 1024) != 0 ? null : sdkFlavor, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : num3, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num4, (i & 32768) != 0 ? null : num5, (i & Cast.MAX_MESSAGE_LENGTH) != 0 ? null : num6, (i & 131072) != 0 ? null : num7, (i & 262144) != 0 ? null : bool, (i & 524288) != 0 ? null : bool2, (i & 1048576) != 0 ? null : bool3, (i & 2097152) != 0 ? null : bool4, (i & 4194304) != 0 ? null : bool5, (i & 8388608) != 0 ? null : bool6, (i & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool7, (i & 33554432) != 0 ? null : bool8, (i & 67108864) != 0 ? null : bool9, (i & 134217728) != 0 ? null : bool10, (i & 268435456) != 0 ? null : bool11, (i & 536870912) != 0 ? null : bool12, (i & Ints.MAX_POWER_OF_TWO) != 0 ? null : bool13, (i & Integer.MIN_VALUE) != 0 ? null : bool14, (i2 & 1) != 0 ? null : bool15, (i2 & 2) != 0 ? null : bool16, (i2 & 4) != 0 ? null : bool17, (i2 & 8) != 0 ? null : enumSet, (i2 & 16) != 0 ? null : bool18, (i2 & 32) != 0 ? null : enumSet2, (i2 & 64) != 0 ? null : enumSet3, (i2 & 128) != 0 ? null : bool19, (i2 & 256) != 0 ? null : bool20, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : bool21, (i2 & 1024) != 0 ? null : bool22, (i2 & 2048) != 0 ? null : str11);
        }

        public Builder() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 4095, null);
        }
    }
}
