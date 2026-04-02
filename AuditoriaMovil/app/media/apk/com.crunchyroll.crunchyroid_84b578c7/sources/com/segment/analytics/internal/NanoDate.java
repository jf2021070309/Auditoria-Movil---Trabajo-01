package com.segment.analytics.internal;

import java.util.Date;
/* loaded from: classes4.dex */
public class NanoDate extends Date {
    private long nanos;

    /* loaded from: classes4.dex */
    public static final class NanoClock {
        private static final long EPOCH_NANOS;
        private static final long NANO_START;
        private static final long OFFSET_NANOS;

        static {
            long currentTimeMillis = System.currentTimeMillis() * 1000000;
            EPOCH_NANOS = currentTimeMillis;
            long nanoTime = System.nanoTime();
            NANO_START = nanoTime;
            OFFSET_NANOS = currentTimeMillis - nanoTime;
        }

        public static long currentTimeNanos() {
            return new NanoClock().nanos();
        }

        private long nanos() {
            return System.nanoTime() + OFFSET_NANOS;
        }
    }

    public NanoDate() {
        this(NanoClock.currentTimeNanos());
    }

    @Override // java.util.Date
    public boolean equals(Object obj) {
        if (obj instanceof NanoDate) {
            if (((NanoDate) obj).nanos() == nanos()) {
                return true;
            }
            return false;
        } else if (!(obj instanceof Date)) {
            return false;
        } else {
            if (super.equals(obj) && this.nanos % 1000000 == 0) {
                return true;
            }
            return false;
        }
    }

    public long nanos() {
        return this.nanos;
    }

    public NanoDate(Date date) {
        this(date.getTime() * 1000000);
    }

    public NanoDate(long j) {
        super(j / 1000000);
        this.nanos = j;
    }
}
