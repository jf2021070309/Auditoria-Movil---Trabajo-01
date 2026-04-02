package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-lite@@22.1.0 */
/* loaded from: classes3.dex */
public abstract class zzfob implements zzfor {
    public static zzfob zzc(char c) {
        return new zzfny(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfor
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
