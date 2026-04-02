package com.ellation.crunchyroll.presentation.multitiersubscription.cancellation.rescue;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.yb0.l;
/* compiled from: CancellationRescueActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ CancellationRescueActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CancellationRescueActivity cancellationRescueActivity) {
        super(0);
        this.h = cancellationRescueActivity;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        this.h.l.b();
        return q.a;
    }
}
