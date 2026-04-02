package com.google.android.gms.internal.ads;

import e.a.d.a.a;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzgig implements Map.Entry, Comparable<zzgig> {
    public final /* synthetic */ zzgik zza;
    private final Comparable zzb;
    private Object zzc;

    public zzgig(zzgik zzgikVar, Comparable comparable, Object obj) {
        this.zza = zzgikVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(zzgig zzgigVar) {
        return this.zzb.compareTo(zzgigVar.zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzb;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        return hashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzm();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        return a.s(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, "=", valueOf2);
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
