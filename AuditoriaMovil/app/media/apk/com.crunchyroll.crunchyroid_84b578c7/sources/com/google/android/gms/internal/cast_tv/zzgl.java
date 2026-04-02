package com.google.android.gms.internal.cast_tv;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
final class zzgl implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgu zzguVar = (zzgu) obj;
        zzgu zzguVar2 = (zzgu) obj2;
        zzgk zzgkVar = new zzgk(zzguVar);
        zzgk zzgkVar2 = new zzgk(zzguVar2);
        while (zzgkVar.hasNext() && zzgkVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzgkVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzgkVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzguVar.zzd()).compareTo(Integer.valueOf(zzguVar2.zzd()));
    }
}
