package e.d.d.k.a;

import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzig;
import e.d.d.k.a.a;
import e.d.d.k.a.c.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class b implements e.d.d.k.a.a {
    public static volatile e.d.d.k.a.a a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    public final AppMeasurementSdk f7079b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, ?> f7080c;

    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0148a {
        public a(b bVar, String str) {
        }
    }

    public b(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f7079b = appMeasurementSdk;
        this.f7080c = new ConcurrentHashMap();
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public Map<String, Object> a(boolean z) {
        return this.f7079b.getUserProperties(null, null, z);
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public void b(a.c cVar) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        Set<String> set = e.d.d.k.a.c.b.a;
        boolean z = false;
        if (cVar != null && (str = cVar.a) != null && !str.isEmpty() && (((obj = cVar.f7067c) == null || zzig.zza(obj) != null) && e.d.d.k.a.c.b.c(str) && e.d.d.k.a.c.b.d(str, cVar.f7066b) && (((str2 = cVar.f7075k) == null || (e.d.d.k.a.c.b.b(str2, cVar.f7076l) && e.d.d.k.a.c.b.a(str, cVar.f7075k, cVar.f7076l))) && (((str3 = cVar.f7072h) == null || (e.d.d.k.a.c.b.b(str3, cVar.f7073i) && e.d.d.k.a.c.b.a(str, cVar.f7072h, cVar.f7073i))) && ((str4 = cVar.f7070f) == null || (e.d.d.k.a.c.b.b(str4, cVar.f7071g) && e.d.d.k.a.c.b.a(str, cVar.f7070f, cVar.f7071g))))))) {
            z = true;
        }
        if (z) {
            AppMeasurementSdk appMeasurementSdk = this.f7079b;
            Bundle bundle = new Bundle();
            String str5 = cVar.a;
            if (str5 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str5);
            }
            String str6 = cVar.f7066b;
            if (str6 != null) {
                bundle.putString("name", str6);
            }
            Object obj2 = cVar.f7067c;
            if (obj2 != null) {
                zzgr.zzb(bundle, obj2);
            }
            String str7 = cVar.f7068d;
            if (str7 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f7069e);
            String str8 = cVar.f7070f;
            if (str8 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
            }
            Bundle bundle2 = cVar.f7071g;
            if (bundle2 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
            }
            String str9 = cVar.f7072h;
            if (str9 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
            }
            Bundle bundle3 = cVar.f7073i;
            if (bundle3 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f7074j);
            String str10 = cVar.f7075k;
            if (str10 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
            }
            Bundle bundle4 = cVar.f7076l;
            if (bundle4 != null) {
                bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f7077m);
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, cVar.f7078n);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.o);
            appMeasurementSdk.setConditionalUserProperty(bundle);
        }
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public void c(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (e.d.d.k.a.c.b.c(str) && e.d.d.k.a.c.b.b(str2, bundle) && e.d.d.k.a.c.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f7079b.logEvent(str, str2, bundle);
        }
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f7079b.clearConditionalUserProperty(str, null, null);
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public int d(String str) {
        return this.f7079b.getMaxUserProperties(str);
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public List<a.c> e(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f7079b.getConditionalUserProperties(str, str2)) {
            Set<String> set = e.d.d.k.a.c.b.a;
            Preconditions.checkNotNull(bundle);
            a.c cVar = new a.c();
            cVar.a = (String) Preconditions.checkNotNull((String) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
            cVar.f7066b = (String) Preconditions.checkNotNull((String) zzgr.zza(bundle, "name", String.class, null));
            cVar.f7067c = zzgr.zza(bundle, "value", Object.class, null);
            cVar.f7068d = (String) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f7069e = ((Long) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f7070f = (String) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f7071g = (Bundle) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f7072h = (String) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f7073i = (Bundle) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f7074j = ((Long) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f7075k = (String) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f7076l = (Bundle) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f7078n = ((Boolean) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f7077m = ((Long) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.o = ((Long) zzgr.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public void f(String str, String str2, Object obj) {
        if (e.d.d.k.a.c.b.c(str) && e.d.d.k.a.c.b.d(str, str2)) {
            this.f7079b.setUserProperty(str, str2, obj);
        }
    }

    @Override // e.d.d.k.a.a
    @KeepForSdk
    public a.InterfaceC0148a g(String str, a.b bVar) {
        Preconditions.checkNotNull(bVar);
        if (e.d.d.k.a.c.b.c(str)) {
            if ((str.isEmpty() || !this.f7080c.containsKey(str) || this.f7080c.get(str) == null) ? false : true) {
                return null;
            }
            AppMeasurementSdk appMeasurementSdk = this.f7079b;
            Object dVar = AppMeasurement.FIAM_ORIGIN.equals(str) ? new e.d.d.k.a.c.d(appMeasurementSdk, bVar) : (AppMeasurement.CRASH_ORIGIN.equals(str) || "clx".equals(str)) ? new f(appMeasurementSdk, bVar) : null;
            if (dVar != null) {
                this.f7080c.put(str, dVar);
                return new a(this, str);
            }
            return null;
        }
        return null;
    }
}
