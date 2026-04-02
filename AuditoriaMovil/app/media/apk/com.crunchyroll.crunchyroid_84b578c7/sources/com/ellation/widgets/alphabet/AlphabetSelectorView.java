package com.ellation.widgets.alphabet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Transformation;
import android.widget.SectionIndexer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.aps.iva.b70.c;
import com.amazon.aps.iva.b70.d;
import com.amazon.aps.iva.kb0.f;
import com.amazon.aps.iva.kb0.m;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.ui.R;
import com.google.android.gms.cast.MediaError;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AlphabetSelectorView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002R.\u0010\u001d\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010.\u001a\u0004\b5\u00100\"\u0004\b6\u00102R\"\u0010;\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010.\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\"\u0010?\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R\"\u0010C\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R\"\u0010G\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010.\u001a\u0004\bE\u00100\"\u0004\bF\u00102R\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"Lcom/ellation/widgets/alphabet/AlphabetSelectorView;", "Landroid/view/View;", "", "textSize", "Lcom/amazon/aps/iva/kb0/q;", "setIndexBarTextSize", "Landroid/graphics/Typeface;", "typeface", "setIndexBarFont", "setBigLetterTextSize", "", "textColor", "setBigLetterTextColor", "setBigLetterFont", "Landroid/util/AttributeSet;", "attrs", "setCustomAttributes", "getSectionXCoordinate", "", "getCurrentCharacter", "getFirstVisiblePosition", "Landroid/widget/SectionIndexer;", "value", "c", "Landroid/widget/SectionIndexer;", "getIndexer", "()Landroid/widget/SectionIndexer;", "setIndexer", "(Landroid/widget/SectionIndexer;)V", "indexer", "d", "I", "getCurrentSection", "()I", "setCurrentSection", "(I)V", "currentSection", "", "f", "Z", "getShowIndexBackground", "()Z", "setShowIndexBackground", "(Z)V", "showIndexBackground", "g", "F", "getIndexBarMarginTop", "()F", "setIndexBarMarginTop", "(F)V", "indexBarMarginTop", "h", "getBigLetterMarginRight", "setBigLetterMarginRight", "bigLetterMarginRight", "i", "getBigLetterSize", "setBigLetterSize", "bigLetterSize", "j", "getBarTextColor", "setBarTextColor", "barTextColor", "k", "getBarSelectedTextColor", "setBarSelectedTextColor", "barSelectedTextColor", "l", "getLetterViewHeight", "setLetterViewHeight", "letterViewHeight", "Landroidx/recyclerview/widget/RecyclerView$j;", "D", "Lcom/amazon/aps/iva/kb0/e;", "getDataObserver", "()Landroidx/recyclerview/widget/RecyclerView$j;", "dataObserver", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AlphabetSelectorView extends View {
    public static final /* synthetic */ int F = 0;
    public final Rect A;
    public final Transformation B;
    public final AlphaAnimation C;
    public final m D;
    public d E;
    public RecyclerView b;
    public SectionIndexer c;
    public int d;
    public String[] e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public int j;
    public int k;
    public float l;
    public final Paint m;
    public final Paint n;
    public final RectF o;
    public final float p;
    public boolean q;
    public float r;
    public Rect s;
    public final int t;
    public final int u;
    public String v;
    public final Paint w;
    public RectF x;
    public final Paint y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphabetSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        j.f(context, "context");
        this.e = new String[0];
        this.j = -3355444;
        this.k = -1;
        this.l = getResources().getDimension(R.dimen.alphabet_default_small_letter_height);
        Paint paint = new Paint();
        this.m = paint;
        Paint paint2 = new Paint();
        this.n = paint2;
        this.o = new RectF();
        this.p = getResources().getDimension(R.dimen.alphabet_default_bar_width);
        this.s = new Rect();
        this.t = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
        this.u = 255;
        this.v = "";
        Paint paint3 = new Paint();
        this.w = paint3;
        this.x = new RectF();
        Paint paint4 = new Paint();
        this.y = paint4;
        this.z = 255;
        this.A = new Rect();
        this.B = new Transformation();
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.C = alphaAnimation;
        this.D = f.b(new c(this));
        alphaAnimation.setDuration(500L);
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        paint3.setColor(-1);
        paint3.setAlpha(this.z);
        paint3.setAntiAlias(true);
        paint3.setPathEffect(new CornerPathEffect(10.0f));
        paint4.setAlpha(this.z);
        paint4.setAntiAlias(true);
        paint4.setTextAlign(Paint.Align.CENTER);
        setCustomAttributes(attributeSet);
    }

    private final String getCurrentCharacter() {
        Object obj;
        Object[] sections;
        SectionIndexer sectionIndexer = this.c;
        if (sectionIndexer != null && (sections = sectionIndexer.getSections()) != null) {
            obj = sections[this.d];
        } else {
            obj = null;
        }
        return String.valueOf(obj);
    }

    private final RecyclerView.j getDataObserver() {
        return (RecyclerView.j) this.D.getValue();
    }

    private final int getFirstVisiblePosition() {
        RecyclerView.p pVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            pVar = recyclerView.getLayoutManager();
        } else {
            pVar = null;
        }
        if (pVar instanceof GridLayoutManager) {
            return ((GridLayoutManager) pVar).findFirstVisibleItemPosition();
        }
        if (pVar instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) pVar).findFirstCompletelyVisibleItemPosition();
        }
        return 0;
    }

    private final float getSectionXCoordinate() {
        RectF rectF = this.o;
        float f = 2;
        return (rectF.right - (rectF.width() / f)) - (this.m.measureText(this.v) / f);
    }

    private final void setCustomAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.AlphabetPanelRecyclerView, 0, 0);
            j.e(obtainStyledAttributes, "context.theme.obtainStyl…rView, 0, 0\n            )");
            this.f = obtainStyledAttributes.getBoolean(R.styleable.AlphabetPanelRecyclerView_showIndexBackground, false);
            this.g = obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_indexBarMarginTop, getResources().getDimension(R.dimen.alphabet_default_bar_margin_top));
            setIndexBarTextSize(obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_indexBarTextSize, getResources().getDimension(R.dimen.alphabet_default_small_letter_text_size)));
            this.j = obtainStyledAttributes.getColor(R.styleable.AlphabetPanelRecyclerView_indexBarInactiveTextColor, -3355444);
            this.k = obtainStyledAttributes.getColor(R.styleable.AlphabetPanelRecyclerView_indexBarSelectedTextColor, -1);
            this.h = obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_bigLetterMarginRight, getResources().getDimension(R.dimen.alphabet_default_letter_margin_right));
            this.i = obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_bigLetterSize, getResources().getDimension(R.dimen.alphabet_default_big_letter_height));
            this.l = obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_letterViewHeight, getResources().getDimension(R.dimen.alphabet_default_small_letter_height));
            setBigLetterTextSize(obtainStyledAttributes.getDimension(R.styleable.AlphabetPanelRecyclerView_bigLetterTextSize, getResources().getDimension(R.dimen.alphabet_default_big_letter_text_size)));
            setBigLetterTextColor(obtainStyledAttributes.getColor(R.styleable.AlphabetPanelRecyclerView_bigLetterTextColor, -16777216));
            setIndexBarFont(com.amazon.aps.iva.f3.f.a(obtainStyledAttributes.getResourceId(R.styleable.AlphabetPanelRecyclerView_indexBarFont, 0), getContext()));
            setBigLetterFont(com.amazon.aps.iva.f3.f.a(obtainStyledAttributes.getResourceId(R.styleable.AlphabetPanelRecyclerView_bigLetterFont, 0), getContext()));
        }
    }

    public final int a(float f) {
        boolean z;
        if (this.e.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF = this.o;
            float f2 = rectF.top;
            if (f >= f2) {
                if (f >= rectF.height() + f2) {
                    return this.e.length - 1;
                }
                return (int) ((f - rectF.top) / this.r);
            }
        }
        return 0;
    }

    public final void b() {
        SectionIndexer sectionIndexer = this.c;
        if (sectionIndexer != null) {
            Object[] sections = sectionIndexer.getSections();
            j.e(sections, "it.sections");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : sections) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
            this.e = (String[]) arrayList.toArray(new String[0]);
            int firstVisiblePosition = getFirstVisiblePosition();
            if (firstVisiblePosition >= 0) {
                i = firstVisiblePosition;
            }
            this.d = sectionIndexer.getSectionForPosition(i);
        }
        invalidate();
    }

    public final int getBarSelectedTextColor() {
        return this.k;
    }

    public final int getBarTextColor() {
        return this.j;
    }

    public final float getBigLetterMarginRight() {
        return this.h;
    }

    public final float getBigLetterSize() {
        return this.i;
    }

    public final int getCurrentSection() {
        return this.d;
    }

    public final float getIndexBarMarginTop() {
        return this.g;
    }

    public final SectionIndexer getIndexer() {
        return this.c;
    }

    public final float getLetterViewHeight() {
        return this.l;
    }

    public final boolean getShowIndexBackground() {
        return this.f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float centerY;
        Rect rect;
        j.f(canvas, "canvas");
        super.onDraw(canvas);
        RectF rectF = this.o;
        rectF.set(getWidth() - this.p, this.g, getWidth(), (this.e.length * this.l) + this.g);
        float height = rectF.height() / this.e.length;
        this.r = height;
        if (this.f) {
            canvas.drawRect(rectF.left, rectF.top, rectF.right, (height / 2) + rectF.bottom, this.n);
        }
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            String str = this.e[i];
            Locale locale = Locale.US;
            j.e(locale, "US");
            String upperCase = str.toUpperCase(locale);
            j.e(upperCase, "this as java.lang.String).toUpperCase(locale)");
            this.v = upperCase;
            int i2 = this.d;
            Paint paint = this.m;
            if (i2 >= 0 && i2 == i) {
                float sectionXCoordinate = getSectionXCoordinate();
                float f = (this.r * (i + 1)) + rectF.top;
                this.s = new Rect();
                String str2 = this.v;
                paint.getTextBounds(str2, 0, str2.length(), this.s);
                int i3 = this.k;
                String str3 = this.v;
                paint.setColor(i3);
                paint.setAlpha(this.u);
                canvas.drawText(str3, sectionXCoordinate, f, paint);
                if (this.q) {
                    String str4 = this.v;
                    float f2 = rectF.left;
                    float height2 = f - (this.s.height() / 2);
                    Paint paint2 = this.w;
                    paint2.setAlpha(this.z);
                    Paint paint3 = this.y;
                    paint3.setAlpha(this.z);
                    float f3 = this.i;
                    RectF rectF2 = new RectF(f2 - f3, height2 - f3, f2, height2 + f3);
                    this.x = rectF2;
                    if (rectF2.top < 0.0f) {
                        centerY = this.i;
                    } else if (rectF2.bottom > canvas.getHeight()) {
                        centerY = canvas.getHeight() - this.i;
                    } else {
                        centerY = this.x.centerY();
                    }
                    canvas.drawCircle(this.x.centerX() - this.h, centerY, this.i / 2, paint2);
                    paint3.getTextBounds(str4, 0, str4.length(), this.A);
                    canvas.drawText(str4, this.x.centerX() - this.h, centerY + (rect.height() / 2), paint3);
                    AlphaAnimation alphaAnimation = this.C;
                    if (alphaAnimation.hasStarted() && !alphaAnimation.hasEnded()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Transformation transformation = this.B;
                        alphaAnimation.getTransformation(currentTimeMillis, transformation);
                        this.z = (int) (transformation.getAlpha() * 255);
                        invalidate();
                    } else {
                        this.z = 0;
                    }
                }
            } else {
                int i4 = this.j;
                float sectionXCoordinate2 = getSectionXCoordinate();
                float f4 = rectF.top;
                paint.setColor(i4);
                paint.setAlpha(this.t);
                canvas.drawText(upperCase, sectionXCoordinate2, (this.r * (i + 1)) + f4, paint);
            }
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        RecyclerView.p layoutManager;
        j.f(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && this.q) {
                    this.z = 255;
                    this.d = a(motionEvent.getY());
                    invalidate();
                    return true;
                }
            } else if (this.q) {
                AlphaAnimation alphaAnimation = this.C;
                alphaAnimation.start();
                alphaAnimation.getTransformation(System.currentTimeMillis(), this.B);
                invalidate();
                int a = a(motionEvent.getY());
                this.d = a;
                SectionIndexer sectionIndexer = this.c;
                if (sectionIndexer != null) {
                    i = sectionIndexer.getPositionForSection(a);
                } else {
                    i = 0;
                }
                RecyclerView recyclerView = this.b;
                if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                    if (layoutManager instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i, 0);
                    } else {
                        layoutManager.scrollToPosition(i);
                    }
                }
                d dVar = this.E;
                if (dVar != null) {
                    dVar.L3(getCurrentCharacter());
                }
                this.q = false;
                return true;
            }
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            RectF rectF = new RectF(this.o);
            float f = rectF.top;
            float f2 = this.r;
            rectF.top = f - f2;
            rectF.bottom += f2;
            if (rectF.contains(x, y)) {
                this.q = true;
                this.z = 255;
                this.d = a(motionEvent.getY());
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void setBarSelectedTextColor(int i) {
        this.k = i;
    }

    public final void setBarTextColor(int i) {
        this.j = i;
    }

    public final void setBigLetterFont(Typeface typeface) {
        this.y.setTypeface(typeface);
    }

    public final void setBigLetterMarginRight(float f) {
        this.h = f;
    }

    public final void setBigLetterSize(float f) {
        this.i = f;
    }

    public final void setBigLetterTextColor(int i) {
        this.y.setColor(i);
    }

    public final void setBigLetterTextSize(float f) {
        this.y.setTextSize(f);
    }

    public final void setCurrentSection(int i) {
        this.d = i;
    }

    public final void setIndexBarFont(Typeface typeface) {
        this.m.setTypeface(typeface);
    }

    public final void setIndexBarMarginTop(float f) {
        this.g = f;
    }

    public final void setIndexBarTextSize(float f) {
        this.m.setTextSize(f);
    }

    public final void setIndexer(SectionIndexer sectionIndexer) {
        RecyclerView.h adapter;
        this.c = sectionIndexer;
        b();
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(getDataObserver());
        }
    }

    public final void setLetterViewHeight(float f) {
        this.l = f;
    }

    public final void setShowIndexBackground(boolean z) {
        this.f = z;
    }
}
