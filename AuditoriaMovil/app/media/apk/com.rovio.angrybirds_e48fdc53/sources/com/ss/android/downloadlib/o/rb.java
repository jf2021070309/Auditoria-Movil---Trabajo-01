package com.ss.android.downloadlib.o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.ss.android.download.api.model.ge;
import com.ss.android.downloadlib.addownload.wb;
import com.ss.android.socialbase.appdownloader.o.t;
import com.ss.android.socialbase.appdownloader.o.yk;
/* loaded from: classes3.dex */
public class rb extends com.ss.android.socialbase.appdownloader.o.dr {
    private static String dr = rb.class.getSimpleName();

    @Override // com.ss.android.socialbase.appdownloader.o.dr, com.ss.android.socialbase.appdownloader.o.o
    public boolean dr() {
        return true;
    }

    @Override // com.ss.android.socialbase.appdownloader.o.dr, com.ss.android.socialbase.appdownloader.o.o
    public yk dr(Context context) {
        return new yk(context) { // from class: com.ss.android.downloadlib.o.rb.1
            private DialogInterface.OnCancelListener bn;
            final /* synthetic */ Context dr;
            private DialogInterface.OnClickListener g;
            private ge.dr o;
            private DialogInterface.OnClickListener q;

            {
                this.dr = context;
                this.o = new ge.dr(context);
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk dr(int i) {
                this.o.dr(this.dr.getResources().getString(i));
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk dr(String str) {
                this.o.ge(str);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk dr(int i, DialogInterface.OnClickListener onClickListener) {
                this.o.o(this.dr.getResources().getString(i));
                this.g = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk ge(int i, DialogInterface.OnClickListener onClickListener) {
                this.o.g(this.dr.getResources().getString(i));
                this.q = onClickListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk dr(DialogInterface.OnCancelListener onCancelListener) {
                this.bn = onCancelListener;
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public yk dr(boolean z) {
                this.o.dr(z);
                return this;
            }

            @Override // com.ss.android.socialbase.appdownloader.o.yk
            public t dr() {
                this.o.dr(new ge.InterfaceC0290ge() { // from class: com.ss.android.downloadlib.o.rb.1.1
                    @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                    public void dr(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.g != null) {
                            AnonymousClass1.this.g.onClick(dialogInterface, -1);
                        }
                    }

                    @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                    public void ge(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.q != null) {
                            AnonymousClass1.this.q.onClick(dialogInterface, -2);
                        }
                    }

                    @Override // com.ss.android.download.api.model.ge.InterfaceC0290ge
                    public void o(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.bn != null && dialogInterface != null) {
                            AnonymousClass1.this.bn.onCancel(dialogInterface);
                        }
                    }
                });
                com.ss.android.downloadlib.rb.t.dr(rb.dr, "getThemedAlertDlgBuilder", null);
                this.o.dr(3);
                return new dr(wb.o().ge(this.o.dr()));
            }
        };
    }

    /* loaded from: classes3.dex */
    private static class dr implements t {
        private Dialog dr;

        public dr(Dialog dialog) {
            if (dialog != null) {
                this.dr = dialog;
                dr();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.o.t
        public void dr() {
            Dialog dialog = this.dr;
            if (dialog != null) {
                dialog.show();
            }
        }

        @Override // com.ss.android.socialbase.appdownloader.o.t
        public boolean ge() {
            Dialog dialog = this.dr;
            if (dialog != null) {
                return dialog.isShowing();
            }
            return false;
        }
    }
}
