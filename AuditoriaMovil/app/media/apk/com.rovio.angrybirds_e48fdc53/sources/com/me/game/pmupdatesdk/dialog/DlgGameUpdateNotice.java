package com.me.game.pmupdatesdk.dialog;

import android.content.Context;
import android.view.View;
import com.me.game.pmupdatesdk.PMUpdateSDK;
import com.me.game.pmupdatesdk.bean.GameUpdateNoticeBean;
import com.me.game.pmupdatesdk.interfaces.OnDialogCloseListener;
import com.me.game.pmupdatesdk.network.ProtocolEventReported;
import com.me.game.pmupdatesdk.utils.LoggerUtils;
import com.me.game.pmupdatesdk.widget.DlgGameUpdateNoticeLayout;
/* loaded from: classes7.dex */
public class DlgGameUpdateNotice extends BaseAlertDialog<DlgGameUpdateNoticeLayout> implements OnDialogCloseListener {
    private String mGameId;
    private GameUpdateNoticeBean mGameUpdateNoticeBean;
    private OnDialogCloseListener mOnDialogCloseListener;

    public DlgGameUpdateNotice(Context context) {
        super(context);
        setCancelable(false);
        this.mMatchWidth = false;
    }

    public DlgGameUpdateNotice setGameUpdateNoticeBean(GameUpdateNoticeBean gameUpdateNoticeBean) {
        this.mGameUpdateNoticeBean = gameUpdateNoticeBean;
        this.mGameId = String.valueOf(gameUpdateNoticeBean.gameId);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.dialog.BaseAlertDialog
    public void initViews(DlgGameUpdateNoticeLayout convertView) {
        LoggerUtils.e("hhhhh", "DlgGameUpdateNotice-initViews");
        convertView.setCloseListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.dialog.DlgGameUpdateNotice.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                DlgGameUpdateNotice dlgGameUpdateNotice = DlgGameUpdateNotice.this;
                dlgGameUpdateNotice.closeDialog(dlgGameUpdateNotice);
            }
        });
        convertView.setBtnListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.dialog.DlgGameUpdateNotice.2
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                PMUpdateSDK.openGameDetail(DlgGameUpdateNotice.this.mContext, DlgGameUpdateNotice.this.mGameId);
                ProtocolEventReported.updateEvent(ProtocolEventReported.UPDATE_SDK_CLICK);
            }
        });
        convertView.setPolicyClickListener(new View.OnClickListener() { // from class: com.me.game.pmupdatesdk.dialog.DlgGameUpdateNotice.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                PMUpdateSDK.openApp(DlgGameUpdateNotice.this.mContext);
            }
        });
        convertView.setVersion(this.mGameUpdateNoticeBean.versionName);
        convertView.setUpdateContent(this.mGameUpdateNoticeBean.updateLog);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.me.game.pmupdatesdk.dialog.BaseAlertDialog
    public DlgGameUpdateNoticeLayout buildDlgContent() {
        return DlgGameUpdateNoticeLayout.newInstance(this.mContext);
    }

    public void setOnDialogCloseListener(OnDialogCloseListener onDialogCloseListener) {
        this.mOnDialogCloseListener = onDialogCloseListener;
    }

    @Override // com.me.game.pmupdatesdk.interfaces.OnDialogCloseListener
    public void closeDialog(BaseAlertDialog alertDialog) {
        OnDialogCloseListener onDialogCloseListener = this.mOnDialogCloseListener;
        if (onDialogCloseListener != null) {
            onDialogCloseListener.closeDialog(alertDialog);
        }
        dismiss();
    }
}
