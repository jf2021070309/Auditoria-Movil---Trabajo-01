package com.amazon.aps.iva.wt;

import com.crunchyroll.crunchyroid.R;
/* compiled from: CommentActionSuccessMessage.kt */
/* loaded from: classes2.dex */
public abstract class m extends com.amazon.aps.iva.bt.e {

    /* compiled from: CommentActionSuccessMessage.kt */
    /* loaded from: classes2.dex */
    public static final class a extends m {
        public static final a b = new a();

        public a() {
            super(R.string.commenting_comment_action_message_delete_comment);
        }
    }

    /* compiled from: CommentActionSuccessMessage.kt */
    /* loaded from: classes2.dex */
    public static final class b extends m {
        public static final b b = new b();

        public b() {
            super(R.string.commenting_comment_action_message_flag_spoiler);
        }
    }

    /* compiled from: CommentActionSuccessMessage.kt */
    /* loaded from: classes2.dex */
    public static final class c extends m {
        public static final c b = new c();

        public c() {
            super(R.string.commenting_comment_action_message_report_comment);
        }
    }

    /* compiled from: CommentActionSuccessMessage.kt */
    /* loaded from: classes2.dex */
    public static final class d extends m {
        public static final d b = new d();

        public d() {
            super(R.string.commenting_comment_action_message_unflag_spoiler);
        }
    }

    /* compiled from: CommentActionSuccessMessage.kt */
    /* loaded from: classes2.dex */
    public static final class e extends m {
        public static final e b = new e();

        public e() {
            super(R.string.commenting_comment_action_message_unreport_comment);
        }
    }

    public m(int i) {
        super(i, null, new String[0], 2, null);
    }
}
