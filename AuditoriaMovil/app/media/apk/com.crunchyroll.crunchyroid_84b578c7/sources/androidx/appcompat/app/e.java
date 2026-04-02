package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.amazon.aps.iva.k.o;
import com.amazon.aps.iva.p3.g0;
import com.amazon.aps.iva.p3.r0;
import com.crunchyroll.crunchyroid.R;
import java.util.WeakHashMap;
/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class e extends o implements DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final AlertController mAlert;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {
        private final AlertController.b P;
        private final int mTheme;

        public a(Context context) {
            this(context, e.resolveDialogTheme(context, 0));
        }

        public e create() {
            int i;
            ListAdapter listAdapter;
            e eVar = new e(this.P.a, this.mTheme);
            AlertController.b bVar = this.P;
            AlertController alertController = eVar.mAlert;
            View view = bVar.f;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.e;
                if (charSequence != null) {
                    alertController.e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.d;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
                int i2 = bVar.c;
                if (i2 != 0) {
                    alertController.e(i2);
                }
            }
            CharSequence charSequence2 = bVar.g;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.h;
            if (charSequence3 != null || bVar.i != null) {
                alertController.d(-1, charSequence3, bVar.j, null, bVar.i);
            }
            CharSequence charSequence4 = bVar.k;
            if (charSequence4 != null || bVar.l != null) {
                alertController.d(-2, charSequence4, bVar.m, null, bVar.l);
            }
            CharSequence charSequence5 = bVar.n;
            if (charSequence5 != null || bVar.o != null) {
                alertController.d(-3, charSequence5, bVar.p, null, bVar.o);
            }
            if (bVar.u != null || bVar.J != null || bVar.v != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.F) {
                    if (bVar.J == null) {
                        listAdapter = new androidx.appcompat.app.a(bVar, bVar.a, alertController.M, bVar.u, recycleListView);
                    } else {
                        listAdapter = new b(bVar, bVar.a, bVar.J, recycleListView, alertController);
                    }
                } else {
                    if (bVar.G) {
                        i = alertController.N;
                    } else {
                        i = alertController.O;
                    }
                    if (bVar.J != null) {
                        listAdapter = new SimpleCursorAdapter(bVar.a, i, bVar.J, new String[]{bVar.K}, new int[]{16908308});
                    } else {
                        listAdapter = bVar.v;
                        if (listAdapter == null) {
                            listAdapter = new AlertController.d(bVar.a, i, bVar.u);
                        }
                    }
                }
                alertController.H = listAdapter;
                alertController.I = bVar.H;
                if (bVar.w != null) {
                    recycleListView.setOnItemClickListener(new c(bVar, alertController));
                } else if (bVar.I != null) {
                    recycleListView.setOnItemClickListener(new d(bVar, recycleListView, alertController));
                }
                AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.M;
                if (onItemSelectedListener != null) {
                    recycleListView.setOnItemSelectedListener(onItemSelectedListener);
                }
                if (bVar.G) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.F) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.g = recycleListView;
            }
            View view2 = bVar.y;
            if (view2 != null) {
                if (bVar.D) {
                    int i3 = bVar.z;
                    int i4 = bVar.A;
                    int i5 = bVar.B;
                    int i6 = bVar.C;
                    alertController.h = view2;
                    alertController.i = 0;
                    alertController.n = true;
                    alertController.j = i3;
                    alertController.k = i4;
                    alertController.l = i5;
                    alertController.m = i6;
                } else {
                    alertController.h = view2;
                    alertController.i = 0;
                    alertController.n = false;
                }
            } else {
                int i7 = bVar.x;
                if (i7 != 0) {
                    alertController.h = null;
                    alertController.i = i7;
                    alertController.n = false;
                }
            }
            eVar.setCancelable(this.P.q);
            if (this.P.q) {
                eVar.setCanceledOnTouchOutside(true);
            }
            eVar.setOnCancelListener(this.P.r);
            eVar.setOnDismissListener(this.P.s);
            DialogInterface.OnKeyListener onKeyListener = this.P.t;
            if (onKeyListener != null) {
                eVar.setOnKeyListener(onKeyListener);
            }
            return eVar;
        }

        public Context getContext() {
            return this.P.a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = listAdapter;
            bVar.w = onClickListener;
            return this;
        }

        public a setCancelable(boolean z) {
            this.P.q = z;
            return this;
        }

        public a setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.K = str;
            bVar.w = onClickListener;
            return this;
        }

        public a setCustomTitle(View view) {
            this.P.f = view;
            return this;
        }

        public a setIcon(int i) {
            this.P.c = i;
            return this;
        }

        public a setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.P.a.getTheme().resolveAttribute(i, typedValue, true);
            this.P.c = typedValue.resourceId;
            return this;
        }

        @Deprecated
        public a setInverseBackgroundForced(boolean z) {
            this.P.getClass();
            return this;
        }

        public a setItems(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            this.P.w = onClickListener;
            return this;
        }

        public a setMessage(int i) {
            AlertController.b bVar = this.P;
            bVar.g = bVar.a.getText(i);
            return this;
        }

        public a setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.I = onMultiChoiceClickListener;
            bVar2.E = zArr;
            bVar2.F = true;
            return this;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.k = bVar.a.getText(i);
            this.P.m = onClickListener;
            return this;
        }

        public a setNegativeButtonIcon(Drawable drawable) {
            this.P.l = drawable;
            return this;
        }

        public a setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.n = bVar.a.getText(i);
            this.P.p = onClickListener;
            return this;
        }

        public a setNeutralButtonIcon(Drawable drawable) {
            this.P.o = drawable;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.P.r = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.P.s = onDismissListener;
            return this;
        }

        public a setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.M = onItemSelectedListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.P.t = onKeyListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.h = bVar.a.getText(i);
            this.P.j = onClickListener;
            return this;
        }

        public a setPositiveButtonIcon(Drawable drawable) {
            this.P.i = drawable;
            return this;
        }

        public a setRecycleOnMeasureEnabled(boolean z) {
            this.P.getClass();
            return this;
        }

        public a setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = bVar.a.getResources().getTextArray(i);
            AlertController.b bVar2 = this.P;
            bVar2.w = onClickListener;
            bVar2.H = i2;
            bVar2.G = true;
            return this;
        }

        public a setTitle(int i) {
            AlertController.b bVar = this.P;
            bVar.e = bVar.a.getText(i);
            return this;
        }

        public a setView(int i) {
            AlertController.b bVar = this.P;
            bVar.y = null;
            bVar.x = i;
            bVar.D = false;
            return this;
        }

        public e show() {
            e create = create();
            create.show();
            return create;
        }

        public a(Context context, int i) {
            this.P = new AlertController.b(new ContextThemeWrapper(context, e.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public a setIcon(Drawable drawable) {
            this.P.d = drawable;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.P.g = charSequence;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.P.e = charSequence;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.w = onClickListener;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.k = charSequence;
            bVar.m = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.n = charSequence;
            bVar.p = onClickListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.h = charSequence;
            bVar.j = onClickListener;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.P;
            bVar.y = view;
            bVar.x = 0;
            bVar.D = false;
            return this;
        }

        public a setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.I = onMultiChoiceClickListener;
            bVar.E = zArr;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.K = str;
            bVar.G = true;
            return this;
        }

        @Deprecated
        public a setView(View view, int i, int i2, int i3, int i4) {
            AlertController.b bVar = this.P;
            bVar.y = view;
            bVar.x = 0;
            bVar.D = true;
            bVar.z = i;
            bVar.A = i2;
            bVar.B = i3;
            bVar.C = i4;
            return this;
        }

        public a setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.P;
            bVar.J = cursor;
            bVar.I = onMultiChoiceClickListener;
            bVar.L = str;
            bVar.K = str2;
            bVar.F = true;
            return this;
        }

        public a setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.u = charSequenceArr;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.G = true;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.P;
            bVar.v = listAdapter;
            bVar.w = onClickListener;
            bVar.H = i;
            bVar.G = true;
            return this;
        }
    }

    public e(Context context) {
        this(context, 0);
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        AlertController alertController = this.mAlert;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    alertController.getClass();
                    return null;
                }
                return alertController.o;
            }
            return alertController.s;
        }
        return alertController.w;
    }

    public ListView getListView() {
        return this.mAlert.g;
    }

    @Override // com.amazon.aps.iva.k.o, com.amazon.aps.iva.e.j, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        View view;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        int i3;
        ListAdapter listAdapter;
        int i4;
        int i5;
        int i6;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.mAlert;
        int i7 = alertController.J;
        int i8 = alertController.K;
        if (i8 != 0 && alertController.Q == 1) {
            i7 = i8;
        }
        alertController.b.setContentView(i7);
        Window window = alertController.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = alertController.h;
        Context context = alertController.a;
        if (view2 == null) {
            if (alertController.i != 0) {
                view2 = LayoutInflater.from(context).inflate(alertController.i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !AlertController.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.n) {
                frameLayout.setPadding(alertController.j, alertController.k, alertController.l, alertController.m);
            }
            if (alertController.g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup c = AlertController.c(findViewById7, findViewById4);
        ViewGroup c2 = AlertController.c(findViewById8, findViewById5);
        ViewGroup c3 = AlertController.c(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c2.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    c2.setVisibility(8);
                }
            }
        }
        Button button = (Button) c3.findViewById(16908313);
        alertController.o = button;
        AlertController.a aVar = alertController.S;
        button.setOnClickListener(aVar);
        boolean isEmpty = TextUtils.isEmpty(alertController.p);
        int i9 = alertController.d;
        if (isEmpty && alertController.r == null) {
            alertController.o.setVisibility(8);
            z2 = false;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i9, i9);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z2 = true;
        }
        Button button2 = (Button) c3.findViewById(16908314);
        alertController.s = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i9, i9);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z2 |= true;
        }
        Button button3 = (Button) c3.findViewById(16908315);
        alertController.w = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                i = 0;
                drawable3.setBounds(0, 0, i9, i9);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                i = 0;
                view = null;
            }
            alertController.w.setVisibility(i);
            z2 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                AlertController.b(alertController.o);
            } else if (z2) {
                AlertController.b(alertController.s);
            } else if (z2) {
                AlertController.b(alertController.w);
            }
        }
        if (z2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            c3.setVisibility(8);
        }
        if (alertController.G != null) {
            c.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) window.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.e)) && alertController.P) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.e);
                int i10 = alertController.B;
                if (i10 != 0) {
                    alertController.D.setImageResource(i10);
                } else {
                    Drawable drawable4 = alertController.C;
                    if (drawable4 != null) {
                        alertController.D.setImageDrawable(drawable4);
                    } else {
                        alertController.E.setPadding(alertController.D.getPaddingLeft(), alertController.D.getPaddingTop(), alertController.D.getPaddingRight(), alertController.D.getPaddingBottom());
                        alertController.D.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                c.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (c != null && c.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (c3.getVisibility() != 8) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 && (findViewById2 = c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f == null && alertController.g == null) {
                findViewById = view;
            } else {
                findViewById = c.findViewById(R.id.titleDividerNoCustom);
            }
            i3 = 0;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            i3 = 0;
            View findViewById10 = c2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z6 || i2 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i2 != 0) {
                    i5 = recycleListView.getPaddingTop();
                } else {
                    i5 = recycleListView.b;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z6) {
                    i6 = recycleListView.getPaddingBottom();
                } else {
                    i6 = recycleListView.c;
                }
                recycleListView.setPadding(paddingLeft, i5, paddingRight, i6);
            }
        }
        if (!z5) {
            View view3 = alertController.g;
            if (view3 == null) {
                view3 = alertController.A;
            }
            if (view3 != null) {
                if (z6) {
                    i4 = 2;
                } else {
                    i4 = i3;
                }
                int i11 = i2 | i4;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap<View, r0> weakHashMap = g0.a;
                g0.j.d(view3, i11, 3);
                if (findViewById11 != null) {
                    c2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    c2.removeView(findViewById12);
                }
            }
        }
        AlertController.RecycleListView recycleListView2 = alertController.g;
        if (recycleListView2 != null && (listAdapter = alertController.H) != null) {
            recycleListView2.setAdapter(listAdapter);
            int i12 = alertController.I;
            if (i12 > -1) {
                recycleListView2.setItemChecked(i12, true);
                recycleListView2.setSelection(i12);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.mAlert.A;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        boolean z;
        NestedScrollView nestedScrollView = this.mAlert.A;
        if (nestedScrollView != null && nestedScrollView.d(keyEvent)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.d(i, charSequence, null, message, null);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.Q = i;
    }

    public void setCustomTitle(View view) {
        this.mAlert.G = view;
    }

    public void setIcon(int i) {
        this.mAlert.e(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.e(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        AlertController alertController = this.mAlert;
        alertController.f = charSequence;
        TextView textView = alertController.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.amazon.aps.iva.k.o, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.mAlert;
        alertController.e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view) {
        AlertController alertController = this.mAlert;
        alertController.h = view;
        alertController.i = 0;
        alertController.n = false;
    }

    public e(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.d(i, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        AlertController alertController = this.mAlert;
        alertController.C = drawable;
        alertController.B = 0;
        ImageView imageView = alertController.D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                alertController.D.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.d(i, charSequence, onClickListener, null, drawable);
    }

    public e(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        AlertController alertController = this.mAlert;
        alertController.h = view;
        alertController.i = 0;
        alertController.n = true;
        alertController.j = i;
        alertController.k = i2;
        alertController.l = i3;
        alertController.m = i4;
    }
}
