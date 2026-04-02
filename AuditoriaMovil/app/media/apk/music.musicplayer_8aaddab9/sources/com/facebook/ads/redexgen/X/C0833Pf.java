package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Pf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0833Pf extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass18 A03;
    public final C1W A04;
    public final C1046Xo A05;
    public final InterfaceC0684Jg A06;
    public final O3 A07;
    public final C0927Sv A08;
    public final InterfaceC0831Pd A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = copyOfRange[i5] ^ i4;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i5] = (byte) (i6 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (C0739Lm.A00 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C0833Pf(C1046Xo c1046Xo, AnonymousClass18 anonymousClass18, C1W c1w, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0831Pd interfaceC0831Pd, Map<String, String> map) {
        super(c1046Xo);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new AbstractC0930Sy() { // from class: com.facebook.ads.redexgen.X.8D
            @Override // com.facebook.ads.redexgen.X.O3
            public final void AA1() {
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0930Sy, com.facebook.ads.redexgen.X.O3
            public final void AAl(int i2, @Nullable String str) {
                AtomicBoolean atomicBoolean;
                InterfaceC0831Pd interfaceC0831Pd2;
                atomicBoolean = C0833Pf.this.A0B;
                atomicBoolean.set(true);
                interfaceC0831Pd2 = C0833Pf.this.A09;
                interfaceC0831Pd2.ABH();
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0930Sy, com.facebook.ads.redexgen.X.O3
            public final void AAw() {
                AtomicBoolean atomicBoolean;
                AtomicBoolean atomicBoolean2;
                InterfaceC0831Pd interfaceC0831Pd2;
                atomicBoolean = C0833Pf.this.A0B;
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean2 = C0833Pf.this.A0A;
                if (!atomicBoolean2.compareAndSet(false, true)) {
                    return;
                }
                interfaceC0831Pd2 = C0833Pf.this.A09;
                interfaceC0831Pd2.AAw();
            }

            @Override // com.facebook.ads.redexgen.X.O3
            public final void ACr() {
                InterfaceC0831Pd interfaceC0831Pd2;
                interfaceC0831Pd2 = C0833Pf.this.A09;
                interfaceC0831Pd2.ACr();
            }
        };
        this.A05 = c1046Xo;
        this.A03 = anonymousClass18;
        this.A04 = c1w;
        this.A06 = interfaceC0684Jg;
        this.A09 = interfaceC0831Pd;
        this.A02 = map;
        this.A08 = A04();
        if (JQ.A1F(this.A05)) {
            this.A05.A09().AFT(this.A08, this.A03.A0T(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C0833Pf c0833Pf) {
        int i2 = c0833Pf.A00;
        c0833Pf.A00 = i2 + 1;
        return i2;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private C0927Sv A04() {
        C0927Sv c0927Sv = new C0927Sv(this.A05, new WeakReference(this.A07), 10, JQ.A1L(this.A05));
        c0927Sv.setCornerRadius(A0E);
        c0927Sv.setLogMultipleImpressions(false);
        c0927Sv.setCheckAssetsByJavascriptBridge(false);
        c0927Sv.setWebViewTimeoutInMillis(this.A04.A08());
        c0927Sv.setRequestId(this.A03.A0Y());
        c0927Sv.setOnTouchListener(new View$OnTouchListenerC0832Pe(this));
        WebSettings settings = c0927Sv.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            c0927Sv.addJavascriptInterface(new C0834Pg(this.A05, this, this.A06, this.A02, this.A03.A0T()), A06(0, 12, 104));
        }
        return c0927Sv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b8, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.JQ.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00ba, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.C0833Pf.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ce, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d0, code lost:
        r3.AAO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.X.C0833Pf.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAO();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00f2, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.JQ.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f5, code lost:
        r6.A03(0);
        r9.A05.A06().A8y(r5, com.facebook.ads.redexgen.X.C04398z.A23, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0833Pf.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A06(FacebookMediationAdapter.ERROR_NULL_CONTEXT, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0T());
            } catch (JSONException e2) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e2);
            }
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            InterfaceC04388y A06 = this.A05.A06();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i2 = C04398z.A25;
            String A062 = A06(155, 15, 98);
            A06.A8z(A062, i2, anonymousClass90);
            if (JQ.A0l(this.A05) && MA.A00(this.A05) == M9.A07) {
                this.A05.A06().A8z(A062, C04398z.A24, anonymousClass90);
                this.A07.AAl(0, null);
                return;
            }
        }
        try {
            C0927Sv c0927Sv = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            c0927Sv.loadUrl(A0E2);
        } catch (Exception e3) {
            this.A05.A06().A8y(A06(192, 8, 57), C04398z.A2T, new AnonymousClass90(e3));
        }
    }

    public final void A0C() {
        if (JQ.A1F(this.A05)) {
            C1046Xo c1046Xo = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c1046Xo.A09().AFK(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
            return;
        }
        this.A08.destroy();
    }

    public MD getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C0869Qp getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
