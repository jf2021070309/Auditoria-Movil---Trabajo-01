package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public final class zzez extends zzdn<String> implements RandomAccess, zzfa {
    public static final zzfa zza;
    private static final zzez zzb;
    private final List<Object> zzc;

    static {
        zzez zzezVar = new zzez(10);
        zzb = zzezVar;
        zzezVar.zzb();
        zza = zzezVar;
    }

    public zzez() {
        this(10);
    }

    public zzez(int i2) {
        this.zzc = new ArrayList(i2);
    }

    private zzez(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private static String zzh(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzeb ? ((zzeb) obj).zzm(zzev.zza) : zzev.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        zza();
        this.zzc.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzfa) {
            collection = ((zzfa) collection).zzg();
        }
        boolean addAll = this.zzc.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zza();
        Object remove = this.zzc.remove(i2);
        ((AbstractList) this).modCount++;
        return zzh(remove);
    }

    @Override // com.google.android.gms.internal.auth.zzdn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        zza();
        return zzh(this.zzc.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.auth.zzeu
    public final /* bridge */ /* synthetic */ zzeu zzd(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.zzc);
            return new zzez(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final zzfa zze() {
        return zzc() ? new zzgu(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzf */
    public final String get(int i2) {
        Object obj = this.zzc.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeb) {
            zzeb zzebVar = (zzeb) obj;
            String zzm = zzebVar.zzm(zzev.zza);
            if (zzebVar.zzh()) {
                this.zzc.set(i2, zzm);
            }
            return zzm;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzev.zzh(bArr);
        if (zzev.zzi(bArr)) {
            this.zzc.set(i2, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.auth.zzfa
    public final List<?> zzg() {
        return Collections.unmodifiableList(this.zzc);
    }
}
