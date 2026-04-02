package com.bytedance.msdk.core.admanager.reward.rewardagain;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ad.sdk.ad_mediation_sdk.R;
import com.bytedance.msdk.adapter.util.DownloadImageTask;
/* loaded from: classes.dex */
public class GMRewardAgainDialogActivity extends Activity {

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GMRewardAgainDialogActivity.this.finish();
            Runnable runnable = c.e().b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            GMRewardAgainDialogActivity.this.finish();
            Runnable runnable = c.e().c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.reward_again_dialog);
        ImageView imageView = (ImageView) findViewById(R.id.ra_pic);
        TextView textView = (TextView) findViewById(R.id.ra_title);
        TextView textView2 = (TextView) findViewById(R.id.ra_btn_ok);
        TextView textView3 = (TextView) findViewById(R.id.ra_btn_cancel);
        com.bytedance.msdk.core.admanager.reward.rewardagain.b bVar = c.e().a;
        if (bVar != null) {
            textView.setText(bVar.e());
            textView2.setText(bVar.b());
            textView3.setText(bVar.a());
            if (!TextUtils.isEmpty(bVar.c())) {
                new DownloadImageTask(imageView).execute(bVar.c());
            }
        }
        textView2.setOnClickListener(new a());
        textView3.setOnClickListener(new b());
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
