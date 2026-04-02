package com.google.ads.interactivemedia.v3.internal;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzst<E> extends zzsk<E> implements Set<E> {
    private transient zzso zza;

    private static zzst zzh(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzj = zzj(i);
                Object[] objArr2 = new Object[zzj];
                int i2 = zzj - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zztg.zza(obj, i5);
                    int hashCode = obj.hashCode();
                    int zzb = zzsi.zzb(hashCode);
                    while (true) {
                        int i6 = zzb & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            zzb++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zztt(obj3);
                }
                if (zzj(i4) < zzj / 2) {
                    return zzh(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzto(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zztt(obj4);
        }
        return zzto.zza;
    }

    public static int zzj(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        zzrm.zze(z, "collection too large");
        return Ints.MAX_POWER_OF_TWO;
    }

    public static zzst zzl(Collection collection) {
        if ((collection instanceof zzst) && !(collection instanceof SortedSet)) {
            zzst zzstVar = (zzst) collection;
            if (!zzstVar.zzf()) {
                return zzstVar;
            }
        }
        Object[] array = collection.toArray();
        return zzh(array.length, array);
    }

    public static zzst zzm(Object obj) {
        return new zztt(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzst) && zzi() && ((zzst) obj).zzi() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzts.zza(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public zzso zzd() {
        zzso zzsoVar = this.zza;
        if (zzsoVar == null) {
            zzso zzk = zzk();
            this.zza = zzk;
            return zzk;
        }
        return zzsoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zztw iterator();

    boolean zzi() {
        return false;
    }

    public zzso zzk() {
        Object[] array = toArray();
        int i = zzso.zzd;
        return zzso.zzj(array, array.length);
    }
}
