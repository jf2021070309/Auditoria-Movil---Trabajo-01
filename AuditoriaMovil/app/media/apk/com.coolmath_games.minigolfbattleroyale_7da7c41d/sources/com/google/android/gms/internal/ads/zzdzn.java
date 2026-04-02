package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzdzn implements zzfrk {
    static final zzfrk zza = new zzdzn();

    private zzdzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm zza(Object obj) {
        TimeoutException timeoutException = (TimeoutException) obj;
        return zzfsd.zzc(new zzdym(5));
    }
}
