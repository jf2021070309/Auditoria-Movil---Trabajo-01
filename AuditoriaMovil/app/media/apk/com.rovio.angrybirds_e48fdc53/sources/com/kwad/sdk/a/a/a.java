package com.kwad.sdk.a.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.core.response.model.AdInfo;
import com.kwad.sdk.core.response.model.AdTemplate;
import com.kwad.sdk.service.ServiceProvider;
import com.kwad.sdk.utils.ak;
/* loaded from: classes.dex */
public final class a extends com.kwad.components.core.o.d {
    private static a ahC;
    private final DialogInterface.OnDismissListener ahD;
    private final AdTemplate mAdTemplate;
    private final DialogInterface.OnClickListener mOnClickListener;

    private a(Activity activity, AdTemplate adTemplate, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnClickListener onClickListener) {
        super(activity);
        this.mAdTemplate = adTemplate;
        this.ahD = onDismissListener;
        this.mOnClickListener = onClickListener;
    }

    public static boolean a(Activity activity, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnClickListener onClickListener) {
        AdTemplate xZ;
        if (activity == null || activity.isFinishing() || (xZ = c.xY().xZ()) == null) {
            return false;
        }
        return a(activity, xZ, onDismissListener, onClickListener);
    }

    public static boolean a(Activity activity, AdTemplate adTemplate, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnClickListener onClickListener) {
        if (activity != null && !activity.isFinishing() && adTemplate != null) {
            a aVar = ahC;
            if (aVar != null && aVar.isShowing()) {
                ahC.dismiss();
            }
            try {
                a aVar2 = new a(activity, adTemplate, onDismissListener, onClickListener);
                aVar2.show();
                ahC = aVar2;
                return true;
            } catch (Throwable th) {
            }
        }
        return false;
    }

    public static boolean nd() {
        a aVar = ahC;
        return aVar != null && aVar.isShowing();
    }

    public static boolean xT() {
        a aVar = ahC;
        if (aVar == null || !aVar.isShowing()) {
            return false;
        }
        ahC.dismiss();
        return true;
    }

    @Override // com.kwad.components.core.o.d, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        DialogInterface.OnDismissListener onDismissListener = this.ahD;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        ahC = null;
    }

    @Override // com.kwad.components.core.o.d
    public final void g(View view) {
        TextView textView = (TextView) view.findViewById(R.id.ksad_install_tips_content);
        TextView textView2 = (TextView) view.findViewById(R.id.ksad_install_cancel);
        TextView textView3 = (TextView) view.findViewById(R.id.ksad_install_tv);
        AdInfo ck = com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate);
        String A = d.A(com.kwad.sdk.core.response.b.d.ck(this.mAdTemplate));
        if (A.equals("")) {
            A = this.mContext.getString(R.string.ksad_install_tips, com.kwad.sdk.core.response.b.a.ao(ck));
        }
        textView.setText(A);
        textView3.setText(d.ye());
        textView2.setText(d.yf());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.sdk.a.a.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.this.dismiss();
                if (a.this.mOnClickListener != null) {
                    a.this.mOnClickListener.onClick(a.this, -2);
                }
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: com.kwad.sdk.a.a.a.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (a.this.mOnClickListener != null) {
                    a.this.mOnClickListener.onClick(a.this, -1);
                }
                if (ak.an(((com.kwad.sdk.service.a.e) ServiceProvider.get(com.kwad.sdk.service.a.e.class)).getContext(), com.kwad.sdk.core.download.a.B(com.kwad.sdk.core.response.b.d.ck(a.this.mAdTemplate)))) {
                    com.kwad.sdk.core.report.a.i(a.this.mAdTemplate, 1);
                }
            }
        });
    }

    @Override // com.kwad.components.core.o.d
    public final int getLayoutId() {
        return R.layout.ksad_install_dialog;
    }
}
