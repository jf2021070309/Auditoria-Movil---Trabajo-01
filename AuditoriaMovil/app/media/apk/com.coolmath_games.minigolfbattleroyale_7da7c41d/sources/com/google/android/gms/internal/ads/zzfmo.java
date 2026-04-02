package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzfmo extends zzfpe {
    final /* synthetic */ zzfmq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmo(zzfmq zzfmqVar) {
        this.zza = zzfmqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        Set entrySet = this.zza.zza.entrySet();
        if (entrySet != null) {
            try {
                return entrySet.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry> iterator() {
        return new zzfmp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfpe, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        if (contains(obj)) {
            Map.Entry entry = (Map.Entry) obj;
            entry.getClass();
            zzfnd.zzm(this.zza.zzb, entry.getKey());
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfpe
    final Map zza() {
        return this.zza;
    }
}
