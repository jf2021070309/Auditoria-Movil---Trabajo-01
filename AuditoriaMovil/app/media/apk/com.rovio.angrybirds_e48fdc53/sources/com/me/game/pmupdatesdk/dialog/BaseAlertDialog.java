package com.me.game.pmupdatesdk.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.me.game.pmupdatesdk.utils.DisplayUtils;
import com.me.game.pmupdatesdk.utils.DlgManagerHelper;
/* loaded from: classes7.dex */
public abstract class BaseAlertDialog<V extends View> extends AlertDialog {
    protected V convertView;
    protected Context mContext;
    protected LayoutInflater mLayoutInflater;
    protected boolean mMatchWidth;
    protected int width;

    protected abstract V buildDlgContent();

    protected abstract void initViews(V v);

    public BaseAlertDialog(Context context) {
        this(context, 16974376);
    }

    protected BaseAlertDialog(Context context, int themeResId) {
        super(context, themeResId);
        this.mMatchWidth = true;
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        setCancelable(false);
    }

    public Context getCurContext() {
        return this.mContext;
    }

    public BaseAlertDialog setTouchCancel(boolean cancel) {
        setCancelable(cancel);
        return this;
    }

    public BaseAlertDialog setDialogOnDismissListener(DialogInterface.OnDismissListener listener) {
        setOnDismissListener(listener);
        return this;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Window window = getWindow();
            WindowManager.LayoutParams layoutParams = window.getAttributes();
            int i = this.width;
            if (i == 0) {
                layoutParams.width = getDlgWidth();
            } else {
                layoutParams.width = i;
            }
            if (this.mMatchWidth) {
                layoutParams.height = getDlgHeight();
            }
            layoutParams.gravity = 17;
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, 0);
            window.setBackgroundDrawable(insetDrawable);
            V buildDlgContent = buildDlgContent();
            this.convertView = buildDlgContent;
            buildDlgContent.setLayoutParams(layoutParams);
            setContentView(this.convertView);
            initViews(this.convertView);
            initData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected int getDlgWidth() {
        DisplayMetrics metrics = this.mContext.getResources().getDisplayMetrics();
        if (metrics.widthPixels > metrics.heightPixels) {
            return DisplayUtils.getIns().dip2px(360.0f);
        }
        return metrics.widthPixels - (DisplayUtils.getIns().dip2px(13.0f) * 2);
    }

    protected int getDlgHeight() {
        DisplayMetrics metrics = this.mContext.getResources().getDisplayMetrics();
        if (metrics.widthPixels > metrics.heightPixels) {
            return metrics.heightPixels - (DisplayUtils.getIns().dip2px(13.0f) * 2);
        }
        return metrics.widthPixels - (DisplayUtils.getIns().dip2px(13.0f) * 2);
    }

    protected void initData() {
    }

    public static void release(BaseAlertDialog dialog) {
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        DlgManagerHelper.getIns().addDialog(this.mContext, this);
    }

    public void dismissNow() {
        try {
            super.dismiss();
        } catch (Exception e) {
        }
    }
}
