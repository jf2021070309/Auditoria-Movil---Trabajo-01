package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public final class zzgeo implements Comparator<zzgex> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzgex zzgexVar, zzgex zzgexVar2) {
        zzgex zzgexVar3 = zzgexVar;
        zzgex zzgexVar4 = zzgexVar2;
        zzger it = zzgexVar3.iterator();
        zzger it2 = zzgexVar4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = Integer.compare(it.zza() & 255, it2.zza() & 255);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzgexVar3.zzc(), zzgexVar4.zzc());
    }
}
