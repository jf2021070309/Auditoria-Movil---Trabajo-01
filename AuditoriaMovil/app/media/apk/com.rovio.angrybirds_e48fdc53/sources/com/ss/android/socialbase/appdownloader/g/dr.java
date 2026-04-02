package com.ss.android.socialbase.appdownloader.g;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.socialbase.appdownloader.o.t;
import com.ss.android.socialbase.appdownloader.o.yk;
/* loaded from: classes3.dex */
public class dr extends com.ss.android.socialbase.appdownloader.o.ge {
    private AlertDialog.Builder dr;

    public dr(Context context) {
        this.dr = new AlertDialog.Builder(context);
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public yk dr(int i) {
        AlertDialog.Builder builder = this.dr;
        if (builder != null) {
            builder.setTitle(i);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public yk dr(String str) {
        AlertDialog.Builder builder = this.dr;
        if (builder != null) {
            builder.setMessage(str);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public yk dr(int i, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.dr;
        if (builder != null) {
            builder.setPositiveButton(i, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public yk ge(int i, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder = this.dr;
        if (builder != null) {
            builder.setNegativeButton(i, onClickListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public yk dr(DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = this.dr;
        if (builder != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.yk
    public t dr() {
        return new C0306dr(this.dr);
    }

    /* renamed from: com.ss.android.socialbase.appdownloader.g.dr$dr  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0306dr implements t {
        private AlertDialog dr;

        public C0306dr(AlertDialog.Builder builder) {
            if (builder != null) {
                this.dr = builder.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.o.t
        public void dr() {
            AlertDialog alertDialog = this.dr;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.o.t
        public boolean ge() {
            AlertDialog alertDialog = this.dr;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }
    }
}
