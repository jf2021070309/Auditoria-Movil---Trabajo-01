package ch.qos.logback.core.recovery;
/* loaded from: classes.dex */
public class RecoveryCoordinator {
    public static long BACKOFF_COEFFICIENT_MAX = 327680;
    public static final long BACKOFF_COEFFICIENT_MIN = 20;
    public static long BACKOFF_MULTIPLIER = 4;
    private static long UNSET = -1;
    private long backOffCoefficient;
    private long currentTime;
    private long next;

    public RecoveryCoordinator() {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    public RecoveryCoordinator(long j2) {
        this.backOffCoefficient = 20L;
        this.currentTime = UNSET;
        this.currentTime = j2;
        this.next = getCurrentTime() + getBackoffCoefficient();
    }

    private long getBackoffCoefficient() {
        long j2 = this.backOffCoefficient;
        if (j2 < BACKOFF_COEFFICIENT_MAX) {
            this.backOffCoefficient = BACKOFF_MULTIPLIER * j2;
        }
        return j2;
    }

    private long getCurrentTime() {
        long j2 = this.currentTime;
        return j2 != UNSET ? j2 : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long currentTime = getCurrentTime();
        if (currentTime > this.next) {
            this.next = currentTime + getBackoffCoefficient();
            return false;
        }
        return true;
    }

    public void setCurrentTime(long j2) {
        this.currentTime = j2;
    }
}
