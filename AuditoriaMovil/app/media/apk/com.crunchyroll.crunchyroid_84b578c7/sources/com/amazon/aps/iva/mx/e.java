package com.amazon.aps.iva.mx;

import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yi.h;
/* compiled from: OnboardingV2FeatureFactory.kt */
/* loaded from: classes2.dex */
public final class e implements com.amazon.aps.iva.yi.d {
    public final /* synthetic */ com.amazon.aps.iva.s40.c a;
    public final /* synthetic */ com.amazon.aps.iva.s40.c b;

    public e(com.amazon.aps.iva.s40.h hVar, com.amazon.aps.iva.s40.h hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    @Override // com.amazon.aps.iva.yi.d
    public final void a() {
        this.b.b(null, null, null);
    }

    @Override // com.amazon.aps.iva.yi.d
    public final void b(h.b bVar, h.c cVar, h.d dVar) {
        j.f(dVar, "onCancel");
        this.a.a(cVar, bVar, dVar);
        this.b.a(cVar, bVar, dVar);
    }

    @Override // com.amazon.aps.iva.yi.d
    public final void c() {
        this.a.b(null, null, null);
    }
}
