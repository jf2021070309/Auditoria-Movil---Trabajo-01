package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.n4.a;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzsp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzsp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(a.a(a.b("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
