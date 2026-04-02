package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
/* renamed from: com.facebook.ads.redexgen.X.Sa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0906Sa implements O9 {
    public final WeakReference<AbstractC04649z> A00;

    public C0906Sa(AbstractC04649z abstractC04649z) {
        this.A00 = new WeakReference<>(abstractC04649z);
    }

    public /* synthetic */ C0906Sa(AbstractC04649z abstractC04649z, A5 a5) {
        this(abstractC04649z);
    }

    @Override // com.facebook.ads.redexgen.X.O9
    public final void AAu(boolean z) {
        AbstractC04649z abstractC04649z = this.A00.get();
        if (abstractC04649z != null) {
            abstractC04649z.A06 = z;
            abstractC04649z.A01();
        }
    }
}
