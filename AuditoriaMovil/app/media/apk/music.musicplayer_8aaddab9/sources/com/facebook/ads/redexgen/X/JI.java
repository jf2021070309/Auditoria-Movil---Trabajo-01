package com.facebook.ads.redexgen.X;
/* loaded from: assets/audience_network.dex */
public class JI implements Runnable {
    public static String[] A05 = {"DJpTE", "hjmigejYKbOgwmfvV1nc5iE8IDOYmXil", "2YKNaj9Qlm", "qxfanbBXI2ZjoCTgG7w8KuDdJjLlXH62", "XtZaZ3wYkBKmpvCnemS2yQk1T2uyfDPG", "Gw99gcoZxN", "lvDFpJS29mpdODJdSJz5AdBwktpN", "hlGH8f80A3YyARPnHLcSnfRHIOI89tOr"};
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ JL A04;

    public JI(JL jl, int i2, int i3, int i4, float f2) {
        this.A04 = jl;
        this.A03 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A00 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JM jm;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            jm = this.A04.A01;
            jm.ACn(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th) {
            if (A05[0].length() != 5) {
                throw new RuntimeException();
            }
            A05[3] = "OXxSdVemaS9DNqMoLNSyLFOeF9oFC1IL";
            C0726Kz.A00(th, this);
        }
    }
}
