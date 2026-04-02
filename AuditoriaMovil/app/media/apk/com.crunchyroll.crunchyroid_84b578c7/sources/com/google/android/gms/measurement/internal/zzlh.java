package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.aps.iva.x.a;
import com.google.android.gms.cast.CredentialsData;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzlh implements zzgy {
    private static volatile zzlh zzb;
    private long zzA;
    private final Map zzB;
    private final Map zzC;
    private zzir zzD;
    private String zzE;
    long zza;
    private final zzfu zzc;
    private final zzez zzd;
    private zzak zze;
    private zzfb zzf;
    private zzks zzg;
    private zzaa zzh;
    private final zzlj zzi;
    private zzip zzj;
    private zzkb zzk;
    private final zzkw zzl;
    private zzfl zzm;
    private final zzgd zzn;
    private boolean zzp;
    private List zzq;
    private int zzr;
    private int zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private FileLock zzw;
    private FileChannel zzx;
    private List zzy;
    private List zzz;
    private boolean zzo = false;
    private final zzlo zzF = new zzlc(this);

    public zzlh(zzli zzliVar, zzgd zzgdVar) {
        Preconditions.checkNotNull(zzliVar);
        this.zzn = zzgd.zzp(zzliVar.zza, null, null);
        this.zzA = -1L;
        this.zzl = new zzkw(this);
        zzlj zzljVar = new zzlj(this);
        zzljVar.zzX();
        this.zzi = zzljVar;
        zzez zzezVar = new zzez(this);
        zzezVar.zzX();
        this.zzd = zzezVar;
        zzfu zzfuVar = new zzfu(this);
        zzfuVar.zzX();
        this.zzc = zzfuVar;
        this.zzB = new HashMap();
        this.zzC = new HashMap();
        zzaB().zzp(new zzkx(this, zzliVar));
    }

    public static final void zzaa(com.google.android.gms.internal.measurement.zzfs zzfsVar, int i, String str) {
        List zzp = zzfsVar.zzp();
        for (int i2 = 0; i2 < zzp.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i2)).zzg())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzfw zze = com.google.android.gms.internal.measurement.zzfx.zze();
        zze.zzj("_err");
        zze.zzi(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzfw zze2 = com.google.android.gms.internal.measurement.zzfx.zze();
        zze2.zzj("_ev");
        zze2.zzk(str);
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze.zzaD());
        zzfsVar.zzf((com.google.android.gms.internal.measurement.zzfx) zze2.zzaD());
    }

    public static final void zzab(com.google.android.gms.internal.measurement.zzfs zzfsVar, String str) {
        List zzp = zzfsVar.zzp();
        for (int i = 0; i < zzp.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzfx) zzp.get(i)).zzg())) {
                zzfsVar.zzh(i);
                return;
            }
        }
    }

    private final zzq zzac(String str) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str);
        if (zzj != null && !TextUtils.isEmpty(zzj.zzy())) {
            Boolean zzad = zzad(zzj);
            if (zzad != null && !zzad.booleanValue()) {
                zzaA().zzd().zzb("App version does not match; dropping. appId", zzet.zzn(str));
                return null;
            }
            String zzA = zzj.zzA();
            String zzy = zzj.zzy();
            long zzb2 = zzj.zzb();
            String zzx = zzj.zzx();
            long zzm = zzj.zzm();
            long zzj2 = zzj.zzj();
            boolean zzan = zzj.zzan();
            String zzz = zzj.zzz();
            zzj.zza();
            return new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr());
        }
        zzaA().zzc().zzb("No app data available; dropping", str);
        return null;
    }

    private final Boolean zzad(zzh zzhVar) {
        try {
            if (zzhVar.zzb() != -2147483648L) {
                if (zzhVar.zzb() == Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaw()).getPackageInfo(zzhVar.zzv(), 0).versionName;
                String zzy = zzhVar.zzy();
                if (zzy != null && zzy.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void zzae() {
        zzaB().zzg();
        if (!this.zzt && !this.zzu && !this.zzv) {
            zzaA().zzj().zza("Stopping uploading service(s)");
            List<Runnable> list = this.zzq;
            if (list == null) {
                return;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            ((List) Preconditions.checkNotNull(this.zzq)).clear();
            return;
        }
        zzaA().zzj().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv));
    }

    private final void zzaf(com.google.android.gms.internal.measurement.zzgc zzgcVar, long j, boolean z) {
        String str;
        zzlm zzlmVar;
        String str2;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        zzlm zzp = zzakVar.zzp(zzgcVar.zzaq(), str);
        if (zzp != null && zzp.zze != null) {
            zzlmVar = new zzlm(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(((Long) zzp.zze).longValue() + j));
        } else {
            zzlmVar = new zzlm(zzgcVar.zzaq(), "auto", str, zzax().currentTimeMillis(), Long.valueOf(j));
        }
        com.google.android.gms.internal.measurement.zzgl zzd = com.google.android.gms.internal.measurement.zzgm.zzd();
        zzd.zzf(str);
        zzd.zzg(zzax().currentTimeMillis());
        zzd.zze(((Long) zzlmVar.zze).longValue());
        com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) zzd.zzaD();
        int zza = zzlj.zza(zzgcVar, str);
        if (zza >= 0) {
            zzgcVar.zzan(zza, zzgmVar);
        } else {
            zzgcVar.zzm(zzgmVar);
        }
        if (j > 0) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzL(zzlmVar);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            zzaA().zzj().zzc("Updated engagement user property. scope, value", str2, zzlmVar.zze);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzag() {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzag():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0b33, code lost:
        if (r10 > (com.google.android.gms.measurement.internal.zzag.zzA() + r8)) goto L384;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0447 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0489 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07d7 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0820 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0843 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08c4 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08f0 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b23 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0baa A[Catch: all -> 0x0cc7, TRY_LEAVE, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0bc6 A[Catch: SQLiteException -> 0x0bde, all -> 0x0cc7, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0bde, blocks: (B:360:0x0bb7, B:362:0x0bc6), top: B:398:0x0bb7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383 A[Catch: all -> 0x0cc7, TryCatch #1 {all -> 0x0cc7, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca3, B:383:0x0c90, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cb5), top: B:395:0x000e, inners: #0, #2, #3, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean zzah(java.lang.String r41, long r42) {
        /*
            Method dump skipped, instructions count: 3282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzah(java.lang.String, long):boolean");
    }

    private final boolean zzai() {
        zzaB().zzg();
        zzB();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        if (!zzakVar.zzF()) {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            if (TextUtils.isEmpty(zzakVar2.zzr())) {
                return false;
            }
            return true;
        }
        return true;
    }

    private final boolean zzaj(com.google.android.gms.internal.measurement.zzfs zzfsVar, com.google.android.gms.internal.measurement.zzfs zzfsVar2) {
        String zzh;
        Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_sc");
        String str = null;
        if (zzC == null) {
            zzh = null;
        } else {
            zzh = zzC.zzh();
        }
        zzal(this.zzi);
        com.google.android.gms.internal.measurement.zzfx zzC2 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_pc");
        if (zzC2 != null) {
            str = zzC2.zzh();
        }
        if (str != null && str.equals(zzh)) {
            Preconditions.checkArgument("_e".equals(zzfsVar.zzo()));
            zzal(this.zzi);
            com.google.android.gms.internal.measurement.zzfx zzC3 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD(), "_et");
            if (zzC3 != null && zzC3.zzw() && zzC3.zzd() > 0) {
                long zzd = zzC3.zzd();
                zzal(this.zzi);
                com.google.android.gms.internal.measurement.zzfx zzC4 = zzlj.zzC((com.google.android.gms.internal.measurement.zzft) zzfsVar2.zzaD(), "_et");
                if (zzC4 != null && zzC4.zzd() > 0) {
                    zzd += zzC4.zzd();
                }
                zzal(this.zzi);
                zzlj.zzA(zzfsVar2, "_et", Long.valueOf(zzd));
                zzal(this.zzi);
                zzlj.zzA(zzfsVar, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    private static final boolean zzak(zzq zzqVar) {
        if (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) {
            return false;
        }
        return true;
    }

    private static final zzku zzal(zzku zzkuVar) {
        if (zzkuVar != null) {
            if (zzkuVar.zzY()) {
                return zzkuVar;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzkuVar.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static zzlh zzt(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzlh.class) {
                if (zzb == null) {
                    zzb = new zzlh((zzli) Preconditions.checkNotNull(new zzli(context)), null);
                }
            }
        }
        return zzb;
    }

    public static /* bridge */ /* synthetic */ void zzy(zzlh zzlhVar, zzli zzliVar) {
        zzlhVar.zzaB().zzg();
        zzlhVar.zzm = new zzfl(zzlhVar);
        zzak zzakVar = new zzak(zzlhVar);
        zzakVar.zzX();
        zzlhVar.zze = zzakVar;
        zzlhVar.zzg().zzq((zzaf) Preconditions.checkNotNull(zzlhVar.zzc));
        zzkb zzkbVar = new zzkb(zzlhVar);
        zzkbVar.zzX();
        zzlhVar.zzk = zzkbVar;
        zzaa zzaaVar = new zzaa(zzlhVar);
        zzaaVar.zzX();
        zzlhVar.zzh = zzaaVar;
        zzip zzipVar = new zzip(zzlhVar);
        zzipVar.zzX();
        zzlhVar.zzj = zzipVar;
        zzks zzksVar = new zzks(zzlhVar);
        zzksVar.zzX();
        zzlhVar.zzg = zzksVar;
        zzlhVar.zzf = new zzfb(zzlhVar);
        if (zzlhVar.zzr != zzlhVar.zzs) {
            zzlhVar.zzaA().zzd().zzc("Not all upload components initialized", Integer.valueOf(zzlhVar.zzr), Integer.valueOf(zzlhVar.zzs));
        }
        zzlhVar.zzo = true;
    }

    public final void zzA() {
        zzaB().zzg();
        zzB();
        if (!this.zzp) {
            this.zzp = true;
            if (zzZ()) {
                FileChannel fileChannel = this.zzx;
                zzaB().zzg();
                int i = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int read = fileChannel.read(allocate);
                        if (read != 4) {
                            if (read != -1) {
                                zzaA().zzk().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                            }
                        } else {
                            allocate.flip();
                            i = allocate.getInt();
                        }
                    } catch (IOException e) {
                        zzaA().zzd().zzb("Failed to read from channel", e);
                    }
                } else {
                    zzaA().zzd().zza("Bad channel to read from");
                }
                int zzi = this.zzn.zzh().zzi();
                zzaB().zzg();
                if (i > zzi) {
                    zzaA().zzd().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                } else if (i < zzi) {
                    FileChannel fileChannel2 = this.zzx;
                    zzaB().zzg();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(zzi);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzaA().zzd().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzaA().zzj().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                            return;
                        } catch (IOException e2) {
                            zzaA().zzd().zzb("Failed to write to channel", e2);
                        }
                    } else {
                        zzaA().zzd().zza("Bad channel to read from");
                    }
                    zzaA().zzd().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzi));
                }
            }
        }
    }

    public final void zzB() {
        if (this.zzo) {
            return;
        }
        throw new IllegalStateException("UploadController is not initialized");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if ((zzg().zzi(r6, com.google.android.gms.measurement.internal.zzeg.zzT) + r0.zzb) < zzax().elapsedRealtime()) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzC(java.lang.String r6, com.google.android.gms.internal.measurement.zzgc r7) {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            java.util.Set r0 = r0.zzk(r6)
            if (r0 == 0) goto Le
            r7.zzi(r0)
        Le:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r0 = r0.zzv(r6)
            if (r0 == 0) goto L1c
            r7.zzp()
        L1c:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r0 = r0.zzy(r6)
            r1 = -1
            if (r0 == 0) goto L52
            com.google.android.gms.measurement.internal.zzag r0 = r5.zzg()
            com.google.android.gms.measurement.internal.zzef r2 = com.google.android.gms.measurement.internal.zzeg.zzar
            boolean r0 = r0.zzs(r6, r2)
            if (r0 == 0) goto L4f
            java.lang.String r0 = r7.zzas()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L52
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            if (r2 == r1) goto L52
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r7.zzY(r0)
            goto L52
        L4f:
            r7.zzu()
        L52:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r0 = r0.zzz(r6)
            if (r0 == 0) goto L68
            java.lang.String r0 = "_id"
            int r0 = com.google.android.gms.measurement.internal.zzlj.zza(r7, r0)
            if (r0 == r1) goto L68
            r7.zzB(r0)
        L68:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r0 = r0.zzx(r6)
            if (r0 == 0) goto L76
            r7.zzq()
        L76:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r0 = r0.zzu(r6)
            if (r0 == 0) goto Lb7
            r7.zzn()
            java.util.Map r0 = r5.zzC
            java.lang.Object r0 = r0.get(r6)
            com.google.android.gms.measurement.internal.zzlg r0 = (com.google.android.gms.measurement.internal.zzlg) r0
            if (r0 == 0) goto La7
            long r1 = r0.zzb
            com.google.android.gms.measurement.internal.zzag r3 = r5.zzg()
            com.google.android.gms.measurement.internal.zzef r4 = com.google.android.gms.measurement.internal.zzeg.zzT
            long r3 = r3.zzi(r6, r4)
            long r3 = r3 + r1
            com.google.android.gms.common.util.Clock r1 = r5.zzax()
            long r1 = r1.elapsedRealtime()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto Lb2
        La7:
            com.google.android.gms.measurement.internal.zzlg r0 = new com.google.android.gms.measurement.internal.zzlg
            r1 = 0
            r0.<init>(r5)
            java.util.Map r1 = r5.zzC
            r1.put(r6, r0)
        Lb2:
            java.lang.String r0 = r0.zza
            r7.zzR(r0)
        Lb7:
            com.google.android.gms.measurement.internal.zzfu r0 = r5.zzc
            zzal(r0)
            boolean r6 = r0.zzw(r6)
            if (r6 == 0) goto Lc5
            r7.zzy()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzC(java.lang.String, com.google.android.gms.internal.measurement.zzgc):void");
    }

    public final void zzD(zzh zzhVar) {
        zzaB().zzg();
        if (TextUtils.isEmpty(zzhVar.zzA()) && TextUtils.isEmpty(zzhVar.zzt())) {
            zzI((String) Preconditions.checkNotNull(zzhVar.zzv()), 204, null, null, null);
            return;
        }
        zzkw zzkwVar = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzA = zzhVar.zzA();
        if (TextUtils.isEmpty(zzA)) {
            zzA = zzhVar.zzt();
        }
        a aVar = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) zzeg.zze.zza(null)).encodedAuthority((String) zzeg.zzf.zza(null)).path("config/app/".concat(String.valueOf(zzA))).appendQueryParameter("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        zzkwVar.zzt.zzf().zzh();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(79000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(zzhVar.zzv());
            URL url = new URL(uri);
            zzaA().zzj().zzb("Fetching remote configuration", str);
            zzfu zzfuVar = this.zzc;
            zzal(zzfuVar);
            com.google.android.gms.internal.measurement.zzff zze = zzfuVar.zze(str);
            zzfu zzfuVar2 = this.zzc;
            zzal(zzfuVar2);
            String zzh = zzfuVar2.zzh(str);
            if (zze != null) {
                if (!TextUtils.isEmpty(zzh)) {
                    aVar = new a();
                    aVar.put(HttpHeaders.IF_MODIFIED_SINCE, zzh);
                }
                zzfu zzfuVar3 = this.zzc;
                zzal(zzfuVar3);
                String zzf = zzfuVar3.zzf(str);
                if (!TextUtils.isEmpty(zzf)) {
                    if (aVar == null) {
                        aVar = new a();
                    }
                    aVar.put(HttpHeaders.IF_NONE_MATCH, zzf);
                }
            }
            this.zzt = true;
            zzez zzezVar = this.zzd;
            zzal(zzezVar);
            zzkz zzkzVar = new zzkz(this);
            zzezVar.zzg();
            zzezVar.zzW();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzkzVar);
            zzezVar.zzt.zzaB().zzo(new zzey(zzezVar, str, url, null, aVar, zzkzVar));
        } catch (MalformedURLException unused) {
            zzaA().zzd().zzc("Failed to parse config URL. Not fetching. appId", zzet.zzn(zzhVar.zzv()), uri);
        }
    }

    public final void zzE(zzau zzauVar, zzq zzqVar) {
        zzau zzauVar2;
        List<zzac> zzt;
        List<zzac> zzt2;
        List<zzac> zzt3;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzaB().zzg();
        zzB();
        String str2 = zzqVar.zza;
        long j = zzauVar.zzd;
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzaB().zzg();
        zzir zzirVar = null;
        if (this.zzD != null && (str = this.zzE) != null && str.equals(str2)) {
            zzirVar = this.zzD;
        }
        zzlp.zzK(zzirVar, zzb2.zzd, false);
        zzau zza = zzb2.zza();
        zzal(this.zzi);
        if (!zzlj.zzB(zza, zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        List list = zzqVar.zzt;
        if (list != null) {
            if (list.contains(zza.zza)) {
                Bundle zzc = zza.zzb.zzc();
                zzc.putLong("ga_safelisted", 1L);
                zzauVar2 = new zzau(zza.zza, new zzas(zzc), zza.zzc, zza.zzd);
            } else {
                zzaA().zzc().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zza.zza, zza.zzc);
                return;
            }
        } else {
            zzauVar2 = zza;
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzw();
        try {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            Preconditions.checkNotEmpty(str2);
            zzakVar2.zzg();
            zzakVar2.zzW();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                zzakVar2.zzt.zzaA().zzk().zzc("Invalid time querying timed out conditional properties", zzet.zzn(str2), Long.valueOf(j));
                zzt = Collections.emptyList();
            } else {
                zzt = zzakVar2.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            for (zzac zzacVar : zzt) {
                if (zzacVar != null) {
                    zzaA().zzj().zzd("User property timed out", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb), zzacVar.zzc.zza());
                    zzau zzauVar3 = zzacVar.zzg;
                    if (zzauVar3 != null) {
                        zzY(new zzau(zzauVar3, j), zzqVar);
                    }
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zza(str2, zzacVar.zzc.zzb);
                }
            }
            zzak zzakVar4 = this.zze;
            zzal(zzakVar4);
            Preconditions.checkNotEmpty(str2);
            zzakVar4.zzg();
            zzakVar4.zzW();
            if (i < 0) {
                zzakVar4.zzt.zzaA().zzk().zzc("Invalid time querying expired conditional properties", zzet.zzn(str2), Long.valueOf(j));
                zzt2 = Collections.emptyList();
            } else {
                zzt2 = zzakVar4.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(zzt2.size());
            for (zzac zzacVar2 : zzt2) {
                if (zzacVar2 != null) {
                    zzaA().zzj().zzd("User property expired", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzA(str2, zzacVar2.zzc.zzb);
                    zzau zzauVar4 = zzacVar2.zzk;
                    if (zzauVar4 != null) {
                        arrayList.add(zzauVar4);
                    }
                    zzak zzakVar6 = this.zze;
                    zzal(zzakVar6);
                    zzakVar6.zza(str2, zzacVar2.zzc.zzb);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzY(new zzau((zzau) it.next(), j), zzqVar);
            }
            zzak zzakVar7 = this.zze;
            zzal(zzakVar7);
            String str3 = zzauVar2.zza;
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str3);
            zzakVar7.zzg();
            zzakVar7.zzW();
            if (i < 0) {
                zzakVar7.zzt.zzaA().zzk().zzd("Invalid time querying triggered conditional properties", zzet.zzn(str2), zzakVar7.zzt.zzj().zzd(str3), Long.valueOf(j));
                zzt3 = Collections.emptyList();
            } else {
                zzt3 = zzakVar7.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(zzt3.size());
            for (zzac zzacVar3 : zzt3) {
                if (zzacVar3 != null) {
                    zzlk zzlkVar = zzacVar3.zzc;
                    zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar3.zza), zzacVar3.zzb, zzlkVar.zzb, j, Preconditions.checkNotNull(zzlkVar.zza()));
                    zzak zzakVar8 = this.zze;
                    zzal(zzakVar8);
                    if (zzakVar8.zzL(zzlmVar)) {
                        zzaA().zzj().zzd("User property triggered", zzacVar3.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    } else {
                        zzaA().zzd().zzd("Too many active user properties, ignoring", zzet.zzn(zzacVar3.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                    }
                    zzau zzauVar5 = zzacVar3.zzi;
                    if (zzauVar5 != null) {
                        arrayList2.add(zzauVar5);
                    }
                    zzacVar3.zzc = new zzlk(zzlmVar);
                    zzacVar3.zze = true;
                    zzak zzakVar9 = this.zze;
                    zzal(zzakVar9);
                    zzakVar9.zzK(zzacVar3);
                }
            }
            zzY(zzauVar2, zzqVar);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                zzY(new zzau((zzau) it2.next(), j), zzqVar);
            }
            zzak zzakVar10 = this.zze;
            zzal(zzakVar10);
            zzakVar10.zzC();
        } finally {
            zzak zzakVar11 = this.zze;
            zzal(zzakVar11);
            zzakVar11.zzx();
        }
    }

    public final void zzF(zzau zzauVar, String str) {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(str);
        if (zzj != null && !TextUtils.isEmpty(zzj.zzy())) {
            Boolean zzad = zzad(zzj);
            if (zzad == null) {
                if (!"_ui".equals(zzauVar.zza)) {
                    zzaA().zzk().zzb("Could not find package. appId", zzet.zzn(str));
                }
            } else if (!zzad.booleanValue()) {
                zzaA().zzd().zzb("App version does not match; dropping event. appId", zzet.zzn(str));
                return;
            }
            String zzA = zzj.zzA();
            String zzy = zzj.zzy();
            long zzb2 = zzj.zzb();
            String zzx = zzj.zzx();
            long zzm = zzj.zzm();
            long zzj2 = zzj.zzj();
            boolean zzan = zzj.zzan();
            String zzz = zzj.zzz();
            zzj.zza();
            zzG(zzauVar, new zzq(str, zzA, zzy, zzb2, zzx, zzm, zzj2, (String) null, zzan, false, zzz, 0L, 0L, 0, zzj.zzam(), false, zzj.zzt(), zzj.zzs(), zzj.zzk(), zzj.zzE(), (String) null, zzq(str).zzi(), "", (String) null, zzj.zzap(), zzj.zzr()));
            return;
        }
        zzaA().zzc().zzb("No app data available; dropping event", str);
    }

    public final void zzG(zzau zzauVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzeu zzb2 = zzeu.zzb(zzauVar);
        zzlp zzv = zzv();
        Bundle bundle = zzb2.zzd;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzv.zzL(bundle, zzakVar.zzi(zzqVar.zza));
        zzv().zzN(zzb2, zzg().zzd(zzqVar.zza));
        zzau zza = zzb2.zza();
        if ("_cmp".equals(zza.zza) && "referrer API v2".equals(zza.zzb.zzg("_cis"))) {
            String zzg = zza.zzb.zzg("gclid");
            if (!TextUtils.isEmpty(zzg)) {
                zzW(new zzlk("_lgclid", zza.zzd, zzg, "auto"), zzqVar);
            }
        }
        zzE(zza, zzqVar);
    }

    public final void zzH() {
        this.zzs++;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzI(java.lang.String r8, int r9, java.lang.Throwable r10, byte[] r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzI(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void zzJ(boolean z) {
        zzag();
    }

    public final void zzK(int i, Throwable th, byte[] bArr, String str) {
        zzak zzakVar;
        long longValue;
        zzaB().zzg();
        zzB();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzae();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzy);
        this.zzy = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzax().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.zzk.zzb.zzb(zzax().currentTimeMillis());
            }
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzakVar2.zzy(list);
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzax().currentTimeMillis());
                this.zzk.zzd.zzb(0L);
                zzag();
                zzaA().zzj().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                zzakVar3.zzw();
            } catch (SQLiteException e) {
                zzaA().zzd().zzb("Database error while trying to delete uploaded bundles", e);
                this.zza = zzax().elapsedRealtime();
                zzaA().zzj().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            try {
                for (Long l : list) {
                    try {
                        zzakVar = this.zze;
                        zzal(zzakVar);
                        longValue = l.longValue();
                        zzakVar.zzg();
                        zzakVar.zzW();
                    } catch (SQLiteException e2) {
                        List list2 = this.zzz;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (zzakVar.zzh().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e3) {
                        zzakVar.zzt.zzaA().zzd().zzb("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                        break;
                    }
                }
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzakVar4.zzC();
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzx();
                this.zzz = null;
                zzez zzezVar = this.zzd;
                zzal(zzezVar);
                if (zzezVar.zza() && zzai()) {
                    zzX();
                } else {
                    this.zzA = -1L;
                    zzag();
                }
                this.zza = 0L;
            } catch (Throwable th2) {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
                throw th2;
            }
        }
        zzaA().zzj().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzax().currentTimeMillis());
        if (i != 503) {
        }
        this.zzk.zzb.zzb(zzax().currentTimeMillis());
        zzak zzakVar22 = this.zze;
        zzal(zzakVar22);
        zzakVar22.zzy(list);
        zzag();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:97|98)|(2:100|(8:102|(3:104|(2:106|(1:108))(1:127)|109)(1:128)|110|(1:112)(1:126)|113|114|115|(4:117|(1:119)|120|(1:122))))|129|114|115|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04aa, code lost:
        zzaA().zzd().zzc("Application info is null, first open report might be inaccurate. appId", com.google.android.gms.measurement.internal.zzet.zzn(r3), r0);
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03da A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0406 A[Catch: all -> 0x0572, TRY_LEAVE, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04be A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04dd A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0542 A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x041b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2 A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024b A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a A[Catch: all -> 0x0572, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026a A[Catch: all -> 0x0572, TRY_LEAVE, TryCatch #1 {all -> 0x0572, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fc, B:45:0x010f, B:47:0x0125, B:48:0x014c, B:50:0x01a4, B:52:0x01a9, B:54:0x01af, B:56:0x01b8, B:68:0x01f2, B:70:0x01fd, B:74:0x020a, B:77:0x0218, B:81:0x0223, B:83:0x0226, B:84:0x0246, B:86:0x024b, B:89:0x026a, B:92:0x027d, B:94:0x02a4, B:97:0x02ac, B:99:0x02bb, B:133:0x03a6, B:135:0x03da, B:136:0x03dd, B:138:0x0406, B:177:0x04dd, B:178:0x04e0, B:186:0x0561, B:140:0x041b, B:145:0x0440, B:147:0x0448, B:149:0x0452, B:153:0x0465, B:157:0x0476, B:161:0x0482, B:164:0x0499, B:167:0x04aa, B:169:0x04be, B:171:0x04c3, B:172:0x04ca, B:174:0x04d0, B:155:0x046e, B:143:0x042c, B:101:0x02cd, B:103:0x02f8, B:104:0x0308, B:106:0x030f, B:108:0x0315, B:110:0x031f, B:112:0x0325, B:114:0x032b, B:116:0x0331, B:117:0x0336, B:119:0x0341, B:123:0x0358, B:129:0x0360, B:130:0x0374, B:131:0x0385, B:132:0x0396, B:179:0x04f7, B:181:0x0528, B:182:0x052b, B:183:0x0542, B:185:0x0546, B:87:0x025a, B:64:0x01d7, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e8, B:39:0x00f2, B:42:0x00f9), top: B:195:0x00a6, inners: #0, #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzL(com.google.android.gms.measurement.internal.zzq r24) {
        /*
            Method dump skipped, instructions count: 1405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzL(com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void zzM() {
        this.zzr++;
    }

    public final void zzN(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzO(zzacVar, zzac);
        }
    }

    public final void zzO(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (zzqVar.zzh) {
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.zza);
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                zzac zzk = zzakVar2.zzk(str, zzacVar.zzc.zzb);
                if (zzk != null) {
                    zzaA().zzc().zzc("Removing conditional user property", zzacVar.zza, this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    zzakVar3.zza(str, zzacVar.zzc.zzb);
                    if (zzk.zze) {
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzA(str, zzacVar.zzc.zzb);
                    }
                    zzau zzauVar = zzacVar.zzk;
                    if (zzauVar != null) {
                        zzas zzasVar = zzauVar.zzb;
                        if (zzasVar != null) {
                            bundle = zzasVar.zzc();
                        } else {
                            bundle = null;
                        }
                        zzY((zzau) Preconditions.checkNotNull(zzv().zzz(str, ((zzau) Preconditions.checkNotNull(zzacVar.zzk)).zza, bundle, zzk.zzb, zzacVar.zzk.zzd, true, true)), zzqVar);
                    }
                } else {
                    zzaA().zzk().zzc("Conditional user property doesn't exist", zzet.zzn(zzacVar.zza), this.zzn.zzj().zzf(zzacVar.zzc.zzb));
                }
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzC();
                return;
            } finally {
                zzak zzakVar6 = this.zze;
                zzal(zzakVar6);
                zzakVar6.zzx();
            }
        }
        zzd(zzqVar);
    }

    public final void zzP(String str, zzq zzqVar) {
        long j;
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
        } else if ("_npa".equals(str) && zzqVar.zzr != null) {
            zzaA().zzc().zza("Falling back to manifest metadata value for ad personalization");
            long currentTimeMillis = zzax().currentTimeMillis();
            if (true != zzqVar.zzr.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            zzW(new zzlk("_npa", currentTimeMillis, Long.valueOf(j), "auto"), zzqVar);
        } else {
            zzaA().zzc().zzb("Removing user property", this.zzn.zzj().zzf(str));
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzakVar.zzw();
            try {
                zzd(zzqVar);
                if ("_id".equals(str)) {
                    zzak zzakVar2 = this.zze;
                    zzal(zzakVar2);
                    zzakVar2.zzA((String) Preconditions.checkNotNull(zzqVar.zza), "_lair");
                }
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                zzakVar3.zzA((String) Preconditions.checkNotNull(zzqVar.zza), str);
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzakVar4.zzC();
                zzaA().zzc().zzb("User property removed", this.zzn.zzj().zzf(str));
            } finally {
                zzak zzakVar5 = this.zze;
                zzal(zzakVar5);
                zzakVar5.zzx();
            }
        }
    }

    public final void zzQ(zzq zzqVar) {
        if (this.zzy != null) {
            ArrayList arrayList = new ArrayList();
            this.zzz = arrayList;
            arrayList.addAll(this.zzy);
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        String str = (String) Preconditions.checkNotNull(zzqVar.zza);
        Preconditions.checkNotEmpty(str);
        zzakVar.zzg();
        zzakVar.zzW();
        try {
            SQLiteDatabase zzh = zzakVar.zzh();
            String[] strArr = {str};
            int delete = zzh.delete("apps", "app_id=?", strArr) + zzh.delete("events", "app_id=?", strArr) + zzh.delete("user_attributes", "app_id=?", strArr) + zzh.delete("conditional_properties", "app_id=?", strArr) + zzh.delete("raw_events", "app_id=?", strArr) + zzh.delete("raw_events_metadata", "app_id=?", strArr) + zzh.delete("queue", "app_id=?", strArr) + zzh.delete("audience_filter_values", "app_id=?", strArr) + zzh.delete("main_event_params", "app_id=?", strArr) + zzh.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzakVar.zzt.zzaA().zzj().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error resetting analytics data. appId, error", zzet.zzn(str), e);
        }
        if (zzqVar.zzh) {
            zzL(zzqVar);
        }
    }

    public final void zzR(String str, zzir zzirVar) {
        zzaB().zzg();
        String str2 = this.zzE;
        if (str2 != null && !str2.equals(str) && zzirVar == null) {
            return;
        }
        this.zzE = str;
        this.zzD = zzirVar;
    }

    public final void zzS() {
        zzaB().zzg();
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzz();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzax().currentTimeMillis());
        }
        zzag();
    }

    public final void zzT(zzac zzacVar) {
        zzq zzac = zzac((String) Preconditions.checkNotNull(zzacVar.zza));
        if (zzac != null) {
            zzU(zzacVar, zzac);
        }
    }

    public final void zzU(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.zza);
        Preconditions.checkNotNull(zzacVar.zzb);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zzc.zzb);
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z = false;
        zzacVar2.zze = false;
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzakVar.zzw();
        try {
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzac zzk = zzakVar2.zzk((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzc.zzb);
            if (zzk != null && !zzk.zzb.equals(zzacVar2.zzb)) {
                zzaA().zzk().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzb, zzk.zzb);
            }
            if (zzk != null && zzk.zze) {
                zzacVar2.zzb = zzk.zzb;
                zzacVar2.zzd = zzk.zzd;
                zzacVar2.zzh = zzk.zzh;
                zzacVar2.zzf = zzk.zzf;
                zzacVar2.zzi = zzk.zzi;
                zzacVar2.zze = true;
                zzlk zzlkVar = zzacVar2.zzc;
                zzacVar2.zzc = new zzlk(zzlkVar.zzb, zzk.zzc.zzc, zzlkVar.zza(), zzk.zzc.zzf);
            } else if (TextUtils.isEmpty(zzacVar2.zzf)) {
                zzlk zzlkVar2 = zzacVar2.zzc;
                zzacVar2.zzc = new zzlk(zzlkVar2.zzb, zzacVar2.zzd, zzlkVar2.zza(), zzacVar2.zzc.zzf);
                zzacVar2.zze = true;
                z = true;
            }
            if (zzacVar2.zze) {
                zzlk zzlkVar3 = zzacVar2.zzc;
                zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzacVar2.zza), zzacVar2.zzb, zzlkVar3.zzb, zzlkVar3.zzc, Preconditions.checkNotNull(zzlkVar3.zza()));
                zzak zzakVar3 = this.zze;
                zzal(zzakVar3);
                if (zzakVar3.zzL(zzlmVar)) {
                    zzaA().zzc().zzd("User property updated immediately", zzacVar2.zza, this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                } else {
                    zzaA().zzd().zzd("(2)Too many active user properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                }
                if (z && zzacVar2.zzi != null) {
                    zzY(new zzau(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                }
            }
            zzak zzakVar4 = this.zze;
            zzal(zzakVar4);
            if (zzakVar4.zzK(zzacVar2)) {
                zzaA().zzc().zzd("Conditional property added", zzacVar2.zza, this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
            } else {
                zzaA().zzd().zzd("Too many conditional properties, ignoring", zzet.zzn(zzacVar2.zza), this.zzn.zzj().zzf(zzacVar2.zzc.zzb), zzacVar2.zzc.zza());
            }
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzC();
        } finally {
            zzak zzakVar6 = this.zze;
            zzal(zzakVar6);
            zzakVar6.zzx();
        }
    }

    public final void zzV(String str, zzhb zzhbVar) {
        zzaB().zzg();
        zzB();
        this.zzB.put(str, zzhbVar);
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzhbVar);
        zzakVar.zzg();
        zzakVar.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzhbVar.zzi());
        try {
            if (zzakVar.zzh().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzakVar.zzt.zzaA().zzd().zzb("Failed to insert/update consent setting (got -1). appId", zzet.zzn(str));
            }
        } catch (SQLiteException e) {
            zzakVar.zzt.zzaA().zzd().zzc("Error storing consent setting. appId, error", zzet.zzn(str), e);
        }
    }

    public final void zzW(zzlk zzlkVar, zzq zzqVar) {
        long j;
        int i;
        zzaB().zzg();
        zzB();
        if (!zzak(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            zzd(zzqVar);
            return;
        }
        int zzl = zzv().zzl(zzlkVar.zzb);
        int i2 = 0;
        if (zzl != 0) {
            zzlp zzv = zzv();
            String str = zzlkVar.zzb;
            zzg();
            String zzD = zzv.zzD(str, 24, true);
            String str2 = zzlkVar.zzb;
            if (str2 != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            zzv().zzO(this.zzF, zzqVar.zza, zzl, "_ev", zzD, i);
            return;
        }
        int zzd = zzv().zzd(zzlkVar.zzb, zzlkVar.zza());
        if (zzd != 0) {
            zzlp zzv2 = zzv();
            String str3 = zzlkVar.zzb;
            zzg();
            String zzD2 = zzv2.zzD(str3, 24, true);
            Object zza = zzlkVar.zza();
            if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                i2 = zza.toString().length();
            }
            zzv().zzO(this.zzF, zzqVar.zza, zzd, "_ev", zzD2, i2);
            return;
        }
        Object zzB = zzv().zzB(zzlkVar.zzb, zzlkVar.zza());
        if (zzB == null) {
            return;
        }
        if ("_sid".equals(zzlkVar.zzb)) {
            long j2 = zzlkVar.zzc;
            String str4 = zzlkVar.zzf;
            String str5 = (String) Preconditions.checkNotNull(zzqVar.zza);
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            zzlm zzp = zzakVar.zzp(str5, "_sno");
            if (zzp != null) {
                Object obj = zzp.zze;
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                    zzW(new zzlk("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                }
            }
            if (zzp != null) {
                zzaA().zzk().zzb("Retrieved last session number from database does not contain a valid (long) value", zzp.zze);
            }
            zzak zzakVar2 = this.zze;
            zzal(zzakVar2);
            zzaq zzn = zzakVar2.zzn(str5, "_s");
            if (zzn != null) {
                j = zzn.zzc;
                zzaA().zzj().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
            } else {
                j = 0;
            }
            zzW(new zzlk("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
        }
        zzlm zzlmVar = new zzlm((String) Preconditions.checkNotNull(zzqVar.zza), (String) Preconditions.checkNotNull(zzlkVar.zzf), zzlkVar.zzb, zzlkVar.zzc, zzB);
        zzaA().zzj().zzc("Setting user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzB);
        zzak zzakVar3 = this.zze;
        zzal(zzakVar3);
        zzakVar3.zzw();
        try {
            if ("_id".equals(zzlmVar.zzc)) {
                zzak zzakVar4 = this.zze;
                zzal(zzakVar4);
                zzlm zzp2 = zzakVar4.zzp(zzqVar.zza, "_id");
                if (zzp2 != null && !zzlmVar.zze.equals(zzp2.zze)) {
                    zzak zzakVar5 = this.zze;
                    zzal(zzakVar5);
                    zzakVar5.zzA(zzqVar.zza, "_lair");
                }
            }
            zzd(zzqVar);
            zzak zzakVar6 = this.zze;
            zzal(zzakVar6);
            boolean zzL = zzakVar6.zzL(zzlmVar);
            if (zzg().zzs(null, zzeg.zzaH) && "_sid".equals(zzlkVar.zzb)) {
                zzlj zzljVar = this.zzi;
                zzal(zzljVar);
                long zzd2 = zzljVar.zzd(zzqVar.zzx);
                zzak zzakVar7 = this.zze;
                zzal(zzakVar7);
                zzh zzj = zzakVar7.zzj(zzqVar.zza);
                if (zzj != null) {
                    zzj.zzaj(zzd2);
                    if (zzj.zzao()) {
                        zzak zzakVar8 = this.zze;
                        zzal(zzakVar8);
                        zzakVar8.zzD(zzj);
                    }
                }
            }
            zzak zzakVar9 = this.zze;
            zzal(zzakVar9);
            zzakVar9.zzC();
            if (!zzL) {
                zzaA().zzd().zzc("Too many unique user properties are set. Ignoring user property", this.zzn.zzj().zzf(zzlmVar.zzc), zzlmVar.zze);
                zzv().zzO(this.zzF, zzqVar.zza, 9, null, null, 0);
            }
        } finally {
            zzak zzakVar10 = this.zze;
            zzal(zzakVar10);
            zzakVar10.zzx();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0511, code lost:
        if (r3 == null) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
        if (r11 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a8 A[Catch: all -> 0x0536, TryCatch #15 {all -> 0x0536, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:66:0x0138, B:70:0x0160, B:74:0x0168, B:137:0x02a2, B:139:0x02a8, B:141:0x02b4, B:142:0x02b8, B:144:0x02be, B:146:0x02d2, B:150:0x02db, B:152:0x02e1, B:158:0x0306, B:155:0x02f6, B:157:0x0300, B:159:0x0309, B:161:0x0324, B:165:0x0333, B:167:0x0357, B:169:0x0391, B:171:0x0396, B:173:0x039e, B:174:0x03a1, B:176:0x03a6, B:177:0x03a9, B:179:0x03b5, B:180:0x03cb, B:181:0x03d3, B:183:0x03e4, B:185:0x03f5, B:186:0x040a, B:188:0x0417, B:190:0x042c, B:192:0x0437, B:193:0x0440, B:189:0x0425, B:195:0x048f, B:124:0x0273, B:136:0x029f, B:199:0x04aa, B:200:0x04ad, B:201:0x04ae, B:206:0x04ee, B:222:0x0515, B:224:0x051b, B:226:0x0526, B:210:0x04f7, B:231:0x0532, B:232:0x0535), top: B:252:0x0010, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x051b A[Catch: all -> 0x0536, TryCatch #15 {all -> 0x0536, blocks: (B:3:0x0010, B:11:0x0038, B:15:0x004e, B:20:0x005c, B:24:0x0077, B:28:0x0095, B:34:0x00bd, B:38:0x00e0, B:40:0x00f1, B:66:0x0138, B:70:0x0160, B:74:0x0168, B:137:0x02a2, B:139:0x02a8, B:141:0x02b4, B:142:0x02b8, B:144:0x02be, B:146:0x02d2, B:150:0x02db, B:152:0x02e1, B:158:0x0306, B:155:0x02f6, B:157:0x0300, B:159:0x0309, B:161:0x0324, B:165:0x0333, B:167:0x0357, B:169:0x0391, B:171:0x0396, B:173:0x039e, B:174:0x03a1, B:176:0x03a6, B:177:0x03a9, B:179:0x03b5, B:180:0x03cb, B:181:0x03d3, B:183:0x03e4, B:185:0x03f5, B:186:0x040a, B:188:0x0417, B:190:0x042c, B:192:0x0437, B:193:0x0440, B:189:0x0425, B:195:0x048f, B:124:0x0273, B:136:0x029f, B:199:0x04aa, B:200:0x04ad, B:201:0x04ae, B:206:0x04ee, B:222:0x0515, B:224:0x051b, B:226:0x0526, B:210:0x04f7, B:231:0x0532, B:232:0x0535), top: B:252:0x0010, inners: #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0134 A[Catch: all -> 0x0034, TryCatch #14 {all -> 0x0034, blocks: (B:5:0x0021, B:13:0x003e, B:18:0x0056, B:22:0x0067, B:26:0x0082, B:31:0x00b4, B:37:0x00c9, B:43:0x00f7, B:47:0x010c, B:60:0x012d, B:64:0x0134, B:65:0x0137, B:80:0x01a2), top: B:251:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzX() {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzX():void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:93:0x02f8
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void zzY(com.google.android.gms.measurement.internal.zzau r37, com.google.android.gms.measurement.internal.zzq r38) {
        /*
            Method dump skipped, instructions count: 2908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzlh.zzY(com.google.android.gms.measurement.internal.zzau, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final boolean zzZ() {
        zzaB().zzg();
        FileLock fileLock = this.zzw;
        if (fileLock != null && fileLock.isValid()) {
            zzaA().zzj().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzt.zzf();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.zzn.zzaw().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzx = channel;
            FileLock tryLock = channel.tryLock();
            this.zzw = tryLock;
            if (tryLock != null) {
                zzaA().zzj().zza("Storage concurrent access okay");
                return true;
            }
            zzaA().zzd().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaA().zzd().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaA().zzd().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaA().zzk().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    public final long zza() {
        long currentTimeMillis = zzax().currentTimeMillis();
        zzkb zzkbVar = this.zzk;
        zzkbVar.zzW();
        zzkbVar.zzg();
        long zza = zzkbVar.zze.zza();
        if (zza == 0) {
            zza = zzkbVar.zzt.zzv().zzG().nextInt(86400000) + 1;
            zzkbVar.zze.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzet zzaA() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaA();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzga zzaB() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzaB();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Context zzaw() {
        return this.zzn.zzaw();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final Clock zzax() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzax();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final zzab zzay() {
        throw null;
    }

    public final zzh zzd(zzq zzqVar) {
        String str;
        zzaB().zzg();
        zzB();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        if (!zzqVar.zzw.isEmpty()) {
            this.zzC.put(zzqVar.zza, new zzlg(this, zzqVar.zzw));
        }
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        zzh zzj = zzakVar.zzj(zzqVar.zza);
        zzhb zzd = zzq(zzqVar.zza).zzd(zzhb.zzc(zzqVar.zzv, 100));
        zzha zzhaVar = zzha.AD_STORAGE;
        if (zzd.zzj(zzhaVar)) {
            str = this.zzk.zzf(zzqVar.zza, zzqVar.zzo);
        } else {
            str = "";
        }
        if (zzj == null) {
            zzj = new zzh(this.zzn, zzqVar.zza);
            if (zzd.zzj(zzha.ANALYTICS_STORAGE)) {
                zzj.zzJ(zzw(zzd));
            }
            if (zzd.zzj(zzhaVar)) {
                zzj.zzag(str);
            }
        } else if (zzd.zzj(zzhaVar) && str != null && !str.equals(zzj.zzC())) {
            zzj.zzag(str);
            if (zzqVar.zzo && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzd(zzqVar.zza, zzd).first)) {
                zzj.zzJ(zzw(zzd));
                zzak zzakVar2 = this.zze;
                zzal(zzakVar2);
                if (zzakVar2.zzp(zzqVar.zza, "_id") != null) {
                    zzak zzakVar3 = this.zze;
                    zzal(zzakVar3);
                    if (zzakVar3.zzp(zzqVar.zza, "_lair") == null) {
                        zzlm zzlmVar = new zzlm(zzqVar.zza, "auto", "_lair", zzax().currentTimeMillis(), 1L);
                        zzak zzakVar4 = this.zze;
                        zzal(zzakVar4);
                        zzakVar4.zzL(zzlmVar);
                    }
                }
            }
        } else if (TextUtils.isEmpty(zzj.zzw()) && zzd.zzj(zzha.ANALYTICS_STORAGE)) {
            zzj.zzJ(zzw(zzd));
        }
        zzj.zzY(zzqVar.zzb);
        zzj.zzH(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            zzj.zzX(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            zzj.zzZ(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            zzj.zzL(zzqVar.zzc);
        }
        zzj.zzM(zzqVar.zzj);
        String str2 = zzqVar.zzd;
        if (str2 != null) {
            zzj.zzK(str2);
        }
        zzj.zzU(zzqVar.zzf);
        zzj.zzae(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            zzj.zzaa(zzqVar.zzg);
        }
        zzj.zzI(zzqVar.zzo);
        zzj.zzaf(zzqVar.zzr);
        zzj.zzV(zzqVar.zzs);
        zzqu.zzc();
        if (zzg().zzs(null, zzeg.zzam) || zzg().zzs(zzqVar.zza, zzeg.zzao)) {
            zzj.zzai(zzqVar.zzx);
        }
        zzop.zzc();
        if (zzg().zzs(null, zzeg.zzal)) {
            zzj.zzah(zzqVar.zzt);
        } else {
            zzop.zzc();
            if (zzg().zzs(null, zzeg.zzak)) {
                zzj.zzah(null);
            }
        }
        zzrd.zzc();
        if (zzg().zzs(null, zzeg.zzaq)) {
            zzj.zzak(zzqVar.zzy);
        }
        zzpz.zzc();
        if (zzg().zzs(null, zzeg.zzaE)) {
            zzj.zzal(zzqVar.zzz);
        }
        if (zzj.zzao()) {
            zzak zzakVar5 = this.zze;
            zzal(zzakVar5);
            zzakVar5.zzD(zzj);
        }
        return zzj;
    }

    public final zzaa zzf() {
        zzaa zzaaVar = this.zzh;
        zzal(zzaaVar);
        return zzaaVar;
    }

    public final zzag zzg() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzf();
    }

    public final zzak zzh() {
        zzak zzakVar = this.zze;
        zzal(zzakVar);
        return zzakVar;
    }

    public final zzeo zzi() {
        return this.zzn.zzj();
    }

    public final zzez zzj() {
        zzez zzezVar = this.zzd;
        zzal(zzezVar);
        return zzezVar;
    }

    public final zzfb zzl() {
        zzfb zzfbVar = this.zzf;
        if (zzfbVar != null) {
            return zzfbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzfu zzm() {
        zzfu zzfuVar = this.zzc;
        zzal(zzfuVar);
        return zzfuVar;
    }

    public final zzgd zzp() {
        return this.zzn;
    }

    public final zzhb zzq(String str) {
        String str2;
        zzhb zzhbVar = zzhb.zza;
        zzaB().zzg();
        zzB();
        zzhb zzhbVar2 = (zzhb) this.zzB.get(str);
        if (zzhbVar2 == null) {
            zzak zzakVar = this.zze;
            zzal(zzakVar);
            Preconditions.checkNotNull(str);
            zzakVar.zzg();
            zzakVar.zzW();
            Cursor cursor = null;
            try {
                try {
                    cursor = zzakVar.zzh().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    zzhb zzc = zzhb.zzc(str2, 100);
                    zzV(str, zzc);
                    return zzc;
                } catch (SQLiteException e) {
                    zzakVar.zzt.zzaA().zzd().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return zzhbVar2;
    }

    public final zzip zzr() {
        zzip zzipVar = this.zzj;
        zzal(zzipVar);
        return zzipVar;
    }

    public final zzkb zzs() {
        return this.zzk;
    }

    public final zzlj zzu() {
        zzlj zzljVar = this.zzi;
        zzal(zzljVar);
        return zzljVar;
    }

    public final zzlp zzv() {
        return ((zzgd) Preconditions.checkNotNull(this.zzn)).zzv();
    }

    public final String zzw(zzhb zzhbVar) {
        if (zzhbVar.zzj(zzha.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzv().zzG().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    public final String zzx(zzq zzqVar) {
        try {
            return (String) zzaB().zzh(new zzla(this, zzqVar)).get(NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaA().zzd().zzc("Failed to get app instance id. appId", zzet.zzn(zzqVar.zza), e);
            return null;
        }
    }

    public final void zzz(Runnable runnable) {
        zzaB().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }
}
