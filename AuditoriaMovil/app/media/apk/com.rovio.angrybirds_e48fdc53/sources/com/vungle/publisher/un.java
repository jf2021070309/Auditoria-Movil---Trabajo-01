package com.vungle.publisher;

import android.os.SystemClock;
import com.vungle.publisher.log.Logger;
/* loaded from: classes4.dex */
public class un {
    int a;
    private long b;
    private int c;

    public long a() {
        return this.b;
    }

    private void a(long j) {
        this.b = j;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (this.b <= 0) {
            a(SystemClock.elapsedRealtime());
        }
        this.a++;
        this.c++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        int i = this.c - 1;
        this.c = i;
        if (i < 0) {
            Logger.d(Logger.NETWORK_TAG, "Attempted to decrement softRetryCount < 0");
            this.c = 0;
        }
        return this.c;
    }

    public String toString() {
        return "{firstAttemptMillis: " + this.b + ", hardRetryCount: " + this.a + ", softRetryCount: " + this.c + "}";
    }
}
