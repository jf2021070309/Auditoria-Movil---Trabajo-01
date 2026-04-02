package com.google.android.gms.internal.cast;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzsm implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzsu zzsuVar = (zzsu) obj;
        zzsu zzsuVar2 = (zzsu) obj2;
        zzsl zzslVar = new zzsl(zzsuVar);
        zzsl zzslVar2 = new zzsl(zzsuVar2);
        while (zzslVar.hasNext() && zzslVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzslVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzslVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzsuVar.zzd()).compareTo(Integer.valueOf(zzsuVar2.zzd()));
    }
}
