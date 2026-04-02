package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.vungle.warren.model.CookieDBAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public final class zzcss implements zzcsc {
    private final CookieManager zza;

    public zzcss(Context context) {
        this.zza = com.google.android.gms.ads.internal.zzt.zze().zzk(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcsc
    public final void zza(Map<String, String> map) {
        if (this.zza == null) {
            return;
        }
        if (map.get("clear") == null) {
            String str = map.get(CookieDBAdapter.CookieColumns.TABLE_NAME);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.zza.setCookie((String) zzbet.zzc().zzc(zzbjl.zzaz), str);
            return;
        }
        String str2 = (String) zzbet.zzc().zzc(zzbjl.zzaz);
        String cookie = this.zza.getCookie(str2);
        if (cookie == null) {
            return;
        }
        List<String> zzf = zzfmg.zzb(zzflk.zzb(';')).zzf(cookie);
        for (int i = 0; i < zzf.size(); i++) {
            CookieManager cookieManager = this.zza;
            Iterator<String> it = zzfmg.zzb(zzflk.zzb('=')).zzd(zzf.get(i)).iterator();
            if (it == null) {
                throw null;
            }
            if (!it.hasNext()) {
                StringBuilder sb = new StringBuilder(91);
                sb.append("position (0) must be less than the number of elements that remained (");
                sb.append(0);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            String valueOf = String.valueOf(it.next());
            String valueOf2 = String.valueOf((String) zzbet.zzc().zzc(zzbjl.zzaq));
            cookieManager.setCookie(str2, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }
}
