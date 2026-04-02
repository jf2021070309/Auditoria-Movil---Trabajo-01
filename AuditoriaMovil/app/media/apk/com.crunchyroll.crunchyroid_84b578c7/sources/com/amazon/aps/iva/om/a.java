package com.amazon.aps.iva.om;

import com.amazon.aps.iva.kb0.q;
/* compiled from: ProfilesOnboardingModal.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<q> {
    public a(d dVar) {
        super(0, dVar, d.class, "closeModal", "closeModal()V", 0);
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        int i = d.b;
        ((d) this.receiver).requireDialog().dismiss();
        return q.a;
    }
}
