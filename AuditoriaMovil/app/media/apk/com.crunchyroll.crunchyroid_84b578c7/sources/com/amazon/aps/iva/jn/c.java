package com.amazon.aps.iva.jn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.p;
import com.amazon.aps.iva.a9.k0;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.xw.t;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import kotlin.Metadata;
/* compiled from: SimulcastFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/aps/iva/jn/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "simulcast_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class c extends Fragment {
    public static final /* synthetic */ l<Object>[] c = {q.a(c.class, "viewModel", "getViewModel()Lcom/crunchyroll/simulcast/screen/SimulcastViewModelImpl;", 0)};
    public final com.amazon.aps.iva.ez.f b = new com.amazon.aps.iva.ez.f(this, g.class, a.h);

    /* compiled from: SimulcastFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, g> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final g invoke(p pVar) {
            j.f(pVar, "it");
            com.amazon.aps.iva.in.a aVar = k0.c;
            if (aVar != null) {
                EtpContentService contentService = aVar.getContentService();
                j.f(contentService, "contentService");
                return new g(new d(contentService));
            }
            j.m("dependencies");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return t.a(this, com.amazon.aps.iva.v0.b.c(-1705538785, new b(this), true));
    }
}
