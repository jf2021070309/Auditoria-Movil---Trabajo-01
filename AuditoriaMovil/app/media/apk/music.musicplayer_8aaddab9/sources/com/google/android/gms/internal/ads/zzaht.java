package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class zzaht extends zzadm {
    private final int zza;
    private final int zzb;
    private final int[] zze;
    private final int[] zzf;
    private final zzaiq[] zzg;
    private final Object[] zzh;
    private final HashMap<Object, Integer> zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zzaht(Collection collection, Collection<? extends zzagt> collection2, zzix zzixVar) {
        super(false, collection2, null);
        int i2 = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzaiq[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap<>();
        Iterator it = collection.iterator();
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            zzagt zzagtVar = (zzagt) it.next();
            this.zzg[i4] = zzagtVar.zzc();
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += this.zzg[i4].zza();
            i3 += this.zzg[i4].zzg();
            this.zzh[i4] = zzagtVar.zzb();
            this.zzi.put(this.zzh[i4], Integer.valueOf(i4));
            i4++;
        }
        this.zza = i2;
        this.zzb = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaiq
    public final int zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final int zzl(int i2) {
        return zzamq.zzC(this.zze, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final int zzm(int i2) {
        return zzamq.zzC(this.zzf, i2 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final int zzn(Object obj) {
        Integer num = this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzaiq zzo(int i2) {
        return this.zzg[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final int zzp(int i2) {
        return this.zze[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final int zzq(int i2) {
        return this.zzf[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final Object zzr(int i2) {
        return this.zzh[i2];
    }

    public final List<zzaiq> zzs() {
        return Arrays.asList(this.zzg);
    }
}
