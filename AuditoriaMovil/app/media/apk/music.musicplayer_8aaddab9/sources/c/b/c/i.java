package c.b.c;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import c.b.i.i0;
import c.i.k.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class i extends u implements DialogInterface {

    /* renamed from: c  reason: collision with root package name */
    public final AlertController f816c;

    /* loaded from: classes.dex */
    public static class a {
        public final AlertController.b a;

        /* renamed from: b  reason: collision with root package name */
        public final int f817b;

        public a(Context context) {
            int d2 = i.d(context, 0);
            this.a = new AlertController.b(new ContextThemeWrapper(context, i.d(context, d2)));
            this.f817b = d2;
        }

        public i a() {
            ListAdapter listAdapter;
            i iVar = new i(this.a.a, this.f817b);
            AlertController.b bVar = this.a;
            AlertController alertController = iVar.f816c;
            View view = bVar.f129e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar.f128d;
                if (charSequence != null) {
                    alertController.f115e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f127c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar.f130f;
            if (charSequence2 != null) {
                alertController.f116f = charSequence2;
                TextView textView2 = alertController.F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f131g;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar.f132h, null, null);
            }
            CharSequence charSequence4 = bVar.f133i;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar.f134j, null, null);
            }
            if (bVar.f136l != null || bVar.f137m != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f126b.inflate(alertController.L, (ViewGroup) null);
                if (bVar.q) {
                    listAdapter = new f(bVar, bVar.a, alertController.M, 16908308, bVar.f136l, recycleListView);
                } else {
                    int i2 = bVar.r ? alertController.N : alertController.O;
                    listAdapter = bVar.f137m;
                    if (listAdapter == null) {
                        listAdapter = new AlertController.d(bVar.a, i2, 16908308, bVar.f136l);
                    }
                }
                alertController.H = listAdapter;
                alertController.I = bVar.s;
                if (bVar.f138n != null) {
                    recycleListView.setOnItemClickListener(new g(bVar, alertController));
                } else if (bVar.t != null) {
                    recycleListView.setOnItemClickListener(new h(bVar, recycleListView, alertController));
                }
                if (bVar.r) {
                    recycleListView.setChoiceMode(1);
                } else if (bVar.q) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f117g = recycleListView;
            }
            View view2 = bVar.o;
            if (view2 != null) {
                alertController.f118h = view2;
                alertController.f119i = 0;
                alertController.f124n = false;
            }
            Objects.requireNonNull(this.a);
            iVar.setCancelable(true);
            Objects.requireNonNull(this.a);
            iVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.a);
            iVar.setOnCancelListener(null);
            Objects.requireNonNull(this.a);
            iVar.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.a.f135k;
            if (onKeyListener != null) {
                iVar.setOnKeyListener(onKeyListener);
            }
            return iVar;
        }

        public a b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.f133i = charSequence;
            bVar.f134j = onClickListener;
            return this;
        }

        public a c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.a;
            bVar.f131g = charSequence;
            bVar.f132h = onClickListener;
            return this;
        }

        public i d() {
            i a = a();
            a.show();
            return a;
        }
    }

    public i(Context context, int i2) {
        super(context, d(context, i2));
        this.f816c = new AlertController(getContext(), this, getWindow());
    }

    public static int d(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // c.b.c.u, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f816c;
        alertController.f112b.setContentView(alertController.K == 0 ? alertController.J : alertController.J);
        View findViewById2 = alertController.f113c.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view3 = alertController.f118h;
        if (view3 == null) {
            view3 = alertController.f119i != 0 ? LayoutInflater.from(alertController.a).inflate(alertController.f119i, viewGroup, false) : null;
        }
        boolean z2 = view3 != null;
        if (!z2 || !AlertController.a(view3)) {
            alertController.f113c.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.f113c.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f124n) {
                frameLayout.setPadding(alertController.f120j, alertController.f121k, alertController.f122l, alertController.f123m);
            }
            if (alertController.f117g != null) {
                ((LinearLayout.LayoutParams) ((i0.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d2 = alertController.d(findViewById6, findViewById3);
        ViewGroup d3 = alertController.d(findViewById7, findViewById4);
        ViewGroup d4 = alertController.d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f113c.findViewById(R.id.scrollView);
        alertController.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d3.findViewById(16908299);
        alertController.F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f116f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.A.removeView(alertController.F);
                if (alertController.f117g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f117g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d3.setVisibility(8);
                }
            }
        }
        Button button = (Button) d4.findViewById(16908313);
        alertController.o = button;
        button.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.p) && alertController.r == null) {
            alertController.o.setVisibility(8);
            z = false;
        } else {
            alertController.o.setText(alertController.p);
            Drawable drawable = alertController.r;
            if (drawable != null) {
                int i2 = alertController.f114d;
                drawable.setBounds(0, 0, i2, i2);
                alertController.o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.o.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) d4.findViewById(16908314);
        alertController.s = button2;
        button2.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.t) && alertController.v == null) {
            alertController.s.setVisibility(8);
        } else {
            alertController.s.setText(alertController.t);
            Drawable drawable2 = alertController.v;
            if (drawable2 != null) {
                int i3 = alertController.f114d;
                drawable2.setBounds(0, 0, i3, i3);
                alertController.s.setCompoundDrawables(alertController.v, null, null, null);
            }
            alertController.s.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) d4.findViewById(16908315);
        alertController.w = button3;
        button3.setOnClickListener(alertController.R);
        if (TextUtils.isEmpty(alertController.x) && alertController.z == null) {
            alertController.w.setVisibility(8);
            view = null;
        } else {
            alertController.w.setText(alertController.x);
            Drawable drawable3 = alertController.z;
            if (drawable3 != null) {
                int i4 = alertController.f114d;
                drawable3.setBounds(0, 0, i4, i4);
                view = null;
                alertController.w.setCompoundDrawables(alertController.z, null, null, null);
            } else {
                view = null;
            }
            alertController.w.setVisibility(0);
            z |= true;
        }
        Context context = alertController.a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                alertController.b(alertController.o);
            } else if (z) {
                alertController.b(alertController.s);
            } else if (z) {
                alertController.b(alertController.w);
            }
        }
        if (!(z)) {
            d4.setVisibility(8);
        }
        if (alertController.G != null) {
            d2.addView(alertController.G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f113c.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.D = (ImageView) alertController.f113c.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f115e)) && alertController.P) {
                TextView textView2 = (TextView) alertController.f113c.findViewById(R.id.alertTitle);
                alertController.E = textView2;
                textView2.setText(alertController.f115e);
                int i5 = alertController.B;
                if (i5 != 0) {
                    alertController.D.setImageResource(i5);
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
                alertController.f113c.findViewById(R.id.title_template).setVisibility(8);
                alertController.D.setVisibility(8);
                d2.setVisibility(8);
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i6 = (d2 == null || d2.getVisibility() == 8) ? 0 : 1;
        boolean z4 = d4.getVisibility() != 8;
        if (!z4 && (findViewById = d3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = alertController.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f116f == null && alertController.f117g == null) ? view : d2.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = d3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f117g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i6 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i6 != 0 ? recycleListView.getPaddingTop() : recycleListView.a, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.f125b);
            }
        }
        if (!z3) {
            View view4 = alertController.f117g;
            if (view4 == null) {
                view4 = alertController.A;
            }
            if (view4 != null) {
                int i7 = i6 | (z4 ? 2 : 0);
                View findViewById11 = alertController.f113c.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f113c.findViewById(R.id.scrollIndicatorDown);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 23) {
                    AtomicInteger atomicInteger = d0.a;
                    if (i8 >= 23) {
                        d0.i.d(view4, i7, 3);
                    }
                    if (findViewById11 != null) {
                        d3.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        d3.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i7 & 1) == 0) {
                        d3.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (findViewById12 == null || (i7 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        d3.removeView(findViewById12);
                        view2 = view;
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f116f != null) {
                            alertController.A.setOnScrollChangeListener(new b(alertController, findViewById11, view2));
                            alertController.A.post(new c(alertController, findViewById11, view2));
                        } else {
                            ListView listView2 = alertController.f117g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new d(alertController, findViewById11, view2));
                                alertController.f117g.post(new e(alertController, findViewById11, view2));
                            } else {
                                if (findViewById11 != null) {
                                    d3.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    d3.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f117g;
        if (listView3 == null || (listAdapter = alertController.H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i9 = alertController.I;
        if (i9 > -1) {
            listView3.setItemChecked(i9, true);
            listView3.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f816c.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f816c.A;
        if (nestedScrollView != null && nestedScrollView.h(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // c.b.c.u, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f816c;
        alertController.f115e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
