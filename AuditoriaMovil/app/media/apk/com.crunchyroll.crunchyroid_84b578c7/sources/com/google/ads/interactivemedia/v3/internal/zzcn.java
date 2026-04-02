package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.amazon.aps.iva.if0.a;
import com.amazon.aps.iva.if0.b;
import com.amazon.aps.iva.if0.c;
/* compiled from: com.google.ads.interactivemedia.v3:interactivemedia@@3.30.3 */
/* loaded from: classes2.dex */
public final class zzcn {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static c zza(int i, int i2, int i3, int i4) {
        c cVar = new c();
        try {
            cVar.put("x", i / zza);
            cVar.put("y", i2 / zza);
            cVar.put("width", i3 / zza);
            cVar.put("height", i4 / zza);
        } catch (b e) {
            zzco.zza("Error with creating viewStateObject", e);
        }
        return cVar;
    }

    public static void zzb(c cVar, String str) {
        try {
            cVar.put("adSessionId", str);
        } catch (b e) {
            zzco.zza("Error with setting ad session id", e);
        }
    }

    public static void zzc(c cVar, c cVar2) {
        try {
            a optJSONArray = cVar.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new a();
                cVar.put("childViews", optJSONArray);
            }
            optJSONArray.put(cVar2);
        } catch (b e) {
            e.printStackTrace();
        }
    }

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(c cVar, String str, Object obj) {
        try {
            cVar.put(str, obj);
        } catch (b | NullPointerException e) {
            zzco.zza("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void zzf(c cVar) {
        float f;
        float f2;
        Point point;
        if (zzb != null) {
            zzb.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f3 = zza;
            f = point.x / f3;
            f2 = point.y / f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            cVar.put("width", f);
            cVar.put("height", f2);
        } catch (b e) {
            e.printStackTrace();
        }
    }

    public static boolean zzg(c cVar, c cVar2) {
        if (cVar == null && cVar2 == null) {
            return true;
        }
        if (cVar != null && cVar2 != null) {
            String[] strArr = zzc;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (cVar.optDouble(str) != cVar2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (cVar.optString("adSessionId", "").equals(cVar2.optString("adSessionId", "")) && Boolean.valueOf(cVar.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(cVar2.optBoolean("hasWindowFocus")))) {
                    a optJSONArray = cVar.optJSONArray("isFriendlyObstructionFor");
                    a optJSONArray2 = cVar2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i2 = 0; i2 < optJSONArray.e(); i2++) {
                                if (!optJSONArray.n(i2).equals(optJSONArray2.n(i2))) {
                                    break;
                                }
                            }
                        }
                    }
                    a optJSONArray3 = cVar.optJSONArray("childViews");
                    a optJSONArray4 = cVar2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i3 = 0; i3 < optJSONArray3.e(); i3++) {
                                if (zzg(optJSONArray3.j(i3), optJSONArray4.j(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(a aVar, a aVar2) {
        if (aVar == null && aVar2 == null) {
            return true;
        }
        if (aVar != null && aVar2 != null && aVar.e() == aVar2.e()) {
            return true;
        }
        return false;
    }
}
