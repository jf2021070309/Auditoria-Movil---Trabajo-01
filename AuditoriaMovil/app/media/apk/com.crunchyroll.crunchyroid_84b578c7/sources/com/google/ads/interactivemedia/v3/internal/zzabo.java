package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.e4.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzabo implements zzxj {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzxi zzb;

    public zzabo(Class cls, zzxi zzxiVar) {
        this.zza = cls;
        this.zzb = zzxiVar;
    }

    public final String toString() {
        return e.b("Factory[typeHierarchy=", this.zza.getName(), ",adapter=", this.zzb.toString(), "]");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        Class<?> zzc = zzactVar.zzc();
        if (!this.zza.isAssignableFrom(zzc)) {
            return null;
        }
        return new zzabn(this, zzc);
    }
}
