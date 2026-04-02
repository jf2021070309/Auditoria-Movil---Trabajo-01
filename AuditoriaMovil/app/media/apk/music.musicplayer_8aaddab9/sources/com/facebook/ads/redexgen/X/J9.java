package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
@TargetApi(ConnectionResult.API_DISABLED)
/* loaded from: assets/audience_network.dex */
public final class J9 implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ C1Y A00;

    public J9(C1Y c1y, MediaCodec mediaCodec) {
        this.A00 = c1y;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(@NonNull MediaCodec mediaCodec, long j2, long j3) {
        if (this != this.A00.A00) {
            return;
        }
        this.A00.A1R();
    }
}
