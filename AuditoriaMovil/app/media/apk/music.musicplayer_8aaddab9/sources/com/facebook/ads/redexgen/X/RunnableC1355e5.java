package com.facebook.ads.redexgen.X;

import android.os.Handler;
/* renamed from: com.facebook.ads.redexgen.X.e5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1355e5 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1354e4 A01;

    public RunnableC1355e5(C1354e4 c1354e4, int i2) {
        this.A01 = c1354e4;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        S3 s3;
        Handler handler;
        Runnable runnable;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            z = this.A01.A01;
            if (z) {
                C1354e4 c1354e4 = this.A01;
                s3 = this.A01.A05;
                c1354e4.A06(s3.A9h());
                handler = this.A01.A04;
                runnable = this.A01.A09;
                handler.postDelayed(runnable, this.A00);
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
