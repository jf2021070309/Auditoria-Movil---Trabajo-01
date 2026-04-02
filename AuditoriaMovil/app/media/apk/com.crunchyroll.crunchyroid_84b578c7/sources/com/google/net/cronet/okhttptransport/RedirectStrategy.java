package com.google.net.cronet.okhttptransport;
/* loaded from: classes4.dex */
public abstract class RedirectStrategy {
    private static final int DEFAULT_REDIRECTS = 16;

    /* loaded from: classes4.dex */
    public static class DefaultRedirectsHolder {
        private static final RedirectStrategy INSTANCE = new RedirectStrategy() { // from class: com.google.net.cronet.okhttptransport.RedirectStrategy.DefaultRedirectsHolder.1
            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            public boolean followRedirects() {
                return true;
            }

            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            public int numberOfRedirectsToFollow() {
                return 16;
            }
        };

        private DefaultRedirectsHolder() {
        }
    }

    /* loaded from: classes4.dex */
    public static class WithoutRedirectsHolder {
        private static final RedirectStrategy INSTANCE = new RedirectStrategy() { // from class: com.google.net.cronet.okhttptransport.RedirectStrategy.WithoutRedirectsHolder.1
            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            public boolean followRedirects() {
                return false;
            }

            @Override // com.google.net.cronet.okhttptransport.RedirectStrategy
            public int numberOfRedirectsToFollow() {
                throw new UnsupportedOperationException();
            }
        };

        private WithoutRedirectsHolder() {
        }
    }

    private RedirectStrategy() {
    }

    public static RedirectStrategy defaultStrategy() {
        return DefaultRedirectsHolder.INSTANCE;
    }

    public static RedirectStrategy withoutRedirects() {
        return WithoutRedirectsHolder.INSTANCE;
    }

    public abstract boolean followRedirects();

    public abstract int numberOfRedirectsToFollow();
}
