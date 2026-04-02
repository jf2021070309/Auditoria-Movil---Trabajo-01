package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfnm extends AbstractSet<Map.Entry> {
    final /* synthetic */ zzfns zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnm(zzfns zzfnsVar) {
        this.zza = zzfnsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        int zzy;
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzy = this.zza.zzy(entry.getKey());
            if (zzy != -1 && zzflt.zza(zzfns.zzt(this.zza, zzy), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        zzfns zzfnsVar = this.zza;
        Map zzg = zzfnsVar.zzg();
        if (zzg != null) {
            return zzg.entrySet().iterator();
        }
        return new zzfnk(zzfnsVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        int zzw;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzg = this.zza.zzg();
        if (zzg != null) {
            return zzg.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.zza.zzf()) {
                return false;
            }
            zzw = this.zza.zzw();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object zzo = zzfns.zzo(this.zza);
            zzA = this.zza.zzA();
            zzB = this.zza.zzB();
            zzC = this.zza.zzC();
            int zze = zzfnt.zze(key, value, zzw, zzo, zzA, zzB, zzC);
            if (zze == -1) {
                return false;
            }
            this.zza.zzl(zze, zzw);
            zzfns zzfnsVar = this.zza;
            i = zzfnsVar.zzg;
            zzfnsVar.zzg = i - 1;
            this.zza.zzi();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
