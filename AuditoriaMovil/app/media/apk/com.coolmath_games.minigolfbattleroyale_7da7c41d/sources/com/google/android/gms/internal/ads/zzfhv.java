package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfhv extends zzfhw {
    protected final HashSet<String> zza;
    protected final JSONObject zzb;
    protected final long zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzfhv(zzfho zzfhoVar, zzfho zzfhoVar2, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(zzfhoVar, null);
        this.zza = new HashSet<>((Collection<? extends String>) zzfhoVar2);
        this.zzb = hashSet;
        this.zzc = jSONObject;
    }
}
