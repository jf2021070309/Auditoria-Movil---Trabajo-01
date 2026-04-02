package com.google.android.gms.internal.firebase_messaging;

import e.d.d.p.d;
import e.d.d.p.e;
import e.d.d.p.f;
import java.io.IOException;
/* loaded from: classes.dex */
public final class zzc implements e<zze> {
    public static final zzc zza = new zzc();
    private static final d zzb = d.a("messagingClientEventExtension");

    private zzc() {
    }

    @Override // e.d.d.p.b
    public final /* bridge */ /* synthetic */ void encode(Object obj, f fVar) throws IOException {
        fVar.add(zzb, ((zze) obj).zza());
    }
}
