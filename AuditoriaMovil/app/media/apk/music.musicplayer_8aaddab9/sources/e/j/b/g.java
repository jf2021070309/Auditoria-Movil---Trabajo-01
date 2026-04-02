package e.j.b;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes2.dex */
public class g implements f {
    public final SharedPreferences a;

    public g(Context context) {
        this.a = context.getSharedPreferences("com.zipoapps.blytics.properties.global", 0);
    }
}
