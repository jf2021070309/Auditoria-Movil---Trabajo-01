package e.j.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class h extends HandlerThread {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f8511b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Message> f8512c;

    /* loaded from: classes2.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                h.this.a.c((e.j.b.i.b) message.obj, true);
            } else if (i2 != 2) {
            } else {
                if (message.arg2 != 1) {
                    h.this.a.c((e.j.b.i.b) message.obj, true);
                }
                h hVar = h.this;
                Objects.requireNonNull(hVar);
                Message message2 = new Message();
                message2.what = 2;
                message2.obj = message.obj;
                message2.arg1 = message.arg1;
                hVar.f8511b.sendMessageDelayed(message2, message.arg1);
            }
        }
    }

    public h(c cVar) {
        super("SessionThread");
        this.f8512c = new ArrayList();
        this.a = cVar;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        n.a.a.b("SessionThread").a("Session thread ready", new Object[0]);
        c cVar = this.a;
        for (e.j.b.a aVar : cVar.f8508f) {
            aVar.e(cVar.f8506d);
        }
        synchronized (this) {
            this.f8511b = new a(getLooper());
            for (Message message : this.f8512c) {
                this.f8511b.sendMessage(message);
            }
            notifyAll();
        }
    }
}
