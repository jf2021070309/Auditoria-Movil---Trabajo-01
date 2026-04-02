package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzgih implements Iterator<Map.Entry> {
    public final /* synthetic */ zzgik zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator<Map.Entry> zzd;

    private final Iterator<Map.Entry> zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i2 = this.zzb + 1;
        list = this.zza.zzb;
        if (i2 >= list.size()) {
            map = this.zza.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Map.Entry next() {
        List list;
        List list2;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        list = this.zza.zzb;
        if (i2 < list.size()) {
            list2 = this.zza.zzb;
            return (Map.Entry) list2.get(this.zzb);
        }
        return zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzm();
        int i2 = this.zzb;
        list = this.zza.zzb;
        if (i2 >= list.size()) {
            zza().remove();
            return;
        }
        zzgik zzgikVar = this.zza;
        int i3 = this.zzb;
        this.zzb = i3 - 1;
        zzgikVar.zzk(i3);
    }
}
