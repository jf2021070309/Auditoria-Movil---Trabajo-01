package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzfpd {
    private final zzfob zza;
    private final zzfpc zzb;

    private zzfpd(zzfpc zzfpcVar) {
        zzfoa zzfoaVar = zzfoa.zza;
        this.zzb = zzfpcVar;
        this.zza = zzfoaVar;
    }

    public static zzfpd zzb(int i) {
        return new zzfpd(new zzfoz(4000));
    }

    public static zzfpd zzc(zzfob zzfobVar) {
        return new zzfpd(new zzfox(zzfobVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zzb.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfpa(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
