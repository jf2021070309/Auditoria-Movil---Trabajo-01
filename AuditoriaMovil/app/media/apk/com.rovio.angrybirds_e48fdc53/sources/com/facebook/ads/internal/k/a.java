package com.facebook.ads.internal.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public class a {
    private final Context a;
    private final String b;
    private final String c;
    private Messenger e;
    private boolean d = false;
    private final ServiceConnection f = new ServiceConnection() { // from class: com.facebook.ads.internal.k.a.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.d = true;
            a.this.e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.setData(a.this.b());
            try {
                a.this.e.send(obtain);
            } catch (RemoteException e) {
                com.facebook.ads.internal.q.d.a.a(e, a.this.a);
            }
            a.this.a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                a.this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
            }
            a.this.e = null;
            a.this.d = false;
        }
    };

    public a(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("PARAM_PROTOCOL_VERSION", 1);
        bundle.putString("PARAM_AN_UUID", this.c);
        bundle.putString("PARAM_REQUEST_ID", this.b);
        return bundle;
    }

    public void a() {
        Intent intent = new Intent();
        intent.setClassName("com.facebook.katana", "com.facebook.audiencenetwork.AudienceNetworkService");
        try {
            if (this.a.bindService(intent, this.f, 1)) {
                return;
            }
            this.a.unbindService(this.f);
        } catch (Exception e) {
            com.facebook.ads.internal.q.d.a.a(e, this.a);
        }
    }
}
