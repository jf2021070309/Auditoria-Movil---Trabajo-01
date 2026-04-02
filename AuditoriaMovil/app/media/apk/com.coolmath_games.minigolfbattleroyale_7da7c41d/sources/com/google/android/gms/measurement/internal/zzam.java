package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
/* loaded from: classes2.dex */
public final class zzam extends zzgo {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzfu zzfuVar) {
        super(zzfuVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    protected final boolean zza() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.zzb = sb.toString();
        return false;
    }

    public final long zzb() {
        zzv();
        return this.zza;
    }

    public final String zzc() {
        zzv();
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long zzd() {
        zzg();
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zze() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzf() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzs.zzay().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (ContextCompat.checkSelfPermission(this.zzs.zzax(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzs.zzau().zzf().zza("Permission error checking for dasher/unicorn accounts");
                this.zze = currentTimeMillis;
                this.zzd = false;
                return false;
            }
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzs.zzax());
            }
            try {
                result = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                this.zzs.zzau().zzc().zzb("Exception checking account types", e);
            }
            if (result == null || result.length <= 0) {
                Account[] result2 = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.zzd = true;
                    this.zze = currentTimeMillis;
                    return true;
                }
                this.zze = currentTimeMillis;
                this.zzd = false;
                return false;
            }
            this.zzd = true;
            this.zze = currentTimeMillis;
            return true;
        }
        return bool.booleanValue();
    }
}
