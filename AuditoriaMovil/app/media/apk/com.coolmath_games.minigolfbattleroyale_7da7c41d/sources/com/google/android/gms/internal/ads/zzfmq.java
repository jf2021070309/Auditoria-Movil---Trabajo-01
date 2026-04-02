package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfmq extends zzfph {
    final transient Map zza;
    final /* synthetic */ zzfnd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmq(zzfnd zzfndVar, Map map) {
        this.zzb = zzfndVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.zza;
        map = this.zzb.zza;
        if (map2 == map) {
            this.zzb.zzi();
        } else {
            zzfox.zzb(new zzfmp(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map map = this.zza;
        if (map != null) {
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object get(@CheckForNull Object obj) {
        Collection collection = (Collection) zzfpi.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfph, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzs();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final /* bridge */ /* synthetic */ Object remove(@CheckForNull Object obj) {
        int i;
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zzc = this.zzb.zzc();
        zzc.addAll(collection);
        zzfnd zzfndVar = this.zzb;
        i = zzfndVar.zzb;
        zzfndVar.zzb = i - collection.size();
        collection.clear();
        return zzc;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    protected final Set<Map.Entry> zza() {
        return new zzfmo(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry zzb(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfof(key, this.zzb.zzb(key, (Collection) entry.getValue()));
    }
}
