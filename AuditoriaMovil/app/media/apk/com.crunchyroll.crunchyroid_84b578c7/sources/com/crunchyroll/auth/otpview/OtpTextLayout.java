package com.crunchyroll.auth.otpview;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazon.aps.iva.ce.f;
import com.amazon.aps.iva.ce.j;
import com.amazon.aps.iva.ce.k;
import com.amazon.aps.iva.e4.l1;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.i70.h;
import com.amazon.aps.iva.i70.i;
import com.amazon.aps.iva.k3.e;
import com.amazon.aps.iva.lb0.j0;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.wy.g;
import com.amazon.aps.iva.xd.c;
import com.amazon.aps.iva.xd.d;
import com.amazon.aps.iva.xw.w0;
import com.crunchyroll.auth.otpview.OtpTextLayout;
import com.crunchyroll.auth.otpview.a;
import com.crunchyroll.crunchyroid.R;
import com.ellation.widgets.input.InputUnderlineView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: OtpTextLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/crunchyroll/auth/otpview/OtpTextLayout;", "Lcom/amazon/aps/iva/wy/g;", "Lcom/amazon/aps/iva/ce/k;", "Lcom/amazon/aps/iva/i70/i;", "", FirebaseAnalytics.Param.INDEX, "Lcom/amazon/aps/iva/kb0/q;", "setBackground", "Lcom/amazon/aps/iva/ce/i;", "i", "Lcom/amazon/aps/iva/ce/i;", "getTextLayoutListener", "()Lcom/amazon/aps/iva/ce/i;", "setTextLayoutListener", "(Lcom/amazon/aps/iva/ce/i;)V", "textLayoutListener", "Lcom/amazon/aps/iva/i70/k;", "value", "j", "Lcom/amazon/aps/iva/i70/k;", "getState", "()Lcom/amazon/aps/iva/i70/k;", "setState", "(Lcom/amazon/aps/iva/i70/k;)V", "state", "Lcom/crunchyroll/auth/otpview/a;", "getOtpTextState", "()Lcom/crunchyroll/auth/otpview/a;", "otpTextState", "auth_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OtpTextLayout extends g implements k, i {
    public static final /* synthetic */ int k = 0;
    public final d b;
    public final j c;
    public final h d;
    public final ClipboardManager e;
    public final ArrayList f;
    public final int g;
    public boolean h;
    public com.amazon.aps.iva.ce.i i;
    public com.amazon.aps.iva.i70.k j;

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes.dex */
    public static final class a implements ViewTreeObserver.OnWindowFocusChangeListener {
        public final /* synthetic */ View a;

        public a(EditText editText) {
            this.a = editText;
        }

        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            if (z) {
                View view = this.a;
                view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                EditText editText = (EditText) view;
                Object systemService = editText.getContext().getSystemService("input_method");
                com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).showSoftInput(editText, 1);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OtpTextLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        com.amazon.aps.iva.yb0.j.f(context, "context");
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void Hh(int i) {
        Object obj;
        ArrayList arrayList = this.f;
        if (i >= 0 && i <= f1.B(arrayList)) {
            obj = arrayList.get(i);
        } else {
            obj = (EditText) x.D0(arrayList);
        }
        EditText editText = (EditText) obj;
        editText.requestFocus();
        editText.setSelection(editText.length());
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void Je(int i) {
        ((ImageView) c.a(((ConstraintLayout) this.b.b).getChildAt(i)).d).setBackgroundResource(0);
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void Na(int i, String str) {
        com.amazon.aps.iva.yb0.j.f(str, "newText");
        ((EditText) this.f.get(i)).setText(str);
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void P6(int i) {
        EditText editText = (EditText) this.f.get(i);
        editText.requestFocus();
        if (editText.hasWindowFocus()) {
            Object systemService = editText.getContext().getSystemService("input_method");
            com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
            return;
        }
        editText.getViewTreeObserver().addOnWindowFocusChangeListener(new a(editText));
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void Td() {
        setState(com.amazon.aps.iva.i70.k.DEFAULT);
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void U7(int i) {
        Object obj;
        ArrayList arrayList = this.f;
        if (i >= 0 && i <= f1.B(arrayList)) {
            obj = arrayList.get(i);
        } else {
            obj = (EditText) x.t0(arrayList);
        }
        EditText editText = (EditText) obj;
        editText.requestFocus();
        editText.setSelection(editText.length());
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void d() {
        Object systemService = getContext().getSystemService("input_method");
        com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
    }

    public final com.crunchyroll.auth.otpview.a getOtpTextState() {
        String B0 = x.B0(this.f, "", null, null, com.amazon.aps.iva.ce.h.h, 30);
        if (B0.length() == this.g) {
            return new a.C0951a(B0);
        }
        return a.b.a;
    }

    @Override // com.amazon.aps.iva.i70.i
    public com.amazon.aps.iva.i70.k getState() {
        return this.j;
    }

    public final com.amazon.aps.iva.ce.i getTextLayoutListener() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.i70.i
    public final void id(int[] iArr, int[] iArr2) {
        com.amazon.aps.iva.yb0.j.f(iArr2, "additionalState");
        View.mergeDrawableStates(iArr, iArr2);
    }

    @Override // com.amazon.aps.iva.i70.i
    public final boolean m6() {
        return this.h;
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void o4() {
        com.amazon.aps.iva.ce.i iVar = this.i;
        if (iVar != null) {
            iVar.a(getOtpTextState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + com.amazon.aps.iva.i70.g.values().length);
        h hVar = this.d;
        if (hVar != null) {
            hVar.q6(onCreateDrawableState);
        }
        com.amazon.aps.iva.yb0.j.e(onCreateDrawableState, "inputDrawableState");
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        Object parcelable3;
        com.amazon.aps.iva.yb0.j.f(parcelable, "state");
        Bundle bundle = (Bundle) parcelable;
        String string = bundle.getString("otp_text_state", "");
        com.amazon.aps.iva.yb0.j.e(string, "bundle.getString(OTP_TEXT_STATE, \"\")");
        j jVar = this.c;
        jVar.getClass();
        int i = 0;
        int i2 = 0;
        while (i < string.length()) {
            char charAt = string.charAt(i);
            jVar.b = i2;
            jVar.getView().Na(i2, String.valueOf(charAt));
            jVar.getView().Hh(jVar.b);
            i++;
            i2++;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable3 = bundle.getParcelable("custom_view_super_state", Parcelable.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            parcelable2 = bundle.getParcelable("custom_view_super_state");
        }
        com.amazon.aps.iva.yb0.j.c(parcelable2);
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return e.a(new com.amazon.aps.iva.kb0.j("custom_view_super_state", super.onSaveInstanceState()), new com.amazon.aps.iva.kb0.j("otp_text_state", x.B0(this.f, "", null, null, com.amazon.aps.iva.ce.h.h, 30)));
    }

    @Override // com.amazon.aps.iva.ce.k
    public final void r5() {
        ArrayList arrayList = this.f;
        com.amazon.aps.iva.yb0.j.f(arrayList, "<this>");
        Iterator it = new j0(arrayList).iterator();
        while (true) {
            j0.a aVar = (j0.a) it;
            if (aVar.hasNext()) {
                ((EditText) aVar.next()).setText("");
            } else {
                return;
            }
        }
    }

    @Override // com.amazon.aps.iva.ce.k
    public void setBackground(int i) {
        ((ImageView) c.a(((ConstraintLayout) this.b.b).getChildAt(i)).d).setBackgroundResource(R.drawable.ic_otp_input_circle);
    }

    public void setState(com.amazon.aps.iva.i70.k kVar) {
        com.amazon.aps.iva.yb0.j.f(kVar, "value");
        if (kVar != this.j) {
            this.j = kVar;
            j jVar = this.c;
            jVar.getView().clearFocus();
            jVar.getView().d();
            jVar.getView().refreshDrawableState();
        }
    }

    public final void setTextLayoutListener(com.amazon.aps.iva.ce.i iVar) {
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.wy.g, com.amazon.aps.iva.cz.b
    public final Set<com.amazon.aps.iva.wy.k> setupPresenters() {
        return l1.H(this.c);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtpTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        com.amazon.aps.iva.yb0.j.f(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_otp_text, (ViewGroup) this, false);
        addView(inflate);
        if (inflate != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
            this.b = new d(constraintLayout, constraintLayout, 0);
            this.c = new j(this);
            Object systemService = context.getSystemService("clipboard");
            com.amazon.aps.iva.yb0.j.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            this.e = (ClipboardManager) systemService;
            this.f = new ArrayList();
            this.g = 6;
            this.j = com.amazon.aps.iva.i70.k.DEFAULT;
            this.d = new h(this);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.vd.g.a, 0, 0);
            com.amazon.aps.iva.yb0.j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
            this.g = obtainStyledAttributes.getInteger(0, 6);
            obtainStyledAttributes.recycle();
            final int i2 = 0;
            while (true) {
                d dVar = this.b;
                if (i2 < this.g) {
                    final c a2 = c.a(LayoutInflater.from(getContext()).inflate(R.layout.item_otp_text, (ViewGroup) null, false));
                    EditText editText = (EditText) a2.e;
                    com.amazon.aps.iva.yb0.j.e(editText, "initEditTexts$lambda$11");
                    editText.addTextChangedListener(new com.amazon.aps.iva.ce.g(this, i2));
                    editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.amazon.aps.iva.ce.b
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            int i3 = OtpTextLayout.k;
                            OtpTextLayout otpTextLayout = OtpTextLayout.this;
                            com.amazon.aps.iva.yb0.j.f(otpTextLayout, "this$0");
                            com.amazon.aps.iva.xd.c cVar = a2;
                            com.amazon.aps.iva.yb0.j.f(cVar, "$itemOtpTextBinding");
                            j jVar = otpTextLayout.c;
                            if (z) {
                                jVar.b = i2;
                            } else {
                                jVar.getClass();
                            }
                            otpTextLayout.h = z;
                            ((InputUnderlineView) cVar.f).refreshDrawableState();
                        }
                    });
                    editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.amazon.aps.iva.ce.c
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                            int i4 = OtpTextLayout.k;
                            OtpTextLayout otpTextLayout = OtpTextLayout.this;
                            com.amazon.aps.iva.yb0.j.f(otpTextLayout, "this$0");
                            j jVar = otpTextLayout.c;
                            int i5 = i2;
                            boolean z = true;
                            if (i3 == 67 && keyEvent.getAction() == 1) {
                                jVar.getView().Na(i5, "");
                                int i6 = jVar.b - 1;
                                jVar.getView().U7(i6);
                                jVar.b = i6;
                                return true;
                            }
                            if (keyEvent.getAction() == 1) {
                                com.amazon.aps.iva.yb0.j.d(view, "null cannot be cast to non-null type android.widget.EditText");
                                Editable text = ((EditText) view).getText();
                                String valueOf = String.valueOf(keyEvent.getNumber());
                                jVar.getClass();
                                com.amazon.aps.iva.yb0.j.f(valueOf, "newText");
                                if (text != null && text.length() != 0) {
                                    z = false;
                                }
                                if (!z) {
                                    jVar.getView().Na(i5, valueOf);
                                }
                            }
                            return false;
                        }
                    });
                    editText.setCustomInsertionActionModeCallback(new com.amazon.aps.iva.ce.e(this));
                    editText.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.aps.iva.ce.d
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            int i3 = OtpTextLayout.k;
                            OtpTextLayout otpTextLayout = OtpTextLayout.this;
                            com.amazon.aps.iva.yb0.j.f(otpTextLayout, "this$0");
                            com.amazon.aps.iva.i70.k state = otpTextLayout.getState();
                            j jVar = otpTextLayout.c;
                            jVar.getClass();
                            com.amazon.aps.iva.yb0.j.f(state, "state");
                            if (state != com.amazon.aps.iva.i70.k.ERROR) {
                                return false;
                            }
                            jVar.getView().Td();
                            jVar.b = 0;
                            jVar.getView().r5();
                            jVar.q6();
                            return true;
                        }
                    });
                    ((ConstraintLayout) a2.c).setId(View.generateViewId());
                    editText.setTag(Integer.valueOf(i2));
                    ((ConstraintLayout) dVar.c).addView((ConstraintLayout) a2.b);
                    this.f.add(editText);
                    i2++;
                } else {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) dVar.c;
                    com.amazon.aps.iva.yb0.j.e(constraintLayout2, "binding.otpTextContainer");
                    w0.b(constraintLayout2, new f(this));
                    this.c.q6();
                    return;
                }
            }
        } else {
            throw new NullPointerException("rootView");
        }
    }
}
