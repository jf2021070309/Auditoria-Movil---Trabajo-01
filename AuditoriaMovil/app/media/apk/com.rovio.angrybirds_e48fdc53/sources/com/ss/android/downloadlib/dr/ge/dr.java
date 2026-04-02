package com.ss.android.downloadlib.dr.ge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.dr.ge.o;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class dr {
    private static volatile dr rb;
    public o dr;
    private Context t;
    private static String g = "";
    private static String q = "";
    private static String bn = "";
    private boolean xu = true;
    private boolean ll = false;
    private volatile boolean wb = false;
    private final List<Pair<ge, g>> yk = new ArrayList();
    public final List<InterfaceC0293dr> ge = new ArrayList();
    private final ServiceConnection cu = new ServiceConnection() { // from class: com.ss.android.downloadlib.dr.ge.dr.1
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (dr.this.o) {
                dr.this.dr(false);
                dr.this.dr = o.dr.dr(iBinder);
                dr.this.o();
                for (InterfaceC0293dr interfaceC0293dr : dr.this.ge) {
                    interfaceC0293dr.dr();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (dr.this.o) {
                dr.this.dr(false);
                dr.this.dr = null;
                for (InterfaceC0293dr interfaceC0293dr : dr.this.ge) {
                    interfaceC0293dr.ge();
                }
            }
        }
    };
    private String v = "";
    public final Object o = new Object();

    /* renamed from: com.ss.android.downloadlib.dr.ge.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0293dr {
        void dr();

        void ge();
    }

    private dr() {
    }

    public static dr dr() {
        if (rb == null) {
            synchronized (dr.class) {
                if (rb == null) {
                    rb = new dr();
                }
            }
        }
        return rb;
    }

    public boolean dr(Context context, boolean z) {
        if (TextUtils.isEmpty(g)) {
            JSONObject ll = wb.ll();
            String optString = ll.optString("s");
            g = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("q"), optString);
            q = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("u"), optString);
            bn = com.ss.android.socialbase.appdownloader.bn.o.dr(ll.optString("w"), optString);
        }
        this.ll = z;
        if (context != null) {
            this.t = context.getApplicationContext();
            if (TextUtils.isEmpty(bn)) {
                bn = this.t.getPackageName();
            }
            if (this.dr == null && !g()) {
                return this.t.bindService(dr(context), this.cu, 33);
            }
            return true;
        }
        return true;
    }

    public void ge() {
        if (this.dr != null) {
            this.t.unbindService(this.cu);
            this.dr = null;
        }
        this.ge.clear();
        this.yk.clear();
    }

    public Intent dr(Context context) {
        Intent intent = new Intent();
        intent.setAction(g);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.size() != 1) {
            return null;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            String str = resolveInfo.serviceInfo.packageName;
            String str2 = resolveInfo.serviceInfo.name;
            if (q.equals(str)) {
                ComponentName componentName = new ComponentName(str, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    public void dr(ge geVar, g gVar) {
        synchronized (this.o) {
            geVar.q = bn;
            if (TextUtils.isEmpty(geVar.bn)) {
                geVar.bn = this.v;
            }
            o oVar = this.dr;
            if (oVar != null) {
                try {
                    oVar.dr(geVar, gVar);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            } else if (g() || dr(this.t, this.ll)) {
                this.yk.add(Pair.create(geVar, gVar));
            }
        }
    }

    public void o() {
        for (Pair<ge, g> pair : this.yk) {
            try {
                this.dr.dr((ge) pair.first, (g) pair.second);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
        this.yk.clear();
    }

    public boolean g() {
        return this.wb;
    }

    public void dr(boolean z) {
        this.wb = z;
    }
}
