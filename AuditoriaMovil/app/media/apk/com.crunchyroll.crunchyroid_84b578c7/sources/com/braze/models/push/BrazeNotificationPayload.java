package com.braze.models.push;

import android.content.Context;
import android.os.Bundle;
import com.amazon.aps.iva.c3.b0;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.support.JsonUtils;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\bK\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0011\b\u0007\u0018\u0000 »\u00012\u00020\u0001:\n¼\u0001»\u0001½\u0001¾\u0001¿\u0001B9\b\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0006\b¹\u0001\u0010º\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0014\u0010\u0015R.\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010,\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\"\u00103\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010-\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R$\u00105\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R$\u0010;\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R$\u0010>\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00106\u001a\u0004\b?\u00108\"\u0004\b@\u0010:R$\u0010A\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010&\u001a\u0004\bB\u0010(\"\u0004\bC\u0010*R$\u0010D\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010&\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*R$\u0010G\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010&\u001a\u0004\bH\u0010(\"\u0004\bI\u0010*R$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010&\u001a\u0004\bR\u0010(\"\u0004\bS\u0010*R\"\u0010T\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010-\u001a\u0004\bU\u0010.\"\u0004\bV\u00100R\"\u0010W\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010-\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R\"\u0010Z\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010-\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R\"\u0010]\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010-\u001a\u0004\b]\u0010.\"\u0004\b^\u00100R$\u0010_\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u00106\u001a\u0004\b`\u00108\"\u0004\ba\u0010:R$\u0010b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u00108\"\u0004\bd\u0010:R$\u0010e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u00106\u001a\u0004\bf\u00108\"\u0004\bg\u0010:R$\u0010h\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u00106\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R$\u0010k\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u00106\u001a\u0004\bl\u00108\"\u0004\bm\u0010:R$\u0010n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bn\u00106\u001a\u0004\bo\u00108\"\u0004\bp\u0010:R$\u0010q\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u00106\u001a\u0004\br\u00108\"\u0004\bs\u0010:R$\u0010t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u00106\u001a\u0004\bu\u00108\"\u0004\bv\u0010:R$\u0010w\u001a\u0004\u0018\u00010$8G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010&\u001a\u0004\bx\u0010(\"\u0004\by\u0010*R$\u0010z\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u00106\u001a\u0004\b{\u00108\"\u0004\b|\u0010:R$\u0010}\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b}\u00106\u001a\u0004\b~\u00108\"\u0004\b\u007f\u0010:R.\u0010\u0080\u0001\u001a\u00020+8\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0080\u0001\u0010-\u0012\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0005\b\u0080\u0001\u0010.\"\u0005\b\u0081\u0001\u00100R0\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u001d\n\u0005\b\u0084\u0001\u00106\u0012\u0006\b\u0087\u0001\u0010\u0083\u0001\u001a\u0005\b\u0085\u0001\u00108\"\u0005\b\u0086\u0001\u0010:R1\u0010\u0088\u0001\u001a\u00020J8\u0006@\u0006X\u0087\u000e¢\u0006 \n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0006\b\u008e\u0001\u0010\u0083\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R1\u0010\u008f\u0001\u001a\u00020J8\u0006@\u0006X\u0087\u000e¢\u0006 \n\u0006\b\u008f\u0001\u0010\u0089\u0001\u0012\u0006\b\u0092\u0001\u0010\u0083\u0001\u001a\u0006\b\u0090\u0001\u0010\u008b\u0001\"\u0006\b\u0091\u0001\u0010\u008d\u0001R(\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u00106\u001a\u0005\b\u0094\u0001\u00108\"\u0005\b\u0095\u0001\u0010:R!\u0010\u0098\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R)\u0010\u009a\u0001\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u0096\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0099\u0001R&\u0010¢\u0001\u001a\u00020+8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¢\u0001\u0010-\u001a\u0005\b¢\u0001\u0010.\"\u0005\b£\u0001\u00100R\u001f\u0010¥\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010\u0099\u0001R&\u0010¨\u0001\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0005\u0012\u00030§\u00010¦\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¨\u0001\u0010\u0018R(\u0010©\u0001\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b©\u0001\u00106\u001a\u0005\bª\u0001\u00108\"\u0005\b«\u0001\u0010:R,\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00022\t\u0010¬\u0001\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u00ad\u0001\u00106\u001a\u0005\b®\u0001\u00108R\u001c\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030\u0097\u00010¯\u00018F¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u001c\u0010´\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010¯\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010±\u0001R\u001c\u0010¶\u0001\u001a\n\u0012\u0005\u0012\u00030¤\u00010¯\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010±\u0001R\"\u0010¸\u0001\u001a\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0005\u0012\u00030§\u00010\u00168F¢\u0006\u0007\u001a\u0005\b·\u0001\u0010\u001a¨\u0006À\u0001"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload;", "", "", "toString", "Lcom/amazon/aps/iva/kb0/q;", "parsePayloadFieldsFromBundle", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "Lcom/braze/configuration/BrazeConfigurationProvider;", "getConfigurationProvider", "()Lcom/braze/configuration/BrazeConfigurationProvider;", "setConfigurationProvider", "(Lcom/braze/configuration/BrazeConfigurationProvider;)V", "Landroid/os/Bundle;", "notificationExtras", "Landroid/os/Bundle;", "getNotificationExtras", "()Landroid/os/Bundle;", "brazeExtras", "getBrazeExtras", "setBrazeExtras", "(Landroid/os/Bundle;)V", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "setExtras", "(Ljava/util/Map;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "pushDuration", "Ljava/lang/Integer;", "getPushDuration", "()Ljava/lang/Integer;", "setPushDuration", "(Ljava/lang/Integer;)V", "", "isPushStory", "Z", "()Z", "setPushStory", "(Z)V", "isInlineImagePush", "setInlineImagePush", "isConversationalPush", "setConversationalPush", "publicNotificationExtras", "Ljava/lang/String;", "getPublicNotificationExtras", "()Ljava/lang/String;", "setPublicNotificationExtras", "(Ljava/lang/String;)V", "notificationChannelId", "getNotificationChannelId", "setNotificationChannelId", "notificationCategory", "getNotificationCategory", "setNotificationCategory", "notificationVisibility", "getNotificationVisibility", "setNotificationVisibility", "notificationBadgeNumber", "getNotificationBadgeNumber", "setNotificationBadgeNumber", "customNotificationId", "getCustomNotificationId", "setCustomNotificationId", "", "notificationReceivedTimestampMillis", "Ljava/lang/Long;", "getNotificationReceivedTimestampMillis", "()Ljava/lang/Long;", "setNotificationReceivedTimestampMillis", "(Ljava/lang/Long;)V", "notificationPriorityInt", "getNotificationPriorityInt", "setNotificationPriorityInt", "shouldFetchTestTriggers", "getShouldFetchTestTriggers", "setShouldFetchTestTriggers", "shouldSyncGeofences", "getShouldSyncGeofences", "setShouldSyncGeofences", "shouldRefreshFeatureFlags", "getShouldRefreshFeatureFlags", "setShouldRefreshFeatureFlags", "isUninstallTrackingPush", "setUninstallTrackingPush", "deeplink", "getDeeplink", "setDeeplink", "contentCardSyncData", "getContentCardSyncData", "setContentCardSyncData", "contentCardSyncUserId", "getContentCardSyncUserId", "setContentCardSyncUserId", "titleText", "getTitleText", "setTitleText", "contentText", "getContentText", "setContentText", "largeIcon", "getLargeIcon", "setLargeIcon", "notificationSound", "getNotificationSound", "setNotificationSound", "summaryText", "getSummaryText", "setSummaryText", "accentColor", "getAccentColor", "setAccentColor", "bigSummaryText", "getBigSummaryText", "setBigSummaryText", "bigTitleText", "getBigTitleText", "setBigTitleText", "isPushDeliveryEnabled", "setPushDeliveryEnabled", "isPushDeliveryEnabled$annotations", "()V", "campaignId", "getCampaignId", "setCampaignId", "getCampaignId$annotations", "flushMinMinutes", "J", "getFlushMinMinutes", "()J", "setFlushMinMinutes", "(J)V", "getFlushMinMinutes$annotations", "flushMaxMinutes", "getFlushMaxMinutes", "setFlushMaxMinutes", "getFlushMaxMinutes$annotations", "bigImageUrl", "getBigImageUrl", "setBigImageUrl", "", "Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "actionButtonsInternal", "Ljava/util/List;", "pushStoryPageIndex", "I", "getPushStoryPageIndex", "()I", "setPushStoryPageIndex", "(I)V", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPagesInternal", "isNewlyReceivedPushStory", "setNewlyReceivedPushStory", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "conversationMessagesInternal", "", "Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "conversationPersonMapInternal", "conversationShortcutId", "getConversationShortcutId", "setConversationShortcutId", "<set-?>", "conversationReplyPersonId", "getConversationReplyPersonId", "", "getActionButtons", "()Ljava/util/List;", "actionButtons", "getPushStoryPages", "pushStoryPages", "getConversationMessages", "conversationMessages", "getConversationPersonMap", "conversationPersonMap", "<init>", "(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "Companion", "ActionButton", "ConversationMessage", "ConversationPerson", "PushStoryPage", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeNotificationPayload {
    public static final Companion Companion = new Companion(null);
    private Integer accentColor;
    private List<ActionButton> actionButtonsInternal;
    private String bigImageUrl;
    private String bigSummaryText;
    private String bigTitleText;
    private Bundle brazeExtras;
    private String campaignId;
    private BrazeConfigurationProvider configurationProvider;
    private String contentCardSyncData;
    private String contentCardSyncUserId;
    private String contentText;
    private Context context;
    private final List<ConversationMessage> conversationMessagesInternal;
    private final Map<String, ConversationPerson> conversationPersonMapInternal;
    private String conversationReplyPersonId;
    private String conversationShortcutId;
    private Integer customNotificationId;
    private String deeplink;
    private Map<String, String> extras;
    private long flushMaxMinutes;
    private long flushMinMinutes;
    private boolean isConversationalPush;
    private boolean isInlineImagePush;
    private boolean isNewlyReceivedPushStory;
    private boolean isPushDeliveryEnabled;
    private boolean isPushStory;
    private boolean isUninstallTrackingPush;
    private String largeIcon;
    private Integer notificationBadgeNumber;
    private String notificationCategory;
    private String notificationChannelId;
    private final Bundle notificationExtras;
    private Integer notificationPriorityInt;
    private Long notificationReceivedTimestampMillis;
    private String notificationSound;
    private Integer notificationVisibility;
    private String publicNotificationExtras;
    private Integer pushDuration;
    private int pushStoryPageIndex;
    private List<PushStoryPage> pushStoryPagesInternal;
    private boolean shouldFetchTestTriggers;
    private boolean shouldRefreshFeatureFlags;
    private boolean shouldSyncGeofences;
    private String summaryText;
    private String titleText;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R$\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ActionButton;", "", "Landroid/os/Bundle;", FirebaseAnalytics.Param.DESTINATION, "Lcom/amazon/aps/iva/kb0/q;", "putIntoBundle", "", "toString", "", "actionIndex", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "actionId", "getActionId", "setActionId", "uri", "getUri", "setUri", "useWebview", "getUseWebview", "setUseWebview", "text", "getText", "setText", "notificationExtras", "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ActionButton {
        private String actionId;
        private int actionIndex;
        private String text;
        private String type;
        private String uri;
        private String useWebview;

        public ActionButton(Bundle bundle, int i) {
            j.f(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.type = companion.getTemplateFieldAtIndex(i, bundle, "ab_a*_a");
            this.actionId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_a*_id");
            this.uri = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_a*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_a*_use_webview");
            this.text = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_a*_t");
        }

        public final String getText() {
            return this.text;
        }

        public final String getType() {
            return this.type;
        }

        public final void putIntoBundle(Bundle bundle) {
            j.f(bundle, FirebaseAnalytics.Param.DESTINATION);
            bundle.putInt("braze_action_index", this.actionIndex);
            bundle.putString("braze_action_type", this.type);
            bundle.putString("braze_action_id", this.actionId);
            bundle.putString("braze_action_uri", this.uri);
            bundle.putString("braze_action_use_webview", this.useWebview);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("Type", this.type));
            sb.append(companion.stringAndKey("Id", this.actionId));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            sb.append(companion.stringAndKey("Text", this.text));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J(\u0010\u0010\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J(\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J,\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0007J\u001f\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J \u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\fH\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u0018\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007J\u001f\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0017J\u001a\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002¨\u0006#"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$Companion;", "", "()V", "DEFAULT_PUSH_DELIVERY_MAX_FLUSH", "", "getDEFAULT_PUSH_DELIVERY_MAX_FLUSH$android_sdk_base_release$annotations", "DEFAULT_PUSH_DELIVERY_MIN_FLUSH", "getDEFAULT_PUSH_DELIVERY_MIN_FLUSH$android_sdk_base_release$annotations", "getAttachedBrazeExtras", "Landroid/os/Bundle;", "notificationExtras", "getPushStoryGravityAtIndex", "", "actionIndex", "actionFieldKeyTemplate", "", "getTemplateFieldAtIndex", FirebaseAnalytics.Param.INDEX, "", "defaultValue", "parseLong", "bundle", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "parseNonBlankString", "parseObjectAsInteger", "parseString", "parseStringAsBoolean", "parseStringAsColorInt", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "parseStringAsInteger", "parseStringAsLong", "stringAndKey", "prefix", "value", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {

        /* loaded from: classes.dex */
        public static final class a extends l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse action field boolean. Returning default.";
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
                return "Failed to parse action field long. Returning default.";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse long with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse non blank string with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class e extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class f extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class g extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as boolean with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class h extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as color int with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class i extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as int with key " + this.b + " and bundle: " + this.c;
            }
        }

        /* loaded from: classes.dex */
        public static final class j extends l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;
            final /* synthetic */ Bundle c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(String str, Bundle bundle) {
                super(0);
                this.b = str;
                this.c = bundle;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to parse string as long with key " + this.b + " and bundle: " + this.c;
            }
        }

        public /* synthetic */ Companion(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String stringAndKey(String str, Object obj) {
            if (obj != null) {
                return "\n" + str + " = " + obj;
            }
            return "";
        }

        public final Bundle getAttachedBrazeExtras(Bundle bundle) {
            if (bundle == null) {
                return new Bundle();
            }
            if (bundle.containsKey("braze_story_newly_received") && !bundle.getBoolean("braze_story_newly_received")) {
                Bundle bundle2 = bundle.getBundle("extra");
                if (bundle2 == null) {
                    return new Bundle();
                }
                return bundle2;
            } else if (Constants.isAmazonDevice()) {
                return new Bundle(bundle);
            } else {
                Object obj = bundle.get("extra");
                if (obj instanceof String) {
                    return JsonUtils.parseJsonObjectIntoBundle((String) obj);
                }
                if (obj instanceof Bundle) {
                    return (Bundle) obj;
                }
                return new Bundle();
            }
        }

        public final int getPushStoryGravityAtIndex(int i2, Bundle bundle, String str) {
            boolean z;
            com.amazon.aps.iva.yb0.j.f(bundle, "notificationExtras");
            com.amazon.aps.iva.yb0.j.f(str, "actionFieldKeyTemplate");
            String string = bundle.getString(m.f0(str, "*", String.valueOf(i2)));
            if (string != null && !m.b0(string)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                int hashCode = string.hashCode();
                if (hashCode != -1364013995) {
                    if (hashCode != 100571) {
                        if (hashCode == 109757538 && string.equals("start")) {
                            return 8388611;
                        }
                    } else if (string.equals("end")) {
                        return 8388613;
                    }
                } else {
                    string.equals("center");
                }
            }
            return 17;
        }

        public final String getTemplateFieldAtIndex(int i2, Bundle bundle, String str) {
            com.amazon.aps.iva.yb0.j.f(bundle, "notificationExtras");
            com.amazon.aps.iva.yb0.j.f(str, "actionFieldKeyTemplate");
            return getTemplateFieldAtIndex(i2, bundle, str, "");
        }

        public final Long parseLong(Bundle bundle, String str) {
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return Long.valueOf(bundle.getLong(str));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new c(str, bundle), 3, (Object) null);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String parseNonBlankString(android.os.Bundle r9, java.lang.String r10) {
            /*
                r8 = this;
                java.lang.String r0 = "bundle"
                com.amazon.aps.iva.yb0.j.f(r9, r0)
                java.lang.String r0 = "key"
                com.amazon.aps.iva.yb0.j.f(r10, r0)
                java.lang.String r0 = r8.parseString(r9, r10)     // Catch: java.lang.Exception -> L1d
                if (r0 == 0) goto L19
                boolean r9 = com.amazon.aps.iva.oe0.m.b0(r0)     // Catch: java.lang.Exception -> L1d
                if (r9 == 0) goto L17
                goto L19
            L17:
                r9 = 0
                goto L1a
            L19:
                r9 = 1
            L1a:
                if (r9 != 0) goto L2c
                return r0
            L1d:
                com.braze.support.BrazeLogger r1 = com.braze.support.BrazeLogger.INSTANCE
                com.braze.models.push.BrazeNotificationPayload$Companion$d r5 = new com.braze.models.push.BrazeNotificationPayload$Companion$d
                r5.<init>(r10, r9)
                r3 = 0
                r4 = 0
                r6 = 3
                r7 = 0
                r2 = r8
                com.braze.support.BrazeLogger.brazelog$default(r1, r2, r3, r4, r5, r6, r7)
            L2c:
                r9 = 0
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.braze.models.push.BrazeNotificationPayload.Companion.parseNonBlankString(android.os.Bundle, java.lang.String):java.lang.String");
        }

        public final int parseObjectAsInteger(Bundle bundle, String str, int i2) {
            Object obj;
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str) && (obj = bundle.get(str)) != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str, bundle), 3, (Object) null);
            }
            return i2;
        }

        public final String parseString(Bundle bundle, String str) {
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str)) {
                    return bundle.getString(str);
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f(str, bundle), 3, (Object) null);
                return null;
            }
        }

        public final boolean parseStringAsBoolean(Bundle bundle, String str) {
            String string;
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                    return Boolean.parseBoolean(string);
                }
                return false;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new g(str, bundle), 3, (Object) null);
                return false;
            }
        }

        public final Integer parseStringAsColorInt(Bundle bundle, String str) {
            String string;
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                    return Integer.valueOf((int) Long.parseLong(string));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new h(str, bundle), 3, (Object) null);
                return null;
            }
        }

        public final Integer parseStringAsInteger(Bundle bundle, String str) {
            String string;
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                    return Integer.valueOf(Integer.parseInt(string));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new i(str, bundle), 3, (Object) null);
                return null;
            }
        }

        public final Long parseStringAsLong(Bundle bundle, String str) {
            String string;
            com.amazon.aps.iva.yb0.j.f(bundle, "bundle");
            com.amazon.aps.iva.yb0.j.f(str, "key");
            try {
                if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                    return Long.valueOf(Long.parseLong(string));
                }
                return null;
            } catch (Exception unused) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new j(str, bundle), 3, (Object) null);
                return null;
            }
        }

        private Companion() {
        }

        public final String getTemplateFieldAtIndex(int i2, Bundle bundle, String str, String str2) {
            com.amazon.aps.iva.yb0.j.f(bundle, "notificationExtras");
            com.amazon.aps.iva.yb0.j.f(str, "actionFieldKeyTemplate");
            String string = bundle.getString(m.f0(str, "*", String.valueOf(i2)));
            return string == null ? str2 : string;
        }

        public final boolean getTemplateFieldAtIndex(int i2, Bundle bundle, String str, boolean z) {
            com.amazon.aps.iva.yb0.j.f(bundle, "notificationExtras");
            com.amazon.aps.iva.yb0.j.f(str, "actionFieldKeyTemplate");
            String string = bundle.getString(m.f0(str, "*", String.valueOf(i2)));
            if (string == null) {
                return z;
            }
            try {
                return Boolean.parseBoolean(string);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, a.b);
                return z;
            }
        }

        public final long getTemplateFieldAtIndex(int i2, Bundle bundle, String str, long j2) {
            com.amazon.aps.iva.yb0.j.f(bundle, "notificationExtras");
            com.amazon.aps.iva.yb0.j.f(str, "actionFieldKeyTemplate");
            String string = bundle.getString(m.f0(str, "*", String.valueOf(i2)));
            if (string == null) {
                return j2;
            }
            try {
                return Long.parseLong(string);
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, b.b);
                return j2;
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\bH\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationMessage;", "", "notificationExtras", "Landroid/os/Bundle;", FirebaseAnalytics.Param.INDEX, "", "(Landroid/os/Bundle;I)V", "message", "", "getMessage", "()Ljava/lang/String;", "personId", "getPersonId", "timestamp", "", "getTimestamp", "()J", "toString", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ConversationMessage {
        private final String message;
        private final String personId;
        private final long timestamp;

        public ConversationMessage(Bundle bundle, int i) {
            j.f(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.message = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_mt*");
            this.timestamp = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_mw*", 0L);
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_mp*");
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getPersonId() {
            return this.personId;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("Message", this.message));
            sb.append(companion.stringAndKey("Timestamp", Long.valueOf(this.timestamp)));
            sb.append(companion.stringAndKey("PersonId", this.personId));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$ConversationPerson;", "", "", "toString", "personId", "Ljava/lang/String;", "getPersonId", "()Ljava/lang/String;", AppMeasurementSdk.ConditionalUserProperty.NAME, "getName", "uri", "getUri", "", "isImportant", "Z", "()Z", "isBot", "Lcom/amazon/aps/iva/c3/b0;", "getPerson", "()Lcom/amazon/aps/iva/c3/b0;", "person", "Landroid/os/Bundle;", "notificationExtras", "", FirebaseAnalytics.Param.INDEX, "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class ConversationPerson {
        private final boolean isBot;
        private final boolean isImportant;
        private final String name;
        private final String personId;
        private final String uri;

        public ConversationPerson(Bundle bundle, int i) {
            j.f(bundle, "notificationExtras");
            Companion companion = BrazeNotificationPayload.Companion;
            this.personId = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_pi*");
            this.name = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_pn*");
            this.uri = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_pu*", (String) null);
            this.isImportant = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_pt*", false);
            this.isBot = companion.getTemplateFieldAtIndex(i, bundle, "ab_c_pb*", false);
        }

        public final b0 getPerson() {
            b0.b bVar = new b0.b();
            bVar.d = this.personId;
            bVar.a = this.name;
            bVar.c = this.uri;
            bVar.e = this.isBot;
            bVar.f = this.isImportant;
            return new b0(bVar);
        }

        public final String getPersonId() {
            return this.personId;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("PersonId", this.personId));
            sb.append(companion.stringAndKey("Name", this.name));
            sb.append(companion.stringAndKey("Uri", this.uri));
            sb.append(companion.stringAndKey("IsImportant", Boolean.valueOf(this.isImportant)));
            sb.append(companion.stringAndKey("IsBot", Boolean.valueOf(this.isBot)));
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0012R$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0012R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0012R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0012¨\u0006,"}, d2 = {"Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "", "", "toString", "", "actionIndex", "I", "getActionIndex", "()I", "setActionIndex", "(I)V", "campaignId", "Ljava/lang/String;", "getCampaignId", "()Ljava/lang/String;", "title", "getTitle", "setTitle", "(Ljava/lang/String;)V", "titleGravity", "getTitleGravity", "setTitleGravity", MediaTrack.ROLE_SUBTITLE, "getSubtitle", "setSubtitle", "subtitleGravity", "getSubtitleGravity", "setSubtitleGravity", "bitmapUrl", "getBitmapUrl", "setBitmapUrl", "storyPageId", "getStoryPageId", "setStoryPageId", "deeplink", "getDeeplink", "setDeeplink", "useWebview", "getUseWebview", "setUseWebview", "Landroid/os/Bundle;", "notificationExtras", "<init>", "(Landroid/os/Bundle;I)V", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class PushStoryPage {
        private int actionIndex;
        private String bitmapUrl;
        private final String campaignId;
        private String deeplink;
        private String storyPageId;
        private String subtitle;
        private int subtitleGravity;
        private String title;
        private int titleGravity;
        private String useWebview;

        public PushStoryPage(Bundle bundle, int i) {
            j.f(bundle, "notificationExtras");
            this.actionIndex = i;
            Companion companion = BrazeNotificationPayload.Companion;
            this.campaignId = companion.parseString(bundle, "cid");
            this.title = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_t");
            this.titleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, "ab_c*_t_j");
            this.subtitle = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_st");
            this.subtitleGravity = companion.getPushStoryGravityAtIndex(this.actionIndex, bundle, "ab_c*_st_j");
            this.bitmapUrl = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_i");
            this.storyPageId = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_id", "");
            this.deeplink = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_uri");
            this.useWebview = companion.getTemplateFieldAtIndex(this.actionIndex, bundle, "ab_c*_use_webview");
        }

        public final String getBitmapUrl() {
            return this.bitmapUrl;
        }

        public final String getCampaignId() {
            return this.campaignId;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getStoryPageId() {
            return this.storyPageId;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final int getSubtitleGravity() {
            return this.subtitleGravity;
        }

        public final String getTitle() {
            return this.title;
        }

        public final int getTitleGravity() {
            return this.titleGravity;
        }

        public final String getUseWebview() {
            return this.useWebview;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            Companion companion = BrazeNotificationPayload.Companion;
            sb.append(companion.stringAndKey("ActionIndex", Integer.valueOf(this.actionIndex)));
            sb.append(companion.stringAndKey("CampaignId", this.campaignId));
            sb.append(companion.stringAndKey("Title", this.title));
            sb.append(companion.stringAndKey("TitleGravity", Integer.valueOf(this.titleGravity)));
            sb.append(companion.stringAndKey("Subtitle", this.subtitle));
            sb.append(companion.stringAndKey("SubtitleGravity=", Integer.valueOf(this.subtitleGravity)));
            sb.append(companion.stringAndKey("BitmapUrl", this.bitmapUrl));
            sb.append(companion.stringAndKey("StoryPageId", this.storyPageId));
            sb.append(companion.stringAndKey("Deeplink", this.deeplink));
            sb.append(companion.stringAndKey("UseWebview", this.useWebview));
            return sb.toString();
        }
    }

    public BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.configurationProvider = brazeConfigurationProvider;
        this.notificationExtras = bundle == null ? new Bundle() : bundle;
        this.brazeExtras = bundle2 == null ? new Bundle() : bundle2;
        this.extras = BundleUtils.toStringMap(bundle2);
        this.context = context != null ? context.getApplicationContext() : null;
        this.flushMinMinutes = 5L;
        this.flushMaxMinutes = 120L;
        this.actionButtonsInternal = new ArrayList();
        this.pushStoryPagesInternal = new ArrayList();
        this.conversationMessagesInternal = new ArrayList();
        this.conversationPersonMapInternal = new HashMap();
        parsePayloadFieldsFromBundle();
    }

    private final void parsePayloadFieldsFromBundle() {
        parsePayloadFieldsFromBundle$parseNotificationMetadata(this);
        parsePayloadFieldsFromBundle$parseContentCardData(this);
        parsePayloadFieldsFromBundle$parseVisibleContent(this);
        parsePayloadFieldsFromBundle$parseBigTextStyle(this);
        parsePayloadFieldsFromBundle$parseBigImageStyle(this);
        parsePayloadFieldsFromBundle$parseActionButtons(this);
        parsePayloadFieldsFromBundle$parsePushStoryData(this);
        parsePayloadFieldsFromBundle$parseConversationPushData(this);
        parsePayloadFieldsFromBundle$parsePushDeliveryEventData(this);
    }

    private static final void parsePayloadFieldsFromBundle$parseActionButtons(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        brazeNotificationPayload.actionButtonsInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_a*_a");
            if (templateFieldAtIndex != null && !m.b0(templateFieldAtIndex)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                brazeNotificationPayload.actionButtonsInternal.add(new ActionButton(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigImageStyle(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        String parseNonBlankString = Companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_iu");
        brazeNotificationPayload.bigImageUrl = parseNonBlankString;
        boolean z2 = false;
        if (parseNonBlankString != null && !m.b0(parseNonBlankString)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String str = brazeNotificationPayload.extras.get("appboy_image_url");
            if (str == null || m.b0(str)) {
                z2 = true;
            }
            if (!z2) {
                brazeNotificationPayload.bigImageUrl = str;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseBigTextStyle(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.bigSummaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bs");
        brazeNotificationPayload.bigTitleText = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_bt");
    }

    private static final void parsePayloadFieldsFromBundle$parseContentCardData(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.contentCardSyncData = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd");
        brazeNotificationPayload.contentCardSyncUserId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_cd_uid");
    }

    private static final void parsePayloadFieldsFromBundle$parseConversationPushData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        boolean z2;
        Companion companion = Companion;
        brazeNotificationPayload.conversationShortcutId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_si");
        brazeNotificationPayload.conversationReplyPersonId = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_c_rpi");
        brazeNotificationPayload.conversationMessagesInternal.clear();
        brazeNotificationPayload.conversationPersonMapInternal.clear();
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_c_mt*");
            if (templateFieldAtIndex != null && !m.b0(templateFieldAtIndex)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                break;
            }
            brazeNotificationPayload.conversationMessagesInternal.add(new ConversationMessage(brazeNotificationPayload.notificationExtras, i));
            i++;
        }
        int i2 = 0;
        while (true) {
            String templateFieldAtIndex2 = Companion.getTemplateFieldAtIndex(i2, brazeNotificationPayload.notificationExtras, "ab_c_pi*");
            if (templateFieldAtIndex2 != null && !m.b0(templateFieldAtIndex2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                ConversationPerson conversationPerson = new ConversationPerson(brazeNotificationPayload.notificationExtras, i2);
                brazeNotificationPayload.conversationPersonMapInternal.put(conversationPerson.getPersonId(), conversationPerson);
                i2++;
            } else {
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseNotificationMetadata(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        Companion companion = Companion;
        brazeNotificationPayload.pushDuration = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "nd");
        brazeNotificationPayload.isPushStory = brazeNotificationPayload.notificationExtras.containsKey("ab_c");
        brazeNotificationPayload.notificationCategory = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_ct");
        brazeNotificationPayload.notificationVisibility = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_vs");
        brazeNotificationPayload.notificationBadgeNumber = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "ab_bc");
        brazeNotificationPayload.publicNotificationExtras = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_pn");
        brazeNotificationPayload.customNotificationId = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "n");
        brazeNotificationPayload.notificationReceivedTimestampMillis = companion.parseLong(brazeNotificationPayload.notificationExtras, "braze_push_received_timestamp");
        brazeNotificationPayload.isInlineImagePush = brazeNotificationPayload.notificationExtras.containsKey("ab_iip");
        brazeNotificationPayload.isConversationalPush = brazeNotificationPayload.notificationExtras.containsKey("ab_cp");
        brazeNotificationPayload.notificationPriorityInt = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "p");
        brazeNotificationPayload.shouldFetchTestTriggers = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_push_fetch_test_triggers_key");
        brazeNotificationPayload.shouldSyncGeofences = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "ab_sync_geos");
        brazeNotificationPayload.shouldRefreshFeatureFlags = companion.parseStringAsBoolean(brazeNotificationPayload.notificationExtras, "br_ffr");
        if (!brazeNotificationPayload.notificationExtras.containsKey("appboy_uninstall_tracking") && !brazeNotificationPayload.brazeExtras.containsKey("appboy_uninstall_tracking")) {
            z = false;
        } else {
            z = true;
        }
        brazeNotificationPayload.isUninstallTrackingPush = z;
        brazeNotificationPayload.deeplink = companion.parseString(brazeNotificationPayload.notificationExtras, "uri");
        brazeNotificationPayload.campaignId = companion.parseString(brazeNotificationPayload.notificationExtras, "cid");
    }

    private static final void parsePayloadFieldsFromBundle$parsePushDeliveryEventData(BrazeNotificationPayload brazeNotificationPayload) {
        int i;
        long j;
        long j2;
        Companion companion = Companion;
        Integer parseStringAsInteger = companion.parseStringAsInteger(brazeNotificationPayload.notificationExtras, "bz_p_e");
        boolean z = false;
        if (parseStringAsInteger != null) {
            i = parseStringAsInteger.intValue();
        } else {
            i = 0;
        }
        if (i == 1) {
            z = true;
        }
        brazeNotificationPayload.isPushDeliveryEnabled = z;
        Long parseStringAsLong = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, "bz_p_fn");
        if (parseStringAsLong != null) {
            j = parseStringAsLong.longValue();
        } else {
            j = 5;
        }
        brazeNotificationPayload.flushMinMinutes = j;
        Long parseStringAsLong2 = companion.parseStringAsLong(brazeNotificationPayload.notificationExtras, "bz_p_fx");
        if (parseStringAsLong2 != null) {
            j2 = parseStringAsLong2.longValue();
        } else {
            j2 = 120;
        }
        brazeNotificationPayload.flushMaxMinutes = j2;
    }

    private static final void parsePayloadFieldsFromBundle$parsePushStoryData(BrazeNotificationPayload brazeNotificationPayload) {
        boolean z;
        brazeNotificationPayload.pushStoryPageIndex = Companion.parseObjectAsInteger(brazeNotificationPayload.notificationExtras, "braze_story_index", 0);
        int i = 0;
        while (true) {
            String templateFieldAtIndex = Companion.getTemplateFieldAtIndex(i, brazeNotificationPayload.notificationExtras, "ab_c*_i");
            if (templateFieldAtIndex != null && !m.b0(templateFieldAtIndex)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                brazeNotificationPayload.pushStoryPagesInternal.add(new PushStoryPage(brazeNotificationPayload.notificationExtras, i));
                i++;
            } else {
                brazeNotificationPayload.isNewlyReceivedPushStory = brazeNotificationPayload.notificationExtras.getBoolean("braze_story_newly_received", false);
                return;
            }
        }
    }

    private static final void parsePayloadFieldsFromBundle$parseVisibleContent(BrazeNotificationPayload brazeNotificationPayload) {
        Companion companion = Companion;
        brazeNotificationPayload.notificationChannelId = companion.parseNonBlankString(brazeNotificationPayload.notificationExtras, "ab_nc");
        brazeNotificationPayload.titleText = companion.parseString(brazeNotificationPayload.notificationExtras, "t");
        brazeNotificationPayload.contentText = companion.parseString(brazeNotificationPayload.notificationExtras, "a");
        brazeNotificationPayload.largeIcon = companion.parseString(brazeNotificationPayload.notificationExtras, "ab_li");
        brazeNotificationPayload.notificationSound = companion.parseString(brazeNotificationPayload.notificationExtras, "sd");
        brazeNotificationPayload.summaryText = companion.parseString(brazeNotificationPayload.notificationExtras, "s");
        brazeNotificationPayload.accentColor = companion.parseStringAsColorInt(brazeNotificationPayload.notificationExtras, "ac");
    }

    public final Integer getAccentColor() {
        return this.accentColor;
    }

    public final List<ActionButton> getActionButtons() {
        return this.actionButtonsInternal;
    }

    public final String getBigImageUrl() {
        return this.bigImageUrl;
    }

    public final String getBigSummaryText() {
        return this.bigSummaryText;
    }

    public final String getBigTitleText() {
        return this.bigTitleText;
    }

    public final Bundle getBrazeExtras() {
        return this.brazeExtras;
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final BrazeConfigurationProvider getConfigurationProvider() {
        return this.configurationProvider;
    }

    public final String getContentCardSyncData() {
        return this.contentCardSyncData;
    }

    public final String getContentCardSyncUserId() {
        return this.contentCardSyncUserId;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<ConversationMessage> getConversationMessages() {
        return this.conversationMessagesInternal;
    }

    public final Map<String, ConversationPerson> getConversationPersonMap() {
        return this.conversationPersonMapInternal;
    }

    public final String getConversationReplyPersonId() {
        return this.conversationReplyPersonId;
    }

    public final String getConversationShortcutId() {
        return this.conversationShortcutId;
    }

    public final Integer getCustomNotificationId() {
        return this.customNotificationId;
    }

    public final long getFlushMaxMinutes() {
        return this.flushMaxMinutes;
    }

    public final long getFlushMinMinutes() {
        return this.flushMinMinutes;
    }

    public final String getLargeIcon() {
        return this.largeIcon;
    }

    public final Integer getNotificationBadgeNumber() {
        return this.notificationBadgeNumber;
    }

    public final String getNotificationCategory() {
        return this.notificationCategory;
    }

    public final String getNotificationChannelId() {
        return this.notificationChannelId;
    }

    public final Bundle getNotificationExtras() {
        return this.notificationExtras;
    }

    public final Integer getNotificationPriorityInt() {
        return this.notificationPriorityInt;
    }

    public final String getNotificationSound() {
        return this.notificationSound;
    }

    public final Integer getNotificationVisibility() {
        return this.notificationVisibility;
    }

    public final String getPublicNotificationExtras() {
        return this.publicNotificationExtras;
    }

    public final Integer getPushDuration() {
        return this.pushDuration;
    }

    public final int getPushStoryPageIndex() {
        return this.pushStoryPageIndex;
    }

    public final List<PushStoryPage> getPushStoryPages() {
        return this.pushStoryPagesInternal;
    }

    public final boolean getShouldFetchTestTriggers() {
        return this.shouldFetchTestTriggers;
    }

    public final boolean getShouldRefreshFeatureFlags() {
        return this.shouldRefreshFeatureFlags;
    }

    public final boolean getShouldSyncGeofences() {
        return this.shouldSyncGeofences;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    public final boolean isConversationalPush() {
        return this.isConversationalPush;
    }

    public final boolean isInlineImagePush() {
        return this.isInlineImagePush;
    }

    public final boolean isNewlyReceivedPushStory() {
        return this.isNewlyReceivedPushStory;
    }

    public final boolean isPushDeliveryEnabled() {
        return this.isPushDeliveryEnabled;
    }

    public final boolean isPushStory() {
        return this.isPushStory;
    }

    public final boolean isUninstallTrackingPush() {
        return this.isUninstallTrackingPush;
    }

    public final void setNewlyReceivedPushStory(boolean z) {
        this.isNewlyReceivedPushStory = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Companion companion = Companion;
        sb.append(companion.stringAndKey("PushDuration", this.pushDuration));
        sb.append(companion.stringAndKey("IsPushStory", Boolean.valueOf(this.isPushStory)));
        sb.append(companion.stringAndKey("IsInlineImagePush", Boolean.valueOf(this.isInlineImagePush)));
        sb.append(companion.stringAndKey("IsConversationalPush", Boolean.valueOf(this.isConversationalPush)));
        sb.append(companion.stringAndKey("PublicNotificationExtras", this.publicNotificationExtras));
        sb.append(companion.stringAndKey("NotificationChannelId", this.notificationChannelId));
        sb.append(companion.stringAndKey("NotificationCategory", this.notificationCategory));
        sb.append(companion.stringAndKey("NotificationVisibility", this.notificationVisibility));
        sb.append(companion.stringAndKey("NotificationBadgeNumber", this.notificationBadgeNumber));
        sb.append(companion.stringAndKey("CustomNotificationId", this.customNotificationId));
        sb.append(companion.stringAndKey("NotificationReceivedTimestampMillis", this.notificationReceivedTimestampMillis));
        sb.append(companion.stringAndKey("ContentCardSyncData", this.contentCardSyncData));
        sb.append(companion.stringAndKey("ContentCardSyncUserId", this.contentCardSyncUserId));
        sb.append(companion.stringAndKey("TitleText", this.titleText));
        sb.append(companion.stringAndKey("ContentText", this.contentText));
        sb.append(companion.stringAndKey("LargeIcon", this.largeIcon));
        sb.append(companion.stringAndKey("NotificationSound", this.notificationSound));
        sb.append(companion.stringAndKey("SummaryText", this.summaryText));
        sb.append(companion.stringAndKey("AccentColor", this.accentColor));
        sb.append(companion.stringAndKey("BigSummaryText", this.bigSummaryText));
        sb.append(companion.stringAndKey("BigTitleText", this.bigTitleText));
        sb.append(companion.stringAndKey("BigImageUrl", this.bigImageUrl));
        sb.append(companion.stringAndKey("ActionButtons", getActionButtons()));
        sb.append(companion.stringAndKey("PushStoryPageIndex", Integer.valueOf(this.pushStoryPageIndex)));
        sb.append(companion.stringAndKey("PushStoryPages", this.pushStoryPagesInternal));
        sb.append(companion.stringAndKey("ConversationMessages", this.conversationMessagesInternal));
        sb.append(companion.stringAndKey("ConversationPersonMap", this.conversationPersonMapInternal));
        sb.append(companion.stringAndKey("PushDeliveryEnabled", Boolean.valueOf(this.isPushDeliveryEnabled)));
        sb.append(companion.stringAndKey("ConversationShortcutId", this.conversationShortcutId));
        return sb.toString();
    }

    public /* synthetic */ BrazeNotificationPayload(Bundle bundle, Bundle bundle2, Context context, BrazeConfigurationProvider brazeConfigurationProvider, int i, e eVar) {
        this(bundle, (i & 2) != 0 ? Companion.getAttachedBrazeExtras(bundle) : bundle2, (i & 4) != 0 ? null : context, (i & 8) != 0 ? null : brazeConfigurationProvider);
    }
}
