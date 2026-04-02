package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.q.d1;
import com.amazon.aps.iva.q.h1;
import com.amazon.aps.iva.q.m1;
import com.amazon.aps.iva.q.x0;
import com.crunchyroll.crunchyroid.R;
import com.google.android.gms.actions.SearchIntents;
import com.google.common.primitives.Ints;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements com.amazon.aps.iva.o.b {
    public static final o P;
    public com.amazon.aps.iva.u3.a A;
    public boolean B;
    public CharSequence C;
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public CharSequence H;
    public boolean I;
    public int J;
    public SearchableInfo K;
    public Bundle L;
    public final b M;
    public final c N;
    public final WeakHashMap<String, Drawable.ConstantState> O;
    public final SearchAutoComplete b;
    public final View c;
    public final View d;
    public final View e;
    public final ImageView f;
    public final ImageView g;
    public final ImageView h;
    public final ImageView i;
    public final View j;
    public q k;
    public final Rect l;
    public final Rect m;
    public final int[] n;
    public final int[] o;
    public final ImageView p;
    public final Drawable q;
    public final int r;
    public final int s;
    public final Intent t;
    public final Intent u;
    public final CharSequence v;
    public View.OnFocusChangeListener w;
    public View.OnClickListener x;
    public boolean y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends com.amazon.aps.iva.q.c {
        public int b;
        public SearchView c;
        public boolean d;
        public final a e;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.d) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.d = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.P;
            oVar.getClass();
            o.a();
            Method method = oVar.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.b > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // com.amazon.aps.iva.q.c, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.d) {
                a aVar = this.e;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.c;
            searchView.q(searchView.z);
            searchView.post(searchView.M);
            if (searchView.b.hasFocus()) {
                searchView.f();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.c.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.d = true;
                Context context = getContext();
                o oVar = SearchView.P;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.e;
            if (!z) {
                this.d = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.d = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.d = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.c = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.b = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.e = new a();
            this.b = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.amazon.aps.iva.u3.a aVar = SearchView.this.A;
            if (aVar instanceof x0) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.w;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9;
            int i10;
            SearchView searchView = SearchView.this;
            View view2 = searchView.j;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.d.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = m1.a(searchView);
                if (searchView.y) {
                    i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i9 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.b;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (a) {
                    i10 = -rect.left;
                } else {
                    i10 = paddingLeft - (rect.left + i9);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i10);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i9) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.f;
            SearchAutoComplete searchAutoComplete = searchView.b;
            if (view == imageView) {
                searchView.q(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.x;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.h) {
                searchView.g();
            } else if (view == searchView.g) {
                searchView.k();
            } else if (view == searchView.i) {
                SearchableInfo searchableInfo = searchView.K;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.t);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.e(searchView.u, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            boolean z;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.K == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.b;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.K == null || searchView.A == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i != 66 && i != 84 && i != 61) {
                    if (i != 21 && i != 22) {
                        if (i != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else {
                    searchView.h(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.d("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.k();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.h(i);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {
        public final Method a;
        public final Method b;
        public final Method c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public o() {
            this.a = null;
            this.b = null;
            this.c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* loaded from: classes.dex */
    public static class p extends com.amazon.aps.iva.w3.a {
        public static final Parcelable.Creator<p> CREATOR = new a();
        public boolean b;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new p[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return com.amazon.aps.iva.e4.e.c(sb, this.b, "}");
        }

        @Override // com.amazon.aps.iva.w3.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.b));
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {
        public final View a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                } else {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                }
                z3 = z2;
                z = true;
            } else {
                if (this.b.contains(x, y)) {
                    this.f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.c;
            View view = this.a;
            if (z && !rect.contains(x, y)) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        P = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.b;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // com.amazon.aps.iva.o.b
    public final void a() {
        if (this.I) {
            return;
        }
        this.I = true;
        SearchAutoComplete searchAutoComplete = this.b;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.J = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // com.amazon.aps.iva.o.b
    public final void c() {
        SearchAutoComplete searchAutoComplete = this.b;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.H = "";
        clearFocus();
        q(true);
        searchAutoComplete.setImeOptions(this.J);
        this.I = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.E = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.b;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.E = false;
    }

    public final Intent d(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.H);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.L;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.K.getSearchActivity());
        return intent;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.L;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        } else {
            i2 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void f() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.b;
        if (i2 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = P;
        oVar.getClass();
        o.a();
        Method method = oVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void g() {
        SearchAutoComplete searchAutoComplete = this.b;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.y) {
                clearFocus();
                q(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public int getImeOptions() {
        return this.b.getImeOptions();
    }

    public int getInputType() {
        return this.b.getInputType();
    }

    public int getMaxWidth() {
        return this.F;
    }

    public CharSequence getQuery() {
        return this.b.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.C;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.K;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.K.getHintId());
            }
            return this.v;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.s;
    }

    public int getSuggestionRowLayout() {
        return this.r;
    }

    public com.amazon.aps.iva.u3.a getSuggestionsAdapter() {
        return this.A;
    }

    public final void h(int i2) {
        Uri parse;
        String i3;
        Cursor cursor = this.A.d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                try {
                    int i4 = x0.y;
                    String i5 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (i5 == null) {
                        i5 = this.K.getSuggestIntentAction();
                    }
                    if (i5 == null) {
                        i5 = "android.intent.action.SEARCH";
                    }
                    String i6 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (i6 == null) {
                        i6 = this.K.getSuggestIntentData();
                    }
                    if (i6 != null && (i3 = x0.i(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        i6 = i6 + "/" + Uri.encode(i3);
                    }
                    if (i6 == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(i6);
                    }
                    intent = d(i5, parse, x0.i(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), x0.i(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException unused3) {
                    intent.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.b;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void i(int i2) {
        Editable text = this.b.getText();
        Cursor cursor = this.A.d;
        if (cursor != null) {
            if (cursor.moveToPosition(i2)) {
                String d2 = this.A.d(cursor);
                if (d2 != null) {
                    setQuery(d2);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void j(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.b;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.K != null) {
                getContext().startActivity(d("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void l() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.b.getText());
        int i2 = 0;
        if (!z2 && (!this.y || this.I)) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        ImageView imageView = this.h;
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void m() {
        int[] iArr;
        if (this.b.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.d.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.e.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void n() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.y;
        SearchAutoComplete searchAutoComplete = this.b;
        if (z && (drawable = this.q) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void o() {
        boolean z;
        int i2 = 0;
        if ((this.B || this.G) && !this.z) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (this.g.getVisibility() != 0 && this.i.getVisibility() != 0)) {
            i2 = 8;
        }
        this.e.setVisibility(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.M);
        post(this.N);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.b;
            int[] iArr = this.n;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.o;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            Rect rect = this.l;
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            int i8 = rect.left;
            int i9 = rect.right;
            int i10 = i5 - i3;
            Rect rect2 = this.m;
            rect2.set(i8, 0, i9, i10);
            q qVar = this.k;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.k = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.b.set(rect2);
            Rect rect3 = qVar.d;
            rect3.set(rect2);
            int i11 = -qVar.e;
            rect3.inset(i11, i11);
            qVar.c.set(rect);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.z) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i4 = this.F) > 0) {
                    size = Math.min(i4, size);
                }
            } else {
                size = this.F;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i5 = this.F;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(size2, Ints.MAX_POWER_OF_TWO));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.getSuperState());
        q(pVar.b);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.b = this.z;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.G == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.B
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.G
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.z
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.G
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.g
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p(boolean):void");
    }

    public final void q(boolean z) {
        int i2;
        int i3;
        int i4;
        this.z = z;
        int i5 = 0;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.b.getText());
        this.f.setVisibility(i2);
        p(z2);
        if (z) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        this.c.setVisibility(i3);
        ImageView imageView = this.p;
        if (imageView.getDrawable() != null && !this.y) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        l();
        boolean z3 = !z2;
        if (this.G && !this.z && z3) {
            this.g.setVisibility(8);
        } else {
            i5 = 8;
        }
        this.i.setVisibility(i5);
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.E || !isFocusable()) {
            return false;
        }
        if (!this.z) {
            boolean requestFocus = this.b.requestFocus(i2, rect);
            if (requestFocus) {
                q(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    public void setAppSearchData(Bundle bundle) {
        this.L = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            g();
            return;
        }
        q(false);
        SearchAutoComplete searchAutoComplete = this.b;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.x;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        q(z);
        n();
    }

    public void setImeOptions(int i2) {
        this.b.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.b.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.F = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.w = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.x = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.C = charSequence;
        n();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i2;
        this.D = z;
        com.amazon.aps.iva.u3.a aVar = this.A;
        if (aVar instanceof x0) {
            x0 x0Var = (x0) aVar;
            if (z) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            x0Var.q = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, com.google.android.gms.cast.Cast.MAX_MESSAGE_LENGTH) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.K = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.b
            r1 = 1
            r2 = 65536(0x10000, float:9.18355E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.K
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.K
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.K
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            com.amazon.aps.iva.u3.a r8 = r7.A
            if (r8 == 0) goto L3e
            r8.c(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.K
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            com.amazon.aps.iva.q.x0 r8 = new com.amazon.aps.iva.q.x0
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.K
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r6 = r7.O
            r8.<init>(r4, r7, r5, r6)
            r7.A = r8
            r0.setAdapter(r8)
            com.amazon.aps.iva.u3.a r8 = r7.A
            com.amazon.aps.iva.q.x0 r8 = (com.amazon.aps.iva.q.x0) r8
            boolean r4 = r7.D
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = r1
        L63:
            r8.q = r4
        L65:
            r7.n()
        L68:
            android.app.SearchableInfo r8 = r7.K
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.K
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.t
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.K
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.u
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.G = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.z
            r7.q(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.B = z;
        q(this.z);
    }

    public void setSuggestionsAdapter(com.amazon.aps.iva.u3.a aVar) {
        this.A = aVar;
        this.b.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.l = new Rect();
        this.m = new Rect();
        this.n = new int[2];
        this.o = new int[2];
        this.M = new b();
        this.N = new c();
        this.O = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = com.amazon.aps.iva.j.a.v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        d1 d1Var = new d1(context, obtainStyledAttributes);
        g0.m(this, context, iArr, attributeSet, obtainStyledAttributes, i2);
        LayoutInflater.from(context).inflate(d1Var.i(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.b = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.c = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.d = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.e = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.g = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.h = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.i = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.p = imageView5;
        g0.d.q(findViewById, d1Var.e(20));
        g0.d.q(findViewById2, d1Var.e(25));
        imageView.setImageDrawable(d1Var.e(23));
        imageView2.setImageDrawable(d1Var.e(15));
        imageView3.setImageDrawable(d1Var.e(12));
        imageView4.setImageDrawable(d1Var.e(28));
        imageView5.setImageDrawable(d1Var.e(23));
        this.q = d1Var.e(22);
        h1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.r = d1Var.i(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.s = d1Var.i(13, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(d1Var.a(18, true));
        int d2 = d1Var.d(2, -1);
        if (d2 != -1) {
            setMaxWidth(d2);
        }
        this.v = d1Var.k(14);
        this.C = d1Var.k(21);
        int h2 = d1Var.h(6, -1);
        if (h2 != -1) {
            setImeOptions(h2);
        }
        int h3 = d1Var.h(5, -1);
        if (h3 != -1) {
            setInputType(h3);
        }
        setFocusable(d1Var.a(1, true));
        d1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.t = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.u = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.j = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        q(this.y);
        n();
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.b.getText();
            searchView.H = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.p(z);
            boolean z2 = !z;
            int i4 = 8;
            if (searchView.G && !searchView.z && z2) {
                searchView.g.setVisibility(8);
                i4 = 0;
            }
            searchView.i.setVisibility(i4);
            searchView.l();
            searchView.o();
            charSequence.toString();
            searchView.getClass();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.i(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
