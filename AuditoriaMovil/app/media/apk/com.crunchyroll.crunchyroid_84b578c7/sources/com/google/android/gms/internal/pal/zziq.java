package com.google.android.gms.internal.pal;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
final class zziq extends zzil {
    private final Object zza;

    public zziq(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zziq) {
            return this.zza.equals(((zziq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final zzil zza(zzii zziiVar) {
        return new zziq(zziiVar.zza(this.zza));
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final Object zzc(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.pal.zzil
    public final boolean zzd() {
        return true;
    }
}
