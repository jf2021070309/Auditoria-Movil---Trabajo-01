package bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.bykvm_char12;

import android.text.TextUtils;
import bykvm_19do.bykvm_19do.bykvm_if122.bykvm_try19.f0;
import com.bytedance.msdk.adapter.pangle.PangleAdapterUtils;
import com.bytedance.msdk.adapter.util.Logger;
import com.bytedance.msdk.api.v2.GMAdConstant;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.AnalyticsEvents;
import com.kuaishou.weapon.p0.t;
import com.umeng.analytics.pro.bg;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class a {
    protected final Map<String, String> a = new HashMap();
    protected final f0 b;

    public a(String str) {
        this.b = f0.a(str, bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.d());
        b();
    }

    public static String a(int i) {
        switch (i) {
            case 1:
                return GMAdConstant.RIT_TYPE_BANNER;
            case 2:
                return GMAdConstant.RIT_TYPE_INTERSTITIAL;
            case 3:
            case 4:
                return GMAdConstant.RIT_TYPE_SPLASH;
            case 5:
                return AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_NATIVE;
            case 6:
            default:
                return null;
            case 7:
                return GMAdConstant.RIT_TYPE_REWARD_VIDEO;
            case 8:
                return "fullscreenVideo";
            case 9:
                return GMAdConstant.RIT_TYPE_DRAW;
            case 10:
                return "interstitialFull";
        }
    }

    private String a(int i, String str) {
        if (TextUtils.isEmpty(str) || i != 3) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        double[] dArr = new double[2];
        Iterator<Map.Entry<String, String>> it = a().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            if (next != null) {
                String value = next.getValue();
                if (!TextUtils.isEmpty(value) && value.contains(str)) {
                    String[] split = value.split("_");
                    String str2 = split[0];
                    String str3 = split[1];
                    String str4 = split[2];
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(System.currentTimeMillis() - Long.parseLong(str4))) {
                            dArr[0] = dArr[0] + 1.0d;
                            dArr[1] = dArr[1] + Double.parseDouble(str3);
                        } else {
                            it.remove();
                            this.b.f(next.getKey());
                            String str5 = "label_size_" + str;
                            f0 f0Var = this.b;
                            f0Var.b(str5, f0Var.b(str5) - 1);
                        }
                    }
                }
            }
        }
        return a(dArr);
    }

    private String a(String str, double d) {
        return str + "_" + d + "_" + System.currentTimeMillis();
    }

    private String a(String str, int i) {
        return "cpm_key_" + str + "_" + i;
    }

    private void a(int i, String str, double d) {
        synchronized (this) {
            String str2 = "label_size_" + str;
            int a = this.b.a(str2, 0) + 1;
            String a2 = a(str, a);
            String a3 = a(str, d);
            a(a2, i, a3);
            this.b.b(a2, a3);
            this.b.b(str2, a);
        }
    }

    private String b(int i, String str) {
        if (TextUtils.isEmpty(str) || i != 3) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        String d = this.b.d(str);
        if (TextUtils.isEmpty(d) || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(d)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        String[] split = d.split("_");
        String str2 = split[0];
        String str3 = split[1];
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(System.currentTimeMillis() - Long.parseLong(str3))) {
            return str2;
        }
        this.b.f(str);
        return AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    private void b(int i, String str, double d) {
        if (TextUtils.isEmpty(str) || i != 3) {
            return;
        }
        this.b.b(str, d + "_" + System.currentTimeMillis());
        a(str);
    }

    private String c(int i, String str) {
        if (TextUtils.isEmpty(str) || i != 3) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        String d = this.b.d(str);
        if (TextUtils.isEmpty(d) || AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(d)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        String[] split = d.split("_");
        String str2 = split[0];
        String str3 = split[1];
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        if (bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().a(System.currentTimeMillis() - Long.parseLong(str3))) {
            return str2;
        }
        this.b.f(str);
        return AppEventsConstants.EVENT_PARAM_VALUE_NO;
    }

    private void c(int i, String str, double d) {
        if (TextUtils.isEmpty(str) || i != 3) {
            return;
        }
        this.b.b(str, d + "_" + System.currentTimeMillis());
        a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public double a(int i, String str, int i2) {
        String b;
        if (i2 == 1) {
            b = a(i, str);
        } else if (i2 == 3) {
            b = c(i, str);
        } else if (i2 != 2) {
            return PangleAdapterUtils.CPM_DEFLAUT_VALUE;
        } else {
            b = b(i, str);
        }
        return BigDecimal.valueOf(Double.parseDouble(b)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public String a(double[] dArr) {
        return dArr[0] != PangleAdapterUtils.CPM_DEFLAUT_VALUE ? new BigDecimal(dArr[1] / dArr[0]).setScale(2, RoundingMode.HALF_UP).toString() : String.valueOf(-1.0d);
    }

    protected abstract Map<String, String> a();

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, String str, int i2, double d) {
        if (i2 == 1) {
            a(i, str, d);
        } else if (i2 == 3) {
            c(i, str, d);
        } else if (i2 == 2) {
            b(i, str, d);
        }
    }

    public void a(String str) {
        for (int b = this.b.b("label_size_" + str); b > 0; b--) {
            try {
                String a = a(str, b);
                this.b.f(a);
                a().remove(a);
            } catch (Throwable th) {
                Logger.e("CalculateLabelValueImpl", "clearFromSpByRit,ignore:" + th.toString());
            }
        }
    }

    protected abstract void a(String str, int i, String str2);

    protected abstract void a(String str, String str2);

    protected abstract boolean a(String str, JSONObject jSONObject, Map<String, Object> map);

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            sb.append(this.a.get(String.valueOf(c)));
        }
        return sb.toString();
    }

    protected void b() {
        boolean z;
        this.a.put(AppEventsConstants.EVENT_PARAM_VALUE_NO, "a");
        this.a.put("1", t.l);
        this.a.put("2", "c");
        this.a.put("3", t.t);
        this.a.put("4", "e");
        this.a.put("5", "f");
        this.a.put("6", "g");
        this.a.put("7", bg.aG);
        this.a.put("8", "i");
        this.a.put("9", "j");
        this.a.put(".", t.a);
        do {
            z = true;
            while (z) {
                z = true;
            }
        } while (!z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(String str, JSONObject jSONObject, Map<String, Object> map) {
        if (!bykvm_19do.bykvm_19do.bykvm_if122.bykvm_19do.a.f().b() || TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (a(str, jSONObject2, map == null ? new HashMap<>() : map)) {
            try {
                jSONObject.putOpt(TTDownloadField.TT_LABEL, jSONObject2);
                if (map == null || map.get("cost_time") == null) {
                    return;
                }
                jSONObject.put("uvalueExcTime", map.get("cost_time"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        Map<String, ?> b = this.b.b();
        if (b != null) {
            for (Map.Entry<String, ?> entry : b.entrySet()) {
                if (entry != null) {
                    a(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
        }
    }
}
