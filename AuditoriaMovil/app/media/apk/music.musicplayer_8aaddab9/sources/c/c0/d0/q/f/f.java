package c.c0.d0.q.f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c.c0.r;
/* loaded from: classes.dex */
public class f extends c<Boolean> {

    /* renamed from: i  reason: collision with root package name */
    public static final String f1474i = r.e("StorageNotLowTracker");

    public f(Context context, c.c0.d0.t.t.a aVar) {
        super(context, aVar);
    }

    @Override // c.c0.d0.q.f.d
    public Object a() {
        Context context = this.f1465c;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // c.c0.d0.q.f.c
    public IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // c.c0.d0.q.f.c
    public void g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        r.c().a(f1474i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            c(Boolean.TRUE);
        }
    }
}
