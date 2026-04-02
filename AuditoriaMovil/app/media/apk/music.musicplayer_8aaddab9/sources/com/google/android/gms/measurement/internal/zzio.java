package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class zzio extends zzf {
    @VisibleForTesting
    public zzih zza;
    private volatile zzih zzb;
    private volatile zzih zzc;
    private final Map<Activity, zzih> zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zzih zzg;
    private zzih zzh;
    private boolean zzi;
    private final Object zzj;
    private zzih zzk;
    private String zzl;

    public zzio(zzfv zzfvVar) {
        super(zzfvVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(Activity activity, zzih zzihVar, boolean z) {
        zzih zzihVar2;
        zzih zzihVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zzihVar.zzb == null) {
            zzihVar2 = new zzih(zzihVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zzihVar.zzc, zzihVar.zze, zzihVar.zzf);
        } else {
            zzihVar2 = zzihVar;
        }
        this.zzc = this.zzb;
        this.zzb = zzihVar2;
        this.zzs.zzaz().zzp(new zzij(this, zzihVar2, zzihVar3, this.zzs.zzav().elapsedRealtime(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zzih zzihVar, zzih zzihVar2, long j2, boolean z, Bundle bundle) {
        long j3;
        long j4;
        zzg();
        boolean z2 = false;
        boolean z3 = (zzihVar2 != null && zzihVar2.zzc == zzihVar.zzc && zzkz.zzak(zzihVar2.zzb, zzihVar.zzb) && zzkz.zzak(zzihVar2.zza, zzihVar.zza)) ? false : true;
        if (z && this.zza != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzkz.zzJ(zzihVar, bundle2, true);
            if (zzihVar2 != null) {
                String str = zzihVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zzihVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zzihVar2.zzc);
            }
            if (z2) {
                zzkb zzkbVar = this.zzs.zzu().zzb;
                long j5 = j2 - zzkbVar.zzb;
                zzkbVar.zzb = j2;
                if (j5 > 0) {
                    this.zzs.zzv().zzH(bundle2, j5);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zzihVar.zze ? "auto" : "app";
            long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zzihVar.zze) {
                j3 = currentTimeMillis;
                long j6 = zzihVar.zzf;
                if (j6 != 0) {
                    j4 = j6;
                    this.zzs.zzq().zzH(str3, "_vs", j4, bundle2);
                }
            } else {
                j3 = currentTimeMillis;
            }
            j4 = j3;
            this.zzs.zzq().zzH(str3, "_vs", j4, bundle2);
        }
        if (z2) {
            zzC(this.zza, true, j2);
        }
        this.zza = zzihVar;
        if (zzihVar.zze) {
            this.zzh = zzihVar;
        }
        this.zzs.zzt().zzG(zzihVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zzih zzihVar, boolean z, long j2) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zzihVar != null && zzihVar.zzd, z, j2) || zzihVar == null) {
            return;
        }
        zzihVar.zzd = false;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzio zzioVar, Bundle bundle, zzih zzihVar, zzih zzihVar2, long j2) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzioVar.zzB(zzihVar, zzihVar2, j2, true, zzioVar.zzs.zzv().zzy(null, "screen_view", bundle, null, false));
    }

    private final zzih zzz(Activity activity) {
        Preconditions.checkNotNull(activity);
        zzih zzihVar = this.zzd.get(activity);
        if (zzihVar == null) {
            zzih zzihVar2 = new zzih(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zzihVar2);
            zzihVar = zzihVar2;
        }
        return this.zzg != null ? this.zzg : zzihVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final zzih zzi() {
        return this.zzb;
    }

    public final zzih zzj(boolean z) {
        zza();
        zzg();
        if (z) {
            zzih zzihVar = this.zza;
            return zzihVar != null ? zzihVar : this.zzh;
        }
        return this.zza;
    }

    @VisibleForTesting
    public final String zzl(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 > 100) {
            this.zzs.zzf();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zzih(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong(FacebookAdapter.KEY_ID)));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            if (activity == this.zze) {
                this.zze = null;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzil(this, elapsedRealtime));
            return;
        }
        zzih zzz = zzz(activity);
        this.zzc = this.zzb;
        this.zzb = null;
        this.zzs.zzaz().zzp(new zzim(this, zzz, elapsedRealtime));
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaz().zzp(new zzin(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzik(this));
            return;
        }
        zzA(activity, zzz(activity), false);
        zzd zzd = this.zzs.zzd();
        zzd.zzs.zzaz().zzp(new zzc(zzd, zzd.zzs.zzav().elapsedRealtime()));
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zzih zzihVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zzihVar = this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong(FacebookAdapter.KEY_ID, zzihVar.zzc);
        bundle2.putString("name", zzihVar.zza);
        bundle2.putString("referrer_name", zzihVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzw(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.zzfv r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzaf r0 = r0.zzf()
            boolean r0 = r0.zzu()
            if (r0 != 0) goto L1c
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.zza(r5)
            return
        L1c:
            com.google.android.gms.measurement.internal.zzih r0 = r3.zzb
            if (r0 != 0) goto L30
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.zza(r5)
            return
        L30:
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.zzih> r1 = r3.zzd
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.zza(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.zzl(r6, r1)
        L54:
            java.lang.String r1 = r0.zzb
            boolean r1 = com.google.android.gms.measurement.internal.zzkz.zzak(r1, r6)
            java.lang.String r0 = r0.zza
            boolean r0 = com.google.android.gms.measurement.internal.zzkz.zzak(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.zza(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.google.android.gms.measurement.internal.zzfv r1 = r3.zzs
            r1.zzf()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.google.android.gms.measurement.internal.zzfv r1 = r3.zzs
            r1.zzf()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.google.android.gms.measurement.internal.zzfv r4 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r4 = r4.zzay()
            com.google.android.gms.measurement.internal.zzej r4 = r4.zzl()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.zzb(r6, r5)
            return
        Lcf:
            com.google.android.gms.measurement.internal.zzfv r0 = r3.zzs
            com.google.android.gms.measurement.internal.zzel r0 = r0.zzay()
            com.google.android.gms.measurement.internal.zzej r0 = r0.zzj()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.zzc(r2, r1, r6)
            com.google.android.gms.measurement.internal.zzih r0 = new com.google.android.gms.measurement.internal.zzih
            com.google.android.gms.measurement.internal.zzfv r1 = r3.zzs
            com.google.android.gms.measurement.internal.zzkz r1 = r1.zzv()
            long r1 = r1.zzq()
            r0.<init>(r5, r6, r1)
            java.util.Map<android.app.Activity, com.google.android.gms.measurement.internal.zzih> r5 = r3.zzd
            r5.put(r4, r0)
            r5 = 1
            r3.zzA(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zzw(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzx(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzio.zzx(android.os.Bundle, long):void");
    }

    public final void zzy(String str, zzih zzihVar) {
        zzg();
        synchronized (this) {
            String str2 = this.zzl;
            if (str2 == null || str2.equals(str) || zzihVar != null) {
                this.zzl = str;
                this.zzk = zzihVar;
            }
        }
    }
}
