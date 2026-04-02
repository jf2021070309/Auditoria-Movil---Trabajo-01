package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
/* renamed from: com.facebook.ads.redexgen.X.Lw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0747Lw implements Closeable {
    @Nullable
    public C0746Lv A00;
    public boolean A01;
    public final C0745Lu A02;
    public final Runnable A03;

    public C0747Lw(long j2, Runnable runnable) {
        this.A02 = new C0745Lu(j2);
        this.A02.A02();
        this.A03 = runnable;
        this.A01 = false;
    }

    private final synchronized void A03() {
        if (this.A00 == null && !this.A01) {
            this.A00 = new C0746Lv(this);
        }
    }

    public final C0745Lu A04() {
        return this.A02;
    }

    public final synchronized void A05() {
        if (this.A01) {
            return;
        }
        if (this.A00 == null) {
            this.A00 = new C0746Lv(this);
        }
        this.A00.A00();
    }

    public final synchronized void A06() {
        if (this.A02.A05() && !this.A01) {
            A03();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C0746Lv c0746Lv;
        synchronized (this) {
            this.A01 = true;
            c0746Lv = this.A00;
        }
        if (c0746Lv != null) {
            c0746Lv.close();
        }
    }
}
