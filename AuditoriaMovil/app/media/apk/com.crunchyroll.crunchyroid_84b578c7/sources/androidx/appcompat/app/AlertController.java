package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.amazon.aps.iva.k.o;
import com.crunchyroll.crunchyroid.R;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class AlertController {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final boolean P;
    public final c R;
    public final Context a;
    public final o b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
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
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    public int Q = 0;
    public final a S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {
        public final int b;
        public final int c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.amazon.aps.iva.j.a.u);
            this.c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.o && (message4 = alertController.q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.s && (message3 = alertController.u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.w && (message2 = alertController.y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            alertController.R.obtainMessage(1, alertController.b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int A;
        public int B;
        public int C;
        public boolean[] E;
        public boolean F;
        public boolean G;
        public DialogInterface.OnMultiChoiceClickListener I;
        public Cursor J;
        public String K;
        public String L;
        public AdapterView.OnItemSelectedListener M;
        public final Context a;
        public final LayoutInflater b;
        public Drawable d;
        public CharSequence e;
        public View f;
        public CharSequence g;
        public CharSequence h;
        public Drawable i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public Drawable l;
        public DialogInterface.OnClickListener m;
        public CharSequence n;
        public Drawable o;
        public DialogInterface.OnClickListener p;
        public DialogInterface.OnCancelListener r;
        public DialogInterface.OnDismissListener s;
        public DialogInterface.OnKeyListener t;
        public CharSequence[] u;
        public ListAdapter v;
        public DialogInterface.OnClickListener w;
        public int x;
        public View y;
        public int z;
        public int c = 0;
        public boolean D = false;
        public int H = -1;
        public boolean q = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.a = contextThemeWrapper;
            this.b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {
        public final WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, o oVar, Window window) {
        this.a = context;
        this.b = oVar;
        this.c = window;
        this.R = new c(oVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, com.amazon.aps.iva.j.a.e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        oVar.supportRequestWindowFeature(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
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

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup c(View view, View view2) {
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

    public final void d(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.p = charSequence;
                    this.q = message;
                    this.r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
            return;
        }
        this.x = charSequence;
        this.y = message;
        this.z = drawable;
    }

    public final void e(int i) {
        this.C = null;
        this.B = i;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }
}
