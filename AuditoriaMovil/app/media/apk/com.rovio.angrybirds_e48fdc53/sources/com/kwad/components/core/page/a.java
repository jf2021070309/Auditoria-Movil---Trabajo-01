package com.kwad.components.core.page;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.kwad.components.core.b.a;
import com.kwad.components.core.o.f;
import com.kwad.components.core.playable.PlayableSource;
import com.kwad.components.core.webview.jshandler.ak;
import com.kwad.sdk.R;
import com.kwad.sdk.api.proxy.app.BaseFragmentActivity;
import com.kwad.sdk.core.report.j;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.core.view.AdBaseFrameLayout;
import com.kwad.sdk.core.webview.KsAdWebView;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class a extends f implements a.InterfaceC0185a, ak.b {
    private boolean Mx = true;
    private AdTemplate mAdTemplate;
    private com.kwad.components.core.e.d.c mApkDownloadHelper;
    private AdBaseFrameLayout mRootContainer;
    private com.kwad.components.core.b.a mTitleBarHelper;
    private com.kwad.components.core.playable.a pb;

    private void b(Intent intent) {
        String stringExtra = intent.getStringExtra("key_template_json");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        try {
            this.mAdTemplate = new AdTemplate();
            this.mAdTemplate.parseJson(new JSONObject(stringExtra));
            this.mApkDownloadHelper = new com.kwad.components.core.e.d.c(this.mAdTemplate);
        } catch (Exception e) {
            com.kwad.sdk.core.e.c.printStackTraceOnly(e);
        }
    }

    public static void launch(Context context, AdTemplate adTemplate) {
        com.kwad.sdk.service.b.a(BaseFragmentActivity.FragmentActivity8.class, a.class);
        Intent intent = new Intent(context, BaseFragmentActivity.FragmentActivity8.class);
        intent.putExtra("key_template_json", adTemplate.toJson().toString());
        context.startActivity(intent);
    }

    private void oy() {
        com.kwad.components.core.b.a aVar = new com.kwad.components.core.b.a(this.mRootContainer);
        this.mTitleBarHelper = aVar;
        aVar.a(this);
        this.mTitleBarHelper.a(new com.kwad.components.core.b.b(""));
    }

    public static void register() {
        com.kwad.sdk.service.b.a(BaseFragmentActivity.FragmentActivity8.class, a.class);
    }

    @Override // com.kwad.components.core.webview.jshandler.ak.b
    public final void a(ak.a aVar) {
        com.kwad.components.core.playable.a aVar2;
        com.kwad.sdk.core.e.c.d("AdPlayableActivityProxy", "updatePageStatus status: " + aVar);
        if (aVar.status != 1 || (aVar2 = this.pb) == null) {
            return;
        }
        aVar2.e(PlayableSource.UNKNOWN_TRYPLAY_ENTRY_SOURCE);
    }

    @Override // com.kwad.components.core.o.f
    public String getPageName() {
        return "AdPlayableActivityProxy";
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivity().setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
        setContentView(R.layout.ksad_activity_playable);
        b(getIntent());
        this.mRootContainer = (AdBaseFrameLayout) findViewById(R.id.ksad_playable_activity_root);
        oy();
        com.kwad.components.core.playable.a aVar = new com.kwad.components.core.playable.a((KsAdWebView) findViewById(R.id.ksad_playable_webview));
        this.pb = aVar;
        aVar.a(this.mAdTemplate, this.mRootContainer, this.mApkDownloadHelper);
        this.pb.a(this);
        this.pb.py();
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        this.pb.b(this);
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onPause() {
        super.onPause();
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onRestart() {
        super.onRestart();
    }

    @Override // com.kwad.components.core.o.f, com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
    }

    @Override // com.kwad.components.core.b.a.InterfaceC0185a
    public final void t(View view) {
        onBackPressed();
    }

    @Override // com.kwad.components.core.b.a.InterfaceC0185a
    public final void u(View view) {
        com.kwad.sdk.core.report.a.b(this.mAdTemplate, new j().ch(6), (JSONObject) null);
        finish();
    }
}
