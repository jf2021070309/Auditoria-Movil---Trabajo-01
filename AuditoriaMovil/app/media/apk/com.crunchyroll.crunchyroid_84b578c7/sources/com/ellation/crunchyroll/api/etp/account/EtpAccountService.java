package com.ellation.crunchyroll.api.etp.account;

import com.amazon.aps.iva.jf0.a0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lf0.a;
import com.amazon.aps.iva.lf0.b;
import com.amazon.aps.iva.lf0.f;
import com.amazon.aps.iva.lf0.n;
import com.amazon.aps.iva.lf0.o;
import com.amazon.aps.iva.lf0.s;
import com.amazon.aps.iva.ob0.d;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.api.etp.account.model.AllProfilesResponse;
import com.ellation.crunchyroll.api.etp.account.model.CreateAccountWithEmailBody;
import com.ellation.crunchyroll.api.etp.account.model.CreateAccountWithPhoneBody;
import com.ellation.crunchyroll.api.etp.account.model.CreateProfileResponse;
import com.ellation.crunchyroll.api.etp.account.model.MarketingNotificationSettingsBody;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.account.model.ResetPasswordBody;
import com.ellation.crunchyroll.api.etp.account.model.SetEmailBody;
import com.ellation.crunchyroll.api.etp.account.model.SetUsernameBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateAudioLanguageBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateAvatarBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateExtendedMaturityBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateMaturityRatingBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdatePasswordBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateSubtitleLanguageBody;
import com.ellation.crunchyroll.api.etp.account.model.UserCodeBody;
import com.ellation.crunchyroll.api.etp.account.model.UserProfileBody;
import com.ellation.crunchyroll.api.etp.account.model.UserProfileResponse;
import com.ellation.crunchyroll.api.etp.account.model.UsernamesResponse;
import com.ellation.crunchyroll.api.etp.account.model.VerifyPhoneBody;
import kotlin.Metadata;
/* compiled from: EtpAccountService.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J#\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@ø\u0001\u0000¢\u0006\u0004\b \u0010!J#\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H§@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020+H§@ø\u0001\u0000¢\u0006\u0004\b,\u0010\u0010J#\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020-H§@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0010J#\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000201H§@ø\u0001\u0000¢\u0006\u0004\b2\u00103J#\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u000204H§@ø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0010J\u001d\u0010:\u001a\u0002092\b\b\u0001\u0010\u0003\u001a\u000208H§@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J-\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u0002082\b\b\u0001\u0010=\u001a\u00020<H§@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001d\u0010A\u001a\u00020@2\b\b\u0001\u0010=\u001a\u00020<H§@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0013\u0010D\u001a\u00020CH§@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0010J#\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010=\u001a\u00020<H§@ø\u0001\u0000¢\u0006\u0004\bE\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/ellation/crunchyroll/api/etp/account/EtpAccountService;", "", "Lcom/ellation/crunchyroll/api/etp/account/model/CreateAccountWithEmailBody;", "body", "Lcom/amazon/aps/iva/jf0/a0;", "Lcom/amazon/aps/iva/kb0/q;", "createAccount", "(Lcom/ellation/crunchyroll/api/etp/account/model/CreateAccountWithEmailBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/CreateAccountWithPhoneBody;", "createAccountWithPhone", "(Lcom/ellation/crunchyroll/api/etp/account/model/CreateAccountWithPhoneBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/ResetPasswordBody;", "resetPassword", "(Lcom/ellation/crunchyroll/api/etp/account/model/ResetPasswordBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/AccountApiModel;", "getAccount", "(Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/ProfileApiModel;", "getProfile", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdateMaturityRatingBody;", "updateMaturityRating", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdateMaturityRatingBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdateExtendedMaturityBody;", "updateExtendedMaturityRating", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdateExtendedMaturityBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdateAvatarBody;", "updateAvatar", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdateAvatarBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdateSubtitleLanguageBody;", "updateSubtitleLanguage", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdateSubtitleLanguageBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdateAudioLanguageBody;", "updateAudioLanguage", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdateAudioLanguageBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UpdatePasswordBody;", "updatePassword", "(Lcom/ellation/crunchyroll/api/etp/account/model/UpdatePasswordBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/SetUsernameBody;", "setUsername", "(Lcom/ellation/crunchyroll/api/etp/account/model/SetUsernameBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UserCodeBody;", "authDevice", "(Lcom/ellation/crunchyroll/api/etp/account/model/UserCodeBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UsernamesResponse;", "getUsernames", "Lcom/ellation/crunchyroll/api/etp/account/model/MarketingNotificationSettingsBody;", "updateMarketingNotificationSettings", "(Lcom/ellation/crunchyroll/api/etp/account/model/MarketingNotificationSettingsBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "sendVerificationEmail", "Lcom/ellation/crunchyroll/api/etp/account/model/VerifyPhoneBody;", "requestOtpCode", "(Lcom/ellation/crunchyroll/api/etp/account/model/VerifyPhoneBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/SetEmailBody;", "setEmail", "(Lcom/ellation/crunchyroll/api/etp/account/model/SetEmailBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "requestChangeEmail", "Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileBody;", "Lcom/ellation/crunchyroll/api/etp/account/model/CreateProfileResponse;", "createNewProfile", "(Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileBody;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "", "profileId", "updateProfile", "(Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileBody;Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/UserProfileResponse;", "getProfileById", "(Ljava/lang/String;Lcom/amazon/aps/iva/ob0/d;)Ljava/lang/Object;", "Lcom/ellation/crunchyroll/api/etp/account/model/AllProfilesResponse;", "getAllProfiles", "deleteProfile", "api_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public interface EtpAccountService {
    @o("auth/v1/device")
    Object authDevice(@a UserCodeBody userCodeBody, d<? super a0<q>> dVar);

    @o("accounts/v2")
    Object createAccount(@a CreateAccountWithEmailBody createAccountWithEmailBody, d<? super a0<q>> dVar);

    @o("accounts/v2")
    Object createAccountWithPhone(@a CreateAccountWithPhoneBody createAccountWithPhoneBody, d<? super a0<q>> dVar);

    @o("accounts/v1/me/multiprofile")
    Object createNewProfile(@a UserProfileBody userProfileBody, d<? super CreateProfileResponse> dVar);

    @b("accounts/v1/me/multiprofile/{profile_id}")
    Object deleteProfile(@s("profile_id") String str, d<? super a0<q>> dVar);

    @f("accounts/v1/me")
    Object getAccount(d<? super AccountApiModel> dVar);

    @f("accounts/v1/me/multiprofile")
    Object getAllProfiles(d<? super AllProfilesResponse> dVar);

    @f("accounts/v1/me/profile")
    Object getProfile(d<? super ProfileApiModel> dVar);

    @f("accounts/v1/me/multiprofile/{profile_id}")
    Object getProfileById(@s("profile_id") String str, d<? super UserProfileResponse> dVar);

    @f("accounts/v1/usernames")
    Object getUsernames(d<? super UsernamesResponse> dVar);

    @o("accounts/v1/email_change_token")
    Object requestChangeEmail(d<? super a0<q>> dVar);

    @o("accounts/v1/phone/verify")
    Object requestOtpCode(@a VerifyPhoneBody verifyPhoneBody, d<? super a0<q>> dVar);

    @o("accounts/v1/password_forgot")
    Object resetPassword(@a ResetPasswordBody resetPasswordBody, d<? super a0<q>> dVar);

    @o("accounts/v1/email_verification")
    Object sendVerificationEmail(d<? super a0<q>> dVar);

    @o("accounts/v1/phone/set_email")
    Object setEmail(@a SetEmailBody setEmailBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/credentials")
    Object setUsername(@a SetUsernameBody setUsernameBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/profile")
    Object updateAudioLanguage(@a UpdateAudioLanguageBody updateAudioLanguageBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/profile")
    Object updateAvatar(@a UpdateAvatarBody updateAvatarBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/profile")
    Object updateExtendedMaturityRating(@a UpdateExtendedMaturityBody updateExtendedMaturityBody, d<? super a0<q>> dVar);

    @n("accounts/v1/{account_uuid}/notification_settings")
    Object updateMarketingNotificationSettings(@a MarketingNotificationSettingsBody marketingNotificationSettingsBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/profile")
    Object updateMaturityRating(@a UpdateMaturityRatingBody updateMaturityRatingBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/credentials")
    Object updatePassword(@a UpdatePasswordBody updatePasswordBody, d<? super a0<q>> dVar);

    @n("accounts/v1/me/multiprofile/{profile_id}")
    Object updateProfile(@a UserProfileBody userProfileBody, @s("profile_id") String str, d<? super a0<q>> dVar);

    @n("accounts/v1/me/profile")
    Object updateSubtitleLanguage(@a UpdateSubtitleLanguageBody updateSubtitleLanguageBody, d<? super a0<q>> dVar);
}
