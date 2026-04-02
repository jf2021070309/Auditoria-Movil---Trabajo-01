package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public enum zzgje {
    DOUBLE(zzgjf.DOUBLE, 1),
    FLOAT(zzgjf.FLOAT, 5),
    INT64(zzgjf.LONG, 0),
    UINT64(zzgjf.LONG, 0),
    INT32(zzgjf.INT, 0),
    FIXED64(zzgjf.LONG, 1),
    FIXED32(zzgjf.INT, 5),
    BOOL(zzgjf.BOOLEAN, 0),
    STRING(zzgjf.STRING, 2),
    GROUP(zzgjf.MESSAGE, 3),
    MESSAGE(zzgjf.MESSAGE, 2),
    BYTES(zzgjf.BYTE_STRING, 2),
    UINT32(zzgjf.INT, 0),
    ENUM(zzgjf.ENUM, 0),
    SFIXED32(zzgjf.INT, 5),
    SFIXED64(zzgjf.LONG, 1),
    SINT32(zzgjf.INT, 0),
    SINT64(zzgjf.LONG, 0);
    
    private final zzgjf zzs;

    zzgje(zzgjf zzgjfVar, int i) {
        this.zzs = zzgjfVar;
    }

    public final zzgjf zza() {
        return this.zzs;
    }
}
