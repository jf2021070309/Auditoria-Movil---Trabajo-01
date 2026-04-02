package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import c.q.b.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class zbc extends a implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    @Override // c.q.b.a
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        int i2 = 0;
        for (GoogleApiClient googleApiClient : this.zbb) {
            if (googleApiClient.maybeSignIn(this)) {
                i2++;
            }
        }
        try {
            this.zba.tryAcquire(i2, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    @Override // c.q.b.b
    public final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}
