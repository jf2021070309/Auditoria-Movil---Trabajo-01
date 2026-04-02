package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
/* loaded from: classes.dex */
final class j1<SERVICE, RESULT> {
    private final CountDownLatch a = new CountDownLatch(1);
    private final Intent b;
    private final b<SERVICE, RESULT> c;
    private final Context d;

    /* loaded from: classes.dex */
    class a implements ServiceConnection {
        private final CountDownLatch a;
        private final b<SERVICE, RESULT> b;
        SERVICE c;

        a(j1 j1Var, CountDownLatch countDownLatch, b<SERVICE, RESULT> bVar) {
            this.a = countDownLatch;
            this.b = bVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            t0.b("Oaid#", "ServiceBlockBinder#onServiceConnected " + componentName);
            try {
                this.c = this.b.a(iBinder);
                this.a.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            t0.b("Oaid#", "ServiceBlockBinder#onServiceDisconnected" + componentName);
            try {
                this.a.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    interface b<T, RESULT> {
        T a(IBinder iBinder);

        RESULT a(T t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j1(Context context, Intent intent, b<SERVICE, RESULT> bVar) {
        this.d = context;
        this.b = intent;
        this.c = bVar;
    }

    private void a(j1<SERVICE, RESULT>.a aVar) {
        if (aVar != null) {
            try {
                this.d.unbindService(aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RESULT a() {
        Throwable th;
        j1<SERVICE, RESULT>.a aVar;
        RESULT result = null;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                aVar = new a(this, this.a, this.c);
                this.d.bindService(this.b, aVar, 1);
                this.a.await();
            } catch (Throwable th2) {
                th = th2;
                aVar = null;
            }
            try {
                result = this.c.a((b<SERVICE, RESULT>) aVar.c);
            } catch (Throwable th3) {
                th = th3;
                try {
                    th.printStackTrace();
                    return result;
                } finally {
                    a(aVar);
                }
            }
        }
        return result;
    }
}
