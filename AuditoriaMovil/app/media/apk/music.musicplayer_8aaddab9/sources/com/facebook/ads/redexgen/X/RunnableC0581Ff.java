package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.Ff  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0581Ff implements Runnable {
    public final /* synthetic */ C0587Fl A00;
    public final /* synthetic */ C0588Fm A01;
    public final /* synthetic */ C0589Fn A02;
    public final /* synthetic */ InterfaceC0590Fo A03;

    public RunnableC0581Ff(C0587Fl c0587Fl, InterfaceC0590Fo interfaceC0590Fo, C0588Fm c0588Fm, C0589Fn c0589Fn) {
        this.A00 = c0587Fl;
        this.A03 = interfaceC0590Fo;
        this.A01 = c0588Fm;
        this.A02 = c0589Fn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            this.A03.ABB(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
