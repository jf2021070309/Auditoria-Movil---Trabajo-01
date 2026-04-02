package com.kwad.sdk.collector;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.kwad.sdk.collector.model.jni.UploadEntryNative;
import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.utils.t;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class j {
    public static void a(Context context, AppStatusRules appStatusRules) {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        long obtainUploadConfigFileMaxSize = appStatusRules.obtainUploadConfigFileMaxSize();
        List<com.kwad.sdk.collector.model.d> uploadTargets = appStatusRules.getUploadTargets();
        if (uploadTargets == null) {
            return;
        }
        File file = new File(Environment.getExternalStorageDirectory(), "/Android/data/");
        List<com.kwad.sdk.collector.model.e> a = b.yB().a(uploadTargets, obtainUploadConfigFileMaxSize, file.getAbsolutePath() + "/");
        List<UploadEntryNative> aM = aM(context);
        if (aM != null) {
            a.addAll(aM);
            HashSet hashSet = new HashSet(a);
            a.clear();
            a.addAll(hashSet);
        }
        b(context, a);
    }

    private static List<UploadEntryNative> aM(Context context) {
        File file = new File(context.getApplicationInfo().dataDir, "LOCAL_TEMP_UPLOAD_FAILURE_JSON");
        if (file.exists()) {
            try {
                return t.fw(com.kwad.sdk.crash.utils.h.I(file));
            } catch (IOException e) {
                return null;
            }
        }
        return null;
    }

    public static void aN(Context context) {
        try {
            File file = new File(context.getApplicationInfo().dataDir, "LOCAL_TEMP_UPLOAD_FAILURE_JSON");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
        }
    }

    private static void b(final Context context, final List<com.kwad.sdk.collector.model.e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        new m<com.kwad.sdk.collector.a.b, CollectResponse>() { // from class: com.kwad.sdk.collector.j.1
            private static CollectResponse cl(String str) {
                CollectResponse collectResponse = new CollectResponse();
                collectResponse.parseJson(new JSONObject(str));
                return collectResponse;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: yG */
            public com.kwad.sdk.collector.a.b createRequest() {
                return new com.kwad.sdk.collector.a.b(list);
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean enableMonitorReport() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ CollectResponse parseData(String str) {
                return cl(str);
            }
        }.request(new p<com.kwad.sdk.collector.a.b, CollectResponse>() { // from class: com.kwad.sdk.collector.j.2
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onStartRequest(com.kwad.sdk.collector.a.b bVar) {
                super.onStartRequest(bVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onError(com.kwad.sdk.collector.a.b bVar, int i, String str) {
                super.onError(bVar, i, str);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(com.kwad.sdk.collector.a.b bVar, CollectResponse collectResponse) {
                super.onSuccess(bVar, collectResponse);
                yH();
            }

            private synchronized void yH() {
                j.aN(context);
            }
        });
    }
}
