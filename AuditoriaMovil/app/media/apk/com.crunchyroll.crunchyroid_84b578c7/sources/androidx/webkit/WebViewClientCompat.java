package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.j9.a;
import com.amazon.aps.iva.j9.b;
import com.amazon.aps.iva.j9.e0;
import com.amazon.aps.iva.j9.f0;
import com.amazon.aps.iva.j9.z;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
/* loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    public static final String[] a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public final void a(WebView webView, WebResourceRequest webResourceRequest, e0 e0Var) {
        if (w.G("WEB_RESOURCE_ERROR_GET_CODE") && w.G("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && b.b(webResourceRequest)) {
            onReceivedError(webView, e0Var.t(), e0Var.s().toString(), b.a(webResourceRequest).toString());
        }
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        a(webView, webResourceRequest, new e0(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        z zVar = new z(invocationHandler);
        if (w.G("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            zVar.s();
        } else {
            a.b bVar = f0.a;
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, b.a(webResourceRequest).toString());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        a(webView, webResourceRequest, new e0(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        z zVar = new z(safeBrowsingResponse);
        if (w.G("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            zVar.s();
        } else {
            a.b bVar = f0.a;
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }
}
