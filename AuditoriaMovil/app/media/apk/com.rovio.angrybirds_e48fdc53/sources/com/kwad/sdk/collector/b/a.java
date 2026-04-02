package com.kwad.sdk.collector.b;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.webkit.WebView;
import com.kwad.sdk.api.proxy.app.ServiceProxyRemote;
import com.kwad.sdk.collector.AppStatusRules;
import com.kwad.sdk.collector.d;
import com.kwad.sdk.collector.model.b;
import com.kwad.sdk.core.e.c;
import com.kwad.sdk.utils.SystemUtil;
import com.kwad.sdk.utils.ap;
import com.kwad.sdk.utils.f;
import com.kwad.sdk.utils.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
/* loaded from: classes.dex */
public class a extends com.kwad.sdk.l.a {
    private static AtomicBoolean ajX = new AtomicBoolean(false);
    public static volatile Message ajY;
    private HandlerC0245a ajV = new HandlerC0245a((byte) 0);
    private Messenger ajW = new Messenger(this.ajV);

    /* renamed from: com.kwad.sdk.collector.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class HandlerC0245a extends Handler {
        private WeakReference<Service> aka;

        private HandlerC0245a() {
        }

        /* synthetic */ HandlerC0245a(byte b) {
            this();
        }

        public final void a(Service service) {
            if (service != null) {
                this.aka = new WeakReference<>(service);
            } else {
                this.aka = null;
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            c.d("RemoteService", "handleMessage");
            WeakReference<Service> weakReference = this.aka;
            Service service = weakReference != null ? weakReference.get() : null;
            if (service == null) {
                return;
            }
            if (!a.yL().get()) {
                c.d("RemoteService", "save buffered message");
                a.ajY = Message.obtain(message);
                return;
            }
            final Messenger messenger = message.replyTo;
            int i = message.what;
            c.d("RemoteService", "handleMessage what: " + i);
            if (i != 100) {
                return;
            }
            final Bundle bundle = new Bundle();
            f.a(service, new f.b() { // from class: com.kwad.sdk.collector.b.a.a.1
                @Override // com.kwad.sdk.utils.f.b
                public final void q(List<b> list) {
                    c.d("RemoteService", "RemoteService: onAppStatusResult list: " + list);
                    if (list != null && !list.isEmpty()) {
                        c.d("RemoteService", "RemoteService: onAppStatusResult: " + list.size());
                        JSONArray F = f.a.F(list);
                        String jSONArray = F != null ? F.toString() : null;
                        c.d("RemoteService", "resultJson :" + jSONArray);
                        if (jSONArray != null) {
                            AppStatusRules HD = f.HD();
                            ArrayList<AppStatusRules.Strategy> allStrategy = HD != null ? HD.getAllStrategy() : null;
                            String jSONArray2 = allStrategy != null ? t.I(allStrategy).toString() : null;
                            bundle.putString("resultJson", jSONArray);
                            bundle.putString("allStrategyJson", jSONArray2);
                        }
                    }
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 101;
                        obtain.setData(bundle);
                        messenger.send(obtain);
                    } catch (RemoteException e) {
                    }
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    for (b bVar : list) {
                        bVar.destroy();
                    }
                }
            });
        }
    }

    public static void a(Context context, ServiceConnection serviceConnection) {
        c.d("RemoteService", "bindASService");
        context.bindService(new Intent(context, ServiceProxyRemote.class), serviceConnection, 1);
    }

    private static boolean aO(Context context) {
        String processName = ap.getProcessName(context);
        return (processName == null || context.getPackageName().equals(processName)) ? false : true;
    }

    public static void b(Context context, ServiceConnection serviceConnection) {
        c.d("RemoteService", "unbindASService");
        try {
            context.unbindService(serviceConnection);
        } catch (Exception e) {
            c.printStackTrace(e);
        }
    }

    public static void register() {
        try {
            com.kwad.sdk.service.b.a(Class.forName("com.kwad.sdk.api.proxy.app.ServiceProxyRemote"), a.class);
        } catch (Throwable th) {
        }
    }

    public static AtomicBoolean yL() {
        return ajX;
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public IBinder onBind(Service service, Intent intent) {
        return this.ajW.getBinder();
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onCreate(Service service) {
        super.onCreate(service);
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WebView.setDataDirectorySuffix(ap.getProcessName(service.getApplicationContext()));
            } catch (Exception e) {
                c.d("RemoteService", "WebView has already been initialized " + e.getMessage());
            }
        }
        c.d("RemoteService", "onCreate processName:" + ap.getProcessName(service));
        if (SystemUtil.isInMainProcess(service)) {
            ajX.set(true);
        } else {
            d.a(service, new d.a() { // from class: com.kwad.sdk.collector.b.a.1
                @Override // com.kwad.sdk.collector.d.a
                public final void ci(String str) {
                    c.e("RemoteService", "onLoadError: " + str);
                    a.ajX.set(false);
                }

                @Override // com.kwad.sdk.collector.d.a
                public final void onLoaded() {
                    c.d("RemoteService", "onLoaded");
                    a.ajX.set(true);
                    if (a.ajY != null) {
                        a.this.ajV.handleMessage(a.ajY);
                        a.ajY = null;
                    }
                }
            });
        }
        this.ajV.a(service);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onDestroy(Service service) {
        super.onDestroy(service);
        c.d("RemoteService", "onDestroy");
        this.ajV.a(null);
        if (aO(service)) {
            c.d("RemoteService", "goto kill myself");
            Process.killProcess(Process.myPid());
        }
    }
}
