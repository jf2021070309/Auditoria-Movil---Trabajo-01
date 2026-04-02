package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
/* renamed from: com.facebook.ads.redexgen.X.7P  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7P implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C7U A01;

    public C7P(C7U c7u, C7T c7t) {
        this.A01 = c7u;
        new Handler(Looper.getMainLooper()).post(new C1048Xq(this, c7u, c7t));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C7T c7t) {
        C8U c8u;
        C8U c8u2;
        c8u = this.A01.A04;
        C0857Qd A05 = C0857Qd.A05(c8u);
        Uri parse = Uri.parse(c7t.A08);
        long j2 = c7t.A00;
        if (j2 == -1) {
            c8u2 = this.A01.A04;
            j2 = JQ.A0M(c8u2);
        }
        A05.A0F(parse, new C1047Xp(this), j2);
    }
}
