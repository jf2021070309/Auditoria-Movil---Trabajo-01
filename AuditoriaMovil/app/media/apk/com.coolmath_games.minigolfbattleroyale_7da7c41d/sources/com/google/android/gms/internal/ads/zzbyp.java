package com.google.android.gms.internal.ads;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzbyp {
    private final zzcml zza;
    private final String zzb;

    public zzbyp(zzcml zzcmlVar, String str) {
        this.zza = zzcmlVar;
        this.zzb = str;
    }

    public final void zzf(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcml zzcmlVar = this.zza;
            if (zzcmlVar != null) {
                zzcmlVar.zzd("onError", put);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzg(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzh(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i3).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i3).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i4));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzj(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzk(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, i).put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Error occurred while obtaining screen information.", e);
        }
    }
}
