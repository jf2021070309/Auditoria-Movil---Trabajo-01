package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfns<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Object zzd = new Object();
    @CheckForNull
    transient int[] zza;
    @CheckForNull
    transient Object[] zzb;
    @CheckForNull
    transient Object[] zzc;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfns() {
        zze(3);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzo(zzfns zzfnsVar) {
        Object obj = zzfnsVar.zze;
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzs(zzfns zzfnsVar, int i) {
        return zzfnsVar.zzB()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzt(zzfns zzfnsVar, int i) {
        return zzfnsVar.zzC()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzu(zzfns zzfnsVar, int i, Object obj) {
        zzfnsVar.zzC()[i] = obj;
    }

    private final void zzv(int i) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.zzf & (-32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw() {
        return (1 << (this.zzf & 31)) - 1;
    }

    private final int zzx(int i, int i2, int i3, int i4) {
        Object zza = zzfnt.zza(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            zzfnt.zzc(zza, i3 & i5, i4 + 1);
        }
        Object obj = this.zze;
        obj.getClass();
        int[] zzA = zzA();
        for (int i6 = 0; i6 <= i; i6++) {
            int zzb = zzfnt.zzb(obj, i6);
            while (zzb != 0) {
                int i7 = zzb - 1;
                int i8 = zzA[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int zzb2 = zzfnt.zzb(zza, i10);
                zzfnt.zzc(zza, i10, zzb);
                zzA[i7] = ((~i5) & i9) | (zzb2 & i5);
                zzb = i8 & i;
            }
        }
        this.zze = zza;
        zzv(i5);
        return i5;
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
            int i = ~zzw;
            int i2 = zzb & i;
            do {
                int i3 = zzb2 - 1;
                int i4 = zzA()[i3];
                if ((i4 & i) == i2 && zzflt.zza(obj, zzB()[i3])) {
                    return i3;
                }
                zzb2 = i4 & zzw;
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
        if (zzg != null) {
            return zzg.containsKey(obj);
        }
        return zzy(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        Map<K, V> zzg = zzg();
        if (zzg == null) {
            for (int i = 0; i < this.zzg; i++) {
                if (zzflt.zza(obj, zzC()[i])) {
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
    public final V put(K k, V v) {
        int min;
        if (zzf()) {
            zzflx.zzb(zzf(), "Arrays already allocated");
            int i = this.zzf;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzfnt.zza(max2);
            zzv(max2 - 1);
            this.zza = new int[i];
            this.zzb = new Object[i];
            this.zzc = new Object[i];
        }
        Map<K, V> zzg = zzg();
        if (zzg != null) {
            return zzg.put(k, v);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i2 = this.zzg;
        int i3 = i2 + 1;
        int zzb = zzfob.zzb(k);
        int zzw = zzw();
        int i4 = zzb & zzw;
        Object obj = this.zze;
        obj.getClass();
        int zzb2 = zzfnt.zzb(obj, i4);
        if (zzb2 != 0) {
            int i5 = ~zzw;
            int i6 = zzb & i5;
            int i7 = 0;
            while (true) {
                int i8 = zzb2 - 1;
                int i9 = zzA[i8];
                int i10 = i9 & i5;
                if (i10 == i6 && zzflt.zza(k, zzB[i8])) {
                    V v2 = (V) zzC[i8];
                    zzC[i8] = v;
                    return v2;
                }
                int i11 = i9 & zzw;
                i7++;
                if (i11 != 0) {
                    zzb2 = i11;
                } else if (i7 >= 9) {
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
                    return (V) linkedHashMap.put(k, v);
                } else if (i3 > zzw) {
                    zzw = zzx(zzw, zzfnt.zzd(zzw), zzb, i2);
                } else {
                    zzA[i8] = (i3 & zzw) | i10;
                }
            }
        } else if (i3 > zzw) {
            zzw = zzx(zzw, zzfnt.zzd(zzw), zzb, i2);
        } else {
            Object obj2 = this.zze;
            obj2.getClass();
            zzfnt.zzc(obj2, i4, i3);
        }
        int length = zzA().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i2] = (~zzw) & zzb;
        zzB()[i2] = k;
        zzC()[i2] = v;
        this.zzg = i3;
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

    final void zze(int i) {
        this.zzf = zzfqr.zza(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf() {
        return this.zze == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @CheckForNull
    public final Map<K, V> zzg() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzi() {
        this.zzf += 32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzl(int i, int i2) {
        Object obj = this.zze;
        obj.getClass();
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = zzB[size];
            zzB[i] = obj2;
            zzC[i] = zzC[size];
            zzB[size] = null;
            zzC[size] = null;
            zzA[i] = zzA[size];
            zzA[size] = 0;
            int zzb = zzfob.zzb(obj2) & i2;
            int zzb2 = zzfnt.zzb(obj, zzb);
            int i3 = size + 1;
            if (zzb2 == i3) {
                zzfnt.zzc(obj, zzb, i + 1);
                return;
            }
            while (true) {
                int i4 = zzb2 - 1;
                int i5 = zzA[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    zzA[i4] = ((i + 1) & i2) | (i5 & (~i2));
                    return;
                }
                zzb2 = i6;
            }
        } else {
            zzB[i] = null;
            zzC[i] = null;
            zzA[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzm() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzn(int i) {
        int i2 = i + 1;
        if (i2 < this.zzg) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfns(int i) {
        zze(8);
    }
}
