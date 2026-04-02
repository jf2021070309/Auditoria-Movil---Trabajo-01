package com.google.android.gms.internal.ads;

import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzcsq implements zzcsd {
    private final zzced zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcsq(zzced zzcedVar) {
        this.zza = zzcedVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzced] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzcsd
    public final void zza(JSONObject jSONObject) {
        this.zza.zzd(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong(VisionDataDBAdapter.VisionDataColumns.COLUMN_TIMESTAMP));
    }
}
