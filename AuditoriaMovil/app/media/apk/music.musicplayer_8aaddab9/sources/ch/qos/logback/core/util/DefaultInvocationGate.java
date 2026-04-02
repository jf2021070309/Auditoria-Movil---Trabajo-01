package ch.qos.logback.core.util;
/* loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {
    public static final int DEFAULT_MASK = 15;
    public static final int MASK_DECREASE_RIGHT_SHIFT_COUNT = 2;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    private long invocationCounter;
    public long lowerLimitForMaskMatch;
    private volatile long mask;
    private long maxDelayThreshold;
    private long minDelayThreshold;
    public long upperLimitForNoMaskMatch;

    public DefaultInvocationGate() {
        this(MASK_INCREASE_THRESHOLD, MASK_DECREASE_THRESHOLD, System.currentTimeMillis());
    }

    public DefaultInvocationGate(long j2, long j3, long j4) {
        this.mask = 15L;
        this.invocationCounter = 0L;
        this.minDelayThreshold = j2;
        this.maxDelayThreshold = j3;
        this.lowerLimitForMaskMatch = j2 + j4;
        this.upperLimitForNoMaskMatch = j4 + j3;
    }

    private void decreaseMask() {
        this.mask >>>= 2;
    }

    private void increaseMask() {
        if (this.mask >= 65535) {
            return;
        }
        this.mask = (this.mask << 1) | 1;
    }

    private void updateLimits(long j2) {
        this.lowerLimitForMaskMatch = this.minDelayThreshold + j2;
        this.upperLimitForNoMaskMatch = j2 + this.maxDelayThreshold;
    }

    public long getInvocationCounter() {
        return this.invocationCounter;
    }

    public long getMask() {
        return this.mask;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j2) {
        long j3 = this.invocationCounter;
        this.invocationCounter = 1 + j3;
        boolean z = (j3 & this.mask) == this.mask;
        if (z) {
            if (j2 < this.lowerLimitForMaskMatch) {
                increaseMask();
            }
            updateLimits(j2);
        } else if (j2 > this.upperLimitForNoMaskMatch) {
            decreaseMask();
            updateLimits(j2);
            return false;
        }
        return !z;
    }
}
