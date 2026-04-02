package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzfmx extends zzfmq implements SortedMap {
    @CheckForNull
    SortedSet zzd;
    final /* synthetic */ zzfnd zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmx(zzfnd zzfndVar, SortedMap sortedMap) {
        super(zzfndVar, sortedMap);
        this.zze = zzfndVar;
    }

    @Override // java.util.SortedMap
    @CheckForNull
    public final Comparator comparator() {
        return zzg().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return zzg().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new zzfmx(this.zze, zzg().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return zzg().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new zzfmx(this.zze, zzg().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new zzfmx(this.zze, zzg().tailMap(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfph
    /* renamed from: zze */
    public SortedSet zzh() {
        return new zzfmy(this.zze, zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzfmq, com.google.android.gms.internal.ads.zzfph, java.util.AbstractMap, java.util.Map
    /* renamed from: zzf */
    public SortedSet keySet() {
        SortedSet sortedSet = this.zzd;
        if (sortedSet == null) {
            SortedSet zzh = zzh();
            this.zzd = zzh;
            return zzh;
        }
        return sortedSet;
    }

    SortedMap zzg() {
        return (SortedMap) this.zza;
    }
}
