package com.google.android.tv.ads.controls;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.amazon.aps.iva.k.c;
import com.google.android.tv.ads.AdsControlsManager;
import com.google.android.tv.ads.IconClickFallbackImage;
import com.google.android.tv.ads.IconClickFallbackImages;
import java.util.Iterator;
/* compiled from: com.google.android.tv:tv-ads@@1.0.0-alpha02 */
/* loaded from: classes3.dex */
public final class FallbackImageActivity extends c {
    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, com.amazon.aps.iva.c3.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z;
        IconClickFallbackImage iconClickFallbackImage;
        IconClickFallbackImages iconClickFallbackImages;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("render_error_message")) {
            z = true;
        } else {
            z = false;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null && (iconClickFallbackImages = (IconClickFallbackImages) extras2.getParcelable("icon_click_fallback_images")) != null) {
            Iterator<IconClickFallbackImage> it = iconClickFallbackImages.getIconClickFallbackImageList().iterator();
            while (it.hasNext()) {
                iconClickFallbackImage = it.next();
                if (!AdsControlsManager.zza(iconClickFallbackImage)) {
                    break;
                }
            }
        }
        iconClickFallbackImage = null;
        if (!z && iconClickFallbackImage != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("wta_uri", iconClickFallbackImage.getStaticResourceUri());
            bundle2.putString("wta_alt_text", iconClickFallbackImage.getAltText());
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            a aVar = new a(supportFragmentManager);
            aVar.r = true;
            aVar.f(WhyThisAdFragment.class, bundle2);
            aVar.h();
            return;
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        a a = b.a(supportFragmentManager2, supportFragmentManager2);
        a.r = true;
        a.f(ErrorMessageFragment.class, null);
        a.h();
    }
}
