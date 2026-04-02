package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzezz;
import com.google.android.gms.internal.ads.zzflk;
import com.google.android.gms.internal.ads.zzfmg;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.5.0 */
/* loaded from: classes.dex */
public final class zzca {
    public static boolean zza(int i) {
        if (((Boolean) zzbet.zzc().zzc(zzbjl.zzbY)).booleanValue()) {
            return ((Boolean) zzbet.zzc().zzc(zzbjl.zzbZ)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:45|46|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
        com.google.android.gms.ads.internal.util.zze.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f A[Catch: JSONException -> 0x0174, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0174, blocks: (B:30:0x013b, B:47:0x0166, B:48:0x016a, B:49:0x016f), top: B:56:0x013b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0175 -> B:55:0x017a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzb(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzca.zzb(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfF)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof ScrollView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    r2 = true;
                }
                jSONObject.put("contained_in_scroll_view", r2);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                ViewParent parent2 = view.getParent();
                while (parent2 != null && !(parent2 instanceof AdapterView)) {
                    parent2 = parent2.getParent();
                }
                jSONObject.put("contained_in_scroll_view", (parent2 == null ? -1 : ((AdapterView) parent2).getPositionForView(view)) != -1);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            jSONObject.put("can_show_on_lock_screen", zzs.zzt(view));
            com.google.android.gms.ads.internal.zzt.zzc();
            jSONObject.put("is_keyguard_locked", zzs.zzG(context));
        } catch (JSONException unused) {
            zze.zzi("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry<String, WeakReference<View>> entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzg = zzg(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] zzg2 = zzg(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzber.zza().zza(context, view2.getMeasuredWidth()));
                        jSONObject5.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzber.zza().zza(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", zzber.zza().zza(context, zzg2[0] - zzg[0]));
                        jSONObject5.put("y", zzber.zza().zza(context, zzg2[1] - zzg[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put("frame", jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, 0);
                            jSONObject2.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, 0);
                            jSONObject2.put("x", zzber.zza().zza(context, zzg2[0] - zzg[0]));
                            jSONObject2.put("y", zzber.zza().zza(context, zzg2[1] - zzg[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put(ViewHierarchyConstants.TEXT_SIZE, textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                    } catch (JSONException unused) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused2) {
                    jSONObject = jSONObject3;
                }
                try {
                    jSONObject.put(entry.getKey(), jSONObject4);
                } catch (JSONException unused3) {
                    zze.zzi("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", zzber.zza().zza(context, point2.x));
                jSONObject3.put("y", zzber.zza().zza(context, point2.y));
                jSONObject3.put("start_x", zzber.zza().zza(context, point.x));
                jSONObject3.put("start_y", zzber.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                zze.zzg("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            zze.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] zzg = zzg(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(Context context, zzezz zzezzVar) {
        if (zzezzVar.zzJ) {
            if (((Boolean) zzbet.zzc().zzc(zzbjl.zzfG)).booleanValue()) {
                return ((Boolean) zzbet.zzc().zzc(zzbjl.zzfJ)).booleanValue();
            }
            String str = (String) zzbet.zzc().zzc(zzbjl.zzfH);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : zzfmg.zzb(zzflk.zzb(';')).zzd(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static WindowManager.LayoutParams zzj() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzbet.zzc().zzc(zzbjl.zzfI)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = 8388659;
        return layoutParams;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, zzber.zza().zza(context, rect.right - rect.left));
        jSONObject.put(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, zzber.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", zzber.zza().zza(context, rect.left));
        jSONObject.put("y", zzber.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}
