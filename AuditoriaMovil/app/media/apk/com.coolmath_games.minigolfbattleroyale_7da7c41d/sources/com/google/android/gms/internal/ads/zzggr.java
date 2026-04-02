package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzggr extends zzgeh<String> implements RandomAccess, zzggs {
    public static final zzggs zza;
    private static final zzggr zzb;
    private final List<Object> zzc;

    static {
        zzggr zzggrVar = new zzggr(10);
        zzb = zzggrVar;
        zzggrVar.zzb();
        zza = zzb;
    }

    public zzggr() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgex) {
            return ((zzgex) obj).zzA(zzggk.zza);
        }
        return zzggk.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbH();
        this.zzc.add(i, (String) obj);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzbH();
        if (collection instanceof zzggs) {
            collection = ((zzggs) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbH();
        this.zzc.clear();
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbH();
        Object remove = this.zzc.remove(i);
        this.modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbH();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzd */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgex) {
            zzgex zzgexVar = (zzgex) obj;
            String zzA = zzgexVar.zzA(zzggk.zza);
            if (zzgexVar.zzm()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzggk.zzd(bArr);
        if (zzggk.zzc(bArr)) {
            this.zzc.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzggj
    public final /* bridge */ /* synthetic */ zzggj zze(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.zzc);
        return new zzggr(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final void zzf(zzgex zzgexVar) {
        zzbH();
        this.zzc.add(zzgexVar);
        this.modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final Object zzg(int i) {
        return this.zzc.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final List<?> zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzggs
    public final zzggs zzi() {
        return zza() ? new zzgit(this) : this;
    }

    public zzggr(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzggr(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
