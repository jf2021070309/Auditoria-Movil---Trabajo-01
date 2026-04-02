package com.google.ads.interactivemedia.v3.internal;

import com.amazon.aps.iva.e4.e;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzzt implements zzxj {
    private final zzyl zza;

    public zzzt(zzyl zzylVar) {
        this.zza = zzylVar;
    }

    public static final zzxi zzb(zzyl zzylVar, zzwm zzwmVar, zzact zzactVar, zzxk zzxkVar) {
        zzwy zzwyVar;
        zzwq zzwqVar;
        zzxi zzaalVar;
        Object zza = zzylVar.zza(zzact.zza(zzxkVar.zza())).zza();
        boolean zzb = zzxkVar.zzb();
        if (zza instanceof zzxi) {
            zzaalVar = (zzxi) zza;
        } else if (zza instanceof zzxj) {
            zzaalVar = ((zzxj) zza).zza(zzwmVar, zzactVar);
        } else {
            if (!(zza instanceof zzwy)) {
                if (zza instanceof zzwq) {
                    zzwyVar = null;
                } else {
                    throw new IllegalArgumentException(e.b("Invalid attempt to bind an instance of ", zza.getClass().getName(), " as a @JsonAdapter for ", zzactVar.toString(), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."));
                }
            } else {
                zzwyVar = (zzwy) zza;
            }
            if (zza instanceof zzwq) {
                zzwqVar = (zzwq) zza;
            } else {
                zzwqVar = null;
            }
            zzaalVar = new zzaal(zzwyVar, zzwqVar, zzwmVar, zzactVar, null, zzb);
            zzb = false;
        }
        if (zzaalVar != null && zzb) {
            return zzaalVar.nullSafe();
        }
        return zzaalVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxj
    public final zzxi zza(zzwm zzwmVar, zzact zzactVar) {
        zzxk zzxkVar = (zzxk) zzactVar.zzc().getAnnotation(zzxk.class);
        if (zzxkVar == null) {
            return null;
        }
        return zzb(this.zza, zzwmVar, zzactVar, zzxkVar);
    }
}
