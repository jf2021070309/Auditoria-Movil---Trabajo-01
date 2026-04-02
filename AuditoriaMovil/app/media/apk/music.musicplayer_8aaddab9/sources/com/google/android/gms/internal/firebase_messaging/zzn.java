package com.google.android.gms.internal.firebase_messaging;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public final class zzn implements zzs {
    private final int zza;
    private final zzr zzb;

    public zzn(int i2, zzr zzrVar) {
        this.zza = i2;
        this.zzb = zzrVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return zzs.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzs) {
            zzs zzsVar = (zzs) obj;
            return this.zza == zzsVar.zza() && this.zzb.equals(zzsVar.zzb());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.zza ^ 14552422) + (this.zzb.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.zza + "intEncoding=" + this.zzb + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zzs
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.firebase_messaging.zzs
    public final zzr zzb() {
        return this.zzb;
    }
}
