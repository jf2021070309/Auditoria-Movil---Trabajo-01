package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcak;
import com.google.android.gms.internal.ads.zzcal;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class ReportingInfo {
    private final zzcal zza;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
    /* loaded from: classes.dex */
    public static final class Builder {
        private final zzcak zza;

        public Builder(View view) {
            zzcak zzcakVar = new zzcak();
            this.zza = zzcakVar;
            zzcakVar.zzc(view);
        }

        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzd(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zza zzaVar) {
        this.zza = new zzcal(builder.zza);
    }

    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzb(uri, updateClickUrlCallback);
    }

    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zza(list, updateImpressionUrlsCallback);
    }
}
