package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzao extends zzbr {
    private final long currentTime;
    private final long duration;
    private final String timeUnit = "ms";

    public zzao(long j, long j2, String str) {
        this.currentTime = j;
        this.duration = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbr) {
            zzbr zzbrVar = (zzbr) obj;
            if (this.currentTime == zzbrVar.currentTime() && this.duration == zzbrVar.duration() && this.timeUnit.equals(zzbrVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.currentTime;
        long j2 = this.duration;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.timeUnit.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbr
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        long j = this.currentTime;
        long j2 = this.duration;
        String str = this.timeUnit;
        return "TimeUpdateData{currentTime=" + j + ", duration=" + j2 + ", timeUnit=" + str + "}";
    }
}
