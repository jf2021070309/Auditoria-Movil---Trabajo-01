package com.google.android.gms.internal.cast;

import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
public abstract class zzfu extends zzfm implements Set {
    private transient zzfq zza;

    public static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return Ints.MAX_POWER_OF_TWO;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzfu zzj(Collection collection) {
        Object[] array = collection.toArray();
        return zzm(array.length, array);
    }

    public static zzfu zzk() {
        return zzgd.zza;
    }

    private static zzfu zzm(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzh = zzh(i);
                Object[] objArr2 = new Object[zzh];
                int i2 = zzh - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zzfw.zza(obj, i5);
                    int hashCode = obj.hashCode();
                    int zza = zzfj.zza(hashCode);
                    while (true) {
                        int i6 = zza & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzgf(obj3);
                }
                if (zzh(i4) < zzh / 2) {
                    return zzm(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new zzgd(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzgf(obj4);
        }
        return zzgd.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfu) && zzl() && ((zzfu) obj).zzl() && hashCode() != obj.hashCode()) {
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
        return zzge.zza(this);
    }

    @Override // com.google.android.gms.internal.cast.zzfm
    public zzfq zzd() {
        zzfq zzfqVar = this.zza;
        if (zzfqVar == null) {
            zzfq zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfqVar;
    }

    @Override // com.google.android.gms.internal.cast.zzfm, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzgg iterator();

    public zzfq zzi() {
        Object[] array = toArray();
        int i = zzfq.zzd;
        return zzfq.zzi(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
