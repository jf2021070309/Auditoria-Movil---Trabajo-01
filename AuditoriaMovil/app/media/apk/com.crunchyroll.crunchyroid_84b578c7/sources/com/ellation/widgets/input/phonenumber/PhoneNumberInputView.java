package com.ellation.widgets.input.phonenumber;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.amazon.aps.iva.ab0.d;
import com.amazon.aps.iva.ab0.h;
import com.amazon.aps.iva.i70.n;
import com.amazon.aps.iva.l70.c;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.oe0.q;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.crunchyroll.crunchyroid.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: PhoneNumberInputView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0016R\"\u0010\u0017\u001a\u00020\u00108\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ellation/widgets/input/phonenumber/PhoneNumberInputView;", "Lcom/amazon/aps/iva/i70/n;", "Lcom/amazon/aps/iva/l70/a;", "", "userCountry", "Lcom/amazon/aps/iva/kb0/q;", "setUserCountry", "getText", "text", "setText", "", FirebaseAnalytics.Param.INDEX, "setSelection", "Lkotlin/Function0;", "action", "setStateChangeListener", "Landroid/widget/EditText;", "g", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "setEditText", "(Landroid/widget/EditText;)V", "editText", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "phoneNumber", "widgets_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PhoneNumberInputView extends n implements com.amazon.aps.iva.l70.a {
    public EditText g;
    public final c h;

    /* compiled from: TextViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            c cVar = PhoneNumberInputView.this.h;
            if (!cVar.d) {
                String text = cVar.getView().getText();
                if (!m.h0(text, "+", false)) {
                    cVar.d = true;
                    int r0 = q.r0(text, "+", 0, false, 2);
                    if (r0 >= 0) {
                        text = q.A0(text, r0, r0 + 1, "").toString();
                    }
                    String a = com.amazon.aps.iva.oa.a.a("+", text);
                    cVar.getView().setText(a);
                    cVar.getView().setSelection(a.length());
                    cVar.d = false;
                }
                cVar.r6();
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                charSequence.length();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            h hVar;
            c cVar = PhoneNumberInputView.this.h;
            String text = cVar.getView().getText();
            if (!cVar.d && cVar.e && (hVar = cVar.f) != null) {
                Integer valueOf = Integer.valueOf(hVar.b);
                CharSequence subSequence = text.subSequence(i, i3 + i);
                String str = "+" + valueOf + " " + ((Object) subSequence);
                cVar.d = true;
                cVar.getView().setText(str);
                cVar.getView().setSelection(str.length());
                cVar.d = false;
                cVar.e = false;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PhoneNumberInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void G4() {
        this.h.r6();
    }

    @Override // com.amazon.aps.iva.i70.n
    public final void U2() {
        View findViewById = View.inflate(getContext(), R.layout.phone_number_field_layout, this).findViewById(R.id.phone_number_field);
        j.e(findViewById, "findViewById(R.id.phone_number_field)");
        setEditText((EditText) findViewById);
    }

    @Override // com.amazon.aps.iva.i70.n
    public EditText getEditText() {
        EditText editText = this.g;
        if (editText != null) {
            return editText;
        }
        j.m("editText");
        throw null;
    }

    public final String getPhoneNumber() {
        return this.h.q6();
    }

    @Override // com.amazon.aps.iva.l70.a
    public String getText() {
        return getEditText().getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h.onDestroy();
    }

    public void setEditText(EditText editText) {
        j.f(editText, "<set-?>");
        this.g = editText;
    }

    public final void setPhoneNumber(String str) {
        j.f(str, "text");
        c cVar = this.h;
        cVar.getClass();
        cVar.getView().setText(str);
    }

    @Override // com.amazon.aps.iva.l70.a
    public void setSelection(int i) {
        getEditText().setSelection(i);
    }

    @Override // com.amazon.aps.iva.i70.n
    public void setStateChangeListener(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        j.f(aVar, "action");
        this.h.h = aVar;
    }

    @Override // com.amazon.aps.iva.l70.a
    public void setText(String str) {
        j.f(str, "text");
        getEditText().setText(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setUserCountry(java.lang.String r7) {
        /*
            r6 = this;
            com.amazon.aps.iva.l70.c r0 = r6.h
            r0.getClass()
            com.amazon.aps.iva.ab0.d$c r1 = com.amazon.aps.iva.ab0.d.c.MOBILE
            r2 = 1
            com.amazon.aps.iva.ab0.d r3 = r0.b
            if (r7 == 0) goto L16
            java.util.HashSet r4 = r3.f
            boolean r4 = r4.contains(r7)
            if (r4 == 0) goto L19
            r4 = r2
            goto L1a
        L16:
            r3.getClass()
        L19:
            r4 = 0
        L1a:
            java.util.logging.Logger r5 = com.amazon.aps.iva.ab0.d.h
            if (r4 != 0) goto L32
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid or unknown region code provided: "
            r3.<init>(r4)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r5.log(r1, r7)
            goto L4f
        L32:
            com.amazon.aps.iva.ab0.f r4 = r3.e(r7)
            com.amazon.aps.iva.ab0.g r1 = com.amazon.aps.iva.ab0.d.g(r4, r1)
            boolean r4 = r1.f     // Catch: com.amazon.aps.iva.ab0.c -> L45
            if (r4 == 0) goto L4f
            java.lang.String r1 = r1.g     // Catch: com.amazon.aps.iva.ab0.c -> L45
            com.amazon.aps.iva.ab0.h r7 = r3.l(r1, r7)     // Catch: com.amazon.aps.iva.ab0.c -> L45
            goto L50
        L45:
            r7 = move-exception
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r7 = r7.toString()
            r5.log(r1, r7)
        L4f:
            r7 = 0
        L50:
            java.lang.String r1 = "+"
            if (r7 == 0) goto L9d
            r0.f = r7
            long r3 = r7.c
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r3 = r3.length()
            java.lang.String r4 = "0"
            java.lang.String r3 = com.amazon.aps.iva.oe0.m.d0(r3, r4)
            int r4 = r7.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r4)
            java.lang.String r1 = " "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            com.amazon.aps.iva.wy.h r4 = r0.getView()
            com.amazon.aps.iva.l70.a r4 = (com.amazon.aps.iva.l70.a) r4
            r4.sg(r1, r3)
            com.amazon.aps.iva.wy.h r1 = r0.getView()
            com.amazon.aps.iva.l70.a r1 = (com.amazon.aps.iva.l70.a) r1
            int r7 = r7.b
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r7 = r7.length()
            int r7 = r7 + 2
            r1.setSelection(r7)
            r0.e = r2
            goto Laf
        L9d:
            com.amazon.aps.iva.wy.h r7 = r0.getView()
            com.amazon.aps.iva.l70.a r7 = (com.amazon.aps.iva.l70.a) r7
            r7.setText(r1)
            com.amazon.aps.iva.wy.h r7 = r0.getView()
            com.amazon.aps.iva.l70.a r7 = (com.amazon.aps.iva.l70.a) r7
            r7.setSelection(r2)
        Laf:
            r0.r6()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ellation.widgets.input.phonenumber.PhoneNumberInputView.setUserCountry(java.lang.String):void");
    }

    @Override // com.amazon.aps.iva.l70.a
    public final void sg(String str, String str2) {
        j.f(str, "text");
        j.f(str2, "toColor");
        getEditText().setText(m0.b(com.amazon.aps.iva.d3.a.getColor(getContext(), com.ellation.crunchyroll.ui.R.color.trout_gray), str, str2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.h = new c(this, d.b(context), new com.amazon.aps.iva.x50.n(new Handler(Looper.getMainLooper())));
        getEditText().addTextChangedListener(new a());
    }
}
