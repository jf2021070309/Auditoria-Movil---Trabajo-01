package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class zzazb {
    private final zzazf zza;
    @GuardedBy("this")
    private final zzbao zzb;
    private final boolean zzc;

    private zzazb() {
        this.zzb = zzbap.zze();
        this.zzc = false;
        this.zza = new zzazf();
    }

    public zzazb(zzazf zzazfVar) {
        this.zzb = zzbap.zze();
        this.zza = zzazfVar;
        this.zzc = ((Boolean) zzbet.zzc().zzc(zzbjl.zzdo)).booleanValue();
    }

    public static zzazb zza() {
        return new zzazb();
    }

    private final synchronized void zzd(int i2) {
        zzbao zzbaoVar = this.zzb;
        zzbaoVar.zzd();
        List<String> zzd = zzbjl.zzd();
        ArrayList arrayList = new ArrayList();
        for (String str : zzd) {
            for (String str2 : str.split(",")) {
                try {
                    arrayList.add(Long.valueOf(str2));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Experiment ID is not a number");
                }
            }
        }
        zzbaoVar.zzc(arrayList);
        zzazd zzazdVar = new zzazd(this.zza, this.zzb.zzah().zzao(), null);
        int i3 = i2 - 1;
        zzazdVar.zzb(i3);
        zzazdVar.zza();
        String valueOf = String.valueOf(Integer.toString(i3, 10));
        com.google.android.gms.ads.internal.util.zze.zza(valueOf.length() != 0 ? "Logging Event with event code : ".concat(valueOf) : new String("Logging Event with event code : "));
    }

    private final synchronized void zze(int i2) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(zzf(i2).getBytes());
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                } catch (IOException unused2) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i2) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.zzb.zza(), Long.valueOf(com.google.android.gms.ads.internal.zzt.zzj().elapsedRealtime()), Integer.valueOf(i2 - 1), Base64.encodeToString(this.zzb.zzah().zzao(), 3));
    }

    public final synchronized void zzb(zzaza zzazaVar) {
        if (this.zzc) {
            try {
                zzazaVar.zza(this.zzb);
            } catch (NullPointerException e2) {
                com.google.android.gms.ads.internal.zzt.zzg().zzk(e2, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i2) {
        if (this.zzc) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzdp)).booleanValue()) {
                zze(i2);
            } else {
                zzd(i2);
            }
        }
    }
}
