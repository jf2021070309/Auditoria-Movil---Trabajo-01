package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.se0.j1;
import com.amazon.aps.iva.xb.a;
import com.amazon.aps.iva.yb0.e;
import com.amazon.aps.iva.yb0.j;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
/* compiled from: InAppMessageWebViewClient.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u0000 -2\u00020\u0001:\u0001-B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0017J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "Landroid/webkit/WebViewClient;", "Lcom/amazon/aps/iva/kb0/q;", "markPageFinished", "Landroid/webkit/WebView;", "view", "appendBridgeJavascript", "", ImagesContract.URL, "", "handleUrlOverride", "onPageFinished", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setWebViewClientStateListener", "Landroid/webkit/RenderProcessGoneDetail;", "detail", "onRenderProcessGone", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "hasPageFinishedLoading", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/amazon/aps/iva/se0/j1;", "markPageFinishedJob", "Lcom/amazon/aps/iva/se0/j1;", "", "maxOnPageFinishedWaitTimeMs", "I", "<init>", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "Companion", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class InAppMessageWebViewClient extends WebViewClient {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private j1 markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private IWebViewClientStateListener webViewClientStateListener;

    /* compiled from: InAppMessageWebViewClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient$Companion;", "", "()V", "AUTHORITY_NAME_CLOSE", "", "AUTHORITY_NAME_CUSTOM_EVENT", "AUTHORITY_NAME_NEWSFEED", "BRAZE_INAPP_MESSAGE_SCHEME", "BRIDGE_JS_FILE", "JAVASCRIPT_PREFIX", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_DEEPLINK", "QUERY_NAME_EXTERNAL_OPEN", "getBundleFromUrl", "Landroid/os/Bundle;", ImagesContract.URL, "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Bundle getBundleFromUrl(String str) {
            j.f(str, ImagesContract.URL);
            Bundle bundle = new Bundle();
            if (m.b0(str)) {
                return bundle;
            }
            Uri parse = Uri.parse(str);
            j.e(parse, "uri");
            for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(parse).entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            return bundle;
        }
    }

    public InAppMessageWebViewClient(Context context, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        j.f(context, "context");
        j.f(iInAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = new BrazeConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    private final void appendBridgeJavascript(WebView webView) {
        try {
            AssetManager assets = this.context.getAssets();
            j.e(assets, "context.assets");
            String assetFileStringContents = BrazeFileUtils.getAssetFileStringContents(assets, "braze-html-in-app-message-bridge.js");
            webView.loadUrl("javascript:" + assetFileStringContents);
        } catch (Exception e) {
            BrazeInAppMessageManager.Companion.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, InAppMessageWebViewClient$appendBridgeJavascript$javascriptString$1.INSTANCE);
        }
    }

    private final boolean handleUrlOverride(String str) {
        if (this.inAppMessageWebViewClientListener == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$handleUrlOverride$1.INSTANCE, 2, (Object) null);
            return true;
        } else if (m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$handleUrlOverride$2.INSTANCE, 2, (Object) null);
            return true;
        } else {
            Uri parse = Uri.parse(str);
            Bundle bundleFromUrl = Companion.getBundleFromUrl(str);
            if (parse.getScheme() != null && j.a(parse.getScheme(), "appboy")) {
                String authority = parse.getAuthority();
                if (authority != null) {
                    int hashCode = authority.hashCode();
                    if (hashCode != -1801488983) {
                        if (hashCode != 3138974) {
                            if (hashCode == 94756344 && authority.equals("close")) {
                                this.inAppMessageWebViewClientListener.onCloseAction(this.inAppMessage, str, bundleFromUrl);
                            }
                        } else if (authority.equals("feed")) {
                            this.inAppMessageWebViewClientListener.onNewsfeedAction(this.inAppMessage, str, bundleFromUrl);
                        }
                    } else if (authority.equals("customEvent")) {
                        this.inAppMessageWebViewClientListener.onCustomEventAction(this.inAppMessage, str, bundleFromUrl);
                    }
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageWebViewClient$handleUrlOverride$3(parse), 3, (Object) null);
                }
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new InAppMessageWebViewClient$handleUrlOverride$4(parse), 3, (Object) null);
            this.inAppMessageWebViewClientListener.onOtherUrlAction(this.inAppMessage, str, bundleFromUrl);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageWebViewClient$markPageFinished$1$1.INSTANCE, 2, (Object) null);
            ((a) iWebViewClientStateListener).a();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        j.f(webView, "view");
        j.f(str, ImagesContract.URL);
        appendBridgeJavascript(webView);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, InAppMessageWebViewClient$onPageFinished$1$1.INSTANCE, 2, (Object) null);
            ((a) iWebViewClientStateListener).a();
        }
        this.hasPageFinishedLoading = true;
        j1 j1Var = this.markPageFinishedJob;
        if (j1Var != null) {
            j1Var.a(null);
        }
        this.markPageFinishedJob = null;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        j.f(webView, "view");
        j.f(renderProcessGoneDetail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, InAppMessageWebViewClient$onRenderProcessGone$1.INSTANCE, 2, (Object) null);
        return true;
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener iWebViewClientStateListener) {
        if (iWebViewClientStateListener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            ((a) iWebViewClientStateListener).a();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new InAppMessageWebViewClient$setWebViewClientStateListener$1(this, null), 2, null);
        }
        this.webViewClientStateListener = iWebViewClientStateListener;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        j.f(webView, "view");
        j.f(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        j.e(uri, "request.url.toString()");
        return handleUrlOverride(uri);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        j.f(webView, "view");
        j.f(str, ImagesContract.URL);
        return handleUrlOverride(str);
    }
}
