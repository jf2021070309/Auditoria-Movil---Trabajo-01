package com.crunchyroll.player.presentation.controls.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.amazon.aps.iva.cj.k;
import com.amazon.aps.iva.cj.n;
import com.amazon.aps.iva.cl.b;
import com.amazon.aps.iva.cl.c;
import com.amazon.aps.iva.cl.d;
import com.amazon.aps.iva.d3.a;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.mj.j;
import com.amazon.aps.iva.wy.g;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.CastButtonFactory;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: PlayerToolbar.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/crunchyroll/player/presentation/controls/toolbar/PlayerToolbar;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/cl/d;", "", "title", "Lcom/amazon/aps/iva/kb0/q;", "setToolbarTitle", MediaTrack.ROLE_SUBTITLE, "setToolbarSubtitle", "Lcom/amazon/aps/iva/cl/b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "Lcom/amazon/aps/iva/mj/j;", "c", "Lcom/amazon/aps/iva/mj/j;", "getBinding", "()Lcom/amazon/aps/iva/mj/j;", "binding", "player_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PlayerToolbar extends g implements d {
    public static final /* synthetic */ int d = 0;
    public c b;
    public final j c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlayerToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void Cb() {
        MediaRouteButton mediaRouteButton = this.c.e;
        com.amazon.aps.iva.yb0.j.e(mediaRouteButton, "binding.mediaRouteButton");
        mediaRouteButton.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void E0() {
        j jVar = this.c;
        ImageView imageView = jVar.d;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.buttonToggleFullscreen");
        imageView.setVisibility(8);
        ImageView imageView2 = jVar.b;
        com.amazon.aps.iva.yb0.j.e(imageView2, "binding.buttonSettings");
        imageView2.setVisibility(8);
        MediaRouteButton mediaRouteButton = jVar.e;
        com.amazon.aps.iva.yb0.j.e(mediaRouteButton, "binding.mediaRouteButton");
        mediaRouteButton.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void N4() {
        j jVar = this.c;
        jVar.d.setContentDescription(getContext().getString(R.string.desc_player_toolbar_toggle_expansion));
        jVar.d.setImageDrawable(a.getDrawable(getContext(), R.drawable.ic_expand));
    }

    public final j getBinding() {
        return this.c;
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void h4() {
        LinearLayout linearLayout = this.c.h;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.titleSubtitleContainer");
        linearLayout.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void hideSkipToNextButton() {
        ImageView imageView = this.c.c;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.buttonSkipToNext");
        imageView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void i2() {
        ImageView imageView = this.c.i;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.toolbarBackButton");
        imageView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void j0() {
        ImageView imageView = this.c.i;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.toolbarBackButton");
        imageView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void l9() {
        LinearLayout linearLayout = this.c.h;
        com.amazon.aps.iva.yb0.j.e(linearLayout, "binding.titleSubtitleContainer");
        linearLayout.setVisibility(4);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void q9() {
        j jVar = this.c;
        jVar.d.setContentDescription(getContext().getString(R.string.desc_player_toolbar_toggle_collapse));
        jVar.d.setImageDrawable(a.getDrawable(getContext(), R.drawable.ic_minimize));
    }

    public final void setListener(b bVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        c cVar = this.b;
        if (cVar != null) {
            cVar.e = bVar;
        } else {
            com.amazon.aps.iva.yb0.j.m("presenter");
            throw null;
        }
    }

    @Override // com.amazon.aps.iva.cl.d
    public void setToolbarSubtitle(String str) {
        com.amazon.aps.iva.yb0.j.f(str, MediaTrack.ROLE_SUBTITLE);
        this.c.f.setText(str);
    }

    @Override // com.amazon.aps.iva.cl.d
    public void setToolbarTitle(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        this.c.g.setText(str);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void showSkipToNextButton() {
        ImageView imageView = this.c.c;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.buttonSkipToNext");
        imageView.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void v1() {
        j jVar = this.c;
        ImageView imageView = jVar.d;
        com.amazon.aps.iva.yb0.j.e(imageView, "binding.buttonToggleFullscreen");
        imageView.setVisibility(0);
        ImageView imageView2 = jVar.b;
        com.amazon.aps.iva.yb0.j.e(imageView2, "binding.buttonSettings");
        imageView2.setVisibility(0);
    }

    @Override // com.amazon.aps.iva.cl.d
    public final void wb() {
        j jVar = this.c;
        MediaRouteButton mediaRouteButton = jVar.e;
        com.amazon.aps.iva.yb0.j.e(mediaRouteButton, "binding.mediaRouteButton");
        mediaRouteButton.setVisibility(0);
        k kVar = n.d;
        if (kVar != null) {
            CastButtonFactory.setUpMediaRouteButton(kVar.g(), jVar.e);
        } else {
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.player_toolbar, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.button_settings;
        ImageView imageView = (ImageView) z.u(R.id.button_settings, inflate);
        if (imageView != null) {
            i2 = R.id.button_skip_to_next;
            ImageView imageView2 = (ImageView) z.u(R.id.button_skip_to_next, inflate);
            if (imageView2 != null) {
                i2 = R.id.button_toggle_fullscreen;
                ImageView imageView3 = (ImageView) z.u(R.id.button_toggle_fullscreen, inflate);
                if (imageView3 != null) {
                    i2 = R.id.media_route_button;
                    MediaRouteButton mediaRouteButton = (MediaRouteButton) z.u(R.id.media_route_button, inflate);
                    if (mediaRouteButton != null) {
                        i2 = R.id.subtitle;
                        TextView textView = (TextView) z.u(R.id.subtitle, inflate);
                        if (textView != null) {
                            i2 = R.id.title;
                            TextView textView2 = (TextView) z.u(R.id.title, inflate);
                            if (textView2 != null) {
                                i2 = R.id.title_subtitle_container;
                                LinearLayout linearLayout = (LinearLayout) z.u(R.id.title_subtitle_container, inflate);
                                if (linearLayout != null) {
                                    i2 = R.id.toolbar_back_button;
                                    ImageView imageView4 = (ImageView) z.u(R.id.toolbar_back_button, inflate);
                                    if (imageView4 != null) {
                                        this.c = new j((LinearLayout) inflate, imageView, imageView2, imageView3, mediaRouteButton, textView, textView2, linearLayout, imageView4);
                                        return;
                                    }
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
