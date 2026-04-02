package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
/* loaded from: assets/audience_network.dex */
public final class BI extends V4 {
    public final int A00;
    @Nullable
    public final Object A01;

    public BI(TrackGroup trackGroup, int i2) {
        this(trackGroup, i2, 0, null);
    }

    public BI(TrackGroup trackGroup, int i2, int i3, @Nullable Object obj) {
        super(trackGroup, i2);
        this.A00 = i3;
        this.A01 = obj;
    }

    @Override // com.facebook.ads.redexgen.X.HQ
    public final int A7P() {
        return 0;
    }
}
