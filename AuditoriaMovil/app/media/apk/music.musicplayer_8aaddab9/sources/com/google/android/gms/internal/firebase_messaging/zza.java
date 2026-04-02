package com.google.android.gms.internal.firebase_messaging;

import e.d.d.p.d;
import e.d.d.p.e;
import e.d.d.p.f;
import e.d.d.w.c1.a;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zza implements e<a> {
    public static final zza zza = new zza();
    private static final d zzb;
    private static final d zzc;
    private static final d zzd;
    private static final d zze;
    private static final d zzf;
    private static final d zzg;
    private static final d zzh;
    private static final d zzi;
    private static final d zzj;
    private static final d zzk;
    private static final d zzl;
    private static final d zzm;
    private static final d zzn;
    private static final d zzo;
    private static final d zzp;

    static {
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzs zzb2 = zzoVar.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put(zzb2.annotationType(), zzb2);
        zzb = new d("projectNumber", hashMap == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap), null);
        zzo zzoVar2 = new zzo();
        zzoVar2.zza(2);
        zzs zzb3 = zzoVar2.zzb();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(zzb3.annotationType(), zzb3);
        zzc = new d("messageId", hashMap2 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap2), null);
        zzo zzoVar3 = new zzo();
        zzoVar3.zza(3);
        zzs zzb4 = zzoVar3.zzb();
        HashMap hashMap3 = new HashMap();
        hashMap3.put(zzb4.annotationType(), zzb4);
        zzd = new d("instanceId", hashMap3 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap3), null);
        zzo zzoVar4 = new zzo();
        zzoVar4.zza(4);
        zzs zzb5 = zzoVar4.zzb();
        HashMap hashMap4 = new HashMap();
        hashMap4.put(zzb5.annotationType(), zzb5);
        zze = new d("messageType", hashMap4 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap4), null);
        zzo zzoVar5 = new zzo();
        zzoVar5.zza(5);
        zzs zzb6 = zzoVar5.zzb();
        HashMap hashMap5 = new HashMap();
        hashMap5.put(zzb6.annotationType(), zzb6);
        zzf = new d("sdkPlatform", hashMap5 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap5), null);
        zzo zzoVar6 = new zzo();
        zzoVar6.zza(6);
        zzs zzb7 = zzoVar6.zzb();
        HashMap hashMap6 = new HashMap();
        hashMap6.put(zzb7.annotationType(), zzb7);
        zzg = new d("packageName", hashMap6 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap6), null);
        zzo zzoVar7 = new zzo();
        zzoVar7.zza(7);
        zzs zzb8 = zzoVar7.zzb();
        HashMap hashMap7 = new HashMap();
        hashMap7.put(zzb8.annotationType(), zzb8);
        zzh = new d("collapseKey", hashMap7 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap7), null);
        zzo zzoVar8 = new zzo();
        zzoVar8.zza(8);
        zzs zzb9 = zzoVar8.zzb();
        HashMap hashMap8 = new HashMap();
        hashMap8.put(zzb9.annotationType(), zzb9);
        zzi = new d("priority", hashMap8 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap8), null);
        zzo zzoVar9 = new zzo();
        zzoVar9.zza(9);
        zzs zzb10 = zzoVar9.zzb();
        HashMap hashMap9 = new HashMap();
        hashMap9.put(zzb10.annotationType(), zzb10);
        zzj = new d("ttl", hashMap9 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap9), null);
        zzo zzoVar10 = new zzo();
        zzoVar10.zza(10);
        zzs zzb11 = zzoVar10.zzb();
        HashMap hashMap10 = new HashMap();
        hashMap10.put(zzb11.annotationType(), zzb11);
        zzk = new d("topic", hashMap10 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap10), null);
        zzo zzoVar11 = new zzo();
        zzoVar11.zza(11);
        zzs zzb12 = zzoVar11.zzb();
        HashMap hashMap11 = new HashMap();
        hashMap11.put(zzb12.annotationType(), zzb12);
        zzl = new d("bulkId", hashMap11 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap11), null);
        zzo zzoVar12 = new zzo();
        zzoVar12.zza(12);
        zzs zzb13 = zzoVar12.zzb();
        HashMap hashMap12 = new HashMap();
        hashMap12.put(zzb13.annotationType(), zzb13);
        zzm = new d("event", hashMap12 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap12), null);
        zzo zzoVar13 = new zzo();
        zzoVar13.zza(13);
        zzs zzb14 = zzoVar13.zzb();
        HashMap hashMap13 = new HashMap();
        hashMap13.put(zzb14.annotationType(), zzb14);
        zzn = new d("analyticsLabel", hashMap13 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap13), null);
        zzo zzoVar14 = new zzo();
        zzoVar14.zza(14);
        zzs zzb15 = zzoVar14.zzb();
        HashMap hashMap14 = new HashMap();
        hashMap14.put(zzb15.annotationType(), zzb15);
        zzo = new d("campaignId", hashMap14 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap14), null);
        zzo zzoVar15 = new zzo();
        zzoVar15.zza(15);
        zzs zzb16 = zzoVar15.zzb();
        HashMap hashMap15 = new HashMap();
        hashMap15.put(zzb16.annotationType(), zzb16);
        zzp = new d("composerLabel", hashMap15 == null ? Collections.emptyMap() : e.a.d.a.a.C(hashMap15), null);
    }

    private zza() {
    }

    @Override // e.d.d.p.b
    public final void encode(Object obj, f fVar) throws IOException {
        a aVar = (a) obj;
        f fVar2 = fVar;
        fVar2.add(zzb, aVar.f7639b);
        fVar2.add(zzc, aVar.f7640c);
        fVar2.add(zzd, aVar.f7641d);
        fVar2.add(zze, aVar.f7642e);
        fVar2.add(zzf, aVar.f7643f);
        fVar2.add(zzg, aVar.f7644g);
        fVar2.add(zzh, aVar.f7645h);
        fVar2.add(zzi, aVar.f7646i);
        fVar2.add(zzj, aVar.f7647j);
        fVar2.add(zzk, aVar.f7648k);
        fVar2.add(zzl, aVar.f7649l);
        fVar2.add(zzm, aVar.f7650m);
        fVar2.add(zzn, aVar.f7651n);
        fVar2.add(zzo, aVar.o);
        fVar2.add(zzp, aVar.p);
    }
}
