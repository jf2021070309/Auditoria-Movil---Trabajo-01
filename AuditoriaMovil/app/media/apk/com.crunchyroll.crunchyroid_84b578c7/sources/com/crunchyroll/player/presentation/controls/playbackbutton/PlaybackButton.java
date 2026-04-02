package com.crunchyroll.player.presentation.controls.playbackbutton;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.q.o;
import com.amazon.aps.iva.rv.e;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.amazon.aps.iva.yk.b;
import com.amazon.aps.iva.yk.g;
import com.crunchyroll.crunchyroid.R;
import kotlin.Metadata;
/* compiled from: PlaybackButton.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002R\u001b\u0010\b\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/playbackbutton/PlaybackButton;", "Lcom/amazon/aps/iva/q/o;", "Lcom/amazon/aps/iva/yk/g;", "Lcom/amazon/aps/iva/yk/a;", "b", "Lcom/amazon/aps/iva/kb0/e;", "getPresenter", "()Lcom/amazon/aps/iva/yk/a;", "presenter", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlaybackButton extends o implements g {
    public final m b;

    /* compiled from: PlaybackButton.kt */
    /* loaded from: classes2.dex */
    public static final class a extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.yk.a> {
        public final /* synthetic */ Context i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.i = context;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.yk.a invoke() {
            e n = k.n(this.i);
            PlaybackButton playbackButton = PlaybackButton.this;
            j.f(playbackButton, "view");
            return new b(playbackButton, n);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaybackButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final com.amazon.aps.iva.yk.a getPresenter() {
        return (com.amazon.aps.iva.yk.a) this.b.getValue();
    }

    @Override // com.amazon.aps.iva.yk.g
    public final void i9() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_controls_center_horizontal_margin);
        t0.h(this, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), null, 10);
    }

    @Override // com.amazon.aps.iva.yk.g
    public final void n() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_controls_center_button_size);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.video_controls_center_horizontal_margin_fullscreen);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = dimensionPixelSize;
        layoutParams.width = dimensionPixelSize;
        setLayoutParams(layoutParams);
        t0.h(this, Integer.valueOf(dimensionPixelSize2), null, Integer.valueOf(dimensionPixelSize2), null, 10);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        getPresenter().C();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = f.b(new a(context));
    }
}
