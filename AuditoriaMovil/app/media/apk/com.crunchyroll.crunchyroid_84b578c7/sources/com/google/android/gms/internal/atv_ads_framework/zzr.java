package com.google.android.gms.internal.atv_ads_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class zzr {
    private final zzk zza;
    private final zzp zzb;

    private zzr(zzp zzpVar, byte[] bArr) {
        zzj zzjVar = zzj.zza;
        this.zzb = zzpVar;
        this.zza = zzjVar;
    }

    public static zzr zzb(char c) {
        return new zzr(new zzp(new zzh(':')), null);
    }

    public final List zzc(CharSequence charSequence) {
        charSequence.getClass();
        zzo zzoVar = new zzo(this.zzb, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzoVar.hasNext()) {
            arrayList.add((String) zzoVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
