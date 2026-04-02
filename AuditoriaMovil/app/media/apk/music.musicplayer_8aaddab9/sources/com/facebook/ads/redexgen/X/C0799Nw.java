package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.Nw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0799Nw extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"YcV2lPdb1GD", "n5DgX5QSw4FQX59vcvxBmCs4C4mD4", "EksZFw55Ld98qazTViJtw6pSuONG6", "FQxvmp8vruM", "8OOSEuFQ7OrFhHkYKSo1UtYVyasxVGnA", "3ltH6wFp1GB97FT9l8RHOrWs4kHkX0iG", "Qgk2ZsNAH7VHvpqjGWkwA7olVBMIpezg", "lYuGhUBeP576iz9ihjd4qaMvDoX6gejl"};
    public final WeakReference<C1046Xo> A00;
    public final WeakReference<InterfaceC0797Nu> A01;
    public final WeakReference<C0794Nr> A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = (copyOfRange[i5] - i4) - 79;
            if (A04[5].charAt(31) != 'G') {
                throw new RuntimeException();
            }
            A04[4] = "SJN5rebrF3WLAsOm1fkdotQMSgQRMUzH";
            copyOfRange[i5] = (byte) i6;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-108, -103, -108, 5, 40, 43, 36, -33, 2, 39, 46, 46, 50, 36, 49, -21, -8, -18, -4, -7, -13, -18, -72, -13, -8, -2, -17, -8, -2, -72, -21, -19, -2, -13, -7, -8, -72, -47, -49, -34, -23, -51, -39, -40, -34, -49, -40, -34, -53, -40, -50, -36, -39, -45, -50, -104, -45, -40, -34, -49, -40, -34, -104, -51, -53, -34, -49, -47, -39, -36, -29, -104, -71, -70, -81, -72, -85, -84, -74, -81, 12, -6, -9, -12, 11, -2, -6, 12};
    }

    static {
        A01();
    }

    public C0799Nw(WeakReference<C1046Xo> weakReference, WeakReference<InterfaceC0797Nu> weakReference2, WeakReference<C0794Nr> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    @SuppressLint({"CatchGeneralException"})
    private boolean A02(ValueCallback valueCallback) {
        boolean z;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C1046Xo c1046Xo = this.A00.get();
        if (c1046Xo != null && c1046Xo.A0C() != null) {
            z = T4.A09;
            if (z) {
                valueCallback2 = T4.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = T4.A08;
                    valueCallback3.onReceiveValue(null);
                    ValueCallback unused = T4.A08 = null;
                }
                ValueCallback unused2 = T4.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 59));
                    intent.addCategory(A00(48, 32, 27));
                    intent.setType(A00(0, 3, 27));
                    c1046Xo.A0C().startActivityForResult(Intent.createChooser(intent, A00(3, 12, SyslogConstants.LOG_ALERT)), 1001);
                    return true;
                } catch (Exception e2) {
                    c1046Xo.A06().A8z(A00(80, 8, 70), C04398z.A2R, new AnonymousClass90(e2));
                    ValueCallback unused3 = T4.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        C0794Nr c0794Nr = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c0794Nr != null) {
            c0794Nr.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i2) {
        super.onProgressChanged(webView, i2);
        C0794Nr c0794Nr = this.A02.get();
        if (c0794Nr != null) {
            c0794Nr.A03();
        }
        InterfaceC0797Nu interfaceC0797Nu = this.A01.get();
        if (interfaceC0797Nu != null) {
            interfaceC0797Nu.ABw(i2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC0797Nu interfaceC0797Nu = this.A01.get();
        if (interfaceC0797Nu != null) {
            interfaceC0797Nu.AC1(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    @RequiresApi(api = CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(valueCallback);
    }
}
