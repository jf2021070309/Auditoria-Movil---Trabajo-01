package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzckn extends zzxl {
    static final zzckn zzb = new zzckn();

    zzckn() {
    }

    @Override // com.google.android.gms.internal.ads.zzxl
    public final zzxp zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzxr();
        }
        if ("mvhd".equals(str)) {
            return new zzxs();
        }
        return new zzxt(str);
    }
}
