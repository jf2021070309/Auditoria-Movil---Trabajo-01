package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfnd<K, V> extends zzfng<K, V> implements Serializable {
    private transient Map<K, Collection<V>> zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfnd(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzm(zzfnd zzfndVar, Object obj) {
        Map<K, Collection<V>> map = zzfndVar.zza;
        Collection<V> collection = null;
        if (map != null) {
            try {
                collection = map.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
            }
            Collection<V> collection2 = collection;
            if (collection2 != null) {
                int size = collection2.size();
                collection2.clear();
                zzfndVar.zzb -= size;
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <E> Collection<E> zza(Collection<E> collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection<V> zzb(K k, Collection<V> collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection<V> zzc();

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final int zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfng, com.google.android.gms.internal.ads.zzfpj
    public final boolean zzh(K k, V v) {
        Collection<V> collection = this.zza.get(k);
        if (collection == null) {
            Collection<V> zzc = zzc();
            if (zzc.add(v)) {
                this.zzb++;
                this.zza.put(k, zzc);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(v)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpj
    public final void zzi() {
        for (Collection<V> collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> zzj(K k, List<V> list, @CheckForNull zzfna zzfnaVar) {
        if (list instanceof RandomAccess) {
            return new zzfmw(this, k, list, zzfnaVar);
        }
        return new zzfnc(this, k, list, zzfnaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    Set<K> zzk() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> zzl() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfmv(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfmy(this, (SortedMap) map);
        }
        return new zzfmt(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    final Collection<V> zzn() {
        return new zzfnf(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfng
    public final Iterator<V> zzo() {
        return new zzfmn(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfng
    Map<K, Collection<V>> zzp() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> zzq() {
        Map<K, Collection<V>> map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfmu(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfmx(this, (SortedMap) map);
        }
        return new zzfmq(this, map);
    }
}
