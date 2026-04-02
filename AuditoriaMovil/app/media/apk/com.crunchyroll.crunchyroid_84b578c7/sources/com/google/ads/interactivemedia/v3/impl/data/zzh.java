package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.n4.a;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzh extends zzb {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final zzau nativeViewBounds;
    private final boolean nativeViewHidden;
    private final zzau nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private zzh(String str, String str2, String str3, long j, double d, boolean z, zzau zzauVar, zzau zzauVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j;
        this.nativeVolume = d;
        this.nativeViewHidden = z;
        this.nativeViewBounds = zzauVar;
        this.nativeViewVisibleBounds = zzauVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.queryId.equals(zzbVar.queryId()) && this.eventId.equals(zzbVar.eventId()) && this.appState.equals(zzbVar.appState()) && this.nativeTime == zzbVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(zzbVar.nativeVolume()) && this.nativeViewHidden == zzbVar.nativeViewHidden() && this.nativeViewBounds.equals(zzbVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(zzbVar.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((this.queryId.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003) ^ this.appState.hashCode();
        long j = this.nativeTime;
        long j2 = j ^ (j >>> 32);
        long doubleToLongBits = (Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume);
        if (true != this.nativeViewHidden) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((((((hashCode * 1000003) ^ ((int) j2)) * 1000003) ^ ((int) doubleToLongBits)) * 1000003) ^ i) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzau nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzau nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        String str = this.queryId;
        String str2 = this.eventId;
        String str3 = this.appState;
        long j = this.nativeTime;
        double d = this.nativeVolume;
        boolean z = this.nativeViewHidden;
        String valueOf = String.valueOf(this.nativeViewBounds);
        String valueOf2 = String.valueOf(this.nativeViewVisibleBounds);
        StringBuilder b = a.b("ActivityMonitorData{queryId=", str, ", eventId=", str2, ", appState=");
        b.append(str3);
        b.append(", nativeTime=");
        b.append(j);
        b.append(", nativeVolume=");
        b.append(d);
        b.append(", nativeViewHidden=");
        b.append(z);
        b.append(", nativeViewBounds=");
        b.append(valueOf);
        b.append(", nativeViewVisibleBounds=");
        return b.c(b, valueOf2, "}");
    }
}
