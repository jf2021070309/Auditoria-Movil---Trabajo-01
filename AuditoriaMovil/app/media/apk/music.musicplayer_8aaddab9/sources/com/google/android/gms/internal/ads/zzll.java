package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* loaded from: classes.dex */
public final /* synthetic */ class zzll implements Comparator {
    public static final Comparator zza = new zzll();

    private zzll() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((zzln) obj).zzc, ((zzln) obj2).zzc);
    }
}
