package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.a.a;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.l;
import com.facebook.ads.internal.adapters.u;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.f;
import com.facebook.ads.internal.q.a.o;
import com.facebook.ads.internal.view.b.c;
import java.util.EnumSet;
/* loaded from: classes2.dex */
public class InstreamVideoAdView extends RelativeLayout implements Ad {
    private final Context a;
    private final String b;
    private final AdSize c;
    private DisplayAdController d;
    private l e;
    private boolean f;
    private InstreamVideoAdListener g;
    private View h;
    private Bundle i;
    private c j;

    public InstreamVideoAdView(Context context, Bundle bundle) {
        this(context, bundle.getString("placementID"), (AdSize) bundle.get("adSize"));
        this.i = bundle;
    }

    public InstreamVideoAdView(Context context, String str, AdSize adSize) {
        super(context);
        this.f = false;
        this.a = context;
        this.b = str;
        this.c = adSize;
        this.d = getController();
    }

    private final void a() {
        if (this.d != null) {
            this.d.b(true);
            this.d = null;
            this.d = getController();
            this.e = null;
            this.f = false;
            removeAllViews();
        }
    }

    private void a(String str) {
        if (this.i == null) {
            this.d.a(str);
            return;
        }
        this.e = new l();
        this.e.a(getContext(), new a() { // from class: com.facebook.ads.InstreamVideoAdView.2
            @Override // com.facebook.ads.a.a
            public void a(u uVar) {
                InstreamVideoAdView.this.f = true;
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onAdLoaded(InstreamVideoAdView.this);
            }

            @Override // com.facebook.ads.a.a
            public void a(u uVar, View view) {
                if (view == null) {
                    throw new IllegalStateException("Cannot present null view");
                }
                InstreamVideoAdView.this.h = view;
                InstreamVideoAdView.this.removeAllViews();
                InstreamVideoAdView.this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                InstreamVideoAdView.this.addView(InstreamVideoAdView.this.h);
            }

            @Override // com.facebook.ads.a.a
            public void a(u uVar, AdError adError) {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onError(InstreamVideoAdView.this, adError);
            }

            @Override // com.facebook.ads.a.a
            public void b(u uVar) {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onAdClicked(InstreamVideoAdView.this);
            }

            @Override // com.facebook.ads.a.a
            public void c(u uVar) {
            }

            @Override // com.facebook.ads.a.a
            public void d(u uVar) {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onAdVideoComplete(InstreamVideoAdView.this);
            }
        }, this.d.g(), this.i.getBundle("adapter"), EnumSet.of(CacheFlag.NONE));
    }

    private DisplayAdController getController() {
        this.d = new DisplayAdController(getContext(), this.b, f.INSTREAM_VIDEO, AdPlacementType.INSTREAM, this.c.toInternalAdSize(), d.ADS, 1, true);
        this.d.a(new com.facebook.ads.internal.adapters.a() { // from class: com.facebook.ads.InstreamVideoAdView.1
            @Override // com.facebook.ads.internal.adapters.a
            public void a() {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onAdClicked(InstreamVideoAdView.this);
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(View view) {
                if (view == null) {
                    throw new IllegalStateException("Cannot present null view");
                }
                InstreamVideoAdView.this.h = view;
                InstreamVideoAdView.this.removeAllViews();
                InstreamVideoAdView.this.h.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                InstreamVideoAdView.this.addView(InstreamVideoAdView.this.h);
                if (com.facebook.ads.internal.l.a.b(InstreamVideoAdView.this.a)) {
                    InstreamVideoAdView.this.j = new c();
                    InstreamVideoAdView.this.j.a(InstreamVideoAdView.this.b);
                    InstreamVideoAdView.this.j.b(InstreamVideoAdView.this.a.getPackageName());
                    if (InstreamVideoAdView.this.d.a() != null) {
                        InstreamVideoAdView.this.j.a(InstreamVideoAdView.this.d.a().a());
                    }
                    InstreamVideoAdView.this.h.getOverlay().add(InstreamVideoAdView.this.j);
                    InstreamVideoAdView.this.h.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.InstreamVideoAdView.1.1
                        @Override // android.view.View.OnLongClickListener
                        public boolean onLongClick(View view2) {
                            if (InstreamVideoAdView.this.h == null || InstreamVideoAdView.this.j == null) {
                                return false;
                            }
                            InstreamVideoAdView.this.j.setBounds(0, 0, InstreamVideoAdView.this.h.getWidth(), InstreamVideoAdView.this.h.getHeight());
                            InstreamVideoAdView.this.j.a(InstreamVideoAdView.this.j.a() ? false : true);
                            return true;
                        }
                    });
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(AdAdapter adAdapter) {
                if (InstreamVideoAdView.this.d == null) {
                    return;
                }
                InstreamVideoAdView.this.f = true;
                if (InstreamVideoAdView.this.g != null) {
                    InstreamVideoAdView.this.g.onAdLoaded(InstreamVideoAdView.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(com.facebook.ads.internal.protocol.a aVar) {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onError(InstreamVideoAdView.this, AdError.getAdErrorFromWrapper(aVar));
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void b() {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onLoggingImpression(InstreamVideoAdView.this);
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void c() {
                if (InstreamVideoAdView.this.g == null) {
                    return;
                }
                InstreamVideoAdView.this.g.onAdVideoComplete(InstreamVideoAdView.this);
            }
        });
        return this.d;
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        if (this.j != null && com.facebook.ads.internal.l.a.b(this.a)) {
            this.j.b();
            if (this.h != null) {
                this.h.getOverlay().remove(this.j);
            }
        }
        a();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.b;
    }

    public Bundle getSaveInstanceState() {
        Bundle g;
        o oVar = this.e != null ? this.e : (u) this.d.h();
        if (oVar != null && (g = oVar.g()) != null) {
            Bundle bundle = new Bundle();
            bundle.putBundle("adapter", g);
            bundle.putString("placementID", this.b);
            bundle.putSerializable("adSize", this.c);
            return bundle;
        }
        return null;
    }

    public boolean isAdLoaded() {
        return false;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
    }

    public void setAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.g = instreamVideoAdListener;
    }

    public boolean show() {
        if (!this.f || (this.d == null && this.e == null)) {
            if (this.g != null) {
                this.g.onError(this, AdError.INTERNAL_ERROR);
                return false;
            }
            return false;
        }
        if (this.e != null) {
            this.e.e();
        } else {
            this.d.b();
        }
        this.f = false;
        return true;
    }
}
