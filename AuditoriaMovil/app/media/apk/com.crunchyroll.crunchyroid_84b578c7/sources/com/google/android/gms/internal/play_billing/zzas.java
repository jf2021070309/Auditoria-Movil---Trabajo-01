package com.google.android.gms.internal.play_billing;

import com.google.common.primitives.UnsignedBytes;
import java.util.Comparator;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes3.dex */
final class zzas implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzba zzbaVar = (zzba) obj;
        zzba zzbaVar2 = (zzba) obj2;
        zzar zzarVar = new zzar(zzbaVar);
        zzar zzarVar2 = new zzar(zzbaVar2);
        while (zzarVar.hasNext() && zzarVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzarVar.zza() & UnsignedBytes.MAX_VALUE).compareTo(Integer.valueOf(zzarVar2.zza() & UnsignedBytes.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzbaVar.zzd()).compareTo(Integer.valueOf(zzbaVar2.zzd()));
    }
}
