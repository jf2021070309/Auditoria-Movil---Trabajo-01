package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzaam<T> extends zzxi<T> {
    private final zzwm zza;
    private final zzxi zzb;
    private final Type zzc;

    public zzaam(zzwm zzwmVar, zzxi zzxiVar, Type type) {
        this.zza = zzwmVar;
        this.zzb = zzxiVar;
        this.zzc = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final T read(zzacv zzacvVar) throws IOException {
        return (T) this.zzb.read(zzacvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, T t) throws IOException {
        Class<?> cls;
        zzxi zza;
        zzxi zzxiVar = this.zzb;
        ?? r1 = this.zzc;
        if (t != null && ((r1 instanceof Class) || (r1 instanceof TypeVariable))) {
            cls = t.getClass();
        } else {
            cls = r1;
        }
        if (cls != r1) {
            zzxiVar = this.zza.zza(zzact.zzb(cls));
            if (zzxiVar instanceof zzaac) {
                zzxi zzxiVar2 = this.zzb;
                while ((zzxiVar2 instanceof zzaah) && (zza = ((zzaah) zzxiVar2).zza()) != zzxiVar2) {
                    zzxiVar2 = zza;
                }
                if (!(zzxiVar2 instanceof zzaac)) {
                    zzxiVar = this.zzb;
                }
            }
        }
        zzxiVar.write(zzacxVar, t);
    }
}
