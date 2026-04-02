package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public final class zzfpa implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfpd zzb;

    public zzfpa(zzfpd zzfpdVar, CharSequence charSequence) {
        this.zzb = zzfpdVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfof.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
