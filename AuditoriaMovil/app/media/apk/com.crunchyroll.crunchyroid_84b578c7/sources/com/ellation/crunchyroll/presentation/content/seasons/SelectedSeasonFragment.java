package com.ellation.crunchyroll.presentation.content.seasons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.amazon.aps.iva.c8.e;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i5.g;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.m00.c;
import com.amazon.aps.iva.m00.k;
import com.amazon.aps.iva.m00.m;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.model.FormattableSeason;
import com.ellation.crunchyroll.presentation.content.seasons.a;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: SelectedSeasonFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/ellation/crunchyroll/presentation/content/seasons/SelectedSeasonFragment;", "Lcom/ellation/crunchyroll/model/FormattableSeason;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcom/amazon/aps/iva/qy/a;", "Lcom/amazon/aps/iva/m00/m;", "Lcom/amazon/aps/iva/i5/g;", "cr-android_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class SelectedSeasonFragment<T extends FormattableSeason> extends com.amazon.aps.iva.qy.a implements m<T>, g {
    public static final /* synthetic */ l<Object>[] f = {q.a(SelectedSeasonFragment.class, "selectedTextView", "getSelectedTextView()Landroid/widget/TextView;", 0)};
    public final c<T> c;
    public final v d = com.amazon.aps.iva.xw.g.f(this, R.id.selected_text_view);
    public final com.amazon.aps.iva.kb0.m e = f.b(new a(this));

    /* compiled from: SelectedSeasonFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<k<T>> {
        public final /* synthetic */ SelectedSeasonFragment<T> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelectedSeasonFragment<T> selectedSeasonFragment) {
            super(0);
            this.h = selectedSeasonFragment;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Object invoke() {
            SelectedSeasonFragment<T> selectedSeasonFragment = this.h;
            c<T> cVar = selectedSeasonFragment.c;
            j.f(cVar, "formatter");
            return new com.amazon.aps.iva.m00.l(cVar, selectedSeasonFragment);
        }
    }

    public SelectedSeasonFragment(c<T> cVar) {
        this.c = cVar;
    }

    @Override // com.amazon.aps.iva.m00.m
    public final void ac(int i, List list) {
        j.f(list, "titles");
        a.C0969a c0969a = com.ellation.crunchyroll.presentation.content.seasons.a.h;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        j.e(parentFragmentManager, "parentFragmentManager");
        c0969a.getClass();
        com.ellation.crunchyroll.presentation.content.seasons.a aVar = new com.ellation.crunchyroll.presentation.content.seasons.a();
        l<?>[] lVarArr = com.ellation.crunchyroll.presentation.content.seasons.a.i;
        aVar.e.b(aVar, lVarArr[3], list);
        aVar.f.b(aVar, lVarArr[4], Integer.valueOf(i));
        aVar.show(parentFragmentManager, "season_dialog");
    }

    @Override // com.amazon.aps.iva.m00.m
    public final void c8() {
        ((TextView) this.d.getValue(this, f[0])).setVisibility(0);
    }

    @Override // com.amazon.aps.iva.m00.m
    public final void gc() {
        ((TextView) this.d.getValue(this, f[0])).setVisibility(8);
    }

    @Override // com.amazon.aps.iva.m00.m
    public final void k9(String str) {
        j.f(str, "title");
        ((TextView) this.d.getValue(this, f[0])).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_selected_season, viewGroup, false);
    }

    @Override // com.amazon.aps.iva.wy.e, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.f(view, "view");
        super.onViewCreated(view, bundle);
        view.setOnClickListener(new e(this, 13));
    }

    @Override // com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H((k) this.e.getValue());
    }
}
