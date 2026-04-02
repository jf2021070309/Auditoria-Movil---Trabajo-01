package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12;

import android.os.Handler;
import android.os.Message;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.f;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.k;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b<T extends k> {
    private f<T> a;
    private Handler b;
    private AtomicBoolean c = new AtomicBoolean(false);

    public b(String str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_19do.a<T> aVar, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_for12.bykvm_if122.a<T> aVar2, f.b bVar, f.a aVar3) {
        this.a = new f<>(str, aVar, aVar2, bVar, aVar3);
    }

    public void a() {
        if (this.c.get()) {
            Message obtainMessage = this.b.obtainMessage();
            obtainMessage.what = 2;
            this.b.sendMessage(obtainMessage);
        }
    }

    public void a(T t) {
        if (this.c.get()) {
            Message obtainMessage = this.b.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.obj = t;
            this.b.sendMessage(obtainMessage);
        }
    }

    public void b() {
        AtomicBoolean atomicBoolean;
        synchronized (this) {
            AtomicBoolean atomicBoolean2 = this.c;
            if ((atomicBoolean2 == null || !atomicBoolean2.get()) && this.a.getLooper() == null && (atomicBoolean = this.c) != null && !atomicBoolean.get()) {
                this.a.start();
                Handler handler = new Handler(this.a.getLooper(), this.a);
                this.b = handler;
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 5;
                this.b.sendMessage(obtainMessage);
                this.c.set(true);
            }
        }
    }
}
