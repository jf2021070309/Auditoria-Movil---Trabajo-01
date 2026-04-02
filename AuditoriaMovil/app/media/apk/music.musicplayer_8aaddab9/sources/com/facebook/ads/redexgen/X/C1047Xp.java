package com.facebook.ads.redexgen.X;

import java.util.concurrent.BlockingQueue;
/* renamed from: com.facebook.ads.redexgen.X.Xp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1047Xp implements InterfaceC0856Qc {
    public final /* synthetic */ C7P A00;

    public C1047Xp(C7P c7p) {
        this.A00 = c7p;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0856Qc
    public final void AAW() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.A00.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0856Qc
    public final void AAg() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.A00.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
