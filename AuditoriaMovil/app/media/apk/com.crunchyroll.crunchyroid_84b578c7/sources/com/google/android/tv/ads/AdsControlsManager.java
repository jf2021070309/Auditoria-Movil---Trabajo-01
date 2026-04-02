package com.google.android.tv.ads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.tv.ads.controls.FallbackImageActivity;
import java.util.Iterator;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class AdsControlsManager {
    private final Context zza;
    private final com.google.android.gms.internal.atv_ads_framework.zzd zzb;
    private CustomFallbackImageRenderer zzc;

    @KeepForSdk
    public AdsControlsManager(Context context) {
        context.getClass();
        this.zza = context;
        this.zzb = new com.google.android.gms.internal.atv_ads_framework.zzd();
    }

    public static boolean zza(IconClickFallbackImage iconClickFallbackImage) {
        String queryParameter = Uri.parse(iconClickFallbackImage.getStaticResourceUri()).getQueryParameter("atvatc");
        if (queryParameter != null && queryParameter.equals("1")) {
            return true;
        }
        return false;
    }

    private final void zzb() {
        this.zza.startActivity(new Intent().setClassName(this.zza.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
    }

    @KeepForSdk
    public void handleIconClick(IconClickFallbackImages iconClickFallbackImages) {
        String str;
        iconClickFallbackImages.getClass();
        Iterator<IconClickFallbackImage> it = iconClickFallbackImages.getIconClickFallbackImageList().iterator();
        while (true) {
            if (it.hasNext()) {
                IconClickFallbackImage next = it.next();
                if (zza(next)) {
                    str = next.getStaticResourceUri();
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (str != null) {
            try {
                Intent putExtra = new Intent().setAction("com.google.android.tv.ads.intent.action.LAUNCH_ATC_MENU").putExtra("extra_atc_uri", str).putExtra("extra_publisher_package", this.zza.getPackageName());
                com.google.android.gms.internal.atv_ads_framework.zza zzaVar = com.google.android.gms.internal.atv_ads_framework.zza.TV_LAUNCHER;
                int ordinal = com.google.android.gms.internal.atv_ads_framework.zzd.zza(this.zza).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                return;
                            }
                            throw new IllegalStateException("AdsControlsManager should only be used on the Android TV platform.");
                        }
                    } else {
                        this.zza.startActivity(putExtra.setPackage("com.google.android.apps.tv.launcherx"));
                        return;
                    }
                }
                this.zza.startActivity(putExtra.setPackage("com.google.android.tvrecommendations"));
            } catch (ActivityNotFoundException unused) {
                zzb();
            }
        } else if (iconClickFallbackImages.getIconClickFallbackImageList().isEmpty()) {
            zzb();
        } else {
            CustomFallbackImageRenderer customFallbackImageRenderer = this.zzc;
            if (customFallbackImageRenderer != null) {
                customFallbackImageRenderer.render(iconClickFallbackImages);
            } else {
                this.zza.startActivity(new Intent().setClassName(this.zza.getPackageName(), FallbackImageActivity.class.getName()).putExtra("icon_click_fallback_images", iconClickFallbackImages));
            }
        }
    }

    @KeepForSdk
    public void setCustomFallbackImageRenderer(CustomFallbackImageRenderer customFallbackImageRenderer) {
        customFallbackImageRenderer.getClass();
        this.zzc = customFallbackImageRenderer;
    }
}
