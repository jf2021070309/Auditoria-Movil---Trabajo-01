package com.google.android.gms.internal.auth;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* loaded from: classes.dex */
public class zzgl<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private final int zza;
    private boolean zzd;
    private volatile zzgk zze;
    private List<zzgi> zzb = Collections.emptyList();
    private Map<K, V> zzc = Collections.emptyMap();
    private Map<K, V> zzf = Collections.emptyMap();

    private final int zzk(K k2) {
        int size = this.zzb.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.zzb.get(size).zza());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.zzb.get(i3).zza());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzl(int i2) {
        zzn();
        V v = (V) this.zzb.remove(i2).getValue();
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzm().entrySet().iterator();
            List<zzgi> list = this.zzb;
            Map.Entry<K, V> next = it.next();
            list.add(new zzgi(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final SortedMap<K, V> zzm() {
        zzn();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzn() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzn();
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zzk(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzgk(this, null);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgl) {
            zzgl zzglVar = (zzgl) obj;
            int size = size();
            if (size != zzglVar.size()) {
                return false;
            }
            int zzb = zzb();
            if (zzb == zzglVar.zzb()) {
                for (int i2 = 0; i2 < zzb; i2++) {
                    if (!zzg(i2).equals(zzglVar.zzg(i2))) {
                        return false;
                    }
                }
                if (zzb != size) {
                    return this.zzc.equals(zzglVar.zzc);
                }
                return true;
            }
            return entrySet().equals(zzglVar.entrySet());
        }
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        return zzk >= 0 ? (V) this.zzb.get(zzk).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int zzb = zzb();
        int i2 = 0;
        for (int i3 = 0; i3 < zzb; i3++) {
            i2 += this.zzb.get(i3).hashCode();
        }
        return this.zzc.size() > 0 ? this.zzc.hashCode() + i2 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        zzn();
        Comparable comparable = (Comparable) obj;
        int zzk = zzk(comparable);
        if (zzk >= 0) {
            return (V) zzl(zzk);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zzc.size() + this.zzb.size();
    }

    public void zza() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final Iterable<Map.Entry<K, V>> zzc() {
        return this.zzc.isEmpty() ? zzgh.zza() : this.zzc.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: zze */
    public final V put(K k2, V v) {
        zzn();
        int zzk = zzk(k2);
        if (zzk >= 0) {
            return (V) this.zzb.get(zzk).setValue(v);
        }
        zzn();
        if (this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        int i2 = -(zzk + 1);
        if (i2 >= this.zza) {
            return zzm().put(k2, v);
        }
        int size = this.zzb.size();
        int i3 = this.zza;
        if (size == i3) {
            zzgi remove = this.zzb.remove(i3 - 1);
            zzm().put((K) remove.zza(), (V) remove.getValue());
        }
        this.zzb.add(i2, new zzgi(this, k2, v));
        return null;
    }

    public final Map.Entry<K, V> zzg(int i2) {
        return this.zzb.get(i2);
    }

    public final boolean zzj() {
        return this.zzd;
    }
}
