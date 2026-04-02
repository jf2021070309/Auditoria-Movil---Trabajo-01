package com.braze.ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.amazon.aps.iva.yb0.j;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlFullView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageHtmlFullViewFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageHtmlFullViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlFullView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageHtmlFullViewFactory implements IInAppMessageViewFactory {
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public DefaultInAppMessageHtmlFullViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        j.f(iInAppMessageWebViewClientListener, "inAppMessageWebViewClientListener");
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @SuppressLint({"AddJavascriptInterface"})
    public InAppMessageHtmlFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        j.f(activity, "activity");
        j.f(iInAppMessage, "inAppMessage");
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_html_full, (ViewGroup) null);
        j.d(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlFullView");
        InAppMessageHtmlFullView inAppMessageHtmlFullView = (InAppMessageHtmlFullView) inflate;
        Context applicationContext = activity.getApplicationContext();
        j.e(applicationContext, "activity.applicationContext");
        if (new BrazeConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlFullView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageHtmlFullViewFactory$createInAppMessageView$1.INSTANCE, 2, (Object) null);
            return null;
        }
        Context applicationContext2 = activity.getApplicationContext();
        InAppMessageHtmlFull inAppMessageHtmlFull = (InAppMessageHtmlFull) iInAppMessage;
        j.e(applicationContext2, "context");
        InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext2, inAppMessageHtmlFull);
        inAppMessageHtmlFullView.setWebViewContent(iInAppMessage.getMessage(), inAppMessageHtmlFull.getLocalAssetsDirectoryUrl());
        inAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, iInAppMessage, this.inAppMessageWebViewClientListener));
        WebView messageWebView = inAppMessageHtmlFullView.getMessageWebView();
        if (messageWebView != null) {
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, "brazeInternalBridge");
        }
        inAppMessageHtmlFullView.setupDirectionalNavigation();
        return inAppMessageHtmlFullView;
    }
}
