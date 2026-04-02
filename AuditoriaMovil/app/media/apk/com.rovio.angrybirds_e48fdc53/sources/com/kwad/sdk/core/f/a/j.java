package com.kwad.sdk.core.f.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.kwad.sdk.core.f.b.f;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class j {
    public Context mContext;
    private final LinkedBlockingQueue<IBinder> aqu = new LinkedBlockingQueue<>(1);
    private ServiceConnection aqs = new ServiceConnection() { // from class: com.kwad.sdk.core.f.a.j.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                j.this.aqu.put(iBinder);
            } catch (Exception e) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public j(Context context) {
        this.mContext = context;
    }

    public final String getOAID() {
        Context context;
        ServiceConnection serviceConnection;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
            intent.setAction("com.bun.msa.action.bindto.service");
            intent.putExtra("com.bun.msa.param.pkgname", this.mContext.getPackageName());
            boolean bindService = this.mContext.bindService(intent, this.aqs, 1);
            new StringBuilder("getOAID isBind=").append(bindService);
            if (bindService) {
                try {
                    str = new f.a(this.aqu.take()).getOAID();
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
