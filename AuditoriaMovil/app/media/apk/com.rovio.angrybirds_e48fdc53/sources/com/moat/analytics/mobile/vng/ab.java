package com.moat.analytics.mobile.vng;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes2.dex */
class ab {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a implements Iterable<View> {
        private final ViewGroup a;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.moat.analytics.mobile.vng.ab$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C0282a implements Iterator<View> {
            private int b;

            private C0282a() {
                this.b = -1;
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public View next() {
                this.b++;
                return a.this.a.getChildAt(this.b);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b + 1 < a.this.a.getChildCount();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Not implemented. Under development.");
            }
        }

        private a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // java.lang.Iterable
        public Iterator<View> iterator() {
            return new C0282a();
        }
    }

    ab() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.moat.analytics.mobile.vng.a.b.a<WebView> a(ViewGroup viewGroup) {
        if (viewGroup instanceof WebView) {
            return com.moat.analytics.mobile.vng.a.b.a.a((WebView) viewGroup);
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        HashSet hashSet = new HashSet();
        int i = 0;
        WebView webView = null;
        while (!linkedList.isEmpty() && i < 100) {
            int i2 = i + 1;
            Iterator<View> it = new a((ViewGroup) linkedList.poll()).iterator();
            while (true) {
                if (it.hasNext()) {
                    View next = it.next();
                    if (next instanceof WebView) {
                        if (webView != null) {
                            p.a(3, "WebViewHound", next, "Ambiguous ad container: multiple WebViews reside within it.");
                            p.a("[ERROR] ", "WebAdTracker not created, ambiguous ad container: multiple WebViews reside within it");
                            webView = null;
                            break;
                        }
                        webView = (WebView) next;
                    }
                    if (next instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) next;
                        if (!hashSet.contains(viewGroup2)) {
                            hashSet.add(viewGroup2);
                            linkedList.add(viewGroup2);
                        }
                    }
                }
            }
            i = i2;
        }
        return com.moat.analytics.mobile.vng.a.b.a.b(webView);
    }
}
