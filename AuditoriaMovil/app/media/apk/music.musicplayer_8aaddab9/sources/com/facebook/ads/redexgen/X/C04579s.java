package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.9s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04579s extends FrameLayout implements InterfaceC0762Ml, SM {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public AnonymousClass57 A00;
    @Nullable
    public AnonymousClass59 A01;
    @Nullable
    public PE A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass18 A06;
    public final C1046Xo A07;
    public final InterfaceC0684Jg A08;
    public final C0692Jo A09;
    public final M8 A0A;
    public final MD A0B;
    public final InterfaceC0761Mk A0C;
    public final NC A0D;
    @Nullable
    public final C0825Ow A0E;
    public final P4 A0F;
    @DoNotStrip
    public final AbstractC0868Qo A0G;
    public final C0869Qp A0H;

    public static String A0B(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7};
    }

    static {
        A0D();
    }

    public C04579s(C1046Xo c1046Xo, InterfaceC0684Jg interfaceC0684Jg, InterfaceC0761Mk interfaceC0761Mk, AnonymousClass18 anonymousClass18, NC nc, @DynamicWebViewController$AdFormatType int i2) {
        super(c1046Xo);
        this.A00 = new SZ(this);
        this.A0G = new SY(this);
        this.A03 = true;
        this.A07 = c1046Xo;
        this.A08 = interfaceC0684Jg;
        this.A0C = interfaceC0761Mk;
        this.A06 = anonymousClass18;
        this.A0D = nc;
        P4 A02 = P5.A02(anonymousClass18.A0Y());
        if (A02 == null) {
            this.A0F = new P4(this.A07, anonymousClass18, interfaceC0684Jg, i2);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        this.A09 = this.A0F.A0K();
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new SX(this));
        ML.A0G(1003, this.A0F.A0O());
        if (this.A06.A0o()) {
            C1046Xo c1046Xo2 = this.A07;
            this.A0E = new C0825Ow(c1046Xo2, this.A08, this.A06, new C7U(c1046Xo2), this.A09, this.A0C, this.A0D, new SW(this));
            this.A0E.A0N();
            this.A0F.A0O().setOnTouchListener(new View$OnTouchListenerC0821Os(this));
            addView(this.A0E, new FrameLayout.LayoutParams(-1, -1));
        } else {
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        this.A0H = new C0869Qp(mediaView, 1, new WeakReference(this.A0G), this.A07);
        this.A0H.A0W(this.A06.A0H());
        this.A0H.A0X(this.A06.A0I());
        this.A0F.A0e(this.A0H);
        this.A0A = new M8(this);
        this.A0A.A05(M7.A03);
        setBackgroundColor(0);
        if (JQ.A1F(c1046Xo)) {
            c1046Xo.A09().AFV(mediaView, anonymousClass18.A0T(), false, false, true);
        }
        if (anonymousClass18.A0q()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(A0B(26, 10, 122), true);
                this.A0F.A0j(jSONObject);
            } catch (JSONException unused) {
                P4 preloadedDynamicWebViewController = this.A0F;
                preloadedDynamicWebViewController.A0M().A04(C04398z.A0w, A0B(0, 26, 58));
            }
        }
    }

    private void A0C() {
        PL A0B = new PJ(this.A07, this.A06.A0N().A0E(), this.A06.A0Q()).A08(this.A06.A0M().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new SU(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0D().A4v();
            this.A0F.A0X();
        } else {
            this.A07.A0D().A4w();
            if (this.A0F.A0k()) {
                AF7();
                C1046Xo c1046Xo = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (JQ.A1F(c1046Xo)) {
                    this.A07.A09().AAR();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3H(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0p()) {
            this.A0A.A05(M7.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new OH(this.A07, this.A0D.A63(), this.A0H, this.A0B, this.A08, this.A0C).A08(this.A06.A0T(), str, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A7v() {
        A0F(this.A06.A0N().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A7w(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A80() {
        this.A0C.A3r(this.A0D.A5Z());
        new C0839Pl(this.A07, this.A0D, this.A06.A0Z(), this.A0C).A05();
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A81(String str) {
        PE pe = this.A02;
        if (pe != null) {
            pe.A81(str);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new SV(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void A8n(Intent intent, @Nullable Bundle bundle, AnonymousClass59 anonymousClass59) {
        P4.A0B().incrementAndGet();
        anonymousClass59.A0K(this.A00);
        this.A01 = anonymousClass59;
        A0E();
        if (this.A06.A0N().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AAo() {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AAs() {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ABW(boolean z) {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void ABg(boolean z) {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AC5(boolean z) {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0T(z);
        }
        boolean z2 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z2) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACH() {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACk(boolean z) {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACm(boolean z) {
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void ACz(String str) {
        String A0a = this.A06.A0a(str);
        if (A0a == null) {
            return;
        }
        LV.A0A(new LV(), this.A07, Uri.parse(A0a), this.A06.A0T());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void AEN(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void AF7() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.SM
    public final void close() {
        AnonymousClass59 anonymousClass59 = this.A01;
        if (anonymousClass59 == null) {
            return;
        }
        anonymousClass59.finish(4);
    }

    private ViewGroup getMediaView() {
        C0825Ow c0825Ow = this.A0E;
        return c0825Ow != null ? c0825Ow : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final boolean onActivityResult(int i2, int i3, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0762Ml
    public final void onDestroy() {
        if (JQ.A1F(this.A07)) {
            this.A07.A09().AFK(getMediaView());
        }
        C0825Ow c0825Ow = this.A0E;
        if (c0825Ow != null) {
            c0825Ow.A0O();
        }
        this.A0A.A03();
        this.A08.A8v(this.A06.A0T(), new OA().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        P5.A04(this.A06.A0Y());
        P4.A0B().decrementAndGet();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0761Mk interfaceC0761Mk) {
    }

    public void setRtfActionsJavascriptListener(PE pe) {
        this.A02 = pe;
    }
}
