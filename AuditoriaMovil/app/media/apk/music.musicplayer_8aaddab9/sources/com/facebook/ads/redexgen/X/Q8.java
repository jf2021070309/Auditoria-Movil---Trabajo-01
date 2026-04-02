package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* loaded from: assets/audience_network.dex */
public class Q8 extends RelativeLayout implements InterfaceC0867Qn, InterfaceC0846Ps, InterfaceC0865Ql {
    public static byte[] A0D;
    public static String[] A0E = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", "e8"};
    public static final C0776Mz A0F;
    public static final C0731Le A0G;
    public static final L3 A0H;
    public static final C0718Kq A0I;
    public static final C0716Ko A0J;
    public static final C0705Kb A0K;
    public static final KZ A0L;
    public static final KY A0M;
    public int A00;
    public C0692Jo A01;
    public C0850Pw A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Handler A06;
    public final Handler A07;
    public final View.OnTouchListener A08;
    public final C1046Xo A09;
    public final C04419b<AbstractC04429c, C04409a> A0A;
    public final List<Q0> A0B;
    public final InterfaceC0864Qk A0C;

    public static String A0F(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0E[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0D = bArr;
    }

    static {
        A0I();
        A0H = new L3();
        A0F = new C0776Mz();
        A0I = new C0718Kq();
        A0J = new C0716Ko();
        A0G = new C0731Le();
        A0K = new C0705Kb();
        A0M = new KY();
        A0L = new KZ();
    }

    public Q8(C1046Xo c1046Xo) {
        super(c1046Xo);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C04419b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0845Pr(this);
        this.A09 = c1046Xo;
        if (A0S(c1046Xo)) {
            this.A0C = new I0(c1046Xo);
        } else {
            this.A0C = new TextureView$SurfaceTextureListenerC0649Hx(c1046Xo);
        }
        A0G();
    }

    public Q8(C1046Xo c1046Xo, AttributeSet attributeSet) {
        super(c1046Xo, attributeSet);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C04419b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0845Pr(this);
        this.A09 = c1046Xo;
        if (A0S(c1046Xo)) {
            this.A0C = new I0(c1046Xo, attributeSet);
        } else {
            this.A0C = new TextureView$SurfaceTextureListenerC0649Hx(c1046Xo, attributeSet);
        }
        A0G();
    }

    public Q8(C1046Xo c1046Xo, AttributeSet attributeSet, int i2) {
        super(c1046Xo, attributeSet, i2);
        this.A0B = new ArrayList();
        this.A06 = new Handler();
        this.A07 = new Handler();
        this.A0A = new C04419b<>();
        this.A05 = true;
        this.A00 = 200;
        this.A08 = new View$OnTouchListenerC0845Pr(this);
        this.A09 = c1046Xo;
        if (A0S(c1046Xo)) {
            this.A0C = new I0(c1046Xo, attributeSet, i2);
        } else {
            this.A0C = new TextureView$SurfaceTextureListenerC0649Hx(c1046Xo, attributeSet, i2);
        }
        A0G();
    }

    public static /* synthetic */ L3 A0C() {
        L3 l3 = A0H;
        if (A0E[0].length() != 31) {
            throw new RuntimeException();
        }
        A0E[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return l3;
    }

    private void A0G() {
        this.A09.A0D().A2p();
        this.A0C.setRequestedVolume(1.0f);
        this.A0C.setVideoStateChangeListener(this);
        this.A02 = new C0850Pw(this.A09, this.A0C);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A08);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A06.postDelayed(new C0872Qs(this), this.A00);
    }

    private final void A0J() {
        for (Q0 plugin : this.A0B) {
            if (plugin instanceof N9) {
                A0Q((N9) plugin);
            }
            plugin.A8o(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i2) {
        if (JQ.A0p(this.A09)) {
            C1046Xo c1046Xo = this.A09;
            Toast.makeText(c1046Xo, A0F(21, 13, 124) + (i2 / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC0691Jn enumC0691Jn) {
        C0692Jo c0692Jo = this.A01;
        if (c0692Jo == null) {
            return;
        }
        c0692Jo.A02(enumC0691Jn, null);
    }

    private void A0P(Q0 q0) {
        if (q0 instanceof N9) {
            A0R((N9) q0);
        }
        q0.AFL(this);
    }

    private void A0Q(N9 n9) {
        if (n9.getParent() == null) {
            if (n9 instanceof C04087m) {
                this.A02.A00(n9);
            } else {
                addView(n9);
            }
        }
    }

    private void A0R(N9 n9) {
        if (n9 instanceof C04087m) {
            this.A02.A01(n9);
        } else {
            ML.A0J(n9);
        }
    }

    private boolean A0S(C1046Xo c1046Xo) {
        return JQ.A21(c1046Xo, QZ.A03());
    }

    public final void A0V() {
        this.A0C.setVideoStateChangeListener(null);
        this.A0C.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0C.A7t();
    }

    public final void A0X() {
        Iterator<Q0> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0E[0].length() != 31) {
                throw new RuntimeException();
            }
            A0E[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                Q0 plugin = it.next();
                A0P(plugin);
            } else {
                this.A0B.clear();
                String[] strArr = A0E;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0E;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i2) {
        this.A06.removeCallbacksAndMessages(null);
        this.A0C.seekTo(i2);
    }

    public final void A0Z(int i2) {
        this.A0C.AF8(i2);
    }

    public final void A0a(EnumC0848Pu enumC0848Pu) {
        this.A07.post(new QD(this));
        this.A0C.AEw(enumC0848Pu.A02());
    }

    public final void A0b(EnumC0853Pz enumC0853Pz, int i2) {
        if (this.A03 && this.A0C.getState() == EnumC0866Qm.A06) {
            this.A03 = false;
        }
        this.A0C.AF1(enumC0853Pz, i2);
    }

    public final void A0c(Q0 q0) {
        this.A0B.add(q0);
    }

    public final void A0d(Q0 q0) {
        this.A0B.remove(q0);
        A0P(q0);
    }

    public final void A0e(boolean z, int i2) {
        if (A0i()) {
            return;
        }
        this.A0C.AD2(z, i2);
    }

    public final void A0f(boolean z, boolean z2, int i2) {
        this.A05 = z2;
        A0e(z, i2);
    }

    public final boolean A0g() {
        return this.A0C.A85();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == EnumC0866Qm.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0C.A8b();
    }

    public final boolean A0k() {
        return getState() == EnumC0866Qm.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public final boolean A8T() {
        return A0S(this.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public final boolean A8W() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Qn
    public final void ABO() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Qn
    public final void ABP() {
        A0b(EnumC0853Pz.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Qn
    public final void ACD(int i2, int i3) {
        this.A07.post(new QF(this, i2, i3));
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0867Qn
    public final void ACp(EnumC0866Qm enumC0866Qm) {
        this.A07.post(new QG(this, enumC0866Qm, getCurrentPositionInMillis(), getDuration()));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public int getCurrentPositionInMillis() {
        return this.A0C.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0C.getDuration();
    }

    @NonNull
    public C04419b<AbstractC04429c, C04409a> getEventBus() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public long getInitialBufferTime() {
        return this.A0C.getInitialBufferTime();
    }

    public EnumC0866Qm getState() {
        return this.A0C.getState();
    }

    public Handler getStateHandler() {
        return this.A07;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0C;
    }

    public int getVideoHeight() {
        return this.A0C.getVideoHeight();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public EnumC0853Pz getVideoStartReason() {
        return this.A0C.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0C.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0846Ps
    public float getVolume() {
        return this.A0C.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0A.A02(A0L);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0A.A02(A0M);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        InterfaceC0864Qk interfaceC0864Qk = this.A0C;
        if (interfaceC0864Qk != null) {
            interfaceC0864Qk.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0692Jo c0692Jo) {
        this.A01 = c0692Jo;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0C.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(@Nullable String str) {
        this.A0C.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i2) {
        this.A00 = i2;
    }

    public void setVideoURI(@Nullable Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0C.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(@Nullable String str) {
        this.A09.A0D().A2w(str);
        setVideoURI(str != null ? Uri.parse(str) : null);
    }

    public void setVolume(float f2) {
        if (f2 == 1.0f) {
            A0L(EnumC0691Jn.A0d);
            this.A09.A0D().A30();
        } else {
            A0L(EnumC0691Jn.A0c);
            this.A09.A0D().A2z();
        }
        this.A0C.setRequestedVolume(f2);
        C04419b<AbstractC04429c, C04409a> eventBus = getEventBus();
        if (A0E[2].length() == 19) {
            throw new RuntimeException();
        }
        A0E[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0K);
    }
}
