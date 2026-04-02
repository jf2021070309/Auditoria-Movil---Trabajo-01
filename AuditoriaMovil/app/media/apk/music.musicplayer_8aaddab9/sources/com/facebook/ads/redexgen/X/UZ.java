package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
/* loaded from: assets/audience_network.dex */
public final class UZ implements IM {
    @Override // com.facebook.ads.redexgen.X.IM
    public final IW A4I(Looper looper, @Nullable Handler.Callback callback) {
        return new UY(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.IM
    public final long A57() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.IM
    public final long AFR() {
        return SystemClock.uptimeMillis();
    }
}
