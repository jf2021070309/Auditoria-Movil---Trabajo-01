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
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.ad.d;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.e.p;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.AppLovinUtils;
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
    private final m a;

    /* renamed from: b  reason: collision with root package name */
    private final v f3148b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<AppLovinFullscreenActivity> f3149c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f3150d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    private Messenger f3151e;

    /* renamed from: com.applovin.impl.adview.activity.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0067a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C0067a() {
        }

        private void a(Bundle bundle, FullscreenAdService.b bVar) {
            Message obtain = Message.obtain((Handler) null, bVar.a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f3151e.send(obtain);
            } catch (RemoteException e2) {
                v vVar = a.this.f3148b;
                StringBuilder y = e.a.d.a.a.y("Failed to forward callback (");
                y.append(bVar.a());
                y.append(")");
                vVar.b("AppLovinFullscreenActivity", y.toString(), e2);
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
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d2);
            bundle.putBoolean("fully_watched", z);
            a(bundle, FullscreenAdService.b.AD_VIDEO_ENDED);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {
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
                aVar.a(com.applovin.impl.sdk.ad.b.a(message.getData().getInt(FullscreenAdService.DATA_KEY_AD_SOURCE)), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, m mVar) {
        this.a = mVar;
        this.f3148b = mVar.B();
        this.f3149c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.f3149c.get();
        if (appLovinFullscreenActivity == null) {
            this.f3148b.e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
            return;
        }
        this.f3148b.b("AppLovinFullscreenActivity", "Dismissing...");
        appLovinFullscreenActivity.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.applovin.impl.sdk.ad.b bVar, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a.S().a(new p(jSONObject, d.a(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, "")), bVar, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f3149c.get();
                    v vVar = a.this.f3148b;
                    if (appLovinFullscreenActivity != null) {
                        vVar.b("AppLovinFullscreenActivity", "Presenting ad...");
                        final C0067a c0067a = new C0067a();
                        com.applovin.impl.adview.activity.b.a.a((e) appLovinAd, c0067a, c0067a, c0067a, a.this.a, appLovinFullscreenActivity, new a.InterfaceC0069a() { // from class: com.applovin.impl.adview.activity.a.1.1
                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                            public void a(com.applovin.impl.adview.activity.b.a aVar) {
                                appLovinFullscreenActivity.setPresenter(aVar);
                                aVar.d();
                            }

                            @Override // com.applovin.impl.adview.activity.b.a.InterfaceC0069a
                            public void a(String str2, Throwable th) {
                                o.a((e) appLovinAd, c0067a, str2, th, appLovinFullscreenActivity);
                            }
                        });
                        return;
                    }
                    vVar.e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i2) {
                    a.this.a();
                }
            }, this.a));
        } catch (JSONException e2) {
            v vVar = this.f3148b;
            vVar.b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e2);
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f3150d.compareAndSet(false, true)) {
            v vVar = this.f3148b;
            vVar.b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            this.f3151e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.b.AD.a());
            obtain.replyTo = new Messenger(new b());
            try {
                this.f3148b.b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                this.f3151e.send(obtain);
            } catch (RemoteException e2) {
                this.f3148b.b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e2);
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f3150d.compareAndSet(true, false)) {
            v vVar = this.f3148b;
            vVar.b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
