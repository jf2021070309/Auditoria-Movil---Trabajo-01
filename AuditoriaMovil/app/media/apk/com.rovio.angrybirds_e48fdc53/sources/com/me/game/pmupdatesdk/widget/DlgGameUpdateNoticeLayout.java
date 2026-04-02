package com.me.game.pmupdatesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.me.game.pm_tools.i0;
import com.me.game.pmupdatesdk.drawable.BackgroundDrawable;
import com.me.game.pmupdatesdk.resource.BitmapUtils11;
import com.me.game.pmupdatesdk.resource.Colors;
import com.me.game.pmupdatesdk.resource.StringUtil_11;
import com.me.game.pmupdatesdk.utils.DisplayUtils;
/* loaded from: classes7.dex */
public class DlgGameUpdateNoticeLayout extends FrameLayout {
    protected View.OnClickListener mBtnClickListener;
    protected View.OnClickListener mCloseListener;
    protected Drawable mDrawable;
    protected View.OnClickListener mPolicyClickListener;
    private TextView mUpdateContentView;
    private TextView mVersionView;

    public DlgGameUpdateNoticeLayout(Context context) {
        super(context);
        setBackground(new BackgroundDrawable(-1).setRadius(DisplayUtils.getIns().dip2px(13.0f)));
        addContent(context);
        setWillNotDraw(false);
    }

    protected void addContent(Context context) {
        LinearLayout rootLayout = new LinearLayout(context);
        addView(rootLayout, new LinearLayout.LayoutParams(-1, -2));
        rootLayout.setOrientation(1);
        rootLayout.setGravity(17);
        rootLayout.setPadding(0, DisplayUtils.getIns().dip2px(20.0f), 0, DisplayUtils.getIns().dip2px(20.0f));
        LinearLayout contentLayout = new LinearLayout(context);
        contentLayout.setOrientation(1);
        contentLayout.setPadding(DisplayUtils.getIns().dip2px(20.0f), 0, DisplayUtils.getIns().dip2px(20.0f), 0);
        rootLayout.addView(contentLayout);
        TextView mTitleView = new TextView(context);
        mTitleView.setText(StringUtil_11.getIns().getLanguageBean().text_new_version_find);
        mTitleView.setTextColor(-1);
        mTitleView.setGravity(3);
        mTitleView.setTextSize(18.0f);
        mTitleView.setTypeface(Typeface.defaultFromStyle(1));
        contentLayout.addView(mTitleView);
        TextView textView = new TextView(context);
        this.mVersionView = textView;
        textView.setText("v3.2.13");
        this.mVersionView.setTextColor(-1);
        this.mVersionView.setGravity(3);
        this.mVersionView.setTextSize(12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = DisplayUtils.getIns().dip2px(12.0f);
        contentLayout.addView(this.mVersionView, layoutParams);
        ScrollView mScrollView = new ScrollView(context);
        mScrollView.setVerticalScrollBarEnabled(false);
        LinearLayout updateContentLayout = new LinearLayout(context);
        updateContentLayout.setOrientation(1);
        mScrollView.addView(updateContentLayout);
        contentLayout.addView(mScrollView, new LinearLayout.LayoutParams(-1, DisplayUtils.getIns().dip2px(120.0f)));
        TextView mUpdateTipView = new TextView(context);
        mUpdateTipView.setText(StringUtil_11.getIns().getLanguageBean().text_update_content);
        mUpdateTipView.setTextColor(-14540234);
        mUpdateTipView.setTextSize(13.0f);
        mUpdateTipView.setTypeface(Typeface.defaultFromStyle(1));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = DisplayUtils.getIns().dip2px(30.0f);
        updateContentLayout.addView(mUpdateTipView, layoutParams2);
        TextView textView2 = new TextView(context);
        this.mUpdateContentView = textView2;
        textView2.setText("Added oversized self-built houses, pet houses and newpet furniture");
        this.mUpdateContentView.setTextColor(-10132112);
        this.mUpdateContentView.setTextSize(13.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = DisplayUtils.getIns().dip2px(10.0f);
        updateContentLayout.addView(this.mUpdateContentView, layoutParams3);
        SolidTextView mBtnView = new SolidTextView(context);
        mBtnView.setTextSize(14.0f);
        mBtnView.setCircle(true);
        mBtnView.setTextColor(-1);
        mBtnView.setGravity(17);
        mBtnView.setTextAlignment(1);
        mBtnView.setColorStateList(Colors.BLUE_BG);
        mBtnView.setText(StringUtil_11.getIns().getLanguageBean().text_update);
        mBtnView.setTypeface(Typeface.defaultFromStyle(1));
        mBtnView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.widget.DlgGameUpdateNoticeLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameUpdateNoticeLayout.this.mBtnClickListener != null) {
                    DlgGameUpdateNoticeLayout.this.mBtnClickListener.onClick(v);
                }
            }
        });
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, DisplayUtils.getIns().dip2px(35.0f));
        layoutParams4.topMargin = DisplayUtils.getIns().dip2px(15.0f);
        contentLayout.addView(mBtnView, layoutParams4);
        String policyTxt = StringUtil_11.getIns().getLanguageBean().text_policy;
        TextView mPolicyView = new TextView(context);
        mPolicyView.setTextColor(i0.g);
        mPolicyView.setTextSize(12.0f);
        mPolicyView.setLineSpacing(12.0f, 1.0f);
        SpannableString spannableString = new SpannableString(policyTxt + "  ");
        Drawable drawable = BitmapUtils11.getIns().getDrawable("icon_next.png");
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        ImageSpan imageSpan = new ImageSpan(drawable, 1);
        spannableString.setSpan(imageSpan, spannableString.length() - 1, spannableString.length(), 17);
        mPolicyView.setText(spannableString);
        mPolicyView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.widget.DlgGameUpdateNoticeLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameUpdateNoticeLayout.this.mPolicyClickListener != null) {
                    DlgGameUpdateNoticeLayout.this.mPolicyClickListener.onClick(v);
                }
            }
        });
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = DisplayUtils.getIns().dip2px(10.0f);
        contentLayout.addView(mPolicyView, layoutParams5);
        addCloseAndBg(context, "icon_bg.png");
    }

    protected void addCloseAndBg(Context context, String bg) {
        ImageView closeView = new ImageView(context);
        closeView.setImageDrawable(BitmapUtils11.getIns().getDrawable("icon_close.png"));
        int padding = DisplayUtils.getIns().dip2px(10.0f);
        closeView.setPadding(padding, padding, padding, padding);
        closeView.setOnClickListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.widget.DlgGameUpdateNoticeLayout.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                if (DlgGameUpdateNoticeLayout.this.mCloseListener != null) {
                    DlgGameUpdateNoticeLayout.this.mCloseListener.onClick(v);
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(DisplayUtils.getIns().dip2px(34.0f), DisplayUtils.getIns().dip2px(34.0f));
        layoutParams.gravity = 8388613;
        addView(closeView, layoutParams);
        this.mDrawable = BitmapUtils11.getIns().getDrawable(bg);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.mDrawable;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        try {
            int right2 = getWidth();
            int bottom2 = (getWidth() * this.mDrawable.getIntrinsicHeight()) / this.mDrawable.getIntrinsicWidth();
            this.mDrawable.setBounds(0, 0, right2, bottom2);
        } catch (Exception e) {
        }
    }

    public void setCloseListener(View.OnClickListener closeListener) {
        this.mCloseListener = closeListener;
    }

    public void setBtnListener(View.OnClickListener listener) {
        this.mBtnClickListener = listener;
    }

    public void setPolicyClickListener(View.OnClickListener listener) {
        this.mPolicyClickListener = listener;
    }

    public void setVersion(String version) {
        TextView textView = this.mVersionView;
        if (textView != null) {
            textView.setText(ExifInterface.GPS_MEASUREMENT_INTERRUPTED + version);
        }
    }

    public void setUpdateContent(String updateContent) {
        TextView textView = this.mUpdateContentView;
        if (textView != null) {
            textView.setText(Html.fromHtml(updateContent));
        }
    }

    public static DlgGameUpdateNoticeLayout newInstance(Context context) {
        return new DlgGameUpdateNoticeLayout(context);
    }
}
