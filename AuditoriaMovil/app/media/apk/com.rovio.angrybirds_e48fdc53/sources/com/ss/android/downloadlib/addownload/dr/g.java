package com.ss.android.downloadlib.addownload.dr;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.R;
/* loaded from: classes3.dex */
public class g extends Dialog {
    private Activity bn;
    private TextView dr;
    private o g;
    private TextView ge;
    private String ll;
    private TextView o;
    private boolean q;
    private String rb;
    private String xu;

    public g(Activity activity, String str, String str2, String str3, boolean z, o oVar) {
        super(activity, R.style.ttdownloader_translucent_dialog);
        this.bn = activity;
        this.g = oVar;
        this.rb = str;
        this.xu = str2;
        this.ll = str3;
        setCanceledOnTouchOutside(z);
        g();
    }

    private void g() {
        setContentView(LayoutInflater.from(this.bn.getApplicationContext()).inflate(dr(), (ViewGroup) null));
        this.dr = (TextView) findViewById(ge());
        this.ge = (TextView) findViewById(o());
        this.o = (TextView) findViewById(R.id.message_tv);
        if (!TextUtils.isEmpty(this.xu)) {
            this.dr.setText(this.xu);
        }
        if (!TextUtils.isEmpty(this.ll)) {
            this.ge.setText(this.ll);
        }
        if (!TextUtils.isEmpty(this.rb)) {
            this.o.setText(this.rb);
        }
        this.dr.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.dr.g.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.q();
            }
        });
        this.ge.setOnClickListener(new View.OnClickListener() { // from class: com.ss.android.downloadlib.addownload.dr.g.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                g.this.bn();
            }
        });
    }

    public int dr() {
        return R.layout.ttdownloader_dialog_select_operation;
    }

    public int ge() {
        return R.id.confirm_tv;
    }

    public int o() {
        return R.id.cancel_tv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.q = true;
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bn() {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (!this.bn.isFinishing()) {
            this.bn.finish();
        }
        if (this.q) {
            this.g.dr();
        } else {
            this.g.ge();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* loaded from: classes3.dex */
    public static class dr {
        private o bn;
        private Activity dr;
        private String g;
        private String ge;
        private String o;
        private boolean q;

        public dr(Activity activity) {
            this.dr = activity;
        }

        public dr dr(String str) {
            this.ge = str;
            return this;
        }

        public dr ge(String str) {
            this.o = str;
            return this;
        }

        public dr o(String str) {
            this.g = str;
            return this;
        }

        public dr dr(boolean z) {
            this.q = z;
            return this;
        }

        public dr dr(o oVar) {
            this.bn = oVar;
            return this;
        }

        public g dr() {
            return new g(this.dr, this.ge, this.o, this.g, this.q, this.bn);
        }
    }
}
