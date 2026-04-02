package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
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
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while dispatching error event.", e2);
        }
    }

    public final void zzg(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void zzh(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while dispatching size change.", e2);
        }
    }

    public final void zzi(int i2, int i3, int i4, int i5) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while dispatching default position.", e2);
        }
    }

    public final void zzj(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while dispatching state change.", e2);
        }
    }

    public final void zzk(int i2, int i3, int i4, int i5, float f2, int i6) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put("rotation", i6));
        } catch (JSONException e2) {
            zzcgt.zzg("Error occurred while obtaining screen information.", e2);
        }
    }
}
