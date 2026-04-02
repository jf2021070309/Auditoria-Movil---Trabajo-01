package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzadc {
    public static String zza(Context context, String str, List<Certificate> list, Executor executor) throws CertificateEncodingException, PackageManager.NameNotFoundException, InterruptedException, ExecutionException {
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzfsu zza = zzfsu.zza();
            context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager.OnChecksumsReadyListener(zza) { // from class: com.google.android.gms.internal.ads.zzadb
                private final zzfsu zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = zza;
                }

                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list2) {
                    zzfsu zzfsuVar = this.zza;
                    if (list2 == null) {
                        zzfsuVar.zzp(null);
                        return;
                    }
                    try {
                        int size = list2.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksum = (ApkChecksum) list2.get(i);
                            if (apkChecksum.getType() == 8) {
                                zzfsuVar.zzp(zzabu.zzb(apkChecksum.getValue()));
                                return;
                            }
                        }
                        zzfsuVar.zzp(null);
                    } catch (Throwable unused) {
                        zzfsuVar.zzp(null);
                    }
                }
            });
            return (String) zza.get();
        }
        return null;
    }
}
