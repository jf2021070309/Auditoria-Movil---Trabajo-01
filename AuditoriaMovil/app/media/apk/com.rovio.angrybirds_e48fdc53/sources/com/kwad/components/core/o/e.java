package com.kwad.components.core.o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kwad.sdk.api.core.fragment.KsFragment;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public class e extends KsFragment implements com.kwad.sdk.l.a.b {
    protected ViewGroup Pn;
    protected ViewGroup lN;
    private final com.kwad.sdk.l.a.a mBackPressDelete = new com.kwad.sdk.l.a.a();
    protected Context mContext;

    @Override // com.kwad.sdk.l.a.b
    public boolean bQ() {
        return this.mBackPressDelete.bQ();
    }

    public final <T extends View> T findViewById(int i) {
        ViewGroup viewGroup = this.lN;
        if (viewGroup != null) {
            return (T) viewGroup.findViewById(i);
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    protected ViewGroup lE() {
        return null;
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mContext = l.wrapContextIfNeed(getActivity());
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        this.Pn = viewGroup;
        if (this.lN == null) {
            ViewGroup lE = lE();
            this.lN = lE;
            if (lE == null && oz() != 0) {
                this.lN = (ViewGroup) from.inflate(oz(), viewGroup, false);
            }
        }
        return this.lN;
    }

    @Override // com.kwad.sdk.api.core.fragment.KsFragment, com.kwad.sdk.api.core.fragment.AbstractIFragmentLifecycle, com.kwad.sdk.api.core.fragment.IFragmentLifecycle
    public void onDestroy() {
        super.onDestroy();
        if (getHost() != null) {
            com.kwad.components.core.t.f.destroyFragment(this.mContext, getView());
        }
    }

    protected int oz() {
        return 0;
    }
}
