package ch.qos.logback.core.util;
/* loaded from: classes.dex */
public class FixedDelay implements DelayStrategy {
    private long nextDelay;
    private final long subsequentDelay;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FixedDelay(int r3) {
        /*
            r2 = this;
            long r0 = (long) r3
            r2.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.qos.logback.core.util.FixedDelay.<init>(int):void");
    }

    public FixedDelay(long j2, long j3) {
        this.nextDelay = j2;
        this.subsequentDelay = j3;
    }

    @Override // ch.qos.logback.core.util.DelayStrategy
    public long nextDelay() {
        long j2 = this.nextDelay;
        this.nextDelay = this.subsequentDelay;
        return j2;
    }
}
