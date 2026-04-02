package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.n4.a;
import java.io.IOException;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
final class zzabn extends zzxi {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzabo zzb;

    public zzabn(zzabo zzaboVar, Class cls) {
        this.zzb = zzaboVar;
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final Object read(zzacv zzacvVar) throws IOException {
        Object read = this.zzb.zzb.read(zzacvVar);
        if (read != null && !this.zza.isInstance(read)) {
            String name = this.zza.getName();
            String name2 = read.getClass().getName();
            String zzf = zzacvVar.zzf();
            StringBuilder b = a.b("Expected a ", name, " but was ", name2, "; at path ");
            b.append(zzf);
            throw new zzwz(b.toString());
        }
        return read;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final void write(zzacx zzacxVar, Object obj) throws IOException {
        this.zzb.zzb.write(zzacxVar, obj);
    }
}
