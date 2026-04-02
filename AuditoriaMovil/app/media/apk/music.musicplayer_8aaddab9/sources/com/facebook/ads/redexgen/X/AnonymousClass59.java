package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.net.SyslogConstants;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.59 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass59 implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0Q;
    public static String[] A0R = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public C0692Jo A07;
    public EnumC0717Kp A08;
    @Nullable
    public InterfaceC0762Ml A09;
    public NH A0A;
    public O8 A0B;
    @Nullable
    public C0830Pc A0C;
    public String A0D;
    public String A0E;
    @Nullable
    public String A0F;
    public boolean A0H;
    public boolean A0I;
    public boolean A0K;
    public boolean A0L;
    public final AudienceNetworkActivity A0M;
    public final AudienceNetworkActivityApi A0N;
    public final C1046Xo A0O;
    public final List<AnonymousClass57> A0P = new ArrayList();
    public int A01 = -1;
    public boolean A0G = false;
    public boolean A0J = false;

    public static String A04(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Q, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0Q = new byte[]{-37, 7, 40, 37, 56, 42, 55, 80, 67, 68, 78, 71, 2, 86, 81, 2, 75, 80, 72, 71, 84, 2, 88, 75, 71, 89, 54, 91, 82, 71, 2, 72, 84, 81, 79, 2, 75, 80, 86, 71, 80, 86, 2, 81, 84, 2, 85, 67, 88, 71, 70, 43, 80, 85, 86, 67, 80, 69, 71, 53, 86, 67, 86, 71, -24, -11, -26, -24, -22, -5, -16, -3, -16, -5, 0, -10, -1, -4, -8, 1, 7, -25, 2, -2, -8, 1, -44, -32, -34, -97, -41, -46, -44, -42, -45, -32, -32, -36, -97, -46, -43, -28, -97, -46, -43, -29, -42, -31, -32, -29, -27, -38, -33, -40, -97, -73, -70, -65, -70, -60, -71, -48, -78, -75, -48, -61, -74, -63, -64, -61, -59, -70, -65, -72, -48, -73, -67, -64, -56, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 2, 17, -52, 7, 12, 18, 3, 16, 17, 18, 7, 18, 7, -1, 10, -52, -1, 1, 18, 7, 20, 7, 18, 23, -3, 2, 3, 17, 18, 16, 13, 23, 3, 2, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -31, -26, -16, -22, -26, -16, -16, -30, -31, 15, 27, 25, -38, 18, 13, 15, 17, 14, 27, 27, 23, -38, 13, 16, 31, -38, 21, 26, 32, 17, 30, 31, 32, 21, 32, 21, 13, 24, -38, 16, 21, 31, 28, 24, 13, 37, 17, 16, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -21, -8, -8, -11, -8, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 19, 22, 27, 22, 32, 21, 12, 14, 16, 33, 22, 35, 22, 33, 38, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 60, 64, 67, 69, 56, 70, 70, 60, 66, 65, 1, 63, 66, 58, 58, 56, 55, 77, 94, 77, 86, 92, 49, 38, 51, 41, 56, 40, 38, 53, 42, 69, 61, 60, 65, 57, 76, 65, 71, 70, 28, 57, 76, 57, 18, 14, 3, 5, 7, 15, 7, 16, 22, -21, 6, -7, -8, -5, -3, -5, -22, -14, -3, 87, 89, 76, 75, 76, 77, 80, 85, 76, 75, 54, 89, 80, 76, 85, 91, 72, 91, 80, 86, 85, 50, 76, 96, 78, 65, 77, 81, 65, 79, 80, 48, 69, 73, 65, -8, -6, -20, -43, -12, -7, -17, -6, -21, 44, 36, 34, 41, -6, 31, 45, 30, 43, 12, 30, 28, 40, 39, 29, 44, -12, -17, -33, -17, -14, -23, -27, -18, -12, -31, -12, -23, -17, -18, 57, 50, 45, 53, 57, 41, 13, 40, 90, 77, 73, 91, 56, 93, 84, 73};
    }

    static {
        A07();
    }

    public AnonymousClass59(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0M = audienceNetworkActivity;
        this.A0N = audienceNetworkActivityApi;
        this.A0O = C5G.A01(audienceNetworkActivity);
        this.A0O.A0G(this);
    }

    @Nullable
    private InterfaceC0762Ml A01(Intent intent) {
        InterfaceC0762Ml A02;
        InterfaceC0762Ml A05;
        InterfaceC0762Ml A04;
        InterfaceC0762Ml A06;
        InterfaceC0762Ml A09;
        InterfaceC0762Ml A07;
        InterfaceC0762Ml A08;
        InterfaceC0762Ml A0A;
        InterfaceC0762Ml A03;
        InterfaceC0762Ml A0C;
        InterfaceC0762Ml A0B;
        InterfaceC0762Ml A0D;
        AnonymousClass56 anonymousClass56 = new AnonymousClass56(this, intent, this.A0O.A08(), this.A0O);
        if (this.A08 == null) {
            return null;
        }
        switch (this.A08) {
            case A06:
                RelativeLayout relativeLayout = this.A06;
                if (A0R[6].length() != 15) {
                    throw new RuntimeException();
                }
                A0R[2] = "9AjKOltSNiH";
                A0D = anonymousClass56.A0D(relativeLayout);
                return A0D;
            case A0C:
                A0B = anonymousClass56.A0B();
                return A0B;
            case A0B:
                A0C = anonymousClass56.A0C();
                return A0C;
            case A02:
                A03 = anonymousClass56.A03();
                return A03;
            case A0A:
                A0A = anonymousClass56.A0A();
                return A0A;
            case A08:
                A08 = anonymousClass56.A08();
                return A08;
            case A07:
                A07 = anonymousClass56.A07();
                if (A0R[1].length() != 0) {
                    A0R[1] = "wwrXZHO6We2";
                    return A07;
                }
                A0R[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A07;
            case A09:
                A09 = anonymousClass56.A09();
                return A09;
            case A04:
                A06 = anonymousClass56.A06();
                if (A0R[2].length() != 25) {
                    A0R[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                    return A06;
                }
                throw new RuntimeException();
            case A03:
                A04 = anonymousClass56.A04();
                return A04;
            case A05:
                A05 = anonymousClass56.A05();
                if (A0R[7].charAt(27) != 'B') {
                    A0R[1] = "x";
                    return A05;
                }
                throw new RuntimeException();
            case A0D:
                A02 = anonymousClass56.A02();
                return A02;
            default:
                return null;
        }
    }

    private void A05() {
        String str = this.A0F;
        if (str != null) {
            this.A0C = C0829Pb.A01(this.A0O, str);
            if (this.A0C != null) {
                this.A06.addView(this.A0C, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A06() {
        if (!this.A0K) {
            if (A0G()) {
                A0D(Q2.A03.A02());
            } else {
                A0D(A04(139, 48, 47));
            }
            this.A0K = true;
        }
    }

    private void A08(Intent intent) {
        if (JQ.A0u(this.A0M)) {
            EnumC0717Kp enumC0717Kp = this.A08;
            EnumC0717Kp enumC0717Kp2 = EnumC0717Kp.A02;
            if (A0R[2].length() == 25) {
                throw new RuntimeException();
            }
            A0R[1] = "ROWUzhbvPevH2";
            if (enumC0717Kp != enumC0717Kp2 && Build.VERSION.SDK_INT >= 18) {
                this.A0B = new O8();
                this.A0B.A0C(intent.getStringExtra(A04(419, 11, 51)));
                this.A0B.A0B(this.A0M.getPackageName());
                long longExtra = intent.getLongExtra(A04(462, 11, FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD), 0L);
                if (longExtra != 0) {
                    this.A0B.A09(longExtra);
                }
                TextView textView = new TextView(this.A0M);
                textView.setText(A04(1, 5, 84));
                textView.setTextColor(-1);
                ML.A0M(textView, Color.argb((int) SyslogConstants.LOG_LOCAL4, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                AnonymousClass58 anonymousClass58 = new AnonymousClass58(this);
                textView.setOnLongClickListener(anonymousClass58);
                this.A06.setOnLongClickListener(anonymousClass58);
                this.A06.getOverlay().add(this.A0B);
            }
        }
    }

    private void A09(Intent intent, @Nullable Bundle bundle) {
        String A04 = A04(520, 8, 117);
        String A042 = A04(AdRequest.MAX_CONTENT_URL_LENGTH, 8, 85);
        String A043 = A04(438, 24, SyslogConstants.LOG_CLOCK);
        if (bundle != null) {
            Bundle adnwSavedStateBundle = LL.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = adnwSavedStateBundle.getInt(A043, -1);
            this.A0D = adnwSavedStateBundle.getString(A042);
            this.A08 = (EnumC0717Kp) adnwSavedStateBundle.getSerializable(A04);
            return;
        }
        this.A01 = intent.getIntExtra(A043, -1);
        this.A0D = intent.getStringExtra(A042);
        this.A08 = (EnumC0717Kp) intent.getSerializableExtra(A04);
        this.A02 = intent.getIntExtra(A04(482, 16, 74), 0) * 1000;
        this.A0J = intent.getBooleanExtra(A04(473, 9, 23), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
        if (r3.equals(r6) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0D(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 345(0x159, float:4.83E-43)
            r1 = 47
            r0 = 100
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.Q2 r0 = com.facebook.ads.redexgen.X.Q2.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0I = r4
        L1f:
            r2 = 265(0x109, float:3.71E-43)
            r1 = 35
            r0 = 23
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.Q2 r0 = com.facebook.ads.redexgen.X.Q2.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0H = r4
        L5c:
            r2 = 86
            r1 = 53
            r0 = 2
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L71
            r0 = 9
            r5.finish(r0)
            return
        L71:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 45
            r0 = 62
            java.lang.String r0 = A04(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L87
            r0 = 10
            r5.finish(r0)
            return
        L87:
            r0 = 0
            r5.A0F(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.A0D(java.lang.String):void");
    }

    public void A0E(String str, C1U c1u) {
        if (this.A09 == null) {
            return;
        }
        if (this.A0A == null) {
            C1046Xo c1046Xo = this.A0O;
            this.A0A = NI.A02(c1046Xo, c1046Xo.A08(), str, c1u, this.A09, new C1215bh(this));
            this.A0A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        ML.A0J(this.A0A);
        ML.A0T(this.A06);
        this.A06.addView(this.A0A);
        this.A0A.A0K();
    }

    public void A0F(String str, @Nullable C04409a c04409a) {
        Intent intent = new Intent(str + A04(0, 1, 50) + this.A0D);
        if (c04409a != null) {
            intent.putExtra(A04(392, 5, 121), c04409a);
        }
        C2T.A00(this.A0M).A07(intent);
    }

    private boolean A0G() {
        return this.A08 == EnumC0717Kp.A0C || this.A08 == EnumC0717Kp.A0B || this.A08 == EnumC0717Kp.A05 || this.A08 == EnumC0717Kp.A0D;
    }

    public final AudienceNetworkActivity A0H() {
        return this.A0M;
    }

    public final C1046Xo A0I() {
        return this.A0O;
    }

    @VisibleForTesting
    public final void A0J() {
        if (A0G()) {
            A0D(Q2.A09.A02());
        } else {
            A0D(A04(265, 35, 23));
        }
    }

    public final void A0K(AnonymousClass57 anonymousClass57) {
        this.A0P.add(anonymousClass57);
    }

    public final void A0L(AnonymousClass57 anonymousClass57) {
        this.A0P.remove(anonymousClass57);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i2) {
        this.A0O.A0D().A2Q(String.valueOf(A0H().hashCode()), i2);
        if (this.A0M.isFinishing()) {
            return;
        }
        if (JQ.A1D(this.A0O) && !this.A0I && !this.A0H) {
            this.A0O.A0D().A9g();
            A0J();
        }
        if (A0G() && !this.A0G) {
            A0D(Q2.A05.A02());
        } else {
            A0D(A04(187, 39, 14));
        }
        A06();
        this.A0N.finish(i2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i2, int i3, Intent intent) {
        InterfaceC0762Ml interfaceC0762Ml = this.A09;
        if (interfaceC0762Ml != null && interfaceC0762Ml.onActivityResult(i2, i3, intent)) {
            return;
        }
        T4.A09(i2, i3, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        this.A03 += currentTimeMillis - this.A04;
        this.A04 = currentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            for (AnonymousClass57 anonymousClass57 : this.A0P) {
                if (anonymousClass57.A8M()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0N.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i2 = configuration.orientation;
            String A04 = A04(498, 14, 17);
            if (i2 == 1) {
                hashMap.put(A04, A04(430, 8, 26));
            } else {
                hashMap.put(A04, A04(397, 9, 86));
            }
            this.A07.A02(EnumC0691Jn.A0K, hashMap);
            this.A00 = configuration.orientation;
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(@Nullable Bundle bundle) {
        MN.A02();
        if (JQ.A1R(this.A0M)) {
            Window window = this.A0M.getWindow();
            String[] strArr = A0R;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0R[6] = "7njofUp2AYjKONZ";
            window.setFlags(16777216, 16777216);
        }
        this.A05 = LL.A01(this.A0M.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C1046Xo A03 = LL.A03(this.A05);
        if (A03 != null) {
            this.A0O.A0E(A03.A0D());
            this.A0O.A0B(A03.A0A());
        }
        this.A0O.A0D().A2R(String.valueOf(A0H().hashCode()));
        this.A0M.requestWindowFeature(1);
        this.A0M.getWindow().setFlags(1024, 1024);
        this.A06 = new RelativeLayout(this.A0M);
        ML.A0M(this.A06, 0);
        this.A0M.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        A09(this.A05, bundle);
        this.A09 = A01(this.A05);
        InterfaceC0762Ml interfaceC0762Ml = this.A09;
        if (interfaceC0762Ml == null) {
            this.A0O.A06().A8y(A04(64, 11, 24), C04398z.A02, new AnonymousClass90(A04(6, 58, 115)));
            A0J();
            finish(7);
            return;
        }
        interfaceC0762Ml.A8n(this.A05, bundle, this);
        A0D(A04(226, 39, 61));
        this.A04 = System.currentTimeMillis();
        this.A0F = this.A05.getStringExtra(A04(406, 13, 105));
        A05();
        A08(this.A05);
        this.A00 = this.A0M.getResources().getConfiguration().orientation;
        String A04 = A04(75, 11, 36);
        if (bundle != null) {
            this.A0E = bundle.getString(A04);
        } else {
            this.A0E = this.A05.getStringExtra(A04);
        }
        this.A07 = new C0692Jo(this.A0E, this.A0O.A08());
        if (this.A0J && !this.A0M.isFinishing()) {
            this.A0O.A0D().AEB();
        }
        if (JQ.A1Z(this.A0M) && this.A0M.getWindow() != null) {
            AudienceNetworkActivity audienceNetworkActivity = this.A0M;
            if (A0R[1].length() == 0) {
                throw new RuntimeException();
            }
            A0R[6] = "jwNFZ7FrJR3EZkY";
            audienceNetworkActivity.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0060, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0068, code lost:
        if (com.facebook.ads.redexgen.X.JQ.A0u(r4.A0M) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006a, code lost:
        r4.A0B.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006f, code lost:
        r3 = r4.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007c, code lost:
        if (com.facebook.ads.redexgen.X.AnonymousClass59.A0R[2].length() == 25) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
        r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R;
        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";
        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008c, code lost:
        r3.A0J();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0090, code lost:
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
        return;
     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.Xo r0 = r4.A0O
            com.facebook.ads.redexgen.X.0R r1 = r0.A0D()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0H()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A2S(r0)
            r4.A06()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            com.facebook.ads.redexgen.X.Ml r0 = r4.A09
            if (r0 == 0) goto L4a
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A09 = r0
        L4a:
            com.facebook.ads.redexgen.X.O8 r3 = r4.A0B
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            if (r3 == 0) goto L6f
        L62:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0M
            boolean r0 = com.facebook.ads.redexgen.X.JQ.A0u(r0)
            if (r0 == 0) goto L6f
            com.facebook.ads.redexgen.X.O8 r0 = r4.A0B
            r0.A07()
        L6f:
            com.facebook.ads.redexgen.X.NH r3 = r4.A0A
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L8f
        L8c:
            r3.A0J()
        L8f:
            return
        L90:
            if (r3 == 0) goto L8f
            goto L8c
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AnonymousClass59.A0R
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L6f
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass59.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0O.A0D().A2T(String.valueOf(A0H().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC0762Ml interfaceC0762Ml = this.A09;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml.ABg(false);
            if (!this.A0M.isFinishing()) {
                this.A07.A02(EnumC0691Jn.A0E, null);
                this.A0L = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0O.A0D().A2U(String.valueOf(A0H().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC0762Ml interfaceC0762Ml = this.A09;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml.AC5(false);
            if (this.A0L) {
                this.A07.A02(EnumC0691Jn.A0F, null);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC0762Ml interfaceC0762Ml = this.A09;
        if (interfaceC0762Ml != null) {
            interfaceC0762Ml.AEN(bundle2);
        }
        bundle2.putInt(A04(438, 24, SyslogConstants.LOG_CLOCK), this.A01);
        bundle2.putString(A04(AdRequest.MAX_CONTENT_URL_LENGTH, 8, 85), this.A0D);
        bundle2.putString(A04(75, 11, 36), this.A0E);
        bundle2.putSerializable(A04(520, 8, 117), this.A08);
        LL.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0O.A0D().A2V(String.valueOf(A0H().hashCode()));
        int i2 = this.A01;
        if (i2 != -1) {
            C0756Mf.A02(this.A0M, i2, this.A0O);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0O.A0D().A2W(String.valueOf(A0H().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AnonymousClass68.A02(null, motionEvent);
        return this.A0N.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0J();
        finish(5);
    }
}
