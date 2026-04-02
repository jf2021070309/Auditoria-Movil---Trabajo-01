package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
/* loaded from: classes2.dex */
final class zzb implements Callable<Integer> {
    final /* synthetic */ SharedPreferences zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Integer zzc;

    public zzb(SharedPreferences sharedPreferences, String str, Integer num) {
        this.zza = sharedPreferences;
        this.zzb = str;
        this.zzc = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.zza.getInt(this.zzb, this.zzc.intValue()));
    }
}
