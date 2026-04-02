package bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_19do;

import com.bytedance.android.live.base.api.push.model.PushUIConfig;
import java.io.File;
/* loaded from: classes.dex */
public class d implements Runnable {
    private final c a;
    private volatile boolean b = false;
    private Runnable c = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.b = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c cVar) {
        this.a = cVar;
        a();
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.g.a(2L);
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.f.e().a(4500L, this.c);
        bykvm_19do.bykvm_19do.bykvm_int108.bykvm_19do.bykvm_new1.f.e().a(PushUIConfig.dismissTime, this, 40, PushUIConfig.dismissTime);
    }

    private long a() {
        File file = new File("/data/anr/traces.txt");
        if (file.exists()) {
            return file.lastModified();
        }
        return 0L;
    }

    private boolean b() {
        File file = new File("/data/anr/traces.txt");
        return file.exists() && file.canRead();
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int i;
        if (this.b) {
            return;
        }
        if (b()) {
            i = 200;
            str = "/data/anr/traces.txt";
        } else {
            str = null;
            i = 100;
        }
        if (this.a.a(i, str, 25)) {
            this.b = true;
        }
    }
}
