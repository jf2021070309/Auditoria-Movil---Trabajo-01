package com.kwad.components.core.o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.kwad.components.core.t.j;
import com.kwad.sdk.KsAdSDKImpl;
import com.kwad.sdk.R;
import com.kwad.sdk.api.proxy.IFragmentActivityProxy;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public abstract class f extends IFragmentActivityProxy {
    public Context mContext;
    public View mRootView;
    private final com.kwad.components.core.o.a.a mPageMonitor = new com.kwad.components.core.o.a.a();
    private final com.kwad.sdk.l.a.a mBackPressDelete = new com.kwad.sdk.l.a.a();

    public void addBackPressable(com.kwad.sdk.l.a.b bVar) {
        this.mBackPressDelete.addBackPressable(bVar);
    }

    public void addBackPressable(com.kwad.sdk.l.a.b bVar, int i) {
        this.mBackPressDelete.addBackPressable(bVar, i);
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public <T extends View> T findViewById(int i) {
        T t = (T) this.mRootView.findViewById(i);
        return t != null ? t : (T) super.findViewById(i);
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public Intent getIntent() {
        Intent intent = super.getIntent();
        j.c(intent);
        return intent;
    }

    protected abstract String getPageName();

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onBackPressed() {
        if (this.mBackPressDelete.bQ()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onCreate(Bundle bundle) {
        try {
            if (!KsAdSDKImpl.get().hasInitFinish()) {
                finish();
                return;
            }
            super.onCreate(bundle);
            getActivity().setTheme(R.style.Theme_AppCompat_Light_NoActionBar);
            this.mContext = l.wrapContextIfNeed(getActivity());
            Intent intent = getIntent();
            long longExtra = intent != null ? intent.getLongExtra("key_start_time", 0L) : 0L;
            this.mPageMonitor.av(getClass().getSimpleName());
            this.mPageMonitor.y(longExtra);
        } catch (Throwable th) {
            if (!KsAdSDKImpl.get().getIsExternal()) {
                throw th;
            }
            com.kwad.components.core.d.a.b(th);
            finish();
        }
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onDestroy() {
        super.onDestroy();
        com.kwad.components.core.t.f.destroyActivity(getActivity(), getWindow());
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void onResume() {
        super.onResume();
        com.kwad.components.core.o.a.a aVar = this.mPageMonitor;
        getActivity();
        aVar.pB();
    }

    public void removeBackPressable(com.kwad.sdk.l.a.b bVar) {
        this.mBackPressDelete.removeBackPressable(bVar);
    }

    @Override // com.kwad.sdk.api.proxy.IActivityProxy
    public void setContentView(int i) {
        View inflate = l.inflate(this.mContext, i, null);
        this.mRootView = inflate;
        super.setContentView(inflate);
    }
}
