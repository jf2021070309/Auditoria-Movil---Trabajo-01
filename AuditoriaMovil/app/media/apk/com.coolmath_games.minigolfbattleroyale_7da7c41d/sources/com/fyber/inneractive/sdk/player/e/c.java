package com.fyber.inneractive.sdk.player.e;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.q;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class c extends TextureView {
    private WeakReference<g> a;

    public c(g gVar) {
        super(gVar.getContext());
        this.a = new WeakReference<>(gVar);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        g gVar = (g) q.a(this.a);
        if (gVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(gVar.A.a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(gVar.A.b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
