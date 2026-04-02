package com.google.ads.interactivemedia.v3.internal;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public abstract class zzsy extends zzsz implements NavigableSet, zztu {
    final transient Comparator zza;
    transient zzsy zzb;

    public zzsy(Comparator comparator) {
        this.zza = comparator;
    }

    public static zztp zzs(Comparator comparator) {
        if (zztf.zza.equals(comparator)) {
            return zztp.zzc;
        }
        int i = zzso.zzd;
        return new zztp(zzti.zza, comparator);
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        obj.getClass();
        return zzta.zza(zzr(obj, true), null);
    }

    @Override // java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.zztu
    public final Comparator comparator() {
        return this.zza;
    }

    @Override // java.util.SortedSet
    public Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        obj.getClass();
        return zztc.zza(zzo(obj, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzo(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        obj.getClass();
        return zzta.zza(zzr(obj, false), null);
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        obj.getClass();
        return zztc.zza(zzo(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzr(obj, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zztw iterator();

    public abstract zzsy zzh();

    @Override // java.util.NavigableSet
    /* renamed from: zzn */
    public final zzsy descendingSet() {
        zzsy zzsyVar = this.zzb;
        if (zzsyVar == null) {
            zzsy zzh = zzh();
            this.zzb = zzh;
            zzh.zzb = this;
            return zzh;
        }
        return zzsyVar;
    }

    public abstract zzsy zzo(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: zzp */
    public final zzsy subSet(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzrm.zzd(z3);
        return zzq(obj, z, obj2, z2);
    }

    public abstract zzsy zzq(Object obj, boolean z, Object obj2, boolean z2);

    public abstract zzsy zzr(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: zzt */
    public abstract zztw descendingIterator();

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        return zzo(obj, z);
    }

    @Override // java.util.NavigableSet
    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return zzr(obj, z);
    }
}
