package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes3.dex */
public final class zzak implements zzg {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String str, c cVar) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("clear")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return false;
            }
            a optJSONArray = cVar.optJSONArray("keys");
            if (optJSONArray != null && optJSONArray.e() != 0) {
                HashSet hashSet = new HashSet();
                int e = optJSONArray.e();
                for (int i = 0; i < e; i++) {
                    String l = optJSONArray.l(i);
                    if (!TextUtils.isEmpty(l)) {
                        hashSet.add(l);
                    }
                }
                zzca.zzb(this.zza, hashSet);
            } else {
                String valueOf = String.valueOf(cVar.toString());
                if (valueOf.length() != 0) {
                    "Action[clear]: wrong args.".concat(valueOf);
                }
            }
            return true;
        }
        zzbz zzbzVar = new zzbz(this.zza);
        Iterator<String> keys = cVar.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = cVar.opt(next);
            new StringBuilder(String.valueOf(next).length() + 23 + String.valueOf(opt).length());
            if (zzbzVar.zzc(next, opt)) {
                this.zzb.zzc().add(next);
            } else {
                String valueOf2 = String.valueOf(next);
                if (valueOf2.length() != 0) {
                    "Failed writing key: ".concat(valueOf2);
                }
            }
        }
        this.zzb.zze();
        zzbzVar.zzb();
        return true;
    }
}
