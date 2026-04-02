package com.kwad.components.core.s.a;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.kwad.components.core.b.a;
import com.kwad.components.offline.api.tk.model.StyleTemplate;
import com.kwad.sdk.R;
import com.kwad.sdk.api.core.KsAdSdkDynamicImpl;
import com.kwad.sdk.api.proxy.app.FeedDownloadActivity;
import com.kwad.sdk.components.h;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.mvp.Presenter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
@KsAdSdkDynamicImpl(FeedDownloadActivity.class)
/* loaded from: classes.dex */
public class a extends com.kwad.components.core.l.b<b> {
    private static final ConcurrentMap<Integer, Map<String, Object>> QU = new ConcurrentHashMap();
    private static final AtomicInteger QV = new AtomicInteger(1);
    private StyleTemplate QP;
    private String QQ;
    private boolean QR;
    private h QS;
    private int QT;
    private AdTemplate mAdTemplate;
    private AdBaseFrameLayout mRootContainer;
    private com.kwad.components.core.b.a mTitleBarHelper;

    public static void a(int i, String str, Object obj) {
        ConcurrentMap<Integer, Map<String, Object>> concurrentMap = QU;
        Map<String, Object> map = concurrentMap.get(Integer.valueOf(i));
        if (map == null) {
            map = new HashMap<>();
            concurrentMap.put(Integer.valueOf(i), map);
        }
        map.put(str, obj);
    }

    private static void aH(int i) {
        Map<String, Object> map = QU.get(Integer.valueOf(i));
        if (map != null) {
            map.clear();
        }
    }

    private Object ax(String str) {
        return h(this.QT, str);
    }

    private static Object h(int i, String str) {
        Map<String, Object> map = QU.get(Integer.valueOf(i));
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.kwad.components.core.l.b
    /* renamed from: qd */
    public b onCreateCallerContext() {
        b bVar = new b(this);
        bVar.mAdTemplate = this.mAdTemplate;
        bVar.QP = this.QP;
        bVar.mRootContainer = this.mRootContainer;
        bVar.QS = this.QS;
        return bVar;
    }

    public static int qe() {
        return QV.incrementAndGet();
    }

    public static void register() {
        com.kwad.sdk.service.b.a(FeedDownloadActivity.class, a.class);
    }

    @Override // com.kwad.components.core.o.c
    public boolean checkIntentData(Intent intent) {
        String stringExtra = getIntent().getStringExtra("tk_style_template");
        if (TextUtils.isEmpty(stringExtra)) {
            return false;
        }
        try {
            StyleTemplate styleTemplate = new StyleTemplate();
            styleTemplate.parseJson(new JSONObject(stringExtra));
            this.QP = styleTemplate;
            String stringExtra2 = getIntent().getStringExtra("tk_ad_template");
            if (TextUtils.isEmpty(stringExtra2)) {
                return true;
            }
            try {
                AdTemplate adTemplate = new AdTemplate();
                adTemplate.parseJson(new JSONObject(stringExtra2));
                this.mAdTemplate = adTemplate;
                return true;
            } catch (Throwable th) {
                return false;
            }
        } catch (Throwable th2) {
            return false;
        }
    }

    @Override // com.kwad.components.core.o.c
    public int getLayoutId() {
        return R.layout.ksad_tk_page;
    }

    @Override // com.kwad.components.core.o.c
    public String getPageName() {
        return "TKActivityProxy";
    }

    @Override // com.kwad.components.core.o.c
    public void initData() {
        this.QR = getIntent().getBooleanExtra("show_navigationBar", true);
        this.QQ = getIntent().getStringExtra("title");
        this.QT = getIntent().getIntExtra("tk_id", 0);
        this.QS = (h) ax("native_intent");
    }

    @Override // com.kwad.components.core.o.c
    public void initView() {
        AdBaseFrameLayout adBaseFrameLayout = (AdBaseFrameLayout) findViewById(R.id.ksad_tk_root_container);
        this.mRootContainer = adBaseFrameLayout;
        if (!this.QR) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) adBaseFrameLayout.getLayoutParams();
            layoutParams.topMargin = 0;
            this.mRootContainer.setLayoutParams(layoutParams);
        }
        com.kwad.components.core.b.a aVar = new com.kwad.components.core.b.a((ViewGroup) findViewById(R.id.ksad_kwad_web_title_bar));
        this.mTitleBarHelper = aVar;
        aVar.a(new a.InterfaceC0185a() { // from class: com.kwad.components.core.s.a.a.1
            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void t(View view) {
                a.this.finish();
            }

            @Override // com.kwad.components.core.b.a.InterfaceC0185a
            public final void u(View view) {
            }
        });
        this.mTitleBarHelper.a(new com.kwad.components.core.b.b(this.QQ));
        this.mTitleBarHelper.ai(false);
    }

    @Override // com.kwad.components.core.l.b
    public Presenter onCreatePresenter() {
        return new com.kwad.components.core.s.b.a();
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        aH(this.QT);
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
    }

    @Override // com.kwad.components.core.l.b, com.kwad.components.core.o.c, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
    }
}
