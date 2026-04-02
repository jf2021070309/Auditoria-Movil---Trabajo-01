package com.google.android.gms.internal.cast;
/* compiled from: com.google.android.gms:play-services-cast@@21.4.0 */
/* loaded from: classes3.dex */
final class zzfa extends zzev {
    private final Object zza;

    public zzfa(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfa) {
            return this.zza.equals(((zzfa) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return e.e("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.cast.zzev
    public final Object zza(Object obj) {
        zzez.zzc(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.zza;
    }
}
