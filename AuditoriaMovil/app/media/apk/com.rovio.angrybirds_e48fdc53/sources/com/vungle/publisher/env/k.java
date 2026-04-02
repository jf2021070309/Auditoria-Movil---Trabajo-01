package com.vungle.publisher.env;

import android.content.SharedPreferences;
import com.vungle.publisher.bh;
import com.vungle.publisher.bj;
import com.vungle.publisher.bp;
import com.vungle.publisher.bs;
import com.vungle.publisher.log.Logger;
import com.vungle.publisher.pi;
import com.vungle.publisher.zl;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
/* loaded from: classes4.dex */
public class k extends pi {
    @Inject
    SharedPreferences a;
    AtomicReference<String> b = new AtomicReference<>(null);
    private long c;

    public boolean a() {
        return this.b.get() != null;
    }

    public boolean a(String str) {
        if (b()) {
            if (this.b.compareAndSet(null, str)) {
                register();
                return true;
            }
            Logger.d(Logger.AD_TAG, "ad already playing for placement: " + this.b);
            this.eventBus.a(new bj(str));
            return false;
        }
        this.eventBus.a(new bp(null, str, (int) ((zl.b() - c()) / 1000), e()));
        return false;
    }

    public boolean b() {
        long b = zl.b();
        long c = c();
        int b2 = (int) ((zl.b() - c()) / 1000);
        if (b2 < 0) {
            Logger.d(Logger.AD_TAG, "negative adDelayElapsedSeconds " + b2 + ", currentTimestampMillis " + b + ", lastAdEndMillis " + c);
        } else {
            int e = e();
            r0 = b2 >= e;
            if (r0) {
                Logger.v(Logger.AD_TAG, b2 + " / " + e + " ad delay seconds elapsed");
            } else {
                Logger.d(Logger.AD_TAG, b2 + " / " + e + " ad delay seconds elapsed");
            }
        }
        return r0;
    }

    public long c() {
        long j = this.a.getLong("VgLastViewedTime", 0L);
        Logger.v(Logger.AD_TAG, "returning last ad end millis: " + j);
        return j;
    }

    void d() {
        long b = zl.b();
        Logger.v(Logger.AD_TAG, "setting last ad end millis: " + b);
        this.a.edit().putLong("VgLastViewedTime", b).apply();
    }

    public int e() {
        return this.a.getInt("VgAdDelayDuration", 0);
    }

    public void a(Integer num) {
        if (num == null) {
            Logger.v(Logger.AD_TAG, "ignoring set null min ad delay seconds");
        } else {
            a(num.intValue());
        }
    }

    public void a(int i) {
        Logger.d(Logger.AD_TAG, "setting min ad delay seconds: " + i);
        this.a.edit().putInt("VgAdDelayDuration", i).apply();
    }

    public void a(boolean z) {
        String str = this.b.get();
        if (str != null && this.b.compareAndSet(str, null)) {
            Logger.d(Logger.AD_TAG, "ending playing ad. isNormalAdEnd? " + z);
            unregister();
            d();
            f();
            if (!z) {
                this.eventBus.a(new bs(null, str, this.c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.c = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(long j) {
        this.c = j;
    }

    public void onEvent(bh bhVar) {
        Logger.d(Logger.AD_TAG, "InterstitialAdState received end ad event");
        a(true);
    }
}
