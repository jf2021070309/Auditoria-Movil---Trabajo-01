package c.c0.d0.p.c;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import c.c0.r;
/* loaded from: classes.dex */
public class a {
    public static final String a = r.e("SystemJobInfoConverter");

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f1444b;

    public a(Context context) {
        this.f1444b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
