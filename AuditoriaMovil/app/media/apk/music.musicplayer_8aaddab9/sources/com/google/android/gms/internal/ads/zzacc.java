package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class zzacc extends zzacz {
    private static final zzada<zzzp> zzi = new zzada<>();
    private final Context zzj;

    public zzacc(zzabr zzabrVar, String str, String str2, zzyj zzyjVar, int i2, int i3, Context context, zzyc zzycVar) {
        super(zzabrVar, "NK1iwlHEHCICBCLEvTy0TnuhgEeSXovnPs9zKPvVW8trSfaaB+/inefY+5AxSSUI", "/qulcnd5BAOc2NixUFmrPgx+DAD1V/hpoK4nowHOBbg=", zzyjVar, i2, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzo() != null) {
                this.zzb.zzo().get();
            }
            zzyz zzn = this.zzb.zzn();
            if (zzn == null || !zzn.zza()) {
                return null;
            }
            return zzn.zzc();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacz
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i2;
        zzzp zzzpVar;
        AtomicReference<zzzp> zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzzp zzzpVar2 = zza.get();
            if (zzzpVar2 == null || zzabu.zze(zzzpVar2.zza) || zzzpVar2.zza.equals("E") || zzzpVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (zzabu.zze(null)) {
                    i2 = ((!zzabu.zze(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue() && this.zzb.zzk()) ? 4 : 3;
                } else {
                    i2 = 5;
                }
                Boolean valueOf = Boolean.valueOf(i2 == 3);
                Boolean bool = (Boolean) zzbet.zzc().zzc(zzbjl.zzbB);
                String zzb = ((Boolean) zzbet.zzc().zzc(zzbjl.zzbA)).booleanValue() ? zzb() : null;
                if (bool.booleanValue() && this.zzb.zzk() && zzabu.zze(zzb)) {
                    zzb = zzc();
                }
                zzzp zzzpVar3 = new zzzp((String) this.zzf.invoke(null, this.zzj, valueOf, zzb));
                if (zzabu.zze(zzzpVar3.zza) || zzzpVar3.zza.equals("E")) {
                    int i3 = i2 - 1;
                    if (i3 == 3) {
                        String zzc = zzc();
                        if (!zzabu.zze(zzc)) {
                            zzzpVar3.zza = zzc;
                        }
                    } else if (i3 == 4) {
                        throw null;
                    }
                }
                zza.set(zzzpVar3);
            }
            zzzpVar = zza.get();
        }
        synchronized (this.zze) {
            if (zzzpVar != null) {
                this.zze.zzo(zzzpVar.zza);
                this.zze.zzu(zzzpVar.zzb);
                this.zze.zzt(zzzpVar.zzc);
                this.zze.zzD(zzzpVar.zzd);
                this.zze.zzE(zzzpVar.zze);
            }
        }
    }

    public final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzc = zzabu.zzc((String) zzbet.zzc().zzc(zzbjl.zzbC));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzc)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzabu.zzc((String) zzbet.zzc().zzc(zzbjl.zzbD)))));
            }
            Context context = this.zzj;
            return zzadc.zza(context, context.getPackageName(), arrayList, this.zzb.zze());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
