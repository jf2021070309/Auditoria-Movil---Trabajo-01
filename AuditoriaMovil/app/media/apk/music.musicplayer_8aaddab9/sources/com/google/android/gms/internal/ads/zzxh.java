package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;
/* loaded from: classes.dex */
public class zzxh extends zzwc<String> {
    private final Object zza;
    private final zzwh<String> zzb;

    public zzxh(int i2, String str, zzwh<String> zzwhVar, zzwg zzwgVar) {
        super(i2, str, zzwgVar);
        this.zza = new Object();
        this.zzb = zzwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    public final zzwi<String> zzs(zzvy zzvyVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzvyVar.zzb;
            Map<String, String> map = zzvyVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i2 = 1;
                while (true) {
                    if (i2 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i2].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i2++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzvyVar.zzb);
        }
        return zzwi.zza(str, zzwz.zza(zzvyVar));
    }

    @Override // com.google.android.gms.internal.ads.zzwc
    /* renamed from: zzz */
    public void zzt(String str) {
        zzwh<String> zzwhVar;
        synchronized (this.zza) {
            zzwhVar = this.zzb;
        }
        zzwhVar.zza(str);
    }
}
