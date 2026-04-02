package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public abstract class Cq {
    public final InterfaceC0525Co A00;

    public abstract void A0B(C0660Ii c0660Ii, long j2) throws C0470Af;

    public abstract boolean A0C(C0660Ii c0660Ii) throws C0470Af;

    public Cq(InterfaceC0525Co interfaceC0525Co) {
        this.A00 = interfaceC0525Co;
    }

    public final void A00(C0660Ii c0660Ii, long j2) throws C0470Af {
        if (A0C(c0660Ii)) {
            A0B(c0660Ii, j2);
        }
    }
}
