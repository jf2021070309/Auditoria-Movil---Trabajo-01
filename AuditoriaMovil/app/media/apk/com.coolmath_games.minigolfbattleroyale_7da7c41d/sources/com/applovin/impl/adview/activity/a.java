package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.sdk.a.d;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.e.p;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a implements ServiceConnection {
    private final k a;
    private final r b;
    private final WeakReference<AppLovinFullscreenActivity> c;
    private final AtomicBoolean d = new AtomicBoolean();
    private Messenger e;

    /* renamed from: com.applovin.impl.adview.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0007a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0007a() {
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.e.send(obtain);
            } catch (RemoteException e) {
                r rVar = a.this.b;
                rVar.b("InterActivityV2", "Failed to forward callback (" + bVar.a() + ")", e);
            }
        }

        private void a(FullscreenAdService.b bVar) {
            a(null, bVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends Handler {
        private final WeakReference<a> a;

        private b(a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.b.AD.a() || (aVar = this.a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.a(com.applovin.impl.sdk.a.b.a(message.getData().getInt("ad_source")), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.a = kVar;
        this.b = kVar.z();
        this.c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.c.get();
        if (appLovinFullscreenActivity == null) {
            this.b.e("InterActivityV2", "Unable to dismiss parent Activity");
            return;
        }
        this.b.b("InterActivityV2", "Dismissing...");
        appLovinFullscreenActivity.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.a.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a.Q().a(new p(jSONObject, d.a(JsonUtils.getString(jSONObject, "zone_id", "")), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(AppLovinAd appLovinAd) {
                    AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.c.get();
                    if (appLovinFullscreenActivity != null) {
                        a.this.b.b("InterActivityV2", "Presenting ad...");
                        C0007a c0007a = new C0007a();
                        appLovinFullscreenActivity.present((g) appLovinAd, c0007a, c0007a, c0007a);
                        return;
                    }
                    r rVar = a.this.b;
                    rVar.e("InterActivityV2", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i) {
                    a.this.a();
                }
            }, this.a));
        } catch (JSONException e) {
            r rVar = this.b;
            rVar.b("InterActivityV2", "Unable to process ad: " + str, e);
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.d.compareAndSet(false, true)) {
            r rVar = this.b;
            rVar.b("InterActivityV2", "Fullscreen ad service connected to " + componentName);
            this.e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            obtain.replyTo = new Messenger(new b());
            try {
                this.b.b("InterActivityV2", "Requesting ad from FullscreenAdService...");
                this.e.send(obtain);
            } catch (RemoteException e) {
                this.b.b("InterActivityV2", "Failed to send ad request message to FullscreenAdService", e);
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.d.compareAndSet(true, false)) {
            r rVar = this.b;
            rVar.b("InterActivityV2", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
