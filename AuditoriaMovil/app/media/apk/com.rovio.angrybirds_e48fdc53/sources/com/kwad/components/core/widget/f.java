package com.kwad.components.core.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.FrameLayout;
import com.kwad.sdk.utils.ai;
/* loaded from: classes.dex */
public final class f extends FrameLayout {
    private boolean Zi;
    protected g hC;
    protected boolean hV;
    protected Context mContext;

    public f(Context context) {
        super(context);
        this.mContext = context;
        this.hV = ai.IK();
    }

    private void sz() {
        boolean IK = ai.IK();
        if (!this.Zi || IK == this.hV) {
            return;
        }
        this.hV = IK;
        g gVar = this.hC;
        if (gVar != null) {
            gVar.j(!IK);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sz();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.Zi = i == 0;
        sz();
    }

    public final void setOrientationChangeListener(g gVar) {
        this.hC = gVar;
    }
}
