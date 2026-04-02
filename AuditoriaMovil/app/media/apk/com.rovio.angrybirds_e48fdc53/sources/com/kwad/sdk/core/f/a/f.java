package com.kwad.sdk.core.f.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.os.IBinder;
import com.flurry.android.Constants;
import com.kwad.sdk.core.f.b.d;
import java.security.MessageDigest;
import java.util.concurrent.LinkedBlockingQueue;
/* loaded from: classes.dex */
public final class f {
    private Context mContext;
    private final LinkedBlockingQueue<IBinder> aqu = new LinkedBlockingQueue<>(1);
    private ServiceConnection aqs = new ServiceConnection() { // from class: com.kwad.sdk.core.f.a.f.1
        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                f.this.aqu.put(iBinder);
            } catch (InterruptedException e) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    };

    public f(Context context) {
        this.mContext = context;
    }

    private String BJ() {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return null;
            }
            byte[] digest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & Constants.UNKNOWN) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public final String getOAID() {
        Context context;
        ServiceConnection serviceConnection;
        String str = "";
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            boolean bindService = this.mContext.bindService(intent, this.aqs, 1);
            new StringBuilder("getOAID isBin=").append(bindService);
            if (bindService) {
                try {
                    str = new d.a(this.aqu.take()).getSerID(this.mContext.getPackageName(), BJ(), "OUID");
                    new StringBuilder("getOAID oaid").append(str);
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
