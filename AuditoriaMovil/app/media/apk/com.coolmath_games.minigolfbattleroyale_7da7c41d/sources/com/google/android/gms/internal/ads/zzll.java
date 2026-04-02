package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final /* synthetic */ class zzll implements Comparator {
    static final Comparator zza = new zzll();

    private zzll() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((zzln) obj).zzc, ((zzln) obj2).zzc);
    }
}
