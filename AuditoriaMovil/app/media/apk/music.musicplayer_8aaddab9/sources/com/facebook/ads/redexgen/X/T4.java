package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
@TargetApi(19)
/* loaded from: assets/audience_network.dex */
public final class T4 extends O0 {
    @Nullable
    public static ValueCallback A08;
    public static boolean A09;
    public static boolean A0A;
    public static byte[] A0B;
    public static final String A0C;
    public static final Set<String> A0D;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public C1046Xo A04;
    public C0794Nr A05;
    public InterfaceC0797Nu A06;
    public C0800Nx A07;

    public static String A05(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0B = new byte[]{83, 79, 79, 75, 49, 45, 45, 41, 42};
    }

    static {
        A08();
        A0C = T4.class.getSimpleName();
        A0D = new HashSet(2);
        A09 = false;
        A0A = false;
        A0D.add(A05(0, 4, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH));
        A0D.add(A05(4, 5, 4));
    }

    public T4(C1046Xo c1046Xo, Activity activity, InterfaceC0797Nu interfaceC0797Nu) {
        super(activity, c1046Xo);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1046Xo, interfaceC0797Nu);
    }

    public T4(C1046Xo c1046Xo, InterfaceC0797Nu interfaceC0797Nu) {
        super(c1046Xo);
        this.A02 = -1L;
        this.A00 = -1L;
        this.A03 = -1L;
        this.A01 = -1L;
        A0A(c1046Xo, interfaceC0797Nu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.O0
    /* renamed from: A04 */
    public final C0800Nx A0E() {
        return new C0800Nx(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    private void A07() {
        if (this.A02 > -1 && this.A00 > -1 && this.A01 > -1) {
            this.A05.A05(false);
        }
    }

    public static void A09(int i2, int i3, Intent intent) {
        if (A08 != null && i2 == 1001) {
            if (Build.VERSION.SDK_INT >= 21) {
                A08.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i3, intent));
            } else {
                A08.onReceiveValue(intent.getData());
            }
            A08 = null;
        }
    }

    private void A0A(C1046Xo c1046Xo, InterfaceC0797Nu interfaceC0797Nu) {
        this.A04 = c1046Xo;
        this.A06 = interfaceC0797Nu;
        this.A05 = new C0794Nr(this);
        A09 = JR.A03(this.A04);
        A0A = JR.A04(this.A04);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowFileAccess(false);
        setWebChromeClient(A0D());
        this.A07 = A0E();
        setWebViewClient(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.O0
    public final WebChromeClient A0D() {
        return new C0799Nw(new WeakReference(this.A04), new WeakReference(this.A06), new WeakReference(this.A05));
    }

    public final void A0F(long j2) {
        if (this.A00 < 0) {
            this.A00 = j2;
        }
        A07();
    }

    public final void A0G(long j2) {
        if (this.A01 < 0) {
            this.A01 = j2;
        }
        A07();
    }

    public final void A0H(long j2) {
        if (this.A02 < 0) {
            this.A02 = j2;
        }
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.O0, android.webkit.WebView
    public final void destroy() {
        this.A06 = null;
        O6.A03(this);
        super.destroy();
    }

    public long getDomContentLoadedMs() {
        return this.A00;
    }

    public String getFirstUrl() {
        WebBackForwardList copyBackForwardList = copyBackForwardList();
        if (copyBackForwardList.getSize() > 0) {
            return copyBackForwardList.getItemAtIndex(0).getUrl();
        }
        return getUrl();
    }

    public long getLoadFinishMs() {
        return this.A01;
    }

    public long getResponseEndMs() {
        return this.A02;
    }

    public long getScrollReadyMs() {
        return this.A03;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A03 < 0 && computeVerticalScrollRange() > getHeight()) {
            this.A03 = System.currentTimeMillis();
        }
    }

    public void setBrowserNavigationListener(InterfaceC0798Nv interfaceC0798Nv) {
        this.A07.A03(new WeakReference<>(interfaceC0798Nv));
    }
}
