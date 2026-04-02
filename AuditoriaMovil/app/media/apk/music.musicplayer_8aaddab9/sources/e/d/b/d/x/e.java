package e.d.b.d.x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;
/* loaded from: classes2.dex */
public class e {
    public static e a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6680b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f6681c = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes2.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e eVar = e.this;
            b bVar = (b) message.obj;
            synchronized (eVar.f6680b) {
                if (bVar == null) {
                    Objects.requireNonNull(bVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
    }
}
