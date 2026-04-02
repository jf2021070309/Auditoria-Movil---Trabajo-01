package com.kwad.sdk.core.f.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.kwad.sdk.core.f.b.c;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class c {
    private Context mContext;
    private final LinkedBlockingQueue<IBinder> aqu = new LinkedBlockingQueue<>(1);
    private ServiceConnection aqs = new ServiceConnection() { // from class: com.kwad.sdk.core.f.a.c.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                c.this.aqu.put(iBinder);
            } catch (Exception e) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public c(Context context) {
        this.mContext = context;
    }

    public final String getOAID() {
        Context context;
        ServiceConnection serviceConnection;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (this.mContext.bindService(intent, this.aqs, 1)) {
                try {
                    str = new c.a(this.aqu.take()).getOaid();
                    new StringBuilder("getOAID oaid:").append(str);
                    context = this.mContext;
                    serviceConnection = this.aqs;
                } catch (Exception e) {
                    context = this.mContext;
                    serviceConnection = this.aqs;
                } catch (Throwable th) {
                    this.mContext.unbindService(this.aqs);
                    throw th;
                }
                context.unbindService(serviceConnection);
            }
        } catch (Exception e2) {
        }
        return str;
    }
}
