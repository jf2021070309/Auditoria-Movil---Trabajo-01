package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.EnumSet;
/* renamed from: com.facebook.ads.redexgen.X.6s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03926s {
    public final int A00;
    public final InterfaceC03956v A01;
    public final EnumSet<EnumC03996z> A02;

    public C03926s(int i2, EnumSet<EnumC03996z> enumSet, InterfaceC03956v interfaceC03956v) {
        this.A00 = i2;
        this.A02 = enumSet;
        this.A01 = interfaceC03956v;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC03956v A01() {
        if (this.A02.contains(EnumC03996z.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC03956v A02(EnumC03966w enumC03966w) {
        if (A04(enumC03966w)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC03996z> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC03966w enumC03966w) {
        return C7J.A0E(enumC03966w) && this.A02.contains(EnumC03996z.A00(enumC03966w.A03()));
    }
}
