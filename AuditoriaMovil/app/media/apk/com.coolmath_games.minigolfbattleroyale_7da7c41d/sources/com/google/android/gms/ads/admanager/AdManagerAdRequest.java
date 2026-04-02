package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.internal.ads.zzbhj;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
/* loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.5.0 */
    /* loaded from: classes.dex */
    public static final class Builder extends AdRequest.Builder {
        public Builder addCategoryExclusion(String str) {
            this.zza.zzH(str);
            return this;
        }

        public Builder addCustomTargeting(String str, String str2) {
            this.zza.zzG(str, str2);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @Deprecated
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdInfo(AdInfo adInfo) {
            setAdInfo(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public final /* bridge */ /* synthetic */ AdRequest.Builder setAdString(String str) {
            setAdString(str);
            return this;
        }

        public Builder setPublisherProvidedId(String str) {
            this.zza.zzD(str);
            return this;
        }

        public Builder addCustomTargeting(String str, List<String> list) {
            if (list != null) {
                this.zza.zzG(str, TextUtils.join(",", list));
            }
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        @Deprecated
        public Builder setAdInfo(AdInfo adInfo) {
            this.zza.zzJ(adInfo);
            return this;
        }

        @Override // com.google.android.gms.ads.AdRequest.Builder
        public Builder setAdString(String str) {
            this.zza.zzK(str);
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(Builder builder, zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public Bundle getCustomTargeting() {
        return this.zza.zzq();
    }

    public String getPublisherProvidedId() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.ads.AdRequest
    public final zzbhj zza() {
        return this.zza;
    }
}
