package com.braze.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.amazon.aps.iva.d0.b2;
import com.amazon.aps.iva.yb0.b0;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0018\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0014\u0010\u000e\u001a\u00020\f*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u001a \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0007\u001a\"\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a \u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002\u001a\"\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a,\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\"\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroid/content/Context;", "context", "", "getDisplayWidthPixels", "getDensityDpi", "dpi", "dp", "getPixelsFromDensityAndDp", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "Lcom/amazon/aps/iva/kb0/q;", "resizeImageViewToBitmapDimensions", "resizeToBitmapDimensions", "getImageLoaderCacheSize", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", "getBitmapMetadataFromStream", "options", "destinationWidth", "destinationHeight", "calculateInSampleSize", "Landroid/net/Uri;", "uri", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "getBitmap", "getLocalBitmap", "getRemoteBitmap", "imageMetadata", "decodeSampledBitmapFromStream", "Lcom/amazon/aps/iva/kb0/j;", "getDestinationHeightAndWidthPixels", "getDisplayHeightAndWidthPixels", "", "TAG", "Ljava/lang/String;", "android-sdk-base_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BrazeImageUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("BrazeImageUtils");

    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final a b = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ BitmapFactory.Options b;
        final /* synthetic */ int c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BitmapFactory.Options options, int i, int i2) {
            super(0);
            this.b = options;
            this.c = i;
            this.d = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Calculating sample size for source image bounds: (width ");
            sb.append(this.b.outWidth);
            sb.append(" height ");
            sb.append(this.b.outHeight);
            sb.append(") and destination image bounds: (width ");
            sb.append(this.c);
            sb.append(" height ");
            return b2.b(sb, this.d, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ b0 b;
        final /* synthetic */ long c;
        final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b0 b0Var, long j, long j2) {
            super(0);
            this.b = b0Var;
            this.c = j;
            this.d = j2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Using image sample size of " + this.b.b + ". Image will be scaled to width: " + (this.c / this.b.b) + " and height: " + (this.d / this.b.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Uri with unknown scheme received. Not getting image. Uri: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Display width: " + this.b + " and height " + this.c;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Local bitmap path is null. URI: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Uri b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Uri uri) {
            super(0);
            this.b = uri;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Local bitmap file does not exist. URI: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(File file) {
            super(0);
            this.b = file;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Retrieving image from local path: " + this.b.getAbsolutePath();
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final i b = new i();

        public i() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Sampling bitmap with destination image bounds: (width ");
            sb.append(this.b);
            sb.append(" height ");
            return b2.b(sb, this.c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Uri b;
        final /* synthetic */ BitmapFactory.Options c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.b = uri;
            this.c = options;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("The bitmap metadata with image uri ");
            sb.append(this.b);
            sb.append(" had bounds: (height ");
            sb.append(this.c.outHeight);
            sb.append(" width ");
            return defpackage.e.f(sb, this.c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final l b = new l();

        public l() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ Exception b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Exception exc) {
            super(0);
            this.b = exc;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception occurred when attempting to retrieve local bitmap. " + this.b.getMessage();
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final n b = new n();

        public n() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "SDK is in offline mode, not downloading remote bitmap with uri: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ URL c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(int i, URL url) {
            super(0);
            this.b = i;
            this.c = url;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "HTTP response code was " + this.b + ". Bitmap with url " + this.c + " could not be downloaded.";
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("Sampling bitmap with destination image bounds: (height ");
            sb.append(this.b);
            sb.append(" width ");
            return b2.b(sb, this.c, ')');
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ URL b;
        final /* synthetic */ BitmapFactory.Options c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(URL url, BitmapFactory.Options options) {
            super(0);
            this.b = url;
            this.c = options;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            StringBuilder sb = new StringBuilder("The bitmap metadata with image url ");
            sb.append(this.b);
            sb.append(" had bounds: (height ");
            sb.append(this.c.outHeight);
            sb.append(" width ");
            return defpackage.e.f(sb, this.c.outWidth, "). Returning a bitmap with no sampling.");
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ Exception c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, Exception exc) {
            super(0);
            this.b = str;
            this.c = exc;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Exception in image bitmap download for Uri: " + this.b + ' ' + this.c.getMessage();
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final t b = new t();

        public t() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final u b = new u();

        public u() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final v b = new v();

        public v() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final w b = new w();

        public w() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView";
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ float b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(float f) {
            super(0);
            this.b = f;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Resizing ImageView to aspect ratio: " + this.b;
        }
    }

    public static final int calculateInSampleSize(BitmapFactory.Options options, int i2, int i3) {
        long j2;
        long j3;
        com.amazon.aps.iva.yb0.j.f(options, "options");
        if (i3 != 0 && i2 != 0) {
            long j4 = options.outHeight;
            long j5 = options.outWidth;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new b(options, i2, i3), 6, (Object) null);
            b0 b0Var = new b0();
            b0Var.b = 1;
            long j6 = i3;
            if (j4 <= j6 && j5 <= i2) {
                j2 = j5;
            } else {
                long j7 = 2;
                long j8 = j4 / j7;
                long j9 = j5 / j7;
                while (true) {
                    int i4 = b0Var.b;
                    j2 = j5;
                    long j10 = i4;
                    if (j8 / j10 < j6) {
                        j3 = j6;
                        if (j9 / j10 < i2 && (j2 * j4) / (i4 * i4) <= 4194304) {
                            break;
                        }
                    } else {
                        j3 = j6;
                    }
                    b0Var.b = i4 * 2;
                    j5 = j2;
                    j6 = j3;
                }
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new c(b0Var, j2, j4), 6, (Object) null);
            return b0Var.b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) a.b, 6, (Object) null);
        return 1;
    }

    private static final Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i2, int i3) {
        options.inSampleSize = calculateInSampleSize(options, i2, i3);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    public static final Bitmap getBitmap(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(uri, "uri");
        com.amazon.aps.iva.yb0.j.f(brazeViewBounds, "viewBounds");
        com.amazon.aps.iva.kb0.j<Integer, Integer> destinationHeightAndWidthPixels = getDestinationHeightAndWidthPixels(context, brazeViewBounds);
        int intValue = destinationHeightAndWidthPixels.b.intValue();
        int intValue2 = destinationHeightAndWidthPixels.c.intValue();
        if (BrazeFileUtils.isLocalUri(uri)) {
            return getLocalBitmap(uri, intValue2, intValue);
        }
        if (BrazeFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, intValue2, intValue);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) new d(uri), 4, (Object) null);
        return null;
    }

    public static final BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        com.amazon.aps.iva.yb0.j.f(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    public static final int getDensityDpi(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    private static final com.amazon.aps.iva.kb0.j<Integer, Integer> getDestinationHeightAndWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.kb0.j<Integer, Integer> displayHeightAndWidthPixels = getDisplayHeightAndWidthPixels(context);
        int intValue = displayHeightAndWidthPixels.b.intValue();
        int intValue2 = displayHeightAndWidthPixels.c.intValue();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.V, (Throwable) null, (com.amazon.aps.iva.xb0.a) new e(intValue2, intValue), 4, (Object) null);
        if (BrazeViewBounds.NO_BOUNDS == brazeViewBounds) {
            return new com.amazon.aps.iva.kb0.j<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int densityDpi = getDensityDpi(context);
        return new com.amazon.aps.iva.kb0.j<>(Integer.valueOf(Math.min(intValue, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getHeightDp()))), Integer.valueOf(Math.min(intValue2, getPixelsFromDensityAndDp(densityDpi, brazeViewBounds.getWidthDp()))));
    }

    public static final com.amazon.aps.iva.kb0.j<Integer, Integer> getDisplayHeightAndWidthPixels(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new com.amazon.aps.iva.kb0.j<>(Integer.valueOf(displayMetrics.heightPixels), Integer.valueOf(displayMetrics.widthPixels));
    }

    public static final int getDisplayWidthPixels(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        return getDisplayHeightAndWidthPixels(context).c.intValue();
    }

    public static final int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:25|26|(4:31|32|33|34)|38|32|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b0, code lost:
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
        com.braze.support.BrazeLogger.INSTANCE.brazelog(com.braze.support.BrazeImageUtils.TAG, com.braze.support.BrazeLogger.Priority.E, (java.lang.Throwable) r14, (com.amazon.aps.iva.xb0.a<java.lang.String>) com.braze.support.BrazeImageUtils.n.b);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[Catch: all -> 0x00db, Exception -> 0x00dd, TryCatch #8 {Exception -> 0x00dd, all -> 0x00db, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0018, B:13:0x0029, B:15:0x0034, B:17:0x0045, B:21:0x005e, B:45:0x00c9), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x00db, Exception -> 0x00dd, TryCatch #8 {Exception -> 0x00dd, all -> 0x00db, blocks: (B:3:0x0006, B:5:0x000c, B:11:0x0018, B:13:0x0029, B:15:0x0034, B:17:0x0045, B:21:0x005e, B:45:0x00c9), top: B:78:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap getLocalBitmap(android.net.Uri r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static final int getPixelsFromDensityAndDp(int i2, int i3) {
        return Math.abs((i2 * i3) / 160);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.Bitmap getRemoteBitmap(android.net.Uri r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.BrazeImageUtils.getRemoteBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static final void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        com.amazon.aps.iva.yb0.j.f(imageView, "imageView");
        resizeToBitmapDimensions(imageView, bitmap);
    }

    public static final void resizeToBitmapDimensions(ImageView imageView, Bitmap bitmap) {
        com.amazon.aps.iva.yb0.j.f(imageView, "<this>");
        if (bitmap == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) u.b, 4, (Object) null);
        } else if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            if (imageView.getWidth() != 0 && imageView.getHeight() != 0) {
                float width = bitmap.getWidth() / bitmap.getHeight();
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new x(width), 6, (Object) null);
                imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) w.b, 4, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.W, (Throwable) null, (com.amazon.aps.iva.xb0.a) v.b, 4, (Object) null);
        }
    }
}
