package com.kwad.components.core.widget;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.bn;
import com.kwad.sdk.widget.KSFrameLayout;
/* loaded from: classes.dex */
public final class a extends KSFrameLayout implements bn.a {
    private final View SN;
    private InterfaceC0223a XQ;
    private boolean XR;
    private boolean XS;
    private int XT;
    private boolean XU;
    private long XV;
    private boolean XW;
    private final float XX;
    private final int XY;
    private final bn gz;

    /* renamed from: com.kwad.components.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0223a {
        void aa();

        void ab();

        void eJ();

        void k(View view);
    }

    public a(Context context, View view) {
        super(context, view);
        this.gz = new bn(this);
        this.XT = 5;
        this.SN = view;
        setLayoutParams(new ViewGroup.LayoutParams(1, 1));
        float zG = com.kwad.sdk.core.config.d.zG();
        this.XX = zG;
        setVisiblePercent(zG);
        float zH = com.kwad.sdk.core.config.d.zH();
        this.XY = (int) ((zH < 0.0f ? 1.0f : zH) * 1000.0f);
    }

    private void sl() {
        InterfaceC0223a interfaceC0223a;
        if (this.XY == 0 && (interfaceC0223a = this.XQ) != null) {
            interfaceC0223a.k(this.SN);
            return;
        }
        Message obtainMessage = this.gz.obtainMessage();
        obtainMessage.what = 2;
        this.gz.sendMessageDelayed(obtainMessage, this.XY);
    }

    private void sm() {
        this.gz.removeCallbacksAndMessages(null);
        this.XS = false;
    }

    private void sn() {
        if (this.XS) {
            return;
        }
        this.XS = true;
        this.gz.sendEmptyMessage(1);
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (this.XR) {
            return;
        }
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (!bm.a(this.SN, (int) (this.XX * 100.0f), false)) {
                this.XT = 5;
                this.gz.sendEmptyMessage(1);
                return;
            }
            InterfaceC0223a interfaceC0223a = this.XQ;
            if (interfaceC0223a != null) {
                interfaceC0223a.k(this.SN);
                return;
            }
            return;
        }
        com.kwad.sdk.core.e.c.d("AdExposureView", "handleMsg MSG_CHECKING");
        if (!bm.a(this.SN, (int) (this.XX * 100.0f), false)) {
            InterfaceC0223a interfaceC0223a2 = this.XQ;
            if (interfaceC0223a2 != null && !this.XW) {
                interfaceC0223a2.eJ();
            }
            this.XW = true;
            bn bnVar = this.gz;
            int i2 = this.XT;
            this.XT = i2 - 1;
            bnVar.sendEmptyMessageDelayed(1, i2 <= 0 ? 500L : 100L);
            return;
        }
        sm();
        if (this.XU) {
            InterfaceC0223a interfaceC0223a3 = this.XQ;
            if (interfaceC0223a3 != null) {
                interfaceC0223a3.k(this.SN);
            }
        } else {
            this.XU = true;
            this.XV = System.currentTimeMillis();
            sl();
        }
        this.XW = false;
        bn bnVar2 = this.gz;
        int i3 = this.XT;
        this.XT = i3 - 1;
        bnVar2.sendEmptyMessageDelayed(1, i3 <= 0 ? 500L : 100L);
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void aa() {
        super.aa();
        this.XT = 5;
        this.XR = false;
        this.XU = false;
        sn();
        InterfaceC0223a interfaceC0223a = this.XQ;
        if (interfaceC0223a != null) {
            interfaceC0223a.aa();
        }
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout
    public final void ab() {
        super.ab();
        sm();
        this.XT = 0;
        this.XV = 0L;
        this.XR = true;
        InterfaceC0223a interfaceC0223a = this.XQ;
        if (interfaceC0223a != null) {
            interfaceC0223a.ab();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.kwad.sdk.core.e.c.d("AdExposureView", "onWindowFocusChanged hasWindowFocus:" + z);
    }

    public final void setViewCallback(InterfaceC0223a interfaceC0223a) {
        this.XQ = interfaceC0223a;
    }

    public final void so() {
        sn();
    }

    @Override // com.kwad.sdk.widget.KSFrameLayout, com.kwad.sdk.widget.i
    public final void z(View view) {
        InterfaceC0223a interfaceC0223a;
        InterfaceC0223a interfaceC0223a2;
        super.z(view);
        if (this.XY == 0 && (interfaceC0223a2 = this.XQ) != null) {
            interfaceC0223a2.k(view);
        } else if (!this.XU) {
            this.XU = true;
            this.XV = System.currentTimeMillis();
            sm();
            sl();
        } else if (System.currentTimeMillis() - this.XV <= this.XY || (interfaceC0223a = this.XQ) == null) {
        } else {
            interfaceC0223a.k(view);
            sm();
        }
    }
}
