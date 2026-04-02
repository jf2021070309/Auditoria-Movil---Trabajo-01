package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfnc extends zzfna implements List {
    final /* synthetic */ zzfnd zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnc(zzfnd zzfndVar, Object obj, @CheckForNull List list, zzfna zzfnaVar) {
        super(zzfndVar, obj, list, zzfnaVar);
        this.zzf = zzfndVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i, obj);
        zzfnd zzfndVar = this.zzf;
        i2 = zzfndVar.zzb;
        zzfndVar.zzb = i2 + 1;
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfnd zzfndVar = this.zzf;
            i2 = zzfndVar.zzb;
            zzfndVar.zzb = i2 + (size2 - size);
            if (size == 0) {
                zzc();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zza();
        return ((List) this.zzb).get(i);
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        zza();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        zza();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zza();
        return new zzfnb(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zza();
        Object remove = ((List) this.zzb).remove(i);
        zzfnd zzfndVar = this.zzf;
        i2 = zzfndVar.zzb;
        zzfndVar.zzb = i2 - 1;
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zza();
        return ((List) this.zzb).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zza();
        zzfnd zzfndVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i, i2);
        zzfna zzfnaVar = this.zzc;
        if (zzfnaVar == null) {
            zzfnaVar = this;
        }
        return zzfndVar.zzj(obj, subList, zzfnaVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zza();
        return new zzfnb(this, i);
    }
}
