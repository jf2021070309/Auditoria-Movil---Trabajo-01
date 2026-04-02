package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
final class zzesf implements zzery<zzesd> {
    private final zzfsn zza;
    private final Context zzb;

    public zzesf(zzfsn zzfsnVar, Context context) {
        this.zza = zzfsnVar;
        this.zzb = context;
    }

    private static ResolveInfo zzc(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzesd> zza() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzese
            private final zzesf zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(1:3)(1:54)|4|(1:6)(1:53)|7|(3:9|(2:12|10)|13)|14|(3:46|47|(12:49|50|17|18|19|(7:21|22|23|(2:29|(3:32|(3:35|(2:38|39)(1:37)|33)|40))|25|26|27)|42|23|(0)|25|26|27))|16|17|18|19|(0)|42|23|(0)|25|26|27) */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: Exception -> 0x00d7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d7, blocks: (B:27:0x00a6, B:29:0x00b4), top: B:49:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesd zzb() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesf.zzb():com.google.android.gms.internal.ads.zzesd");
    }
}
