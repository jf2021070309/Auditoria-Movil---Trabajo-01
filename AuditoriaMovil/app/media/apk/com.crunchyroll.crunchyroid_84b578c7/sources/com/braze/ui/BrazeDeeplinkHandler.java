package com.braze.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.kb0.h;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.IBrazeDeeplinkHandler;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.primitives.Ints;
import kotlin.Metadata;
/* compiled from: BrazeDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J,\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J*\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001e"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler;", "Lcom/braze/IBrazeDeeplinkHandler;", "Landroid/content/Context;", "context", "Lcom/braze/ui/actions/NewsfeedAction;", "newsfeedAction", "Lcom/amazon/aps/iva/kb0/q;", "gotoNewsFeed", "Lcom/braze/ui/actions/UriAction;", "uriAction", "gotoUri", "Lcom/braze/IBrazeDeeplinkHandler$IntentFlagPurpose;", "intentFlagPurpose", "", "getIntentFlags", "", ImagesContract.URL, "Landroid/os/Bundle;", "extras", "", "openInWebView", "Lcom/braze/enums/Channel;", "channel", "createUriActionFromUrlString", "Landroid/net/Uri;", "uri", "createUriActionFromUri", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class BrazeDeeplinkHandler implements IBrazeDeeplinkHandler {
    private static volatile IBrazeDeeplinkHandler customHandler;
    public static final Companion Companion = new Companion(null);
    private static final IBrazeDeeplinkHandler defaultHandler = new BrazeDeeplinkHandler();

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/braze/ui/BrazeDeeplinkHandler$Companion;", "", "Lcom/braze/IBrazeDeeplinkHandler;", "getInstance", "customHandler", "Lcom/braze/IBrazeDeeplinkHandler;", "defaultHandler", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final IBrazeDeeplinkHandler getInstance() {
            IBrazeDeeplinkHandler iBrazeDeeplinkHandler = BrazeDeeplinkHandler.customHandler;
            if (iBrazeDeeplinkHandler == null) {
                return BrazeDeeplinkHandler.defaultHandler;
            }
            return iBrazeDeeplinkHandler;
        }
    }

    /* compiled from: BrazeDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IBrazeDeeplinkHandler.IntentFlagPurpose.values().length];
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_ACTION_WITH_DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.NOTIFICATION_PUSH_STORY_PAGE_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_WEBVIEW_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_OPEN_WITH_ACTION_VIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_UTILS_GET_MAIN_ACTIVITY_INTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_GET_ROOT_INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IBrazeDeeplinkHandler.IntentFlagPurpose.URI_ACTION_BACK_STACK_ONLY_GET_TARGET_INTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUri(Uri uri, Bundle bundle, boolean z, Channel channel) {
        j.f(uri, "uri");
        j.f(channel, "channel");
        return new UriAction(uri, bundle, z, channel);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public UriAction createUriActionFromUrlString(String str, Bundle bundle, boolean z, Channel channel) {
        j.f(str, ImagesContract.URL);
        j.f(channel, "channel");
        UriAction uriAction = null;
        try {
            if (!m.b0(str)) {
                Uri parse = Uri.parse(str);
                j.e(parse, "uri");
                uriAction = createUriActionFromUri(parse, bundle, z, channel);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.E, (Throwable) null, BrazeDeeplinkHandler$createUriActionFromUrlString$1.INSTANCE, 2, (Object) null);
            }
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, BrazeDeeplinkHandler$createUriActionFromUrlString$2.INSTANCE);
        }
        return uriAction;
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public int getIntentFlags(IBrazeDeeplinkHandler.IntentFlagPurpose intentFlagPurpose) {
        j.f(intentFlagPurpose, "intentFlagPurpose");
        switch (WhenMappings.$EnumSwitchMapping$0[intentFlagPurpose.ordinal()]) {
            case 1:
            case 2:
                return Ints.MAX_POWER_OF_TWO;
            case 3:
            case 4:
            case 5:
                return 872415232;
            case 6:
            case 7:
                return 268435456;
            default:
                throw new h();
        }
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoNewsFeed(Context context, NewsfeedAction newsfeedAction) {
        j.f(context, "context");
        j.f(newsfeedAction, "newsfeedAction");
        newsfeedAction.execute(context);
    }

    @Override // com.braze.IBrazeDeeplinkHandler
    public void gotoUri(Context context, UriAction uriAction) {
        j.f(context, "context");
        j.f(uriAction, "uriAction");
        uriAction.execute(context);
    }
}
