package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class zzfns<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();
    @CheckForNull
    public transient int[] zza;
    @CheckForNull
    public transient Object[] zzb;
    @CheckForNull
    public transient Object[] zzc;
    @CheckForNull
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    @CheckForNull
    private transient Set<K> zzh;
    @CheckForNull
    private transient Set<Map.Entry<K, V>> zzi;
    @CheckForNull
    private transient Collection<V> zzj;

    public zzfns() {
        zze(3);
    }

    public zzfns(int i2) {
        zze(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        iArr.getClass();
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        objArr.getClass();
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        objArr.getClass();
        return objArr;
    }

    public static /* synthetic */ Object zzo(zzfns zzfnsVar) {
        Object obj = zzfnsVar.zze;
        obj.getClass();
        return obj;
    }

    public static /* synthetic */ Object zzs(zzfns zzfnsVar, int i2) {
        return zzfnsVar.zzB()[i2];
    }

    public static /* synthetic */ Object zzt(zzfns zzfnsVar, int i2) {
        return zzfnsVar.zzC()[i2];
    }

    public static /* synthetic */ void zzu(zzfns zzfnsVar, int i2, Object obj) {
        zzfnsVar.zzC()[i2] = obj;
    }

    private final void zzv(int i2) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i2)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i2, int i3, int i4, int i5) {
        Object zza = zzfnt.zza(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            zzfnt.zzc(zza, i4 & i6, i5 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzA = zzA();
        for (int i7 = 0; i7 <= i2; i7++) {
            int zzb = zzfnt.zzb(obj, i7);
            while (zzb != 0) {
                int i8 = zzb - 1;
                int i9 = zzA[i8];
                int i10 = ((i2 ^ (-1)) & i9) | i7;
                int i11 = i10 & i6;
                int zzb2 = zzfnt.zzb(zza, i11);
                zzfnt.zzc(zza, i11, zzb);
                zzA[i8] = ((i6 ^ (-1)) & i10) | (zzb2 & i6);
                zzb = i9 & i2;
            }
        }
        this.zze = zza;
        zzv(i6);
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzy(@CheckForNull Object obj) {
        if (zzf()) {
            return -1;
        }
        int zzb = zzfob.zzb(obj);
        int zzw = zzw();
        Object obj2 = this.zze;
        obj2.getClass();
        int zzb2 = zzfnt.zzb(obj2, zzb & zzw);
        if (zzb2 != 0) {
            int i2 = zzw ^ (-1);
            int i3 = zzb & i2;
            do {
                int i4 = zzb2 - 1;
                int i5 = zzA()[i4];
                if ((i5 & i2) == i3 && zzflt.zza(obj, zzB()[i4])) {
                    return i4;
                }
                zzb2 = i5 & zzw;
            } while (zzb2 != 0);
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzz(@CheckForNull Object obj) {
        if (zzf()) {
            return zzd;
        }
        int zzw = zzw();
        Object obj2 = this.zze;
        obj2.getClass();
        int zze = zzfnt.zze(obj, null, zzw, obj2, zzA(), zzB(), null);
        if (zze == -1) {
            return zzd;
        }
        Object obj3 = zzC()[zze];
        zzl(zze, zzw);
        this.zzg--;
        zzi();
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzf()) {
            return;
        }
        zzi();
        Map<K, V> zzg = zzg();
        if (zzg != null) {
            this.zzf = zzfqr.zza(size(), 3, 1073741823);
            zzg.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        obj.getClass();
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        Map<K, V> zzg = zzg();
        return zzg != null ? zzg.containsKey(obj) : zzy(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> zzg = zzg();
        if (zzg == null) {
            for (int i2 = 0; i2 < this.zzg; i2++) {
                if (zzflt.zza(obj, zzC()[i2])) {
                    return true;
                }
            }
            return false;
        }
        return zzg.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.zzi;
        if (set == null) {
            zzfnm zzfnmVar = new zzfnm(this);
            this.zzi = zzfnmVar;
            return zzfnmVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object obj) {
        Map<K, V> zzg = zzg();
        if (zzg != null) {
            return zzg.get(obj);
        }
        int zzy = zzy(obj);
        if (zzy == -1) {
            return null;
        }
        return (V) zzC()[zzy];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.zzh;
        if (set == null) {
            zzfno zzfnoVar = new zzfno(this);
            this.zzh = zzfnoVar;
            return zzfnoVar;
        }
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V put(K k2, V v) {
        int min;
        if (zzf()) {
            zzflx.zzb(zzf(), "Arrays already allocated");
            int i2 = this.zzf;
            int max = Math.max(i2 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfnt.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i2];
            this.zzb = new Object[i2];
            this.zzc = new Object[i2];
        }
        Map<K, V> zzg = zzg();
        if (zzg != null) {
            return zzg.put(k2, v);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i3 = this.zzg;
        int i4 = i3 + 1;
        int zzb = zzfob.zzb(k2);
        int zzw = zzw();
        int i5 = zzb & zzw;
        Object obj = this.zze;
        obj.getClass();
        int zzb2 = zzfnt.zzb(obj, i5);
        if (zzb2 != 0) {
            int i6 = zzw ^ (-1);
            int i7 = zzb & i6;
            int i8 = 0;
            while (true) {
                int i9 = zzb2 - 1;
                int i10 = zzA[i9];
                int i11 = i10 & i6;
                if (i11 == i7 && zzflt.zza(k2, zzB[i9])) {
                    V v2 = (V) zzC[i9];
                    zzC[i9] = v;
                    return v2;
                }
                int i12 = i10 & zzw;
                i8++;
                if (i12 != 0) {
                    zzb2 = i12;
                } else if (i8 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(zzw() + 1, 1.0f);
                    int zzm = zzm();
                    while (zzm >= 0) {
                        linkedHashMap.put(zzB()[zzm], zzC()[zzm]);
                        zzm = zzn(zzm);
                    }
                    this.zze = linkedHashMap;
                    this.zza = null;
                    this.zzb = null;
                    this.zzc = null;
                    zzi();
                    return (V) linkedHashMap.put(k2, v);
                } else if (i4 > zzw) {
                    zzw = zzx(zzw, zzfnt.zzd(zzw), zzb, i3);
                } else {
                    zzA[i9] = (i4 & zzw) | i11;
                }
            }
        } else if (i4 > zzw) {
            zzw = zzx(zzw, zzfnt.zzd(zzw), zzb, i3);
        } else {
            Object obj2 = this.zze;
            obj2.getClass();
            zzfnt.zzc(obj2, i5, i4);
        }
        int length = zzA().length;
        if (i4 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i3] = (zzw ^ (-1)) & zzb;
        zzB()[i3] = k2;
        zzC()[i3] = v;
        this.zzg = i4;
        zzi();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public final V remove(@CheckForNull Object obj) {
        Map<K, V> zzg = zzg();
        if (zzg != null) {
            return zzg.remove(obj);
        }
        V v = (V) zzz(obj);
        if (v == zzd) {
            return null;
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> zzg = zzg();
        return zzg != null ? zzg.size() : this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.zzj;
        if (collection == null) {
            zzfnr zzfnrVar = new zzfnr(this);
            this.zzj = zzfnrVar;
            return zzfnrVar;
        }
        return collection;
    }

    public final void zze(int i2) {
        this.zzf = zzfqr.zza(i2, 1, 1073741823);
    }

    public final boolean zzf() {
        return this.zze == null;
    }

    @CheckForNull
    public final Map<K, V> zzg() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzi() {
        this.zzf += 32;
    }

    public final void zzl(int i2, int i3) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size() - 1;
        if (i2 >= size) {
            zzB[i2] = null;
            zzC[i2] = null;
            zzA[i2] = 0;
            return;
        }
        Object obj2 = zzB[size];
        zzB[i2] = obj2;
        zzC[i2] = zzC[size];
        zzB[size] = null;
        zzC[size] = null;
        zzA[i2] = zzA[size];
        zzA[size] = 0;
        int zzb = zzfob.zzb(obj2) & i3;
        int zzb2 = zzfnt.zzb(obj, zzb);
        int i4 = size + 1;
        if (zzb2 == i4) {
            zzfnt.zzc(obj, zzb, i2 + 1);
            return;
        }
        while (true) {
            int i5 = zzb2 - 1;
            int i6 = zzA[i5];
            int i7 = i6 & i3;
            if (i7 == i4) {
                zzA[i5] = ((i2 + 1) & i3) | (i6 & (i3 ^ (-1)));
                return;
            }
            zzb2 = i7;
        }
    }

    public final int zzm() {
        return isEmpty() ? -1 : 0;
    }

    public final int zzn(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.zzg) {
            return i3;
        }
        return -1;
    }
}
