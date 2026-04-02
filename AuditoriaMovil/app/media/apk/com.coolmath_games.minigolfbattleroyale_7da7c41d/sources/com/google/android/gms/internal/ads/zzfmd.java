package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzfmd implements Iterable<String> {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfmg zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmd(zzfmg zzfmgVar, CharSequence charSequence) {
        this.zzb = zzfmgVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> zzg;
        zzg = this.zzb.zzg(this.zza);
        return zzg;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzflo.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzflo.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
