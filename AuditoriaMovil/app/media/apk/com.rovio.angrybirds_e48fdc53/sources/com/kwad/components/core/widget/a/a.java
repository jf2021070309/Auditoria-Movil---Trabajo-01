package com.kwad.components.core.widget.a;

import android.os.Message;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.kwad.sdk.core.h.c;
import com.kwad.sdk.utils.ah;
import com.kwad.sdk.utils.bn;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public abstract class a implements com.kwad.sdk.core.h.a, bn.a {
    private Set<c> Zl;
    private final int Zm;
    private final View mRootView;
    private final AtomicBoolean Zk = new AtomicBoolean(false);
    protected final bn gz = new bn(this);

    public a(View view, int i) {
        this.mRootView = view;
        this.Zm = i;
    }

    private void aS(boolean z) {
        Set<c> set = this.Zl;
        if (set == null) {
            return;
        }
        for (c cVar : set) {
            if (cVar != null) {
                if (z) {
                    cVar.aK();
                } else {
                    cVar.aL();
                }
            }
        }
    }

    private void ji() {
        if (this.Zk.getAndSet(true)) {
            return;
        }
        aS(true);
    }

    private void sA() {
        if (er()) {
            ji();
        } else {
            sD();
        }
    }

    private void sD() {
        if (this.Zk.getAndSet(false)) {
            aS(false);
        }
    }

    @Override // com.kwad.sdk.utils.bn.a
    public final void a(Message message) {
        if (message.what == 666) {
            sA();
            this.gz.sendEmptyMessageDelayed(TTAdConstant.STYLE_SIZE_RADIO_2_3, 500L);
        }
    }

    @Override // com.kwad.sdk.core.h.a
    public final void a(c cVar) {
        ah.checkUiThread();
        if (cVar == null) {
            return;
        }
        if (er()) {
            cVar.aK();
        } else {
            cVar.aL();
        }
        if (this.Zl == null) {
            this.Zl = new HashSet();
        }
        this.Zl.add(cVar);
    }

    @Override // com.kwad.sdk.core.h.a
    public final void b(c cVar) {
        Set<c> set;
        ah.checkUiThread();
        if (cVar == null || (set = this.Zl) == null) {
            return;
        }
        set.remove(cVar);
    }

    public abstract boolean er();

    @Override // com.kwad.sdk.core.h.a
    public final void release() {
        sC();
        Set<c> set = this.Zl;
        if (set != null) {
            set.clear();
        }
    }

    public final void sB() {
        this.gz.removeMessages(TTAdConstant.STYLE_SIZE_RADIO_2_3);
        this.gz.sendEmptyMessage(TTAdConstant.STYLE_SIZE_RADIO_2_3);
    }

    public final void sC() {
        sA();
        this.gz.removeCallbacksAndMessages(null);
    }

    @Override // com.kwad.sdk.core.h.a
    public final boolean sE() {
        return this.Zk.get();
    }
}
