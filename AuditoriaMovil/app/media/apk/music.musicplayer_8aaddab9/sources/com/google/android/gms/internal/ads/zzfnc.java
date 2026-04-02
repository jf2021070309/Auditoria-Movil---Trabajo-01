package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public class zzfnc extends zzfna implements List {
    public final /* synthetic */ zzfnd zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfnc(zzfnd zzfndVar, Object obj, @CheckForNull List list, zzfna zzfnaVar) {
        super(zzfndVar, obj, list, zzfnaVar);
        this.zzf = zzfndVar;
    }

    @Override // java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        zza();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i2, obj);
        zzfnd zzfndVar = this.zzf;
        i3 = zzfndVar.zzb;
        zzfndVar.zzb = i3 + 1;
        if (isEmpty) {
            zzc();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        int i3;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i2, collection);
        if (addAll) {
            int size2 = this.zzb.size();
            zzfnd zzfndVar = this.zzf;
            i3 = zzfndVar.zzb;
            zzfndVar.zzb = (size2 - size) + i3;
            if (size == 0) {
                zzc();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zza();
        return ((List) this.zzb).get(i2);
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
    public final ListIterator listIterator(int i2) {
        zza();
        return new zzfnb(this, i2);
    }

    @Override // java.util.List
    public final Object remove(int i2) {
        int i3;
        zza();
        Object remove = ((List) this.zzb).remove(i2);
        zzfnd zzfndVar = this.zzf;
        i3 = zzfndVar.zzb;
        zzfndVar.zzb = i3 - 1;
        zzb();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        zza();
        return ((List) this.zzb).set(i2, obj);
    }

    @Override // java.util.List
    public final List subList(int i2, int i3) {
        zza();
        zzfnd zzfndVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i2, i3);
        zzfna zzfnaVar = this.zzc;
        if (zzfnaVar == null) {
            zzfnaVar = this;
        }
        return zzfndVar.zzj(obj, subList, zzfnaVar);
    }
}
