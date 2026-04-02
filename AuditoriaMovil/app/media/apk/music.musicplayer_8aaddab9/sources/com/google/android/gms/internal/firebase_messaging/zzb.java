package com.google.android.gms.internal.firebase_messaging;

import e.a.d.a.a;
import e.d.d.p.d;
import e.d.d.p.e;
import e.d.d.p.f;
import e.d.d.w.c1.b;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzb implements e<b> {
    public static final zzb zza = new zzb();
    private static final d zzb;

    static {
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzs zzb2 = zzoVar.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put(zzb2.annotationType(), zzb2);
        zzb = new d("messagingClientEvent", hashMap == null ? Collections.emptyMap() : a.C(hashMap), null);
    }

    private zzb() {
    }

    @Override // e.d.d.p.b
    public final void encode(Object obj, f fVar) throws IOException {
        fVar.add(zzb, ((b) obj).f7663b);
    }
}
