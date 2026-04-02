package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzib implements zzlc, zzgv {
    final /* synthetic */ zzig zza;
    private final Uri zzc;
    private final zzlp zzd;
    private final zzhx zze;
    private final zznx zzf;
    private final zzakw zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzox zzn;
    private boolean zzo;
    private final zzoq zzh = new zzoq();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzgx.zza();
    private zzan zzl = zzj(0);

    public zzib(zzig zzigVar, Uri uri, zzaj zzajVar, zzhx zzhxVar, zznx zznxVar, zzakw zzakwVar) {
        this.zza = zzigVar;
        this.zzc = uri;
        this.zzd = new zzlp(zzajVar);
        this.zze = zzhxVar;
        this.zzf = zznxVar;
        this.zzg = zzakwVar;
    }

    public static /* synthetic */ long zzb(zzib zzibVar) {
        return zzibVar.zzb;
    }

    public static /* synthetic */ zzlp zzc(zzib zzibVar) {
        return zzibVar.zzd;
    }

    public static /* synthetic */ long zzd(zzib zzibVar) {
        return zzibVar.zzk;
    }

    public static /* synthetic */ zzan zze(zzib zzibVar) {
        return zzibVar.zzl;
    }

    public static /* synthetic */ long zzf(zzib zzibVar) {
        return zzibVar.zzm;
    }

    public static /* synthetic */ void zzi(zzib zzibVar, long j, long j2) {
        zzibVar.zzh.zza = j;
        zzibVar.zzk = j2;
        zzibVar.zzj = true;
        zzibVar.zzo = false;
    }

    private final zzan zzj(long j) {
        Map<String, String> map;
        zzal zzalVar = new zzal();
        zzalVar.zza(this.zzc);
        zzalVar.zzc(j);
        zzalVar.zzd(6);
        map = zzig.zzb;
        zzalVar.zzb(map);
        return zzalVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0093 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a9 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00bf A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00d5 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00f1 A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0137 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x014a A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0192 A[Catch: all -> 0x020d, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x019b A[Catch: all -> 0x020d, TRY_LEAVE, TryCatch #5 {all -> 0x020d, blocks: (B:141:0x000c, B:143:0x0022, B:144:0x0025, B:147:0x003a, B:148:0x0040, B:166:0x0088, B:168:0x0093, B:170:0x009f, B:172:0x00a9, B:174:0x00b5, B:176:0x00bf, B:178:0x00cb, B:180:0x00d5, B:182:0x00e7, B:184:0x00f1, B:185:0x00f7, B:203:0x0137, B:204:0x013d, B:206:0x014a, B:208:0x0154, B:209:0x0172, B:211:0x0192, B:212:0x0197, B:214:0x019b, B:188:0x00ff, B:190:0x0109, B:192:0x0113, B:191:0x010e, B:196:0x011b, B:198:0x0125, B:200:0x012f, B:199:0x012a, B:152:0x004a, B:154:0x0056, B:156:0x0061, B:155:0x005b, B:160:0x006a, B:162:0x0076, B:164:0x0080, B:163:0x007b), top: B:257:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x01eb A[EDGE_INSN: B:263:0x01eb->B:228:0x01eb ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzib.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zza(zzamf zzamfVar) {
        long zzV;
        long max;
        if (this.zzo) {
            zzV = this.zza.zzV();
            max = Math.max(zzV, this.zzk);
        } else {
            max = this.zzk;
        }
        long j = max;
        int zzd = zzamfVar.zzd();
        zzox zzoxVar = this.zzn;
        if (zzoxVar != null) {
            zzov.zzb(zzoxVar, zzamfVar, zzd);
            zzoxVar.zzv(j, 1, zzd, 0, null);
            this.zzo = true;
            return;
        }
        throw null;
    }
}
