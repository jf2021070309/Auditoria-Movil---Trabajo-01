package com.ellation.widgets.seekbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.SeekBar;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.q.x;
import com.amazon.aps.iva.xw.t0;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.eventdispatcher.EventDispatcher;
import com.ellation.crunchyroll.ui.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
/* compiled from: EasySeekSeekBar.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\u0013\u001a\u00020\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ellation/widgets/seekbar/EasySeekSeekBar;", "Lcom/amazon/aps/iva/q/x;", "Lcom/amazon/aps/iva/t70/b;", "Lcom/ellation/crunchyroll/eventdispatcher/EventDispatcher;", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "", "thumbOffset", "Lcom/amazon/aps/iva/kb0/q;", "setThumbOffset", "Landroid/graphics/drawable/Drawable;", "d", "setProgressDrawable", "getThumbWidth", "", "F", "getFingerOffset", "()F", "setFingerOffset", "(F)V", "fingerOffset", "getListenerCount", "()I", "listenerCount", "getSeekBarWidth", "seekBarWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes2.dex */
public final class EasySeekSeekBar extends x implements com.amazon.aps.iva.t70.b, EventDispatcher<SeekBar.OnSeekBarChangeListener> {
    public final /* synthetic */ EventDispatcher.EventDispatcherImpl<SeekBar.OnSeekBarChangeListener> c;
    public float d;
    public final com.amazon.aps.iva.t70.a e;

    /* compiled from: EasySeekSeekBar.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* compiled from: EasySeekSeekBar.kt */
        /* renamed from: com.ellation.widgets.seekbar.EasySeekSeekBar$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0977a extends l implements com.amazon.aps.iva.xb0.l<SeekBar.OnSeekBarChangeListener, q> {
            public final /* synthetic */ SeekBar h;
            public final /* synthetic */ int i;
            public final /* synthetic */ boolean j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0977a(SeekBar seekBar, int i, boolean z) {
                super(1);
                this.h = seekBar;
                this.i = i;
                this.j = z;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                j.f(onSeekBarChangeListener2, "$this$notify");
                onSeekBarChangeListener2.onProgressChanged(this.h, this.i, this.j);
                return q.a;
            }
        }

        /* compiled from: EasySeekSeekBar.kt */
        /* loaded from: classes2.dex */
        public static final class b extends l implements com.amazon.aps.iva.xb0.l<SeekBar.OnSeekBarChangeListener, q> {
            public final /* synthetic */ SeekBar h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SeekBar seekBar) {
                super(1);
                this.h = seekBar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                j.f(onSeekBarChangeListener2, "$this$notify");
                onSeekBarChangeListener2.onStartTrackingTouch(this.h);
                return q.a;
            }
        }

        /* compiled from: EasySeekSeekBar.kt */
        /* loaded from: classes2.dex */
        public static final class c extends l implements com.amazon.aps.iva.xb0.l<SeekBar.OnSeekBarChangeListener, q> {
            public final /* synthetic */ SeekBar h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SeekBar seekBar) {
                super(1);
                this.h = seekBar;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
                j.f(onSeekBarChangeListener2, "$this$notify");
                onSeekBarChangeListener2.onStopTrackingTouch(this.h);
                return q.a;
            }
        }

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            EasySeekSeekBar.this.notify(new C0977a(seekBar, i, z));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            EasySeekSeekBar.this.notify(new b(seekBar));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            EasySeekSeekBar.this.notify(new c(seekBar));
        }
    }

    /* compiled from: EasySeekSeekBar.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<SeekBar.OnSeekBarChangeListener, q> {
        public final /* synthetic */ MotionEvent i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MotionEvent motionEvent) {
            super(1);
            this.i = motionEvent;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
            j.f(onSeekBarChangeListener2, "$this$notify");
            EasySeekSeekBar easySeekSeekBar = EasySeekSeekBar.this;
            onSeekBarChangeListener2.onProgressChanged(easySeekSeekBar, easySeekSeekBar.getProgress(), true);
            int action = this.i.getAction();
            if (action != 0) {
                if (action == 1) {
                    onSeekBarChangeListener2.onStopTrackingTouch(easySeekSeekBar);
                }
            } else {
                onSeekBarChangeListener2.onStartTrackingTouch(easySeekSeekBar);
            }
            return q.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EasySeekSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        this.c = new EventDispatcher.EventDispatcherImpl<>();
        this.e = new com.amazon.aps.iva.t70.a(this);
        int[] iArr = R.styleable.EasySeekSeekBar;
        j.e(iArr, "EasySeekSeekBar");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setFingerOffset(obtainStyledAttributes.getDimension(R.styleable.EasySeekSeekBar_finger_offset, 0.0f));
        obtainStyledAttributes.recycle();
        setOnSeekBarChangeListener(new a());
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void addEventListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
        j.f(onSeekBarChangeListener2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c.addEventListener(onSeekBarChangeListener2);
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void clear() {
        this.c.clear();
    }

    @Override // com.amazon.aps.iva.t70.b
    public float getFingerOffset() {
        return this.d;
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public int getListenerCount() {
        return this.c.getListenerCount();
    }

    @Override // com.amazon.aps.iva.t70.b
    public float getSeekBarWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getThumbWidth() {
        return getThumb().getIntrinsicWidth();
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void notify(com.amazon.aps.iva.xb0.l<? super SeekBar.OnSeekBarChangeListener, q> lVar) {
        j.f(lVar, "action");
        this.c.notify(lVar);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(f1.J(t0.b(this)));
        }
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j.f(motionEvent, "event");
        float x = motionEvent.getX() - getPaddingLeft();
        com.amazon.aps.iva.t70.b bVar = this.e.a;
        float seekBarWidth = (x / bVar.getSeekBarWidth()) * bVar.getMax();
        bVar.setProgress((int) ((((seekBarWidth - (bVar.getMax() / 2.0f)) / (bVar.getMax() / 2.0f)) * (bVar.getFingerOffset() / bVar.getSeekBarWidth()) * bVar.getMax()) + seekBarWidth));
        notify(new b(motionEvent));
        return true;
    }

    @Override // com.ellation.crunchyroll.eventdispatcher.EventDispatcher
    public final void removeEventListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener2 = onSeekBarChangeListener;
        j.f(onSeekBarChangeListener2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.c.removeEventListener(onSeekBarChangeListener2);
    }

    public void setFingerOffset(float f) {
        this.d = f;
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        super.setProgressDrawable(drawable);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }

    @Override // android.widget.AbsSeekBar
    public void setThumbOffset(int i) {
        super.setThumbOffset(i);
        onSizeChanged(getWidth(), getHeight(), 0, 0);
    }
}
