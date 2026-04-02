package com.google.android.gms.internal.ads;

import java.util.Comparator;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzgeo implements Comparator<zzgex> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzgex zzgexVar, zzgex zzgexVar2) {
        zzgex zzgexVar3 = zzgexVar;
        zzgex zzgexVar4 = zzgexVar2;
        zzger it = zzgexVar3.iterator();
        zzger it2 = zzgexVar4.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compare = Integer.compare(it.zza() & UByte.MAX_VALUE, it2.zza() & UByte.MAX_VALUE);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzgexVar3.zzc(), zzgexVar4.zzc());
    }
}
