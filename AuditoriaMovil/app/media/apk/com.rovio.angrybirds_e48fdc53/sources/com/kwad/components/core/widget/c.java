package com.kwad.components.core.widget;

import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.utils.bm;
import com.kwad.sdk.utils.bn;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c extends View implements bn.a {
    private View SN;
    private final AtomicBoolean SO;
    private boolean XR;
    private boolean XS;
    private a Yo;
    private boolean Yp;
    private final int Yq;
    private final bn gz;

    /* loaded from: classes.dex */
    public interface a {
        void eK();
    }

    public c(Context context, View view) {
        super(context);
        this.gz = new bn(this);
        this.SO = new AtomicBoolean(true);
        this.Yq = (int) (com.kwad.sdk.core.config.d.zG() * 100.0f);
        this.SN = view;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    private void sm() {
        if (this.XS) {
            this.gz.removeCallbacksAndMessages(null);
            this.XS = false;
        }
    }

    private void sn() {
        if (!this.Yp || this.XS) {
            return;
        }
        this.XS = true;
        this.gz.sendEmptyMessage(1);
    }

    private void sq() {
        this.SO.getAndSet(false);
    }

    private void sr() {
        this.SO.getAndSet(true);
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        a aVar;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            if (!bm.a(this.SN, this.Yq, false)) {
                if (this.XR) {
                    return;
                }
                setNeedCheckingShow(true);
                return;
            }
            if (message.arg1 == 1000 && (aVar = this.Yo) != null) {
                aVar.eK();
            }
            this.gz.sendEmptyMessageDelayed(2, 500L);
            return;
        }
        com.kwad.sdk.core.e.c.d("EmptyView", "handleMsg MSG_CHECKING");
        if (this.XS) {
            if (!bm.a(this.SN, this.Yq, false)) {
                this.gz.sendEmptyMessageDelayed(1, 500L);
                return;
            }
            sm();
            Message obtainMessage = this.gz.obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = 1000;
            this.gz.sendMessageDelayed(obtainMessage, 1000L);
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.kwad.sdk.core.e.c.d("EmptyView", "onAttachedToWindow:" + this);
        sn();
        this.XR = false;
        sq();
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.kwad.sdk.core.e.c.d("EmptyView", "onDetachedFromWindow" + this);
        sm();
        this.XR = true;
        sr();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        com.kwad.sdk.core.e.c.d("EmptyView", "onFinishTemporaryDetach:" + this.SN.getParent());
        sq();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        com.kwad.sdk.core.e.c.d("EmptyView", "onStartTemporaryDetach:" + this.SN.getParent());
        sr();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        com.kwad.sdk.core.e.c.d("EmptyView", "onWindowFocusChanged hasWindowFocus:" + z);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        com.kwad.sdk.core.e.c.d("EmptyView", "onWindowVisibilityChanged visibility:" + i);
    }

    public final void setNeedCheckingShow(boolean z) {
        this.Yp = z;
        if (!z && this.XS) {
            sm();
        } else if (!z || this.XS) {
        } else {
            sn();
        }
    }

    public final void setViewCallback(a aVar) {
        this.Yo = aVar;
    }
}
