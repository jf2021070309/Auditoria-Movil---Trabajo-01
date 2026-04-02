package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.R;
import com.ss.android.downloadlib.addownload.compliance.g;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.downloadlib.guide.install.ClipImageView;
import com.ss.android.downloadlib.rb.yk;
/* loaded from: classes3.dex */
public class dr extends Dialog {
    private TextView bn;
    private TextView dr;
    private TextView g;
    private TextView ge;
    private Activity ll;
    private TextView o;
    private TextView q;
    private ClipImageView rb;
    private long t;
    private final long wb;
    private LinearLayout xu;
    private final com.ss.android.downloadlib.addownload.ge.ge yk;

    public dr(Activity activity, long j) {
        super(activity);
        this.ll = activity;
        this.wb = j;
        this.yk = (com.ss.android.downloadlib.addownload.ge.ge) o.dr().get(Long.valueOf(j));
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.yk == null) {
            dismiss();
            return;
        }
        requestWindowFeature(1);
        setContentView(R.layout.ttdownloader_dialog_appinfo);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.drawable.ttdownloader_bg_transparent);
        }
        setCancelable(true);
        setCanceledOnTouchOutside(true);
        this.t = this.yk.ge;
        dr();
        q.ge("lp_app_dialog_show", this.t);
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.1
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                q.dr("lp_app_dialog_cancel", dr.this.t);
            }
        });
    }

    private void dr() {
        this.dr = (TextView) findViewById(R.id.tv_app_name);
        this.ge = (TextView) findViewById(R.id.tv_app_version);
        this.o = (TextView) findViewById(R.id.tv_app_developer);
        this.g = (TextView) findViewById(R.id.tv_app_detail);
        this.q = (TextView) findViewById(R.id.tv_app_privacy);
        this.bn = (TextView) findViewById(R.id.tv_give_up);
        this.rb = (ClipImageView) findViewById(R.id.iv_app_icon);
        this.xu = (LinearLayout) findViewById(R.id.ll_download);
        this.dr.setText(yk.dr(this.yk.q, "--"));
        TextView textView = this.ge;
        textView.setText("版本号：" + yk.dr(this.yk.bn, "--"));
        TextView textView2 = this.o;
        textView2.setText("开发者：" + yk.dr(this.yk.rb, "应用信息正在完善中"));
        this.rb.setRoundRadius(yk.dr(wb.getContext(), 8.0f));
        this.rb.setBackgroundColor(Color.parseColor("#EBEBEB"));
        g.dr().dr(this.wb, new g.dr() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.2
            @Override // com.ss.android.downloadlib.addownload.compliance.g.dr
            public void dr(Bitmap bitmap) {
                if (bitmap != null) {
                    dr.this.rb.setImageBitmap(bitmap);
                } else {
                    q.dr(8, dr.this.t);
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ge.dr().dr(dr.this.ll);
                AppDetailInfoActivity.dr(dr.this.ll, dr.this.wb);
                q.dr("lp_app_dialog_click_detail", dr.this.t);
            }
        });
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ge.dr().dr(dr.this.ll);
                AppPrivacyPolicyActivity.dr(dr.this.ll, dr.this.wb);
                q.dr("lp_app_dialog_click_privacy", dr.this.t);
            }
        });
        this.bn.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dr.this.dismiss();
                q.dr("lp_app_dialog_click_giveup", dr.this.t);
            }
        });
        this.xu.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.dr.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                q.dr("lp_app_dialog_click_download", dr.this.t);
                ge.dr().ge(dr.this.t);
                dr.this.dismiss();
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        com.ss.android.socialbase.appdownloader.o.dr(this.ll);
    }
}
