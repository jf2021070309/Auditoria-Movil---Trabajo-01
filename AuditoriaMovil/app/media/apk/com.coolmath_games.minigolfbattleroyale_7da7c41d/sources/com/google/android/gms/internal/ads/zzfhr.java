package com.google.android.gms.internal.ads;

import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfhr implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Runnable runnable;
        Handler handler3;
        Runnable runnable2;
        handler = zzfhu.zzc;
        if (handler != null) {
            handler2 = zzfhu.zzc;
            runnable = zzfhu.zzj;
            handler2.post(runnable);
            handler3 = zzfhu.zzc;
            runnable2 = zzfhu.zzk;
            handler3.postDelayed(runnable2, 200L);
        }
    }
}
