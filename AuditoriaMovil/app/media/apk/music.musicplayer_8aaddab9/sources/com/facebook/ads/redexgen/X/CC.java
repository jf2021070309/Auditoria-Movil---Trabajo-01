package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;
@SuppressLint({"HandlerLeak"})
/* loaded from: assets/audience_network.dex */
public class CC extends Handler {
    public final /* synthetic */ C1020Wo A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    public CC(C1020Wo c1020Wo, Looper looper) {
        super(looper);
        this.A00 = c1020Wo;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.CC != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSessionManager<T>$MediaDrmHandler */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Wp != com.facebook.ads.internal.exoplayer2.drm.DefaultDrmSession<T> */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        List<C1021Wp> list;
        if (C0726Kz.A02(this)) {
            return;
        }
        try {
            byte[] bArr = (byte[]) message.obj;
            list = this.A00.A09;
            for (C1021Wp c1021Wp : list) {
                if (c1021Wp.A0N(bArr)) {
                    c1021Wp.A0J(message.what);
                    return;
                }
            }
        } catch (Throwable th) {
            C0726Kz.A00(th, this);
        }
    }
}
