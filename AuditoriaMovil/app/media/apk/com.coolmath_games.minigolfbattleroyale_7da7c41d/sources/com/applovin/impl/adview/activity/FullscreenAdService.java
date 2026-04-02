package com.applovin.impl.adview.activity;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.q;
import com.applovin.impl.sdk.a.g;
import com.applovin.impl.sdk.r;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
/* loaded from: classes.dex */
public class FullscreenAdService extends Service {
    public static final String DATA_KEY_AD_SOURCE = "ad_source";
    public static final String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final String TAG = "FullscreenAdService";

    /* loaded from: classes.dex */
    private static class a extends Handler {
        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                q qVar = AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (qVar == null) {
                    if (!Utils.getBooleanForProbability(1)) {
                        super.handleMessage(message);
                        return;
                    }
                    throw new RuntimeException("parentWrapper is null for " + message.what);
                }
                g b = qVar.b();
                if (message.what == b.AD.a()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, b.getRawFullResponse());
                    bundle.putInt("ad_source", b.getSource().a());
                    Message obtain = Message.obtain((Handler) null, b.AD.a());
                    obtain.setData(bundle);
                    try {
                        message.replyTo.send(obtain);
                    } catch (RemoteException e) {
                        r.c(FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                    }
                } else if (message.what == b.AD_DISPLAYED.a()) {
                    i.a(qVar.d(), b);
                } else if (message.what == b.AD_CLICKED.a()) {
                    i.a(qVar.e(), b);
                } else if (message.what == b.AD_VIDEO_STARTED.a()) {
                    i.a(qVar.c(), b);
                } else if (message.what == b.AD_VIDEO_ENDED.a()) {
                    Bundle data = message.getData();
                    i.a(qVar.c(), b, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                } else if (message.what == b.AD_HIDDEN.a()) {
                    i.b(qVar.d(), b);
                } else {
                    super.handleMessage(message);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);
        
        private final int g;

        b(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new Messenger(new a()).getBinder();
    }
}
