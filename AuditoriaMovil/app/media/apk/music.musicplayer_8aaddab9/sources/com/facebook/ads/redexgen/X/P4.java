package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: assets/audience_network.dex */
public final class P4 {
    public static byte[] A0K;
    public static String[] A0L = {"FzSVXB4mYbOB8Ap0RZsCDdXVsmLfm8Jd", "1LkH26oE6mA26lQtC6YvQW7uIFVycFeK", "rW0HdwO1ZwlnSaQ2Af", "GQ1qj5ap6z56eCi2le", "uXieXG3T7mAXvJ2", "QucdoxB0vpGTNezXYptNtkyhh8Rjdnlc", "00yn0QSHmKstnvXW3I3NQQkY4p", "j2c94AiQV22NdXj9VV604tyulZ5jlQdF"};
    public static final AtomicInteger A0M;
    public static final AtomicInteger A0N;
    @Nullable
    public InterfaceC0822Ot A02;
    @Nullable
    public P2 A03;
    @Nullable
    public P3 A04;
    @Nullable
    public C0869Qp A05;
    public final int A08;
    public final AnonymousClass18 A09;
    public final C7U A0A;
    public final C1046Xo A0B;
    public final InterfaceC0684Jg A0C;
    public final C0692Jo A0D;
    public final C0820Or A0E;
    public final SN A0F;
    public final PF A0G;
    public final PG A0H;
    public final LinkedList<P1> A0J = new LinkedList<>();
    public MD A01 = new MD();
    public boolean A07 = true;
    public boolean A06 = false;
    public long A00 = -1;
    public final String A0I = UUID.randomUUID().toString();

    public static String A0A(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0K = new byte[]{37, 63, 39, 49, 39, 57, 13, 34, 40, 62, 35, 37, 40, 5, 34, 56, 41, 62, 42, 45, 47, 41, 5, 0, 54, 1, 20, 11, 22, 16, 13, 10, 3, 34, 13, 10, 13, 23, 12, 1, 0, 76, 67, 65, 23, 67, 77, 95, 96, 101, 83, 100, 113, 110, 115, 117, 104, 111, 102, 82, 117, 96, 115, 117, 100, 101, 41, 38, 36, 114, 38, 40, 58, 34, 55, 55, 34, 32, 43, 38, 39, 20, 21, 13, 54, 46, 11, 29, 26, 26, 13, 6, 28, 63, 62, 38, 29, 5, 88, 89, 118, 84, 67, 94, 65, 94, 67, 78, 103, 86, 66, 68, 82, 83, 31, 16, 18, 68, 16, 30, 12, 57, 56, 23, 53, 34, 63, 32, 63, 34, 47, 4, 51, 37, 35, 59, 51, 50, 126, 113, 115, 37, 113, Byte.MAX_VALUE, 109, 120, 121, 84, 123, 120, 100, 114, 81, 98, 123, 123, 100, 116, 101, 114, 114, 121, 65, 126, 114, 96, 63, 48, 50, 100, 48, 62, 36, 37, 13, 62, 39, 39, 56, 40, 57, 46, 46, 37, 29, 34, 46, 60, 99, 108, 110, 56, 108, 98, 83, 82, 106, 93, 80, 73, 89, 110, 89, 93, 88, 20, 27, 25, 79, 27, 16, 28, 27, 25, 79, 27, 16, 28, 27, 25, 79, 27, 21, 7, 67, 66, 122, 77, 64, 89, 73, 123, 94, 69, 88, 88, 73, 66, 4, 11, 9, 95, 11, 0, 12, 11, 9, 95, 11, 5, 23, 84, 66, 83, 102, 82, 83, 79, 108, 66, 94, 15, 0, 2, 84, 0, 11, 0, 2, 84, 0, 14, 28, 100, 114, 99, 85, 118, 100, 114, 33, 35, 86, 100, 100, 114, 99, 100, 63, 48, 50, 100, 48, 59, 48, 50, 100, 48, 62, 106, 124, 109, 91, 120, 106, 124, 47, 45, 90, 118, 119, Byte.MAX_VALUE, 112, 126, 49, 62, 60, 106, 62, 53, 62, 60, 106, 62, 48, 19, 8, 19, 6, 11, 48, 49, 41, 18, 10, 75, 76, 82, 7, 24, 21, 20, 30, 52, 7, 20, 31, 5, 89, 86, 84, 2, 86, 93, 81, 86, 84, 2, 86, 93, 81, 86, 84, 2, 86, 88, 74, 59, 36, 40, 58, 31, 40, 44, 41, 52, 25, 34, 30, 37, 34, 58, 101, 106, 104, 62, 106, 100, 118};
    }

    static {
        A0D();
        A0N = new AtomicInteger();
        A0M = new AtomicInteger();
    }

    public P4(C1046Xo c1046Xo, AnonymousClass18 anonymousClass18, InterfaceC0684Jg interfaceC0684Jg, int i2) {
        this.A0B = c1046Xo;
        this.A0C = interfaceC0684Jg;
        this.A09 = anonymousClass18;
        this.A08 = i2;
        this.A0F = new SN(this, c1046Xo);
        this.A0A = new C7U(this.A0B);
        this.A0D = new C0692Jo(anonymousClass18.A0T(), interfaceC0684Jg);
        this.A0E = new C0820Or(anonymousClass18.A0Y(), anonymousClass18.A0N().A0D().A08(), i2);
        this.A0H = PH.A00(this.A0B, anonymousClass18.A0c(), this.A0A, this.A0D, this.A0E, A0H());
        this.A0G = new PF(this.A0B, this, interfaceC0684Jg, this.A0E, this.A0I, anonymousClass18.A0T());
    }

    public static /* synthetic */ AnonymousClass18 A01(P4 p4) {
        return p4.A09;
    }

    public static /* synthetic */ InterfaceC0822Ot A06(P4 p4) {
        return p4.A02;
    }

    public static AtomicInteger A0B() {
        return A0M;
    }

    private void A0C() {
        A0F(new P1(A0A(251, 22, 37), new String[]{this.A0I, A0A(1, 5, 11)}));
        A0F(new P1(A0A(273, 26, 21), new String[]{Base64.encodeToString(this.A0H.A05.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD)), this.A0I}));
    }

    @TargetApi(CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE)
    public synchronized void A0E() {
        if (this.A06) {
            while (!this.A0J.isEmpty()) {
                P1 poll = this.A0J.poll();
                if (poll != null) {
                    this.A0F.A05(String.format(Locale.US, poll.A00, poll.A02));
                    if (poll.A01) {
                        this.A0D.A02(EnumC0691Jn.A0L, null);
                        this.A0B.A0D().A4u(poll.A00);
                    }
                }
            }
        }
        String[] strArr = A0L;
        if (strArr[0].charAt(13) == strArr[7].charAt(13)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0L;
        strArr2[2] = "zGpus9wW0BJIjoljGX";
        strArr2[3] = "A1e8XSvn3Bv6Tp7Ifd";
    }

    private synchronized void A0F(P1 p1) {
        this.A0J.offer(p1);
        A0E();
    }

    private boolean A0H() {
        return !A0I();
    }

    private boolean A0I() {
        return JQ.A20(this.A0B, QZ.A03());
    }

    public final C0692Jo A0K() {
        return this.A0D;
    }

    public final MD A0L() {
        return this.A01;
    }

    public final C0820Or A0M() {
        return this.A0E;
    }

    @Nullable
    public final InterfaceC0822Ot A0N() {
        return this.A02;
    }

    public final SN A0O() {
        return this.A0F;
    }

    public final void A0P() {
        A0F(new P1(A0A(22, 26, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), new String[]{this.A0I}));
    }

    public final void A0Q() {
        A0F(new P1(A0A(48, 25, 3), new String[]{this.A0I}));
    }

    public final void A0R() {
        this.A07 = true;
    }

    public final void A0S() {
        this.A07 = false;
    }

    public final void A0T() {
        A0F(new P1(A0A(98, 23, 53), new String[]{this.A0I}));
    }

    public final void A0U() {
        A0F(new P1(A0A(145, 27, 21), new String[]{this.A0I}));
    }

    public final void A0V() {
        A0F(new P1(A0A(172, 22, 73), new String[]{this.A0I}));
    }

    public final void A0W() {
        A0F(new P1(A0A(367, 22, 79), new String[]{this.A0I}));
    }

    @SuppressLint({"AddJavascriptInterface"})
    public final void A0X() {
        String str;
        if (Build.VERSION.SDK_INT > 16) {
            this.A0F.addJavascriptInterface(this.A0G, A0A(6, 16, 78));
        }
        this.A0D.A02(EnumC0691Jn.A0O, null);
        if (this.A08 == 3) {
            str = this.A0H.A00;
        } else {
            str = this.A0H.A01;
        }
        this.A0F.loadUrl(str);
        this.A00 = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A0A(335, 3, 60), str);
            jSONObject.put(A0A(86, 12, 106), P5.A00());
            jSONObject.put(A0A(325, 10, 101), A0N.getAndIncrement());
            jSONObject.put(A0A(73, 13, 65), A0M);
        } catch (JSONException unused) {
        }
        this.A0B.A0D().A50(jSONObject.toString());
        A0C();
    }

    public final void A0Y() {
        A0F(new P1(A0A(121, 24, 84), new String[]{this.A0I}));
    }

    public final void A0Z(MD md) {
        this.A01 = md;
    }

    public final void A0a(@Nullable InterfaceC0822Ot interfaceC0822Ot) {
        this.A02 = interfaceC0822Ot;
    }

    public final void A0b(P2 p2) {
        this.A03 = p2;
    }

    public final void A0c(P3 p3) {
        this.A04 = p3;
    }

    public final void A0d(SM sm) {
        this.A0G.A0N(sm);
    }

    public final void A0e(@Nullable C0869Qp c0869Qp) {
        this.A05 = c0869Qp;
    }

    public final void A0f(String str) {
        A0F(new P1(A0A(224, 27, 46), new String[]{this.A0I, str}));
    }

    public final void A0g(String str, String str2) {
        A0F(new P1(A0A(194, 30, 62), new String[]{this.A0I, str, str2}));
    }

    public final void A0h(String str, JSONObject jSONObject) {
        A0F(new P1(A0A(338, 29, 115), new String[]{this.A0I, str, jSONObject.toString()}, false));
    }

    public final void A0i(Map<String, String> map) {
        this.A0C.A8x(this.A09.A0T(), new OA(map).A03(this.A05).A05());
    }

    public final void A0j(JSONObject jSONObject) {
        A0F(new P1(A0A(299, 26, 27), new String[]{Base64.encodeToString(jSONObject.toString().getBytes(), 0).replace(A0A(0, 1, 45), A0A(0, 0, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD)), this.A0I}));
    }

    public final boolean A0k() {
        return this.A0G.A0O();
    }

    public final boolean A0l() {
        return this.A07;
    }
}
