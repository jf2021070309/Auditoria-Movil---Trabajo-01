package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
final class zzfov extends zzfom {
    private final Object zza;

    public zzfov(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfov) {
            return this.zza.equals(((zzfov) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return e.e("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    public final zzfom zza(zzfoe zzfoeVar) {
        Object apply = zzfoeVar.apply(this.zza);
        zzfoq.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfov(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
