package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzfot implements Serializable, zzfor {
    private final List zza;

    public final boolean equals(Object obj) {
        if (obj instanceof zzfot) {
            return this.zza.equals(((zzfot) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfor
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfor) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
