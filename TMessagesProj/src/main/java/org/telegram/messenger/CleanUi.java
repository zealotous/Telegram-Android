package org.telegram.messenger;

/**
 * Central switches for the "light" UI build.
 *
 * <p>Keep the switches in one place so the removed surfaces are easy to audit and
 * can be toggled back for debugging.</p>
 */
public final class CleanUi {
    /** Hide Telegram Stories ("reels") everywhere in the UI and disable posting them. */
    public static final boolean HIDE_STORIES = true;
    /** Never request or render sponsored messages/ads inside chats. */
    public static final boolean HIDE_ADS = true;
    /** Hide promotional UI for Telegram Premium, Stars, gifts, TON/wallet and business. */
    public static final boolean HIDE_PAID_PROMO = true;

    private CleanUi() {
    }
}
