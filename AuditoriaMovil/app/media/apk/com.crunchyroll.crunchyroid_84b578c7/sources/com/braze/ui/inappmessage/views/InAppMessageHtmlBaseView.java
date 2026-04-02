package com.braze.ui.inappmessage.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.amazon.aps.iva.e.k;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.j9.a;
import com.amazon.aps.iva.j9.f0;
import com.amazon.aps.iva.j9.g0;
import com.amazon.aps.iva.j9.t;
import com.amazon.aps.iva.p3.w0;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.ViewUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
/* compiled from: InAppMessageHtmlBaseView.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u001b\u0012\b\u0010.\u001a\u0004\u0018\u00010-\u0012\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u000fH&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0006\u0010\u001a\u001a\u00020\u0003R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010,\u001a\u0004\u0018\u00010\u001b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "Lcom/amazon/aps/iva/kb0/q;", "finishWebViewDisplay", "", "htmlBody", "assetDirectoryUrl", "setWebViewContent", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "inAppMessageWebViewClient", "setInAppMessageWebViewClient", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setHtmlPageFinishedListener", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "getWebViewViewId", "dispatchKeyEvent", "Lcom/amazon/aps/iva/p3/w0;", "insets", "applyWindowInsets", "setupDirectionalNavigation", "Landroid/webkit/WebView;", "configuredMessageWebView", "Landroid/webkit/WebView;", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "isFinished", "Z", "hasAppliedWindowInsets", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageClickableView", "getMessageWebView", "()Landroid/webkit/WebView;", "messageWebView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    public static final Companion Companion = new Companion(null);
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    /* compiled from: InAppMessageHtmlBaseView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$Companion;", "", "()V", "BRAZE_BRIDGE_PREFIX", "", "FILE_URI_SCHEME_PREFIX", "FINISHED_WEBVIEW_URL", "HTML_ENCODING", "HTML_MIME_TYPE", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void a(WebView webView) {
        setupDirectionalNavigation$lambda$1(webView);
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            inAppMessageHtmlBaseView.setWebViewContent(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
    }

    public static final void setupDirectionalNavigation$lambda$1(WebView webView) {
        j.f(webView, "$webView");
        webView.requestFocus();
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(w0 w0Var) {
        j.f(w0Var, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        j.e(context, "this.context");
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            j.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(w0Var) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(w0Var) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(w0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(w0Var) + marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        if (!isInTouchMode() && keyEvent.getKeyCode() == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageHtmlBaseView$finishWebViewDisplay$1.INSTANCE, 3, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl("about:blank");
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$1.INSTANCE, 2, (Object) null);
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$2.INSTANCE, 3, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageHtmlBaseView$messageWebView$3(webViewViewId), 3, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        j.e(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        try {
            if (w.G("FORCE_DARK")) {
                Context context = getContext();
                j.e(context, "context");
                if (ViewUtils.isDeviceInNightMode(context)) {
                    a.h hVar = f0.e;
                    if (hVar.b()) {
                        t.d(settings, 2);
                    } else if (hVar.c()) {
                        ((WebSettingsBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) g0.a.a.b).convertSettings(settings))).setForceDark(2);
                    } else {
                        throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                    }
                }
            }
            if (w.G("FORCE_DARK_STRATEGY")) {
                if (f0.f.c()) {
                    ((WebSettingsBoundaryInterface) com.amazon.aps.iva.hf0.a.a(WebSettingsBoundaryInterface.class, ((WebkitToCompatConverterBoundaryInterface) g0.a.a.b).convertSettings(settings))).setForceDarkBehavior(1);
                } else {
                    throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                }
            }
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, InAppMessageHtmlBaseView$messageWebView$4.INSTANCE);
        }
        Context context2 = getContext();
        j.e(context2, "this.context");
        final boolean isHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (isHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$5.INSTANCE, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$6.INSTANCE, 2, (Object) null);
        }
        webView2.setWebChromeClient(new WebChromeClient() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7
            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                j.e(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
                return createBitmap;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                j.f(consoleMessage, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, InAppMessageHtmlBaseView.this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageHtmlBaseView$messageWebView$7$onConsoleMessage$1(consoleMessage), 3, (Object) null);
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView3, boolean z, boolean z2, Message message) {
                if (!isHtmlInAppMessageHtmlLinkTargetEnabled) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$1.INSTANCE, 2, (Object) null);
                    return super.onCreateWindow(webView3, z, z2, message);
                }
                if (webView3 == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$2.INSTANCE, 2, (Object) null);
                } else {
                    WebView.HitTestResult hitTestResult = webView3.getHitTestResult();
                    j.e(hitTestResult, "view.hitTestResult");
                    BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                    BrazeLogger.Priority priority = BrazeLogger.Priority.V;
                    BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$3(hitTestResult), 2, (Object) null);
                    int type = hitTestResult.getType();
                    if (type != 2) {
                        if (type != 4) {
                            if (type != 7) {
                                BrazeLogger.brazelog$default(brazeLogger, this, priority, (Throwable) null, new InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$4(hitTestResult), 2, (Object) null);
                            } else {
                                InAppMessageHtmlBaseView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(hitTestResult.getExtra())));
                            }
                        } else {
                            InAppMessageHtmlBaseView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + hitTestResult.getExtra())));
                        }
                    } else {
                        InAppMessageHtmlBaseView.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + hitTestResult.getExtra())));
                    }
                }
                return false;
            }
        });
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        j.f(keyEvent, "event");
        if (i == 4 && BrazeInAppMessageManager.Companion.getInstance().getDoesBackButtonDismissInAppMessageView()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener iWebViewClientStateListener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient != null) {
            inAppMessageWebViewClient.setWebViewClientStateListener(iWebViewClientStateListener);
        }
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        j.f(inAppMessageWebViewClient, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }

    public final void setupDirectionalNavigation() {
        WebView messageWebView = getMessageWebView();
        if (messageWebView == null) {
            return;
        }
        messageWebView.setNextFocusDownId(messageWebView.getId());
        messageWebView.setNextFocusLeftId(messageWebView.getId());
        messageWebView.setNextFocusRightId(messageWebView.getId());
        messageWebView.setNextFocusUpId(messageWebView.getId());
        messageWebView.requestFocus();
        messageWebView.setFocusedByDefault(true);
        messageWebView.post(new k(messageWebView, 8));
    }

    public void setWebViewContent(String str, String str2) {
        if (str != null) {
            WebView messageWebView = getMessageWebView();
            if (messageWebView != null) {
                messageWebView.loadDataWithBaseURL("file://" + str2 + '/', str, "text/html", "utf-8", null);
                return;
            }
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, InAppMessageHtmlBaseView$setWebViewContent$1.INSTANCE, 3, (Object) null);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }
}
