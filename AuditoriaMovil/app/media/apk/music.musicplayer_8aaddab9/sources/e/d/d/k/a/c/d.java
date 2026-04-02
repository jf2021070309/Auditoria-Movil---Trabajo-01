package e.d.d.k.a.c;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e.d.d.k.a.a;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public final class d {
    public final Set<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b f7086b;

    /* renamed from: c  reason: collision with root package name */
    public final AppMeasurementSdk f7087c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7088d;

    public d(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f7086b = bVar;
        this.f7087c = appMeasurementSdk;
        c cVar = new c(this);
        this.f7088d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.a = new HashSet();
    }
}
