package com.google.android.gms.internal.firebase_messaging;

import e.d.d.p.i.a;
import e.d.d.p.i.b;
/* loaded from: classes.dex */
public final class zzd implements a {
    public static final a zza = new zzd();

    private zzd() {
    }

    @Override // e.d.d.p.i.a
    public final void configure(b<?> bVar) {
        bVar.registerEncoder(zze.class, zzc.zza);
        bVar.registerEncoder(e.d.d.w.c1.b.class, zzb.zza);
        bVar.registerEncoder(e.d.d.w.c1.a.class, zza.zza);
    }
}
