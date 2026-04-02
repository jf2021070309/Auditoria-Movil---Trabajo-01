package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.n.d;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.n.f;
import com.facebook.ads.internal.n.g;
import com.facebook.ads.internal.protocol.a;
import com.facebook.ads.internal.q.a.i;
import com.facebook.ads.internal.view.hscroll.b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class NativeAd implements Ad {
    private final e a;

    /* loaded from: classes2.dex */
    public static class Image {
        private final f a;

        Image(f fVar) {
            this.a = fVar;
        }

        public Image(String str, int i, int i2) {
            this.a = new f(str, i, i2);
        }

        public static Image fromJSONObject(JSONObject jSONObject) {
            f a = f.a(jSONObject);
            if (a == null) {
                return null;
            }
            return new Image(a);
        }

        public int getHeight() {
            return this.a.c();
        }

        public String getUrl() {
            return this.a.a();
        }

        public int getWidth() {
            return this.a.b();
        }
    }

    /* loaded from: classes2.dex */
    public enum MediaCacheFlag {
        NONE(d.NONE),
        ICON(d.ICON),
        IMAGE(d.IMAGE),
        VIDEO(d.VIDEO);
        
        public static final EnumSet<MediaCacheFlag> ALL = EnumSet.allOf(MediaCacheFlag.class);
        private final d a;

        MediaCacheFlag(d dVar) {
            this.a = dVar;
        }

        public static Set<d> setToInternalSet(EnumSet<MediaCacheFlag> enumSet) {
            HashSet hashSet = new HashSet();
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                hashSet.add(((MediaCacheFlag) it.next()).a());
            }
            return hashSet;
        }

        d a() {
            return this.a;
        }

        public long getCacheFlagValue() {
            return this.a.a();
        }
    }

    /* loaded from: classes2.dex */
    public enum NativeComponentTag {
        AD_ICON(i.INTERNAL_AD_ICON),
        AD_TITLE(i.INTERNAL_AD_TITLE),
        AD_COVER_IMAGE(i.INTERNAL_AD_COVER_IMAGE),
        AD_SUBTITLE(i.INTERNAL_AD_SUBTITLE),
        AD_BODY(i.INTERNAL_AD_BODY),
        AD_CALL_TO_ACTION(i.INTERNAL_AD_CALL_TO_ACTION),
        AD_SOCIAL_CONTEXT(i.INTERNAL_AD_SOCIAL_CONTEXT),
        AD_CHOICES_ICON(i.INTERNAL_AD_CHOICES_ICON),
        AD_MEDIA(i.INTERNAL_AD_MEDIA);
        
        private final i a;

        NativeComponentTag(i iVar) {
            this.a = iVar;
        }

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            if (view == null || nativeComponentTag == null) {
                return;
            }
            i.a(view, nativeComponentTag.a);
        }
    }

    /* loaded from: classes2.dex */
    public static class Rating {
        private final g a;

        public Rating(double d, double d2) {
            this.a = new g(d, d2);
        }

        Rating(g gVar) {
            this.a = gVar;
        }

        public static Rating fromJSONObject(JSONObject jSONObject) {
            g a = g.a(jSONObject);
            if (a == null) {
                return null;
            }
            return new Rating(a);
        }

        public double getScale() {
            return this.a.b();
        }

        public double getValue() {
            return this.a.a();
        }
    }

    public NativeAd(Context context, ab abVar, com.facebook.ads.internal.h.d dVar) {
        this.a = new e(context, abVar, dVar, getViewTraversalPredicate());
    }

    public NativeAd(Context context, String str) {
        this.a = new e(context, str, getViewTraversalPredicate());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeAd(NativeAd nativeAd) {
        this.a = new e(nativeAd.a);
    }

    NativeAd(e eVar) {
        this.a = eVar;
    }

    public static void downloadAndDisplayImage(Image image, ImageView imageView) {
        e.a(image.a, imageView);
    }

    private int getMinViewabilityPercentage() {
        return this.a.d();
    }

    public static e.d getViewTraversalPredicate() {
        return new e.d() { // from class: com.facebook.ads.NativeAd.2
            @Override // com.facebook.ads.internal.n.e.d
            public boolean a(View view) {
                return (view instanceof MediaViewVideoRenderer) || (view instanceof AdChoicesView) || (view instanceof b);
            }
        };
    }

    private void logExternalClick(String str) {
        this.a.b(str);
    }

    private void logExternalImpression() {
        this.a.F();
    }

    private void registerExternalLogReceiver(String str) {
        this.a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab a() {
        return this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MediaView mediaView) {
        if (mediaView != null) {
            this.a.c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NativeAdView.Type type) {
        this.a.a(type.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.a.b(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.a.w();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.a.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.a.y();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoAutoplayBehavior e() {
        return VideoAutoplayBehavior.fromInternalAutoplayBehavior(this.a.z());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<NativeAd> f() {
        if (this.a.A() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.a.A()) {
            arrayList.add(new NativeAd(eVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return this.a.B();
    }

    public String getAdBody() {
        return this.a.n();
    }

    public String getAdCallToAction() {
        return this.a.p();
    }

    public Image getAdChoicesIcon() {
        if (this.a.t() == null) {
            return null;
        }
        return new Image(this.a.t());
    }

    public String getAdChoicesLinkUrl() {
        return this.a.u();
    }

    public String getAdChoicesText() {
        return this.a.v();
    }

    public Image getAdCoverImage() {
        if (this.a.j() == null) {
            return null;
        }
        return new Image(this.a.j());
    }

    public Image getAdIcon() {
        if (this.a.i() == null) {
            return null;
        }
        return new Image(this.a.i());
    }

    public AdNetwork getAdNetwork() {
        return AdNetwork.fromInternalAdNetwork(this.a.b());
    }

    public String getAdRawBody() {
        return this.a.o();
    }

    public String getAdSocialContext() {
        return this.a.q();
    }

    @Deprecated
    public Rating getAdStarRating() {
        if (this.a.r() == null) {
            return null;
        }
        return new Rating(this.a.r());
    }

    public String getAdSubtitle() {
        return this.a.m();
    }

    public String getAdTitle() {
        return this.a.l();
    }

    public NativeAdViewAttributes getAdViewAttributes() {
        if (this.a.k() == null) {
            return null;
        }
        return new NativeAdViewAttributes(this.a.k());
    }

    public String getId() {
        return this.a.s();
    }

    public e getInternalNativeAd() {
        return this.a;
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.a.e();
    }

    public boolean hasCallToAction() {
        return this.a.h();
    }

    public boolean isAdLoaded() {
        return false;
    }

    public boolean isNativeConfigEnabled() {
        return this.a.g();
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
    }

    public void loadAd(EnumSet<MediaCacheFlag> enumSet) {
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
    }

    public void loadAdFromBid(String str, EnumSet<MediaCacheFlag> enumSet) {
    }

    public void onCtaBroadcast() {
        this.a.C();
    }

    public void registerExternalLogReceiverIfNeeded() {
        this.a.E();
    }

    public void registerViewForInteraction(View view) {
        this.a.a(view);
    }

    public void registerViewForInteraction(View view, List<View> list) {
        this.a.a(view, list);
    }

    public void setAdListener(final AdListener adListener) {
        if (adListener == null) {
            return;
        }
        this.a.a(new com.facebook.ads.internal.n.b() { // from class: com.facebook.ads.NativeAd.1
            @Override // com.facebook.ads.internal.n.b
            public void a() {
                adListener.onAdLoaded(NativeAd.this);
            }

            @Override // com.facebook.ads.internal.n.b
            public void a(a aVar) {
                adListener.onError(NativeAd.this, AdError.getAdErrorFromWrapper(aVar));
            }

            @Override // com.facebook.ads.internal.n.b
            public void b() {
                adListener.onAdClicked(NativeAd.this);
            }

            @Override // com.facebook.ads.internal.n.b
            public void c() {
                adListener.onLoggingImpression(NativeAd.this);
            }
        });
    }

    @Deprecated
    public void setMediaViewAutoplay(boolean z) {
        this.a.a(z);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a.a(onTouchListener);
    }

    public void unregisterView() {
        this.a.D();
    }
}
