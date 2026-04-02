package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.amazon.aps.iva.se0.i;
import com.amazon.aps.iva.yb0.j;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.MessageButton;
import com.braze.support.BrazeFunctionNotImplemented;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.InAppMessageCloser;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J2\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010!\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageViewLifecycleListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageViewLifecycleListener;", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/ui/inappmessage/InAppMessageCloser;", "inAppMessageCloser", "Lcom/amazon/aps/iva/kb0/q;", "performInAppMessageButtonClicked", "performInAppMessageClicked", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "Landroid/net/Uri;", "clickUri", "", "openUriInWebview", "performClickAction", "startClearHtmlInAppMessageAssetsThread", "Landroid/view/View;", "inAppMessageView", "beforeOpened", "afterOpened", "beforeClosed", "afterClosed", "onClicked", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "inAppMessageImmersive", "onButtonClicked", "onDismissed", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "inAppMessageManager", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultInAppMessageViewLifecycleListener implements IInAppMessageViewLifecycleListener {

    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClickAction.values().length];
            try {
                iArr[ClickAction.NEWS_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClickAction.URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClickAction.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    private final void performClickAction(ClickAction clickAction, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser, Uri uri, boolean z) {
        Activity activity = getInAppMessageManager().getActivity();
        if (activity == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$1.INSTANCE, 2, (Object) null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[clickAction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    inAppMessageCloser.close(false);
                    return;
                } else {
                    inAppMessageCloser.close(iInAppMessage.getAnimateOut());
                    return;
                }
            }
            inAppMessageCloser.close(false);
            if (uri == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$2.INSTANCE, 3, (Object) null);
                return;
            }
            BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.Companion;
            UriAction createUriActionFromUri = companion.getInstance().createUriActionFromUri(uri, BundleUtils.toBundle(iInAppMessage.getExtras()), z, Channel.INAPP_MESSAGE);
            Context applicationContext = getInAppMessageManager().getApplicationContext();
            if (applicationContext == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$performClickAction$3.INSTANCE, 3, (Object) null);
                return;
            } else {
                companion.getInstance().gotoUri(applicationContext, createUriActionFromUri);
                return;
            }
        }
        inAppMessageCloser.close(false);
        BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, new NewsfeedAction(BundleUtils.toBundle(iInAppMessage.getExtras()), Channel.INAPP_MESSAGE));
    }

    private final void performInAppMessageButtonClicked(MessageButton messageButton, IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(messageButton.getClickAction(), iInAppMessage, inAppMessageCloser, messageButton.getUri(), messageButton.getOpenUriInWebview());
    }

    private final void performInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        performClickAction(iInAppMessage.getClickAction(), iInAppMessage, inAppMessageCloser, iInAppMessage.getUri(), iInAppMessage.getOpenUriInWebView());
    }

    private final void startClearHtmlInAppMessageAssetsThread() {
        i.d(BrazeCoroutineScope.INSTANCE, null, null, new DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1(null), 3);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterClosed(IInAppMessage iInAppMessage) {
        j.f(iInAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$afterClosed$1.INSTANCE, 3, (Object) null);
        getInAppMessageManager().resetAfterInAppMessageClose();
        if (iInAppMessage instanceof IInAppMessageHtml) {
            startClearHtmlInAppMessageAssetsThread();
        }
        iInAppMessage.onAfterClosed();
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewClosed(iInAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void afterOpened(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$afterOpened$1.INSTANCE, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().afterInAppMessageViewOpened(view, iInAppMessage);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeClosed(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewClosed(view, iInAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$beforeClosed$1.INSTANCE, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void beforeOpened(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        getInAppMessageManager().getInAppMessageManagerListener().beforeInAppMessageViewOpened(view, iInAppMessage);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$beforeOpened$1.INSTANCE, 3, (Object) null);
        iInAppMessage.logImpression();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onButtonClicked(InAppMessageCloser inAppMessageCloser, MessageButton messageButton, IInAppMessageImmersive iInAppMessageImmersive) {
        boolean onInAppMessageButtonClicked;
        j.f(inAppMessageCloser, "inAppMessageCloser");
        j.f(messageButton, "messageButton");
        j.f(iInAppMessageImmersive, "inAppMessageImmersive");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onButtonClicked$1.INSTANCE, 3, (Object) null);
        iInAppMessageImmersive.logButtonClick(messageButton);
        try {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(iInAppMessageImmersive, messageButton, inAppMessageCloser);
        } catch (BrazeFunctionNotImplemented unused) {
            onInAppMessageButtonClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageButtonClicked(iInAppMessageImmersive, messageButton);
        }
        if (!onInAppMessageButtonClicked) {
            performInAppMessageButtonClicked(messageButton, iInAppMessageImmersive, inAppMessageCloser);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onClicked(InAppMessageCloser inAppMessageCloser, View view, IInAppMessage iInAppMessage) {
        boolean onInAppMessageClicked;
        j.f(inAppMessageCloser, "inAppMessageCloser");
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onClicked$1.INSTANCE, 3, (Object) null);
        iInAppMessage.logClick();
        try {
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(iInAppMessage, inAppMessageCloser);
            BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$1.INSTANCE, 3, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onClicked$wasHandled$2.INSTANCE, 3, (Object) null);
            onInAppMessageClicked = getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageClicked(iInAppMessage);
        }
        if (!onInAppMessageClicked) {
            performInAppMessageClicked(iInAppMessage, inAppMessageCloser);
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageViewLifecycleListener
    public void onDismissed(View view, IInAppMessage iInAppMessage) {
        j.f(view, "inAppMessageView");
        j.f(iInAppMessage, "inAppMessage");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageViewLifecycleListener$onDismissed$1.INSTANCE, 3, (Object) null);
        getInAppMessageManager().getInAppMessageManagerListener().onInAppMessageDismissed(iInAppMessage);
    }
}
