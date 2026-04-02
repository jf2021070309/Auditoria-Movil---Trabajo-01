package net.hockeyapp.android.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.R;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.utils.ImageUtils;
import net.hockeyapp.android.utils.Util;
/* loaded from: classes4.dex */
public class AttachmentView extends FrameLayout {
    private final Context a;
    private final ViewGroup b;
    private final FeedbackAttachment c;
    private final Uri d;
    private final String e;
    private ImageView f;
    private TextView g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    /* JADX WARN: Type inference failed for: r0v5, types: [net.hockeyapp.android.views.AttachmentView$1] */
    public AttachmentView(Context context, ViewGroup viewGroup, Uri uri, boolean z) {
        super(context);
        this.a = context;
        this.b = viewGroup;
        this.c = null;
        this.d = uri;
        this.e = uri.getLastPathSegment();
        a(20);
        a(context, z);
        this.g.setText(this.e);
        this.g.setContentDescription(this.g.getText());
        new AsyncTask<Void, Void, Bitmap>() { // from class: net.hockeyapp.android.views.AttachmentView.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public Bitmap doInBackground(Void... voidArr) {
                return AttachmentView.this.a();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Bitmap bitmap) {
                if (bitmap != null) {
                    AttachmentView.this.a(bitmap, false);
                } else {
                    AttachmentView.this.a(false);
                }
            }
        }.execute(new Void[0]);
    }

    public AttachmentView(Context context, ViewGroup viewGroup, FeedbackAttachment feedbackAttachment, boolean z) {
        super(context);
        this.a = context;
        this.b = viewGroup;
        this.c = feedbackAttachment;
        this.d = Uri.fromFile(new File(Constants.getHockeyAppStorageDir(), feedbackAttachment.getCacheId()));
        this.e = feedbackAttachment.getFilename();
        a(30);
        a(context, z);
        this.m = 1;
        this.g.setText(R.string.hockeyapp_feedback_attachment_loading);
        this.g.setContentDescription(this.g.getText());
        a(false);
    }

    public FeedbackAttachment getAttachment() {
        return this.c;
    }

    public Uri getAttachmentUri() {
        return this.d;
    }

    public int getWidthPortrait() {
        return this.h;
    }

    public int getMaxHeightPortrait() {
        return this.i;
    }

    public int getWidthLandscape() {
        return this.j;
    }

    public int getMaxHeightLandscape() {
        return this.k;
    }

    public int getGap() {
        return this.l;
    }

    public int getEffectiveMaxHeight() {
        return this.m == 0 ? this.k : this.i;
    }

    public void remove() {
        Util.announceForAccessibility(this.b, this.a.getString(R.string.hockeyapp_feedback_attachment_removed));
        this.b.removeView(this);
    }

    public void setImage(Bitmap bitmap, int i) {
        this.g.setText(this.e);
        this.g.setContentDescription(this.g.getText());
        this.m = i;
        if (bitmap == null) {
            a(true);
        } else {
            a(bitmap, true);
        }
    }

    public void signalImageLoadingError() {
        this.g.setText(R.string.hockeyapp_feedback_attachment_error);
        this.g.setContentDescription(this.g.getText());
    }

    private void a(int i) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.l = Math.round(TypedValue.applyDimension(1, 10.0f, displayMetrics));
        int round = Math.round(TypedValue.applyDimension(1, i, displayMetrics));
        int i2 = displayMetrics.widthPixels;
        int i3 = (i2 - (round * 2)) - this.l;
        this.h = ((i2 - (round * 2)) - (this.l * 2)) / 3;
        this.j = i3 / 2;
        this.i = this.h * 2;
        this.k = this.j;
    }

    private void a(Context context, boolean z) {
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        setPadding(0, this.l, 0, 0);
        Util.announceForAccessibility(this.b, this.a.getString(R.string.hockeyapp_feedback_attachment_added));
        this.f = new ImageView(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        linearLayout.setGravity(8388611);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(Color.parseColor("#80262626"));
        this.g = new TextView(context);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        this.g.setGravity(17);
        this.g.setTextColor(context.getResources().getColor(R.color.hockeyapp_text_white));
        this.g.setSingleLine();
        this.g.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        if (z) {
            ImageButton imageButton = new ImageButton(context);
            imageButton.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
            imageButton.setAdjustViewBounds(true);
            imageButton.setImageDrawable(a("ic_menu_delete"));
            imageButton.setBackgroundResource(0);
            imageButton.setContentDescription(context.getString(R.string.hockeyapp_feedback_attachment_remove_description));
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: net.hockeyapp.android.views.AttachmentView.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AttachmentView.this.remove();
                }
            });
            imageButton.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: net.hockeyapp.android.views.AttachmentView.3
                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z2) {
                    if (z2) {
                        Util.announceForAccessibility(AttachmentView.this.g, AttachmentView.this.g.getText());
                    }
                }
            });
            linearLayout.addView(imageButton);
        }
        linearLayout.addView(this.g);
        addView(this.f);
        addView(linearLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap, final boolean z) {
        int i = this.m == 0 ? this.j : this.h;
        int i2 = this.m == 0 ? this.k : this.i;
        this.g.setMaxWidth(i);
        this.g.setMinWidth(i);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f.setAdjustViewBounds(true);
        this.f.setMinimumWidth(i);
        this.f.setMaxWidth(i);
        this.f.setMaxHeight(i2);
        this.f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f.setImageBitmap(bitmap);
        this.f.setContentDescription(this.g.getText());
        this.f.setOnClickListener(new View.OnClickListener() { // from class: net.hockeyapp.android.views.AttachmentView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (z) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setDataAndType(AttachmentView.this.d, "image/*");
                    AttachmentView.this.a.startActivity(intent);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        this.g.setMaxWidth(this.h);
        this.g.setMinWidth(this.h);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f.setAdjustViewBounds(false);
        this.f.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f.setMinimumHeight((int) (this.h * 1.2f));
        this.f.setMinimumWidth(this.h);
        this.f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f.setImageDrawable(a("ic_menu_attachment"));
        this.f.setContentDescription(this.g.getText());
        this.f.setOnClickListener(new View.OnClickListener() { // from class: net.hockeyapp.android.views.AttachmentView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (z) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setDataAndType(AttachmentView.this.d, "*/*");
                    AttachmentView.this.a.startActivity(intent);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a() {
        try {
            this.m = ImageUtils.determineOrientation(this.a, this.d);
            return ImageUtils.decodeSampledBitmap(this.a, this.d, this.m == 0 ? this.j : this.h, this.m == 0 ? this.k : this.i);
        } catch (Throwable th) {
            return null;
        }
    }

    private Drawable a(String str) {
        return Build.VERSION.SDK_INT >= 21 ? getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"), this.a.getTheme()) : getResources().getDrawable(getResources().getIdentifier(str, "drawable", "android"));
    }
}
