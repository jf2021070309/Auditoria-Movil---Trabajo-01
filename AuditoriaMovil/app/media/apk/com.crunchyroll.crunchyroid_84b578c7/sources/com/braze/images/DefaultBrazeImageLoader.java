package com.braze.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.r0;
import com.amazon.aps.iva.se0.t1;
import com.braze.R$string;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.BrazeViewBounds;
import com.braze.models.cards.Card;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeImageUtils;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 :2\u00020\u0001:\u0001;B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J \u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\r0\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J2\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J2\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J.\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\u001c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J$\u0010 \u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J&\u0010#\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J\u0012\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0007J \u0010(\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u001dH\u0007R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0,8G¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R$\u00105\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00106¨\u0006<"}, d2 = {"Lcom/braze/images/DefaultBrazeImageLoader;", "Lcom/braze/images/IBrazeImageLoader;", "Landroid/content/Context;", "context", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lcom/braze/enums/BrazeViewBounds;", "viewBounds", "Lcom/amazon/aps/iva/kb0/q;", "renderUrlIntoView", "key", "Landroid/graphics/Bitmap;", "bitmap", "kotlin.jvm.PlatformType", "putBitmapIntoMemCache", "initDiskCacheTask", "renderUrlIntoViewTask", "Lcom/braze/models/cards/Card;", "card", "renderUrlIntoCardView", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessage", "renderUrlIntoInAppMessageView", "Landroid/os/Bundle;", "extras", "getPushBitmapFromUrl", "getInAppMessageBitmapFromUrl", "", "isOffline", "setOffline", "getBitmapFromUrl", "Landroid/net/Uri;", "imageUri", "downloadBitmapFromUrl", "getBitmapFromCache", "getBitmapFromMemCache", "getBitmapFromDiskCache", "skipDiskCache", "putBitmapIntoCache", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroid/util/LruCache;", "memoryCache", "Landroid/util/LruCache;", "getMemoryCache", "()Landroid/util/LruCache;", "Lbo/app/h;", "diskLruCache", "Lbo/app/h;", "<set-?>", "isDiskCacheStarting", "Z", "()Z", "<init>", "(Landroid/content/Context;)V", "Companion", "b", "android-sdk-base_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DefaultBrazeImageLoader implements IBrazeImageLoader {
    public static final b Companion = new b(null);
    private static final String TAG = BrazeLogger.getBrazeLogTag(DefaultBrazeImageLoader.class);
    private final ReentrantLock diskCacheLock;
    private bo.app.h diskLruCache;
    private boolean isDiskCacheStarting;
    private boolean isOffline;
    private final LruCache<String, Bitmap> memoryCache;

    /* loaded from: classes.dex */
    public static final class a extends LruCache {
        public a(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            com.amazon.aps.iva.yb0.j.f(str, "key");
            com.amazon.aps.iva.yb0.j.f(bitmap, "image");
            return bitmap.getByteCount();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(com.amazon.aps.iva.yb0.e eVar) {
            this();
        }

        public final File a(Context context, String str) {
            com.amazon.aps.iva.yb0.j.f(context, "context");
            com.amazon.aps.iva.yb0.j.f(str, "uniqueName");
            StringBuilder sb = new StringBuilder();
            sb.append(context.getCacheDir().getPath());
            return new File(defpackage.b.c(sb, File.separator, str));
        }

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;
        final /* synthetic */ DefaultBrazeImageLoader c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, DefaultBrazeImageLoader defaultBrazeImageLoader) {
            super(0);
            this.b = str;
            this.c = defaultBrazeImageLoader;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Got bitmap from mem cache for key " + this.b + "\nMemory cache stats: " + this.c.getMemoryCache();
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Got bitmap from disk cache for key " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "No cache hit for bitmap: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Disk cache still starting. Cannot retrieve key from disk cache: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Getting bitmap from disk cache for key: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final h b = new h();

        public h() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
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
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to get bitmap from url. Url: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ Context c;
        final /* synthetic */ DefaultBrazeImageLoader d;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final a b = new a();

            public a() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final b b = new b();

            public b() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            public static final c b = new c();

            public c() {
                super(0);
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.c = context;
            this.d = defaultBrazeImageLoader;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((k) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new k(this.c, this.d, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            if (this.b == 0) {
                x.i0(obj);
                File a2 = DefaultBrazeImageLoader.Companion.a(this.c, "appboy.imageloader.lru.cache");
                ReentrantLock reentrantLock = this.d.diskCacheLock;
                DefaultBrazeImageLoader defaultBrazeImageLoader = this.d;
                reentrantLock.lock();
                try {
                    try {
                        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                        BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) a.b, 6, (Object) null);
                        defaultBrazeImageLoader.diskLruCache = new bo.app.h(a2, 1, 1, 52428800L);
                        BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) b.b, 6, (Object) null);
                        defaultBrazeImageLoader.isDiskCacheStarting = false;
                    } catch (Exception e) {
                        BrazeLogger.INSTANCE.brazelog(DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e, (com.amazon.aps.iva.xb0.a<String>) c.b);
                    }
                    com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
                    reentrantLock.unlock();
                    return com.amazon.aps.iva.kb0.q.a;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding bitmap to mem cache for key " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Skipping disk cache for key: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Adding bitmap to disk cache for key " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        public static final o b = new o();

        public o() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(0);
            this.b = str;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            return "Failed to render url into view. Url: " + this.b;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
        int b;
        final /* synthetic */ Context d;
        final /* synthetic */ String e;
        final /* synthetic */ BrazeViewBounds f;
        final /* synthetic */ ImageView g;

        /* loaded from: classes.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.b = str;
            }

            @Override // com.amazon.aps.iva.xb0.a
            /* renamed from: a */
            public final String invoke() {
                return "Failed to retrieve bitmap from url: " + this.b;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p {
            int b;
            final /* synthetic */ String c;
            final /* synthetic */ ImageView d;
            final /* synthetic */ Bitmap e;
            final /* synthetic */ BrazeViewBounds f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, ImageView imageView, Bitmap bitmap, BrazeViewBounds brazeViewBounds, com.amazon.aps.iva.ob0.d dVar) {
                super(2, dVar);
                this.c = str;
                this.d = imageView;
                this.e = bitmap;
                this.f = brazeViewBounds;
            }

            @Override // com.amazon.aps.iva.xb0.p
            /* renamed from: a */
            public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
                return ((b) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
                return new b(this.c, this.d, this.e, this.f, dVar);
            }

            @Override // com.amazon.aps.iva.qb0.a
            public final Object invokeSuspend(Object obj) {
                com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
                if (this.b == 0) {
                    x.i0(obj);
                    String str = this.c;
                    Object tag = this.d.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                    com.amazon.aps.iva.yb0.j.d(tag, "null cannot be cast to non-null type kotlin.String");
                    if (com.amazon.aps.iva.yb0.j.a(str, (String) tag)) {
                        this.d.setImageBitmap(this.e);
                        if (this.f == BrazeViewBounds.BASE_CARD_VIEW) {
                            BrazeImageUtils.resizeImageViewToBitmapDimensions(this.e, this.d);
                        }
                    }
                    return com.amazon.aps.iva.kb0.q.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, com.amazon.aps.iva.ob0.d dVar) {
            super(2, dVar);
            this.d = context;
            this.e = str;
            this.f = brazeViewBounds;
            this.g = imageView;
        }

        @Override // com.amazon.aps.iva.xb0.p
        /* renamed from: a */
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d dVar) {
            return ((q) create(g0Var, dVar)).invokeSuspend(com.amazon.aps.iva.kb0.q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d create(Object obj, com.amazon.aps.iva.ob0.d dVar) {
            return new q(this.d, this.e, this.f, this.g, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                TrafficStats.setThreadStatsTag(1337);
                Bitmap bitmapFromUrl = DefaultBrazeImageLoader.this.getBitmapFromUrl(this.d, this.e, this.f);
                if (bitmapFromUrl == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, (com.amazon.aps.iva.xb0.a) new a(this.e), 6, (Object) null);
                } else {
                    com.amazon.aps.iva.ye0.c cVar = r0.a;
                    t1 t1Var = com.amazon.aps.iva.xe0.k.a;
                    b bVar = new b(this.e, this.g, bitmapFromUrl, this.f, null);
                    this.b = 1;
                    if (com.amazon.aps.iva.se0.i.g(this, t1Var, bVar) == aVar) {
                        return aVar;
                    }
                }
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a {
        final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(boolean z) {
            super(0);
            this.b = z;
        }

        @Override // com.amazon.aps.iva.xb0.a
        /* renamed from: a */
        public final String invoke() {
            String str;
            if (this.b) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            return "DefaultBrazeImageLoader outbound network requests are now ".concat(str);
        }
    }

    public DefaultBrazeImageLoader(Context context) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        this.diskCacheLock = new ReentrantLock();
        this.isDiskCacheStarting = true;
        this.memoryCache = new a(BrazeImageUtils.getImageLoaderCacheSize());
        initDiskCacheTask(context);
    }

    private final void initDiskCacheTask(Context context) {
        com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new k(context, this, null), 3);
    }

    private final Bitmap putBitmapIntoMemCache(String str, Bitmap bitmap) {
        return this.memoryCache.put(str, bitmap);
    }

    private final void renderUrlIntoView(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        if (com.amazon.aps.iva.oe0.m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, o.b, 3, (Object) null);
            return;
        }
        try {
            renderUrlIntoViewTask(context, imageView, brazeViewBounds, str);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new p(str));
        }
    }

    private final void renderUrlIntoViewTask(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String str) {
        imageView.setTag(R$string.com_braze_image_lru_cache_image_url_key, str);
        com.amazon.aps.iva.se0.i.d(BrazeCoroutineScope.INSTANCE, null, null, new q(context, str, brazeViewBounds, imageView, null), 3);
    }

    public final Bitmap downloadBitmapFromUrl(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(uri, "imageUri");
        if (brazeViewBounds == null) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        return BrazeImageUtils.getBitmap(context, uri, brazeViewBounds);
    }

    public final Bitmap getBitmapFromCache(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        Bitmap bitmap = this.memoryCache.get(str);
        if (bitmap != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new c(str, this), 2, (Object) null);
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(str);
        if (bitmapFromDiskCache != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d(str), 2, (Object) null);
            putBitmapIntoMemCache(str, bitmapFromDiskCache);
            return bitmapFromDiskCache;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new e(str), 3, (Object) null);
        return null;
    }

    public final Bitmap getBitmapFromDiskCache(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (this.isDiskCacheStarting) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new f(str), 2, (Object) null);
            } else {
                bo.app.h hVar = this.diskLruCache;
                if (hVar != null) {
                    if (hVar.a(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new g(str), 2, (Object) null);
                        bo.app.h hVar2 = this.diskLruCache;
                        if (hVar2 != null) {
                            return hVar2.b(str);
                        }
                        com.amazon.aps.iva.yb0.j.m("diskLruCache");
                        throw null;
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("diskLruCache");
                    throw null;
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Bitmap getBitmapFromMemCache(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        return this.memoryCache.get(str);
    }

    public final Bitmap getBitmapFromUrl(Context context, String str, BrazeViewBounds brazeViewBounds) {
        Bitmap bitmapFromCache;
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "imageUrl");
        if (com.amazon.aps.iva.oe0.m.b0(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, h.b, 3, (Object) null);
            return null;
        }
        try {
            bitmapFromCache = getBitmapFromCache(str);
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new j(str));
        }
        if (bitmapFromCache != null) {
            return bitmapFromCache;
        }
        if (this.isOffline) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, i.b, 3, (Object) null);
        } else {
            Uri parse = Uri.parse(str);
            com.amazon.aps.iva.yb0.j.e(parse, "imageUri");
            Bitmap downloadBitmapFromUrl = downloadBitmapFromUrl(context, parse, brazeViewBounds);
            if (downloadBitmapFromUrl != null) {
                putBitmapIntoCache(str, downloadBitmapFromUrl, BrazeFileUtils.isLocalUri(parse));
                return downloadBitmapFromUrl;
            }
        }
        return null;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(iInAppMessage, "inAppMessage");
        com.amazon.aps.iva.yb0.j.f(str, "imageUrl");
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    public final LruCache<String, Bitmap> getMemoryCache() {
        return this.memoryCache;
    }

    @Override // com.braze.images.IBrazeImageLoader
    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(str, "imageUrl");
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    public final void putBitmapIntoCache(String str, Bitmap bitmap, boolean z) {
        com.amazon.aps.iva.yb0.j.f(str, "key");
        com.amazon.aps.iva.yb0.j.f(bitmap, "bitmap");
        if (getBitmapFromMemCache(str) == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new l(str), 3, (Object) null);
            this.memoryCache.put(str, bitmap);
        }
        if (z) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new m(str), 3, (Object) null);
            return;
        }
        ReentrantLock reentrantLock = this.diskCacheLock;
        reentrantLock.lock();
        try {
            if (!this.isDiskCacheStarting) {
                bo.app.h hVar = this.diskLruCache;
                if (hVar != null) {
                    if (!hVar.a(str)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new n(str), 3, (Object) null);
                        bo.app.h hVar2 = this.diskLruCache;
                        if (hVar2 != null) {
                            hVar2.a(str, bitmap);
                        } else {
                            com.amazon.aps.iva.yb0.j.m("diskLruCache");
                            throw null;
                        }
                    }
                } else {
                    com.amazon.aps.iva.yb0.j.m("diskLruCache");
                    throw null;
                }
            }
            com.amazon.aps.iva.kb0.q qVar = com.amazon.aps.iva.kb0.q.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(card, "card");
        com.amazon.aps.iva.yb0.j.f(str, "imageUrl");
        com.amazon.aps.iva.yb0.j.f(imageView, "imageView");
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        com.amazon.aps.iva.yb0.j.f(context, "context");
        com.amazon.aps.iva.yb0.j.f(iInAppMessage, "inAppMessage");
        com.amazon.aps.iva.yb0.j.f(str, "imageUrl");
        com.amazon.aps.iva.yb0.j.f(imageView, "imageView");
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    @Override // com.braze.images.IBrazeImageLoader
    public void setOffline(boolean z) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new r(z), 2, (Object) null);
        this.isOffline = z;
    }
}
