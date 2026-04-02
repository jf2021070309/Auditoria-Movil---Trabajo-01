package e.d.d.k.a.c;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgs;
import java.util.Set;
/* loaded from: classes2.dex */
public final class c implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzgw
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            Set<String> set = b.a;
            String zza = zzgs.zza(str2);
            if (zza != null) {
                str2 = zza;
            }
            bundle2.putString("events", str2);
            ((e.d.d.m.f) this.a.f7086b).a(2, bundle2);
        }
    }
}
