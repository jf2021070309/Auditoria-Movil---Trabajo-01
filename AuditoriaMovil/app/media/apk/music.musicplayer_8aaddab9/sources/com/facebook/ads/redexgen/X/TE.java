package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"ViewConstructor"})
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class TE extends RelativeLayout implements InterfaceC0762Ml {
    public static byte[] A0W;
    public static String[] A0X = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0Y;
    public static final int A0Z;
    public static final int A0a;
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final RelativeLayout.LayoutParams A0h;
    @Nullable
    public View A00;
    @Nullable
    public RelativeLayout A01;
    @Nullable
    public RelativeLayout A02;
    public Toast A03;
    @Nullable
    public AnonymousClass59 A04;
    @Nullable
    public View$OnClickListenerC0923Sr A05;
    public C0833Pf A06;
    public C0839Pl A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass18 A0D;
    public final C1W A0E;
    public final AnonymousClass57 A0F;
    public final C1046Xo A0G;
    public final InterfaceC0684Jg A0H;
    public final C0692Jo A0I;
    public final C0733Lg A0J;
    public final M8 A0K;
    public final InterfaceC0761Mk A0L;
    public final NC A0M;
    public final ON A0N;
    public final OO A0O;
    public final C0838Pk A0P;
    public final AtomicBoolean A0Q;
    public final AtomicBoolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    @VisibleForTesting
    public final AbstractC0760Mj A0V;

    public static String A0E(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0W, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0W = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -71, -66, -60, -75, -62, -61, -60, -71, -60, -71, -79, -68, -6, -19, 0, -11, 2, -15, -21, -17, -8, -11, -17, -9, -53, -57, -68, -66, -64, -56, -64, -55, -49, -41, -54, -36, -58, -41, -55, -54, -55, -60, -37, -50, -55, -54, -44, -60, -78, -81, -61, -74, -78, -60, -84, -80, -71, -74, -80, -72};
    }

    static {
        A0P();
        A0f = (int) (C0739Lm.A00 * 64.0f);
        A0a = (int) (C0739Lm.A00 * 16.0f);
        A0g = (int) (C0739Lm.A00 * 12.0f);
        A0Y = (int) (C0739Lm.A00 * 10.0f);
        A0h = new RelativeLayout.LayoutParams(-1, -1);
        A0b = (int) (C0739Lm.A00 * 48.0f);
        A0c = (int) (C0739Lm.A00 * 16.0f);
        A0e = (int) (C0739Lm.A00 * 14.0f);
        A0d = C2U.A01(-1, 77);
        A0Z = (int) (C0739Lm.A00 * 8.0f);
    }

    public TE(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, AnonymousClass18 anonymousClass18, @Nullable String str, NC nc) {
        super(c1046Xo);
        int A07;
        this.A0F = new TL(this);
        this.A0R = new AtomicBoolean(false);
        this.A0Q = new AtomicBoolean(false);
        this.A0A = false;
        this.A0C = true;
        this.A0G = c1046Xo;
        this.A0L = interfaceC0761Mk;
        this.A0H = interfaceC0684Jg;
        this.A0D = anonymousClass18;
        this.A0E = anonymousClass18.A0N().A0D().A06();
        this.A0I = new C0692Jo(this.A0D.A0T(), this.A0H);
        this.A0M = nc;
        this.A07 = new C0839Pl(c1046Xo, this.A0M, str, this.A0L);
        this.A09 = this.A0D.A0N().A0M() && this.A0D.A0N().A0D().A02() > 0;
        this.A0U = this.A0D.A0N().A0D().A0A();
        if (this.A0E == null) {
            this.A0L.A3r(this.A0M.A6Y());
            this.A0L.A3r(this.A0M.A6T());
        }
        if (this.A09 && this.A0U) {
            A07 = this.A0D.A0N().A0D().A02();
        } else {
            A07 = this.A0E.A07();
        }
        this.A0R.set(!this.A0E.A0I());
        this.A0J = new C0733Lg(A07, new TG(this, null));
        this.A0T = JQ.A1x(this.A0G);
        this.A0S = JQ.A0i(this.A0G);
        this.A0V = A06();
        this.A0P = new C0838Pk(this.A0G, this.A0H, this.A0D);
        if (!this.A0T) {
            ML.A0M(this, -14473425);
        } else {
            OX.A00(c1046Xo, this, anonymousClass18.A0N().A0D().A07());
        }
        this.A0K = new M8(this);
        this.A0K.A05(M7.A03);
        if (JQ.A1S(this.A0G)) {
            this.A0V.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(44, 9, 51), this.A0M.A7B());
        this.A06 = new C0833Pf(this.A0G, this.A0D, this.A0E, this.A0H, new TF(this, null), hashMap);
        A0L();
        this.A0L.A3H(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        this.A0N = new TK(this);
        this.A0O = new OO(this.A0G, this.A0V, this.A0D, (Q8) null, this.A0L, this.A0N, this.A05, this.A01, this.A06);
    }

    private AbstractC0760Mj A06() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0G, this.A0L, this.A0I, 0, this.A0D.A0F());
        fullScreenAdToolbar.A04(this.A0D.A0M().A01(), true);
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0D.A0Q(), this.A0D.A0T(), this.A0E.A07(), this.A0D.A0R());
        fullScreenAdToolbar.setToolbarListener(new TI(this));
        return fullScreenAdToolbar;
    }

    @Nullable
    private View$OnClickListenerC0923Sr A09() {
        C0833Pf c0833Pf = this.A06;
        if (c0833Pf == null || c0833Pf.getViewabilityChecker() == null || this.A06.getTouchDataRecorder() == null) {
            return null;
        }
        View$OnClickListenerC0923Sr view$OnClickListenerC0923Sr = new View$OnClickListenerC0923Sr(this.A0G, this.A0M.A63(), this.A0D.A0M().A01(), this.A0H, this.A0L, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder());
        ML.A0K(view$OnClickListenerC0923Sr);
        view$OnClickListenerC0923Sr.setText(this.A0D.A0N().A0F().A04());
        view$OnClickListenerC0923Sr.setTextSize(14.0f);
        view$OnClickListenerC0923Sr.setIncludeFontPadding(false);
        int i2 = A0Y;
        view$OnClickListenerC0923Sr.setPadding(i2, i2, i2, i2);
        if (!this.A0T) {
            ML.A0N(view$OnClickListenerC0923Sr, 8);
        }
        view$OnClickListenerC0923Sr.setOnClickListener(new View$OnClickListenerC0772Mv(this));
        return view$OnClickListenerC0923Sr;
    }

    private OW A0C() {
        OW ow = new OW(this.A0G, this.A0D.A0M().A01(), true, 16, 14, 0);
        ow.A01(this.A0D.A0N().A0E().A06(), this.A0D.A0N().A0E().A05(), null, false, true);
        TextView descriptionTextView = ow.getDescriptionTextView();
        descriptionTextView.setAlpha(0.8f);
        descriptionTextView.setMaxLines(1);
        descriptionTextView.setEllipsize(TextUtils.TruncateAt.END);
        TextView titleTextView = ow.getTitleTextView();
        titleTextView.setMaxLines(1);
        titleTextView.setEllipsize(TextUtils.TruncateAt.END);
        return ow;
    }

    private void A0H() {
        int i2 = A0b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        OQ oq = new OQ(this.A0G);
        ML.A0M(oq, 0);
        ML.A0K(oq);
        AsyncTaskC0925St asyncTaskC0925St = new AsyncTaskC0925St(oq, this.A0G);
        int i3 = A0b;
        asyncTaskC0925St.A05(i3, i3).A07(this.A0D.A0Q().A01());
        TextView ratingCountView = new TextView(this.A0G);
        ML.A0K(ratingCountView);
        ratingCountView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ratingCountView.setTextColor(this.A0D.A0M().A01().A06(true));
        ratingCountView.setText(this.A0D.A0N().A0E().A06());
        ratingCountView.setTextSize(16.0f);
        ratingCountView.setMaxLines(1);
        ratingCountView.setEllipsize(TextUtils.TruncateAt.END);
        OS os = new OS(this.A0G, A0e, 5, A0d, -1);
        os.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView = new TextView(this.A0G);
        textView.setTextColor(this.A0D.A0M().A01().A06(true));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams3.leftMargin = A0Z;
        LinearLayout linearLayout = new LinearLayout(this.A0G);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, A0c);
        layoutParams4.topMargin = A0Z / 2;
        layoutParams4.addRule(3, ratingCountView.getId());
        linearLayout.addView(os, layoutParams2);
        linearLayout.addView(textView, layoutParams3);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = A0Z;
        layoutParams5.addRule(1, oq.getId());
        layoutParams5.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams4);
        relativeLayout.addView(ratingCountView);
        RelativeLayout titleAndRatingContainer = this.A02;
        if (titleAndRatingContainer != null) {
            titleAndRatingContainer.removeAllViews();
            RelativeLayout relativeLayout2 = this.A02;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            A0X[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout2.addView(relativeLayout, layoutParams5);
            this.A02.addView(oq, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0D.A0N().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        os.setRating(Float.parseFloat(this.A0D.A0N().A0E().A03()));
        if (this.A0D.A0N().A0E().A02() == null) {
            return;
        }
        textView.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0D.A0N().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0E.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0K.A05(M7.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0B = true;
        if (this.A0D.A0N().A0M()) {
            this.A07.A05();
            this.A0L.A3s(this.A0M.A5Z(), new AnonymousClass86(0, 0));
            if (this.A08) {
                boolean z = this.A0T;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0X;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    OH.A03(this.A0G, this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0D.A0N().A0F(), this.A0D.A0T());
                }
            }
        }
    }

    private void A0K() {
        PL A0B = new PJ(this.A0G, this.A0D.A0N().A0E(), this.A0D.A0Q()).A08(this.A0D.A0M().A01()).A0A(this.A0E.A0G()).A09(this.A0E.A0D()).A07(2000).A0B();
        C0694Jq.A04(A0B, this.A0I, EnumC0691Jn.A0U);
        addView(A0B, A0h);
        A0B.A04(new TJ(this));
    }

    private void A0L() {
        this.A05 = A09();
        this.A01 = new RelativeLayout(getContext());
        ML.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = A0a;
        int i3 = A0g;
        layoutParams.setMargins(i2, i3, i2, i3);
        layoutParams.addRule(12);
        this.A02 = new RelativeLayout(getContext());
        ML.A0K(this.A02);
        if (this.A0S) {
            A0H();
        } else {
            RelativeLayout relativeLayout = this.A02;
            OW A0C = A0C();
            RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout.addView(A0C, adWebViewParams);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, A0a, 0);
        this.A01.addView(this.A02, layoutParams2);
        View$OnClickListenerC0923Sr view$OnClickListenerC0923Sr = this.A05;
        if (view$OnClickListenerC0923Sr != null) {
            layoutParams2.addRule(0, view$OnClickListenerC0923Sr.getId());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(11);
            layoutParams3.addRule(6, this.A02.getId());
            layoutParams3.addRule(8, this.A02.getId());
            this.A01.addView(this.A05, layoutParams3);
        }
        ML.A0K(this.A0V);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(10);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        int i4 = A0a;
        layoutParams5.setMargins(i4, 0, i4, 0);
        layoutParams5.addRule(3, this.A0V.getId());
        layoutParams5.addRule(2, this.A01.getId());
        this.A0V.setVisibility(4);
        this.A06.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0V, layoutParams4);
        addView(this.A06, layoutParams5);
        addView(this.A01, layoutParams);
        if (this.A0E.A0J()) {
            this.A06.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C0692Jo(this.A0D.A0T(), this.A0H).A02(EnumC0691Jn.A0p, null);
        this.A0Q.set(true);
        ML.A0T(this);
        ML.A0H(this.A06);
        ML.A0Z(this.A0O, this.A00, this.A06);
        ML.A0L(this.A0V);
        ML.A0L(this.A05);
        Pair<EnumC0837Pj, View> A03 = this.A0P.A03(this.A05);
        this.A00 = (View) A03.second;
        int i2 = C0773Mw.A00[((EnumC0837Pj) A03.first).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            RelativeLayout relativeLayout = this.A01;
            if (relativeLayout != null) {
                ML.A0Z(relativeLayout);
            }
            RelativeLayout.LayoutParams infoParams = new RelativeLayout.LayoutParams(-1, -1);
            addView(this.A00, infoParams);
            return;
        }
        RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
        screenshotParams.setMargins(0, this.A0V.getToolbarHeight(), 0, 0);
        ML.A0L(this.A01);
        RelativeLayout relativeLayout2 = this.A01;
        if (relativeLayout2 != null) {
            screenshotParams.addRule(2, relativeLayout2.getId());
        }
        addView(this.A00, screenshotParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        ML.A0T(this);
        if (!this.A0E.A0J()) {
            C0833Pf c0833Pf = this.A06;
            if (A0X[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0X;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            c0833Pf.A0B();
        }
        this.A0V.setVisibility(0);
        this.A06.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        this.A0J.A07();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0E.A0C(), 1);
        A0Q((int) this.A0J.A03());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i2) {
        ML.A0Y(this.A03, this.A0E.A0C().replace(A0E(2, 6, 31), String.valueOf(i2)), 49, 0, A0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(8, 12, 121), z ? A0E(67, 13, 37) : A0E(32, 12, 100));
        OH oh = new OH(this.A0G, this.A0M.A63(), this.A06.getViewabilityChecker(), this.A06.getTouchDataRecorder(), this.A0H, this.A0L);
        if (this.A0T) {
            oh.A08(this.A0D.A0T(), this.A0D.A0N().A0F().A05(), hashMap);
            return;
        }
        boolean z2 = !this.A0J.A04();
        oh.A0A(!z2);
        oh.A08(this.A0D.A0T(), this.A0D.A0N().A0F().A05(), hashMap);
        if (z2) {
            new Handler(Looper.getMainLooper()).post(new TH(this));
        }
        this.A08 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0D.A0X().equals(A0E(53, 14, 61))) {
            if (this.A0D.A0X().equals(A0E(20, 12, 40))) {
                AnonymousClass18 anonymousClass18 = this.A0D;
                if (A0X[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0X[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (anonymousClass18.A0N().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0U && !this.A0A && !this.A0C && this.A0E.A07() < this.A0D.A0N().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, Bundle bundle, AnonymousClass59 anonymousClass59) {
        this.A04 = anonymousClass59;
        this.A04.A0K(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        this.A0J.A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        if (this.A0U && this.A0C) {
            return;
        }
        boolean z2 = this.A0A;
        if (A0X[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0X[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0R.get() && !this.A0J.A05()) {
            this.A0J.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        this.A0K.A03();
        AnonymousClass59 anonymousClass59 = this.A04;
        if (anonymousClass59 != null) {
            anonymousClass59.A0L(this.A0F);
        }
        if (this.A06 != null) {
            AnonymousClass18 anonymousClass18 = this.A0D;
            if (A0X[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0X[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(anonymousClass18.A0T())) {
                this.A0H.A8v(this.A0D.A0T(), new OA().A03(this.A06.getViewabilityChecker()).A02(this.A06.getTouchDataRecorder()).A05());
            }
            this.A06.A0C();
        }
        this.A0J.A06();
        this.A0V.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            AC5(false);
        } else {
            ABg(false);
        }
    }

    public void setListener(InterfaceC0761Mk interfaceC0761Mk) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0839Pl c0839Pl) {
        this.A07 = c0839Pl;
    }
}
