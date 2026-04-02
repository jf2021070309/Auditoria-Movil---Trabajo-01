package com.ellation.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatTextView;
import com.amazon.aps.iva.f3.f;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.x;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.xw.m0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.ui.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CollapsibleTextView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/ellation/widgets/CollapsibleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "text", "Lcom/amazon/aps/iva/kb0/q;", "setText", "Landroid/text/SpannableStringBuilder;", "getTextForCollapsedState", "getTruncatedTextWithActionButton", "", "value", "j", "I", "getLinesWhenCollapsed", "()I", "setLinesWhenCollapsed", "(I)V", "linesWhenCollapsed", "", "k", "Z", "isCollapsed", "()Z", "setCollapsed", "(Z)V", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CollapsibleTextView extends AppCompatTextView {
    public String b;
    public final SpannableStringBuilder c;
    public final String d;
    public final String e;
    public List<String> f;
    public final int g;
    public final Typeface h;
    public final float i;
    public int j;
    public boolean k;

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            boolean z;
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                CollapsibleTextView collapsibleTextView = (CollapsibleTextView) view;
                CharSequence charSequence = collapsibleTextView.c;
                if (charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    charSequence = collapsibleTextView.b;
                }
                collapsibleTextView.setText(charSequence);
            }
            return true;
        }
    }

    /* compiled from: ViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View b;
        public final /* synthetic */ com.amazon.aps.iva.xb0.a c;

        public c(View view, com.amazon.aps.iva.xb0.a aVar) {
            this.b = view;
            this.c = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            View view = this.b;
            if (view.getViewTreeObserver().isAlive() && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                CollapsibleTextView collapsibleTextView = (CollapsibleTextView) view;
                this.c.invoke();
            }
        }
    }

    /* compiled from: CollapsibleTextView.kt */
    /* loaded from: classes2.dex */
    public static final class d extends l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.i = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            CollapsibleTextView collapsibleTextView = CollapsibleTextView.this;
            String str = this.i;
            collapsibleTextView.b = str;
            ArrayList arrayList = new ArrayList();
            collapsibleTextView.f = arrayList;
            collapsibleTextView.G4(collapsibleTextView.b, collapsibleTextView.getWidth(), arrayList);
            if (collapsibleTextView.S7()) {
                collapsibleTextView.X7(new com.amazon.aps.iva.z60.a(collapsibleTextView));
                collapsibleTextView.setClickable(true);
            } else {
                collapsibleTextView.setCollapsed(false);
                collapsibleTextView.setText((CharSequence) str);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsibleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    public static final void U2(CollapsibleTextView collapsibleTextView) {
        collapsibleTextView.setText(collapsibleTextView.getTextForCollapsedState());
    }

    private final SpannableStringBuilder getTextForCollapsedState() {
        return m0.f(getTruncatedTextWithActionButton(), this.e, this.g, this.h, (int) this.i, false);
    }

    private final String getTruncatedTextWithActionButton() {
        String str = this.d + this.e;
        float width = getWidth() - getPaint().measureText(str);
        int i = this.j - 1;
        return com.amazon.aps.iva.k.q.b(x.B0(x.U0(this.f, i), "", null, null, null, 62), H6(this.f.get(i), width), str);
    }

    public final void G4(String str, int i, List list) {
        if (i == 0) {
            return;
        }
        float f = i;
        if (getPaint().measureText(str) <= f) {
            list.add(str);
            return;
        }
        list.add(H6(str, f));
        if (m.b0((CharSequence) x.D0(list))) {
            return;
        }
        G4(com.amazon.aps.iva.oe0.q.y0((CharSequence) x.D0(list), str), i, list);
    }

    public final String H6(String str, float f) {
        CharSequence charSequence;
        boolean z;
        String N0;
        String substring;
        boolean z2;
        boolean z3 = true;
        String substring2 = str.substring(0, getPaint().breakText(str, true, f, null));
        j.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        int length = substring2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!com.amazon.aps.iva.ab.x.Y(substring2.charAt(length))) {
                    charSequence = substring2.subSequence(0, length + 1);
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length = i;
                }
            }
        }
        charSequence = "";
        String obj = charSequence.toString();
        if (com.amazon.aps.iva.oe0.q.N0(obj, " ", obj).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            N0 = obj;
        } else {
            N0 = com.amazon.aps.iva.oe0.q.N0(obj, " ", obj);
        }
        int u0 = com.amazon.aps.iva.oe0.q.u0(obj, " ", 6);
        if (u0 == -1) {
            substring = obj;
        } else {
            substring = obj.substring(u0 + 1, obj.length());
            j.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String substring3 = str.substring(N0.length());
        j.e(substring3, "this as java.lang.String).substring(startIndex)");
        String M0 = com.amazon.aps.iva.oe0.q.M0(com.amazon.aps.iva.oe0.q.O0(substring3).toString(), " ");
        if (substring.length() < M0.length()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (getPaint().measureText(M0) >= f) {
            z3 = false;
        }
        if (z2 && z3) {
            return N0;
        }
        return obj;
    }

    public final boolean S7() {
        if (this.f.size() > this.j) {
            return true;
        }
        return false;
    }

    public final void X7(com.amazon.aps.iva.xb0.a<q> aVar) {
        if (getWidth() == 0) {
            if (isLaidOut()) {
                aVar.invoke();
                return;
            } else {
                getViewTreeObserver().addOnGlobalLayoutListener(new c(this, aVar));
                return;
            }
        }
        aVar.invoke();
    }

    public final int getLinesWhenCollapsed() {
        return this.j;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j.f(parcelable, "state");
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            super.onRestoreInstanceState(aVar.getSuperState());
            setCollapsed(aVar.b);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState != null) {
            aVar = new a(onSaveInstanceState);
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.b = this.k;
        }
        return aVar;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (S7()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setCollapsed(boolean z) {
        this.k = z;
        X7(new com.amazon.aps.iva.z60.a(this));
    }

    public final void setLinesWhenCollapsed(int i) {
        this.j = i;
        X7(new com.amazon.aps.iva.z60.a(this));
    }

    public final void setText(String str) {
        j.f(str, "text");
        X7(new d(str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = "";
        this.c = new SpannableStringBuilder("");
        this.d = "…";
        this.e = "";
        this.f = new ArrayList();
        Typeface typeface = Typeface.DEFAULT;
        j.e(typeface, "DEFAULT");
        this.h = typeface;
        this.i = getResources().getDimension(R.dimen.collapsible_text_view_default_action_text_size);
        this.j = Integer.MAX_VALUE;
        this.k = true;
        int[] iArr = R.styleable.CollapsibleText;
        j.e(iArr, "CollapsibleText");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        String string = context.getString(obtainStyledAttributes.getResourceId(R.styleable.CollapsibleText_actionText, 0));
        j.e(string, "context.getString(\n     …ionText, 0)\n            )");
        this.e = string;
        String string2 = context.getString(obtainStyledAttributes.getResourceId(R.styleable.CollapsibleText_ellipsis, 0));
        j.e(string2, "context.getString(\n     …llipsis, 0)\n            )");
        this.d = string2;
        setLinesWhenCollapsed(obtainStyledAttributes.getInt(R.styleable.CollapsibleText_linesWhenCollapsed, 0));
        this.g = obtainStyledAttributes.getColor(R.styleable.CollapsibleText_actionTextColor, 0);
        Typeface a2 = f.a(obtainStyledAttributes.getResourceId(R.styleable.CollapsibleText_actionTextFont, 0), context);
        if (a2 == null) {
            a2 = Typeface.DEFAULT;
            j.e(a2, "DEFAULT");
        }
        this.h = a2;
        this.i = obtainStyledAttributes.getDimension(R.styleable.CollapsibleText_actionTextSize, obtainStyledAttributes.getResources().getDimension(R.dimen.collapsible_text_view_default_action_text_size));
        obtainStyledAttributes.recycle();
    }

    /* compiled from: CollapsibleTextView.kt */
    /* loaded from: classes2.dex */
    public static final class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0976a();
        public boolean b;

        /* compiled from: CollapsibleTextView.kt */
        /* renamed from: com.ellation.widgets.CollapsibleTextView$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0976a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                j.f(parcel, FirebaseAnalytics.Param.SOURCE);
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcel parcel) {
            super(parcel);
            j.f(parcel, FirebaseAnalytics.Param.SOURCE);
            this.b = true;
            this.b = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            j.f(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
            this.b = true;
        }
    }
}
