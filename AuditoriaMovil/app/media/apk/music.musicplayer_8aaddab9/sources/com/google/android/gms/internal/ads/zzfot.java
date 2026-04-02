package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public abstract class zzfot<E> extends zzfoe<E> implements Set<E> {
    @CheckForNull
    private transient zzfoj<E> zza;

    public static <E> zzfot<E> zzh() {
        return zzfqd.zza;
    }

    @SafeVarargs
    public static <E> zzfot<E> zzi(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        Object[] objArr = new Object[11];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, 5);
        return zzp(11, objArr);
    }

    public static int zzl(int i2) {
        double d2;
        int max = Math.max(i2, 2);
        if (max >= 751619276) {
            zzflx.zza(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1);
        do {
            highestOneBit += highestOneBit;
            d2 = highestOneBit;
            Double.isNaN(d2);
        } while (d2 * 0.7d < max);
        return highestOneBit;
    }

    public static <E> zzfos<E> zzo(int i2) {
        return new zzfos<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> zzfot<E> zzp(int i2, Object... objArr) {
        if (i2 != 0) {
            if (i2 == 1) {
                Object obj = objArr[0];
                obj.getClass();
                return new zzfqi(obj);
            }
            int zzl = zzl(i2);
            Object[] objArr2 = new Object[zzl];
            int i3 = zzl - 1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object obj2 = objArr[i6];
                zzfpv.zzb(obj2, i6);
                int hashCode = obj2.hashCode();
                int zza = zzfob.zza(hashCode);
                while (true) {
                    int i7 = zza & i3;
                    Object obj3 = objArr2[i7];
                    if (obj3 == null) {
                        objArr[i5] = obj2;
                        objArr2[i7] = obj2;
                        i4 += hashCode;
                        i5++;
                        break;
                    } else if (obj3.equals(obj2)) {
                        break;
                    } else {
                        zza++;
                    }
                }
            }
            Arrays.fill(objArr, i5, i2, (Object) null);
            if (i5 == 1) {
                Object obj4 = objArr[0];
                obj4.getClass();
                return new zzfqi(obj4, i4);
            } else if (zzl(i5) < zzl / 2) {
                return zzp(i5, objArr);
            } else {
                if (zzq(i5, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i5);
                }
                return new zzfqd(objArr, i4, objArr2, i3, i5);
            }
        }
        return zzfqd.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzq(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfot) && zzm() && ((zzfot) obj).zzm() && hashCode() != obj.hashCode()) {
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
        return zzfqh.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfoe, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract zzfql<E> iterator();

    @Override // com.google.android.gms.internal.ads.zzfoe
    public zzfoj<E> zze() {
        zzfoj<E> zzfojVar = this.zza;
        if (zzfojVar == null) {
            zzfoj<E> zzn = zzn();
            this.zza = zzn;
            return zzn;
        }
        return zzfojVar;
    }

    public boolean zzm() {
        return false;
    }

    public zzfoj<E> zzn() {
        return zzfoj.zzr(toArray());
    }
}
