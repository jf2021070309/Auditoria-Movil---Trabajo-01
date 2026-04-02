package com.fyber.inneractive.sdk.b;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public final class c extends a {
    @Override // com.fyber.inneractive.sdk.b.a
    public final void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, InneractiveFullscreenAdActivity.class);
        intent.putExtra(InneractiveFullscreenAdActivity.EXTRA_KEY_SPOT_ID, inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.b("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a((Object) activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a((Object) activity));
        }
    }
}
