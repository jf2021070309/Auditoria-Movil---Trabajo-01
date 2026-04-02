package com.facebook.ads.redexgen.X;

import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.cK  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1250cK<K, V> extends AbstractC02772d<K, V> {
    public final /* synthetic */ C1249cJ A00;

    public C1250cK(C1249cJ c1249cJ) {
        this.A00 = c1249cJ;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final int A04() {
        return ((C02802g) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final Object A07(int i2, int i3) {
        return this.A00.A02[(i2 << 1) + i3];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final V A08(int i2, V v) {
        V value = this.A00.A0C(i2, v);
        return value;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final Map<K, V> A0A() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final void A0E(int i2) {
        this.A00.A0A(i2);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02772d
    public final void A0F(K k2, V v) {
        this.A00.put(k2, v);
    }
}
