package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Fc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0578Fc implements Runnable {
    public final /* synthetic */ C0587Fl A00;
    public final /* synthetic */ InterfaceC0590Fo A01;

    public RunnableC0578Fc(C0587Fl c0587Fl, InterfaceC0590Fo interfaceC0590Fo) {
        this.A00 = c0587Fl;
        this.A01 = interfaceC0590Fo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A01.ABS(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
