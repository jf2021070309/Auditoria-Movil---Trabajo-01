package com.amazon.aps.iva.oa0;

import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: SingularExceptionReporter.java */
/* loaded from: classes4.dex */
public final class o0 implements Runnable {
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ p0 c;

    public o0(p0 p0Var, Throwable th) {
        this.c = p0Var;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.amazon.aps.iva.if0.c cVar = new com.amazon.aps.iva.if0.c();
            Throwable th = this.b;
            p0 p0Var = this.c;
            if (th != null) {
                cVar.put(AppMeasurementSdk.ConditionalUserProperty.NAME, th.getClass().getSimpleName());
                cVar.put("message", th.getMessage());
                cVar.put("stack_trace", Log.getStackTraceString(th));
                if (p0Var.d != null) {
                    com.amazon.aps.iva.if0.c cVar2 = new com.amazon.aps.iva.if0.c();
                    cVar2.put("aifa", p0Var.d.b);
                    cVar2.put("appName", p0Var.d.q);
                    cVar2.put("appVersion", p0Var.d.k);
                    cVar2.put("deviceModel", p0Var.d.p);
                    cVar2.put("deviceBrand", p0Var.d.l);
                    cVar2.put("deviceManufacturer", p0Var.d.o);
                    cVar2.put("osVersion", p0Var.d.u);
                    cVar2.put("sdkVersion", p0Var.d.t);
                    cVar2.put("isGooglePlayServicesAvailable", p0Var.d.e);
                    cVar.put("device_info", cVar2);
                }
            } else {
                cVar.put("error", "Throwable is null!");
            }
            p0.a(p0Var, cVar);
        } catch (Throwable unused) {
        }
    }
}
