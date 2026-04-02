package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzeos implements zzery<zzeoq> {
    private final Context zza;
    private final zzfsn zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeos(Context context, zzfsn zzfsnVar) {
        this.zza = context;
        this.zzb = zzfsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzery
    public final zzfsm<zzeoq> zza() {
        return this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeop
            private final zzeos zza;

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
    public final /* synthetic */ zzeoq zzb() throws Exception {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = !((Boolean) zzbet.zzc().zzc(zzbjl.zzeq)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) zzbet.zzc().zzc(zzbjl.zzes)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzer)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzeoq(string, string2, bundle, null);
    }
}
