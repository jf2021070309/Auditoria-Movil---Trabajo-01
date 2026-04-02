package c.i.i;
/* loaded from: classes.dex */
public final class d {
    public static final c.i.i.c a = new C0039d(null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c.i.i.c f2122b = new C0039d(null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final c.i.i.c f2123c;

    /* renamed from: d  reason: collision with root package name */
    public static final c.i.i.c f2124d;

    /* loaded from: classes.dex */
    public static class a implements b {
        public static final a a = new a();

        @Override // c.i.i.d.b
        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                c.i.i.c cVar = d.a;
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i5 = 2;
                                break;
                        }
                        i2++;
                    }
                    i5 = 0;
                    i2++;
                }
                i5 = 1;
                i2++;
            }
            return i5;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* loaded from: classes.dex */
    public static abstract class c implements c.i.i.c {
        public final b a;

        public c(b bVar) {
            this.a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i2, int i3) {
            if (i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            b bVar = this.a;
            if (bVar == null) {
                return a();
            }
            int a = bVar.a(charSequence, i2, i3);
            if (a != 0) {
                if (a != 1) {
                    return a();
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: c.i.i.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2125b;

        public C0039d(b bVar, boolean z) {
            super(bVar);
            this.f2125b = z;
        }

        @Override // c.i.i.d.c
        public boolean a() {
            return this.f2125b;
        }
    }

    static {
        a aVar = a.a;
        f2123c = new C0039d(aVar, false);
        f2124d = new C0039d(aVar, true);
    }
}
