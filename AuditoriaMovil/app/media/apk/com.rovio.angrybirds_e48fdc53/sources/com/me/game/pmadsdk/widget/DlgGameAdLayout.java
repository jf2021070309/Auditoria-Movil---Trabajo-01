package com.me.game.pmadsdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.me.game.pmadsdk.PMAdSDK;
import com.me.game.pmadsdk.resource.BitmapUtils11;
import com.me.game.pmadsdk.resource.StringUtil_11;
import com.me.game.pmadsdk.utils.DisplayUtils;
import com.me.game.pmadsdk.utils.LoggerUtils;
/* loaded from: classes6.dex */
public class DlgGameAdLayout extends FrameLayout {
    private ImageView mAdImageView;
    protected View.OnClickListener mClickAdListener;
    protected View.OnClickListener mCloseListener;
    private ImageView mCloseView;
    private TextView mTipsTextView;

    public DlgGameAdLayout(Context context) {
        super(context);
        addContent(context);
        setWillNotDraw(false);
    }

    protected void addContent(Context context) {
        FrameLayout rootLayout = new FrameLayout(context);
        addView(rootLayout, new FrameLayout.LayoutParams(-1, -1));
        addAdImage(context, rootLayout);
        addClose(context, rootLayout);
        addTips(context, rootLayout);
    }

    protected void addAdImage(Context context, FrameLayout rootLayout) {
        ImageView imageView = new ImageView(context);
        this.mAdImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mAdImageView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.widget.DlgGameAdLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameAdLayout.this.mClickAdListener != null) {
                    DlgGameAdLayout.this.mClickAdListener.onClick(v);
                }
            }
        });
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(-1, -1);
        params.gravity = 17;
        rootLayout.addView(this.mAdImageView, params);
    }

    protected void addClose(Context context, FrameLayout rootLayout) {
        ImageView imageView = new ImageView(context);
        this.mCloseView = imageView;
        imageView.setVisibility(8);
        this.mCloseView.setImageDrawable(BitmapUtils11.getIns().getDrawable("icon_close.png"));
        this.mCloseView.setPadding(0, 0, 0, 0);
        this.mCloseView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.widget.DlgGameAdLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameAdLayout.this.mCloseListener != null) {
                    DlgGameAdLayout.this.mCloseListener.onClick(v);
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DisplayUtils.getIns().dip2px(30.0f), DisplayUtils.getIns().dip2px(30.0f));
        layoutParams.rightMargin = DisplayUtils.getIns().dip2px(14.0f);
        layoutParams.topMargin = DisplayUtils.getIns().dip2px(17.0f);
        layoutParams.gravity = 8388613;
        rootLayout.addView(this.mCloseView, layoutParams);
    }

    protected void addTips(Context context, FrameLayout rootLayout) {
        TextView textView = new TextView(context);
        this.mTipsTextView = textView;
        textView.setVisibility(8);
        this.mTipsTextView.setTextSize(12.0f);
        this.mTipsTextView.setTextColor(getResources().getColor(17170443));
        this.mTipsTextView.setText(StringUtil_11.getIns().getLanguageBean().text_click_continue_game);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = DisplayUtils.getIns().dip2px(16.0f);
        layoutParams.gravity = 81;
        rootLayout.addView(this.mTipsTextView, layoutParams);
    }

    public void showTips() {
        this.mTipsTextView.setVisibility(0);
        this.mCloseView.setVisibility(8);
    }

    public void hideTips() {
        this.mTipsTextView.setVisibility(8);
        this.mCloseView.setVisibility(0);
    }

    public void setCloseListener(View.OnClickListener closeListener) {
        this.mCloseListener = closeListener;
    }

    public void setClickAdListener(View.OnClickListener clickAdListener) {
        this.mClickAdListener = clickAdListener;
    }

    public void showAd(final String adUrl, final int showLogic) {
        SimpleTarget<Bitmap> target = new SimpleTarget<Bitmap>() { // from class: com.me.game.pmadsdk.widget.DlgGameAdLayout.3
            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                Glide.with(DlgGameAdLayout.this.getContext()).load(adUrl).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)).into(DlgGameAdLayout.this.mAdImageView);
                if (showLogic == 2) {
                    DlgGameAdLayout.this.showTips();
                } else {
                    DlgGameAdLayout.this.hideTips();
                }
            }
        };
        Glide.with(getContext()).asBitmap().load(adUrl).into((RequestBuilder<Bitmap>) target);
        PMAdSDK.mPmAdSDK.postDelayed(new Runnable() { // from class: com.me.game.pmadsdk.widget.DlgGameAdLayout.4
            @Override // java.lang.Runnable
            public void run() {
                LoggerUtils.e("hhhhh", "width = " + DlgGameAdLayout.this.getWidth());
                LoggerUtils.e("hhhhh", "height = " + DlgGameAdLayout.this.getHeight());
            }
        }, 1000L);
    }

    public static DlgGameAdLayout newInstance(Context context) {
        return new DlgGameAdLayout(context);
    }
}
