package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.ads.AdError;
/* loaded from: classes2.dex */
public class ag extends BroadcastReceiver {
    private String a;
    private af b;
    private ae c;

    public ag(String str, ae aeVar, af afVar) {
        this.c = aeVar;
        this.b = afVar;
        this.a = str;
    }

    public IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_COMPLETE.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_ERROR.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_AD_CLICK.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_IMPRESSION.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_CLOSED.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_SUCCESS.a(this.a));
        intentFilter.addAction(com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_FAILED.a(this.a));
        return intentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_COMPLETE.a(this.a).equals(action)) {
            this.b.d(this.c);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_ERROR.a(this.a).equals(action)) {
            this.b.a(this.c, AdError.INTERNAL_ERROR);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_AD_CLICK.a(this.a).equals(action)) {
            this.b.b(this.c);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_IMPRESSION.a(this.a).equals(action)) {
            this.b.c(this.c);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARDED_VIDEO_CLOSED.a(this.a).equals(action)) {
            this.b.a();
        } else if (com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_FAILED.a(this.a).equals(action)) {
            this.b.e(this.c);
        } else if (com.facebook.ads.internal.view.e.b.z.REWARD_SERVER_SUCCESS.a(this.a).equals(action)) {
            this.b.f(this.c);
        }
    }
}
