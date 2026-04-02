package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: assets/audience_network.dex */
public final class UY implements IW {
    public final Handler A00;

    public UY(Handler handler) {
        this.A00 = handler;
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final Looper A6u() {
        return this.A00.getLooper();
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final Message A9i(int i2, int i3, int i4) {
        return this.A00.obtainMessage(i2, i3, i4);
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final Message A9j(int i2, int i3, int i4, Object obj) {
        return this.A00.obtainMessage(i2, i3, i4, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final Message A9k(int i2, Object obj) {
        return this.A00.obtainMessage(i2, obj);
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final void ADt(int i2) {
        this.A00.removeMessages(i2);
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final boolean AEW(int i2) {
        return this.A00.sendEmptyMessage(i2);
    }

    @Override // com.facebook.ads.redexgen.X.IW
    public final boolean AEX(int i2, long j2) {
        return this.A00.sendEmptyMessageAtTime(i2, j2);
    }
}
