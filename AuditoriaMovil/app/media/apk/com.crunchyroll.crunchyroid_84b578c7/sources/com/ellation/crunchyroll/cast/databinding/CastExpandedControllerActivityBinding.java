package com.ellation.crunchyroll.cast.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.d9.a;
import com.amazon.aps.iva.e.z;
import com.ellation.crunchyroll.cast.R;
import com.ellation.crunchyroll.ui.databinding.LayoutErrorsBinding;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
/* loaded from: classes2.dex */
public final class CastExpandedControllerActivityBinding implements a {
    public final View adBackgroundImageView;
    public final RelativeLayout adContainer;
    public final ImageView adImageView;
    public final TextView adInProgressLabel;
    public final TextView adLabel;
    public final TextView adSkipButton;
    public final TextView adSkipText;
    public final ImageView backgroundImageView;
    public final ImageView backgroundPlaceHolderImageView;
    public final ImageView blurredBackgroundImageView;
    public final ImageButton button0;
    public final ImageButton button1;
    public final ImageButton button2;
    public final ImageButton button3;
    public final ImageButton buttonPlayPauseToggle;
    public final TextView castControllerSubtitle;
    public final TextView castControllerTitle;
    public final ComposeView castOverlays;
    public final CastSeekBar castSeekBar;
    public final RelativeLayout controllers;
    public final TextView endText;
    public final RelativeLayout endTextContainer;
    public final ConstraintLayout episodeInfoContainer;
    public final LayoutErrorsBinding errorsLayout;
    public final RelativeLayout expandedControllerLayout;
    public final ImageView liveIndicatorDot;
    public final TextView liveIndicatorText;
    public final RelativeLayout liveIndicators;
    public final ProgressBar loadingIndicator;
    public final ImageView primaryBackgroundImageView;
    private final RelativeLayout rootView;
    public final RelativeLayout seekBarIndicators;
    public final TextView startText;
    public final RelativeLayout startTextContainer;
    public final TextView statusText;
    public final Toolbar toolbar;
    public final TextView tooltip;
    public final RelativeLayout tooltipContainer;

    private CastExpandedControllerActivityBinding(RelativeLayout relativeLayout, View view, RelativeLayout relativeLayout2, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, ImageButton imageButton4, ImageButton imageButton5, TextView textView5, TextView textView6, ComposeView composeView, CastSeekBar castSeekBar, RelativeLayout relativeLayout3, TextView textView7, RelativeLayout relativeLayout4, ConstraintLayout constraintLayout, LayoutErrorsBinding layoutErrorsBinding, RelativeLayout relativeLayout5, ImageView imageView5, TextView textView8, RelativeLayout relativeLayout6, ProgressBar progressBar, ImageView imageView6, RelativeLayout relativeLayout7, TextView textView9, RelativeLayout relativeLayout8, TextView textView10, Toolbar toolbar, TextView textView11, RelativeLayout relativeLayout9) {
        this.rootView = relativeLayout;
        this.adBackgroundImageView = view;
        this.adContainer = relativeLayout2;
        this.adImageView = imageView;
        this.adInProgressLabel = textView;
        this.adLabel = textView2;
        this.adSkipButton = textView3;
        this.adSkipText = textView4;
        this.backgroundImageView = imageView2;
        this.backgroundPlaceHolderImageView = imageView3;
        this.blurredBackgroundImageView = imageView4;
        this.button0 = imageButton;
        this.button1 = imageButton2;
        this.button2 = imageButton3;
        this.button3 = imageButton4;
        this.buttonPlayPauseToggle = imageButton5;
        this.castControllerSubtitle = textView5;
        this.castControllerTitle = textView6;
        this.castOverlays = composeView;
        this.castSeekBar = castSeekBar;
        this.controllers = relativeLayout3;
        this.endText = textView7;
        this.endTextContainer = relativeLayout4;
        this.episodeInfoContainer = constraintLayout;
        this.errorsLayout = layoutErrorsBinding;
        this.expandedControllerLayout = relativeLayout5;
        this.liveIndicatorDot = imageView5;
        this.liveIndicatorText = textView8;
        this.liveIndicators = relativeLayout6;
        this.loadingIndicator = progressBar;
        this.primaryBackgroundImageView = imageView6;
        this.seekBarIndicators = relativeLayout7;
        this.startText = textView9;
        this.startTextContainer = relativeLayout8;
        this.statusText = textView10;
        this.toolbar = toolbar;
        this.tooltip = textView11;
        this.tooltipContainer = relativeLayout9;
    }

    public static CastExpandedControllerActivityBinding bind(View view) {
        int i = R.id.ad_background_image_view;
        View u = z.u(i, view);
        if (u != null) {
            i = R.id.ad_container;
            RelativeLayout relativeLayout = (RelativeLayout) z.u(i, view);
            if (relativeLayout != null) {
                i = R.id.ad_image_view;
                ImageView imageView = (ImageView) z.u(i, view);
                if (imageView != null) {
                    i = R.id.ad_in_progress_label;
                    TextView textView = (TextView) z.u(i, view);
                    if (textView != null) {
                        i = R.id.ad_label;
                        TextView textView2 = (TextView) z.u(i, view);
                        if (textView2 != null) {
                            i = R.id.ad_skip_button;
                            TextView textView3 = (TextView) z.u(i, view);
                            if (textView3 != null) {
                                i = R.id.ad_skip_text;
                                TextView textView4 = (TextView) z.u(i, view);
                                if (textView4 != null) {
                                    i = R.id.background_image_view;
                                    ImageView imageView2 = (ImageView) z.u(i, view);
                                    if (imageView2 != null) {
                                        i = R.id.background_place_holder_image_view;
                                        ImageView imageView3 = (ImageView) z.u(i, view);
                                        if (imageView3 != null) {
                                            i = R.id.blurred_background_image_view;
                                            ImageView imageView4 = (ImageView) z.u(i, view);
                                            if (imageView4 != null) {
                                                i = R.id.button_0;
                                                ImageButton imageButton = (ImageButton) z.u(i, view);
                                                if (imageButton != null) {
                                                    i = R.id.button_1;
                                                    ImageButton imageButton2 = (ImageButton) z.u(i, view);
                                                    if (imageButton2 != null) {
                                                        i = R.id.button_2;
                                                        ImageButton imageButton3 = (ImageButton) z.u(i, view);
                                                        if (imageButton3 != null) {
                                                            i = R.id.button_3;
                                                            ImageButton imageButton4 = (ImageButton) z.u(i, view);
                                                            if (imageButton4 != null) {
                                                                i = R.id.button_play_pause_toggle;
                                                                ImageButton imageButton5 = (ImageButton) z.u(i, view);
                                                                if (imageButton5 != null) {
                                                                    i = R.id.cast_controller_subtitle;
                                                                    TextView textView5 = (TextView) z.u(i, view);
                                                                    if (textView5 != null) {
                                                                        i = R.id.cast_controller_title;
                                                                        TextView textView6 = (TextView) z.u(i, view);
                                                                        if (textView6 != null) {
                                                                            i = R.id.cast_overlays;
                                                                            ComposeView composeView = (ComposeView) z.u(i, view);
                                                                            if (composeView != null) {
                                                                                i = R.id.cast_seek_bar;
                                                                                CastSeekBar castSeekBar = (CastSeekBar) z.u(i, view);
                                                                                if (castSeekBar != null) {
                                                                                    i = R.id.controllers;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) z.u(i, view);
                                                                                    if (relativeLayout2 != null) {
                                                                                        i = R.id.end_text;
                                                                                        TextView textView7 = (TextView) z.u(i, view);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.end_text_container;
                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) z.u(i, view);
                                                                                            if (relativeLayout3 != null) {
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) z.u(R.id.episode_info_container, view);
                                                                                                i = R.id.errors_layout;
                                                                                                View u2 = z.u(i, view);
                                                                                                if (u2 != null) {
                                                                                                    LayoutErrorsBinding bind = LayoutErrorsBinding.bind(u2);
                                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                                                                                    i = R.id.live_indicator_dot;
                                                                                                    ImageView imageView5 = (ImageView) z.u(i, view);
                                                                                                    if (imageView5 != null) {
                                                                                                        i = R.id.live_indicator_text;
                                                                                                        TextView textView8 = (TextView) z.u(i, view);
                                                                                                        if (textView8 != null) {
                                                                                                            i = R.id.live_indicators;
                                                                                                            RelativeLayout relativeLayout5 = (RelativeLayout) z.u(i, view);
                                                                                                            if (relativeLayout5 != null) {
                                                                                                                i = R.id.loading_indicator;
                                                                                                                ProgressBar progressBar = (ProgressBar) z.u(i, view);
                                                                                                                if (progressBar != null) {
                                                                                                                    i = R.id.primary_background_image_view;
                                                                                                                    ImageView imageView6 = (ImageView) z.u(i, view);
                                                                                                                    if (imageView6 != null) {
                                                                                                                        i = R.id.seek_bar_indicators;
                                                                                                                        RelativeLayout relativeLayout6 = (RelativeLayout) z.u(i, view);
                                                                                                                        if (relativeLayout6 != null) {
                                                                                                                            i = R.id.start_text;
                                                                                                                            TextView textView9 = (TextView) z.u(i, view);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i = R.id.start_text_container;
                                                                                                                                RelativeLayout relativeLayout7 = (RelativeLayout) z.u(i, view);
                                                                                                                                if (relativeLayout7 != null) {
                                                                                                                                    i = R.id.status_text;
                                                                                                                                    TextView textView10 = (TextView) z.u(i, view);
                                                                                                                                    if (textView10 != null) {
                                                                                                                                        i = R.id.toolbar;
                                                                                                                                        Toolbar toolbar = (Toolbar) z.u(i, view);
                                                                                                                                        if (toolbar != null) {
                                                                                                                                            i = R.id.tooltip;
                                                                                                                                            TextView textView11 = (TextView) z.u(i, view);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                i = R.id.tooltip_container;
                                                                                                                                                RelativeLayout relativeLayout8 = (RelativeLayout) z.u(i, view);
                                                                                                                                                if (relativeLayout8 != null) {
                                                                                                                                                    return new CastExpandedControllerActivityBinding(relativeLayout4, u, relativeLayout, imageView, textView, textView2, textView3, textView4, imageView2, imageView3, imageView4, imageButton, imageButton2, imageButton3, imageButton4, imageButton5, textView5, textView6, composeView, castSeekBar, relativeLayout2, textView7, relativeLayout3, constraintLayout, bind, relativeLayout4, imageView5, textView8, relativeLayout5, progressBar, imageView6, relativeLayout6, textView9, relativeLayout7, textView10, toolbar, textView11, relativeLayout8);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CastExpandedControllerActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CastExpandedControllerActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cast_expanded_controller_activity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // com.amazon.aps.iva.d9.a
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
