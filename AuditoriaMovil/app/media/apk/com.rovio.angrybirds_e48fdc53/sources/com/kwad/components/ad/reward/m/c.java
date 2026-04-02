package com.kwad.components.ad.reward.m;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.widget.KsAppTagsView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.widget.KSRatingBar;
import java.util.List;
/* loaded from: classes.dex */
public final class c extends com.kwad.sdk.core.download.a.a implements com.kwad.sdk.widget.c {
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private KSRatingBar yA;
    private KsAppTagsView yB;
    private a yC;
    private volatile boolean yD = false;
    private com.kwad.components.ad.i.a yE;
    private Runnable yF;
    private View ys;
    private View yt;
    private Button yu;
    private Button yv;
    private TextView yw;
    private ImageView yx;
    private TextView yy;
    private TextView yz;

    /* loaded from: classes.dex */
    public interface a {
        void c(boolean z, int i);
    }

    /* loaded from: classes.dex */
    static class b {
        private String appName;
        private String qp;
        private String qq;
        private float yH;
        private List<String> yI;
        private int yJ = 15;
        private String yK;

        b() {
        }

        public static b C(AdTemplate adTemplate) {
            String str;
            if (adTemplate == null) {
                return null;
            }
            AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
            b bVar = new b();
            bVar.appName = com.kwad.sdk.core.response.b.d.u(adTemplate) ? com.kwad.sdk.core.response.b.a.ap(ck) : com.kwad.sdk.core.response.b.a.ao(ck);
            bVar.yH = com.kwad.sdk.core.response.b.a.au(ck);
            bVar.qq = com.kwad.sdk.core.response.b.a.an(ck);
            bVar.qp = com.kwad.sdk.core.response.b.d.u(adTemplate) ? com.kwad.sdk.core.response.b.a.ct(ck) : com.kwad.sdk.core.response.b.a.bQ(ck);
            if (com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.d.ck(adTemplate)))) {
                bVar.yJ = com.kwad.components.ad.reward.a.b.gG();
                str = "安装并体验%s秒  可领取奖励";
            } else {
                bVar.yJ = com.kwad.sdk.core.config.d.zB();
                str = "浏览详情页%s秒，领取奖励";
            }
            bVar.yK = str;
            bVar.yI = com.kwad.sdk.core.response.b.c.cb(adTemplate);
            return bVar;
        }

        public final String jY() {
            return String.format(this.yK, Integer.valueOf(this.yJ));
        }
    }

    public c(View view) {
        this.ys = view;
        initView();
        this.yE = new com.kwad.components.ad.i.a(view);
    }

    private void c(View view, boolean z) {
        int id = view.getId();
        if (id == R.id.ksad_reward_apk_info_install_container || id == R.id.ksad_reward_apk_info_install_action || id == R.id.ksad_reward_apk_info_install_start) {
            com.kwad.sdk.core.e.c.d("ApkInfoCardViewHelper", "onClick install");
            this.yD = true;
            a aVar = this.yC;
            if (aVar != null) {
                aVar.c(z, 1);
            }
        }
    }

    private void initView() {
        this.yu = (Button) this.ys.findViewById(R.id.ksad_reward_apk_info_install_action);
        this.yv = (Button) this.ys.findViewById(R.id.ksad_reward_apk_info_install_start);
        this.yt = this.ys.findViewById(R.id.ksad_reward_apk_info_install_container);
        this.yx = (ImageView) this.ys.findViewById(R.id.ksad_reward_apk_info_icon);
        this.yw = (TextView) this.ys.findViewById(R.id.ksad_reward_apk_info_name);
        this.yy = (TextView) this.ys.findViewById(R.id.ksad_reward_apk_info_desc);
        this.yA = (KSRatingBar) this.ys.findViewById(R.id.ksad_reward_apk_info_score);
        this.yB = (KsAppTagsView) this.ys.findViewById(R.id.ksad_reward_apk_info_tags);
    }

    @Override // com.kwad.sdk.widget.c
    public final void a(View view) {
        c(view, true);
    }

    public final void a(a aVar) {
        this.yC = aVar;
    }

    public final void a(com.kwad.components.core.e.d.c cVar) {
        this.mApkDownloadHelper = cVar;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    @Override // com.kwad.sdk.widget.c
    public final void b(View view) {
        if (com.kwad.sdk.core.response.b.c.bZ(this.mAdTemplate)) {
            c(view, false);
        }
    }

    public final void c(AdTemplate adTemplate, boolean z) {
        this.mAdTemplate = adTemplate;
        b C = b.C(adTemplate);
        if (C == null) {
            return;
        }
        KSImageLoader.loadAppIcon(this.yx, C.qp, adTemplate, 12);
        this.yw.setText(C.appName);
        this.yy.setText(C.qq);
        this.yA.setStar(C.yH);
        if (com.kwad.sdk.core.response.b.d.f(adTemplate, com.kwad.components.ad.reward.a.b.k(com.kwad.sdk.core.response.b.d.ck(adTemplate)))) {
            this.yv.setText(com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate)));
            this.yA.setVisibility(0);
        } else {
            this.yv.setText("查看详情");
            this.yA.setVisibility(8);
        }
        this.yu.setText(C.jY());
        this.yu.setClickable(true);
        this.yv.setClickable(true);
        this.yt.setClickable(true);
        new com.kwad.sdk.widget.f(this.yu, this);
        new com.kwad.sdk.widget.f(this.yv, this);
        new com.kwad.sdk.widget.f(this.yt, this);
        List<String> list = C.yI;
        if (z && list.size() == 0) {
            this.yy.setVisibility(8);
            TextView textView = (TextView) this.ys.findViewById(R.id.ksad_reward_apk_info_desc_2);
            this.yz = textView;
            textView.setVisibility(0);
            this.yz.setText(C.qq);
        }
        if (list.size() == 0) {
            this.yB.setVisibility(8);
        }
        this.yB.setAppTags(list);
        if (this.yF == null) {
            this.yF = new Runnable() { // from class: com.kwad.components.ad.reward.m.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    int height = c.this.yt.getHeight();
                    com.kwad.sdk.core.e.c.d("ApkInfoCardViewHelper", hashCode() + " parentHeight: " + height);
                    if (c.this.yD) {
                        return;
                    }
                    c.this.yE.ic();
                }
            };
        }
        this.yt.postDelayed(this.yF, 1600L);
    }

    public final void i(String str, int i) {
        Button button = this.yv;
        if (button == null || str == null || i == 0) {
            return;
        }
        button.setText(str);
    }

    public final void jW() {
        Runnable runnable;
        com.kwad.components.core.e.d.c cVar = this.mApkDownloadHelper;
        if (cVar != null) {
            cVar.c(this);
        }
        com.kwad.components.ad.i.a aVar = this.yE;
        if (aVar != null) {
            aVar.jW();
        }
        View view = this.yt;
        if (view == null || (runnable = this.yF) == null) {
            return;
        }
        view.removeCallbacks(runnable);
        this.yF = null;
    }

    public final void jX() {
        this.yE.lS();
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFailed() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yv.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即下载");
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadFinished() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yv.setText(adTemplate == null ? "" : com.kwad.sdk.core.response.b.a.aQ(adTemplate));
    }

    @Override // com.kwad.sdk.core.download.a.a, com.kwad.sdk.api.KsAppDownloadListener
    public final void onDownloadStarted() {
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onIdle() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yv.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.aw(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即下载");
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onInstalled() {
        AdTemplate adTemplate = this.mAdTemplate;
        this.yv.setText(adTemplate != null ? com.kwad.sdk.core.response.b.a.U(com.kwad.sdk.core.response.b.d.ck(adTemplate)) : "立即打开");
    }

    @Override // com.kwad.sdk.core.download.a.a
    public final void onPaused(int i) {
        super.onPaused(i);
        if (i != 0) {
            this.yE.lS();
            this.yv.setText(com.kwad.sdk.core.response.b.a.cw(i));
        }
    }

    @Override // com.kwad.sdk.api.KsAppDownloadListener
    public final void onProgressUpdate(int i) {
        if (i != 0) {
            this.yE.lS();
            this.yv.setText(com.kwad.sdk.core.response.b.a.cv(i));
        }
    }
}
