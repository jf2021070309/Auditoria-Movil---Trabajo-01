package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Nx  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0800Nx extends WebViewClient {
    public static byte[] A04;
    public WeakReference<InterfaceC0798Nv> A00 = new WeakReference<>(null);
    public final WeakReference<C1046Xo> A01;
    public final WeakReference<InterfaceC0797Nu> A02;
    public final WeakReference<C0794Nr> A03;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 42, 56, 53, 47, 42, -12, 47, 52, 58, 43, 52, 58, -12, 39, 41, 58, 47, 53, 52, -12, 28, 15, 11, 29, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 53, 51, 70, 55, 57, 65, 68, 75, 0, 20, 36, 33, 41, 37, 19, 20, 30, 23, 17, 22, 28, 13, 22, 28, 28, 10, 7, 4, 27, 14, 10, 28};
    }

    public C0800Nx(WeakReference<C1046Xo> weakReference, WeakReference<InterfaceC0797Nu> weakReference2, WeakReference<C0794Nr> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r0.contains(r5) == false) goto L29;
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A02(android.webkit.WebView r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.ref.WeakReference<com.facebook.ads.redexgen.X.Xo> r0 = r9.A01
            java.lang.Object r7 = r0.get()
            com.facebook.ads.redexgen.X.Xo r7 = (com.facebook.ads.redexgen.X.C1046Xo) r7
            r8 = 0
            if (r7 != 0) goto Lc
            return r8
        Lc:
            boolean r0 = com.facebook.ads.redexgen.X.T4.A0B()
            r4 = 1
            if (r0 == 0) goto L29
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L28
            r2 = 0
            r1 = 11
            r0 = 116(0x74, float:1.63E-43)
            java.lang.String r0 = A00(r2, r1, r0)
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L29
        L28:
            return r4
        L29:
            android.net.Uri r3 = android.net.Uri.parse(r11)
            java.lang.String r5 = r3.getScheme()
            boolean r0 = com.facebook.ads.redexgen.X.T4.A0B()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L74
            r2 = 70
            r1 = 6
            r0 = 71
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Exception -> L9e
            boolean r0 = r0.equalsIgnoreCase(r5)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L74
            android.content.Intent r3 = android.content.Intent.parseUri(r11, r4)     // Catch: java.lang.Exception -> L9e
            r2 = 37
            r1 = 33
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = A00(r2, r1, r0)     // Catch: java.lang.Exception -> L9e
            r3.addCategory(r0)     // Catch: java.lang.Exception -> L9e
            r0 = 0
            r3.setComponent(r0)     // Catch: java.lang.Exception -> L9e
            r3.setSelector(r0)     // Catch: java.lang.Exception -> L9e
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch: java.lang.Exception -> L9e
            r0 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r3, r0)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto Lc2
            boolean r0 = com.facebook.ads.redexgen.X.LL.A0B(r7, r3)     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto Lc2
            r10.goBack()     // Catch: java.lang.Exception -> L9e
            return r4
        L74:
            boolean r0 = com.facebook.ads.redexgen.X.T4.A0B()     // Catch: java.lang.Exception -> L9e
            if (r0 == 0) goto L80
            boolean r0 = com.facebook.ads.redexgen.X.C0741Lq.A04(r11)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto L8a
        L80:
            java.util.Set r0 = com.facebook.ads.redexgen.X.T4.A06()     // Catch: java.lang.Exception -> L9e
            boolean r0 = r0.contains(r5)     // Catch: java.lang.Exception -> L9e
            if (r0 != 0) goto Lc2
        L8a:
            r2 = 11
            r1 = 26
            r0 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = A00(r2, r1, r0)     // Catch: java.lang.Exception -> L9e
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L9e
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L9e
            boolean r0 = com.facebook.ads.redexgen.X.LL.A0B(r7, r0)     // Catch: java.lang.Exception -> L9e
            return r0
        L9e:
            r6 = move-exception
            com.facebook.ads.redexgen.X.8y r5 = r7.A06()
            int r4 = com.facebook.ads.redexgen.X.C04398z.A2R
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r6)
            r2 = 76
            r1 = 8
            r0 = 68
            java.lang.String r0 = A00(r2, r1, r0)
            r5.A8z(r0, r4, r3)
            com.facebook.ads.redexgen.X.0R r1 = r7.A0D()
            java.lang.String r0 = r6.toString()
            r1.A8E(r0)
        Lc2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0800Nx.A02(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void A03(WeakReference<InterfaceC0798Nv> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C0794Nr c0794Nr = this.A03.get();
        if (c0794Nr != null) {
            c0794Nr.A03();
        }
        InterfaceC0797Nu interfaceC0797Nu = this.A02.get();
        if (interfaceC0797Nu != null) {
            interfaceC0797Nu.ABd(str);
        }
        InterfaceC0798Nv interfaceC0798Nv = this.A00.get();
        if (interfaceC0798Nv != null) {
            interfaceC0798Nv.AA8(webView.canGoBack());
            interfaceC0798Nv.AAn(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        InterfaceC0797Nu interfaceC0797Nu = this.A02.get();
        if (interfaceC0797Nu != null) {
            interfaceC0797Nu.ABf(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        C1046Xo c1046Xo = this.A01.get();
        if (c1046Xo != null) {
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb.append(A00);
            sb.append(str);
            String sb2 = sb.toString();
            c1046Xo.A0D().A8B(C0741Lq.A01(i2, sb2, A00 + str2));
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = ConnectionResult.API_DISABLED)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1046Xo c1046Xo = this.A01.get();
        if (c1046Xo != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb.append(A00);
            sb.append((Object) webResourceError.getDescription());
            String sb2 = sb.toString();
            c1046Xo.A0D().A8B(C0741Lq.A01(errorCode, sb2, A00 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1046Xo c1046Xo = this.A01.get();
        if (c1046Xo != null) {
            c1046Xo.A0D().A8C();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1046Xo c1046Xo = this.A01.get();
        if (c1046Xo != null) {
            c1046Xo.A0D().A8D();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O0.A02(C04398z.A2S);
        InterfaceC0797Nu interfaceC0797Nu = this.A02.get();
        if (interfaceC0797Nu != null) {
            interfaceC0797Nu.AC3();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A02(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A02(webView, str);
    }
}
