package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Fb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0577Fb implements Runnable {
    public static String[] A02 = {"WoRssMEMKAHHv5eOYWv6bcyCNlOXOf", "pA2", "3fT7OOiQOTO0YPgLHZKt2Q997Hb2Xix9", "WvgPUzUWGb7Do3xsV3", "Ec3vTQmgAcMNirmUvkhwoL1JefVS29Et", "cLkVqjW9ihOrHUtkcRLXNZqcrrO72e", "NZCcSFELY0AlwKVNvcWKAmZ3Ywu7Rk3n", "YvU"};
    public final /* synthetic */ C0587Fl A00;
    public final /* synthetic */ InterfaceC0590Fo A01;

    public RunnableC0577Fb(C0587Fl c0587Fl, InterfaceC0590Fo interfaceC0590Fo) {
        this.A00 = c0587Fl;
        this.A01 = interfaceC0590Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.ABR(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
            if (A02[4].charAt(31) != 't') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[7] = "YLN";
            strArr[1] = "t0z";
        }
    }
}
