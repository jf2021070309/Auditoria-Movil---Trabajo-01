package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes2.dex */
public class zzxh extends zzwc<String> {
    private final Object zza;
    private final zzwh<String> zzb;

    public zzxh(int i, String str, zzwh<String> zzwhVar, zzwg zzwgVar) {
        super(i, str, zzwgVar);
        this.zza = new Object();
        this.zzb = zzwhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzvyVar.zzb);
        }
        return zzwi.zza(str, zzwz.zza(zzvyVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
