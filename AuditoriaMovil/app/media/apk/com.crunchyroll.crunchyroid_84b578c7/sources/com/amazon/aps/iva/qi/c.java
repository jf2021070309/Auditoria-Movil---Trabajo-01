package com.amazon.aps.iva.qi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.j;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.xw.r0;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.ui.labels.LabelUiModel;
import com.ellation.crunchyroll.ui.labels.LabelsKt;
import com.ellation.widgets.CollapsibleTextView;
import com.ellation.widgets.overflow.OverflowButton;
import com.google.android.gms.cast.MediaTrack;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: WatchMusicSummaryLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.wy.g implements h {
    public final com.amazon.aps.iva.n70.d<g> b;
    public final com.amazon.aps.iva.vy.e c;
    public final m d;

    /* compiled from: WatchMusicSummaryLayout.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
        public final /* synthetic */ LabelUiModel h;
        public final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LabelUiModel labelUiModel, boolean z) {
            super(2);
            this.h = labelUiModel;
            this.i = z;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
            com.amazon.aps.iva.o0.i iVar2 = iVar;
            if ((num.intValue() & 11) == 2 && iVar2.h()) {
                iVar2.A();
            } else {
                e0.b bVar = e0.a;
                LabelsKt.m32Labels0OtIIsQ(this.h, null, false, true, this.i, false, false, false, 0L, null, 0.0f, iVar2, LabelUiModel.$stable | 3072, 0, 2022);
            }
            return q.a;
        }
    }

    /* compiled from: WatchMusicSummaryLayout.kt */
    /* loaded from: classes.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<View, q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<String, q> h;
        public final /* synthetic */ j<String, String> i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(com.amazon.aps.iva.xb0.l<? super String, q> lVar, j<String, String> jVar) {
            super(1);
            this.h = lVar;
            this.i = jVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(View view) {
            com.amazon.aps.iva.yb0.j.f(view, "<anonymous parameter 0>");
            this.h.invoke(this.i.c);
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, com.amazon.aps.iva.n70.d dVar) {
        super(context, null, 0);
        com.amazon.aps.iva.yb0.j.f(dVar, "overflowMenuProvider");
        this.b = dVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_music_summary, (ViewGroup) this, false);
        addView(inflate);
        int i = R.id.asset_type_text;
        TextView textView = (TextView) z.u(R.id.asset_type_text, inflate);
        if (textView != null) {
            i = R.id.watch_music_artist_title;
            TextView textView2 = (TextView) z.u(R.id.watch_music_artist_title, inflate);
            if (textView2 != null) {
                i = R.id.watch_music_description;
                CollapsibleTextView collapsibleTextView = (CollapsibleTextView) z.u(R.id.watch_music_description, inflate);
                if (collapsibleTextView != null) {
                    i = R.id.watch_music_maturity_and_date_container;
                    LinearLayout linearLayout = (LinearLayout) z.u(R.id.watch_music_maturity_and_date_container, inflate);
                    if (linearLayout != null) {
                        i = R.id.watch_music_maturity_rating_label;
                        ComposeView composeView = (ComposeView) z.u(R.id.watch_music_maturity_rating_label, inflate);
                        if (composeView != null) {
                            i = R.id.watch_music_overflow_button;
                            OverflowButton overflowButton = (OverflowButton) z.u(R.id.watch_music_overflow_button, inflate);
                            if (overflowButton != null) {
                                i = R.id.watch_music_release_date;
                                TextView textView3 = (TextView) z.u(R.id.watch_music_release_date, inflate);
                                if (textView3 != null) {
                                    i = R.id.watch_music_title;
                                    TextView textView4 = (TextView) z.u(R.id.watch_music_title, inflate);
                                    if (textView4 != null) {
                                        this.c = new com.amazon.aps.iva.vy.e((ConstraintLayout) inflate, textView, textView2, collapsibleTextView, linearLayout, composeView, overflowButton, textView3, textView4);
                                        this.d = com.amazon.aps.iva.kb0.f.b(new d(this));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public static void b1(c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "this$0");
        cVar.getPresenter().q();
    }

    private final e getPresenter() {
        return (e) this.d.getValue();
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void Fb() {
        this.c.b.setText(R.string.artist_tab_music_videos);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void H9() {
        TextView textView = this.c.h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicReleaseDate");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void Hg(String str, List<j<String, String>> list, com.amazon.aps.iva.xb0.l<? super String, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        com.amazon.aps.iva.yb0.j.f(list, "clickableParts");
        com.amazon.aps.iva.vy.e eVar = this.c;
        eVar.c.setText(str);
        TextView textView = eVar.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicArtistTitle");
        List<j<String, String>> list2 = list;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Context context = getContext();
            com.amazon.aps.iva.yb0.j.e(context, "context");
            m0.b(com.amazon.aps.iva.d3.a.getColor(context, R.color.primary), str, (String) ((j) it.next()).b);
        }
        SpannableString spannableString = new SpannableString(str);
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            j jVar = (j) it2.next();
            m0.a(spannableString, (String) jVar.b, false, new b(lVar, jVar));
        }
        r0.b(textView, spannableString);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void Md() {
        this.c.b.setText(R.string.artist_tab_concerts);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void Ph() {
        TextView textView = this.c.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicArtistTitle");
        textView.setVisibility(8);
    }

    public final void U2(g gVar, com.amazon.aps.iva.xb0.l<? super String, q> lVar) {
        getPresenter().C4(gVar, lVar);
        OverflowButton overflowButton = this.c.g;
        com.amazon.aps.iva.yb0.j.e(overflowButton, "binding.watchMusicOverflowButton");
        overflowButton.G(this.b.a(gVar), null, null, null, null);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void W2(LabelUiModel labelUiModel, boolean z) {
        com.amazon.aps.iva.yb0.j.f(labelUiModel, "labelUiModel");
        this.c.f.setContent(com.amazon.aps.iva.v0.b.c(637854207, new a(labelUiModel, z), true));
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void Z() {
        CollapsibleTextView collapsibleTextView = this.c.d;
        collapsibleTextView.setCollapsed(!collapsibleTextView.k);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void c5() {
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        com.amazon.aps.iva.rv.e n = k.n(context);
        boolean c = n.c();
        com.amazon.aps.iva.vy.e eVar = this.c;
        if (c && n.S0()) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.watch_music_summary_overflow_margin);
            TextView textView = eVar.c;
            com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicArtistTitle");
            t0.g(textView, 0, null, 2);
            TextView textView2 = eVar.i;
            com.amazon.aps.iva.yb0.j.e(textView2, "binding.watchMusicTitle");
            t0.g(textView2, 0, null, 2);
            CollapsibleTextView collapsibleTextView = eVar.d;
            com.amazon.aps.iva.yb0.j.e(collapsibleTextView, "binding.watchMusicDescription");
            t0.g(collapsibleTextView, 0, null, 2);
            LinearLayout linearLayout = eVar.e;
            com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.watchMusicMaturityAndDateContainer");
            t0.g(linearLayout, 0, null, 2);
            OverflowButton overflowButton = eVar.g;
            com.amazon.aps.iva.yb0.j.e(overflowButton, "binding.watchMusicOverflowButton");
            t0.g(overflowButton, null, Integer.valueOf(dimensionPixelSize), 1);
            return;
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.watch_music_summary_margin_horizontal);
        TextView textView3 = eVar.c;
        com.amazon.aps.iva.yb0.j.e(textView3, "binding.watchMusicArtistTitle");
        t0.g(textView3, Integer.valueOf(dimensionPixelSize2), null, 2);
        TextView textView4 = eVar.i;
        com.amazon.aps.iva.yb0.j.e(textView4, "binding.watchMusicTitle");
        t0.g(textView4, Integer.valueOf(dimensionPixelSize2), null, 2);
        CollapsibleTextView collapsibleTextView2 = eVar.d;
        com.amazon.aps.iva.yb0.j.e(collapsibleTextView2, "binding.watchMusicDescription");
        t0.g(collapsibleTextView2, Integer.valueOf(dimensionPixelSize2), null, 2);
        LinearLayout linearLayout2 = eVar.e;
        com.amazon.aps.iva.yb0.j.e(linearLayout2, "binding.watchMusicMaturityAndDateContainer");
        t0.g(linearLayout2, Integer.valueOf(dimensionPixelSize2), null, 2);
        OverflowButton overflowButton2 = eVar.g;
        com.amazon.aps.iva.yb0.j.e(overflowButton2, "binding.watchMusicOverflowButton");
        t0.g(overflowButton2, null, Integer.valueOf(dimensionPixelSize2), 1);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void ca() {
        TextView textView = this.c.h;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicReleaseDate");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void g() {
        CollapsibleTextView collapsibleTextView = this.c.d;
        com.amazon.aps.iva.yb0.j.e(collapsibleTextView, "binding.watchMusicDescription");
        collapsibleTextView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void oh() {
        TextView textView = this.c.c;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.watchMusicArtistTitle");
        textView.setVisibility(0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c5();
    }

    @Override // com.amazon.aps.iva.qi.h
    public final void r() {
        CollapsibleTextView collapsibleTextView = this.c.d;
        com.amazon.aps.iva.yb0.j.e(collapsibleTextView, "binding.watchMusicDescription");
        collapsibleTextView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.qi.h
    public void setDescription(String str) {
        com.amazon.aps.iva.yb0.j.f(str, MediaTrack.ROLE_DESCRIPTION);
        com.amazon.aps.iva.vy.e eVar = this.c;
        eVar.d.setText(str);
        eVar.d.setOnClickListener(new com.amazon.aps.iva.c8.h(this, 4));
    }

    @Override // com.amazon.aps.iva.qi.h
    public void setMusicTitle(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        this.c.i.setText(str);
    }

    @Override // com.amazon.aps.iva.qi.h
    public void setReleaseDate(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "date");
        this.c.h.setText(getResources().getString(R.string.watch_music_released_date, str));
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }
}
