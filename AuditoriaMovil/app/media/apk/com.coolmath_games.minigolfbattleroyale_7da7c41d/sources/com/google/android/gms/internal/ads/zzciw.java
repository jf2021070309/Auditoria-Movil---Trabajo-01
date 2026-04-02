package com.google.android.gms.internal.ads;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzciw implements Runnable {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzciw(zzciy zzciyVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
