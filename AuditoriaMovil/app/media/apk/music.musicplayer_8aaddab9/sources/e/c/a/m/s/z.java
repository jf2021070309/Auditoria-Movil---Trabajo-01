package e.c.a.m.s;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
/* loaded from: classes.dex */
public class z {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f5782b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((w) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(w<?> wVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            wVar.a();
            this.a = false;
        }
        this.f5782b.obtainMessage(1, wVar).sendToTarget();
    }
}
