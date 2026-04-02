package com.google.android.gms.internal.cast_tv;

import android.os.RemoteException;
import android.text.TextUtils;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-cast-tv@@21.0.0 */
/* loaded from: classes3.dex */
public final class zzdu {
    public static void zza(c cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = cVar.keys();
        keys.getClass();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            if (!TextUtils.equals(str, "customData")) {
                if (cVar.isNull(str)) {
                    cVar.remove(str);
                } else {
                    Object opt = cVar.opt(str);
                    if (opt instanceof c) {
                        zza((c) opt);
                    } else if (opt instanceof a) {
                        try {
                            cVar.put(str, zzd((a) opt));
                        } catch (b unused) {
                        }
                    }
                }
            }
        }
    }

    public static void zzb(c cVar) {
        a optJSONArray;
        if (cVar == null) {
            return;
        }
        try {
            String optString = cVar.optString("atvCredentials", null);
            if (optString != null) {
                cVar.put("credentials", optString);
                cVar.remove("atvCredentials");
            }
            String optString2 = cVar.optString("atvCredentialsType", null);
            if (optString2 != null) {
                cVar.put("credentialsType", optString2);
                cVar.remove("atvCredentialsType");
            }
            zze(cVar.optJSONObject("media"));
            c optJSONObject = cVar.optJSONObject("queueData");
            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray(FirebaseAnalytics.Param.ITEMS)) != null) {
                for (int i = 0; i < optJSONArray.e(); i++) {
                    c j = optJSONArray.j(i);
                    if (j != null) {
                        zze(j.optJSONObject("media"));
                    }
                }
            }
        } catch (b unused) {
        }
    }

    public static void zzc(zzeq zzeqVar, int i) {
        if (zzeqVar == null) {
            return;
        }
        try {
            zzda zza = zzde.zza();
            zza.zza(i);
            zzeqVar.zze(new zzew((zzde) zza.zzi()));
        } catch (RemoteException unused) {
        }
    }

    private static a zzd(a aVar) {
        a aVar2 = new a();
        for (int i = 0; i < aVar.e(); i++) {
            if (!c.NULL.equals(aVar.f(i))) {
                Object f = aVar.f(i);
                if (f instanceof c) {
                    zza((c) f);
                } else if (f instanceof a) {
                    f = zzd((a) f);
                }
                aVar2.put(f);
            }
        }
        return aVar2;
    }

    private static void zze(c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            String optString = cVar.optString("atvEntity", null);
            if (optString != null) {
                cVar.put("entity", optString);
                cVar.remove("atvEntity");
            }
        } catch (b unused) {
        }
    }
}
