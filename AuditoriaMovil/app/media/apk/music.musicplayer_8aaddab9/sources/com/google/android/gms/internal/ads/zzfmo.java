package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfmo extends zzfpe {
    public final /* synthetic */ zzfmq zza;

    public zzfmo(zzfmq zzfmqVar) {
        this.zza = zzfmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        Objects.requireNonNull(entrySet);
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new zzfmp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzfnd.zzm(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    public final Map zza() {
        return this.zza;
    }
}
