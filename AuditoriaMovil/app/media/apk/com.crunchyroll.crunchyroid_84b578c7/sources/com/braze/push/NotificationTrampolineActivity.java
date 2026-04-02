package com.braze.push;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.aps.iva.yb0.j;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.push.BrazePushReceiver;
import com.braze.support.BrazeLogger;
import com.google.android.gms.cast.MediaError;
import kotlin.Metadata;
/* compiled from: NotificationTrampolineActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/braze/push/NotificationTrampolineActivity;", "Landroid/app/Activity;", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/amazon/aps/iva/kb0/q;", "onCreate", "onResume", "onPause", "<init>", "()V", "android-sdk-ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NotificationTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onCreate$1.INSTANCE, 2, (Object) null);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onPause$1.INSTANCE, 2, (Object) null);
        finish();
    }

    @Override // android.app.Activity
    public void onResume() {
        Intent intent;
        super.onResume();
        try {
            intent = getIntent();
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, NotificationTrampolineActivity$onResume$5.INSTANCE);
        }
        if (intent == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, NotificationTrampolineActivity$onResume$1.INSTANCE, 3, (Object) null);
            finish();
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, NotificationTrampolineActivity$onResume$2.INSTANCE, 3, (Object) null);
            finish();
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new NotificationTrampolineActivity$onResume$3(intent), 2, (Object) null);
        Intent intent2 = new Intent(action).setClass(this, BrazeNotificationUtils.getNotificationReceiverClass());
        j.e(intent2, "Intent(action).setClass(…otificationReceiverClass)");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent2.putExtras(extras);
        }
        if (Constants.isAmazonDevice()) {
            BrazePushReceiver.Companion.handleReceivedIntent$default(BrazePushReceiver.Companion, this, intent2, false, 4, null);
        } else {
            BrazePushReceiver.Companion.handleReceivedIntent(this, intent2, false);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, NotificationTrampolineActivity$onResume$6.INSTANCE, 2, (Object) null);
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf((int) MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN), null, new NotificationTrampolineActivity$onResume$7(this, null), 2, null);
    }
}
