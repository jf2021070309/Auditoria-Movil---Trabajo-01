package com.google.android.gms.internal.cast_tv;

import java.util.AbstractList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzia extends AbstractList {
    private final List zza;
    private final zzhz zzb;

    public zzia(List list, zzhz zzhzVar) {
        this.zza = list;
        this.zzb = zzhzVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzci zzb = zzci.zzb(((Integer) this.zza.get(i)).intValue());
        if (zzb == null) {
            return zzci.CAST_TV_CLIENT_CAPABILITY_UNSPECIFIED;
        }
        return zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
