package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.iva.k3.d;
import com.amazon.aps.iva.u.a;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.common.net.HttpHeaders;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzhy {
    private final Context zza;
    private AdsRenderingSettings zzb;

    public zzhy(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.zza = context;
        this.zzb = adsRenderingSettings;
    }

    public final void zza(String str) {
        Bundle bundle;
        if (this.zzb.getEnableCustomTabs()) {
            Context context = this.zza;
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                d.b(bundle2, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            String a = a.a();
            if (!TextUtils.isEmpty(a)) {
                if (intent.hasExtra("com.android.browser.headers")) {
                    bundle = intent.getBundleExtra("com.android.browser.headers");
                } else {
                    bundle = new Bundle();
                }
                if (!bundle.containsKey(HttpHeaders.ACCEPT_LANGUAGE)) {
                    bundle.putString(HttpHeaders.ACCEPT_LANGUAGE, a);
                    intent.putExtra("com.android.browser.headers", bundle);
                }
            }
            intent.setData(Uri.parse(str));
            com.amazon.aps.iva.d3.a.startActivity(context, intent, null);
            return;
        }
        Context context2 = this.zza;
        if (str != null && str.length() > 0) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (!(context2 instanceof Activity)) {
                intent2.setFlags(268435456);
            }
            context2.startActivity(intent2);
        }
    }

    public final void zzb(AdsRenderingSettings adsRenderingSettings) {
        this.zzb = adsRenderingSettings;
    }
}
