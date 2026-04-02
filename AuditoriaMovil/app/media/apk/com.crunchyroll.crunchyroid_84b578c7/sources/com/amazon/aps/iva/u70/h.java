package com.amazon.aps.iva.u70;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.ab.t;
import com.ellation.crunchyroll.ui.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Arrays;
/* compiled from: MessageSnackbar.kt */
/* loaded from: classes2.dex */
public final class h extends BaseTransientBottomBar<h> {
    public static final /* synthetic */ int a = 0;

    /* compiled from: MessageSnackbar.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(ViewGroup viewGroup, i iVar) {
            com.amazon.aps.iva.yb0.j.f(viewGroup, "parent");
            com.amazon.aps.iva.yb0.j.f(iVar, "message");
            new h(viewGroup, iVar).show();
        }
    }

    public h(ViewGroup viewGroup, i iVar) {
        super(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(iVar.getContent(), viewGroup, false), new t());
        setDuration(0);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = this.view;
        com.amazon.aps.iva.yb0.j.e(snackbarBaseLayout, "view");
        snackbarBaseLayout.setPadding(0, 0, 0, 0);
        this.view.setOnApplyWindowInsetsListener(new g());
        TextView textView = (TextView) this.view.findViewById(R.id.snackbar_text);
        if (iVar.getMessageResId() > 0) {
            Context context = textView.getContext();
            int messageResId = iVar.getMessageResId();
            String[] messageArgs = iVar.getMessageArgs();
            textView.setText(context.getString(messageResId, Arrays.copyOf(messageArgs, messageArgs.length)));
        } else {
            textView.setText(iVar.getMessage());
        }
        ((ImageView) this.view.findViewById(R.id.snackbar_icon)).setImageResource(iVar.getIcon());
        this.view.getLayoutParams().width = -1;
    }
}
