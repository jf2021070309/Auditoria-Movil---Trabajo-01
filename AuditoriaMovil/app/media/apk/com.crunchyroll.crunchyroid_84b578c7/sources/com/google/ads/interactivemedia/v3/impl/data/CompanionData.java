package com.google.ads.interactivemedia.v3.impl.data;

import com.amazon.aps.iva.n4.a;
import com.google.ads.interactivemedia.v3.internal.zzqy;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
@zzqy(zza = zzo.class)
/* loaded from: classes2.dex */
public abstract class CompanionData {
    private String companionId;

    private static CompanionData create(String str, String str2, String str3, zzav zzavVar) {
        return new zzo(str, str2, str3, zzavVar);
    }

    public abstract String clickThroughUrl();

    public String companionId() {
        return this.companionId;
    }

    public abstract String size();

    public abstract String src();

    public final String toString() {
        String companionId = companionId();
        String size = size();
        String src = src();
        String clickThroughUrl = clickThroughUrl();
        String valueOf = String.valueOf(type());
        StringBuilder b = a.b("CompanionData [companionId=", companionId, ", size=", size, ", src=");
        com.amazon.aps.iva.m80.a.c(b, src, ", clickThroughUrl=", clickThroughUrl, ", type=");
        return b.c(b, valueOf, "]");
    }

    public abstract zzav type();

    public static CompanionData create(String str, String str2, String str3, String str4, zzav zzavVar) {
        CompanionData create = create(str2, str3, str4, zzavVar);
        create.companionId = str;
        return create;
    }
}
