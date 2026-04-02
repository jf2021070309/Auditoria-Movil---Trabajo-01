package com.google.android.gms.internal.measurement;

import java.util.Comparator;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.0 */
/* loaded from: classes2.dex */
final class zziw implements Comparator<zzjd> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzjd zzjdVar, zzjd zzjdVar2) {
        zzjd zzjdVar3 = zzjdVar;
        zzjd zzjdVar4 = zzjdVar2;
        zziv zzivVar = new zziv(zzjdVar3);
        zziv zzivVar2 = new zziv(zzjdVar4);
        while (zzivVar.hasNext() && zzivVar2.hasNext()) {
            int compare = Integer.compare(zzivVar.zza() & UByte.MAX_VALUE, zzivVar2.zza() & UByte.MAX_VALUE);
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzjdVar3.zzc(), zzjdVar4.zzc());
    }
}
