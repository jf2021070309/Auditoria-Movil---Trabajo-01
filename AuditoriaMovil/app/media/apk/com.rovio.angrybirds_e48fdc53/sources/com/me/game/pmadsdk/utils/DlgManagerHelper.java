package com.me.game.pmadsdk.utils;

import android.content.Context;
import android.os.Looper;
import com.me.game.pmadsdk.base.BaseUtils;
import com.me.game.pmadsdk.dialog.BaseAlertDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public class DlgManagerHelper extends BaseUtils {
    public static final int TYPE_DETAIL = 1;
    public static final int TYPE_NONE = 0;
    private static volatile DlgManagerHelper mInst;
    private HashMap<Object, List<BaseAlertDialog>> hashMap = new HashMap<>();

    private DlgManagerHelper() {
    }

    public static DlgManagerHelper getIns() {
        synchronized (DlgManagerHelper.class) {
            if (mInst == null) {
                mInst = new DlgManagerHelper();
            }
        }
        return mInst;
    }

    private List<BaseAlertDialog> getDialogList(Context context) {
        List<BaseAlertDialog> dialogs = this.hashMap.get(context);
        if (dialogs == null) {
            List<BaseAlertDialog> dialogs2 = new ArrayList<>();
            this.hashMap.put(context, dialogs2);
            return dialogs2;
        }
        return dialogs;
    }

    public void addDialog(Context context, BaseAlertDialog alertDialog) {
        List<BaseAlertDialog> dialogs = getDialogList(context);
        if (!dialogs.contains(alertDialog)) {
            dialogs.add(alertDialog);
        }
    }

    public <Dlg extends BaseAlertDialog> Dlg getDialog(Context context, Class cls) {
        Iterator<BaseAlertDialog> it = getDialogList(context).iterator();
        while (it.hasNext()) {
            Dlg dlg = (Dlg) it.next();
            if (dlg.getClass().equals(cls)) {
                return dlg;
            }
        }
        return null;
    }

    public void dismissDialog(final Context context) {
        Runnable runnable = new Runnable() { // from class: com.me.game.pmadsdk.utils.DlgManagerHelper.1
            @Override // java.lang.Runnable
            public void run() {
                List<BaseAlertDialog> dialogs = (List) DlgManagerHelper.this.hashMap.remove(context);
                if (dialogs != null) {
                    Iterator<BaseAlertDialog> iterator = dialogs.iterator();
                    while (iterator.hasNext()) {
                        BaseAlertDialog baseAlertDialog = iterator.next();
                        try {
                            baseAlertDialog.dismissNow();
                            iterator.remove();
                        } catch (Exception e) {
                        }
                    }
                }
            }
        };
        if (Looper.myLooper() != Looper.getMainLooper()) {
            HandlerUtils.post(this.mHandler, runnable);
        } else {
            runnable.run();
        }
    }

    public void removeDialog(BaseAlertDialog dialog) {
        Collection<List<BaseAlertDialog>> collection = this.hashMap.values();
        for (List<BaseAlertDialog> baseAlertDialogs : collection) {
            baseAlertDialogs.remove(dialog);
        }
    }

    public void dismissDialog(Context context, Class aClass) {
        List<BaseAlertDialog> dialogs = this.hashMap.get(context);
        if (dialogs != null) {
            Iterator<BaseAlertDialog> iterator = dialogs.iterator();
            while (iterator.hasNext()) {
                BaseAlertDialog baseAlertDialog = iterator.next();
                try {
                    if (baseAlertDialog.getClass().equals(aClass)) {
                        baseAlertDialog.dismissNow();
                        iterator.remove();
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    public void showDialog(BaseAlertDialog dialog) {
        addDialog(dialog.getCurContext(), dialog);
    }
}
