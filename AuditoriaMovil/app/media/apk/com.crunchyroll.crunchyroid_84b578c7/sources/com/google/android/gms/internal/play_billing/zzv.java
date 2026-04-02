package com.google.android.gms.internal.play_billing;

import com.amazon.aps.iva.n4.a;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzv {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzv(Object obj, Object obj2, Object obj3) {
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
