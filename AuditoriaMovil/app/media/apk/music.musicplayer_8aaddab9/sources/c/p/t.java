package c.p;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import c.p.j;
import java.util.Objects;
/* loaded from: classes.dex */
public class t extends Service implements p {
    public final f0 a = new f0(this);

    @Override // c.p.p
    public j getLifecycle() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.a(j.a.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.a(j.a.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.a(j.a.ON_STOP);
        f0Var.a(j.a.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i2) {
        f0 f0Var = this.a;
        Objects.requireNonNull(f0Var);
        f0Var.a(j.a.ON_START);
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
