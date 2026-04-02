package com.amazon.aps.iva.kz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.aq.k;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.jm.s;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.ot.a;
import com.amazon.aps.iva.wo.f;
import com.crunchyroll.crunchyroid.R;
import com.ellation.crunchyroll.api.etp.model.Image;
import com.ellation.crunchyroll.playableasset.durationlabel.PlayableAssetDurationLabelLayout;
import com.ellation.crunchyroll.ui.ImageUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Set;
/* compiled from: PlayableAssetCardView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class f<T, D> extends com.amazon.aps.iva.wy.g implements j {
    public static final /* synthetic */ int f = 0;
    public final m b;
    public final com.amazon.aps.iva.f70.d c;
    public final T d;
    public final D e;

    public f(Context context, f.a aVar, f.b bVar) {
        super(context, null, 0, 6, null);
        this.b = com.amazon.aps.iva.kb0.f.b(new e(this));
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_playable_asset_card, (ViewGroup) this, false);
        addView(inflate);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i = R.id.badges_layer;
        ComposeView composeView = (ComposeView) z.u(R.id.badges_layer, inflate);
        if (composeView != null) {
            i = R.id.duration_label;
            PlayableAssetDurationLabelLayout playableAssetDurationLabelLayout = (PlayableAssetDurationLabelLayout) z.u(R.id.duration_label, inflate);
            if (playableAssetDurationLabelLayout != null) {
                i = R.id.left_ui_component_container;
                FrameLayout frameLayout = (FrameLayout) z.u(R.id.left_ui_component_container, inflate);
                if (frameLayout != null) {
                    i = R.id.progress_bar;
                    ProgressBar progressBar = (ProgressBar) z.u(R.id.progress_bar, inflate);
                    if (progressBar != null) {
                        i = R.id.right_ui_component_container;
                        FrameLayout frameLayout2 = (FrameLayout) z.u(R.id.right_ui_component_container, inflate);
                        if (frameLayout2 != null) {
                            i = R.id.state_layer;
                            ComposeView composeView2 = (ComposeView) z.u(R.id.state_layer, inflate);
                            if (composeView2 != null) {
                                i = R.id.thumbnail;
                                ImageView imageView = (ImageView) z.u(R.id.thumbnail, inflate);
                                if (imageView != null) {
                                    i = R.id.title;
                                    TextView textView = (TextView) z.u(R.id.title, inflate);
                                    if (textView != null) {
                                        this.c = new com.amazon.aps.iva.f70.d(constraintLayout, composeView, playableAssetDurationLabelLayout, frameLayout, progressBar, frameLayout2, composeView2, imageView, textView);
                                        this.d = (T) aVar.invoke(frameLayout);
                                        this.e = (D) bVar.invoke(frameLayout2);
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

    private final g getPresenter() {
        return (g) this.b.getValue();
    }

    @Override // com.amazon.aps.iva.kz.j
    public final void D1(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "episodeNumber");
        TextView textView = this.c.g;
        textView.setVisibility(0);
        textView.setText(textView.getResources().getString(R.string.season_episode_title_format, str, ""));
    }

    @Override // com.amazon.aps.iva.kz.j
    public final void N0(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "title");
        TextView textView = this.c.g;
        textView.setVisibility(0);
        textView.setText(str);
    }

    public final void b1(final a aVar, final i iVar) {
        boolean a;
        boolean z;
        int i;
        com.amazon.aps.iva.yb0.j.f(iVar, "asset");
        com.amazon.aps.iva.yb0.j.f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Context context = getContext();
        com.amazon.aps.iva.yb0.j.e(context, "context");
        boolean c = k.n(context).c();
        boolean z2 = false;
        com.amazon.aps.iva.f70.d dVar = this.c;
        if (c) {
            Resources resources = getResources();
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = R.dimen.paragraph_font_size;
            } else {
                i = R.dimen.paragraph_tiny_font_size;
            }
            dVar.g.setTextSize(0, resources.getDimensionPixelSize(i));
        }
        getPresenter().H3(iVar);
        dVar.e.setContent(com.amazon.aps.iva.v0.b.c(-1791992153, new c(iVar), true));
        dVar.b.setContent(com.amazon.aps.iva.v0.b.c(-826063920, new d(iVar), true));
        com.amazon.aps.iva.lz.c cVar = new com.amazon.aps.iva.lz.c(iVar.h, iVar.l);
        PlayableAssetDurationLabelLayout playableAssetDurationLabelLayout = dVar.c;
        playableAssetDurationLabelLayout.getClass();
        com.amazon.aps.iva.lz.a aVar2 = playableAssetDurationLabelLayout.b;
        aVar2.getClass();
        aVar2.b = cVar;
        a.g gVar = a.g.d;
        com.amazon.aps.iva.ot.a aVar3 = cVar.b;
        if (com.amazon.aps.iva.yb0.j.a(aVar3, gVar)) {
            a = true;
        } else {
            a = com.amazon.aps.iva.yb0.j.a(aVar3, a.h.d);
        }
        if (a) {
            aVar2.getView().k();
            aVar2.getView().setText(aVar3.a);
        } else if (aVar3 instanceof a.d) {
            aVar2.getView().k();
            aVar2.getView().setText(((a.d) aVar3).d);
        } else {
            com.amazon.aps.iva.lz.c cVar2 = aVar2.b;
            if (cVar2 != null) {
                if (cVar2.a.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    aVar2.getView().f();
                } else {
                    aVar2.getView().k();
                    com.amazon.aps.iva.lz.b view = aVar2.getView();
                    com.amazon.aps.iva.lz.c cVar3 = aVar2.b;
                    if (cVar3 != null) {
                        view.setText(cVar3.a);
                    } else {
                        com.amazon.aps.iva.yb0.j.m("model");
                        throw null;
                    }
                }
            } else {
                com.amazon.aps.iva.yb0.j.m("model");
                throw null;
            }
        }
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.asset_item_wrapper);
        viewGroup.setOnClickListener(new s(1, aVar, iVar));
        viewGroup.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.amazon.aps.iva.kz.b
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                a aVar4 = a.this;
                com.amazon.aps.iva.yb0.j.f(aVar4, "$listener");
                i iVar2 = iVar;
                com.amazon.aps.iva.yb0.j.f(iVar2, "$asset");
                aVar4.b4(iVar2);
                return true;
            }
        });
    }

    public final T getLeftUiComponent() {
        return this.d;
    }

    public final D getRightUiComponent() {
        return this.e;
    }

    @Override // com.amazon.aps.iva.kz.j
    public final void p() {
        TextView textView = this.c.g;
        com.amazon.aps.iva.yb0.j.e(textView, "binding.title");
        textView.setVisibility(8);
    }

    @Override // com.amazon.aps.iva.kz.j
    public final void q1(List<Image> list) {
        com.amazon.aps.iva.yb0.j.f(list, "thumbnails");
        ImageUtil imageUtil = ImageUtil.INSTANCE;
        Context context = getContext();
        ImageView imageView = this.c.f;
        com.amazon.aps.iva.yb0.j.e(context, "context");
        com.amazon.aps.iva.yb0.j.e(imageView, "thumbnail");
        com.amazon.aps.iva.ly.c.b(imageUtil, context, list, imageView, null, Integer.valueOf((int) R.color.cr_woodsmoke), Integer.valueOf((int) R.color.cr_black_pearl), 8);
    }

    @Override // com.amazon.aps.iva.kz.j
    public void setWatchProgress(int i) {
        this.c.d.setProgress(i);
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(getPresenter());
    }
}
