package com.google.android.gms.internal.pal;

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
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzei extends zzfg {
    private static final zzfh zzi = new zzfh();
    private final Context zzj;
    private final zzi zzk;

    public zzei(zzdu zzduVar, String str, String str2, zzr zzrVar, int i, int i2, Context context, zzi zziVar) {
        super(zzduVar, "hhtrMjcGMTQSGdrv1+l2gakNTe0Pfchc8VT5kRHtsehlafuJ8JEE4iewNV4y5I/U", "o5W1eROpLyVNcsDGW3Y0lGc2x/V+mDPvMXouv3gbW6M=", zzrVar, i, 27);
        this.zzj = context;
        this.zzk = zziVar;
    }

    public static String zzc(zzi zziVar) {
        if (zziVar != null && zziVar.zzg() && !zzdx.zzg(zziVar.zze().zzd())) {
            return zziVar.zze().zzd();
        }
        return null;
    }

    private final String zzd() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzaf zzc = this.zzb.zzc();
            if (zzc != null && zzc.zzah()) {
                return zzc.zzf();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.pal.zzfg
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        boolean z;
        Boolean valueOf;
        int i;
        boolean z2;
        String str;
        zzbk zzbkVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzbk zzbkVar2 = (zzbk) zza.get();
            if (zzbkVar2 == null || zzdx.zzg(zzbkVar2.zza) || zzbkVar2.zza.equals("E") || zzbkVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzdx.zzg(zzc(this.zzk))) {
                    i = 5;
                } else {
                    zzi zziVar = this.zzk;
                    if (!zzdx.zzg(zzc(zziVar))) {
                        valueOf = Boolean.FALSE;
                    } else {
                        if (zziVar != null && zziVar.zzf() && zziVar.zzd().zzd() == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        valueOf = Boolean.valueOf(z);
                    }
                    if (valueOf.booleanValue() && this.zzb.zzp()) {
                        i = 4;
                    } else {
                        i = 3;
                    }
                }
                if (i == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Boolean valueOf2 = Boolean.valueOf(z2);
                Boolean bool = (Boolean) zzfv.zzc().zzb(zzgk.zzbY);
                if (((Boolean) zzfv.zzc().zzb(zzgk.zzbX)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool.booleanValue() && this.zzb.zzp() && zzdx.zzg(str)) {
                    str = zzd();
                }
                zzbk zzbkVar3 = new zzbk((String) this.zzf.invoke(null, this.zzj, valueOf2, str));
                if (zzdx.zzg(zzbkVar3.zza) || zzbkVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 != 3) {
                        if (i2 == 4) {
                            zzbkVar3.zza = this.zzk.zze().zzd();
                        }
                    } else {
                        String zzd = zzd();
                        if (!zzdx.zzg(zzd)) {
                            zzbkVar3.zza = zzd;
                        }
                    }
                }
                zza.set(zzbkVar3);
            }
            zzbkVar = (zzbk) zza.get();
        }
        synchronized (this.zze) {
            if (zzbkVar != null) {
                this.zze.zzx(zzbkVar.zza);
                this.zze.zzY(zzbkVar.zzb);
                this.zze.zzaa(zzbkVar.zzc);
                this.zze.zzi(zzbkVar.zzd);
                this.zze.zzw(zzbkVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.pal.zzfi] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzi2 = zzdx.zzi((String) zzfv.zzc().zzb(zzgk.zzbZ));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzdx.zzi((String) zzfv.zzc().zzb(zzgk.zzca)))));
            }
            context = this.zzj;
            packageName = context.getPackageName();
            this.zzb.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzjr zzj = zzjr.zzj();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.pal.zzfi
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzjr zzjrVar = zzjr.this;
                    if (list == null) {
                        zzjrVar.zzi(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum a = y0.a(list.get(i));
                            type = a.getType();
                            if (type == 8) {
                                value = a.getValue();
                                zzjrVar.zzi(zzdx.zzc(value));
                                return;
                            }
                        }
                        zzjrVar.zzi(null);
                    } catch (Throwable unused2) {
                        zzjrVar.zzi(null);
                    }
                }
            });
            return (String) zzj.get();
        }
        return null;
    }
}
