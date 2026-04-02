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
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$layout;
import com.braze.ui.inappmessage.IInAppMessageViewFactory;
import com.braze.ui.inappmessage.jsinterface.InAppMessageJavascriptInterface;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView;
import com.braze.ui.inappmessage.views.InAppMessageHtmlView;
import com.braze.ui.support.ViewUtils;
import kotlin.Metadata;
/* compiled from: DefaultInAppMessageHtmlViewFactory.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/inappmessage/factories/DefaultInAppMessageHtmlViewFactory;", "Lcom/braze/ui/inappmessage/IInAppMessageViewFactory;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "(Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "createInAppMessageView", "Lcom/braze/ui/inappmessage/views/InAppMessageHtmlView;", "activity", "Landroid/app/Activity;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class DefaultInAppMessageHtmlViewFactory implements IInAppMessageViewFactory {
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;

    public DefaultInAppMessageHtmlViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        j.f(iInAppMessageWebViewClientListener, "inAppMessageWebViewClientListener");
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    @Override // com.braze.ui.inappmessage.IInAppMessageViewFactory
    @SuppressLint({"AddJavascriptInterface"})
    public InAppMessageHtmlView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        j.f(activity, "activity");
        j.f(iInAppMessage, "inAppMessage");
        Context applicationContext = activity.getApplicationContext();
        View inflate = activity.getLayoutInflater().inflate(R$layout.com_braze_inappmessage_html, (ViewGroup) null);
        j.d(inflate, "null cannot be cast to non-null type com.braze.ui.inappmessage.views.InAppMessageHtmlView");
        InAppMessageHtmlView inAppMessageHtmlView = (InAppMessageHtmlView) inflate;
        j.e(applicationContext, "context");
        if (new BrazeConfigurationProvider(applicationContext).isTouchModeRequiredForHtmlInAppMessages() && ViewUtils.isDeviceNotInTouchMode(inAppMessageHtmlView)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, DefaultInAppMessageHtmlViewFactory$createInAppMessageView$1.INSTANCE, 2, (Object) null);
            return null;
        }
        InAppMessageHtml inAppMessageHtml = (InAppMessageHtml) iInAppMessage;
        InAppMessageJavascriptInterface inAppMessageJavascriptInterface = new InAppMessageJavascriptInterface(applicationContext, inAppMessageHtml);
        InAppMessageHtmlBaseView.setWebViewContent$default(inAppMessageHtmlView, inAppMessageHtml.getMessage(), null, 2, null);
        Context applicationContext2 = activity.getApplicationContext();
        j.e(applicationContext2, "activity.applicationContext");
        inAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext2, inAppMessageHtml, this.inAppMessageWebViewClientListener));
        WebView messageWebView = inAppMessageHtmlView.getMessageWebView();
        if (messageWebView != null) {
            messageWebView.addJavascriptInterface(inAppMessageJavascriptInterface, "brazeInternalBridge");
        }
        inAppMessageHtmlView.setupDirectionalNavigation();
        return inAppMessageHtmlView;
    }
}
