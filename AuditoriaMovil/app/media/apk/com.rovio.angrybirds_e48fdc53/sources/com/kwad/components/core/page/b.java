package com.kwad.components.core.page;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kwad.components.core.page.recycle.DetailWebRecycleView;
import com.kwad.components.core.page.recycle.e;
import com.kwad.components.core.widget.FeedVideoView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.m.l;
import com.kwad.sdk.mvp.Presenter;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class b extends com.kwad.components.core.page.recycle.a {
    private LinearLayout MA;
    private TextView MB;
    private ImageView MC;
    private WebView My;
    private FeedVideoView Mz;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;

    /* loaded from: classes.dex */
    static class a extends com.kwad.components.core.page.recycle.d {
        e MF;
        AdTemplate mAdTemplate;
        private Context mContext;

        a(AdTemplate adTemplate, Context context, e eVar) {
            this.mAdTemplate = adTemplate;
            this.mContext = context;
            this.MF = eVar;
        }

        @Override // com.kwad.components.core.page.recycle.d, android.support.v7.widget.RecyclerView.Adapter
        /* renamed from: a */
        public final void onBindViewHolder(com.kwad.components.core.page.recycle.c cVar, int i) {
            super.onBindViewHolder(cVar, i);
        }

        @Override // com.kwad.components.core.page.recycle.d
        public final com.kwad.components.core.page.recycle.c b(ViewGroup viewGroup, int i) {
            if (i == 1) {
                View a = l.a(this.mContext, R.layout.ksad_datail_webview_container, viewGroup, false);
                Presenter presenter = new Presenter();
                presenter.a(new com.kwad.components.core.page.b.b());
                return new com.kwad.components.core.page.recycle.c(a, presenter, this.MF);
            } else if (i != 0) {
                View view = new View(viewGroup.getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, com.kwad.sdk.d.a.a.a(viewGroup.getContext(), 64.0f)));
                return new com.kwad.components.core.page.recycle.c(view, new Presenter(), this.MF);
            } else {
                FeedVideoView feedVideoView = new FeedVideoView(viewGroup.getContext());
                Presenter presenter2 = new Presenter();
                presenter2.a(new com.kwad.components.core.page.b.a());
                return new com.kwad.components.core.page.recycle.c(feedVideoView, presenter2, this.MF);
            }
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return com.kwad.sdk.core.response.b.a.ax(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate)) ? 3 : 2;
        }

        @Override // android.support.v7.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return i;
        }
    }

    public static b U(AdTemplate adTemplate) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putString("key_photo", adTemplate.toJson().toString());
        bundle.putBoolean("key_report", adTemplate.mPvReported);
        bVar.setArguments(bundle);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(View view) {
        this.MA = (LinearLayout) view.findViewById(R.id.ksad_web_tip_bar);
        this.MB = (TextView) view.findViewById(R.id.ksad_web_tip_bar_textview);
        ImageView imageView = (ImageView) view.findViewById(R.id.ksad_web_tip_close_btn);
        this.MC = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                b.this.MA.setVisibility(8);
            }
        });
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        boolean bn = com.kwad.sdk.core.response.b.a.bn(ck);
        String bj = com.kwad.sdk.core.response.b.a.bj(ck);
        if (!bn) {
            this.MA.setVisibility(8);
            return;
        }
        this.MA.setVisibility(0);
        this.MB.setText(bj);
        this.MB.setSelected(true);
    }

    @Override // com.kwad.components.core.page.recycle.a
    public final com.kwad.components.core.page.recycle.d a(RecyclerView recyclerView) {
        return new a(this.mAdTemplate, recyclerView.getContext(), new e(this.mAdTemplate, this.mApkDownloadHelper, recyclerView));
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.l.a.b
    public final boolean bQ() {
        WebView webView = this.My;
        if (webView != null && webView.canGoBack()) {
            this.My.goBack();
            return true;
        }
        FeedVideoView feedVideoView = this.Mz;
        if (feedVideoView != null) {
            return feedVideoView.sv();
        }
        return false;
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String string = getArguments().getString("key_photo");
        AdTemplate adTemplate = new AdTemplate();
        if (string != null) {
            try {
                adTemplate.parseJson(new JSONObject(string));
            } catch (JSONException e) {
                com.kwad.sdk.core.e.c.printStackTrace(e);
            }
        }
        this.mAdTemplate = adTemplate;
        adTemplate.mPvReported = getArguments().getBoolean("key_report", false);
        this.mAdTemplate.mAdWebVideoPageShowing = true;
    }

    @Override // com.kwad.components.core.page.recycle.a, com.kwad.components.core.o.e, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onDestroy() {
        super.onDestroy();
        AdTemplate adTemplate = this.mAdTemplate;
        if (adTemplate != null) {
            adTemplate.mAdWebVideoPageShowing = false;
        }
    }

    @Override // com.kwad.components.core.page.recycle.a, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final DetailWebRecycleView detailWebRecycleView = (DetailWebRecycleView) pf();
        detailWebRecycleView.setInterceptRequestFocusForWeb(true);
        detailWebRecycleView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.kwad.components.core.page.b.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (detailWebRecycleView.getChildCount() > 0) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = detailWebRecycleView.findViewHolderForAdapterPosition(0);
                    int height = findViewHolderForAdapterPosition.itemView.getHeight();
                    com.kwad.sdk.core.e.c.d("AdRecycleWebFragment", "recycleView.setTopViewHeight(" + height + ")");
                    detailWebRecycleView.setTopViewHeight(findViewHolderForAdapterPosition.itemView.getHeight());
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = detailWebRecycleView.findViewHolderForAdapterPosition(0);
                    if (findViewHolderForAdapterPosition2.itemView instanceof FeedVideoView) {
                        b.this.Mz = (FeedVideoView) findViewHolderForAdapterPosition2.itemView;
                    }
                }
                if (detailWebRecycleView.getChildCount() > 1) {
                    View view2 = detailWebRecycleView.findViewHolderForAdapterPosition(1).itemView;
                    b.this.My = (WebView) view2.findViewById(R.id.ksad_video_webView);
                    b.this.v(view2);
                }
                com.kwad.sdk.core.e.c.d("AdRecycleWebFragment", "onGlobalLayout");
                detailWebRecycleView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    @Override // com.kwad.components.core.o.e
    public final int oz() {
        return R.layout.ksad_detail_webview;
    }

    public final void setApkDownloadHelper(com.kwad.components.core.e.d.c cVar) {
        this.mApkDownloadHelper = cVar;
    }
}
