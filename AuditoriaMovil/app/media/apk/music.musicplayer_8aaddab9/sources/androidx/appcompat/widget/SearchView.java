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
import android.util.Log;
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
import androidx.customview.view.AbsSavedState;
import c.b.i.a1;
import c.b.i.g1;
import c.b.i.i0;
import c.b.i.u0;
import c.i.k.d0;
import ch.qos.logback.core.net.SyslogConstants;
import com.android.music.QueryBrowserActivity;
import e.h.g.j0;
import e.h.g.j1;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class SearchView extends i0 implements c.b.h.b {
    public static final n p;
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public l L;
    public k M;
    public View.OnFocusChangeListener N;
    public m O;
    public View.OnClickListener P;
    public boolean U;
    public boolean V;
    public c.j.a.a W;
    public boolean a0;
    public CharSequence b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public boolean f0;
    public CharSequence g0;
    public CharSequence h0;
    public boolean i0;
    public int j0;
    public SearchableInfo k0;
    public Bundle l0;
    public final Runnable m0;
    public Runnable n0;
    public final WeakHashMap<String, Drawable.ConstantState> o0;
    public final View.OnClickListener p0;
    public final SearchAutoComplete q;
    public View.OnKeyListener q0;
    public final View r;
    public final TextView.OnEditorActionListener r0;
    public final View s;
    public final AdapterView.OnItemClickListener s0;
    public final View t;
    public final AdapterView.OnItemSelectedListener t0;
    public final ImageView u;
    public TextWatcher u0;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final View y;
    public o z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public boolean f221c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f221c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder y = e.a.d.a.a.y("SearchView.SavedState{");
            y.append(Integer.toHexString(System.identityHashCode(this)));
            y.append(" isIconified=");
            y.append(this.f221c);
            y.append("}");
            return y.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f369b, i2);
            parcel.writeValue(Boolean.valueOf(this.f221c));
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends c.b.i.d {

        /* renamed from: d  reason: collision with root package name */
        public int f222d;

        /* renamed from: e  reason: collision with root package name */
        public SearchView f223e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f224f;

        /* renamed from: g  reason: collision with root package name */
        public final Runnable f225g;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f224f) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f224f = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
            this.f225g = new a();
            this.f222d = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 < 960 || i3 < 720 || configuration.orientation != 2) {
                if (i2 < 600) {
                    if (i2 < 640 || i3 < 480) {
                        return SyslogConstants.LOG_LOCAL4;
                    }
                    return 192;
                }
                return 192;
            }
            return 256;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.p;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f227c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f222d <= 0 || super.enoughToFilter();
        }

        @Override // c.b.i.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f224f) {
                removeCallbacks(this.f225g);
                post(this.f225g);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f223e;
            searchView.H(searchView.V);
            searchView.post(searchView.m0);
            if (searchView.q.hasFocus()) {
                searchView.s();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f223e.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f223e.hasFocus() && getVisibility() == 0) {
                this.f224f = true;
                Context context = getContext();
                n nVar = SearchView.p;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f224f = false;
                removeCallbacks(this.f225g);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (!inputMethodManager.isActive(this)) {
                this.f224f = true;
            } else {
                this.f224f = false;
                removeCallbacks(this.f225g);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f223e = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f222d = i2;
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.q.getText();
            searchView.h0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.G(z);
            searchView.I(!z);
            searchView.C();
            searchView.F();
            if (searchView.L != null && !TextUtils.equals(charSequence, searchView.g0)) {
                l lVar = searchView.L;
                String charSequence2 = charSequence.toString();
                final QueryBrowserActivity queryBrowserActivity = (QueryBrowserActivity) lVar;
                Objects.requireNonNull(queryBrowserActivity);
                int length = charSequence2.length();
                String str = QueryBrowserActivity.f3010k;
                if (length < (str != null ? str.length() : 0)) {
                    queryBrowserActivity.y = true;
                }
                QueryBrowserActivity.f3010k = charSequence2;
                j0.i(new j0.c() { // from class: e.g.a.d.g
                    @Override // e.h.g.j0.c
                    public final void a() {
                        int b2;
                        e.g.a.a.k kVar = l.this.f8020d;
                        if (kVar == null || (b2 = kVar.b()) <= 0) {
                            return;
                        }
                        Object obj = j1.a;
                        kVar.a.d(0, b2, new Object());
                    }
                });
                queryBrowserActivity.B();
            }
            searchView.g0 = charSequence.toString();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.D();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.j.a.a aVar = SearchView.this.W;
            if (aVar instanceof u0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
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
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            if (searchView.y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.s.getPaddingLeft();
                Rect rect = new Rect();
                boolean a = g1.a(searchView);
                int dimensionPixelSize = searchView.U ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.q.getDropDownBackground().getPadding(rect);
                searchView.q.setDropDownHorizontalOffset(a ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.q.setDropDownWidth((((searchView.y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.u) {
                searchView.y();
            } else if (view == searchView.w) {
                searchView.u();
            } else if (view == searchView.v) {
                searchView.z();
            } else if (view != searchView.x) {
                if (view == searchView.q) {
                    searchView.s();
                }
            } else {
                SearchableInfo searchableInfo = searchView.k0;
                if (searchableInfo == null) {
                    return;
                }
                try {
                    if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.r(searchView.J, searchableInfo));
                            return;
                        }
                        return;
                    }
                    Intent intent = new Intent(searchView.I);
                    ComponentName searchActivity = searchableInfo.getSearchActivity();
                    intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                    searchView.getContext().startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    Log.w("SearchView", "Could not find voice search activity");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.k0 == null) {
                return false;
            }
            if (!searchView.q.isPopupShowing() || SearchView.this.q.getListSelection() == -1) {
                if (!(TextUtils.getTrimmedLength(SearchView.this.q.getText()) == 0) && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    SearchView searchView2 = SearchView.this;
                    searchView2.t(0, null, searchView2.q.getText().toString());
                    return true;
                }
                return false;
            }
            return SearchView.this.A(i2, keyEvent);
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.z();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.v(i2);
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.w(i2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    /* loaded from: classes.dex */
    public static class n {
        public Method a;

        /* renamed from: b  reason: collision with root package name */
        public Method f226b;

        /* renamed from: c  reason: collision with root package name */
        public Method f227c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            this.a = null;
            this.f226b = null;
            this.f227c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f226b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f227c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o extends TouchDelegate {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f228b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f229c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f230d;

        /* renamed from: e  reason: collision with root package name */
        public final int f231e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f232f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f231e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f228b = new Rect();
            this.f230d = new Rect();
            this.f229c = new Rect();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f228b.set(rect);
            this.f230d.set(rect);
            Rect rect3 = this.f230d;
            int i2 = this.f231e;
            rect3.inset(-i2, -i2);
            this.f229c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f232f;
                    if (z2 && !this.f230d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f232f;
                        this.f232f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else {
                if (this.f228b.contains(x, y)) {
                    this.f232f = true;
                    z = true;
                }
                z = true;
                z3 = false;
            }
            if (z3) {
                if (!z || this.f229c.contains(x, y)) {
                    Rect rect = this.f229c;
                    motionEvent.setLocation(x - rect.left, y - rect.top);
                } else {
                    motionEvent.setLocation(this.a.getWidth() / 2, this.a.getHeight() / 2);
                }
                return this.a.dispatchTouchEvent(motionEvent);
            }
            return false;
        }
    }

    static {
        p = Build.VERSION.SDK_INT < 29 ? new n() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.m0 = new b();
        this.n0 = new c();
        this.o0 = new WeakHashMap<>();
        f fVar = new f();
        this.p0 = fVar;
        this.q0 = new g();
        h hVar = new h();
        this.r0 = hVar;
        i iVar = new i();
        this.s0 = iVar;
        j jVar = new j();
        this.t0 = jVar;
        this.u0 = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.t, i2, 0);
        a1 a1Var = new a1(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(a1Var.l(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        Drawable g2 = a1Var.g(10);
        AtomicInteger atomicInteger = d0.a;
        d0.c.q(findViewById, g2);
        d0.c.q(findViewById2, a1Var.g(14));
        imageView.setImageDrawable(a1Var.g(13));
        imageView2.setImageDrawable(a1Var.g(7));
        imageView3.setImageDrawable(a1Var.g(4));
        imageView4.setImageDrawable(a1Var.g(16));
        imageView5.setImageDrawable(a1Var.g(13));
        this.F = a1Var.g(12);
        c.b.a.c(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = a1Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = a1Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.u0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.q0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(a1Var.a(8, true));
        int f2 = a1Var.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.K = a1Var.n(6);
        this.b0 = a1Var.n(11);
        int j2 = a1Var.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = a1Var.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(a1Var.a(0, true));
        obtainStyledAttributes.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        H(this.U);
        E();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public boolean A(int i2, KeyEvent keyEvent) {
        if (this.k0 != null && this.W != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return v(this.q.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                this.q.setSelection(i2 == 21 ? 0 : this.q.length());
                this.q.setListSelection(0);
                this.q.clearListSelection();
                this.q.a();
                return true;
            } else if (i2 != 19 || this.q.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    public void B(CharSequence charSequence, boolean z) {
        this.q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.h0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        z();
    }

    public final void C() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.q.getText());
        if (!z2 && (!this.U || this.i0)) {
            z = false;
        }
        this.w.setVisibility(z ? 0 : 8);
        Drawable drawable = this.w.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void D() {
        int[] iArr = this.q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void E() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.U && this.F != null) {
            double textSize = searchAutoComplete.getTextSize();
            Double.isNaN(textSize);
            Double.isNaN(textSize);
            int i2 = (int) (textSize * 1.25d);
            this.F.setBounds(0, 0, i2, i2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void F() {
        int i2 = 0;
        if (!((this.a0 || this.f0) && !this.V) || (this.v.getVisibility() != 0 && this.x.getVisibility() != 0)) {
            i2 = 8;
        }
        this.t.setVisibility(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2.f0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.a0
            r1 = 0
            if (r0 == 0) goto L21
            if (r0 != 0) goto Lb
            boolean r0 = r2.f0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.V
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.f0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.G(boolean):void");
    }

    public final void H(boolean z) {
        this.V = z;
        int i2 = 0;
        int i3 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.q.getText());
        this.u.setVisibility(i3);
        G(z2);
        this.r.setVisibility(z ? 8 : 0);
        this.E.setVisibility((this.E.getDrawable() == null || this.U) ? 8 : 8);
        C();
        I(!z2);
        F();
    }

    public final void I(boolean z) {
        int i2 = 8;
        if (this.f0 && !this.V && z) {
            this.v.setVisibility(8);
            i2 = 0;
        }
        this.x.setVisibility(i2);
    }

    @Override // c.b.h.b
    public void c() {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        int imeOptions = this.q.getImeOptions();
        this.j0 = imeOptions;
        this.q.setImeOptions(imeOptions | 33554432);
        this.q.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.d0 = true;
        super.clearFocus();
        this.q.clearFocus();
        this.q.setImeVisibility(false);
        this.d0 = false;
    }

    @Override // c.b.h.b
    public void e() {
        B("", false);
        clearFocus();
        H(true);
        this.q.setImeOptions(this.j0);
        this.i0 = false;
    }

    public int getImeOptions() {
        return this.q.getImeOptions();
    }

    public int getInputType() {
        return this.q.getInputType();
    }

    public int getMaxWidth() {
        return this.e0;
    }

    public CharSequence getQuery() {
        return this.q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.b0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.k0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.k0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public c.j.a.a getSuggestionsAdapter() {
        return this.W;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.m0);
        post(this.n0);
        super.onDetachedFromWindow();
    }

    @Override // c.b.i.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.q;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.D);
            int[] iArr = this.C;
            int i6 = iArr[1];
            int[] iArr2 = this.D;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.B;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            o oVar = this.z;
            if (oVar != null) {
                oVar.a(this.B, this.A);
                return;
            }
            o oVar2 = new o(this.B, this.A, this.q);
            this.z = oVar2;
            setTouchDelegate(oVar2);
        }
    }

    @Override // c.b.i.i0, android.view.View
    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.V) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.e0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.e0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.e0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f369b);
        H(savedState.f221c);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f221c = this.V;
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.m0);
    }

    public final Intent q(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.h0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.l0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.k0.getSearchActivity());
        return intent;
    }

    public final Intent r(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.l0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, Rect rect) {
        if (!this.d0 && isFocusable()) {
            if (this.V) {
                return super.requestFocus(i2, rect);
            }
            boolean requestFocus = this.q.requestFocus(i2, rect);
            if (requestFocus) {
                H(false);
            }
            return requestFocus;
        }
        return false;
    }

    public void s() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.q.refreshAutoCompleteResults();
            return;
        }
        n nVar = p;
        SearchAutoComplete searchAutoComplete = this.q;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = p;
        SearchAutoComplete searchAutoComplete2 = this.q;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f226b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.l0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            u();
        } else {
            y();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        H(z);
        E();
    }

    public void setImeOptions(int i2) {
        this.q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.e0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.b0 = charSequence;
        E();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.c0 = z;
        c.j.a.a aVar = this.W;
        if (aVar instanceof u0) {
            ((u0) aVar).r = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.k0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L6e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            android.app.SearchableInfo r3 = r6.k0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.k0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L36
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.k0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L36
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L36:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setInputType(r7)
            c.j.a.a r7 = r6.W
            if (r7 == 0) goto L42
            r7.b(r2)
        L42:
            android.app.SearchableInfo r7 = r6.k0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L6b
            c.b.i.u0 r7 = new c.b.i.u0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.k0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.o0
            r7.<init>(r3, r6, r4, r5)
            r6.W = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.q
            r3.setAdapter(r7)
            c.j.a.a r7 = r6.W
            c.b.i.u0 r7 = (c.b.i.u0) r7
            boolean r3 = r6.c0
            if (r3 == 0) goto L68
            r3 = 2
            goto L69
        L68:
            r3 = 1
        L69:
            r7.r = r3
        L6b:
            r6.E()
        L6e:
            android.app.SearchableInfo r7 = r6.k0
            r3 = 0
            if (r7 == 0) goto L9f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L9f
            android.app.SearchableInfo r7 = r6.k0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L84
            android.content.Intent r2 = r6.I
            goto L8e
        L84:
            android.app.SearchableInfo r7 = r6.k0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L8e
            android.content.Intent r2 = r6.J
        L8e:
            if (r2 == 0) goto L9f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L9f
            goto La0
        L9f:
            r0 = 0
        La0:
            r6.f0 = r0
            if (r0 == 0) goto Lab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        Lab:
            boolean r7 = r6.V
            r6.H(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.a0 = z;
        H(this.V);
    }

    public void setSuggestionsAdapter(c.j.a.a aVar) {
        this.W = aVar;
        this.q.setAdapter(aVar);
    }

    public void t(int i2, String str, String str2) {
        getContext().startActivity(q("android.intent.action.SEARCH", null, null, str2, i2, null));
    }

    public void u() {
        if (!TextUtils.isEmpty(this.q.getText())) {
            this.q.setText("");
            this.q.requestFocus();
            this.q.setImeVisibility(true);
        } else if (this.U) {
            k kVar = this.M;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                H(true);
            }
        }
    }

    public boolean v(int i2) {
        int i3;
        String h2;
        m mVar = this.O;
        if (mVar == null || !mVar.b(i2)) {
            Cursor cursor = this.W.f2246c;
            if (cursor != null && cursor.moveToPosition(i2)) {
                Intent intent = null;
                try {
                    int i4 = u0.f1241l;
                    String h3 = u0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h3 == null) {
                        h3 = this.k0.getSuggestIntentAction();
                    }
                    if (h3 == null) {
                        h3 = "android.intent.action.SEARCH";
                    }
                    String str = h3;
                    String h4 = u0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h4 == null) {
                        h4 = this.k0.getSuggestIntentData();
                    }
                    if (h4 != null && (h2 = u0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h4 = h4 + "/" + Uri.encode(h2);
                    }
                    intent = q(str, h4 == null ? null : Uri.parse(h4), u0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), u0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, null);
                } catch (RuntimeException e2) {
                    try {
                        i3 = cursor.getPosition();
                    } catch (RuntimeException unused) {
                        i3 = -1;
                    }
                    Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
                }
                if (intent != null) {
                    try {
                        getContext().startActivity(intent);
                    } catch (RuntimeException e3) {
                        Log.e("SearchView", "Failed launch activity: " + intent, e3);
                    }
                }
            }
            this.q.setImeVisibility(false);
            this.q.dismissDropDown();
            return true;
        }
        return false;
    }

    public boolean w(int i2) {
        m mVar = this.O;
        if (mVar == null || !mVar.a(i2)) {
            Editable text = this.q.getText();
            Cursor cursor = this.W.f2246c;
            if (cursor == null) {
                return true;
            }
            if (!cursor.moveToPosition(i2)) {
                setQuery(text);
                return true;
            }
            CharSequence c2 = this.W.c(cursor);
            if (c2 != null) {
                setQuery(c2);
                return true;
            }
            setQuery(text);
            return true;
        }
        return false;
    }

    public void x(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void y() {
        H(false);
        this.q.requestFocus();
        this.q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void z() {
        Editable text = this.q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        l lVar = this.L;
        if (lVar == null) {
            if (this.k0 != null) {
                t(0, null, text.toString());
            }
            this.q.setImeVisibility(false);
            this.q.dismissDropDown();
            return;
        }
        text.toString();
        QueryBrowserActivity queryBrowserActivity = (QueryBrowserActivity) lVar;
        SearchView searchView = queryBrowserActivity.u;
        if (searchView != null) {
            InputMethodManager inputMethodManager = queryBrowserActivity.s;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(searchView.getWindowToken(), 0);
            }
            queryBrowserActivity.u.clearFocus();
        }
    }
}
