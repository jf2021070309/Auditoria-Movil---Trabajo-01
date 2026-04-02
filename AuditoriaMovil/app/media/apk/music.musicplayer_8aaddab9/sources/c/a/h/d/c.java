package c.a.h.d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import ch.qos.logback.core.CoreConstants;
import h.o.c.j;
/* loaded from: classes.dex */
public final class c extends a<Intent, ActivityResult> {
    @Override // c.a.h.d.a
    public Intent a(Context context, Intent intent) {
        Intent intent2 = intent;
        j.e(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j.e(intent2, "input");
        return intent2;
    }

    @Override // c.a.h.d.a
    public ActivityResult c(int i2, Intent intent) {
        return new ActivityResult(i2, intent);
    }
}
