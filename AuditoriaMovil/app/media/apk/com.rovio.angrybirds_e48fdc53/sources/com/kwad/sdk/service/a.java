package com.kwad.sdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.kwad.sdk.DownloadTask;
import com.kwad.sdk.api.proxy.app.DownloadService;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public class a extends com.kwad.sdk.l.a {
    private com.kwad.sdk.c aHC;
    private Service aHE;
    private final Map<String, Integer> aHD = new ConcurrentHashMap();
    private final HandlerC0272a aHF = new HandlerC0272a(this);

    /* renamed from: com.kwad.sdk.service.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class HandlerC0272a extends Handler {
        final WeakReference<a> aHG;

        public HandlerC0272a(a aVar) {
            this.aHG = new WeakReference<>(aVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a aVar = this.aHG.get();
            if (aVar != null && message.what == 1) {
                if (aVar.aHC == null || !aVar.aHC.wU()) {
                    sendEmptyMessageDelayed(1, 30000L);
                } else {
                    aVar.aHE.stopSelf();
                }
            }
        }
    }

    private void h(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            int intExtra = intent.getIntExtra("download_service_type_tag", 0);
            String stringExtra = intent.getStringExtra("download_service_id_tag");
            DownloadTask.DownloadRequest downloadRequest = (DownloadTask.DownloadRequest) intent.getSerializableExtra("download_service_args_tag");
            Integer num = this.aHD.get(stringExtra);
            if (intExtra == 1) {
                this.aHD.put(stringExtra, Integer.valueOf(this.aHC.a(downloadRequest, (com.kwad.sdk.a) null)));
            } else if (intExtra == 2) {
                this.aHC.pause(num.intValue());
            } else if (intExtra == 3) {
                this.aHC.resume(num.intValue());
            } else if (intExtra != 4) {
            } else {
                this.aHC.cancel(num.intValue());
            }
        } catch (Exception e) {
        }
    }

    public static void register() {
        b.a(DownloadService.class, a.class);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public void onCreate(Service service) {
        if (service == null) {
            return;
        }
        this.aHE = service;
        this.aHC = com.kwad.sdk.c.wO();
        this.aHF.sendEmptyMessageDelayed(1, 30000L);
    }

    @Override // com.kwad.sdk.l.a, com.kwad.sdk.api.proxy.IServiceProxy
    public int onStartCommand(Service service, Intent intent, int i, int i2) {
        h(intent);
        return super.onStartCommand(service, intent, i, i2);
    }
}
