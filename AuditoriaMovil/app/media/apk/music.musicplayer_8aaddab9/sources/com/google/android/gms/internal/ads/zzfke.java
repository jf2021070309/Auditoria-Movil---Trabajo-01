package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class zzfke {
    private static final Object zzf = new Object();
    private final Context zza;
    private final SharedPreferences zzb;
    private final String zzc;
    private final zzfjl zzd;
    private boolean zze;

    public zzfke(Context context, int i2, zzfjl zzfjlVar, boolean z) {
        this.zze = false;
        this.zza = context;
        this.zzc = Integer.toString(i2 - 1);
        this.zzb = context.getSharedPreferences("pcvmspf", 0);
        this.zzd = zzfjlVar;
        this.zze = z;
    }

    private final File zze(String str) {
        return new File(new File(this.zza.getDir("pccache", 0), this.zzc), str);
    }

    private final String zzf() {
        String valueOf = String.valueOf(this.zzc);
        return valueOf.length() != 0 ? "FBAMTD".concat(valueOf) : new String("FBAMTD");
    }

    private final String zzg() {
        String valueOf = String.valueOf(this.zzc);
        return valueOf.length() != 0 ? "LATMTD".concat(valueOf) : new String("LATMTD");
    }

    private static String zzh(zzadf zzadfVar) {
        zzadh zzi = zzadi.zzi();
        zzi.zza(zzadfVar.zza().zza());
        zzi.zzb(zzadfVar.zza().zzc());
        zzi.zzd(zzadfVar.zza().zze());
        zzi.zze(zzadfVar.zza().zzf());
        zzi.zzc(zzadfVar.zza().zzd());
        return Hex.bytesToStringLowercase(zzi.zzah().zzan().zzz());
    }

    private final void zzi(int i2, long j2) {
        zzfjl zzfjlVar = this.zzd;
        if (zzfjlVar != null) {
            zzfjlVar.zza(i2, j2);
        }
    }

    private final void zzj(int i2, long j2, String str) {
        zzfjl zzfjlVar = this.zzd;
        if (zzfjlVar != null) {
            zzfjlVar.zzb(i2, j2, str);
        }
    }

    private final zzadi zzk(int i2) {
        String string = i2 == 1 ? this.zzb.getString(zzg(), null) : this.zzb.getString(zzf(), null);
        if (string == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return zzadi.zzh(zzgex.zzt(Hex.stringToBytes(string)), this.zze ? zzgfm.zza() : zzgfm.zzb());
        } catch (zzggm unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, currentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, currentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzadf zzadfVar, zzfkd zzfkdVar) {
        File[] listFiles;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzk = zzk(1);
            String zza = zzadfVar.zza().zza();
            if (zzk != null && zzk.zza().equals(zza)) {
                zzi(4014, currentTimeMillis);
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            File zze = zze(zza);
            if (zze.exists()) {
                String str = true != zze.isDirectory() ? "0" : "1";
                String str2 = true != zze.isFile() ? "0" : "1";
                StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length());
                sb.append("d:");
                sb.append(str);
                sb.append(",f:");
                sb.append(str2);
                zzj(4023, currentTimeMillis2, sb.toString());
                zzi(4015, currentTimeMillis2);
            } else if (!zze.mkdirs()) {
                String str3 = true != zze.canWrite() ? "0" : "1";
                zzj(4024, currentTimeMillis2, str3.length() != 0 ? "cw:".concat(str3) : new String("cw:"));
                zzi(4015, currentTimeMillis2);
                return false;
            }
            File zze2 = zze(zza);
            File file = new File(zze2, "pcam.jar");
            File file2 = new File(zze2, "pcbc");
            if (!zzfjy.zzb(file, zzadfVar.zzc().zzz())) {
                zzi(4016, currentTimeMillis);
                return false;
            } else if (!zzfjy.zzb(file2, zzadfVar.zzd().zzz())) {
                zzi(4017, currentTimeMillis);
                return false;
            } else if (zzfkdVar != null && !zzfkdVar.zza(file)) {
                zzi(4018, currentTimeMillis);
                zzfjy.zze(zze2);
                return false;
            } else {
                String zzh = zzh(zzadfVar);
                long currentTimeMillis3 = System.currentTimeMillis();
                String string = this.zzb.getString(zzg(), null);
                SharedPreferences.Editor edit = this.zzb.edit();
                edit.putString(zzg(), zzh);
                if (string != null) {
                    edit.putString(zzf(), string);
                }
                if (!edit.commit()) {
                    zzi(4019, currentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzadi zzk2 = zzk(1);
                if (zzk2 != null) {
                    hashSet.add(zzk2.zza());
                }
                zzadi zzk3 = zzk(2);
                if (zzk3 != null) {
                    hashSet.add(zzk3.zza());
                }
                for (File file3 : new File(this.zza.getDir("pccache", 0), this.zzc).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfjy.zze(file3);
                    }
                }
                zzi(5014, currentTimeMillis);
                return true;
            }
        }
    }

    public final boolean zzb(zzadf zzadfVar) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            if (!zzfjy.zzb(new File(zze(zzadfVar.zza().zza()), "pcbc"), zzadfVar.zzd().zzz())) {
                zzi(4020, currentTimeMillis);
                return false;
            }
            String zzh = zzh(zzadfVar);
            SharedPreferences.Editor edit = this.zzb.edit();
            edit.putString(zzg(), zzh);
            boolean commit = edit.commit();
            if (commit) {
                zzi(5015, currentTimeMillis);
            } else {
                zzi(4021, currentTimeMillis);
            }
            return commit;
        }
    }

    public final zzfjw zzc(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzk = zzk(1);
            if (zzk == null) {
                zzi(4022, currentTimeMillis);
                return null;
            }
            File zze = zze(zzk.zza());
            File file = new File(zze, "pcam.jar");
            if (!file.exists()) {
                file = new File(zze, "pcam");
            }
            File file2 = new File(zze, "pcbc");
            File file3 = new File(zze, "pcopt");
            zzi(5016, currentTimeMillis);
            return new zzfjw(zzk, file, file2, file3);
        }
    }

    public final boolean zzd(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (zzf) {
            zzadi zzk = zzk(1);
            if (zzk == null) {
                zzi(4025, currentTimeMillis);
                return false;
            }
            File zze = zze(zzk.zza());
            if (!new File(zze, "pcam.jar").exists()) {
                zzi(4026, currentTimeMillis);
                return false;
            } else if (new File(zze, "pcbc").exists()) {
                zzi(5019, currentTimeMillis);
                return true;
            } else {
                zzi(4027, currentTimeMillis);
                return false;
            }
        }
    }
}
