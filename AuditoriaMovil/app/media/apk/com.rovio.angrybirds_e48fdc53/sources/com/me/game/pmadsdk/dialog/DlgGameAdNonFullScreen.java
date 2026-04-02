package com.me.game.pmadsdk.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import com.me.game.pmadsdk.bean.GameAdBean;
import com.me.game.pmadsdk.helper.LocalAdListHelper;
import com.me.game.pmadsdk.interfaces.OnDialogCloseListener;
import com.me.game.pmadsdk.network.ProtocolEventReported;
import com.me.game.pmadsdk.utils.AppManager;
import com.me.game.pmadsdk.utils.LoggerUtils;
import com.me.game.pmadsdk.widget.DlgGameAdNonFullScreenLayout;
/* loaded from: classes6.dex */
public class DlgGameAdNonFullScreen extends BaseAlertDialog<DlgGameAdNonFullScreenLayout> implements OnDialogCloseListener {
    private static final String TAG = "DlgGameAdNonFullScreen";
    private GameAdBean mGameAdBean;
    private String mGameId;
    public boolean mIsClickAd;
    private OnDialogCloseListener mOnDialogCloseListener;

    public DlgGameAdNonFullScreen(Context context) {
        super(context);
        this.mIsClickAd = false;
        setCancelable(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmadsdk.dialog.BaseAlertDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.setGravity(17);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public DlgGameAdNonFullScreen setGameAdBean(GameAdBean gameAdBean) {
        this.mGameAdBean = gameAdBean;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmadsdk.dialog.BaseAlertDialog
    public void initViews(DlgGameAdNonFullScreenLayout convertView) {
        convertView.setCloseListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.dialog.DlgGameAdNonFullScreen.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                DlgGameAdNonFullScreen dlgGameAdNonFullScreen = DlgGameAdNonFullScreen.this;
                dlgGameAdNonFullScreen.closeDialog(dlgGameAdNonFullScreen);
            }
        });
        convertView.setClickAdListener(new View.OnClickListener() { // from class: com.me.game.pmadsdk.dialog.DlgGameAdNonFullScreen.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                AppManager.openUrl(DlgGameAdNonFullScreen.this.mContext, DlgGameAdNonFullScreen.this.mGameAdBean.linkUrl);
                ProtocolEventReported.updateEvent(DlgGameAdNonFullScreen.this.mGameAdBean.id, ProtocolEventReported.AD_SDK_CLICK);
                DlgGameAdNonFullScreen.this.mIsClickAd = true;
            }
        });
        String imageUrl = this.mGameAdBean.popupImageUrl;
        if (!isEmpty(imageUrl)) {
            LoggerUtils.e("hhhhh", "imageUrl = " + imageUrl);
            convertView.loadImg(imageUrl, this.mGameAdBean.showLogic);
        }
        LocalAdListHelper.getInstance().showUpdateStatus(this.mGameAdBean);
    }

    private boolean isEmpty(String url) {
        return TextUtils.isEmpty(url) || "null".equals(url);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmadsdk.dialog.BaseAlertDialog
    public DlgGameAdNonFullScreenLayout buildDlgContent() {
        return DlgGameAdNonFullScreenLayout.newInstance(this.mContext);
    }

    public void setOnDialogCloseListener(OnDialogCloseListener onDialogCloseListener) {
        this.mOnDialogCloseListener = onDialogCloseListener;
    }

    @Override // com.me.game.pmadsdk.interfaces.OnDialogCloseListener
    public void closeDialog(BaseAlertDialog alertDialog) {
        OnDialogCloseListener onDialogCloseListener = this.mOnDialogCloseListener;
        if (onDialogCloseListener != null) {
            onDialogCloseListener.closeDialog(alertDialog);
        }
        dismiss();
    }
}
