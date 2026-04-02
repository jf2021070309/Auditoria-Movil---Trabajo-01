package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Bp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0505Bp extends VT implements FV {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final InterfaceC0519Cf A05;
    public final InterfaceC0631Hd A06;
    @Nullable
    public final Object A07;
    public final String A08;

    public C0505Bp(Uri uri, InterfaceC0631Hd interfaceC0631Hd, InterfaceC0519Cf interfaceC0519Cf, int i2, @Nullable String str, int i3, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0631Hd;
        this.A05 = interfaceC0519Cf;
        this.A03 = i2;
        this.A08 = str;
        this.A02 = i3;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j2, boolean z) {
        this.A00 = j2;
        this.A01 = z;
        A01(new VK(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.VT
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.VT
    public final void A03(X7 x7, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final VM A4P(FY fy, HW hw) {
        IJ.A03(fy.A02 == 0);
        return new C0513Bx(this.A04, this.A06.A4D(), this.A05.A4H(), this.A03, A00(fy), this, hw, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void A9X() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.FV
    public final void ACI(long j2, boolean z) {
        if (j2 == -9223372036854775807L) {
            j2 = this.A00;
        }
        if (this.A00 == j2 && this.A01 == z) {
            return;
        }
        A00(j2, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0576Fa
    public final void ADo(VM vm) {
        ((C0513Bx) vm).A0R();
    }
}
