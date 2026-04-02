package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Fj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0585Fj implements Runnable {
    public final /* synthetic */ C0587Fl A00;
    public final /* synthetic */ C0589Fn A01;
    public final /* synthetic */ InterfaceC0590Fo A02;

    public RunnableC0585Fj(C0587Fl c0587Fl, InterfaceC0590Fo interfaceC0590Fo, C0589Fn c0589Fn) {
        this.A00 = c0587Fl;
        this.A02 = interfaceC0590Fo;
        this.A01 = c0589Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A02.AAX(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
