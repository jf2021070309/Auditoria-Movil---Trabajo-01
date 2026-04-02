package com.facebook.ads.redexgen.X;

import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Dy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0552Dy {
    public final int A00;
    public final long A01;

    public C0552Dy(int i2, long j2) {
        this.A00 = i2;
        this.A01 = j2;
    }

    public static C0552Dy A00(InterfaceC0518Cd interfaceC0518Cd, C0660Ii c0660Ii) throws IOException, InterruptedException {
        interfaceC0518Cd.AD4(c0660Ii.A00, 0, 8);
        c0660Ii.A0Y(0);
        int id = c0660Ii.A08();
        return new C0552Dy(id, c0660Ii.A0K());
    }
}
