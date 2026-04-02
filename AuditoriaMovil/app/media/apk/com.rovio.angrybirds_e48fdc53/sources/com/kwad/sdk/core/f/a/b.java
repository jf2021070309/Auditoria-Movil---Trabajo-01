package com.kwad.sdk.core.f.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.kwad.sdk.core.f.b.b;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class b {
    private Context mContext;
    private final LinkedBlockingQueue<IBinder> aqu = new LinkedBlockingQueue<>(1);
    private ServiceConnection aqs = new ServiceConnection() { // from class: com.kwad.sdk.core.f.a.b.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                b.this.aqu.put(iBinder);
            } catch (Exception e) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public b(Context context) {
        this.mContext = context;
    }

    public final String getOAID() {
        Context context;
        ServiceConnection serviceConnection;
        String str = "";
        try {
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage("com.huawei.hwid");
            if (this.mContext.bindService(intent, this.aqs, 1)) {
                try {
                    b.a aVar = new b.a(this.aqu.take());
                    str = aVar.BK();
                    boolean BL = aVar.BL();
                    StringBuilder sb = new StringBuilder("getOAID oaid:");
                    sb.append(str);
                    sb.append("--boos:");
                    sb.append(BL);
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
