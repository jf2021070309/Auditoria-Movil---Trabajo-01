package com.amazon.aps.iva.du;

import com.crunchyroll.crunchyroid.R;
/* compiled from: CommentActionOption.kt */
/* loaded from: classes2.dex */
public abstract class a extends com.amazon.aps.iva.a70.b {

    /* compiled from: CommentActionOption.kt */
    /* renamed from: com.amazon.aps.iva.du.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0206a extends a {
        public static final C0206a e = new C0206a();

        public C0206a() {
            super(R.string.commenting_comment_action_delete_comment, R.color.cr_red_orange);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {
        public static final b e = new b();

        public b() {
            super(R.string.commenting_comment_action_flag_spoiler);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class c extends a {
        public static final c e = new c();

        public c() {
            super(R.string.commenting_comment_action_mark_as_spoiler_comment);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class d extends a {
        public static final d e = new d();

        public d() {
            super(R.string.commenting_comment_action_report_comment);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class e extends a {
        public static final e e = new e();

        public e() {
            super(R.string.commenting_comment_action_unflag_spoiler);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class f extends a {
        public static final f e = new f();

        public f() {
            super(R.string.commenting_comment_action_unmark_as_spoiler_comment);
        }
    }

    /* compiled from: CommentActionOption.kt */
    /* loaded from: classes2.dex */
    public static final class g extends a {
        public static final g e = new g();

        public g() {
            super(R.string.commenting_comment_action_unreport_comment);
        }
    }

    public /* synthetic */ a(int i) {
        this(i, R.color.color_white);
    }

    public a(int i, int i2) {
        super(i, Integer.valueOf(i2), false, null, 12);
    }
}
