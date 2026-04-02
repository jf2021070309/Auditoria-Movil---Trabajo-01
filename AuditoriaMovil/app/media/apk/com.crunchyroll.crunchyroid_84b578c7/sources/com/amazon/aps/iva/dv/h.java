package com.amazon.aps.iva.dv;

import android.view.VelocityTracker;
import com.amazon.aps.iva.kb0.q;
/* compiled from: CrunchylistAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ j h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar) {
        super(0);
        this.h = jVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        j jVar = this.h;
        androidx.recyclerview.widget.q qVar = jVar.b;
        if (qVar.m.hasDragFlag(qVar.r, jVar) && jVar.itemView.getParent() == qVar.r) {
            VelocityTracker velocityTracker = qVar.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            qVar.t = VelocityTracker.obtain();
            qVar.i = 0.0f;
            qVar.h = 0.0f;
            qVar.p(jVar, 2);
        }
        return q.a;
    }
}
