package com.ellation.widgets.searchtoolbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.amazon.aps.iva.c8.f;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.k.q;
import com.amazon.aps.iva.s70.d;
import com.amazon.aps.iva.s70.e;
import com.amazon.aps.iva.x50.k;
import com.amazon.aps.iva.x50.m;
import com.amazon.aps.iva.x50.n;
import com.amazon.aps.iva.xw.g;
import com.amazon.aps.iva.xw.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.Field;
import kotlin.Metadata;
/* compiled from: SearchToolbarLayout.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u001a\u0010\u0007\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/ellation/widgets/searchtoolbar/SearchToolbarLayout;", "Landroidx/appcompat/widget/Toolbar;", "Lcom/amazon/aps/iva/s70/e;", "Lkotlin/Function1;", "", "Lcom/amazon/aps/iva/kb0/q;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSearchTextChangeListener", "Landroid/widget/EditText;", "b", "Lcom/amazon/aps/iva/bc0/b;", "getSearchInput", "()Landroid/widget/EditText;", "searchInput", "Landroid/widget/ImageView;", "c", "getClearButton", "()Landroid/widget/ImageView;", "clearButton", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SearchToolbarLayout extends Toolbar implements e {
    public static final /* synthetic */ l<Object>[] e = {q.a(SearchToolbarLayout.class, "searchInput", "getSearchInput()Landroid/widget/EditText;", 0), q.a(SearchToolbarLayout.class, "clearButton", "getClearButton()Landroid/widget/ImageView;", 0)};
    public final v b;
    public final v c;
    public final com.amazon.aps.iva.s70.a d;

    /* compiled from: SearchToolbarLayout.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.xb0.l<? super String, ? extends com.amazon.aps.iva.kb0.q>, k<String>> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final k<String> invoke(com.amazon.aps.iva.xb0.l<? super String, ? extends com.amazon.aps.iva.kb0.q> lVar) {
            com.amazon.aps.iva.xb0.l<? super String, ? extends com.amazon.aps.iva.kb0.q> lVar2 = lVar;
            j.f(lVar2, "onSearchTextChanged");
            int i = k.a;
            int i2 = m.a;
            return new com.amazon.aps.iva.x50.j(500L, new n(new Handler(Looper.getMainLooper())), new com.ellation.widgets.searchtoolbar.a(lVar2));
        }
    }

    /* compiled from: TextViewExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence != null) {
                charSequence.length();
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchToolbarLayout.this.d.F(String.valueOf(charSequence));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    private final ImageView getClearButton() {
        return (ImageView) this.c.getValue(this, e[1]);
    }

    @Override // com.amazon.aps.iva.s70.e
    public final void Jg() {
        getClearButton().setVisibility(8);
    }

    @Override // com.amazon.aps.iva.s70.e
    public final void Nh() {
        getClearButton().setVisibility(0);
    }

    @Override // com.amazon.aps.iva.s70.e
    public final void clearText() {
        getSearchInput().setText("");
    }

    public final EditText getSearchInput() {
        return (EditText) this.b.getValue(this, e[0]);
    }

    public final void setSearchTextChangeListener(com.amazon.aps.iva.xb0.l<? super String, com.amazon.aps.iva.kb0.q> lVar) {
        j.f(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.d.k3(lVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j.f(context, "context");
        this.b = g.c(R.id.search_toolbar_input, this);
        this.c = g.c(R.id.search_toolbar_clear_button, this);
        a aVar = a.h;
        j.f(aVar, "createDebouncer");
        d dVar = new d(this, aVar);
        com.ellation.crunchyroll.mvp.lifecycle.a.b(dVar, this);
        this.d = dVar;
        View.inflate(context, R.layout.layout_search_toolbar, this);
        int[] iArr = R.styleable.SearchToolbarLayout;
        j.e(iArr, "SearchToolbarLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SearchToolbarLayout_inputHint, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.SearchToolbarLayout_inputTextAppearance, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.SearchToolbarLayout_inputTextCursorDrawable, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(R.styleable.SearchToolbarLayout_clearButtonImage, 0);
        int resourceId5 = obtainStyledAttributes.getResourceId(R.styleable.SearchToolbarLayout_clearButtonContentDescription, 0);
        getSearchInput().setHint(resourceId);
        getSearchInput().setTextAppearance(resourceId2);
        EditText searchInput = getSearchInput();
        j.f(searchInput, "<this>");
        if (Build.VERSION.SDK_INT >= 29) {
            searchInput.setTextCursorDrawable(resourceId3);
        } else {
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            declaredField.set(searchInput, Integer.valueOf(resourceId3));
        }
        getClearButton().setImageResource(resourceId4);
        getClearButton().setContentDescription(context.getString(resourceId5));
        obtainStyledAttributes.recycle();
        getSearchInput().addTextChangedListener(new b());
        getSearchInput().requestFocus();
        getClearButton().setOnClickListener(new f(this, 19));
    }
}
