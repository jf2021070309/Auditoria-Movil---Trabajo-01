package com.amazon.aps.iva.t5;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;
/* compiled from: TimestampAdjuster.java */
/* loaded from: classes.dex */
public final class b0 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal<Long> d = new ThreadLocal<>();

    public b0(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!d()) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = ((j4 - 1) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j;
        j = this.a;
        return (j == Long.MAX_VALUE || j == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public final synchronized boolean d() {
        boolean z;
        if (this.b != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void e(long j) {
        long j2;
        this.a = j;
        if (j == Long.MAX_VALUE) {
            j2 = 0;
        } else {
            j2 = -9223372036854775807L;
        }
        this.b = j2;
        this.c = -9223372036854775807L;
    }

    public final synchronized void f(long j, long j2, boolean z) throws InterruptedException, TimeoutException {
        boolean z2;
        boolean z3;
        if (this.a == 9223372036854775806L) {
            z2 = true;
        } else {
            z2 = false;
        }
        com.amazon.aps.iva.cq.b.C(z2);
        if (d()) {
            return;
        }
        if (z) {
            this.d.set(Long.valueOf(j));
        } else {
            long j3 = 0;
            long j4 = j2;
            while (!d()) {
                if (j2 == 0) {
                    wait();
                } else {
                    if (j4 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    com.amazon.aps.iva.cq.b.C(z3);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    wait(j4);
                    j3 += SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j3 >= j2 && !d()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j2 + " milliseconds");
                    }
                    j4 = j2 - j3;
                }
            }
        }
    }
}
