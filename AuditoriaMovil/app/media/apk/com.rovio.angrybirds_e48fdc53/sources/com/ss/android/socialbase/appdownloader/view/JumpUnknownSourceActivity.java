package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.ss.android.socialbase.appdownloader.g;
import com.ss.android.socialbase.appdownloader.ge;
import com.ss.android.socialbase.appdownloader.ll;
import com.ss.android.socialbase.appdownloader.o;
import com.ss.android.socialbase.appdownloader.o.t;
import com.ss.android.socialbase.appdownloader.o.yk;
import com.ss.android.socialbase.appdownloader.xu;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class JumpUnknownSourceActivity extends Activity {
    private t dr;
    private int g;
    private Intent ge;
    private Intent o;
    private JSONObject q;

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        xu.dr().dr(this);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        dr();
        xu.dr().dr(this);
    }

    private void dr() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        this.ge = intent;
        if (intent != null) {
            this.o = (Intent) intent.getParcelableExtra("intent");
            this.g = intent.getIntExtra("id", -1);
            try {
                this.q = new JSONObject(intent.getStringExtra("config"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.q == null) {
            o.dr((Activity) this);
            return;
        }
        ge();
        t tVar = this.dr;
        if (tVar != null && !tVar.ge()) {
            this.dr.dr();
        } else if (this.dr == null) {
            finish();
        }
    }

    private void ge() {
        if (this.dr != null || this.ge == null) {
            return;
        }
        try {
            com.ss.android.socialbase.appdownloader.o.o dr = g.wb().dr();
            yk ykVar = null;
            if (dr != null) {
                ykVar = dr.dr(this);
            }
            if (ykVar == null) {
                ykVar = new com.ss.android.socialbase.appdownloader.g.dr(this);
            }
            int dr2 = ll.dr(this, "tt_appdownloader_tip");
            int dr3 = ll.dr(this, "tt_appdownloader_label_ok");
            int dr4 = ll.dr(this, "tt_appdownloader_label_cancel");
            String optString = this.q.optString(DownloadSettingKeys.AhPlans.KEY_JUMP_UNKNOWN_SOURCE_TIPS);
            if (TextUtils.isEmpty(optString)) {
                optString = getString(ll.dr(this, "tt_appdownloader_jump_unknown_source_tips"));
            }
            ykVar.dr(dr2).dr(optString).dr(dr3, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                    if (ge.dr(jumpUnknownSourceActivity, jumpUnknownSourceActivity.o, JumpUnknownSourceActivity.this.g, JumpUnknownSourceActivity.this.q)) {
                        ge.o(JumpUnknownSourceActivity.this.g, JumpUnknownSourceActivity.this.q);
                    } else {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity2 = JumpUnknownSourceActivity.this;
                        ge.dr((Context) jumpUnknownSourceActivity2, jumpUnknownSourceActivity2.o, true);
                    }
                    ge.dr(JumpUnknownSourceActivity.this.g, JumpUnknownSourceActivity.this.q);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).ge(dr4, new DialogInterface.OnClickListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (JumpUnknownSourceActivity.this.o != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        ge.dr((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.o, true);
                    }
                    ge.ge(JumpUnknownSourceActivity.this.g, JumpUnknownSourceActivity.this.q);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).dr(new DialogInterface.OnCancelListener() { // from class: com.ss.android.socialbase.appdownloader.view.JumpUnknownSourceActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    if (JumpUnknownSourceActivity.this.o != null) {
                        JumpUnknownSourceActivity jumpUnknownSourceActivity = JumpUnknownSourceActivity.this;
                        ge.dr((Context) jumpUnknownSourceActivity, jumpUnknownSourceActivity.o, true);
                    }
                    ge.ge(JumpUnknownSourceActivity.this.g, JumpUnknownSourceActivity.this.q);
                    JumpUnknownSourceActivity.this.finish();
                }
            }).dr(false);
            this.dr = ykVar.dr();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
