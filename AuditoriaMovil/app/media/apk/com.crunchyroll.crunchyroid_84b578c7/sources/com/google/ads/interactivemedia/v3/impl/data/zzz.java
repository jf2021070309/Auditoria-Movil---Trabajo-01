package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.m80.a;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzz extends zzbg {
    private final AdErrorEvent adErrorEvent;
    private final zzbe component;
    private final zzbi loggableException;
    private final zzbf method;
    private final long timestamp;

    public zzz(long j, zzbe zzbeVar, zzbf zzbfVar, AdErrorEvent adErrorEvent, zzbi zzbiVar) {
        this.timestamp = j;
        this.component = zzbeVar;
        this.method = zzbfVar;
        this.adErrorEvent = adErrorEvent;
        this.loggableException = zzbiVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public AdErrorEvent adErrorEvent() {
        return this.adErrorEvent;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbe component() {
        return this.component;
    }

    public boolean equals(Object obj) {
        zzbe zzbeVar;
        zzbf zzbfVar;
        AdErrorEvent adErrorEvent;
        zzbi zzbiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbg) {
            zzbg zzbgVar = (zzbg) obj;
            if (this.timestamp == zzbgVar.timestamp() && ((zzbeVar = this.component) != null ? zzbeVar.equals(zzbgVar.component()) : zzbgVar.component() == null) && ((zzbfVar = this.method) != null ? zzbfVar.equals(zzbgVar.method()) : zzbgVar.method() == null) && ((adErrorEvent = this.adErrorEvent) != null ? adErrorEvent.equals(zzbgVar.adErrorEvent()) : zzbgVar.adErrorEvent() == null) && ((zzbiVar = this.loggableException) != null ? zzbiVar.equals(zzbgVar.loggableException()) : zzbgVar.loggableException() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j = this.timestamp;
        long j2 = j ^ (j >>> 32);
        zzbe zzbeVar = this.component;
        int i = 0;
        if (zzbeVar == null) {
            hashCode = 0;
        } else {
            hashCode = zzbeVar.hashCode();
        }
        int i2 = (int) j2;
        zzbf zzbfVar = this.method;
        if (zzbfVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = zzbfVar.hashCode();
        }
        int i3 = ((i2 ^ 1000003) * 1000003) ^ hashCode;
        AdErrorEvent adErrorEvent = this.adErrorEvent;
        if (adErrorEvent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = adErrorEvent.hashCode();
        }
        int i4 = ((((i3 * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003;
        zzbi zzbiVar = this.loggableException;
        if (zzbiVar != null) {
            i = zzbiVar.hashCode();
        }
        return i4 ^ i;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbi loggableException() {
        return this.loggableException;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public zzbf method() {
        return this.method;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbg
    public long timestamp() {
        return this.timestamp;
    }

    public String toString() {
        long j = this.timestamp;
        String valueOf = String.valueOf(this.component);
        String valueOf2 = String.valueOf(this.method);
        String valueOf3 = String.valueOf(this.adErrorEvent);
        String valueOf4 = String.valueOf(this.loggableException);
        StringBuilder sb = new StringBuilder("InstrumentationData{timestamp=");
        sb.append(j);
        sb.append(", component=");
        sb.append(valueOf);
        a.c(sb, ", method=", valueOf2, ", adErrorEvent=", valueOf3);
        return com.amazon.aps.iva.n4.a.a(sb, ", loggableException=", valueOf4, "}");
    }
}
