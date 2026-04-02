package com.braze.ui.inappmessage.listeners;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.IInAppMessageHtml;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.BundleUtils;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.actions.NewsfeedAction;
import com.braze.ui.actions.UriAction;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageWebViewClientListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u0010\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "", ImagesContract.URL, "Landroid/os/Bundle;", "queryBundle", "Lcom/amazon/aps/iva/kb0/q;", "onCloseAction", "onNewsfeedAction", "onCustomEventAction", "onOtherUrlAction", "Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "getInAppMessageManager", "()Lcom/braze/ui/inappmessage/BrazeInAppMessageManager;", "inAppMessageManager", "<init>", "()V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class DefaultInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    public static final Companion Companion = new Companion(null);

    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/braze/ui/inappmessage/listeners/DefaultInAppMessageWebViewClientListener$Companion;", "", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Landroid/os/Bundle;", "queryBundle", "", "parseUseWebViewFromQueryBundle", "Lcom/amazon/aps/iva/kb0/q;", "logHtmlInAppMessageClick", "", "parseCustomEventNameFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "parsePropertiesFromQueryBundle", "HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
            j.f(iInAppMessage, "inAppMessage");
            j.f(bundle, "queryBundle");
            if (bundle.containsKey("abButtonId")) {
                IInAppMessageHtml iInAppMessageHtml = (IInAppMessageHtml) iInAppMessage;
                String string = bundle.getString("abButtonId");
                if (string != null) {
                    iInAppMessageHtml.logButtonClick(string);
                }
            } else if (iInAppMessage.getMessageType() == MessageType.HTML_FULL) {
                iInAppMessage.logClick();
            }
        }

        public final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
            j.f(bundle, "queryBundle");
            return bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        }

        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
            boolean z;
            j.f(bundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : bundle.keySet()) {
                if (!j.a(str, AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                    String string = bundle.getString(str, null);
                    if (string != null && !m.b0(string)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        j.e(str, "key");
                        brazeProperties.addProperty(str, string);
                    }
                }
            }
            return brazeProperties;
        }

        public final boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
            boolean z;
            boolean z2;
            boolean z3;
            j.f(iInAppMessage, "inAppMessage");
            j.f(bundle, "queryBundle");
            boolean z4 = true;
            if (bundle.containsKey("abDeepLink")) {
                z = Boolean.parseBoolean(bundle.getString("abDeepLink"));
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            if (bundle.containsKey("abExternalOpen")) {
                z3 = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
                z2 = true;
            } else {
                z3 = false;
            }
            boolean openUriInWebView = iInAppMessage.getOpenUriInWebView();
            if (z2) {
                if (z || z3) {
                    z4 = false;
                }
                return z4;
            }
            return openUriInWebView;
        }
    }

    private final BrazeInAppMessageManager getInAppMessageManager() {
        return BrazeInAppMessageManager.Companion.getInstance();
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCloseAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageWebViewClientListener$onCloseAction$1.INSTANCE, 3, (Object) null);
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(iInAppMessage, str, bundle);
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onCustomEventAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        boolean z;
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageWebViewClientListener$onCustomEventAction$1.INSTANCE, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageWebViewClientListener$onCustomEventAction$2.INSTANCE, 2, (Object) null);
        } else if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(iInAppMessage, str, bundle)) {
            Companion companion = Companion;
            String parseCustomEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(bundle);
            if (parseCustomEventNameFromQueryBundle != null && !m.b0(parseCustomEventNameFromQueryBundle)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return;
            }
            BrazeProperties parsePropertiesFromQueryBundle = companion.parsePropertiesFromQueryBundle(bundle);
            Activity activity = getInAppMessageManager().getActivity();
            if (activity != null) {
                Braze.Companion.getInstance(activity).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle);
            }
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onNewsfeedAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageWebViewClientListener$onNewsfeedAction$1.INSTANCE, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageWebViewClientListener$onNewsfeedAction$2.INSTANCE, 2, (Object) null);
            return;
        }
        Companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(iInAppMessage, str, bundle)) {
            iInAppMessage.setAnimateOut(false);
            getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
            NewsfeedAction newsfeedAction = new NewsfeedAction(BundleUtils.toBundle(iInAppMessage.getExtras()), Channel.INAPP_MESSAGE);
            Activity activity = getInAppMessageManager().getActivity();
            if (activity != null) {
                BrazeDeeplinkHandler.Companion.getInstance().gotoNewsFeed(activity, newsfeedAction);
            }
        }
    }

    @Override // com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener
    public void onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        j.f(iInAppMessage, "inAppMessage");
        j.f(str, ImagesContract.URL);
        j.f(bundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, DefaultInAppMessageWebViewClientListener$onOtherUrlAction$1.INSTANCE, 3, (Object) null);
        if (getInAppMessageManager().getActivity() == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new DefaultInAppMessageWebViewClientListener$onOtherUrlAction$2(str), 2, (Object) null);
            return;
        }
        Companion companion = Companion;
        companion.logHtmlInAppMessageClick(iInAppMessage, bundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(iInAppMessage, str, bundle)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.V, (Throwable) null, new DefaultInAppMessageWebViewClientListener$onOtherUrlAction$3(str), 2, (Object) null);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = companion.parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
        Bundle bundle2 = BundleUtils.toBundle(iInAppMessage.getExtras());
        bundle2.putAll(bundle);
        BrazeDeeplinkHandler.Companion companion2 = BrazeDeeplinkHandler.Companion;
        UriAction createUriActionFromUrlString = companion2.getInstance().createUriActionFromUrlString(str, bundle2, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new DefaultInAppMessageWebViewClientListener$onOtherUrlAction$4(str), 2, (Object) null);
            return;
        }
        Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, this, BrazeLogger.Priority.W, (Throwable) null, new DefaultInAppMessageWebViewClientListener$onOtherUrlAction$5(uri, str), 2, (Object) null);
            return;
        }
        iInAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        Activity activity = getInAppMessageManager().getActivity();
        if (activity != null) {
            companion2.getInstance().gotoUri(activity, createUriActionFromUrlString);
        }
    }
}
