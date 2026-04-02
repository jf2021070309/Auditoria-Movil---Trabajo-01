package com.me.game.pmadsdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
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
public class DlgGameAdNonFullScreenLayout extends FrameLayout {
    private static final String TAG = "DlgGameAdNonFullScreenL";
    private ImageView mAdImageView;
    protected View.OnClickListener mClickAdListener;
    protected View.OnClickListener mCloseListener;
    private ImageView mCloseView;
    private TextView mTipsTextView;

    public DlgGameAdNonFullScreenLayout(Context context) {
        super(context);
        addContent(context);
        setWillNotDraw(false);
    }

    protected void addContent(Context context) {
        FrameLayout rootLayout = new FrameLayout(context);
        addView(rootLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout imgLayout = new FrameLayout(context);
        FrameLayout.LayoutParams imgLayoutParams = new FrameLayout.LayoutParams(-2, -2);
        imgLayoutParams.gravity = 17;
        rootLayout.addView(imgLayout, imgLayoutParams);
        addAdImage(context, imgLayout);
        addClose(context, imgLayout);
        addTips(context, rootLayout);
    }

    protected void addAdImage(Context context, FrameLayout rootLayout) {
        ImageView imageView = new ImageView(context);
        this.mAdImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.mAdImageView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.widget.DlgGameAdNonFullScreenLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameAdNonFullScreenLayout.this.mClickAdListener != null) {
                    DlgGameAdNonFullScreenLayout.this.mClickAdListener.onClick(v);
                }
            }
        });
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(-2, -2);
        params.gravity = 17;
        rootLayout.addView(this.mAdImageView, params);
    }

    protected void addClose(Context context, FrameLayout rootLayout) {
        ImageView imageView = new ImageView(context);
        this.mCloseView = imageView;
        imageView.setVisibility(8);
        this.mCloseView.setImageDrawable(BitmapUtils11.getIns().getDrawable("icon_close.png"));
        this.mCloseView.setPadding(0, 0, 0, 0);
        this.mCloseView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.widget.DlgGameAdNonFullScreenLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameAdNonFullScreenLayout.this.mCloseListener != null) {
                    DlgGameAdNonFullScreenLayout.this.mCloseListener.onClick(v);
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DisplayUtils.getIns().dip2px(30.0f), DisplayUtils.getIns().dip2px(30.0f));
        layoutParams.rightMargin = DisplayUtils.getIns().dip2px(9.0f);
        layoutParams.topMargin = DisplayUtils.getIns().dip2px(9.0f);
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
        int screenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        int screenHeight = getContext().getResources().getDisplayMetrics().heightPixels;
        if (screenWidth < screenHeight) {
            layoutParams.bottomMargin = DisplayUtils.getIns().dip2px(60.0f);
        } else {
            layoutParams.bottomMargin = DisplayUtils.getIns().dip2px(20.0f);
        }
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

    public void showAd(String adUrl) {
        Glide.with(getContext()).load(adUrl).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)).into(this.mAdImageView);
        PMAdSDK.mPmAdSDK.postDelayed(new Runnable() { // from class: com.me.game.pmadsdk.widget.DlgGameAdNonFullScreenLayout.3
            @Override // java.lang.Runnable
            public void run() {
                LoggerUtils.e("hhhhh", "width = " + DlgGameAdNonFullScreenLayout.this.getWidth());
                LoggerUtils.e("hhhhh", "height = " + DlgGameAdNonFullScreenLayout.this.getHeight());
            }
        }, 1000L);
    }

    public void loadImg(final String url, final int showLogic) {
        final int screenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        final int screenHeight = getContext().getResources().getDisplayMetrics().heightPixels;
        LoggerUtils.i(TAG, "屏幕宽度=" + screenWidth + " 屏幕高度=" + screenHeight);
        SimpleTarget<Bitmap> target = new SimpleTarget<Bitmap>() { // from class: com.me.game.pmadsdk.widget.DlgGameAdNonFullScreenLayout.4
            @Override // com.bumptech.glide.request.target.Target
            public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
                onResourceReady((Bitmap) obj, (Transition<? super Bitmap>) transition);
            }

            public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                int height;
                int width;
                if (resource != null) {
                    int imageWidth = resource.getWidth();
                    int imageHeight = resource.getHeight();
                    LoggerUtils.i(DlgGameAdNonFullScreenLayout.TAG, "图片宽=" + imageWidth + " 图片高=" + imageHeight);
                    int i = screenWidth;
                    int height2 = screenHeight;
                    if (i < height2) {
                        width = (int) (i * 0.8d);
                        height = (width * imageHeight) / imageWidth;
                    } else {
                        height = (int) (height2 * 0.8d);
                        width = (height * imageWidth) / imageHeight;
                    }
                    ViewGroup.LayoutParams para = DlgGameAdNonFullScreenLayout.this.mAdImageView.getLayoutParams();
                    para.height = height;
                    para.width = width;
                    DlgGameAdNonFullScreenLayout.this.mAdImageView.setLayoutParams(para);
                    Glide.with(DlgGameAdNonFullScreenLayout.this.getContext()).load(url).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.ALL)).into(DlgGameAdNonFullScreenLayout.this.mAdImageView);
                    if (showLogic == 2) {
                        DlgGameAdNonFullScreenLayout.this.showTips();
                    } else {
                        DlgGameAdNonFullScreenLayout.this.hideTips();
                    }
                }
            }
        };
        Glide.with(getContext()).asBitmap().load(url).into((RequestBuilder<Bitmap>) target);
    }

    public static DlgGameAdNonFullScreenLayout newInstance(Context context) {
        return new DlgGameAdNonFullScreenLayout(context);
    }
}
