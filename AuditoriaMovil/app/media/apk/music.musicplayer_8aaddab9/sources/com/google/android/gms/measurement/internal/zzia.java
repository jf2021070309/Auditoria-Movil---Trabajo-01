package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zznu;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzod;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e.a.d.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class zzia extends zzf {
    @VisibleForTesting
    public zzhz zza;
    public final zzr zzb;
    @VisibleForTesting
    public boolean zzc;
    private zzgv zzd;
    private final Set<zzgw> zze;
    private boolean zzf;
    private final AtomicReference<String> zzg;
    private final Object zzh;
    private zzag zzi;
    private int zzj;
    private final AtomicLong zzk;
    private long zzl;
    private int zzm;
    private final zzky zzn;

    public zzia(zzfv zzfvVar) {
        super(zzfvVar);
        this.zze = new CopyOnWriteArraySet();
        this.zzh = new Object();
        this.zzc = true;
        this.zzn = new zzho(this);
        this.zzg = new AtomicReference<>();
        this.zzi = new zzag(null, null);
        this.zzj = 100;
        this.zzl = -1L;
        this.zzm = 100;
        this.zzk = new AtomicLong(0L);
        this.zzb = new zzr(zzfvVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzab */
    public final void zzB(Bundle bundle, long j2) {
        zznx.zzc();
        if (!this.zzs.zzf().zzs(null, zzdy.zzar) || TextUtils.isEmpty(this.zzs.zzh().zzn())) {
            zzR(bundle, 0, j2);
        } else {
            this.zzs.zzay().zzl().zza("Using developer consent only; google app id found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzac(Boolean bool, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zzb("Setting app measurement enabled (FE)", bool);
        this.zzs.zzm().zzh(bool);
        if (z) {
            zzfa zzm = this.zzs.zzm();
            zzfv zzfvVar = zzm.zzs;
            zzm.zzg();
            SharedPreferences.Editor edit = zzm.zza().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.zzs.zzK() || !(bool == null || bool.booleanValue())) {
            zzad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzad() {
        zzg();
        String zza = this.zzs.zzm().zzh.zza();
        if (zza != null) {
            if ("unset".equals(zza)) {
                zzZ("app", "_npa", null, this.zzs.zzav().currentTimeMillis());
            } else {
                zzZ("app", "_npa", Long.valueOf(true != "true".equals(zza) ? 0L : 1L), this.zzs.zzav().currentTimeMillis());
            }
        }
        if (!this.zzs.zzJ() || !this.zzc) {
            this.zzs.zzay().zzc().zza("Updating Scion state (FE)");
            this.zzs.zzt().zzI();
            return;
        }
        this.zzs.zzay().zzc().zza("Recording app launch after enabling measurement for the first time (FE)");
        zzy();
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzai)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzs.zzaz().zzp(new zzhd(this));
    }

    public static /* synthetic */ void zzv(zzia zziaVar, zzag zzagVar, int i2, long j2, boolean z, boolean z2) {
        zziaVar.zzg();
        zziaVar.zza();
        if (j2 <= zziaVar.zzl && zzag.zzl(zziaVar.zzm, i2)) {
            zziaVar.zzs.zzay().zzi().zzb("Dropped out-of-date consent setting, proposed settings", zzagVar);
            return;
        }
        zzfa zzm = zziaVar.zzs.zzm();
        zzfv zzfvVar = zzm.zzs;
        zzm.zzg();
        if (!zzm.zzl(i2)) {
            zziaVar.zzs.zzay().zzi().zzb("Lower precedence consent source ignored, proposed source", Integer.valueOf(i2));
            return;
        }
        SharedPreferences.Editor edit = zzm.zza().edit();
        edit.putString("consent_settings", zzagVar.zzi());
        edit.putInt("consent_source", i2);
        edit.apply();
        zziaVar.zzl = j2;
        zziaVar.zzm = i2;
        zziaVar.zzs.zzt().zzF(z);
        if (z2) {
            zziaVar.zzs.zzt().zzu(new AtomicReference<>());
        }
    }

    public final void zzA() {
        if (!(this.zzs.zzau().getApplicationContext() instanceof Application) || this.zza == null) {
            return;
        }
        ((Application) this.zzs.zzau().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.zza);
    }

    public final /* synthetic */ void zzC(Bundle bundle) {
        if (bundle == null) {
            this.zzs.zzm().zzr.zzb(new Bundle());
            return;
        }
        Bundle zza = this.zzs.zzm().zzr.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.zzs.zzv().zzae(obj)) {
                    this.zzs.zzv().zzM(this.zzn, null, 27, null, null, 0);
                }
                this.zzs.zzay().zzl().zzc("Invalid default event parameter type. Name, value", str, obj);
            } else if (zzkz.zzag(str)) {
                this.zzs.zzay().zzl().zzb("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                zza.remove(str);
            } else {
                zzkz zzv = this.zzs.zzv();
                this.zzs.zzf();
                if (zzv.zzZ("param", str, 100, obj)) {
                    this.zzs.zzv().zzN(zza, str, obj);
                }
            }
        }
        this.zzs.zzv();
        int zzc = this.zzs.zzf().zzc();
        if (zza.size() > zzc) {
            Iterator it = new TreeSet(zza.keySet()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                i2++;
                if (i2 > zzc) {
                    zza.remove(str2);
                }
            }
            this.zzs.zzv().zzM(this.zzn, null, 26, null, null, 0);
            this.zzs.zzay().zzl().zza("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.zzs.zzm().zzr.zzb(zza);
        this.zzs.zzt().zzH(zza);
    }

    public final void zzD(String str, String str2, Bundle bundle) {
        zzE(str, str2, bundle, true, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzE(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (zzkz.zzak(str2, "screen_view")) {
            this.zzs.zzs().zzx(bundle2, j2);
        } else {
            zzM(str3, str2, j2, bundle2, z2, !z2 || this.zzd == null || zzkz.zzag(str2), z, null);
        }
    }

    public final void zzF(String str, String str2, Bundle bundle, String str3) {
        zzfv.zzO();
        zzM("auto", str2, this.zzs.zzav().currentTimeMillis(), bundle, false, true, true, str3);
    }

    public final void zzG(String str, String str2, Bundle bundle) {
        zzg();
        zzH(str, str2, this.zzs.zzav().currentTimeMillis(), bundle);
    }

    public final void zzH(String str, String str2, long j2, Bundle bundle) {
        zzg();
        zzI(str, str2, j2, bundle, true, this.zzd == null || zzkz.zzag(str2), true, null);
    }

    public final void zzI(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        Bundle[] bundleArr;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(bundle);
        zzg();
        zza();
        if (!this.zzs.zzJ()) {
            this.zzs.zzay().zzc().zza("Event not sent since app measurement is disabled");
            return;
        }
        List<String> zzo = this.zzs.zzh().zzo();
        if (zzo != null && !zzo.contains(str2)) {
            this.zzs.zzay().zzc().zzc("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.zzf) {
            this.zzf = true;
            try {
                try {
                    (!this.zzs.zzN() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.zzs.zzau().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.zzs.zzau());
                } catch (Exception e2) {
                    this.zzs.zzay().zzk().zzb("Failed to invoke Tag Manager's initialize() method", e2);
                }
            } catch (ClassNotFoundException unused) {
                this.zzs.zzay().zzi().zza("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.zzs.zzaw();
            zzZ("auto", "_lgclid", bundle.getString("gclid"), this.zzs.zzav().currentTimeMillis());
        }
        this.zzs.zzaw();
        if (z && zzkz.zzal(str2)) {
            this.zzs.zzv().zzK(bundle, this.zzs.zzm().zzr.zza());
        }
        if (!z3) {
            this.zzs.zzaw();
            if (!"_iap".equals(str2)) {
                zzkz zzv = this.zzs.zzv();
                int i2 = 2;
                if (zzv.zzab("event", str2)) {
                    if (zzv.zzY("event", zzgs.zza, zzgs.zzb, str2)) {
                        zzv.zzs.zzf();
                        if (zzv.zzX("event", 40, str2)) {
                            i2 = 0;
                        }
                    } else {
                        i2 = 13;
                    }
                }
                if (i2 != 0) {
                    this.zzs.zzay().zze().zzb("Invalid public event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                    zzkz zzv2 = this.zzs.zzv();
                    this.zzs.zzf();
                    this.zzs.zzv().zzM(this.zzn, null, i2, "_ev", zzv2.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        zzpn.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzaA)) {
            this.zzs.zzaw();
            zzih zzj = this.zzs.zzs().zzj(false);
            if (zzj != null && !bundle.containsKey("_sc")) {
                zzj.zzd = true;
            }
            zzkz.zzJ(zzj, bundle, z && !z3);
        } else {
            this.zzs.zzaw();
            zzih zzj2 = this.zzs.zzs().zzj(false);
            if (zzj2 != null && !bundle.containsKey("_sc")) {
                zzj2.zzd = true;
            }
            zzkz.zzJ(zzj2, bundle, z && !z3);
        }
        boolean equals = "am".equals(str);
        boolean zzag = zzkz.zzag(str2);
        if (!z || this.zzd == null || zzag) {
            z4 = equals;
        } else if (!equals) {
            this.zzs.zzay().zzc().zzc("Passing event to registered event handler (FE)", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
            Preconditions.checkNotNull(this.zzd);
            this.zzd.interceptEvent(str, str2, bundle, j2);
            return;
        } else {
            z4 = true;
        }
        if (this.zzs.zzM()) {
            int zzh = this.zzs.zzv().zzh(str2);
            if (zzh != 0) {
                this.zzs.zzay().zze().zzb("Invalid event name. Event will not be logged (FE)", this.zzs.zzj().zzd(str2));
                zzkz zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, str3, zzh, "_ev", zzv3.zzC(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle zzy = this.zzs.zzv().zzy(str3, str2, bundle, CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"}), z3);
            Preconditions.checkNotNull(zzy);
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) != null && "_ae".equals(str2)) {
                zzkb zzkbVar = this.zzs.zzu().zzb;
                long elapsedRealtime = zzkbVar.zzc.zzs.zzav().elapsedRealtime();
                long j3 = elapsedRealtime - zzkbVar.zzb;
                zzkbVar.zzb = elapsedRealtime;
                if (j3 > 0) {
                    this.zzs.zzv().zzH(zzy, j3);
                }
            }
            zznu.zzc();
            if (this.zzs.zzf().zzs(null, zzdy.zzah)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    zzkz zzv4 = this.zzs.zzv();
                    String string = zzy.getString("_ffr");
                    String trim = Strings.isEmptyOrWhitespace(string) ? null : string != null ? string.trim() : string;
                    if (zzkz.zzak(trim, zzv4.zzs.zzm().zzo.zza())) {
                        zzv4.zzs.zzay().zzc().zza("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    zzv4.zzs.zzm().zzo.zzb(trim);
                } else if ("_ae".equals(str2)) {
                    String zza = this.zzs.zzv().zzs.zzm().zzo.zza();
                    if (!TextUtils.isEmpty(zza)) {
                        zzy.putString("_ffr", zza);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzy);
            if (this.zzs.zzm().zzj.zza() > 0 && this.zzs.zzm().zzk(j2) && this.zzs.zzm().zzl.zzb()) {
                a.G(this.zzs, "Current session is expired, remove the session number, ID, and engagement time");
                str4 = "_ae";
                zzZ("auto", "_sid", null, this.zzs.zzav().currentTimeMillis());
                zzZ("auto", "_sno", null, this.zzs.zzav().currentTimeMillis());
                zzZ("auto", "_se", null, this.zzs.zzav().currentTimeMillis());
            } else {
                str4 = "_ae";
            }
            if (zzy.getLong("extend_session", 0L) == 1) {
                a.G(this.zzs, "EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.zzs.zzu().zza.zzb(j2, true);
            }
            ArrayList arrayList2 = new ArrayList(zzy.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str5 = (String) arrayList2.get(i3);
                if (str5 != null) {
                    this.zzs.zzv();
                    Object obj = zzy.get(str5);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        zzy.putParcelableArray(str5, bundleArr);
                    }
                }
            }
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i4);
                String str6 = i4 != 0 ? "_ep" : str2;
                bundle2.putString("_o", str);
                if (z2) {
                    bundle2 = this.zzs.zzv().zzt(bundle2);
                }
                Bundle bundle3 = bundle2;
                this.zzs.zzt().zzA(new zzat(str6, new zzar(bundle3), str, j2), str3);
                if (!z4) {
                    for (zzgw zzgwVar : this.zze) {
                        zzgwVar.onEvent(str, str2, new Bundle(bundle3), j2);
                    }
                }
                i4++;
            }
            this.zzs.zzaw();
            if (this.zzs.zzs().zzj(false) == null || !str4.equals(str2)) {
                return;
            }
            this.zzs.zzu().zzb.zzd(true, true, this.zzs.zzav().elapsedRealtime());
        }
    }

    public final void zzJ(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.zze.add(zzgwVar)) {
            return;
        }
        a.H(this.zzs, "OnEventListener already registered");
    }

    public final void zzK(long j2) {
        this.zzg.set(null);
        this.zzs.zzaz().zzp(new zzhi(this, j2));
    }

    public final void zzL(long j2, boolean z) {
        zzg();
        zza();
        this.zzs.zzay().zzc().zza("Resetting analytics data (FE)");
        zzkd zzu = this.zzs.zzu();
        zzu.zzg();
        zzu.zzb.zza();
        boolean zzJ = this.zzs.zzJ();
        zzfa zzm = this.zzs.zzm();
        zzm.zzc.zzb(j2);
        if (!TextUtils.isEmpty(zzm.zzs.zzm().zzo.zza())) {
            zzm.zzo.zzb(null);
        }
        zzod.zzc();
        zzaf zzf = zzm.zzs.zzf();
        zzdx<Boolean> zzdxVar = zzdy.zzai;
        if (zzf.zzs(null, zzdxVar)) {
            zzm.zzj.zzb(0L);
        }
        if (!zzm.zzs.zzf().zzv()) {
            zzm.zzi(!zzJ);
        }
        zzm.zzp.zzb(null);
        zzm.zzq.zzb(0L);
        zzm.zzr.zzb(null);
        if (z) {
            this.zzs.zzt().zzC();
        }
        zzod.zzc();
        if (this.zzs.zzf().zzs(null, zzdxVar)) {
            this.zzs.zzu().zza.zza();
        }
        this.zzc = !zzJ;
    }

    public final void zzM(String str, String str2, long j2, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i2 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i2 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i2];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i2] = new Bundle((Bundle) parcelable);
                        }
                        i2++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i2 < list.size()) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                        i2++;
                    }
                }
            }
        }
        this.zzs.zzaz().zzp(new zzhf(this, str, str2, j2, bundle2, z, z2, z3, str3));
    }

    public final void zzN(String str, String str2, long j2, Object obj) {
        this.zzs.zzaz().zzp(new zzhg(this, str, str2, obj, j2));
    }

    public final void zzO(String str) {
        this.zzg.set(str);
    }

    public final void zzP(Bundle bundle) {
        zzQ(bundle, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzQ(Bundle bundle, long j2) {
        Preconditions.checkNotNull(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            a.H(this.zzs, "Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Preconditions.checkNotNull(bundle2);
        zzgr.zza(bundle2, "app_id", String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null);
        zzgr.zza(bundle2, "name", String.class, null);
        zzgr.zza(bundle2, "value", Object.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        zzgr.zza(bundle2, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        Preconditions.checkNotEmpty(bundle2.getString("name"));
        Preconditions.checkNotEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN));
        Preconditions.checkNotNull(bundle2.get("value"));
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, j2);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.zzs.zzv().zzl(string) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional user property name", this.zzs.zzj().zzf(string));
        } else if (this.zzs.zzv().zzd(string, obj) != 0) {
            this.zzs.zzay().zzd().zzc("Invalid conditional user property value", this.zzs.zzj().zzf(string), obj);
        } else {
            Object zzB = this.zzs.zzv().zzB(string, obj);
            if (zzB == null) {
                this.zzs.zzay().zzd().zzc("Unable to normalize conditional user property value", this.zzs.zzj().zzf(string), obj);
                return;
            }
            zzgr.zzb(bundle2, zzB);
            long j3 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT);
            if (!TextUtils.isEmpty(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME))) {
                this.zzs.zzf();
                if (j3 > 15552000000L || j3 < 1) {
                    this.zzs.zzay().zzd().zzc("Invalid conditional user property timeout", this.zzs.zzj().zzf(string), Long.valueOf(j3));
                    return;
                }
            }
            long j4 = bundle2.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE);
            this.zzs.zzf();
            if (j4 > 15552000000L || j4 < 1) {
                this.zzs.zzay().zzd().zzc("Invalid conditional user property time to live", this.zzs.zzj().zzf(string), Long.valueOf(j4));
            } else {
                this.zzs.zzaz().zzp(new zzhj(this, bundle2));
            }
        }
    }

    public final void zzR(Bundle bundle, int i2, long j2) {
        zza();
        String zzh = zzag.zzh(bundle);
        if (zzh != null) {
            this.zzs.zzay().zzl().zzb("Ignoring invalid consent setting", zzh);
            this.zzs.zzay().zzl().zza("Valid consent values are 'granted', 'denied'");
        }
        zzS(zzag.zza(bundle), i2, j2);
    }

    public final void zzS(zzag zzagVar, int i2, long j2) {
        boolean z;
        boolean z2;
        zzag zzagVar2;
        boolean z3;
        zza();
        if (i2 != -10 && zzagVar.zze() == null && zzagVar.zzf() == null) {
            this.zzs.zzay().zzl().zza("Discarding empty consent settings");
            return;
        }
        synchronized (this.zzh) {
            z = true;
            z2 = false;
            if (zzag.zzl(i2, this.zzj)) {
                boolean zzm = zzagVar.zzm(this.zzi);
                if (zzagVar.zzk() && !this.zzi.zzk()) {
                    z2 = true;
                }
                zzag zzd = zzagVar.zzd(this.zzi);
                this.zzi = zzd;
                this.zzj = i2;
                zzagVar2 = zzd;
                z3 = z2;
                z2 = zzm;
            } else {
                zzagVar2 = zzagVar;
                z3 = false;
                z = false;
            }
        }
        if (!z) {
            this.zzs.zzay().zzi().zzb("Ignoring lower-priority consent settings, proposed settings", zzagVar2);
            return;
        }
        long andIncrement = this.zzk.getAndIncrement();
        if (z2) {
            this.zzg.set(null);
            this.zzs.zzaz().zzq(new zzhu(this, zzagVar2, j2, i2, andIncrement, z3));
        } else if (i2 == 30 || i2 == -10) {
            this.zzs.zzaz().zzq(new zzhv(this, zzagVar2, i2, andIncrement, z3));
        } else {
            this.zzs.zzaz().zzp(new zzhw(this, zzagVar2, i2, andIncrement, z3));
        }
    }

    public final void zzT(final Bundle bundle, final long j2) {
        zznx.zzc();
        if (this.zzs.zzf().zzs(null, zzdy.zzas)) {
            this.zzs.zzaz().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhb
                @Override // java.lang.Runnable
                public final void run() {
                    zzia.this.zzB(bundle, j2);
                }
            });
        } else {
            zzB(bundle, j2);
        }
    }

    public final void zzU(zzgv zzgvVar) {
        zzgv zzgvVar2;
        zzg();
        zza();
        if (zzgvVar != null && zzgvVar != (zzgvVar2 = this.zzd)) {
            Preconditions.checkState(zzgvVar2 == null, "EventInterceptor already set.");
        }
        this.zzd = zzgvVar;
    }

    public final void zzV(Boolean bool) {
        zza();
        this.zzs.zzaz().zzp(new zzht(this, bool));
    }

    public final void zzW(zzag zzagVar) {
        zzg();
        boolean z = (zzagVar.zzk() && zzagVar.zzj()) || this.zzs.zzt().zzM();
        if (z != this.zzs.zzK()) {
            this.zzs.zzG(z);
            zzfa zzm = this.zzs.zzm();
            zzfv zzfvVar = zzm.zzs;
            zzm.zzg();
            Boolean valueOf = zzm.zza().contains("measurement_enabled_from_api") ? Boolean.valueOf(zzm.zza().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                zzac(Boolean.valueOf(z), false);
            }
        }
    }

    public final void zzX(String str, String str2, Object obj, boolean z) {
        zzY("auto", "_ldl", obj, true, this.zzs.zzav().currentTimeMillis());
    }

    public final void zzY(String str, String str2, Object obj, boolean z, long j2) {
        int i2;
        String str3 = str == null ? "app" : str;
        if (z) {
            i2 = this.zzs.zzv().zzl(str2);
        } else {
            zzkz zzv = this.zzs.zzv();
            if (zzv.zzab("user property", str2)) {
                if (zzv.zzY("user property", zzgu.zza, null, str2)) {
                    zzv.zzs.zzf();
                    if (zzv.zzX("user property", 24, str2)) {
                        i2 = 0;
                    }
                } else {
                    i2 = 15;
                }
            }
            i2 = 6;
        }
        if (i2 != 0) {
            zzkz zzv2 = this.zzs.zzv();
            this.zzs.zzf();
            this.zzs.zzv().zzM(this.zzn, null, i2, "_ev", zzv2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj == null) {
            zzN(str3, str2, j2, null);
        } else {
            int zzd = this.zzs.zzv().zzd(str2, obj);
            if (zzd != 0) {
                zzkz zzv3 = this.zzs.zzv();
                this.zzs.zzf();
                this.zzs.zzv().zzM(this.zzn, null, zzd, "_ev", zzv3.zzC(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object zzB = this.zzs.zzv().zzB(str2, obj);
            if (zzB != null) {
                zzN(str3, str2, j2, zzB);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzZ(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.zzg()
            r8.zza()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L65
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L53
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            com.google.android.gms.measurement.internal.zzfv r11 = r8.zzs
            com.google.android.gms.measurement.internal.zzfa r11 = r11.zzm()
            com.google.android.gms.measurement.internal.zzez r11 = r11.zzh
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.zzb(r0)
            r11 = r10
            goto L62
        L53:
            if (r11 != 0) goto L65
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            com.google.android.gms.measurement.internal.zzfa r10 = r10.zzm()
            com.google.android.gms.measurement.internal.zzez r10 = r10.zzh
            java.lang.String r0 = "unset"
            r10.zzb(r0)
        L62:
            r6 = r11
            r3 = r1
            goto L67
        L65:
            r3 = r10
            r6 = r11
        L67:
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            boolean r10 = r10.zzJ()
            if (r10 != 0) goto L77
            com.google.android.gms.measurement.internal.zzfv r9 = r8.zzs
            java.lang.String r10 = "User property not set since app measurement is disabled"
            e.a.d.a.a.G(r9, r10)
            return
        L77:
            com.google.android.gms.measurement.internal.zzfv r10 = r8.zzs
            boolean r10 = r10.zzM()
            if (r10 != 0) goto L80
            return
        L80:
            com.google.android.gms.measurement.internal.zzkv r10 = new com.google.android.gms.measurement.internal.zzkv
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.zzfv r9 = r8.zzs
            com.google.android.gms.measurement.internal.zzjo r9 = r9.zzt()
            r9.zzK(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.zzZ(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void zzaa(zzgw zzgwVar) {
        zza();
        Preconditions.checkNotNull(zzgwVar);
        if (this.zze.remove(zzgwVar)) {
            return;
        }
        a.H(this.zzs, "OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final int zzh(String str) {
        Preconditions.checkNotEmpty(str);
        this.zzs.zzf();
        return 25;
    }

    public final Boolean zzi() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.zzs.zzaz().zzd(atomicReference, 15000L, "boolean test flag value", new zzhl(this, atomicReference));
    }

    public final Double zzj() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.zzs.zzaz().zzd(atomicReference, 15000L, "double test flag value", new zzhs(this, atomicReference));
    }

    public final Integer zzl() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.zzs.zzaz().zzd(atomicReference, 15000L, "int test flag value", new zzhr(this, atomicReference));
    }

    public final Long zzm() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.zzs.zzaz().zzd(atomicReference, 15000L, "long test flag value", new zzhq(this, atomicReference));
    }

    public final String zzo() {
        return this.zzg.get();
    }

    public final String zzp() {
        zzih zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zzb;
        }
        return null;
    }

    public final String zzq() {
        zzih zzi = this.zzs.zzs().zzi();
        if (zzi != null) {
            return zzi.zza;
        }
        return null;
    }

    public final String zzr() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.zzs.zzaz().zzd(atomicReference, 15000L, "String test flag value", new zzhp(this, atomicReference));
    }

    public final ArrayList<Bundle> zzs(String str, String str2) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get conditional user properties", new zzhm(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
        return zzkz.zzG(list);
    }

    public final List<zzkv> zzt(boolean z) {
        zza();
        a.G(this.zzs, "Getting user properties (FE)");
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from analytics worker thread");
            return Collections.emptyList();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get all user properties from main thread");
            return Collections.emptyList();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhh(this, atomicReference, z));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        return list;
    }

    public final Map<String, Object> zzu(String str, String str2, boolean z) {
        if (this.zzs.zzaz().zzs()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.zzs.zzaw();
        if (zzaa.zza()) {
            this.zzs.zzay().zzd().zza("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.zzs.zzaz().zzd(atomicReference, 5000L, "get user properties", new zzhn(this, atomicReference, null, str, str2, z));
        List<zzkv> list = (List) atomicReference.get();
        if (list == null) {
            this.zzs.zzay().zzd().zzb("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        c.f.a aVar = new c.f.a(list.size());
        for (zzkv zzkvVar : list) {
            Object zza = zzkvVar.zza();
            if (zza != null) {
                aVar.put(zzkvVar.zzb, zza);
            }
        }
        return aVar;
    }

    public final void zzy() {
        zzg();
        zza();
        if (this.zzs.zzM()) {
            if (this.zzs.zzf().zzs(null, zzdy.zzZ)) {
                zzaf zzf = this.zzs.zzf();
                zzf.zzs.zzaw();
                Boolean zzk = zzf.zzk("google_analytics_deferred_deep_link_enabled");
                if (zzk != null && zzk.booleanValue()) {
                    this.zzs.zzay().zzc().zza("Deferred Deep Link feature enabled.");
                    this.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgz
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzia zziaVar = zzia.this;
                            zziaVar.zzg();
                            if (zziaVar.zzs.zzm().zzm.zzb()) {
                                zziaVar.zzs.zzay().zzc().zza("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long zza = zziaVar.zzs.zzm().zzn.zza();
                            zziaVar.zzs.zzm().zzn.zzb(1 + zza);
                            zziaVar.zzs.zzf();
                            if (zza < 5) {
                                zziaVar.zzs.zzE();
                                return;
                            }
                            a.H(zziaVar.zzs, "Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            zziaVar.zzs.zzm().zzm.zza(true);
                        }
                    });
                }
            }
            this.zzs.zzt().zzq();
            this.zzc = false;
            zzfa zzm = this.zzs.zzm();
            zzm.zzg();
            String string = zzm.zza().getString("previous_os_version", null);
            zzm.zzs.zzg().zzu();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = zzm.zza().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.zzs.zzg().zzu();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            zzG("auto", "_ou", bundle);
        }
    }

    public final void zzz(String str, String str2, Bundle bundle) {
        long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
        Preconditions.checkNotEmpty(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, currentTimeMillis);
        if (str2 != null) {
            bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str2);
            bundle2.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle);
        }
        this.zzs.zzaz().zzp(new zzhk(this, bundle2));
    }
}
