package androidx.glance.appwidget.action;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.s4.b;
import com.amazon.aps.iva.yb0.j;
import kotlin.Metadata;
/* compiled from: ActionTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "glance-appwidget_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        j.e(intent, "intent");
        b.c(this, intent);
    }
}
