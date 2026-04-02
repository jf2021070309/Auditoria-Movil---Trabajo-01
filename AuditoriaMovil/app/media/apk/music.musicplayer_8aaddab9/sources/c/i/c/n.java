package c.i.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.text.NumberFormat;
import java.util.Objects;
import music.musicplayer.R;
/* loaded from: classes.dex */
public abstract class n {
    public m a;

    public void a(Bundle bundle) {
        String f2 = f();
        if (f2 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", f2);
        }
    }

    public abstract void b(i iVar);

    public RemoteViews c(boolean z, int i2, boolean z2) {
        boolean z3;
        Resources resources = this.a.a.getResources();
        RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), i2);
        boolean z4 = true;
        boolean z5 = this.a.f1981j < -1;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            if (z5) {
                remoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg_low);
                remoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_low_bg);
            } else {
                remoteViews.setInt(R.id.notification_background, "setBackgroundResource", R.drawable.notification_bg);
                remoteViews.setInt(R.id.icon, "setBackgroundResource", R.drawable.notification_template_icon_bg);
            }
        }
        m mVar = this.a;
        if (mVar.f1979h != null) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            remoteViews.setImageViewBitmap(R.id.icon, this.a.f1979h);
            if (z && this.a.v.icon != 0) {
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_right_icon_size);
                int dimensionPixelSize2 = dimensionPixelSize - (resources.getDimensionPixelSize(R.dimen.notification_small_icon_background_padding) * 2);
                if (i3 >= 21) {
                    m mVar2 = this.a;
                    remoteViews.setImageViewBitmap(R.id.right_icon, e(mVar2.v.icon, dimensionPixelSize, dimensionPixelSize2, mVar2.p));
                } else {
                    remoteViews.setImageViewBitmap(R.id.right_icon, d(this.a.v.icon, -1, 0));
                }
                remoteViews.setViewVisibility(R.id.right_icon, 0);
            }
        } else if (z && mVar.v.icon != 0) {
            remoteViews.setViewVisibility(R.id.icon, 0);
            if (i3 >= 21) {
                int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(R.dimen.notification_big_circle_margin);
                int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.notification_small_icon_size_as_large);
                m mVar3 = this.a;
                remoteViews.setImageViewBitmap(R.id.icon, e(mVar3.v.icon, dimensionPixelSize3, dimensionPixelSize4, mVar3.p));
            } else {
                remoteViews.setImageViewBitmap(R.id.icon, d(this.a.v.icon, -1, 0));
            }
        }
        CharSequence charSequence = this.a.f1976e;
        if (charSequence != null) {
            remoteViews.setTextViewText(R.id.title, charSequence);
        }
        CharSequence charSequence2 = this.a.f1977f;
        if (charSequence2 != null) {
            remoteViews.setTextViewText(R.id.text, charSequence2);
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = i3 < 21 && this.a.f1979h != null;
        Objects.requireNonNull(this.a);
        if (this.a.f1980i > 0) {
            if (this.a.f1980i > resources.getInteger(R.integer.status_bar_notification_info_maxnum)) {
                remoteViews.setTextViewText(R.id.info, resources.getString(R.string.status_bar_notification_info_overflow));
            } else {
                remoteViews.setTextViewText(R.id.info, NumberFormat.getIntegerInstance().format(this.a.f1980i));
            }
            remoteViews.setViewVisibility(R.id.info, 0);
            z3 = true;
            z6 = true;
        } else {
            remoteViews.setViewVisibility(R.id.info, 8);
        }
        Objects.requireNonNull(this.a);
        if (this.a.d() == 0) {
            z4 = z6;
        } else if (this.a.f1983l) {
            remoteViews.setViewVisibility(R.id.chronometer, 0);
            remoteViews.setLong(R.id.chronometer, "setBase", (SystemClock.elapsedRealtime() - System.currentTimeMillis()) + this.a.d());
            remoteViews.setBoolean(R.id.chronometer, "setStarted", true);
            Objects.requireNonNull(this.a);
        } else {
            remoteViews.setViewVisibility(R.id.time, 0);
            remoteViews.setLong(R.id.time, "setTime", this.a.d());
        }
        remoteViews.setViewVisibility(R.id.right_side, z4 ? 0 : 8);
        remoteViews.setViewVisibility(R.id.line3, z3 ? 0 : 8);
        return remoteViews;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Bitmap d(int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Object obj;
        int identifier;
        Context context = this.a.a;
        PorterDuff.Mode mode = IconCompat.a;
        if (context != null) {
            IconCompat b2 = IconCompat.b(context.getResources(), context.getPackageName(), i2);
            Context context2 = this.a.a;
            if (b2.f346b == 2 && (obj = b2.f347c) != null) {
                String str = (String) obj;
                if (str.contains(":")) {
                    String str2 = str.split(":", -1)[1];
                    String str3 = str2.split("/", -1)[0];
                    String str4 = str2.split("/", -1)[1];
                    String str5 = str.split(":", -1)[0];
                    if (!"0_resource_name_obfuscated".equals(str4) && b2.f350f != (identifier = IconCompat.e(context2, b2.d()).getIdentifier(str4, str3, str5))) {
                        b2.f350f = identifier;
                    }
                }
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23) {
                drawable2 = b2.j(context2).loadDrawable(context2);
            } else {
                switch (b2.f346b) {
                    case 1:
                        drawable = new BitmapDrawable(context2.getResources(), (Bitmap) b2.f347c);
                        break;
                    case 2:
                        String d2 = b2.d();
                        if (TextUtils.isEmpty(d2)) {
                            d2 = context2.getPackageName();
                        }
                        try {
                            drawable = c.i.d.c.j.a(IconCompat.e(context2, d2), b2.f350f, context2.getTheme());
                            break;
                        } catch (RuntimeException e2) {
                            Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(b2.f350f), b2.f347c), e2);
                            break;
                        }
                    case 3:
                        drawable = new BitmapDrawable(context2.getResources(), BitmapFactory.decodeByteArray((byte[]) b2.f347c, b2.f350f, b2.f351g));
                        break;
                    case 4:
                        InputStream h2 = b2.h(context2);
                        if (h2 != null) {
                            drawable = new BitmapDrawable(context2.getResources(), BitmapFactory.decodeStream(h2));
                            break;
                        }
                        drawable = null;
                        break;
                    case 5:
                        drawable = new BitmapDrawable(context2.getResources(), IconCompat.a((Bitmap) b2.f347c, false));
                        break;
                    case 6:
                        InputStream h3 = b2.h(context2);
                        if (h3 != null) {
                            if (i5 < 26) {
                                drawable = new BitmapDrawable(context2.getResources(), IconCompat.a(BitmapFactory.decodeStream(h3), false));
                                break;
                            } else {
                                drawable = new AdaptiveIconDrawable(null, new BitmapDrawable(context2.getResources(), BitmapFactory.decodeStream(h3)));
                                break;
                            }
                        }
                        drawable = null;
                        break;
                    default:
                        drawable = null;
                        break;
                }
                if (drawable != null && (b2.f352h != null || b2.f353i != IconCompat.a)) {
                    drawable.mutate();
                    c.i.a.j0(drawable, b2.f352h);
                    c.i.a.k0(drawable, b2.f353i);
                }
                drawable2 = drawable;
            }
            int intrinsicWidth = i4 == 0 ? drawable2.getIntrinsicWidth() : i4;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i4, Bitmap.Config.ARGB_8888);
            drawable2.setBounds(0, 0, intrinsicWidth, i4);
            if (i3 != 0) {
                drawable2.mutate().setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
            }
            drawable2.draw(new Canvas(createBitmap));
            return createBitmap;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public final Bitmap e(int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            i5 = 0;
        }
        Bitmap d2 = d(R.drawable.notification_icon_background, i5, i3);
        Canvas canvas = new Canvas(d2);
        Drawable mutate = this.a.a.getResources().getDrawable(i2).mutate();
        mutate.setFilterBitmap(true);
        int i6 = (i3 - i4) / 2;
        int i7 = i4 + i6;
        mutate.setBounds(i6, i6, i7, i7);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return d2;
    }

    public String f() {
        return null;
    }

    public RemoteViews g(i iVar) {
        return null;
    }

    public RemoteViews h(i iVar) {
        return null;
    }

    public void i(m mVar) {
        if (this.a != mVar) {
            this.a = mVar;
            if (mVar.f1984m != this) {
                mVar.f1984m = this;
                i(mVar);
            }
        }
    }
}
