package com.google.android.gms.internal.pal;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zzabq implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzaby zzabyVar = (zzaby) obj;
        zzaby zzabyVar2 = (zzaby) obj2;
        zzabp zzabpVar = new zzabp(zzabyVar);
        zzabp zzabpVar2 = new zzabp(zzabyVar2);
        while (zzabpVar.hasNext() && zzabpVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzabpVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzabpVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzabyVar.zzd()).compareTo(Integer.valueOf(zzabyVar2.zzd()));
    }
}
