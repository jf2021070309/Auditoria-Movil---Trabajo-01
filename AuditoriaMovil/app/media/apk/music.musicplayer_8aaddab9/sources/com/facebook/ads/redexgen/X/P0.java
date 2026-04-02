package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public class P0 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ P4 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, 18, 2, 17, 8, 15, 19, 8, 14, 13, -11, -6, -11, -44, 3, -14, 4, -7, 13, 26, 26, 23, 26, -21, 23, 12, 13, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, 30, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public P0(P4 p4) {
        this.A00 = p4;
    }

    private void A02(int i2, String str, String str2, boolean z) {
        C0692Jo c0692Jo;
        C1046Xo c1046Xo;
        C0820Or c0820Or;
        if (z) {
            this.A00.A0S();
        }
        c0692Jo = this.A00.A0D;
        c0692Jo.A02(EnumC0691Jn.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i2);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1046Xo = this.A00.A0B;
        c1046Xo.A0D().A53(jSONObject2);
        c0820Or = this.A00.A0E;
        c0820Or.A04(C04398z.A0x, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C0692Jo c0692Jo;
        C1046Xo c1046Xo;
        long j2;
        P2 p2;
        P2 p22;
        c0692Jo = this.A00.A0D;
        c0692Jo.A02(EnumC0691Jn.A0R, null);
        c1046Xo = this.A00.A0B;
        C0R A0D = c1046Xo.A0D();
        j2 = this.A00.A00;
        A0D.A54(MC.A01(j2));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        p2 = this.A00.A03;
        if (p2 == null) {
            return;
        }
        p22 = this.A00.A03;
        p22.ACs();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i2, String str, String str2) {
        super.onReceivedError(webView, i2, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i2, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = ConnectionResult.API_DISABLED)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb = new StringBuilder();
        String A00 = A00(0, 0, 48);
        sb.append(A00);
        sb.append((Object) webResourceError.getDescription());
        String sb2 = sb.toString();
        A02(errorCode, sb2, A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i2;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i2 = webResourceResponse.getStatusCode();
        } else {
            i2 = -1;
        }
        A02(i2, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1046Xo c1046Xo;
        AnonymousClass18 anonymousClass18;
        P3 p3;
        P3 p32;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1046Xo = this.A00.A0B;
        c1046Xo.A0D().A4z(jSONObject2);
        anonymousClass18 = this.A00.A09;
        P5.A04(anonymousClass18.A0Y());
        p3 = this.A00.A04;
        if (p3 == null) {
            return true;
        }
        p32 = this.A00.A04;
        String[] strArr = A02;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        p32.ABu();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1046Xo c1046Xo;
        C7U c7u;
        PG pg;
        AnonymousClass18 anonymousClass18;
        c1046Xo = this.A00.A0B;
        c7u = this.A00.A0A;
        pg = this.A00.A0H;
        anonymousClass18 = this.A00.A09;
        return PI.A00(c1046Xo, c7u, webResourceRequest, pg, anonymousClass18.A0n());
    }
}
