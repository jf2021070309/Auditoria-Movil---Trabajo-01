package com.google.ads.interactivemedia.v3.internal;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public enum zzxf implements zzxg {
    DOUBLE,
    LAZILY_PARSED_NUMBER,
    LONG_OR_DOUBLE,
    BIG_DECIMAL;

    @Override // com.google.ads.interactivemedia.v3.internal.zzxg
    public final /* synthetic */ Number zza(zzacv zzacvVar) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            return new zzyq(zzacvVar.zzi());
        }
        return Double.valueOf(zzacvVar.zza());
    }
}
