package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import c.b.c.u;
import java.lang.ref.WeakReference;
import music.musicplayer.R;
/* loaded from: classes.dex */
public class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final u f112b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f113c;

    /* renamed from: d  reason: collision with root package name */
    public final int f114d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f115e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f116f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f117g;

    /* renamed from: h  reason: collision with root package name */
    public View f118h;

    /* renamed from: i  reason: collision with root package name */
    public int f119i;

    /* renamed from: j  reason: collision with root package name */
    public int f120j;

    /* renamed from: k  reason: collision with root package name */
    public int f121k;

    /* renamed from: l  reason: collision with root package name */
    public int f122l;

    /* renamed from: m  reason: collision with root package name */
    public int f123m;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    /* renamed from: n  reason: collision with root package name */
    public boolean f124n = false;
    public int B = 0;
    public int I = -1;
    public final View.OnClickListener R = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final int f125b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.b.s);
            this.f125b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.o || (message3 = alertController.q) == null) ? (view != alertController.s || (message2 = alertController.u) == null) ? (view != alertController.w || (message = alertController.y) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.Q.obtainMessage(1, alertController2.f112b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f126b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f127c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f128d;

        /* renamed from: e  reason: collision with root package name */
        public View f129e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f130f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f131g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f132h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f133i;

        /* renamed from: j  reason: collision with root package name */
        public DialogInterface.OnClickListener f134j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnKeyListener f135k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence[] f136l;

        /* renamed from: m  reason: collision with root package name */
        public ListAdapter f137m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f138n;
        public View o;
        public boolean[] p;
        public boolean q;
        public boolean r;
        public int s = -1;
        public DialogInterface.OnMultiChoiceClickListener t;

        public b(Context context) {
            this.a = context;
            this.f126b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {
        public WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else if (i2 != 1) {
            } else {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i2) {
            return i2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, u uVar, Window window) {
        this.a = context;
        this.f112b = uVar;
        this.f113c = window;
        this.Q = new c(uVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, c.b.b.f774e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f114d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        uVar.a().u(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public void e(int i2, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        Message obtainMessage = onClickListener != null ? this.Q.obtainMessage(i2, onClickListener) : null;
        if (i2 == -3) {
            this.x = charSequence;
            this.y = obtainMessage;
            this.z = null;
        } else if (i2 == -2) {
            this.t = charSequence;
            this.u = obtainMessage;
            this.v = null;
        } else if (i2 != -1) {
            throw new IllegalArgumentException("Button does not exist");
        } else {
            this.p = charSequence;
            this.q = obtainMessage;
            this.r = null;
        }
    }
}
