package com.ss.android.downloadlib.addownload.compliance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.R;
import java.util.List;
/* loaded from: classes3.dex */
public class AppDetailInfoActivity extends Activity {
    private long bn;
    private ImageView dr;
    private RecyclerView g;
    private TextView ge;
    private LinearLayout o;
    private long q;
    private List<Pair<String, String>> rb;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ttdownloader_activity_app_detail_info);
        if (dr()) {
            ge();
        } else {
            com.ss.android.socialbase.appdownloader.o.dr((Activity) this);
        }
    }

    public static void dr(Activity activity, long j) {
        Intent intent = new Intent(activity, AppDetailInfoActivity.class);
        intent.putExtra("app_info_id", j);
        activity.startActivity(intent);
    }

    private boolean dr() {
        this.q = getIntent().getLongExtra("app_info_id", 0L);
        com.ss.android.downloadlib.addownload.ge.ge dr2 = o.dr().dr(this.q);
        if (dr2 == null) {
            return false;
        }
        this.bn = dr2.ge;
        this.rb = dr2.xu;
        return true;
    }

    private void ge() {
        this.dr = (ImageView) findViewById(R.id.iv_detail_back);
        this.ge = (TextView) findViewById(R.id.tv_empty);
        this.g = (RecyclerView) findViewById(R.id.permission_list);
        this.o = (LinearLayout) findViewById(R.id.ll_download);
        if (this.rb.isEmpty()) {
            this.g.setVisibility(8);
            this.ge.setVisibility(0);
        } else {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(1);
            this.g.setLayoutManager(linearLayoutManager);
            this.g.setAdapter(new dr());
        }
        this.dr.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                q.dr("lp_app_detail_click_close", AppDetailInfoActivity.this.bn);
                AppDetailInfoActivity.this.finish();
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.compliance.AppDetailInfoActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                q.dr("lp_app_detail_click_download", AppDetailInfoActivity.this.bn);
                ge.dr().ge(AppDetailInfoActivity.this.bn);
                com.ss.android.socialbase.appdownloader.o.dr((Activity) AppDetailInfoActivity.this);
                com.ss.android.socialbase.appdownloader.o.dr(ge.dr().ge());
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        q.dr("lp_app_detail_click_close", this.bn);
        super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class dr extends RecyclerView.Adapter<Object> {
        private dr() {
        }
    }
}
