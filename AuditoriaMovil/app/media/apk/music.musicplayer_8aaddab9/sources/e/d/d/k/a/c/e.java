package e.d.d.k.a.c;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* loaded from: classes2.dex */
public final class e implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgw
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN) || !(!b.a.contains(str2))) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j2);
        bundle2.putBundle("params", bundle);
        ((e.d.d.m.f) this.a.a).a(3, bundle2);
    }
}
