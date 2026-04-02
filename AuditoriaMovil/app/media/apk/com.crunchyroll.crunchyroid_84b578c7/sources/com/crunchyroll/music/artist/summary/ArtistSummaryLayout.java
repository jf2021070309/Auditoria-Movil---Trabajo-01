package com.crunchyroll.music.artist.summary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ai.b;
import com.amazon.aps.iva.ai.d;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.vy.c;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.wy.k;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import com.crunchyroll.music.artist.ArtistActivity;
import com.ellation.crunchyroll.ui.genres.GenresLayout;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ArtistSummaryView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0003H\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/crunchyroll/music/artist/summary/ArtistSummaryLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/ai/d;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Lcom/amazon/aps/iva/kb0/q;", "setName", "", "genres", "setGenres", MediaTrack.ROLE_DESCRIPTION, "setDescription", "Lcom/amazon/aps/iva/ai/b;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/ai/b;", "presenter", "music_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ArtistSummaryLayout extends g implements d {
    public static final /* synthetic */ int d = 0;
    public final c b;
    public final m c;

    /* compiled from: ArtistSummaryView.kt */
    /* loaded from: classes.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<b> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final b invoke() {
            ArtistSummaryLayout artistSummaryLayout = ArtistSummaryLayout.this;
            j.f(artistSummaryLayout, "view");
            return new com.amazon.aps.iva.ai.c(artistSummaryLayout);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ArtistSummaryLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final b getPresenter() {
        return (b) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.ai.d
    public final void Qa() {
        this.b.f.getLayoutParams().height = t0.a(R.dimen.artist_summary_gradient_min_height, this);
    }

    @Override // com.amazon.aps.iva.ai.d
    public final void V1() {
        ConstraintLayout constraintLayout = this.b.b;
        j.e(constraintLayout, "binding.artistSummaryContent");
        constraintLayout.setVisibility(0);
    }

    public final void b1(com.amazon.aps.iva.ai.a aVar, ArtistActivity.a aVar2) {
        j.f(aVar, "showSummary");
        getPresenter().D5(aVar);
        this.b.c.setOnClickListener(new com.amazon.aps.iva.ne.a(aVar2, 2));
    }

    @Override // com.amazon.aps.iva.ai.d
    public final void g() {
        TextView textView = this.b.d;
        j.e(textView, "binding.artistSummaryDescription");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ai.d
    public final void q() {
        TextView textView = this.b.c;
        j.e(textView, "binding.artistSummaryCta");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.ai.d
    public final void r() {
        TextView textView = this.b.d;
        j.e(textView, "binding.artistSummaryDescription");
        textView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.ai.d
    public void setDescription(String str) {
        j.f(str, MediaTrack.ROLE_DESCRIPTION);
        this.b.d.setText(str);
    }

    @Override // com.amazon.aps.iva.ai.d
    public void setGenres(List<String> list) {
        j.f(list, "genres");
        this.b.e.bind(list);
    }

    @Override // com.amazon.aps.iva.ai.d
    public void setName(String str) {
        j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.b.g.setText(str);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<k> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtistSummaryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_artist_summary, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.artist_hero_empty_space;
        if (((Space) z.u(R.id.artist_hero_empty_space, inflate)) != null) {
            i2 = R.id.artist_summary_content;
            ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.artist_summary_content, inflate);
            if (constraintLayout != null) {
                i2 = R.id.artist_summary_cta;
                TextView textView = (TextView) z.u(R.id.artist_summary_cta, inflate);
                if (textView != null) {
                    i2 = R.id.artist_summary_description;
                    TextView textView2 = (TextView) z.u(R.id.artist_summary_description, inflate);
                    if (textView2 != null) {
                        i2 = R.id.artist_summary_genres;
                        GenresLayout genresLayout = (GenresLayout) z.u(R.id.artist_summary_genres, inflate);
                        if (genresLayout != null) {
                            i2 = R.id.artist_summary_gradient;
                            View u = z.u(R.id.artist_summary_gradient, inflate);
                            if (u != null) {
                                i2 = R.id.artist_summary_title;
                                TextView textView3 = (TextView) z.u(R.id.artist_summary_title, inflate);
                                if (textView3 != null) {
                                    this.b = new c((ConstraintLayout) inflate, constraintLayout, textView, textView2, genresLayout, u, textView3);
                                    this.c = f.b(new a());
                                    setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
