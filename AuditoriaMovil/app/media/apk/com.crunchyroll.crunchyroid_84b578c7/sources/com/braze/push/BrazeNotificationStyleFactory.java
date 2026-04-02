package com.braze.push;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.amazon.aps.iva.c3.q;
import com.amazon.aps.iva.c3.r;
import com.amazon.aps.iva.c3.s;
import com.amazon.aps.iva.c3.u;
import com.amazon.aps.iva.c3.v;
import com.amazon.aps.iva.c3.w;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.push.BrazeNotificationPayload;
import com.braze.push.support.HtmlUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BrazeNotificationStyleFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory;", "", "Companion", "NoOpSentinelStyle", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeNotificationStyleFactory {
    public static final Companion Companion = new Companion(null);

    /* compiled from: BrazeNotificationStyleFactory.kt */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006-"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$Companion;", "", "Landroid/content/Context;", "context", "Lcom/braze/models/push/BrazeNotificationPayload;", "payload", "Lcom/braze/models/push/BrazeNotificationPayload$PushStoryPage;", "pushStoryPage", "Landroid/app/PendingIntent;", "createStoryPageClickedPendingIntent", "Landroid/os/Bundle;", "notificationExtras", "", "pageIndex", "createStoryTraversedPendingIntent", "Landroid/widget/RemoteViews;", "view", "", "populatePushStoryPage", "isRemoteViewNotificationAvailableSpaceConstrained", "Lcom/amazon/aps/iva/c3/s;", "notificationBuilder", "Lcom/amazon/aps/iva/kb0/q;", "setStyleIfSupported", "Lcom/amazon/aps/iva/c3/w;", "getNotificationStyle", "Lcom/amazon/aps/iva/c3/r;", "getBigTextNotificationStyle", "Lcom/amazon/aps/iva/c3/u;", "getStoryStyle", "getInlineImageStyle", "Lcom/amazon/aps/iva/c3/q;", "getBigPictureNotificationStyle", "Lcom/amazon/aps/iva/c3/v;", "getConversationalPushStyle", "bigPictureNotificationStyle", "setBigPictureSummaryAndTitle", "BIG_PICTURE_STYLE_IMAGE_HEIGHT", "I", "", "STORY_SET_GRAVITY", "Ljava/lang/String;", "STORY_SET_VISIBILITY", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private final PendingIntent createStoryPageClickedPendingIntent(Context context, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            Intent intent = new Intent("com.braze.action.BRAZE_STORY_CLICKED").setClass(context, NotificationTrampolineActivity.class);
            j.e(intent, "Intent(Constants.BRAZE_S…lineActivity::class.java)");
            intent.setFlags(intent.getFlags() | BrazeDeeplinkHandler.Companion.getInstance().getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK));
            intent.putExtras(brazeNotificationPayload.getNotificationExtras());
            intent.putExtra("braze_action_uri", pushStoryPage.getDeeplink());
            intent.putExtra("braze_action_use_webview", pushStoryPage.getUseWebview());
            intent.putExtra("braze_story_page_id", pushStoryPage.getStoryPageId());
            intent.putExtra("braze_campaign_id", pushStoryPage.getCampaignId());
            intent.putExtra("nid", BrazeNotificationUtils.getNotificationId(brazeNotificationPayload));
            PendingIntent activity = PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, IntentUtils.getImmutablePendingIntentFlags());
            j.e(activity, "getActivity(\n           …tentFlags()\n            )");
            return activity;
        }

        private final PendingIntent createStoryTraversedPendingIntent(Context context, Bundle bundle, int i) {
            Intent intent = new Intent("com.braze.action.STORY_TRAVERSE").setClass(context, BrazeNotificationUtils.getNotificationReceiverClass());
            j.e(intent, "Intent(Constants.BRAZE_S…otificationReceiverClass)");
            if (bundle != null) {
                bundle.putInt("braze_story_index", i);
                intent.putExtras(bundle);
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getImmutablePendingIntentFlags());
            j.e(broadcast, "getBroadcast(\n          …      flags\n            )");
            return broadcast;
        }

        private final boolean isRemoteViewNotificationAvailableSpaceConstrained(Context context) {
            if (Build.VERSION.SDK_INT >= 31 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 31) {
                return true;
            }
            return false;
        }

        private final boolean populatePushStoryPage(RemoteViews remoteViews, BrazeNotificationPayload brazeNotificationPayload, BrazeNotificationPayload.PushStoryPage pushStoryPage) {
            boolean z;
            boolean z2;
            Context context = brazeNotificationPayload.getContext();
            boolean z3 = false;
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$populatePushStoryPage$1.INSTANCE, 3, (Object) null);
                return false;
            }
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$populatePushStoryPage$2.INSTANCE, 3, (Object) null);
                return false;
            }
            String bitmapUrl = pushStoryPage.getBitmapUrl();
            if (bitmapUrl != null && !m.b0(bitmapUrl)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$populatePushStoryPage$3.INSTANCE, 3, (Object) null);
                return false;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bitmapUrl, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
            if (pushBitmapFromUrl == null) {
                return false;
            }
            remoteViews.setImageViewBitmap(R$id.com_braze_story_image_view, pushBitmapFromUrl);
            String title = pushStoryPage.getTitle();
            if (title != null && !m.b0(title)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                remoteViews.setTextViewText(R$id.com_braze_story_text_view, HtmlUtils.getHtmlSpannedTextIfEnabled(title, configurationProvider));
                remoteViews.setInt(R$id.com_braze_story_text_view_container, "setGravity", pushStoryPage.getTitleGravity());
            } else {
                remoteViews.setInt(R$id.com_braze_story_text_view_container, "setVisibility", 8);
            }
            String subtitle = pushStoryPage.getSubtitle();
            if (subtitle == null || m.b0(subtitle)) {
                z3 = true;
            }
            if (!z3) {
                remoteViews.setTextViewText(R$id.com_braze_story_text_view_small, HtmlUtils.getHtmlSpannedTextIfEnabled(subtitle, configurationProvider));
                remoteViews.setInt(R$id.com_braze_story_text_view_small_container, "setGravity", pushStoryPage.getSubtitleGravity());
            } else {
                remoteViews.setInt(R$id.com_braze_story_text_view_small_container, "setVisibility", 8);
            }
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_relative_layout, createStoryPageClickedPendingIntent(context, brazeNotificationPayload, pushStoryPage));
            return true;
        }

        public final q getBigPictureNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
            boolean z;
            j.f(brazeNotificationPayload, "payload");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            if (bigImageUrl != null && !m.b0(bigImageUrl)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return null;
            }
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, brazeNotificationPayload.getNotificationExtras(), bigImageUrl, BrazeViewBounds.NOTIFICATION_EXPANDED_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$1(bigImageUrl), 3, (Object) null);
                return null;
            }
            try {
                if (pushBitmapFromUrl.getWidth() > pushBitmapFromUrl.getHeight()) {
                    int pixelsFromDensityAndDp = BrazeImageUtils.getPixelsFromDensityAndDp(BrazeImageUtils.getDensityDpi(context), 192);
                    int i = pixelsFromDensityAndDp * 2;
                    int displayWidthPixels = BrazeImageUtils.getDisplayWidthPixels(context);
                    if (i > displayWidthPixels) {
                        i = displayWidthPixels;
                    }
                    try {
                        pushBitmapFromUrl = Bitmap.createScaledBitmap(pushBitmapFromUrl, i, pixelsFromDensityAndDp, true);
                    } catch (Exception e) {
                        BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$2.INSTANCE);
                    }
                }
                if (pushBitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$3.INSTANCE, 2, (Object) null);
                    return null;
                }
                q qVar = new q();
                IconCompat iconCompat = new IconCompat(1);
                iconCompat.b = pushBitmapFromUrl;
                qVar.a = iconCompat;
                setBigPictureSummaryAndTitle(qVar, brazeNotificationPayload);
                return qVar;
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, BrazeNotificationStyleFactory$Companion$getBigPictureNotificationStyle$4.INSTANCE);
                return null;
            }
        }

        public final r getBigTextNotificationStyle(BrazeNotificationPayload brazeNotificationPayload) {
            CharSequence htmlSpannedTextIfEnabled;
            j.f(brazeNotificationPayload, "payload");
            r rVar = new r();
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                return rVar;
            }
            String contentText = brazeNotificationPayload.getContentText();
            if (contentText != null && (htmlSpannedTextIfEnabled = HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider)) != null) {
                rVar.a(htmlSpannedTextIfEnabled);
            }
            String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
            if (bigSummaryText != null) {
                rVar.c(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            String bigTitleText = brazeNotificationPayload.getBigTitleText();
            if (bigTitleText != null) {
                rVar.b(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            return rVar;
        }

        public final v getConversationalPushStyle(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
            j.f(sVar, "notificationBuilder");
            j.f(brazeNotificationPayload, "payload");
            try {
                Map<String, BrazeNotificationPayload.ConversationPerson> conversationPersonMap = brazeNotificationPayload.getConversationPersonMap();
                BrazeNotificationPayload.ConversationPerson conversationPerson = conversationPersonMap.get(brazeNotificationPayload.getConversationReplyPersonId());
                if (conversationPerson == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$1.INSTANCE, 3, (Object) null);
                    return null;
                }
                v vVar = new v(conversationPerson.getPerson());
                Iterator<BrazeNotificationPayload.ConversationMessage> it = brazeNotificationPayload.getConversationMessages().iterator();
                while (true) {
                    boolean z = false;
                    if (it.hasNext()) {
                        BrazeNotificationPayload.ConversationMessage next = it.next();
                        BrazeNotificationPayload.ConversationPerson conversationPerson2 = conversationPersonMap.get(next.getPersonId());
                        if (conversationPerson2 == null) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$2(next), 3, (Object) null);
                            return null;
                        }
                        v.e eVar = new v.e(next.getMessage(), next.getTimestamp(), conversationPerson2.getPerson());
                        ArrayList arrayList = vVar.a;
                        arrayList.add(eVar);
                        if (arrayList.size() > 25) {
                            arrayList.remove(0);
                        }
                    } else {
                        if (conversationPersonMap.size() > 1) {
                            z = true;
                        }
                        vVar.d = Boolean.valueOf(z);
                        sVar.B = brazeNotificationPayload.getConversationShortcutId();
                        return vVar;
                    }
                }
            } catch (Exception e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, BrazeNotificationStyleFactory$Companion$getConversationalPushStyle$3.INSTANCE);
                return null;
            }
        }

        public final w getInlineImageStyle(BrazeNotificationPayload brazeNotificationPayload, s sVar) {
            boolean z;
            int i;
            ApplicationInfo applicationInfo;
            PackageManager.ApplicationInfoFlags of;
            j.f(brazeNotificationPayload, "payload");
            j.f(sVar, "notificationBuilder");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getInlineImageStyle$1.INSTANCE, 3, (Object) null);
                return null;
            }
            String bigImageUrl = brazeNotificationPayload.getBigImageUrl();
            if (bigImageUrl != null && !m.b0(bigImageUrl)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getInlineImageStyle$2.INSTANCE, 3, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            Bitmap pushBitmapFromUrl = Braze.Companion.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, notificationExtras, bigImageUrl, BrazeViewBounds.NOTIFICATION_INLINE_PUSH_IMAGE);
            if (pushBitmapFromUrl == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getInlineImageStyle$3.INSTANCE, 3, (Object) null);
                return null;
            }
            boolean isRemoteViewNotificationAvailableSpaceConstrained = isRemoteViewNotificationAvailableSpaceConstrained(context);
            String packageName = context.getPackageName();
            if (isRemoteViewNotificationAvailableSpaceConstrained) {
                i = R$layout.com_braze_push_inline_image_constrained;
            } else {
                i = R$layout.com_braze_notification_inline_image;
            }
            RemoteViews remoteViews = new RemoteViews(packageName, i);
            BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
            Icon createWithResource = Icon.createWithResource(context, brazeConfigurationProvider.getSmallNotificationIconResourceId());
            j.e(createWithResource, "createWithResource(\n    …nResourceId\n            )");
            Integer accentColor = brazeNotificationPayload.getAccentColor();
            if (accentColor != null) {
                createWithResource.setTint(accentColor.intValue());
            }
            remoteViews.setImageViewIcon(R$id.com_braze_inline_image_push_app_icon, createWithResource);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    String packageName2 = context.getPackageName();
                    of = PackageManager.ApplicationInfoFlags.of(0L);
                    applicationInfo = packageManager.getApplicationInfo(packageName2, of);
                } else {
                    applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                }
                j.e(applicationInfo, "{\n                if (Bu…          }\n            }");
                CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                j.d(applicationLabel, "null cannot be cast to non-null type kotlin.String");
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_app_name_text, HtmlUtils.getHtmlSpannedTextIfEnabled((String) applicationLabel, brazeConfigurationProvider));
                remoteViews.setTextViewText(R$id.com_braze_inline_image_push_time_text, DateTimeUtils.formatDateNow(BrazeDateFormat.CLOCK_12_HOUR));
                String string = notificationExtras.getString("t");
                if (string != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_title_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string, brazeConfigurationProvider));
                }
                String string2 = notificationExtras.getString("a");
                if (string2 != null) {
                    remoteViews.setTextViewText(R$id.com_braze_inline_image_push_content_text, HtmlUtils.getHtmlSpannedTextIfEnabled(string2, brazeConfigurationProvider));
                }
                sVar.y = remoteViews;
                if (isRemoteViewNotificationAvailableSpaceConstrained) {
                    sVar.g(pushBitmapFromUrl);
                    return new u();
                }
                remoteViews.setImageViewBitmap(R$id.com_braze_inline_image_push_side_image, pushBitmapFromUrl);
                return new NoOpSentinelStyle();
            } catch (PackageManager.NameNotFoundException e) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, BrazeNotificationStyleFactory$Companion$getInlineImageStyle$applicationInfo$1.INSTANCE);
                return null;
            }
        }

        public final w getNotificationStyle(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
            w wVar;
            j.f(sVar, "notificationBuilder");
            j.f(brazeNotificationPayload, "payload");
            if (brazeNotificationPayload.isPushStory() && brazeNotificationPayload.getContext() != null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getNotificationStyle$1.INSTANCE, 3, (Object) null);
                wVar = getStoryStyle(sVar, brazeNotificationPayload);
            } else if (brazeNotificationPayload.isConversationalPush()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getNotificationStyle$2.INSTANCE, 3, (Object) null);
                wVar = getConversationalPushStyle(sVar, brazeNotificationPayload);
            } else if (brazeNotificationPayload.getBigImageUrl() != null) {
                if (brazeNotificationPayload.isInlineImagePush()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getNotificationStyle$3.INSTANCE, 3, (Object) null);
                    wVar = getInlineImageStyle(brazeNotificationPayload, sVar);
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getNotificationStyle$4.INSTANCE, 3, (Object) null);
                    wVar = getBigPictureNotificationStyle(brazeNotificationPayload);
                }
            } else {
                wVar = null;
            }
            if (wVar == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getNotificationStyle$5.INSTANCE, 3, (Object) null);
                return getBigTextNotificationStyle(brazeNotificationPayload);
            }
            return wVar;
        }

        public final u getStoryStyle(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
            j.f(sVar, "notificationBuilder");
            j.f(brazeNotificationPayload, "payload");
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$getStoryStyle$1.INSTANCE, 3, (Object) null);
                return null;
            }
            List<BrazeNotificationPayload.PushStoryPage> pushStoryPages = brazeNotificationPayload.getPushStoryPages();
            int pushStoryPageIndex = brazeNotificationPayload.getPushStoryPageIndex();
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.com_braze_push_story_one_image);
            if (!populatePushStoryPage(remoteViews, brazeNotificationPayload, pushStoryPages.get(pushStoryPageIndex))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, BrazeNotificationStyleFactory$Companion$getStoryStyle$2.INSTANCE, 2, (Object) null);
                return null;
            }
            Bundle notificationExtras = brazeNotificationPayload.getNotificationExtras();
            u uVar = new u();
            int size = pushStoryPages.size();
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_previous, createStoryTraversedPendingIntent(context, notificationExtras, ((pushStoryPageIndex - 1) + size) % size));
            remoteViews.setOnClickPendingIntent(R$id.com_braze_story_button_next, createStoryTraversedPendingIntent(context, notificationExtras, (pushStoryPageIndex + 1) % size));
            sVar.z = remoteViews;
            sVar.f(8, true);
            return uVar;
        }

        public final void setBigPictureSummaryAndTitle(q qVar, BrazeNotificationPayload brazeNotificationPayload) {
            String contentText;
            j.f(qVar, "bigPictureNotificationStyle");
            j.f(brazeNotificationPayload, "payload");
            BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
            if (configurationProvider == null) {
                return;
            }
            String bigSummaryText = brazeNotificationPayload.getBigSummaryText();
            String bigTitleText = brazeNotificationPayload.getBigTitleText();
            String summaryText = brazeNotificationPayload.getSummaryText();
            if (bigSummaryText != null) {
                qVar.b(HtmlUtils.getHtmlSpannedTextIfEnabled(bigSummaryText, configurationProvider));
            }
            if (bigTitleText != null) {
                qVar.a(HtmlUtils.getHtmlSpannedTextIfEnabled(bigTitleText, configurationProvider));
            }
            if (summaryText == null && bigSummaryText == null && (contentText = brazeNotificationPayload.getContentText()) != null) {
                qVar.b(HtmlUtils.getHtmlSpannedTextIfEnabled(contentText, configurationProvider));
            }
        }

        public final void setStyleIfSupported(s sVar, BrazeNotificationPayload brazeNotificationPayload) {
            j.f(sVar, "notificationBuilder");
            j.f(brazeNotificationPayload, "payload");
            w notificationStyle = getNotificationStyle(sVar, brazeNotificationPayload);
            if (!(notificationStyle instanceof NoOpSentinelStyle)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, BrazeNotificationStyleFactory$Companion$setStyleIfSupported$1.INSTANCE, 3, (Object) null);
                sVar.h(notificationStyle);
            }
        }
    }

    /* compiled from: BrazeNotificationStyleFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/push/BrazeNotificationStyleFactory$NoOpSentinelStyle;", "Lcom/amazon/aps/iva/c3/w;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class NoOpSentinelStyle extends w {
    }
}
