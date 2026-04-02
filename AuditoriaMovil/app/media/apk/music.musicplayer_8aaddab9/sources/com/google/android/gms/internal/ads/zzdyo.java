package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
/* loaded from: classes.dex */
public final /* synthetic */ class zzdyo implements zzfrk {
    public static final zzfrk zza = new zzdyo();

    private zzdyo() {
    }

    @Override // com.google.android.gms.internal.ads.zzfrk
    public final zzfsm zza(Object obj) {
        return zzfsd.zzc(((ExecutionException) obj).getCause());
    }
}
