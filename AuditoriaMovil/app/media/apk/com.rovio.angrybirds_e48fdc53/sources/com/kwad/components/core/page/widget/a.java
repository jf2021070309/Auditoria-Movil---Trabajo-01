package com.kwad.components.core.page.widget;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kwad.sdk.R;
import com.kwad.sdk.m.l;
/* loaded from: classes.dex */
public final class a extends Dialog {
    private final InterfaceC0209a ON;
    private final String OO;

    /* renamed from: com.kwad.components.core.page.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0209a {
        void a(DialogInterface dialogInterface);

        void b(DialogInterface dialogInterface);

        void c(DialogInterface dialogInterface);
    }

    public a(Context context, InterfaceC0209a interfaceC0209a) {
        this(context, null, interfaceC0209a);
    }

    public a(Context context, String str, InterfaceC0209a interfaceC0209a) {
        super(context);
        if (context instanceof Activity) {
            setOwnerActivity((Activity) context);
        }
        this.ON = interfaceC0209a;
        this.OO = str;
    }

    private View pv() {
        View inflate = l.inflate(getContext(), R.layout.ksad_web_exit_intercept_content_layout, null);
        inflate.findViewById(R.id.ksad_exit_intercept_dialog_layout).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.widget.a.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.ON.c(a.this);
            }
        });
        inflate.findViewById(R.id.ksad_exit_intercept_content_layout).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.widget.a.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        inflate.findViewById(R.id.ksad_web_exit_intercept_positive_btn).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.widget.a.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.ON.a(a.this);
            }
        });
        inflate.findViewById(R.id.ksad_web_exit_intercept_negative_btn).setOnClickListener(new View.OnClickListener() { // from class: com.kwad.components.core.page.widget.a.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.this.ON.b(a.this);
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.ksad_exit_intercept_content);
        if (!TextUtils.isEmpty(this.OO)) {
            textView.setText(this.OO);
        }
        return inflate;
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(pv());
        setCanceledOnTouchOutside(false);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(false);
    }
}
