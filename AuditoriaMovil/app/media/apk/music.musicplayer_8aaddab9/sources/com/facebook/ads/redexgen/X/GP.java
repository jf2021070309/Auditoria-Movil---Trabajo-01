package com.facebook.ads.redexgen.X;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: assets/audience_network.dex */
public class GP implements InterfaceC0876Qw {
    public final /* synthetic */ C03073j A00;
    public final /* synthetic */ CountDownLatch A01;
    public final /* synthetic */ AtomicReference A02;
    public final /* synthetic */ AtomicReference A03;

    public GP(C03073j c03073j, AtomicReference atomicReference, AtomicReference atomicReference2, CountDownLatch countDownLatch) {
        this.A00 = c03073j;
        this.A03 = atomicReference;
        this.A02 = atomicReference2;
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qw
    public final void AAK(InterfaceC0874Qu interfaceC0874Qu) {
        C03073j.A06(interfaceC0874Qu.A5o(), this.A03, this.A02);
        this.A01.countDown();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qw
    public final void AAi(Exception exc) {
        this.A02.set(exc);
        this.A01.countDown();
    }
}
