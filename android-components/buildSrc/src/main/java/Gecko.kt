/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

/**
 * Gecko version and release channel constants used by this version of Android Components.
 */
object Gecko {
    /**
     * GeckoView Version.
     */
    const val version = "108.0.20221114085151"

    /**
     * GeckoView channel
     */
    val channel = GeckoChannel.BETA
}

/**
 * Enum for GeckoView release channels.
 */
enum class GeckoChannel(
    val artifactName: String,
) {
    NIGHTLY("geckoview-nightly-omni"),
    BETA("geckoview-beta-omni"),
    RELEASE("geckoview-omni"),
}
