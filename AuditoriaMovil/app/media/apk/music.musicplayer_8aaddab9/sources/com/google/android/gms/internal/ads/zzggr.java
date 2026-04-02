package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzggr extends zzgeh<String> implements RandomAccess, zzggs {
    public static final zzggs zza;
    private static final zzggr zzb;
    private final List<Object> zzc;

    static {
        zzggr zzggrVar = new zzggr(10);
        zzb = zzggrVar;
        zzggrVar.zzb();
        zza = zzggrVar;
    }

    public zzggr() {
        this(10);
    }

    public zzggr(int i2) {
        this.zzc = new ArrayList(i2);
    }

    private zzggr(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzgex ? ((zzgex) obj).zzA(zzggk.zza) : zzggk.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        zzbH();
        this.zzc.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        zzbH();
        if (collection instanceof zzggs) {
            collection = ((zzggs) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbH();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzbH();
        Object remove = this.zzc.remove(i2);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzd */
    public final String get(int i2) {
        Object obj = this.zzc.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgex) {
            zzgex zzgexVar = (zzgex) obj;
            String zzA = zzgexVar.zzA(zzggk.zza);
            if (zzgexVar.zzm()) {
                this.zzc.set(i2, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzggk.zzd(bArr);
        if (zzggk.zzc(bArr)) {
            this.zzc.set(i2, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ zzggj zze(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.zzc);
            return new zzggr(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final void zzf(zzgex zzgexVar) {
        zzbH();
        this.zzc.add(zzgexVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final Object zzg(int i2) {
        return this.zzc.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final zzggs zzi() {
        return zza() ? new zzgit(this) : this;
    }
}
