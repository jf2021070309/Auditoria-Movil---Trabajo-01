package c.c0.d0.p.b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import c.c0.r;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements c.c0.d0.b {
    public static final String a = r.e("CommandHandler");

    /* renamed from: b  reason: collision with root package name */
    public final Context f1415b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, c.c0.d0.b> f1416c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f1417d = new Object();

    public b(Context context) {
        this.f1415b = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // c.c0.d0.b
    public void d(String str, boolean z) {
        synchronized (this.f1417d) {
            c.c0.d0.b remove = this.f1416c.remove(str);
            if (remove != null) {
                remove.d(str, z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.content.Intent r11, int r12, c.c0.d0.p.b.e r13) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c0.d0.p.b.b.e(android.content.Intent, int, c.c0.d0.p.b.e):void");
    }
}
