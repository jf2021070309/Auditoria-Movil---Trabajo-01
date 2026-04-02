package com.google.android.gms.internal.firebase_messaging;

import e.d.d.p.c;
import e.d.d.p.e;
import e.d.d.p.f;
import e.d.d.p.g;
import e.d.d.p.i.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzw implements b<zzw> {
    public static final /* synthetic */ int zza = 0;
    private static final e<Object> zzb = new e() { // from class: com.google.android.gms.internal.firebase_messaging.zzv
        @Override // e.d.d.p.b
        public final void encode(Object obj, f fVar) {
            int i2 = zzw.zza;
            String valueOf = String.valueOf(obj.getClass().getCanonicalName());
            throw new c(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
        }
    };
    private final Map<Class<?>, e<?>> zzc = new HashMap();
    private final Map<Class<?>, g<?>> zzd = new HashMap();
    private final e<Object> zze = zzb;

    @Override // e.d.d.p.i.b
    public final /* bridge */ /* synthetic */ zzw registerEncoder(Class cls, e eVar) {
        this.zzc.put(cls, eVar);
        this.zzd.remove(cls);
        return this;
    }

    public final /* bridge */ /* synthetic */ b registerEncoder(Class cls, g gVar) {
        this.zzd.put(cls, gVar);
        this.zzc.remove(cls);
        return this;
    }

    public final zzx zza() {
        return new zzx(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }
}
