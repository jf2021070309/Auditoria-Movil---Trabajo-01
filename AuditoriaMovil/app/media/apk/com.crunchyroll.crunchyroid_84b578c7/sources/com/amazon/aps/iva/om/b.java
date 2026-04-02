package com.amazon.aps.iva.om;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ox.d;
/* compiled from: ProfilesOnboardingModal.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.h = dVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final q invoke() {
        com.amazon.aps.iva.fm.f fVar = com.amazon.aps.iva.fm.g.e;
        if (fVar != null) {
            d.b a = fVar.a();
            d dVar = this.h;
            androidx.fragment.app.h requireActivity = dVar.requireActivity();
            com.amazon.aps.iva.yb0.j.e(requireActivity, "requireActivity()");
            a.invoke(requireActivity);
            int i = d.b;
            dVar.requireDialog().dismiss();
            return q.a;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
