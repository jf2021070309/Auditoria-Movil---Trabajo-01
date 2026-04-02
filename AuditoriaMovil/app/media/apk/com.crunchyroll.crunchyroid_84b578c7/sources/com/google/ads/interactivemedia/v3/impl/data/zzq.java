package com.google.ads.interactivemedia.v3.impl.data;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzq extends CuePointData {
    private final double end;
    private final boolean played;
    private final double start;

    public zzq(double d, double d2, boolean z) {
        this.start = d;
        this.end = d2;
        this.played = z;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CuePointData) {
            CuePointData cuePointData = (CuePointData) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(cuePointData.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(cuePointData.end()) && this.played == cuePointData.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        long doubleToLongBits = (Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start);
        long doubleToLongBits2 = (Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end);
        if (true != this.played) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((int) doubleToLongBits) ^ 1000003) * 1000003) ^ ((int) doubleToLongBits2)) * 1000003) ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.CuePointData
    public double start() {
        return this.start;
    }

    public String toString() {
        double d = this.start;
        double d2 = this.end;
        boolean z = this.played;
        return "CuePointData{start=" + d + ", end=" + d2 + ", played=" + z + "}";
    }
}
