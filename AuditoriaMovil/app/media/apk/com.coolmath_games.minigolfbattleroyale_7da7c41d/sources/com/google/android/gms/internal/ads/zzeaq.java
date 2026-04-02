package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzeaq implements zzfrk {
    static final zzfrk zza = new zzeaq();

    private zzeaq() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm zza(Object obj) {
        return zzfsd.zzc(((ExecutionException) obj).getCause());
    }
}
