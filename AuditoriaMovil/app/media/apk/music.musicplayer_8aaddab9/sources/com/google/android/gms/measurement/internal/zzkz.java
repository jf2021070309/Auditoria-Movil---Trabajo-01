package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import ch.qos.logback.classic.pattern.ThrowableProxyConverter;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzom;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e.a.d.a.a;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class zzkz extends zzgp {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"firebase_", "google_", "ga_"};
    private static final String[] zzc = {"_err"};
    private SecureRandom zzd;
    private final AtomicLong zze;
    private int zzf;
    private Integer zzg;

    public zzkz(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzg = null;
        this.zze = new AtomicLong(0L);
    }

    public static MessageDigest zzE() {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList<Bundle> zzG(List<zzab> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (zzab zzabVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzabVar.zza);
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzabVar.zzb);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, zzabVar.zzd);
            bundle.putString("name", zzabVar.zzc.zzb);
            zzgr.zzb(bundle, Preconditions.checkNotNull(zzabVar.zzc.zza()));
            bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, zzabVar.zze);
            String str = zzabVar.zzf;
            if (str != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str);
            }
            zzat zzatVar = zzabVar.zzg;
            if (zzatVar != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, zzatVar.zza);
                zzar zzarVar = zzatVar.zzb;
                if (zzarVar != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, zzarVar.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, zzabVar.zzh);
            zzat zzatVar2 = zzabVar.zzi;
            if (zzatVar2 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, zzatVar2.zza);
                zzar zzarVar2 = zzatVar2.zzb;
                if (zzarVar2 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, zzarVar2.zzc());
                }
            }
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, zzabVar.zzc.zzc);
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, zzabVar.zzj);
            zzat zzatVar3 = zzabVar.zzk;
            if (zzatVar3 != null) {
                bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, zzatVar3.zza);
                zzar zzarVar3 = zzatVar3.zzb;
                if (zzarVar3 != null) {
                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, zzarVar3.zzc());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static void zzJ(zzih zzihVar, Bundle bundle, boolean z) {
        if (bundle != null && zzihVar != null) {
            if (!bundle.containsKey("_sc") || z) {
                String str = zzihVar.zza;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = zzihVar.zzb;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", zzihVar.zzc);
                return;
            }
            z = false;
        }
        if (bundle != null && zzihVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean zzag(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean zzah(String str) {
        Preconditions.checkNotEmpty(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean zzai(Context context) {
        ActivityInfo receiverInfo;
        Preconditions.checkNotNull(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean zzaj(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        return Build.VERSION.SDK_INT >= 24 ? zzat(context, "com.google.android.gms.measurement.AppMeasurementJobService") : zzat(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean zzak(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public static boolean zzal(String str) {
        return !zzc[0].equals(str);
    }

    public static final boolean zzao(Bundle bundle, int i2) {
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i2);
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public static final boolean zzap(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    private final int zzaq(String str) {
        if ("_ldl".equals(str)) {
            this.zzs.zzf();
            return ThrowableProxyConverter.BUILDER_CAPACITY;
        } else if ("_id".equals(str)) {
            this.zzs.zzf();
            return 256;
        } else if (this.zzs.zzf().zzs(null, zzdy.zzab) && "_lgclid".equals(str)) {
            this.zzs.zzf();
            return 100;
        } else {
            this.zzs.zzf();
            return 36;
        }
    }

    private final Object zzar(int i2, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return zzC(obj.toString(), i2, z);
            }
            if (z2 && ((obj instanceof Bundle[]) || (obj instanceof Parcelable[]))) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : (Parcelable[]) obj) {
                    if (parcelable instanceof Bundle) {
                        Bundle zzt = zzt((Bundle) parcelable);
                        if (!zzt.isEmpty()) {
                            arrayList.add(zzt);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
            return null;
        }
    }

    private static boolean zzas(String str, String[] strArr) {
        Preconditions.checkNotNull(strArr);
        for (String str2 : strArr) {
            if (zzak(str, str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzat(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    @VisibleForTesting
    public static long zzp(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        int length = bArr.length;
        int i2 = 0;
        Preconditions.checkState(length > 0);
        long j2 = 0;
        for (int i3 = length - 1; i3 >= 0 && i3 >= bArr.length - 8; i3--) {
            j2 += (bArr[i3] & 255) << i2;
            i2 += 8;
        }
        return j2;
    }

    public final Object zzA(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            this.zzs.zzf();
            return zzar(256, obj, true, true);
        }
        if (zzag(str)) {
            this.zzs.zzf();
        } else {
            this.zzs.zzf();
            i2 = 100;
        }
        return zzar(i2, obj, false, true);
    }

    public final Object zzB(String str, Object obj) {
        return "_ldl".equals(str) ? zzar(zzaq(str), obj, true, false) : zzar(zzaq(str), obj, false, false);
    }

    public final String zzC(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) > i2) {
            if (z) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
            }
            return null;
        }
        return str;
    }

    public final URL zzD(long j2, String str, String str2, long j3) {
        try {
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 46000L, Integer.valueOf(zzm())), str2, str, Long.valueOf(j3));
            if (str.equals(this.zzs.zzf().zzm())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e2) {
            this.zzs.zzay().zzd().zzb("Failed to create BOW URL for Deferred Deep Link. exception", e2.getMessage());
            return null;
        }
    }

    @EnsuresNonNull({"this.secureRandom"})
    public final SecureRandom zzF() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new SecureRandom();
        }
        return this.zzd;
    }

    public final void zzH(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            this.zzs.zzay().zzk().zzb("Params already contained engagement", Long.valueOf(j3));
        } else {
            j3 = 0;
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void zzI(Bundle bundle, int i2, String str, String str2, Object obj) {
        if (zzao(bundle, i2)) {
            this.zzs.zzf();
            bundle.putString("_ev", zzC(str, 40, true));
            if (obj != null) {
                Preconditions.checkNotNull(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final void zzK(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.zzs.zzv().zzN(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void zzL(zzem zzemVar, int i2) {
        Iterator it = new TreeSet(zzemVar.zzd.keySet()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (zzah(str) && (i3 = i3 + 1) > i2) {
                StringBuilder sb = new StringBuilder(48);
                sb.append("Event can't contain more than ");
                sb.append(i2);
                sb.append(" params");
                this.zzs.zzay().zze().zzc(sb.toString(), this.zzs.zzj().zzd(zzemVar.zza), this.zzs.zzj().zzb(zzemVar.zzd));
                zzao(zzemVar.zzd, 5);
                zzemVar.zzd.remove(str);
            }
        }
    }

    public final void zzM(zzky zzkyVar, String str, int i2, String str2, String str3, int i3) {
        Bundle bundle = new Bundle();
        zzao(bundle, i2);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", i3);
        }
        zzkyVar.zza(str, "_err", bundle);
    }

    public final void zzN(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            this.zzs.zzay().zzl().zzc("Not putting event parameter. Invalid value type. name, type", this.zzs.zzj().zze(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void zzO(com.google.android.gms.internal.measurement.zzcf zzcfVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning boolean value to wrapper", e2);
        }
    }

    public final void zzP(com.google.android.gms.internal.measurement.zzcf zzcfVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning bundle list to wrapper", e2);
        }
    }

    public final void zzQ(com.google.android.gms.internal.measurement.zzcf zzcfVar, Bundle bundle) {
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning bundle value to wrapper", e2);
        }
    }

    public final void zzR(com.google.android.gms.internal.measurement.zzcf zzcfVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning byte array to wrapper", e2);
        }
    }

    public final void zzS(com.google.android.gms.internal.measurement.zzcf zzcfVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning int value to wrapper", e2);
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzcf zzcfVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning long value to wrapper", e2);
        }
    }

    public final void zzU(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zzcfVar.zzd(bundle);
        } catch (RemoteException e2) {
            this.zzs.zzay().zzk().zzb("Error returning string value to wrapper", e2);
        }
    }

    public final void zzV(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        String str4;
        int zza2;
        if (bundle == null) {
            return;
        }
        this.zzs.zzf();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i3 = 0;
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (list == null || !list.contains(str5)) {
                int zzj = !z ? zzj(str5) : 0;
                if (zzj == 0) {
                    zzj = zzi(str5);
                }
                i2 = zzj;
            } else {
                i2 = 0;
            }
            if (i2 != 0) {
                zzI(bundle, i2, str5, str5, i2 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (zzae(bundle.get(str5))) {
                    this.zzs.zzay().zzl().zzd("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    str4 = str5;
                    zza2 = 22;
                } else {
                    str4 = str5;
                    zza2 = zza(str, str2, str5, bundle.get(str5), bundle, list, z, false);
                }
                if (zza2 != 0 && !"_ev".equals(str4)) {
                    zzI(bundle, zza2, str4, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (zzah(str4) && !zzas(str4, zzgt.zzd) && (i3 = i3 + 1) > 0) {
                    this.zzs.zzay().zze().zzc("Item cannot contain custom parameters", this.zzs.zzj().zzd(str2), this.zzs.zzj().zzb(bundle));
                    zzao(bundle, 23);
                    bundle.remove(str4);
                }
            }
        }
    }

    public final boolean zzW(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (zzap(str)) {
                return true;
            }
            if (this.zzs.zzL()) {
                this.zzs.zzay().zze().zzb("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzel.zzn(str));
            }
            return false;
        }
        zzom.zzc();
        if (!this.zzs.zzf().zzs(null, zzdy.zzac) || TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.zzs.zzL()) {
                    this.zzs.zzay().zze().zza("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (zzap(str2)) {
                return true;
            } else {
                this.zzs.zzay().zze().zzb("Invalid admob_app_id. Analytics disabled.", zzel.zzn(str2));
                return false;
            }
        }
        return true;
    }

    public final boolean zzX(String str, int i2, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i2) {
            this.zzs.zzay().zze().zzd("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        } else {
            return true;
        }
    }

    public final boolean zzY(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        }
        Preconditions.checkNotNull(str2);
        String[] strArr3 = zzb;
        for (int i2 = 0; i2 < 3; i2++) {
            if (str2.startsWith(strArr3[i2])) {
                this.zzs.zzay().zze().zzc("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !zzas(str2, strArr)) {
            return true;
        }
        if (strArr2 == null || !zzas(str2, strArr2)) {
            this.zzs.zzay().zze().zzc("Name is reserved. Type, name", str, str2);
            return false;
        }
        return true;
    }

    public final boolean zzZ(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i2) {
                this.zzs.zzay().zzl().zzd("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zza(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Object r18, android.os.Bundle r19, java.util.List<java.lang.String> r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zza(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    @Override // com.google.android.gms.measurement.internal.zzgp
    public final void zzaA() {
        zzg();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                a.H(this.zzs, "Utils falling back to Random for random id");
            }
        }
        this.zze.set(nextLong);
    }

    public final boolean zzaa(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt != 95) {
                    this.zzs.zzay().zze().zzc("Name must start with a letter or _ (underscore). Type, name", str, str2);
                    return false;
                }
                codePointAt = 95;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean zzab(String str, String str2) {
        if (str2 == null) {
            this.zzs.zzay().zze().zzb("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            this.zzs.zzay().zze().zzb("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                this.zzs.zzay().zze().zzc("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    this.zzs.zzay().zze().zzc("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean zzac(String str) {
        zzg();
        if (Wrappers.packageManager(this.zzs.zzau()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        this.zzs.zzay().zzc().zzb("Permission not granted", str);
        return false;
    }

    public final boolean zzad(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String zzl = this.zzs.zzf().zzl();
        this.zzs.zzaw();
        return zzl.equals(str);
    }

    public final boolean zzae(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    @VisibleForTesting
    public final boolean zzaf(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            this.zzs.zzay().zzd().zzb("Package name not found", e2);
            return true;
        } catch (CertificateException e3) {
            this.zzs.zzay().zzd().zzb("Error obtaining certificate", e3);
            return true;
        }
    }

    public final boolean zzam(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            Preconditions.checkNotNull(str);
            return !str.equals(str2);
        } else if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        } else if (isEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        } else if (TextUtils.isEmpty(str4)) {
            return false;
        } else {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
    }

    public final byte[] zzan(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public final int zzd(String str, Object obj) {
        return "_ldl".equals(str) ? zzZ("user property referrer", str, zzaq(str), obj) : zzZ("user property", str, zzaq(str), obj) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzgp
    public final boolean zzf() {
        return true;
    }

    public final int zzh(String str) {
        if (zzaa("event", str)) {
            if (zzY("event", zzgs.zza, zzgs.zzb, str)) {
                this.zzs.zzf();
                return !zzX("event", 40, str) ? 2 : 0;
            }
            return 13;
        }
        return 2;
    }

    public final int zzi(String str) {
        if (zzaa("event param", str)) {
            if (zzY("event param", null, null, str)) {
                this.zzs.zzf();
                return !zzX("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzj(String str) {
        if (zzab("event param", str)) {
            if (zzY("event param", null, null, str)) {
                this.zzs.zzf();
                return !zzX("event param", 40, str) ? 3 : 0;
            }
            return 14;
        }
        return 3;
    }

    public final int zzl(String str) {
        if (zzaa("user property", str)) {
            if (zzY("user property", zzgu.zza, null, str)) {
                this.zzs.zzf();
                return !zzX("user property", 24, str) ? 6 : 0;
            }
            return 15;
        }
        return 6;
    }

    @EnsuresNonNull({"this.apkVersion"})
    public final int zzm() {
        if (this.zzg == null) {
            this.zzg = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzs.zzau()) / 1000);
        }
        return this.zzg.intValue();
    }

    public final int zzo(int i2) {
        return GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.zzs.zzau(), GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public final long zzq() {
        long andIncrement;
        long j2;
        if (this.zze.get() != 0) {
            synchronized (this.zze) {
                this.zze.compareAndSet(-1L, 1L);
                andIncrement = this.zze.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.zze) {
            long nextLong = new Random(System.nanoTime() ^ this.zzs.zzav().currentTimeMillis()).nextLong();
            int i2 = this.zzf + 1;
            this.zzf = i2;
            j2 = nextLong + i2;
        }
        return j2;
    }

    public final long zzr(long j2, long j3) {
        return ((j3 * 60000) + j2) / 86400000;
    }

    public final Bundle zzs(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str = uri.getQueryParameter("utm_campaign");
                    str2 = uri.getQueryParameter("utm_source");
                    str3 = uri.getQueryParameter("utm_medium");
                    str4 = uri.getQueryParameter("gclid");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(str)) {
                    bundle.putString("campaign", str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    bundle.putString("source", str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("medium", str3);
                }
                if (!TextUtils.isEmpty(str4)) {
                    bundle.putString("gclid", str4);
                }
                String queryParameter = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("term", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString(AppLovinEventTypes.USER_VIEWED_CONTENT, queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("aclid", queryParameter3);
                }
                String queryParameter4 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("cp1", queryParameter4);
                }
                String queryParameter5 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("anid", queryParameter5);
                }
                return bundle;
            } catch (UnsupportedOperationException e2) {
                this.zzs.zzay().zzk().zzb("Install referrer url isn't a hierarchical URI", e2);
            }
        }
        return null;
    }

    public final Bundle zzt(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object zzA = zzA(str, bundle.get(str));
                if (zzA == null) {
                    this.zzs.zzay().zzl().zzb("Param value can't be null", this.zzs.zzj().zze(str));
                } else {
                    zzN(bundle2, str, zzA);
                }
            }
        }
        return bundle2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle zzy(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, java.util.List<java.lang.String> r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkz.zzy(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean):android.os.Bundle");
    }

    public final zzat zzz(String str, String str2, Bundle bundle, String str3, long j2, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (zzh(str2) != 0) {
            this.zzs.zzay().zzd().zzb("Invalid conditional property event name", this.zzs.zzj().zzf(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle zzy = zzy(str, str2, bundle2, CollectionUtils.listOf("_o"), true);
        if (z) {
            zzy = zzt(zzy);
        }
        Preconditions.checkNotNull(zzy);
        return new zzat(str2, new zzar(zzy), str3, j2);
    }
}
