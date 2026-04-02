package bykvm_19do.bykvm_19do.bykvm_19do;

import android.content.Context;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.bg;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l2 extends e2 {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l2(Context context) {
        super(true, false);
        this.e = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bykvm_19do.bykvm_19do.bykvm_19do.e2
    public boolean a(JSONObject jSONObject) {
        String str;
        DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
        int i = displayMetrics.densityDpi;
        switch (i) {
            case 120:
                str = "ldpi";
                break;
            case 240:
                str = "hdpi";
                break;
            case 260:
            case 280:
            case 300:
            case 320:
                str = "xhdpi";
                break;
            case 340:
            case 360:
            case 400:
            case 420:
            case 440:
            case 480:
                str = "xxhdpi";
                break;
            case 560:
            case 640:
                str = "xxxhdpi";
                break;
            default:
                str = "mdpi";
                break;
        }
        jSONObject.put("density_dpi", i);
        jSONObject.put("display_density", str);
        jSONObject.put(bg.z, displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        return true;
    }
}
