package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.n4.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzabl implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ Class zzb;
    final /* synthetic */ zzxi zzc;

    public zzabl(Class cls, Class cls2, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = cls2;
        this.zzc = zzxiVar;
    }

    public final String toString() {
        String name = this.zzb.getName();
        String name2 = this.zza.getName();
        return b.c(a.b("Factory[type=", name, "+", name2, ",adapter="), this.zzc.toString(), "]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class zzc = zzactVar.zzc();
        if (zzc != this.zza && zzc != this.zzb) {
            return null;
        }
        return this.zzc;
    }
}
