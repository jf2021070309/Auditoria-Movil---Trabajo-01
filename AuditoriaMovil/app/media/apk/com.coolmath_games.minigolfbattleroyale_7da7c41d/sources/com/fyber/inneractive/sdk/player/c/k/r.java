package com.fyber.inneractive.sdk.player.c.k;

import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public final class r {
    public long a;
    public volatile long b = -9223372036854775807L;
    private long c;

    public r(long j) {
        c(j);
    }

    private synchronized void c(long j) {
        a.b(this.b == -9223372036854775807L);
        this.a = j;
    }

    public final long a() {
        if (this.a == LongCompanionObject.MAX_VALUE) {
            return 0L;
        }
        if (this.b == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.c;
    }

    public final long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b != -9223372036854775807L) {
            long j2 = (this.b * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return b((j * 1000000) / 90000);
    }

    public final long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.b != -9223372036854775807L) {
            this.b = j;
        } else {
            long j2 = this.a;
            if (j2 != LongCompanionObject.MAX_VALUE) {
                this.c = j2 - j;
            }
            synchronized (this) {
                this.b = j;
                notifyAll();
            }
        }
        return j + this.c;
    }
}
