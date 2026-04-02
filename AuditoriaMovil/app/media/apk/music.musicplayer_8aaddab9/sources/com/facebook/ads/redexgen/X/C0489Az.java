package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Az  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0489Az {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public G9 A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i2) {
        return this.A05.A04[i2].A00;
    }

    public final int A02(int i2) {
        return this.A05.A04[i2].A00();
    }

    public final int A03(int i2, int i3) {
        return this.A05.A04[i2].A01(i3);
    }

    public final int A04(long j2) {
        return this.A05.A00(j2);
    }

    public final int A05(long j2) {
        return this.A05.A01(j2);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AG.A01(this.A04);
    }

    public final long A09(int i2) {
        return this.A05.A03[i2];
    }

    public final long A0A(int i2, int i3) {
        G7 g7 = this.A05.A04[i2];
        if (g7.A00 != -1) {
            return g7.A02[i3];
        }
        return -9223372036854775807L;
    }

    public final C0489Az A0B(Object obj, Object obj2, int i2, long j2, long j3) {
        return A0C(obj, obj2, i2, j2, j3, G9.A06);
    }

    public final C0489Az A0C(Object obj, Object obj2, int i2, long j2, long j3, G9 g9) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i2;
        this.A01 = j2;
        this.A04 = j3;
        this.A05 = g9;
        return this;
    }

    public final boolean A0D(int i2) {
        return !this.A05.A04[i2].A02();
    }

    public final boolean A0E(int i2, int i3) {
        G7 g7 = this.A05.A04[i2];
        return (g7.A00 == -1 || g7.A01[i3] == 0) ? false : true;
    }
}
