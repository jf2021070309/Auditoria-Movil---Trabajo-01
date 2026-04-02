package com.ellation.widgets.input.datainputbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.k;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.i70.d;
import com.amazon.aps.iva.i70.e;
import com.amazon.aps.iva.i70.f;
import com.amazon.aps.iva.i70.n;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.lb0.r;
import com.amazon.aps.iva.lb0.t;
import com.amazon.aps.iva.q.e1;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.i;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DataInputButton.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\f\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000f\u001a\u00020\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001f¨\u0006%"}, d2 = {"Lcom/ellation/widgets/input/datainputbutton/DataInputButton;", "Landroid/widget/LinearLayout;", "Lcom/amazon/aps/iva/i70/f;", "Landroid/content/res/TypedArray;", "Lcom/amazon/aps/iva/kb0/q;", "setTextAttributes", "setCommonAttributes", "setBackgrounds", "", "Lcom/amazon/aps/iva/i70/k;", "getInputStates", "", "id", "setText", "", "getText", "Landroid/widget/TextView;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getButtonDisabled", "()Landroid/widget/TextView;", "buttonDisabled", "c", "getButtonEnabled", "buttonEnabled", "Lkotlin/Function0;", "f", "Lcom/amazon/aps/iva/xb0/a;", "getOnEnabled", "()Lcom/amazon/aps/iva/xb0/a;", "setOnEnabled", "(Lcom/amazon/aps/iva/xb0/a;)V", "onEnabled", "g", "getOnDisabled", "setOnDisabled", "onDisabled", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DataInputButton extends LinearLayout implements f {
    public static final /* synthetic */ l<Object>[] h = {q.a(DataInputButton.class, "buttonDisabled", "getButtonDisabled()Landroid/widget/TextView;", 0), q.a(DataInputButton.class, "buttonEnabled", "getButtonEnabled()Landroid/widget/TextView;", 0)};
    public final v b;
    public final v c;
    public final ArrayList d;
    public final e e;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> f;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> g;

    /* compiled from: DataInputButton.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a extends i implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public a(e eVar) {
            super(0, eVar, d.class, "onValidateData", "onValidateData()V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((d) this.receiver).R0();
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DataInputButton.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public static final b h = new b();

        public b() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke() {
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DataInputButton.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public static final c h = new c();

        public c() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke() {
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataInputButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.b = g.c(R.id.textview_disabled, this);
        this.c = g.c(R.id.textview_enabled, this);
        this.d = new ArrayList();
        this.e = new e(this);
        this.f = com.amazon.aps.iva.i70.c.h;
        this.g = com.amazon.aps.iva.i70.b.h;
        View.inflate(context, R.layout.button_data_input, this);
        int[] iArr = R.styleable.DataInputButton;
        j.e(iArr, "DataInputButton");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setTextAttributes(obtainStyledAttributes);
        setCommonAttributes(obtainStyledAttributes);
        setBackgrounds(obtainStyledAttributes);
        Typeface a2 = com.amazon.aps.iva.f3.f.a(obtainStyledAttributes.getResourceId(R.styleable.DataInputButton_android_fontFamily, 0), context);
        getButtonDisabled().setTypeface(a2);
        getButtonEnabled().setTypeface(a2);
        obtainStyledAttributes.recycle();
        setEnabled(false);
    }

    private final TextView getButtonDisabled() {
        return (TextView) this.b.getValue(this, h[0]);
    }

    private final TextView getButtonEnabled() {
        return (TextView) this.c.getValue(this, h[1]);
    }

    private final void setBackgrounds(TypedArray typedArray) {
        int resourceId = typedArray.getResourceId(R.styleable.DataInputButton_disabled_background, 0);
        if (resourceId != 0) {
            getButtonDisabled().setBackground(com.amazon.aps.iva.d3.a.getDrawable(getContext(), resourceId));
        }
        int resourceId2 = typedArray.getResourceId(R.styleable.DataInputButton_enabled_background, 0);
        if (resourceId2 != 0) {
            getButtonEnabled().setBackground(com.amazon.aps.iva.d3.a.getDrawable(getContext(), resourceId2));
        }
        int resourceId3 = typedArray.getResourceId(R.styleable.DataInputButton_enabled_foreground, 0);
        if (resourceId3 != 0) {
            getButtonEnabled().setForeground(com.amazon.aps.iva.d3.a.getDrawable(getContext(), resourceId3));
        }
    }

    private final void setCommonAttributes(TypedArray typedArray) {
        int integer = typedArray.getInteger(R.styleable.DataInputButton_android_gravity, 17);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.DataInputButton_button_paddingStart, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(R.styleable.DataInputButton_button_paddingEnd, 0);
        TextView buttonDisabled = getButtonDisabled();
        buttonDisabled.setGravity(integer);
        buttonDisabled.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize2, 0);
        TextView buttonEnabled = getButtonEnabled();
        buttonEnabled.setGravity(integer);
        buttonEnabled.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize2, 0);
    }

    private final void setTextAttributes(TypedArray typedArray) {
        boolean z = typedArray.getBoolean(R.styleable.DataInputButton_android_textAllCaps, false);
        float dimension = typedArray.getDimension(R.styleable.DataInputButton_android_textSize, -1.0f);
        TextView buttonDisabled = getButtonDisabled();
        buttonDisabled.setAllCaps(z);
        buttonDisabled.setTextSize(0, dimension);
        buttonDisabled.setTextColor(typedArray.getColor(R.styleable.DataInputButton_disabled_textColor, -1));
        x.g0(buttonDisabled, typedArray, R.styleable.DataInputButton_android_text, -1);
        TextView buttonEnabled = getButtonEnabled();
        buttonEnabled.setAllCaps(z);
        buttonEnabled.setTextSize(0, dimension);
        buttonEnabled.setTextColor(typedArray.getColor(R.styleable.DataInputButton_enabled_textColor, -16777216));
        x.g0(buttonEnabled, typedArray, R.styleable.DataInputButton_android_text, -1);
    }

    @Override // com.amazon.aps.iva.i70.f
    public final void Ef() {
        this.f = b.h;
        this.g = c.h;
    }

    public final void G(n... nVarArr) {
        t.e0(this.d, nVarArr);
        for (n nVar : nVarArr) {
            e eVar = this.e;
            nVar.setStateChangeListener(new a(eVar));
            eVar.R0();
        }
    }

    @Override // com.amazon.aps.iva.i70.f
    public final void Nf() {
        getButtonEnabled().setVisibility(0);
        getButtonEnabled().animate().alpha(1.0f).start();
        getButtonDisabled().animate().alpha(0.0f).withEndAction(new k(getButtonDisabled(), 12)).start();
        setEnabled(true);
        this.f.invoke();
    }

    @Override // com.amazon.aps.iva.i70.f
    public final void Vb() {
        getButtonEnabled().animate().alpha(0.0f).withEndAction(new e1(getButtonEnabled(), 8)).start();
        getButtonDisabled().setVisibility(0);
        getButtonDisabled().animate().alpha(1.0f).start();
        setEnabled(false);
        this.g.invoke();
    }

    @Override // com.amazon.aps.iva.i70.f
    public List<com.amazon.aps.iva.i70.k> getInputStates() {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(r.Y(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).getState());
        }
        return arrayList2;
    }

    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> getOnDisabled() {
        return this.g;
    }

    public final com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> getOnEnabled() {
        return this.f;
    }

    public final String getText() {
        return getButtonEnabled().getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.onDestroy();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        j.f(motionEvent, "ev");
        return true;
    }

    public final void setOnDisabled(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        j.f(aVar, "<set-?>");
        this.g = aVar;
    }

    public final void setOnEnabled(com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> aVar) {
        j.f(aVar, "<set-?>");
        this.f = aVar;
    }

    public final void setText(int i) {
        getButtonDisabled().setText(i);
        getButtonEnabled().setText(i);
    }
}
