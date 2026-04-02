package com.ellation.crunchyroll.presentation.content.seasons;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.c8.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.m00.c;
import com.amazon.aps.iva.m00.e;
import com.amazon.aps.iva.m00.h;
import com.amazon.aps.iva.m00.i;
import com.amazon.aps.iva.m00.j;
import com.amazon.aps.iva.wy.d;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.s;
import com.amazon.aps.iva.xw.v;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SeasonsDialog.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/seasons/a;", "Lcom/ellation/crunchyroll/model/FormattableSeason;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/wy/d;", "Lcom/amazon/aps/iva/m00/j;", "<init>", "()V", "a", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class a<T extends FormattableSeason> extends d implements j<T> {
    public final v b;
    public final v c;
    public final v d;
    public final s e;
    public final s f;
    public final m g;
    public static final /* synthetic */ l<Object>[] i = {q.a(a.class, "closeButton", "getCloseButton()Landroid/view/View;", 0), q.a(a.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), q.a(a.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0), e.b(a.class, "seasons", "getSeasons()Ljava/util/List;", 0), e.b(a.class, "selectedPosition", "getSelectedPosition()I", 0)};
    public static final C0969a h = new C0969a();

    /* compiled from: SeasonsDialog.kt */
    /* renamed from: com.ellation.crunchyroll.presentation.content.seasons.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0969a {
    }

    /* compiled from: SeasonsDialog.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<h<T>> {
        public final /* synthetic */ a<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<T> aVar) {
            super(0);
            this.h = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            C0969a c0969a = a.h;
            a<T> aVar = this.h;
            aVar.getClass();
            l<?>[] lVarArr = a.i;
            return new i(aVar, (List) aVar.e.getValue(aVar, lVarArr[3]), ((Number) aVar.f.getValue(aVar, lVarArr[4])).intValue(), new com.ellation.crunchyroll.presentation.content.seasons.b(aVar));
        }
    }

    public a() {
        super(Integer.valueOf((int) R.layout.season_dialog_layout));
        this.b = g.e(this, R.id.toolbar_close);
        this.c = g.e(this, R.id.season_list);
        this.d = g.e(this, R.id.toolbar_title);
        this.e = new s("season_list");
        this.f = new s("selected_season_position");
        this.g = f.b(new b(this));
    }

    @Override // com.amazon.aps.iva.m00.j
    public final void Ma(int i2, List list) {
        c bVar;
        com.amazon.aps.iva.yb0.j.f(list, "seasons");
        RecyclerView recyclerView = (RecyclerView) this.c.getValue(this, i[1]);
        Context requireContext = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext, "requireContext()");
        Context requireContext2 = requireContext();
        com.amazon.aps.iva.yb0.j.e(requireContext2, "requireContext()");
        FormattableSeason formattableSeason = (FormattableSeason) list.get(0);
        com.amazon.aps.iva.yb0.j.f(formattableSeason, "season");
        if (formattableSeason instanceof Season) {
            bVar = new com.amazon.aps.iva.m00.d(requireContext2);
        } else if (formattableSeason instanceof SimulcastSeason) {
            bVar = new com.amazon.aps.iva.cq.b();
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
        recyclerView.setAdapter(new com.amazon.aps.iva.m00.g(requireContext, list, i2, bVar, new e(this)));
    }

    @Override // androidx.fragment.app.g
    public final Dialog onCreateDialog(Bundle bundle) {
        return new Dialog(requireContext(), R.style.SeasonsDialog);
    }

    @Override // com.amazon.aps.iva.wy.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.amazon.aps.iva.yb0.j.f(view, "view");
        super.onViewCreated(view, bundle);
        l<?>[] lVarArr = i;
        ((View) this.b.getValue(this, lVarArr[0])).setOnClickListener(new k(this, 12));
        ((TextView) this.d.getValue(this, lVarArr[2])).setText(getString(R.string.seasons));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((h) this.g.getValue());
    }
}
