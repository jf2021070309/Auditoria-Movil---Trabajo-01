package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.play_billing.zzb;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver b;
    public ResultReceiver c;
    public boolean d;
    public boolean e;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.e = true;
                    i2 = MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE;
                    i = i2;
                }
                i = 100;
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.b = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                i = 100;
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.c = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i2 = 101;
                i = i2;
            } else {
                i = 100;
                pendingIntent = null;
            }
            try {
                this.d = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                zzb.zzk("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.b;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.c;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a = a();
                        if (this.e) {
                            a.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        a.putExtra("RESPONSE_CODE", 6);
                        a.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a);
                    }
                }
                this.d = false;
                finish();
                return;
            }
        }
        zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.d = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.b = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.c = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.e = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || !this.d) {
            return;
        }
        Intent a = a();
        a.putExtra("RESPONSE_CODE", 1);
        a.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(a);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.c;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.d);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.e);
    }
}
