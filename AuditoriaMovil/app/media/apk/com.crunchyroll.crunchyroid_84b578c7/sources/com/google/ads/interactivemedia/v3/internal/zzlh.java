package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import com.amazon.aps.iva.b6.y0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzlh extends zzmh {
    private static final zzmi zzi = new zzmi();
    private final Context zzj;

    public zzlh(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i, int i2, Context context, zzy zzyVar) {
        super(zzktVar, "V4y6sZwh4RdVNxpWxdt5cB3zHM/o72UxaS3FR8ryJ97Kzv92GLUKmmmoeiIEn2h0", "jF9g1ur6WV7u99T9DTRuiTzvsmxG0ZkqXVny5oCesvg=", zzafVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzbc zzc = this.zzb.zzc();
            if (zzc != null && zzc.zzaj()) {
                return zzc.zzg();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i;
        boolean z;
        String str;
        zzib zzibVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzib zzibVar2 = (zzib) zza.get();
            if (zzibVar2 == null || zzkw.zzd(zzibVar2.zza) || zzibVar2.zza.equals("E") || zzibVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzkw.zzd(null)) {
                    i = 5;
                } else {
                    if (!zzkw.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i = 3;
                }
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool2 = (Boolean) zznc.zzc().zzb(zznr.zzcd);
                if (((Boolean) zznc.zzc().zzb(zznr.zzcc)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.zzb.zzp() && zzkw.zzd(str)) {
                    str = zzc();
                }
                zzib zzibVar3 = new zzib((String) this.zzf.invoke(null, this.zzj, valueOf, str));
                if (zzkw.zzd(zzibVar3.zza) || zzibVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 != 3) {
                        if (i2 == 4) {
                            throw null;
                        }
                    } else {
                        String zzc = zzc();
                        if (!zzkw.zzd(zzc)) {
                            zzibVar3.zza = zzc;
                        }
                    }
                }
                zza.set(zzibVar3);
            }
            zzibVar = (zzib) zza.get();
        }
        synchronized (this.zze) {
            if (zzibVar != null) {
                this.zze.zzx(zzibVar.zza);
                this.zze.zzX(zzibVar.zzb);
                this.zze.zzZ(zzibVar.zzc);
                this.zze.zzi(zzibVar.zzd);
                this.zze.zzw(zzibVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.ads.interactivemedia.v3.internal.zzmj] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzkw.zzf((String) zznc.zzc().zzb(zznr.zzce));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzkw.zzf((String) zznc.zzc().zzb(zznr.zzcf)))));
            }
            context = this.zzj;
            packageName = context.getPackageName();
            this.zzb.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzvx zzp = zzvx.zzp();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.ads.interactivemedia.v3.internal.zzmj
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzvx zzvxVar = zzvx.this;
                    if (list == null) {
                        zzvxVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum a = y0.a(list.get(i));
                            type = a.getType();
                            if (type == 8) {
                                value = a.getValue();
                                zzvxVar.zzc(zzkw.zzb(value));
                                return;
                            }
                        }
                        zzvxVar.zzc(null);
                    } catch (Throwable unused2) {
                        zzvxVar.zzc(null);
                    }
                }
            });
            return (String) zzp.get();
        }
        return null;
    }
}
