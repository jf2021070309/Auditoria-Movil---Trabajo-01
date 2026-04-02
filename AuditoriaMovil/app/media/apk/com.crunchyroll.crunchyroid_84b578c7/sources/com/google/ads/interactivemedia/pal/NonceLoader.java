package com.google.ads.interactivemedia.pal;

import android.content.Context;
import com.amazon.aps.iva.k.q;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.pal.zzagb;
import com.google.android.gms.internal.pal.zzagc;
import com.google.android.gms.internal.pal.zzba;
import com.google.android.gms.internal.pal.zzbc;
import com.google.android.gms.internal.pal.zzbg;
import com.google.android.gms.internal.pal.zzig;
import com.google.android.gms.internal.pal.zzii;
import com.google.android.gms.internal.pal.zzij;
import com.google.android.gms.internal.pal.zzil;
import com.google.android.gms.internal.pal.zzjb;
import com.google.android.gms.internal.pal.zzjc;
import com.google.android.gms.internal.pal.zzjl;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.Executors;
import org.apache.commons.codec.binary.Hex;
/* compiled from: com.google.android.gms:play-services-pal@@20.0.1 */
/* loaded from: classes2.dex */
public final class NonceLoader {
    public static final /* synthetic */ int zza = 0;
    private static final Random zzb = new Random();
    private final Context zzc;
    private final zzagb zzd;
    private final zzagb zze;
    private final Task zzf;
    private final com.google.android.gms.internal.pal.zzav zzg;
    private final zzbg zzh;
    private final zzbg zzi;
    private final zzbg zzj;
    private final zzbc zzk;
    private final zzx zzl;
    private final long zzm;
    private long zzn;
    private final String zzo;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NonceLoader(final android.content.Context r17, com.google.ads.interactivemedia.pal.ConsentSettings r18) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.pal.NonceLoader.<init>(android.content.Context, com.google.ads.interactivemedia.pal.ConsentSettings):void");
    }

    public static /* synthetic */ Map zzb(zzjb zzjbVar, Task task, Task task2, Task task3, Task task4, Task task5) throws Exception {
        zzjc zzjcVar;
        zzjbVar.zzb((Map) zze(task).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzaf
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                String str;
                com.google.android.gms.internal.pal.zzaw zzawVar = (com.google.android.gms.internal.pal.zzaw) obj;
                int i = NonceLoader.zza;
                String zza2 = zzak.ADVERTISING_ID.zza();
                String zza3 = zzawVar.zza();
                String zza4 = zzak.ID_TYPE.zza();
                String zzb2 = zzawVar.zzb();
                String zza5 = zzak.LIMIT_AD_TRACKING.zza();
                if (true != zzawVar.zzc()) {
                    str = "0";
                } else {
                    str = "1";
                }
                return zzjc.zzf(zza2, zza3, zza4, zzb2, zza5, str);
            }
        }).zzc(zzjc.zzc()));
        zzil zze = zze(task);
        zzil zze2 = zze(task2);
        if (((Boolean) zze.zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzab
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                com.google.android.gms.internal.pal.zzaw zzawVar = (com.google.android.gms.internal.pal.zzaw) obj;
                int i = NonceLoader.zza;
                boolean z = false;
                if (!zzawVar.zzc() && !zzig.zza(zzawVar.zza(), "00000000-0000-0000-0000-000000000000")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }).zzc(Boolean.FALSE)).booleanValue()) {
            zzjcVar = zzjc.zzc();
        } else {
            zzjcVar = (zzjc) zze2.zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzac
                @Override // com.google.android.gms.internal.pal.zzii
                public final Object zza(Object obj) {
                    AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                    int i = NonceLoader.zza;
                    return zzjc.zze(zzak.PER_VENDOR_ID.zza(), appSetIdInfo.getId(), zzak.PER_VENDOR_ID_SCOPE.zza(), String.valueOf(appSetIdInfo.getScope()));
                }
            }).zzc(zzjc.zzc());
        }
        zzjbVar.zzb(zzjcVar);
        zzjbVar.zzb((Map) zze(task3).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzag
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                int i = NonceLoader.zza;
                return zzjc.zzd(zzak.MOBILE_SPAM.zza(), (String) obj);
            }
        }).zzc(zzjc.zzc()));
        zzjbVar.zzb((Map) zze(task4).zza(new zzii() { // from class: com.google.ads.interactivemedia.pal.zzah
            @Override // com.google.android.gms.internal.pal.zzii
            public final Object zza(Object obj) {
                int i = NonceLoader.zza;
                return zzjc.zzd(zzak.ADS_IDENTITY_TOKEN.zza(), (String) obj);
            }
        }).zzc(zzjc.zzc()));
        return zzjbVar.zzc();
    }

    private static zzil zze(Task task) {
        if (!task.isSuccessful()) {
            return zzil.zze();
        }
        return (zzil) task.getResult();
    }

    private static String zzf() {
        return Integer.toString(zzb.nextInt(Integer.MAX_VALUE));
    }

    private static String zzg(String str) {
        try {
            return URLEncoder.encode(str, Hex.DEFAULT_CHARSET_NAME);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    private static String zzh(Context context) {
        return "h.3.2.2/n.android.3.2.2/".concat(String.valueOf(context.getApplicationContext().getPackageName()));
    }

    public Task<NonceManager> loadNonceManager(final NonceRequest nonceRequest) {
        String str;
        Object obj;
        Task<Map<String, String>> collectSignals;
        String str2;
        String str3;
        if (nonceRequest == null) {
            this.zzl.zza(MediaError.DetailedErrorCode.MEDIA_NETWORK);
            return Tasks.forException(NonceLoaderException.zzb(MediaError.DetailedErrorCode.MEDIA_NETWORK));
        }
        final String zzf = zzf();
        final zzjb zzjbVar = new zzjb();
        if (nonceRequest.zzi().length() <= 500) {
            zzjbVar.zza(zzak.DESCRIPTION_URL.zza(), zzg(nonceRequest.zzi()));
        }
        if (nonceRequest.zzo().length() <= 200) {
            zzjbVar.zza(zzak.PPID.zza(), zzg(nonceRequest.zzo()));
        }
        if (nonceRequest.zzl().length() > 0 && nonceRequest.zzl().length() <= 200) {
            zzjbVar.zza(zzak.OMID_VERSION.zza(), zzg(nonceRequest.zzl()));
        }
        if (nonceRequest.zzm().length() <= 200) {
            zzjbVar.zza(zzak.PLAYER_TYPE.zza(), zzg(nonceRequest.zzm()));
        }
        if (nonceRequest.zzn().length() <= 200) {
            zzjbVar.zza(zzak.PLAYER_VERSION.zza(), zzg(nonceRequest.zzn()));
        }
        if (nonceRequest.zzj().length() != 0 && nonceRequest.zzj().length() <= 200 && nonceRequest.zzk().length() != 0 && nonceRequest.zzk().length() <= 200) {
            str = q.b(nonceRequest.zzj(), "/", nonceRequest.zzk());
        } else {
            str = "";
        }
        zzjbVar.zza(zzak.OMID_PARTNER.zza(), zzg(str));
        TreeSet treeSet = new TreeSet(nonceRequest.zzq());
        if (!str.isEmpty()) {
            treeSet.add(7);
        }
        String zza2 = zzak.API_FRAMEWORKS.zza();
        Iterator it = treeSet.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            zzij.zzb(sb, it, ",");
            zzjbVar.zza(zza2, sb.toString());
            Integer zzg = nonceRequest.zzg();
            if (zzg != null) {
                String zza3 = zzak.PLAYER_HEIGHT.zza();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzg);
                zzjbVar.zza(zza3, sb2.toString());
            }
            Integer zzh = nonceRequest.zzh();
            if (zzh != null) {
                String zza4 = zzak.PLAYER_WIDTH.zza();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(zzh);
                zzjbVar.zza(zza4, sb3.toString());
            }
            if (zzg != null && zzh != null) {
                String zza5 = zzak.ORIENTATION.zza();
                if (zzg.intValue() <= zzh.intValue()) {
                    str3 = "l";
                } else {
                    str3 = "p";
                }
                zzjbVar.zza(zza5, str3);
            }
            Boolean zzd = nonceRequest.zzd();
            if (zzd != null) {
                String zza6 = zzak.PLAY_ACTIVATION.zza();
                if (true != zzd.booleanValue()) {
                    str2 = "click";
                } else {
                    str2 = "auto";
                }
                zzjbVar.zza(zza6, str2);
            }
            Boolean zzc = nonceRequest.zzc();
            String zza7 = zzak.WTA_SUPPORTED.zza();
            String str4 = "0";
            String str5 = "1";
            if (true != zzc.booleanValue()) {
                obj = "0";
            } else {
                obj = "1";
            }
            zzjbVar.zza(zza7, obj);
            Boolean zze = nonceRequest.zze();
            if (zze != null) {
                String zza8 = zzak.PLAY_MUTED.zza();
                if (true == zze.booleanValue()) {
                    str4 = "1";
                }
                zzjbVar.zza(zza8, str4);
            }
            Boolean zzb2 = nonceRequest.zzb();
            if (zzb2 != null) {
                String zza9 = zzak.CONTINUOUS_PLAYBACK.zza();
                if (true == zzb2.booleanValue()) {
                    str5 = "2";
                }
                zzjbVar.zza(zza9, str5);
            }
            zzjbVar.zza(zzak.SESSION_ID.zza(), nonceRequest.zzp());
            final zzjb zzjbVar2 = new zzjb();
            zzjbVar2.zza(zzak.PAL_VERSION.zza(), zzat.zza);
            zzjbVar2.zza(zzak.SDK_VERSION.zza(), zzh(this.zzc));
            zzjbVar2.zza(zzak.APP_NAME.zza(), this.zzc.getApplicationContext().getPackageName());
            zzjbVar2.zza(zzak.PAGE_CORRELATOR.zza(), this.zzo);
            zzjbVar2.zza(zzak.AD_SPAM_CAPABILITIES.zza(), "3");
            zzjbVar2.zza(zzak.SPAM_CORRELATOR.zza(), zzf);
            final Task zzb3 = this.zzi.zzb();
            final Task zzb4 = this.zzj.zzb();
            final Task zzb5 = this.zzg.zzb();
            final Task zzb6 = this.zzh.zzb();
            final Task continueWith = Tasks.whenAllComplete(zzb3, zzb4, zzb5, zzb6).continueWith(new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzae
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return NonceLoader.zzb(zzjb.this, zzb3, zzb4, zzb5, zzb6, task);
                }
            });
            PlatformSignalCollector zza10 = nonceRequest.zza();
            if (zza10 == null) {
                collectSignals = Tasks.forResult(zzjc.zzc());
            } else {
                collectSignals = zza10.collectSignals(this.zzc, Executors.newSingleThreadExecutor());
            }
            final Task zzb7 = this.zzk.zzb();
            final long currentTimeMillis = DefaultClock.getInstance().currentTimeMillis();
            final Task<Map<String, String>> task = collectSignals;
            return Tasks.whenAllComplete(continueWith, zzb7, collectSignals).continueWith(Executors.newSingleThreadExecutor(), new Continuation() { // from class: com.google.ads.interactivemedia.pal.zzz
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return NonceLoader.this.zza(zzjbVar, continueWith, task, zzb7, nonceRequest, zzf, currentTimeMillis, task2);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.ads.interactivemedia.pal.zzaa
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    NonceLoader.this.zzc(exc);
                }
            });
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public void release() {
        this.zzg.zze();
        this.zzh.zze();
        this.zzi.zze();
        this.zzj.zze();
        this.zzk.zze();
    }

    public final /* synthetic */ NonceManager zza(zzjb zzjbVar, Task task, Task task2, Task task3, NonceRequest nonceRequest, String str, long j, Task task4) throws Exception {
        zzjbVar.zzb((Map) task.getResult());
        if (task2.isSuccessful()) {
            zzjbVar.zzb((Map) task2.getResult());
        }
        zzba zzbaVar = (zzba) ((zzil) task3.getResult()).zzb();
        zzjc zzc = zzjbVar.zzc();
        StringBuilder sb = new StringBuilder();
        zzjl it = zzc.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != null && ((String) entry.getValue()).length() != 0) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
            }
        }
        String zza2 = zzbaVar.zza(sb.toString());
        Integer zzf = nonceRequest.zzf();
        if (zzf != null && zza2.length() > zzf.intValue()) {
            throw NonceLoaderException.zzb(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED);
        }
        String zzh = zzh(this.zzc);
        String str2 = this.zzo;
        zze zzeVar = new zze();
        zzeVar.zzb(zzat.zza);
        zzeVar.zzc(zzh);
        zzeVar.zza(str2);
        zzax zzaxVar = new zzax(new zzs(zzeVar.zzd()), str);
        int length = zza2.length();
        zzh zzhVar = new zzh();
        zzagc zzagcVar = zzagc.zza;
        zzhVar.zzc(zzagcVar);
        zzhVar.zzd(zzagc.zza(j - this.zzm));
        zzhVar.zzb(zzagc.zza(DefaultClock.getInstance().currentTimeMillis() - this.zzm));
        zzhVar.zzf(zzagcVar);
        zzhVar.zze(zzagc.zza(this.zzn - this.zzm));
        zzhVar.zza(length);
        this.zzl.zzb(zzhVar.zzg());
        return new NonceManager(this.zzc, zzaj.zza(), Executors.newSingleThreadExecutor(), this.zzf, zzaxVar, zza2);
    }

    public final /* synthetic */ void zzc(Exception exc) {
        if (exc instanceof NonceLoaderException) {
            this.zzl.zza(((NonceLoaderException) exc).zza());
        } else {
            this.zzl.zza(100);
        }
    }

    public final /* synthetic */ void zzd(Task task) {
        this.zzn = DefaultClock.getInstance().currentTimeMillis();
    }
}
