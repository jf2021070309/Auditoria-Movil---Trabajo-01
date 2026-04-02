package com.ironsource.mediationsdk;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.mediationsdk.logger.IronSourceError;
/* renamed from: com.ironsource.mediationsdk.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0116j {
    private static C0116j b;
    int a;
    private long c = 0;
    private boolean d = false;

    private C0116j() {
    }

    public static synchronized C0116j a() {
        C0116j c0116j;
        synchronized (C0116j.class) {
            if (b == null) {
                b = new C0116j();
            }
            c0116j = b;
        }
        return c0116j;
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError) {
        synchronized (this) {
            if (this.d) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            if (currentTimeMillis > this.a * 1000) {
                b(ironSourceBannerLayout, ironSourceError);
                return;
            }
            this.d = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.ironsource.mediationsdk.j.1
                @Override // java.lang.Runnable
                public final void run() {
                    C0116j.this.b(ironSourceBannerLayout, ironSourceError);
                }
            }, (this.a * 1000) - currentTimeMillis);
        }
    }

    void b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        if (ironSourceBannerLayout != null) {
            this.c = System.currentTimeMillis();
            this.d = false;
            ironSourceBannerLayout.a(ironSourceError);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.d;
        }
        return z;
    }
}
