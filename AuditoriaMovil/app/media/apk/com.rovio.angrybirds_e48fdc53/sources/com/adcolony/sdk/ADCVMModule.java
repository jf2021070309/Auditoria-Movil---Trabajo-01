package com.adcolony.sdk;

import java.io.File;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class ADCVMModule implements g {
    static boolean a = false;
    int b;
    ExecutorService c;
    private boolean d;
    private JSONArray e = as.b();
    private Runnable f;
    private Runnable g;
    private ADCJSVirtualMachine h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ADCVMModule(android.app.Activity r9, int r10, java.lang.String r11, org.json.JSONObject r12, java.util.concurrent.ExecutorService r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.ADCVMModule.<init>(android.app.Activity, int, java.lang.String, org.json.JSONObject, java.util.concurrent.ExecutorService):void");
    }

    @Override // com.adcolony.sdk.g
    public int a() {
        return this.b;
    }

    @Override // com.adcolony.sdk.g
    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            this.e.put(jSONObject);
        }
    }

    @Override // com.adcolony.sdk.g
    public void b() {
        if (this.g == null) {
            this.g = new Runnable() { // from class: com.adcolony.sdk.ADCVMModule.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!a.a().e()) {
                        ADCVMModule.this.h.a();
                    }
                }
            };
        }
        this.c.submit(this.g);
        this.c.shutdown();
    }

    @Override // com.adcolony.sdk.g
    public void c() {
        if (this.f == null) {
            this.f = new Runnable() { // from class: com.adcolony.sdk.ADCVMModule.2
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    JSONArray b;
                    String str2 = "";
                    synchronized (ADCVMModule.this.e) {
                        if (ADCVMModule.this.e.length() > 0) {
                            str2 = ADCVMModule.this.e.toString();
                            ADCVMModule.this.e = as.b();
                        }
                    }
                    if (!a.a().e()) {
                        try {
                            str = new String(ADCVMModule.this.h.a(str2.getBytes("UTF-8")), "UTF-8");
                        } catch (Exception e) {
                            au.h.a("VM update failed: ").b(q.a(e));
                            a.a().n().a(ADCVMModule.this.b);
                        }
                        if (str == null && str.length() > 2 && (b = as.b(str)) != null) {
                            for (int i = 0; i < b.length(); i++) {
                                JSONObject a2 = as.a(b, i);
                                if (a2 != null) {
                                    a.a().n().a(a2);
                                }
                            }
                            return;
                        }
                        return;
                    }
                    str = null;
                    if (str == null) {
                    }
                }
            };
        }
        this.c.submit(this.f);
    }

    public long d() {
        return this.h.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorService e() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class ADCJSVirtualMachine {
        private long b;
        private int c;

        private native long create(int i, byte[] bArr, byte[] bArr2);

        private native void delete(long j, int i);

        private native byte[] update(long j, int i, byte[] bArr);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a extends Exception {
            a(String str) {
                super(str);
            }
        }

        ADCJSVirtualMachine(int i, byte[] bArr, byte[] bArr2) {
            this.b = create(i, bArr, bArr2);
            if (this.b < 0) {
                throw new a("Virtual machine could not be created.");
            }
            this.c = i;
        }

        void a() {
            delete(this.b, this.c);
        }

        byte[] a(byte[] bArr) {
            byte[] update = update(this.b, this.c, bArr);
            if (update == null) {
                if (com.adcolony.sdk.a.d() && (com.adcolony.sdk.a.c() instanceof t)) {
                    q.a(new Runnable() { // from class: com.adcolony.sdk.ADCVMModule.ADCJSVirtualMachine.1
                        @Override // java.lang.Runnable
                        public void run() {
                            d dVar = new d("AdSession.finish_fullscreen_ad", 0);
                            as.b(dVar.b(), "status", 1);
                            ((t) com.adcolony.sdk.a.c()).a(dVar);
                        }
                    });
                }
                if (ADCVMModule.this.d) {
                    try {
                        new File(com.adcolony.sdk.a.a().l().g() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5").delete();
                    } catch (Exception e) {
                    }
                }
                throw new a("Virtual machine error.");
            }
            return update;
        }
    }
}
