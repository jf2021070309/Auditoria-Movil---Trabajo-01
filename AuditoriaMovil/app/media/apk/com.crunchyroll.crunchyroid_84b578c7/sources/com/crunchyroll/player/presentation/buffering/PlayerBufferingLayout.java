package com.crunchyroll.player.presentation.buffering;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.cj.h;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.mj.c;
import com.amazon.aps.iva.uk.d;
import com.amazon.aps.iva.uk.e;
import com.amazon.aps.iva.uk.f;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.crunchyroid.R;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PlayerBufferingLayout.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/crunchyroll/player/presentation/buffering/PlayerBufferingLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/uk/f;", "Lcom/amazon/aps/iva/uk/d;", "c", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/uk/d;", "presenter", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayerBufferingLayout extends g implements f {
    public final c b;
    public final m c;

    /* compiled from: PlayerBufferingLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<d> {
        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final d invoke() {
            PlayerBufferingLayout playerBufferingLayout = PlayerBufferingLayout.this;
            LifecycleCoroutineScopeImpl O = x.O(playerBufferingLayout);
            h hVar = n.e;
            if (hVar != null) {
                v0 state = hVar.getState();
                j.f(state, "playerStateFlow");
                return new e(playerBufferingLayout, new com.amazon.aps.iva.uk.c(O, state));
            }
            j.m("player");
            throw null;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerBufferingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final d getPresenter() {
        return (d) this.c.getValue();
    }

    @Override // com.amazon.aps.iva.uk.f
    public final void f() {
        setVisibility(8);
    }

    @Override // com.amazon.aps.iva.uk.f
    public final void k() {
        setVisibility(0);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.player_progress_bar_size);
        ProgressBar progressBar = this.b.b;
        j.e(progressBar, "binding.bufferingProgressBar");
        Integer valueOf = Integer.valueOf(dimensionPixelSize);
        t0.k(progressBar, valueOf, valueOf);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<d> setupPresenters() {
        return l1.H(getPresenter());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerBufferingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_player_buffering, (ViewGroup) this, false);
        addView(inflate);
        ProgressBar progressBar = (ProgressBar) z.u(R.id.buffering_progress_bar, inflate);
        if (progressBar != null) {
            this.b = new c((RelativeLayout) inflate, progressBar);
            this.c = com.amazon.aps.iva.kb0.f.b(new a());
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.buffering_progress_bar)));
    }
}
