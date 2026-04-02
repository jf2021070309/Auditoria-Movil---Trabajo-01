package com.google.android.gms.internal.measurement;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzat implements Iterable, zzap {
    private final String zza;

    public zzat(String str) {
        if (str != null) {
            this.zza = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzat)) {
            return false;
        }
        return this.zza.equals(((zzat) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzas(this);
    }

    public final String toString() {
        return e.e("\"", this.zza, "\"");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02f7, code lost:
        if (r1[r7].isEmpty() == false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0152  */
    @Override // com.google.android.gms.internal.measurement.zzap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.zzap zzbU(java.lang.String r19, com.google.android.gms.internal.measurement.zzg r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzat.zzbU(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzap");
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzat(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzar(this);
    }
}
