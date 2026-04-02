package com.vungle.publisher;

import android.os.Handler;
import android.os.Looper;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class bz {
    private final Handler a = new Handler(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.a.post(runnable);
    }

    public void a(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public void a() {
        this.a.removeCallbacksAndMessages(null);
    }
}
