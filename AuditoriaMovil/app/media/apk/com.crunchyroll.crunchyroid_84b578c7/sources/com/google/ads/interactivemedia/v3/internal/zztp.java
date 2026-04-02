package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zztp extends zzsy {
    static final zztp zzc;
    final transient zzso zzd;

    static {
        int i = zzso.zzd;
        zzc = new zztp(zzti.zza, zztf.zza);
    }

    public zztp(zzso zzsoVar, Comparator comparator) {
        super(comparator);
        this.zzd = zzsoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int zzv = zzv(obj, true);
        if (zzv == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.zzd, obj, ((zzsy) this).zza) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof zzte) {
            collection = ((zzte) collection).zza();
        }
        if (zztv.zza(((zzsy) this).zza, collection) && collection.size() > 1) {
            zztx listIterator = this.zzd.listIterator(0);
            Iterator it = collection.iterator();
            if (!listIterator.hasNext()) {
                return false;
            }
            Object next = it.next();
            E next2 = listIterator.next();
            while (true) {
                try {
                    int compare = ((zzsy) this).zza.compare(next2, next);
                    if (compare < 0) {
                        if (!listIterator.hasNext()) {
                            return false;
                        }
                        next2 = listIterator.next();
                    } else if (compare != 0) {
                        break;
                    } else if (!it.hasNext()) {
                        return true;
                    } else {
                        next = it.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        } else {
            return super.containsAll(collection);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038 A[Catch: ClassCastException | NoSuchElementException -> 0x004c, TryCatch #0 {ClassCastException | NoSuchElementException -> 0x004c, blocks: (B:17:0x002c, B:18:0x0032, B:20:0x0038, B:22:0x0042), top: B:29:0x002c }] */
    @Override // com.google.ads.interactivemedia.v3.internal.zzst, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.Set r7 = (java.util.Set) r7
            com.google.ads.interactivemedia.v3.internal.zzso r1 = r6.zzd
            int r1 = r1.size()
            int r3 = r7.size()
            if (r1 == r3) goto L19
            return r2
        L19:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L20
            return r0
        L20:
            java.util.Comparator r1 = r6.zza
            boolean r1 = com.google.ads.interactivemedia.v3.internal.zztv.zza(r1, r7)
            if (r1 == 0) goto L4d
            java.util.Iterator r7 = r7.iterator()
            com.google.ads.interactivemedia.v3.internal.zzso r1 = r6.zzd     // Catch: java.lang.Throwable -> L4c
            com.google.ads.interactivemedia.v3.internal.zztx r1 = r1.listIterator(r2)     // Catch: java.lang.Throwable -> L4c
        L32:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4a
            java.util.Comparator r5 = r6.zza     // Catch: java.lang.Throwable -> L4c
            int r3 = r5.compare(r3, r4)     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L32
        L4a:
            return r2
        L4b:
            return r0
        L4c:
            return r2
        L4d:
            boolean r7 = r6.containsAll(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.zztp.equals(java.lang.Object):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.zzd.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object floor(Object obj) {
        int zzu = zzu(obj, true) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object higher(Object obj) {
        int zzv = zzv(obj, false);
        if (zzv == this.zzd.size()) {
            return null;
        }
        return this.zzd.get(zzv);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            zzso zzsoVar = this.zzd;
            return zzsoVar.get(zzsoVar.size() - 1);
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    public final Object lower(Object obj) {
        int zzu = zzu(obj, false) - 1;
        if (zzu == -1) {
            return null;
        }
        return this.zzd.get(zzu);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzd.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zza(Object[] objArr, int i) {
        return this.zzd.zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzb() {
        return this.zzd.zzb();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final int zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zzso zzd() {
        return this.zzd;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, com.google.ads.interactivemedia.v3.internal.zzst, com.google.ads.interactivemedia.v3.internal.zzsk
    public final zztw zze() {
        return this.zzd.listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final boolean zzf() {
        return this.zzd.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsk
    public final Object[] zzg() {
        return this.zzd.zzg();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    public final zzsy zzh() {
        Comparator reverseOrder = Collections.reverseOrder(((zzsy) this).zza);
        if (isEmpty()) {
            return zzsy.zzs(reverseOrder);
        }
        return new zztp(this.zzd.zzh(), reverseOrder);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    public final zzsy zzo(Object obj, boolean z) {
        return zzw(0, zzu(obj, z));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    public final zzsy zzq(Object obj, boolean z, Object obj2, boolean z2) {
        return zzr(obj, z).zzo(obj2, z2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy
    public final zzsy zzr(Object obj, boolean z) {
        return zzw(zzv(obj, z), this.zzd.size());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzsy, java.util.NavigableSet
    /* renamed from: zzt */
    public final zztw descendingIterator() {
        return this.zzd.zzh().listIterator(0);
    }

    public final int zzu(Object obj, boolean z) {
        zzso zzsoVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzsoVar, obj, ((zzsy) this).zza);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int zzv(Object obj, boolean z) {
        zzso zzsoVar = this.zzd;
        obj.getClass();
        int binarySearch = Collections.binarySearch(zzsoVar, obj, ((zzsy) this).zza);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }

    public final zztp zzw(int i, int i2) {
        if (i == 0) {
            if (i2 != this.zzd.size()) {
                i = 0;
            } else {
                return this;
            }
        }
        if (i < i2) {
            return new zztp(this.zzd.subList(i, i2), ((zzsy) this).zza);
        }
        return zzsy.zzs(((zzsy) this).zza);
    }
}
