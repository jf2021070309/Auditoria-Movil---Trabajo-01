package com.kwad.components.ad.reward.m;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kwad.components.ad.reward.model.AdLiveEndResultData;
import com.kwad.sdk.R;
import com.kwad.sdk.core.imageloader.KSImageLoader;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
/* loaded from: classes.dex */
public final class p extends s implements View.OnClickListener {
    private ImageView Al;
    private TextView Am;
    private TextView An;
    private TextView Ao;
    private TextView Ap;
    private TextView Aq;
    private TextView Ar;
    private TextView As;
    private com.kwad.components.ad.reward.j qB;

    public p(com.kwad.components.ad.reward.j jVar) {
        this.qB = jVar;
    }

    private void b(AdTemplate adTemplate) {
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(adTemplate);
        KSImageLoader.loadCircleIcon(this.Al, com.kwad.sdk.core.response.b.a.bQ(ck), this.Al.getResources().getDrawable(R.drawable.ksad_ic_default_user_avatar));
        this.Am.setText(com.kwad.sdk.core.response.b.a.bO(ck));
    }

    private void initView() {
        if (this.sA == null) {
            return;
        }
        this.Al = (ImageView) this.sA.findViewById(R.id.ksad_live_end_page_author_icon);
        this.Am = (TextView) this.sA.findViewById(R.id.ksad_author_name_txt);
        this.An = (TextView) this.sA.findViewById(R.id.ksad_live_end_detail_watch_person_count);
        this.Ao = (TextView) this.sA.findViewById(R.id.ksad_live_end_detail_like_person_count);
        this.Ap = (TextView) this.sA.findViewById(R.id.ksad_live_end_detail_watch_time);
        this.Aq = (TextView) this.sA.findViewById(R.id.ksad_live_end_bottom_title);
        this.Ar = (TextView) this.sA.findViewById(R.id.ksad_live_end_bottom_action_btn);
        this.As = (TextView) this.sA.findViewById(R.id.ksad_live_end_bottom_des_btn);
        this.Ar.setOnClickListener(this);
        this.As.setOnClickListener(this);
    }

    private static String l(long j) {
        long j2 = j / 3600000;
        long j3 = (j / 60000) - (j2 * 60);
        long j4 = ((j / 1000) - (60 * j3)) - (3600 * j2);
        return j2 > 0 ? String.format("%02d:%02d:%02d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4)) : String.format("%02d:%02d", Long.valueOf(j3), Long.valueOf(j4));
    }

    public final void U(int i) {
        if (this.Aq == null || i <= 0) {
            return;
        }
        if (!this.qB.pn) {
            this.Aq.setText("已获得奖励");
            return;
        }
        String format = String.format("再停留%s秒，即可获得奖励", Integer.valueOf(i));
        SpannableString spannableString = new SpannableString(format);
        int color = gS().getResources().getColor(R.color.ksad_reward_main_color);
        spannableString.setSpan(new ForegroundColorSpan(color), "再停留%s秒，即可获得奖励".indexOf("再停留") + 3, "再停留%s秒，即可获得奖励".indexOf("秒") + 1, 18);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int length = format.length();
        spannableString.setSpan(foregroundColorSpan, length - 2, length, 18);
        this.Aq.setText(spannableString);
    }

    public final void a(com.kwad.components.ad.reward.j jVar, AdLiveEndResultData.AdLivePushEndInfo adLivePushEndInfo, long j) {
        this.Ao.setText(adLivePushEndInfo.mDisplayLikeUserCount);
        this.Ap.setText(l(adLivePushEndInfo.mLiveDuration));
        this.An.setText(adLivePushEndInfo.mDisplayWatchingUserCount);
        if (!jVar.pn) {
            this.Aq.setText("内容很精彩，不要错过哦");
            return;
        }
        String format = String.format("再停留%s秒，即可获得奖励", Integer.valueOf((int) (Math.max(com.kwad.sdk.core.response.b.a.Y(com.kwad.sdk.core.response.b.d.ck(jVar.mAdTemplate)) - j, 0L) / 1000)));
        SpannableString spannableString = new SpannableString(format);
        int color = gS().getResources().getColor(R.color.ksad_reward_main_color);
        spannableString.setSpan(new ForegroundColorSpan(color), "再停留%s秒，即可获得奖励".indexOf("再停留") + 3, "再停留%s秒，即可获得奖励".indexOf("秒") + 1, 18);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
        int length = format.length();
        spannableString.setSpan(foregroundColorSpan, length - 2, length, 18);
        this.Aq.setText(spannableString);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.kwad.components.ad.reward.m.d
    public final void a(r rVar) {
        super.a(rVar);
        b(rVar.getAdTemplate());
    }

    public final void h(ViewGroup viewGroup) {
        super.a(viewGroup, R.id.ksad_reward_origin_live_end_page_stub, R.id.ksad_live_end_page_layout_root);
        initView();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.kwad.sdk.core.report.j jVar = new com.kwad.sdk.core.report.j();
        jVar.cm(24);
        if (view.equals(this.Ar)) {
            this.qB.a(2, view.getContext(), 38, 1, 0L, false, jVar);
        } else if (view.equals(this.As)) {
            this.qB.a(2, view.getContext(), 37, 1, 0L, false, jVar);
        }
    }
}
