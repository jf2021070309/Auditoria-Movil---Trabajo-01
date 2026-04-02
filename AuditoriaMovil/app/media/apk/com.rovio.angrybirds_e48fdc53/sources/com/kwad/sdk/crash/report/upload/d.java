package com.kwad.sdk.crash.report.upload;

import com.kwad.sdk.core.network.m;
import com.kwad.sdk.core.network.p;
import com.kwad.sdk.crash.utils.g;
import com.kwad.sdk.utils.au;
import com.kwad.sdk.utils.q;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class d {
    public static void a(final File file, boolean z, final CountDownLatch countDownLatch) {
        com.kwad.sdk.core.e.c.d("ExceptionCollector", "upload()" + Thread.currentThread());
        final f fVar = new f();
        fVar.aBT = au.getDeviceId();
        HashMap hashMap = new HashMap();
        hashMap.put("mLogUUID", g.eR(file.getName()));
        fVar.aBV = new JSONObject(hashMap).toString();
        fVar.aBW = q.getExtension(file.getName());
        fVar.aBY = file;
        new m<c, GetUploadTokenResult>() { // from class: com.kwad.sdk.crash.report.upload.d.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.a
            /* renamed from: Fk */
            public c createRequest() {
                return new c(au.getDeviceId(), f.this.aBR, "zip");
            }

            private static GetUploadTokenResult eQ(String str) {
                JSONObject jSONObject = new JSONObject(str);
                GetUploadTokenResult getUploadTokenResult = new GetUploadTokenResult();
                getUploadTokenResult.parseJson(jSONObject);
                return getUploadTokenResult;
            }

            @Override // com.kwad.sdk.core.network.m
            public final boolean isPostByJson() {
                return false;
            }

            @Override // com.kwad.sdk.core.network.m
            public final /* synthetic */ GetUploadTokenResult parseData(String str) {
                return eQ(str);
            }
        }.request(new p<c, GetUploadTokenResult>() { // from class: com.kwad.sdk.crash.report.upload.d.2
            private static void a(c cVar, int i, String str) {
                com.kwad.sdk.core.e.c.d("ExceptionCollector", "onError errorCode=" + i + "errorMsg=" + str + "url=" + cVar.getUrl());
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            /* renamed from: a */
            public void onSuccess(c cVar, GetUploadTokenResult getUploadTokenResult) {
                com.kwad.sdk.core.e.c.d("ExceptionCollector", "onSuccess url=" + cVar.getUrl() + " ---{" + getUploadTokenResult.uploadToken);
                if (getUploadTokenResult.isResultOk()) {
                    f.this.aBX = getUploadTokenResult.uploadToken;
                    b.a(file, f.this, new a() { // from class: com.kwad.sdk.crash.report.upload.d.2.1
                        @Override // com.kwad.sdk.crash.report.upload.a
                        public final void Fi() {
                            if (countDownLatch != null) {
                                countDownLatch.countDown();
                            }
                        }

                        @Override // com.kwad.sdk.crash.report.upload.a
                        public final void Fj() {
                            com.kwad.sdk.core.e.c.d("ExceptionCollector", "uploadLogFile onSuccess " + Thread.currentThread() + " delete file:" + file.getPath());
                            if (countDownLatch != null) {
                                countDownLatch.countDown();
                            }
                            if (r4) {
                                q.delete(file.getPath());
                            }
                        }
                    });
                }
            }

            @Override // com.kwad.sdk.core.network.p, com.kwad.sdk.core.network.h
            public final /* synthetic */ void onError(com.kwad.sdk.core.network.g gVar, int i, String str) {
                a((c) gVar, i, str);
            }
        });
    }
}
