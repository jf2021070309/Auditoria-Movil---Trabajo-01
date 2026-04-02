package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.redexgen.X.CN;
@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public interface CM<T extends CN> {
    CL<T> A2P(Looper looper, DrmInitData drmInitData);

    boolean A3w(DrmInitData drmInitData);

    void ADp(CL<T> cl);
}
