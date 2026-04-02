package com.kwad.components.core.page.recycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.kwad.sdk.R;
/* loaded from: classes.dex */
public abstract class a extends com.kwad.components.core.o.e {
    private RecyclerView NH;
    private d NI;

    private void pd() {
        RecyclerView recyclerView = (RecyclerView) findViewById(ph());
        this.NH = recyclerView;
        recyclerView.setItemAnimator(null);
        this.NH.setLayoutManager(pg());
        this.NI = a(this.NH);
    }

    private void pe() {
        this.NH.setAdapter(this.NI);
    }

    private RecyclerView.LayoutManager pg() {
        return new LinearLayoutManager(this.mContext);
    }

    private static int ph() {
        return R.id.ksad_recycler_view;
    }

    protected abstract d a(RecyclerView recyclerView);

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.kwad.components.core.o.e, com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroyView() {
        super.onDestroyView();
        this.NH.clearOnChildAttachStateChangeListeners();
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onPause() {
        super.onPause();
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onResume() {
        super.onResume();
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        pd();
        pe();
    }

    public final RecyclerView pf() {
        return this.NH;
    }
}
