package com.google.android.gms.internal.ads;

import android.os.Looper;
/* loaded from: classes.dex */
public final class zzciw implements Runnable {
    public zzciw(zzciy zzciyVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
