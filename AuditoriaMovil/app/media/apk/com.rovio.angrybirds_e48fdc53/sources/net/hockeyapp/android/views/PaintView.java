package net.hockeyapp.android.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;
import net.hockeyapp.android.utils.HockeyLog;
import net.hockeyapp.android.utils.ImageUtils;
/* loaded from: classes4.dex */
public class PaintView extends ImageView {
    private Path a;
    private Stack<Path> b;
    private Paint c;
    private float d;
    private float e;

    /* JADX WARN: Type inference failed for: r0v10, types: [net.hockeyapp.android.views.PaintView$1] */
    public PaintView(Context context, Uri uri, int i, int i2) {
        super(context);
        this.a = new Path();
        this.b = new Stack<>();
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.c.setColor(-65536);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeJoin(Paint.Join.ROUND);
        this.c.setStrokeCap(Paint.Cap.ROUND);
        this.c.setStrokeWidth(12.0f);
        new AsyncTask<Object, Void, Bitmap>() { // from class: net.hockeyapp.android.views.PaintView.1
            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                PaintView.this.setAdjustViewBounds(true);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Bitmap doInBackground(Object... objArr) {
                try {
                    return ImageUtils.decodeSampledBitmap((Context) objArr[0], (Uri) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue());
                } catch (IOException e) {
                    HockeyLog.error("Could not load image into ImageView.", e);
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Bitmap bitmap) {
                if (bitmap != null) {
                    PaintView.this.setImageBitmap(bitmap);
                }
            }
        }.execute(context, uri, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void clearImage() {
        this.b.clear();
        invalidate();
    }

    public void undo() {
        if (!this.b.empty()) {
            this.b.pop();
            invalidate();
        }
    }

    public boolean isClear() {
        return this.b.empty();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator<Path> it = this.b.iterator();
        while (it.hasNext()) {
            canvas.drawPath(it.next(), this.c);
        }
        canvas.drawPath(this.a, this.c);
    }

    private void a(float f, float f2) {
        this.a.reset();
        this.a.moveTo(f, f2);
        this.d = f;
        this.e = f2;
    }

    private void b(float f, float f2) {
        float abs = Math.abs(f - this.d);
        float abs2 = Math.abs(f2 - this.e);
        if (abs >= 4.0f || abs2 >= 4.0f) {
            this.a.quadTo(this.d, this.e, (this.d + f) / 2.0f, (this.e + f2) / 2.0f);
            this.d = f;
            this.e = f2;
        }
    }

    private void a() {
        this.a.lineTo(this.d, this.e);
        this.b.push(this.a);
        this.a = new Path();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (motionEvent.getAction()) {
            case 0:
                a(x, y);
                invalidate();
                return true;
            case 1:
                a();
                invalidate();
                return true;
            case 2:
                b(x, y);
                invalidate();
                return true;
            default:
                return true;
        }
    }
}
