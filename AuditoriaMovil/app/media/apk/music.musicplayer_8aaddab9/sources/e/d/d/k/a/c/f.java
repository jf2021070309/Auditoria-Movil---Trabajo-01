package e.d.d.k.a.c;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e.d.d.k.a.a;
/* loaded from: classes2.dex */
public final class f {
    public final a.b a;

    /* renamed from: b  reason: collision with root package name */
    public final AppMeasurementSdk f7089b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7090c;

    public f(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.a = bVar;
        this.f7089b = appMeasurementSdk;
        e eVar = new e(this);
        this.f7090c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }
}
